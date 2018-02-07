package test.br.edu.impacta.ads;

import java.util.List;

import org.junit.Test;

import br.edu.impacta.ads.Contato;
import br.edu.impacta.ads.ContatoDaoArquivo;
import static org.junit.Assert.assertNotNull;

class GenericTest {

	ContatoDaoArquivo cdao;

	@Test
	public void testTest() {
		ContatoDaoArquivo cdao = new ContatoDaoArquivo("contatos.txt");
		List <Contato> lista = cdao.lerTodos();
		assertNotNull("Não existe um arquivo de dados.", lista);
	}
}
