package ceu.dam.ad.tema3.ejercicios.ejercicio03.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "film")
@Data
public class Pago {
	@Column(name = "payment_date")
	private LocalDate fecha;
	@Column(name = "amount")
	private BigDecimal importe;
	
	
}
