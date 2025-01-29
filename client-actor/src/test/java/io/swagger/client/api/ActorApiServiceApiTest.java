/*
 * OpenAPI definition
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.Actor;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ActorApiServiceApi
 */
@Ignore
public class ActorApiServiceApiTest {

    private final ActorApiServiceApi api = new ActorApiServiceApi();

    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void actualizarCocheTest() throws Exception {
        Actor body = null;
        Actor response = api.actualizarCoche(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void borrarTest() throws Exception {
        Object id = null;
        api.borrar(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void buscarPorFechaTest() throws Exception {
        Object fecha1 = null;
        Object fecha2 = null;
        Object response = api.buscarPorFecha(fecha1, fecha2);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void buscarPorNombreApellidoTest() throws Exception {
        Object filtro1 = null;
        Object response = api.buscarPorNombreApellido(filtro1);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void consultarTest() throws Exception {
        Object id = null;
        Actor response = api.consultar(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void crearTest() throws Exception {
        Actor body = null;
        Actor response = api.crear(body);

        // TODO: test validations
    }
}
