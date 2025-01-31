package ceu.dam.ad.api.actor.client;

import ceu.dam.ad.api.actor.client.api.ActorApiServiceApi;
import ceu.dam.ad.api.actor.client.model.Actor;

public class Test {
public static void main(String[] args) {
	ApiClient client = new ApiClient();
	client.setBasePath("http://localhost:8080");
	//client.setApiKey("blaspass");
	ActorApiServiceApi api = new ActorApiServiceApi();
	try {
		Actor actor= api.consultar(1);
		System.out.println(actor);
	} catch (ApiException e) {
		System.out.println(e.getCode());
		System.out.println(e.getLocalizedMessage());
	}
}
}
