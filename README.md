# AWS Lambda Function

Use this sample code to author Java functions in Lambda. It also supports local debugging.

## Local Development

Download and install the [aws-lambda-runner](https://github.com/kevinsimard/aws-lambda-runner) Maven repository.

Run `$ mvn compile exec:java` to run the Lambda function locally.

## Code Structure

    ├── src
    │   └── main
    │       └── java
    │           └── com
    │               └── kevinsimard
    │                   └── aws
    │                       └── lambda
    │                           └── Function.java
    ├── .editorconfig
    ├── .gitattributes
    ├── .gitignore
    ├── LICENSE.md
    ├── README.md
    └── pom.xml

## License

This package is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).
