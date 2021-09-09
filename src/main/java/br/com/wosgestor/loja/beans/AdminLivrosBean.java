package br.com.wosgestor.loja.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.wosgestor.loja.models.Livro;

@Named (value = "adminLivrosBean")
@RequestScoped
public class AdminLivrosBean {
	
	private Livro livro = new Livro();
	
	public void salvar() {
		System.out.println("Livro cadastrado" + livro);
	}

}
