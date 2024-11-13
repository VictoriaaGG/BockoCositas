package ejercicio03.modelo;

import lombok.Data;

@Data
public class Cliente {
private int id;
private String firstName;
private String lastName;
private String email;
private Boolean activo;
}
