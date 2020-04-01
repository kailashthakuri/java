package io.ace.java9practice;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;

public class HttpClientExample {
    public static void main(String[] args) {

        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder(new URI("https://jsonplaceholder.typicode.com/users")).GET().build();
            HttpResponse response = client.send(request, HttpResponse.BodyHandler.asString());
            System.out.println(response.headers());


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
