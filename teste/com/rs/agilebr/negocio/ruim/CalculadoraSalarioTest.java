package com.rs.agilebr.negocio.ruim;

import java.math.BigDecimal;
import java.math.RoundingMode;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.rs.agilebr.negocio.ruim.Calculadora;
import com.rs.agilebr.negocio.ruim.Pessoa;



public class CalculadoraSalarioTest {

	private static final TipoPessoa PJ = TipoPessoa.PJ;
	private static final TipoPessoa PF = TipoPessoa.PF;
	private Calculadora calculadora;

	@Before
	public void setUp(){
		calculadora = new Calculadora();
	}
	
	@Test
	public void deveCalcularSalarioLiquidoComDescontosNaPrimeiraFaixa(){
		Pessoa pf = new Pessoa(new BigDecimal(1000).setScale(2), PF);
		BigDecimal salarioLiquido = calculadora.calacular(pf);
		
		Assert.assertEquals(salarioLiquido, new BigDecimal(920).setScale(2));
	}
	
	@Test
	public void deveCalcularSalarioLiquidoComDescontosNaSegundaFaixa(){
		Pessoa pf = new Pessoa(new BigDecimal(1800).setScale(2), PF);
		BigDecimal salarioLiquido = calculadora.calacular(pf);
		
		Assert.assertEquals(salarioLiquido, new BigDecimal(1503).setScale(2));
	}

	@Test
	public void deveCalcularSalarioLiquidoComDescontosNaTerceiraFaixaIR(){
		Pessoa pf = new Pessoa(new BigDecimal(3400).setScale(2), PF);
		BigDecimal salarioLiquido = calculadora.calacular(pf);
		
		Assert.assertEquals(salarioLiquido, new BigDecimal(2516).setScale(2));
	}

	@Test
	public void deveCalcularSalarioLiquidoComDescontosNaQuartaFaixaIR(){
		Pessoa pf = new Pessoa(new BigDecimal(4000).setScale(2), PF);
		BigDecimal salarioLiquido = calculadora.calacular(pf);
		
		Assert.assertEquals(salarioLiquido, new BigDecimal(2669.22).setScale(2,RoundingMode.HALF_UP));
	}

	@Test
	public void deveCalcularSalarioLiquidoComDescontosNaUltimaFaixaIR(){
		Pessoa pf = new Pessoa(new BigDecimal(4500).setScale(2), PF);
		BigDecimal salarioLiquido = calculadora.calacular(pf);
		
		Assert.assertEquals(salarioLiquido, new BigDecimal(2831.72).setScale(2,RoundingMode.HALF_UP));
	}
	

	@Test
	public void deveCalcularSalarioLiquidoPessoaJuridica(){
		Pessoa pj = new Pessoa(new BigDecimal(30).setScale(2), PJ);
		pj.setHoras(150);
		BigDecimal salarioLiquido = calculadora.calacular(pj);
		
		Assert.assertEquals( new BigDecimal(4275).setScale(2,RoundingMode.HALF_UP),salarioLiquido);
	}
}
