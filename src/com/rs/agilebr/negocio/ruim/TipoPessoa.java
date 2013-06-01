package com.rs.agilebr.negocio.ruim;

public enum TipoPessoa {
	PF("PF"),
	PJ("PJ");
	
	private String tipo;

	private TipoPessoa(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
	
	
}
