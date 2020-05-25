package com.phigey.yurika.apache.http;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;

import java.net.URI;

/**
 * @author cfa
 */
public class TestClientMain {

    public static void main(String[] args) {
        try {
            HttpClient httpClient = HttpClientBuilder.create().build();
            URI uri = new URI("http://172.20.51.11:31615/aps/pipes/tenant");
            HttpPost httpPost = new HttpPost(uri);


            httpPost.setEntity(null);
            httpClient.execute(httpPost);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * {
     *     "name": "egg011",
     *     "description": "egg011",
     *     "owner": {
     *         "localUser": false,
     *         "created": false,
     *         "userName": "lizf"
     *     },
     *     "fileStore": {
     *         "limit": 12
     *     },
     *     "namespaces": [
     *         {
     *             "name": "t33",
     *             "role": "TRAINING",
     *             "rented": false,
     *             "quotaLimit": {
     *                 "cpus": 1,
     *                 "mem": 2048,
     *                 "gpus": 1
     *             },
     *             "quotaRequest": {
     *                 "cpus": 1,
     *                 "mem": 2048,
     *                 "gpus": 1
     *             }
     *         },
     *         {
     *             "name": "s33",
     *             "role": "SERVING",
     *             "rented": false,
     *             "quotaLimit": {
     *                 "cpus": 1,
     *                 "mem": 2048,
     *                 "gpus": 1
     *             },
     *             "quotaRequest": {
     *                 "cpus": 1,
     *                 "mem": 2048,
     *                 "gpus": 1
     *             }
     *         }
     *     ],
     *     "sparkConf": {
     *         "cluster": "5101cdh",
     *         "yarnQueue": "queue43",
     *         "hdfsRoot": "/tmp/dev/rty"
     *     }
     * }
     */
}

