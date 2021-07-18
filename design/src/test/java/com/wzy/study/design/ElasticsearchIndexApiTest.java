package com.wzy.study.design;

import lombok.extern.log4j.Log4j2;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.client.indices.GetIndexResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

/**
 * @Author: wangzongyi
 * @Data: 2021/7/18 16:23
 * @Desc:
 */

@SpringBootTest
@Log4j2
public class ElasticsearchIndexApiTest {

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    // 创建索引
    @Test
    void testCreateEsIndex() throws IOException {
        CreateIndexRequest request = new CreateIndexRequest("wangzy_test_es");
        CreateIndexResponse indexResponse = restHighLevelClient.indices().create(request, RequestOptions.DEFAULT);
        System.out.println("indexResponse = " + indexResponse);
    }

    // 判断索引是否存在
    @Test
    void testExistEsIndex() throws IOException {
        GetIndexRequest request = new GetIndexRequest("wangzy_test_es2");
        boolean exists = restHighLevelClient.indices().exists(request, RequestOptions.DEFAULT);
        System.out.println("exists = " + exists);
    }

    // 获取索引
    @Test
    void testGetEsIndex() throws IOException {
        GetIndexRequest request = new GetIndexRequest("wangzy_test_es");
        GetIndexResponse indexResponse = restHighLevelClient.indices().get(request, RequestOptions.DEFAULT);
        System.out.println("indexResponse = " + indexResponse);
        System.out.println(indexResponse.getClass());

    }

    // 修改索引

    // 删除索引
    @Test
    void testDeleteEsIndex() throws IOException {
        DeleteIndexRequest request = new DeleteIndexRequest("wangzy_test_es");
        System.out.println("request = " + request);
        AcknowledgedResponse response = restHighLevelClient.indices().delete(request, RequestOptions.DEFAULT);
        System.out.println("response = " + response);
        System.out.println("response.isAcknowledged() = " + response.isAcknowledged());
    }

}
