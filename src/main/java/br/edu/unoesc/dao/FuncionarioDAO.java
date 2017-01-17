package br.edu.unoesc.dao;

import javax.enterprise.context.RequestScoped;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.edu.unoesc.model.Funcionario;

@RequestScoped
public class FuncionarioDAO extends HibernateDAO<Funcionario> {

	public Funcionario buscarUsuario(String login, String senha) {
		this.conectar();
		try {
			TypedQuery<Funcionario> query = em.createNamedQuery("FILTRA_POR_LOGIN_E_SENHA",
					Funcionario.class);
			query.setParameter("login", login);
			query.setParameter("senha", senha);
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		} finally {
			this.finalizar();
		}
	}
	
	public Funcionario buscarUsuario(Funcionario usuario) {
		this.conectar();
		try {
			TypedQuery<Funcionario> query = em.createNamedQuery("FILTRA_POR_LOGIN_E_SENHA",
					Funcionario.class);
			query.setParameter("login", usuario.getUsuario());
			query.setParameter("senha", usuario.getSenha());
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		} finally {
			this.finalizar();
		}
	}
	
	
}
