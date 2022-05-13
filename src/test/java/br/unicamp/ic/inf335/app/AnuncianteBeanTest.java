package br.unicamp.ic.inf335.beans;

import static org.junit.jupiter.api.Assertions.*;
import java.net.URL;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;


class AnuncianteBeanTest {
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	private ArrayList<AnuncioBean> anuncios = new  ArrayList();
	private ProdutoBean produto = new ProdutoBean("codigo", "nome", "descricao", 10.99, "estado");
	private ArrayList<URL> lista = new ArrayList();
	private AnuncioBean anuncio = new AnuncioBean(produto, lista, 0.5);
	AnuncianteBean anunciante = new AnuncianteBean("Maria", "112.321.456-56", anuncios);
	
	@Test
	void testRemoveAnuncio() throws Exception {
		expectedException.expect(IndexOutOfBoundsException.class);
        expectedException.expectMessage("Index Inexistente");
	}

	@Test
	void testValorMedioAnunciosReturnZero() {
		double result = anunciante.valorMedioAnuncios();
		assertEquals(0.0, result);
	}

	@Test
	void testValorMedioAnunciosReturnMedia() {
		anuncios.add(anuncio);
		double result = anunciante.valorMedioAnuncios();
		assertEquals(5.495, result);
	}
}
