package com.wzy.study.design;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wzy.study.design.es.ESIndex;
import com.wzy.study.design.es.EsUser;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.FetchSourceContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: wangzongyi
 * @Data: 2021/7/18 17:22
 * @Desc:
 */

@SpringBootTest
public class ElasticsearchDocumentApiTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    // 添加文档
    @Test
    void testAddDocument() throws IOException {
        // 创建数据
        EsUser esUser = new EsUser("李四", 28);
        // 创建请求
        IndexRequest indexRequest = new IndexRequest("wangzy");
        // 设置规则
        indexRequest.id("2");
        indexRequest.timeout(TimeValue.timeValueMinutes(5));
        // 把数据放入请求中
        IndexRequest source = indexRequest.source(JSON.toJSONString(esUser), XContentType.JSON);
        System.out.println("source = " + source);
        IndexResponse indexResponse = restHighLevelClient.index(indexRequest, RequestOptions.DEFAULT);
        System.out.println("indexResponse = " + indexResponse);
        System.out.println("indexResponse.toString() = " + indexResponse.toString());
        System.out.println("indexResponse.status() = " + indexResponse.status());
    }

    // 判断文档是否存在
    @Test
    void testIsExistDocument() throws IOException {

        GetRequest getRequest = new GetRequest("wangzy", "1");
        // 不获取返回的 _source 上下文
        getRequest.fetchSourceContext(FetchSourceContext.DO_NOT_FETCH_SOURCE);
        getRequest.storedFields("_none_");

        boolean exists = restHighLevelClient.exists(getRequest, RequestOptions.DEFAULT);
        System.out.println("exists = " + exists);
    }

    // 获取文档
    @Test
    void testGetDocument() throws IOException {
        GetRequest getRequest = new GetRequest("wangzy", "1");
        // 不获取返回的 _source 上下文,
        // getRequest.fetchSourceContext(FetchSourceContext.DO_NOT_FETCH_SOURCE);
        // getRequest.storedFields("_none_");
        boolean exists = restHighLevelClient.exists(getRequest, RequestOptions.DEFAULT);
        if (!exists) {
            System.out.println("文档不存在");
            // return;
        }
        GetResponse getResponse = restHighLevelClient.get(getRequest, RequestOptions.DEFAULT);
        System.out.println("getResponse = " + getResponse);
        System.out.println("getResponse.getSourceAsString() = " + getResponse.getSourceAsString());
        System.out.println("getResponse.getSource() = " + getResponse.getSource());
        System.out.println("getResponse.isExists() = " + getResponse.isExists());
        System.out.println("getResponse.getVersion() = " + getResponse.getVersion());
        System.out.println("getResponse.getType() = " + getResponse.getType());

    }

    // 更新文档
    @Test
    void testUpdateDocument() throws IOException {

        UpdateRequest updateRequest = new UpdateRequest("wangzy", "2");
        updateRequest.timeout(TimeValue.timeValueSeconds(20));

        EsUser esUser = new EsUser("王五", 34);
        updateRequest.doc(JSON.toJSONString(esUser), XContentType.JSON);

        UpdateResponse response = restHighLevelClient.update(updateRequest, RequestOptions.DEFAULT);
        System.out.println("response = " + response);
        System.out.println("response.getVersion() = " + response.getVersion());
    }

    // 删除文档
    @Test
    void testDeleteDocument() throws IOException {

        DeleteRequest deleteRequest = new DeleteRequest("wangzy", "2");
        deleteRequest.timeout(TimeValue.timeValueMinutes(1));

        DeleteResponse deleteResponse = restHighLevelClient.delete(deleteRequest, RequestOptions.DEFAULT);
        System.out.println("deleteResponse = " + deleteResponse);
        System.out.println("deleteResponse.getVersion() = " + deleteResponse.getVersion());
        System.out.println("deleteResponse.getId() = " + deleteResponse.getId());
        System.out.println("deleteResponse.getResult() = " + deleteResponse.getResult());

    }

    // 批量新增
    @Test
    void testBulkAddDocument() throws IOException {
        BulkRequest bulkRequest = new BulkRequest();
        bulkRequest.timeout(TimeValue.timeValueMinutes(1));

        List<EsUser> userList = new ArrayList<>();
        userList.add(new EsUser("张三1", 1));
        userList.add(new EsUser("张三2", 2));
        userList.add(new EsUser("张三3", 3));
        userList.add(new EsUser("张三4", 4));
        userList.add(new EsUser("王五1", 1));
        userList.add(new EsUser("王五2", 2));
        userList.add(new EsUser("王五3", 3));

        for (int i = 0; i < userList.size(); i++) {
            bulkRequest.add(new IndexRequest("wangzy").id(i + 1 + "") // 也可以不加，不加会自动生成
                .source(JSON.toJSONString(userList.get(i)), XContentType.JSON));
        }
        BulkResponse bulk = restHighLevelClient.bulk(bulkRequest, RequestOptions.DEFAULT);
        System.out.println("bulk.hasFailures() = " + bulk.hasFailures());
        System.out.println("bulk.buildFailureMessage() = " + bulk.buildFailureMessage());
        System.out.println("bulk.getTook() = " + bulk.getTook());
        System.out.println("Arrays.toString(bulk.getItems()) = " + Arrays.toString(bulk.getItems()));

    }

    /**
     * 查询
     * 
     * @throws IOException
     */
    @Test
    void testSearch() throws IOException {
        // 搜索请求
        SearchRequest searchRequest = new SearchRequest(ESIndex.WANGZY);
        // 构建搜索
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        // 查询条件
        TermQueryBuilder termQueryBuilder = QueryBuilders.termQuery("name", "张三1");
        MatchQueryBuilder matchQueryBuilder = QueryBuilders.matchQuery("name", "张");


        sourceBuilder.query(matchQueryBuilder);
        sourceBuilder.timeout(new TimeValue(1000));

        searchRequest.source(sourceBuilder);

        SearchResponse searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
        System.out.println("searchResponse.getHits().getTotalHits() = " + searchResponse.getHits().getTotalHits());
        System.out.println("searchResponse.getTook() = " + searchResponse.getTook());
        System.out.println("-------------------");
        searchResponse.getHits().forEach(System.out::println);
        System.out.println("-------------------");
        System.out.println("searchResponse.getHits() = " + searchResponse.getHits());

    }

}
