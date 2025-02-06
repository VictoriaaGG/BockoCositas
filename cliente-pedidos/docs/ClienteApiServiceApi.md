# ClienteApiServiceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**consultarClientePorDni**](ClienteApiServiceApi.md#consultarClientePorDni) | **GET** /api/clientes/dni/{dni} |  |
| [**consultarClientePorId**](ClienteApiServiceApi.md#consultarClientePorId) | **GET** /api/clientes/{id} |  |
| [**createCliente**](ClienteApiServiceApi.md#createCliente) | **POST** /api/clientes |  |
| [**updateCliente**](ClienteApiServiceApi.md#updateCliente) | **PUT** /api/clientes |  |


<a id="consultarClientePorDni"></a>
# **consultarClientePorDni**
> Cliente consultarClientePorDni(dni)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClienteApiServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ClienteApiServiceApi apiInstance = new ClienteApiServiceApi(defaultClient);
    String dni = "dni_example"; // String | 
    try {
      Cliente result = apiInstance.consultarClientePorDni(dni);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClienteApiServiceApi#consultarClientePorDni");
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
| **dni** | **String**|  | |

### Return type

[**Cliente**](Cliente.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="consultarClientePorId"></a>
# **consultarClientePorId**
> Cliente consultarClientePorId(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClienteApiServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ClienteApiServiceApi apiInstance = new ClienteApiServiceApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      Cliente result = apiInstance.consultarClientePorId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClienteApiServiceApi#consultarClientePorId");
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
| **id** | **String**|  | |

### Return type

[**Cliente**](Cliente.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createCliente"></a>
# **createCliente**
> Cliente createCliente(cliente)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClienteApiServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ClienteApiServiceApi apiInstance = new ClienteApiServiceApi(defaultClient);
    Cliente cliente = new Cliente(); // Cliente | 
    try {
      Cliente result = apiInstance.createCliente(cliente);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClienteApiServiceApi#createCliente");
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
| **cliente** | [**Cliente**](Cliente.md)|  | |

### Return type

[**Cliente**](Cliente.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateCliente"></a>
# **updateCliente**
> Cliente updateCliente(cliente)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClienteApiServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ClienteApiServiceApi apiInstance = new ClienteApiServiceApi(defaultClient);
    Cliente cliente = new Cliente(); // Cliente | 
    try {
      Cliente result = apiInstance.updateCliente(cliente);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClienteApiServiceApi#updateCliente");
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
| **cliente** | [**Cliente**](Cliente.md)|  | |

### Return type

[**Cliente**](Cliente.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

