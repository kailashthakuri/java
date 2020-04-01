package io.ice.test.beyond;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;

public class Test {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder(new URI("https://www.redbus.in/info/abouttus")).GET().build();
            HttpResponse response = client.send(request, HttpResponse.BodyHandler.asString());
            System.out.println(response.statusCode());
            System.out.println(response.body());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}