# rest-client-kotlin

- Use Kotlin
- Use REST Client Reactive
- Query from https://dummyjson.com 
- Response in own endpoint 

## Create project with

```bash
mvn io.quarkus.platform:quarkus-maven-plugin:3.6.5:create \
    -DprojectGroupId=org.acme \
    -DprojectArtifactId=rest-client-kotlin \
    -Dextensions='kotlin,resteasy-reactive-jackson,rest-client-reactive-jackson'
cd rest-client-kotlin
```

## Start developement mode
```bash
./mvnw compile quarkus:dev
```

## Query endpoints

```shell
curl -X GET "http://localhost:8080/hello"
curl -X GET "http://localhost:8080/product"
curl -X GET "http://localhost:8080/product/id/1"
```
