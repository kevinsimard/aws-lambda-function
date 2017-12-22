package com.kevinsimard.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Function implements RequestHandler<Function.Request, Function.Response> {

    public Response handleRequest(Request request, Context context) {
        return new Response(request.message);
    }

    static class Request {
        public String message;
    }

    static class Response {
        public String message;

        Response(String message) {
            this.message = message;
        }
    }
}
