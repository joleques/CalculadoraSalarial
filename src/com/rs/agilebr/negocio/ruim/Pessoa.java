package com.rs.agilebr.negocio.ruim;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.mockito.internal.util.collections.Sets;

public class Pessoa {

	private BigDecimal salarioBruto;
	private final TipoPessoa tipo;
	private int horas;

	public Pessoa(BigDecimal salarioBruto, TipoPessoa tipo) {
		super();
		this.salarioBruto = salarioBruto;
		this.tipo = tipo;
	}

	public BigDecimal getSalarioBruto() {
		if(this.tipo.equals(TipoPessoa.PJ))
			return salarioBruto.multiply(new BigDecimal(this.horas)).setScale(2,RoundingMode.HALF_UP);
		return salarioBruto;
	}

	public TipoPessoa getTipo() {
		return this.tipo;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

}
