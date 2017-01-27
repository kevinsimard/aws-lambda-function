# AWS Lambda Function Example

Use this sample code to author Java functions in Lambda. It also supports local debugging.

## Local Development

Download and install the [aws-lambda-local-runner](https://github.com/kevinsimard/aws-lambda-local-runner) Maven repository.

Run `$ mvn compile exec:java` to run the Lambda function locally.

## Code Structure

    ├── src
    │   └── main
    │       └── java
    │           └── com
    │               └── kevinsimard
    │                   └── lambda
    │                       └── function
    │                           └── Example.java
    ├── .editorconfig
    ├── .gitattributes
    ├── .gitignore
    ├── LICENSE.txt
    ├── pom.xml
    └── README.md

## License

This package is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).
