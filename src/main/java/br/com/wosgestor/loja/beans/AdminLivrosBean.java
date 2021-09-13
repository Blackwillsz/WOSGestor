package br.com.wosgestor.loja.beans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.wosgestor.loja.daos.AutorDao;
import br.com.wosgestor.loja.daos.LivroDao;
import br.com.wosgestor.loja.models.Autor;
import br.com.wosgestor.loja.models.Livro;

@Named
@RequestScoped
public class AdminLivrosBean {
	
	private Livro livro;
	
	private LivroDao livroDao;
	private AutorDao autorDao;
	
	private List<Integer> autoresId;
	
	@Transactional
	public void salvar() {
		for (Integer autorId : autoresId) {
			livro.getAutores().add(new Autor(autorId));
		}
	getLivroDao().salvar(getLivro());
		System.out.println("Livro cadastrado" + livro);
	}
	
	public List<Autor> getAutores(){
		return getAutorDao().listar();
	}

	public Livro getLivro() {
		if (livro == null) {
			livro = new Livro();
		}
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public LivroDao getLivroDao() {
		if (livroDao == null) {
			livroDao = new LivroDao();
		}
		return livroDao;
	}

	public void setLivroDao(LivroDao livroDao) {
		this.livroDao = livroDao;
	}

	public List<Integer> getAutoresId() {
		if (autoresId == null) {
			autoresId = new ArrayList<Integer>();
		}
		return autoresId;
	}

	public void setAutoresId(List<Integer> autoresId) {
		this.autoresId = autoresId;
	}

	public AutorDao getAutorDao() {
		if (autorDao == null) {
			autorDao = new AutorDao();
		}
		return autorDao;
	}

	public void setAutorDao(AutorDao autorDao) {
		this.autorDao = autorDao;
	}
	
	
	

}
