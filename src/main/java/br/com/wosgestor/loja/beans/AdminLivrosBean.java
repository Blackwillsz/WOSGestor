package br.com.wosgestor.loja.beans;

import br.com.wosgestor.loja.models.Livro;

public class AdminLivrosBean {
	
	private Livro livro;
	
	public void salvar() {
		System.out.println("Livro cadastrado" + livro);
	}

}
