# AWS Lambda Function Example

Use this sample code to author Java functions in Lambda. It also supports local debugging.

## Local Development

Download and install the [aws-lambda-local-runner](https://github.com/kevinsimard/aws-lambda-local-runner) Maven repository.

```bash
# Clone the repository
$ git clone https://github.com/kevinsimard/aws-lambda-local-runner && ./aws-lambda-local-runner/

# Package and install the JAR locally
$ mvn package && mvn install:install-file -Dfile=target/aws-lambda-local-runner-1.0-SNAPSHOT.jar -DgroupId=com.kevinsimard -DartifactId=aws-lambda-local-runner -Dversion=1.0-SNAPSHOT -Dpackaging=jar
```

Run `$ mvn exec:java` to run the Lambda function locally.

## Code Structure

    ├── src
    │   └── main
    │       ├── java
    │       │   └── com
    │       │       └── kevinsimard
    │       │           └── lambda
    │       │               └── function
    │       │                   └── Example.java
    │       └── resources
    │           └── log4j.properties
    ├── .editorconfig
    ├── .gitattributes
    ├── .gitignore
    ├── LICENSE.txt
    ├── pom.xml
    └── README.md

## License

This package is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).
