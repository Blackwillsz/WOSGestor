package br.com.wosgestor.loja.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.wosgestor.loja.models.Autor;

public class AutorDao {
	
	
	
	public List<Autor> listar(){
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT a FROM Autor a", Autor.class);
		
		EntityManager em = Conexao.getConexaoEM();
		Query query = em.createQuery(sql.toString());
				query.setParameter(Autor.class, "a");
				return query.getResultList();
				
	}

}
