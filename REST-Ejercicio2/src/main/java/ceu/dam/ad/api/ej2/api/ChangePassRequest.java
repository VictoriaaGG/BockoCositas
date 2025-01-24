package ceu.dam.ad.api.ej2.api;

import lombok.Data;

@Data
public class ChangePassRequest {
	private String passwordOld;
	private String passwordNew;
	private Long idUser;
}
