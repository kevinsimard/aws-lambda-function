package com.kevinsimard.lambda.function;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

@SuppressWarnings("unused")
public class Example implements RequestHandler<Example.Request, Example.Response> {

    public Response handleRequest(Request request, Context context) {
        return new Response(request.message);
    }

    protected static class Request {

        private String message;

        private Request() {}

        public void setMessage(String message) {
            this.message = message;
        }
    }

    protected static class Response {

        private String message;

        private Response(String message) {
            this.message = message;
        }

        public String getMessage() {
            return this.message;
        }
    }
}
