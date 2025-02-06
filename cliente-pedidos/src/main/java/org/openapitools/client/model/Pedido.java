/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Cliente;
import org.openapitools.client.model.PedidoDetalle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Pedido
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-06T17:49:12.031616+01:00[Europe/Madrid]", comments = "Generator version: 7.11.0")
public class Pedido {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_CLIENTE = "cliente";
  @SerializedName(SERIALIZED_NAME_CLIENTE)
  @javax.annotation.Nonnull
  private Cliente cliente;

  public static final String SERIALIZED_NAME_FECHA = "fecha";
  @SerializedName(SERIALIZED_NAME_FECHA)
  @javax.annotation.Nonnull
  private LocalDate fecha;

  public static final String SERIALIZED_NAME_NUMERO = "numero";
  @SerializedName(SERIALIZED_NAME_NUMERO)
  @javax.annotation.Nonnull
  private Integer numero;

  public static final String SERIALIZED_NAME_DETALLES = "detalles";
  @SerializedName(SERIALIZED_NAME_DETALLES)
  @javax.annotation.Nullable
  private List<PedidoDetalle> detalles = new ArrayList<>();

  public Pedido() {
  }

  public Pedido id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public Pedido cliente(@javax.annotation.Nonnull Cliente cliente) {
    this.cliente = cliente;
    return this;
  }

  /**
   * Get cliente
   * @return cliente
   */
  @javax.annotation.Nonnull
  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(@javax.annotation.Nonnull Cliente cliente) {
    this.cliente = cliente;
  }


  public Pedido fecha(@javax.annotation.Nonnull LocalDate fecha) {
    this.fecha = fecha;
    return this;
  }

  /**
   * Get fecha
   * @return fecha
   */
  @javax.annotation.Nonnull
  public LocalDate getFecha() {
    return fecha;
  }

  public void setFecha(@javax.annotation.Nonnull LocalDate fecha) {
    this.fecha = fecha;
  }


  public Pedido numero(@javax.annotation.Nonnull Integer numero) {
    this.numero = numero;
    return this;
  }

  /**
   * Get numero
   * @return numero
   */
  @javax.annotation.Nonnull
  public Integer getNumero() {
    return numero;
  }

  public void setNumero(@javax.annotation.Nonnull Integer numero) {
    this.numero = numero;
  }


  public Pedido detalles(@javax.annotation.Nullable List<PedidoDetalle> detalles) {
    this.detalles = detalles;
    return this;
  }

  public Pedido addDetallesItem(PedidoDetalle detallesItem) {
    if (this.detalles == null) {
      this.detalles = new ArrayList<>();
    }
    this.detalles.add(detallesItem);
    return this;
  }

  /**
   * Get detalles
   * @return detalles
   */
  @javax.annotation.Nullable
  public List<PedidoDetalle> getDetalles() {
    return detalles;
  }

  public void setDetalles(@javax.annotation.Nullable List<PedidoDetalle> detalles) {
    this.detalles = detalles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pedido pedido = (Pedido) o;
    return Objects.equals(this.id, pedido.id) &&
        Objects.equals(this.cliente, pedido.cliente) &&
        Objects.equals(this.fecha, pedido.fecha) &&
        Objects.equals(this.numero, pedido.numero) &&
        Objects.equals(this.detalles, pedido.detalles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cliente, fecha, numero, detalles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pedido {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cliente: ").append(toIndentedString(cliente)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    detalles: ").append(toIndentedString(detalles)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("cliente");
    openapiFields.add("fecha");
    openapiFields.add("numero");
    openapiFields.add("detalles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cliente");
    openapiRequiredFields.add("fecha");
    openapiRequiredFields.add("numero");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Pedido
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Pedido.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Pedido is not found in the empty JSON string", Pedido.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Pedido.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Pedido` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Pedido.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `cliente`
      Cliente.validateJsonElement(jsonObj.get("cliente"));
      if (jsonObj.get("detalles") != null && !jsonObj.get("detalles").isJsonNull()) {
        JsonArray jsonArraydetalles = jsonObj.getAsJsonArray("detalles");
        if (jsonArraydetalles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("detalles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `detalles` to be an array in the JSON string but got `%s`", jsonObj.get("detalles").toString()));
          }

          // validate the optional field `detalles` (array)
          for (int i = 0; i < jsonArraydetalles.size(); i++) {
            PedidoDetalle.validateJsonElement(jsonArraydetalles.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Pedido.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Pedido' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Pedido> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Pedido.class));

       return (TypeAdapter<T>) new TypeAdapter<Pedido>() {
           @Override
           public void write(JsonWriter out, Pedido value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Pedido read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Pedido given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Pedido
   * @throws IOException if the JSON string is invalid with respect to Pedido
   */
  public static Pedido fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Pedido.class);
  }

  /**
   * Convert an instance of Pedido to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

