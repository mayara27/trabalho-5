package br.unicamp.ic.inf335.beans;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AnuncioBeanTest {

	ProdutoBean produto = new ProdutoBean("codigo", "nome", "descricao", 10.0, "estado");
	ArrayList<URL> lista = new ArrayList();

	private AnuncioBean anuncio = new AnuncioBean(produto, lista, 0.5);
	
	@Test
	void testGetDesconto() {
		anuncio.setDesconto(-0.2);
		assertEquals(0.0, anuncio.getDesconto());
		
		anuncio.setDesconto(1.2);
		assertEquals(1.0, anuncio.getDesconto());
	}
	
	@Test
	void testGetValor() {
		assertEquals(5, anuncio.getValor());
		
		anuncio.setDesconto(1.2);
		assertEquals(1.0, anuncio.getDesconto());
	}
}
