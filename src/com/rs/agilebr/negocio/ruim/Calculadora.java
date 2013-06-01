package com.rs.agilebr.negocio.ruim;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculadora {

	public BigDecimal calacular(Pessoa pessoa) {
		BigDecimal descontos = descontos(pessoa);
		return pessoa.getSalarioBruto().subtract(descontos).setScale(2,RoundingMode.HALF_UP);
	}

	private BigDecimal descontos(Pessoa pessoa) {
		if(pessoa.getTipo().equals(TipoPessoa.PF)){
			BigDecimal inss = descontoINSS(pessoa);
			BigDecimal impostoRenda = descontoImpostoRenda(pessoa);
			return inss.add(impostoRenda);
		}else if(pessoa.getTipo().equals(TipoPessoa.PJ)){
			return descontoISS(pessoa);
		}
		return new BigDecimal(0);
	}

	private BigDecimal descontoISS(Pessoa pessoa) {
		BigDecimal percentualDesconto = new BigDecimal(0.05);
		BigDecimal salarioBruto = pessoa.getSalarioBruto();
		return salarioBruto.multiply(percentualDesconto).setScale(2,RoundingMode.HALF_UP);
	}

	private BigDecimal descontoImpostoRenda(Pessoa pessoa) {
		BigDecimal percentualDesconto = new BigDecimal(0);
		BigDecimal salarioBruto = pessoa.getSalarioBruto();
		if (pessoa.getSalarioBruto().compareTo(new BigDecimal(1710.78)) < 0) {
			percentualDesconto = new BigDecimal(0.0);
		}else if (pessoa.getSalarioBruto().compareTo(new BigDecimal(2563.91)) <= 0) {
			percentualDesconto = new BigDecimal(0.075);
		}else if (pessoa.getSalarioBruto().compareTo(new BigDecimal(3418.59)) <= 0) {
			percentualDesconto = new BigDecimal(0.15);
		}else if (pessoa.getSalarioBruto().compareTo(new BigDecimal(4271.59)) <= 0) {
			percentualDesconto = new BigDecimal(0.225);
		}else {
			percentualDesconto = new BigDecimal(0.275);
		}
		return salarioBruto.multiply(percentualDesconto).setScale(2,RoundingMode.HALF_UP);
	}

	private BigDecimal descontoINSS(Pessoa pessoa) {
		BigDecimal percentualDesconto = new BigDecimal(0);
		BigDecimal salarioBruto = pessoa.getSalarioBruto();
		if (pessoa.getSalarioBruto().compareTo(new BigDecimal(1174.86)) < 0) {
			percentualDesconto = new BigDecimal(0.08);
		} else if (pessoa.getSalarioBruto().compareTo(new BigDecimal(1958.10)) < 0) {
			percentualDesconto = new BigDecimal(0.09);
		} else if (pessoa.getSalarioBruto().compareTo(new BigDecimal(3916.20)) < 0) {
			percentualDesconto = new BigDecimal(0.11);
		} else {
			return new BigDecimal(430.78);
		}

		return salarioBruto.multiply(percentualDesconto).setScale(2,RoundingMode.HALF_UP);
	}

}
