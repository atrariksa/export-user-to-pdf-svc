package com.example.UserExportPDF;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class GithubClient {
    private String baseURL;

    public GithubClient(String baseURL) {
        this.baseURL = baseURL;
    }

    public List<User> getGithubUsers(Integer numberOfUsers) throws Exception {
        String userPath = "/users";
        HttpClient client = HttpClients.custom().build();
        HttpGet httpGet = new HttpGet(baseURL+userPath);
        URI uri = new URIBuilder(httpGet.getURI())
                .addParameter("per_page", String.valueOf(numberOfUsers))
                .build();
        httpGet.setURI(uri);
        httpGet.addHeader("Accept", "application/vnd.github.v3+json");
        CloseableHttpResponse response = (CloseableHttpResponse) client.execute(httpGet);
        byte[] byteBody = response.getEntity().getContent().readAllBytes();
        List<User> githubUsers = new ObjectMapper().readValue(byteBody,new TypeReference<List<User>>() {});
        return  githubUsers;
    }
}
