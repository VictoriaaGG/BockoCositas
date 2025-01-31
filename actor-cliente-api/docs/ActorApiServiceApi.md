# ActorApiServiceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**actualizarCoche**](ActorApiServiceApi.md#actualizarCoche) | **PUT** /api/actores |  |
| [**borrar**](ActorApiServiceApi.md#borrar) | **DELETE** /api/actores/{id} |  |
| [**buscarPorFecha**](ActorApiServiceApi.md#buscarPorFecha) | **GET** /api/actores/fechas |  |
| [**buscarPorNombreApellido**](ActorApiServiceApi.md#buscarPorNombreApellido) | **GET** /api/actores/filtro |  |
| [**consultar**](ActorApiServiceApi.md#consultar) | **GET** /api/actores/{id} |  |
| [**crear**](ActorApiServiceApi.md#crear) | **POST** /api/actores |  |


<a id="actualizarCoche"></a>
# **actualizarCoche**
> Actor actualizarCoche(actor)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActorApiServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ActorApiServiceApi apiInstance = new ActorApiServiceApi(defaultClient);
    Actor actor = new Actor(); // Actor | 
    try {
      Actor result = apiInstance.actualizarCoche(actor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActorApiServiceApi#actualizarCoche");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **actor** | [**Actor**](Actor.md)|  | |

### Return type

[**Actor**](Actor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="borrar"></a>
# **borrar**
> borrar(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActorApiServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ActorApiServiceApi apiInstance = new ActorApiServiceApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      apiInstance.borrar(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActorApiServiceApi#borrar");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="buscarPorFecha"></a>
# **buscarPorFecha**
> List&lt;Actor&gt; buscarPorFecha(fecha1, fecha2)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActorApiServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ActorApiServiceApi apiInstance = new ActorApiServiceApi(defaultClient);
    LocalDate fecha1 = LocalDate.now(); // LocalDate | 
    LocalDate fecha2 = LocalDate.now(); // LocalDate | 
    try {
      List<Actor> result = apiInstance.buscarPorFecha(fecha1, fecha2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActorApiServiceApi#buscarPorFecha");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fecha1** | **LocalDate**|  | [optional] |
| **fecha2** | **LocalDate**|  | [optional] |

### Return type

[**List&lt;Actor&gt;**](Actor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="buscarPorNombreApellido"></a>
# **buscarPorNombreApellido**
> List&lt;Actor&gt; buscarPorNombreApellido(filtro1)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActorApiServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ActorApiServiceApi apiInstance = new ActorApiServiceApi(defaultClient);
    String filtro1 = ""; // String | 
    try {
      List<Actor> result = apiInstance.buscarPorNombreApellido(filtro1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActorApiServiceApi#buscarPorNombreApellido");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filtro1** | **String**|  | [optional] [default to ] |

### Return type

[**List&lt;Actor&gt;**](Actor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="consultar"></a>
# **consultar**
> Actor consultar(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActorApiServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ActorApiServiceApi apiInstance = new ActorApiServiceApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      Actor result = apiInstance.consultar(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActorApiServiceApi#consultar");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

[**Actor**](Actor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="crear"></a>
# **crear**
> Actor crear(actor)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActorApiServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ActorApiServiceApi apiInstance = new ActorApiServiceApi(defaultClient);
    Actor actor = new Actor(); // Actor | 
    try {
      Actor result = apiInstance.crear(actor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActorApiServiceApi#crear");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **actor** | [**Actor**](Actor.md)|  | |

### Return type

[**Actor**](Actor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

