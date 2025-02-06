# PedidoApiServiceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aadirDetalle**](PedidoApiServiceApi.md#aadirDetalle) | **PUT** /api/pedidos/{id} |  |
| [**buscarPedidoPorId**](PedidoApiServiceApi.md#buscarPedidoPorId) | **GET** /api/pedidos/{id} |  |
| [**buscarPedidosPorCliente**](PedidoApiServiceApi.md#buscarPedidosPorCliente) | **GET** /api/pedidos/cliente/{dni} |  |
| [**buscarPorFechas**](PedidoApiServiceApi.md#buscarPorFechas) | **GET** /api/pedidos |  |
| [**crearPedido**](PedidoApiServiceApi.md#crearPedido) | **POST** /api/pedidos |  |


<a id="aadirDetalle"></a>
# **aadirDetalle**
> Pedido aadirDetalle(id, pedidoDetalle)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PedidoApiServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    PedidoApiServiceApi apiInstance = new PedidoApiServiceApi(defaultClient);
    String id = "id_example"; // String | 
    PedidoDetalle pedidoDetalle = new PedidoDetalle(); // PedidoDetalle | 
    try {
      Pedido result = apiInstance.aadirDetalle(id, pedidoDetalle);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PedidoApiServiceApi#aadirDetalle");
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
| **pedidoDetalle** | [**PedidoDetalle**](PedidoDetalle.md)|  | |

### Return type

[**Pedido**](Pedido.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="buscarPedidoPorId"></a>
# **buscarPedidoPorId**
> Pedido buscarPedidoPorId(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PedidoApiServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    PedidoApiServiceApi apiInstance = new PedidoApiServiceApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      Pedido result = apiInstance.buscarPedidoPorId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PedidoApiServiceApi#buscarPedidoPorId");
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

[**Pedido**](Pedido.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="buscarPedidosPorCliente"></a>
# **buscarPedidosPorCliente**
> List&lt;Pedido&gt; buscarPedidosPorCliente(dni)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PedidoApiServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    PedidoApiServiceApi apiInstance = new PedidoApiServiceApi(defaultClient);
    String dni = "dni_example"; // String | 
    try {
      List<Pedido> result = apiInstance.buscarPedidosPorCliente(dni);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PedidoApiServiceApi#buscarPedidosPorCliente");
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

[**List&lt;Pedido&gt;**](Pedido.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="buscarPorFechas"></a>
# **buscarPorFechas**
> List&lt;Pedido&gt; buscarPorFechas(desde, hasta)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PedidoApiServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    PedidoApiServiceApi apiInstance = new PedidoApiServiceApi(defaultClient);
    LocalDate desde = LocalDate.now(); // LocalDate | 
    LocalDate hasta = LocalDate.now(); // LocalDate | 
    try {
      List<Pedido> result = apiInstance.buscarPorFechas(desde, hasta);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PedidoApiServiceApi#buscarPorFechas");
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
| **desde** | **LocalDate**|  | [optional] |
| **hasta** | **LocalDate**|  | [optional] |

### Return type

[**List&lt;Pedido&gt;**](Pedido.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="crearPedido"></a>
# **crearPedido**
> String crearPedido(pedido)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PedidoApiServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    PedidoApiServiceApi apiInstance = new PedidoApiServiceApi(defaultClient);
    Pedido pedido = new Pedido(); // Pedido | 
    try {
      String result = apiInstance.crearPedido(pedido);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PedidoApiServiceApi#crearPedido");
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
| **pedido** | [**Pedido**](Pedido.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

