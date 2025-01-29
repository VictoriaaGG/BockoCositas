package io.swagger.client;

import io.swagger.client.api.ActorApiServiceApi;
import io.swagger.client.model.Actor;

public class Test {
	public static void main(String[] args) {
		ApiClient client = new ApiClient();
		client.setBasePath("http://localhost:8080");
		// client.setApiKey("blaspass");
		// client.addDefaultHeader("API-KEY","blaspass");

		ActorApiServiceApi clientActor = new ActorApiServiceApi(client);

		try {
			Actor actor = clientActor.consultar(1);
			System.out.println(actor);
		} catch (ApiException e) {
			System.out.println(e.getCode());
			System.out.println(e.getResponseBody());
		}
	}
}
