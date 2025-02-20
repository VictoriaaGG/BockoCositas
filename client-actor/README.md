# swagger-java-client

OpenAPI definition
- API version: v0
  - Build date: 2025-01-29T18:51:44.216314050Z[GMT]

No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ActorApiServiceApi;

import java.io.File;
import java.util.*;

public class ActorApiServiceApiExample {

    public static void main(String[] args) {
        
        ActorApiServiceApi apiInstance = new ActorApiServiceApi();
        Actor body = new Actor(); // Actor | 
        try {
            Actor result = apiInstance.actualizarCoche(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActorApiServiceApi#actualizarCoche");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ActorApiServiceApi;

import java.io.File;
import java.util.*;

public class ActorApiServiceApiExample {

    public static void main(String[] args) {
        
        ActorApiServiceApi apiInstance = new ActorApiServiceApi();
        Object id = null; // Object | 
        try {
            apiInstance.borrar(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActorApiServiceApi#borrar");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ActorApiServiceApi;

import java.io.File;
import java.util.*;

public class ActorApiServiceApiExample {

    public static void main(String[] args) {
        
        ActorApiServiceApi apiInstance = new ActorApiServiceApi();
        Object fecha1 = null; // Object | 
        Object fecha2 = null; // Object | 
        try {
            Object result = apiInstance.buscarPorFecha(fecha1, fecha2);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActorApiServiceApi#buscarPorFecha");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ActorApiServiceApi;

import java.io.File;
import java.util.*;

public class ActorApiServiceApiExample {

    public static void main(String[] args) {
        
        ActorApiServiceApi apiInstance = new ActorApiServiceApi();
        Object filtro1 = ; // Object | 
        try {
            Object result = apiInstance.buscarPorNombreApellido(filtro1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActorApiServiceApi#buscarPorNombreApellido");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ActorApiServiceApi;

import java.io.File;
import java.util.*;

public class ActorApiServiceApiExample {

    public static void main(String[] args) {
        
        ActorApiServiceApi apiInstance = new ActorApiServiceApi();
        Object id = null; // Object | 
        try {
            Actor result = apiInstance.consultar(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActorApiServiceApi#consultar");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ActorApiServiceApi;

import java.io.File;
import java.util.*;

public class ActorApiServiceApiExample {

    public static void main(String[] args) {
        
        ActorApiServiceApi apiInstance = new ActorApiServiceApi();
        Actor body = new Actor(); // Actor | 
        try {
            Actor result = apiInstance.crear(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActorApiServiceApi#crear");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ActorApiServiceApi* | [**actualizarCoche**](docs/ActorApiServiceApi.md#actualizarCoche) | **PUT** /api/actores | 
*ActorApiServiceApi* | [**borrar**](docs/ActorApiServiceApi.md#borrar) | **DELETE** /api/actores/{id} | 
*ActorApiServiceApi* | [**buscarPorFecha**](docs/ActorApiServiceApi.md#buscarPorFecha) | **GET** /api/actores/fechas | 
*ActorApiServiceApi* | [**buscarPorNombreApellido**](docs/ActorApiServiceApi.md#buscarPorNombreApellido) | **GET** /api/actores/filtro | 
*ActorApiServiceApi* | [**consultar**](docs/ActorApiServiceApi.md#consultar) | **GET** /api/actores/{id} | 
*ActorApiServiceApi* | [**crear**](docs/ActorApiServiceApi.md#crear) | **POST** /api/actores | 

## Documentation for Models

 - [Actor](docs/Actor.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


