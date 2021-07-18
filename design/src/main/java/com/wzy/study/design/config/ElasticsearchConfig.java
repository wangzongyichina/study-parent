package com.wzy.study.design.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wangzongyi
 * @Data: 2021/7/18 15:40
 * @Desc:
 */

@Configuration
public class ElasticsearchConfig {

    @Bean
    public RestHighLevelClient createElasticsearchClient() {
        RestHighLevelClient client = new RestHighLevelClient(
            RestClient.builder(new HttpHost("localhost", 9200, "http")));
        return client;
    }

}
