package io.github.joaopaulorosa.cantina.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.github.joaopaulorosa.cantina.Util;
import io.github.joaopaulorosa.cantina.model.Responsavel;

@Transactional
@Repository
public class ResponsavelDAOImpl implements ResponsavelDAO{

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public Responsavel buscaPorCPF(String CPF) {
		if(Util.isNullOrBlank(CPF)) {
			return null;
		}
		Query<Responsavel> query = getSession().createQuery("from Responsavel where cpf = :cpf", Responsavel.class);
		query.setParameter("cpf", CPF);
		return query.uniqueResult();
	}



}
