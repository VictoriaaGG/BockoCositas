package ceu.dam.ad.tema3.ejercicios.ejercicio06.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "peidos_lineas_norm")
public class PedidoLineaNorm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLinea;
	private Integer numeroLinea;
	private String articulo;
	private BigDecimal precio;

}
