package test.br.edu.impacta.ads;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.edu.impacta.ads.Contato;
import br.edu.impacta.ads.ContatoDaoArquivo;

public class ContatoTest {

	ContatoDaoArquivo contatoDao;
	Contato contato;

	@Before
	public void setData(){
		contatoDao = new ContatoDaoArquivo("contatos.txt");
		contato = new Contato("Renato", "123");
	}

	@Test
	public void testTest() {
		contatoDao.inserir(contato);
		assertTrue("O contato não foi adicionado.", contatoDao.existe(contato));
	}
	
	@Test
	public void testDavison() {
		int tamanhoanterior = contatoDao.lerTodos().size();
		contatoDao.inserir(contato);
		assertTrue("O contato não foi adicionado.", tamanhoanterior<=contatoDao.lerTodos().size());
	}
	
	@Test
	public void testDavison2() {
		List<Contato> buscar = contatoDao.buscar("Renato");		
		assertTrue("O contato não foi adicionado.", buscar.size()>=1);
	}
}
