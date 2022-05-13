package br.unicamp.ic.inf335.beans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoBeanTest {

	private ProdutoBean produto = new ProdutoBean("codigo", "nome", "descricao", 10.99, "estado");
	private ProdutoBean produto2 = new ProdutoBean("codigo2", "nome2", "descricao2", 20.99, "estado2");
	@Test
	void testCompareTo() {
		double result = produto.compareTo(produto2);
		assertEquals(result, (double)-1);
	}

}
