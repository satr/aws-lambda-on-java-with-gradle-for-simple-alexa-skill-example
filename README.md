# AWS Lambda function on Java with Gradle for a simple Alexa Skill example

*build.gradle*

```
dependencies {
    testCompile group: 'junit', name: 'junit', version: '4.12'
    compile group: 'com.amazon.alexa', name: 'ask-sdk', version:'2.17.2'
    compile group: 'com.amazonaws', name: 'aws-lambda-java-log4j2', version:'1.1.0'
}
jar {
    from {
        configurations.compile.collect { it.isDirectory() ? it : zipTree(it) }
    }
}
```

*src/main/resources/log4j2.xml*

```
<?xml version="1.0" encoding="UTF-8"?>
<Configuration packages="com.amazonaws.services.lambda.runtime.log4j2">
    <Appenders>
        <Lambda name="Lambda">
            <PatternLayout>
                <pattern>%d{yyyy-MM-dd HH:mm:ss} %X{AWSRequestId} %-5p %c{1}:%L - %m%n</pattern>
            </PatternLayout>
        </Lambda>
    </Appenders>
    <Loggers>
        <Root level="info">
            <AppenderRef ref="Lambda" />
        </Root>
    </Loggers>
</Configuration>
```

