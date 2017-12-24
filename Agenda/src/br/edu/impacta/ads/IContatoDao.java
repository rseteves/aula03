package br.edu.impacta.ads;

import java.util.List;

public interface IContatoDao {
	List<Contato> buscar(String nome);
	void inserir(Contato c);
	void update(Contato c, Contato cNew);
	void remove(Contato c);
	boolean existe(Contato c);
}
