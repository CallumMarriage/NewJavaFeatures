package com.newJavaFeatures.nine;

import com.newJavaFeatures.feature.JavaFeature;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JavaNineFeatures implements JavaFeature {

    public void executeNewFeatures() {
        System.out.println("*******************************\n");
        System.out.println("Now Executing Java 9 Features\n");
        this.quickApiCall();
        System.out.println("\n");
        this.interfacePrivateMethods();
        System.out.println("\n");
        System.out.println("*******************************\n");
    }


    private void quickApiCall() {
        try {
            System.out.println("Java 9 added the feature for quick api calling using the java rest api:");
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://postman-echo.com/get"))
                    .GET()
                    .build();

            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());
        } catch (IOException | InterruptedException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private void interfacePrivateMethods(){
        System.out.println("Java 9 also added the feature to include private methods on an interface:");
        DummyInterface dummyInterface = new DummyInterfaceImpl();
        dummyInterface.check();
    }
}
