# ActorApiServiceApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actualizarCoche**](ActorApiServiceApi.md#actualizarCoche) | **PUT** /api/actores | 
[**borrar**](ActorApiServiceApi.md#borrar) | **DELETE** /api/actores/{id} | 
[**buscarPorFecha**](ActorApiServiceApi.md#buscarPorFecha) | **GET** /api/actores/fechas | 
[**buscarPorNombreApellido**](ActorApiServiceApi.md#buscarPorNombreApellido) | **GET** /api/actores/filtro | 
[**consultar**](ActorApiServiceApi.md#consultar) | **GET** /api/actores/{id} | 
[**crear**](ActorApiServiceApi.md#crear) | **POST** /api/actores | 

<a name="actualizarCoche"></a>
# **actualizarCoche**
> Actor actualizarCoche(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ActorApiServiceApi;


ActorApiServiceApi apiInstance = new ActorApiServiceApi();
Actor body = new Actor(); // Actor | 
try {
    Actor result = apiInstance.actualizarCoche(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActorApiServiceApi#actualizarCoche");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Actor**](Actor.md)|  |

### Return type

[**Actor**](Actor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="borrar"></a>
# **borrar**
> borrar(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ActorApiServiceApi;


ActorApiServiceApi apiInstance = new ActorApiServiceApi();
Object id = null; // Object | 
try {
    apiInstance.borrar(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ActorApiServiceApi#borrar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="buscarPorFecha"></a>
# **buscarPorFecha**
> Object buscarPorFecha(fecha1, fecha2)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ActorApiServiceApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fecha1** | [**Object**](.md)|  | [optional]
 **fecha2** | [**Object**](.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="buscarPorNombreApellido"></a>
# **buscarPorNombreApellido**
> Object buscarPorNombreApellido(filtro1)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ActorApiServiceApi;


ActorApiServiceApi apiInstance = new ActorApiServiceApi();
Object filtro1 = ; // Object | 
try {
    Object result = apiInstance.buscarPorNombreApellido(filtro1);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActorApiServiceApi#buscarPorNombreApellido");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filtro1** | [**Object**](.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="consultar"></a>
# **consultar**
> Actor consultar(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ActorApiServiceApi;


ActorApiServiceApi apiInstance = new ActorApiServiceApi();
Object id = null; // Object | 
try {
    Actor result = apiInstance.consultar(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActorApiServiceApi#consultar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)|  |

### Return type

[**Actor**](Actor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="crear"></a>
# **crear**
> Actor crear(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ActorApiServiceApi;


ActorApiServiceApi apiInstance = new ActorApiServiceApi();
Actor body = new Actor(); // Actor | 
try {
    Actor result = apiInstance.crear(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActorApiServiceApi#crear");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Actor**](Actor.md)|  |

### Return type

[**Actor**](Actor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

