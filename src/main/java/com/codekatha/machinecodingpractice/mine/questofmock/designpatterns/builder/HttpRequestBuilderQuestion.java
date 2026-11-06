package com.codekatha.machinecodingpractice.mine.questofmock.designpatterns.builder;

import lombok.Getter;
import lombok.ToString;

/**
 * Question 55 (design pattern practice): Builder
 * <p>
 * Create an immutable class HttpRequest with these fields:
 * method          (required, for example "GET" or "POST")
 * url             (required)
 * body            (optional, default null)
 * timeoutSeconds  (optional, default 30)
 * <p>
 * Rules:
 * - HttpRequest has a private constructor and NO setters (getters are fine)
 * - It can be created only through a nested static Builder
 * - Builder methods can be chained
 * - build() throws IllegalStateException("url is required") if the url is missing or blank,
 * and IllegalStateException("method is required") if the method is missing or blank
 * - toString() prints in the format shown below
 * <p>
 * Expected output:
 * HttpRequest{method=POST, url=https://api.example.com/orders, timeoutSeconds=10, body={"id":1}}
 * HttpRequest{method=GET, url=https://api.example.com/health, timeoutSeconds=30, body=null}
 * Error: url is required
 * <p>
 * Steps: write the HttpRequest class below, then remove the comment marks in main.
 */
public class HttpRequestBuilderQuestion {

    // TODO: write the HttpRequest class (with its nested Builder) here
    // i am not using @builder because i want to implement by my own
    @Getter
    @ToString
    static class HttpRequest {
        private String method;
        private String url;
        private String body;
        private int timeoutSeconds;


        private HttpRequest(Builder b) {
            this.method = b.method;
            this.url = b.url;
            this.body = b.body;
            this.timeoutSeconds = b.timeoutSeconds;

        }

        public static class Builder {
            String method;
            String url;
            String body;
            int timeoutSeconds = 30;

            public Builder(String method, String url) {
                this.method = method;
                this.url = url;
            }

            public Builder body(String body) {
                this.body = body;
                return this;
            }

            public Builder timeoutSeconds(int timeoutSeconds) {
                this.timeoutSeconds = timeoutSeconds;
                return this;
            }

            public HttpRequest build() {
                if (url == null || url.isBlank()) {
                    throw new IllegalStateException("url is required");
                }
                if (method == null || method.isBlank()) {
                    throw new IllegalStateException("method is required");
                }
                return new HttpRequest(this);
            }
        }
    }

    public static void main(String[] args) {
        // TODO: uncomment after writing HttpRequest

        HttpRequest post = new HttpRequest.Builder("POST", "https://api.example.com/orders")
                .timeoutSeconds(10)
                .body("{\"id\":1}")
                .build();
        System.out.println(post);

        HttpRequest get = new HttpRequest.Builder("GET", "https://api.example.com/health").build();
        System.out.println(get);

        try {
            new HttpRequest.Builder("GET", " ").build();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
