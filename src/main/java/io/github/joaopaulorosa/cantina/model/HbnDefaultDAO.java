package io.github.joaopaulorosa.cantina.model;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class HbnDefaultDAO<T> implements DefaultDAO<T> {

	private Class<T> classe;

	@Autowired
	private SessionFactory sessionFactory;

	public HbnDefaultDAO() {
		ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
		classe= (Class<T>) parameterizedType.getActualTypeArguments()[0];
	}

	//    @Autowired
	//    @Qualifier("sessionFactory")
	//    public void init(SessionFactory sessionFactory){
	//        setSessionFactory(sessionFactory);
	//    }

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(T obj) {
		sessionFactory.getCurrentSession().delete(obj);
	}

	//    @Transactional(propagation = Propagation.REQUIRED)
	//    public void deleteAll(List<T> lista) {
	//        this.getHibernateTemplate().deleteAll(lista);
	//    }

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void save(T obj) {
		sessionFactory.getCurrentSession().save(obj);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveOrUpdate(T obj) {
		sessionFactory.getCurrentSession().saveOrUpdate(obj);
	}

	//    @Transactional(propagation = Propagation.REQUIRED)
	//    public void saveAll(List<T> lista) {
	//        this.getHibernateTemplate().saveOrUpdateAll(lista);
	//    }

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void update(T obj) {
		sessionFactory.getCurrentSession().update(obj);
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<T> getLista() {
		return sessionFactory.getCurrentSession().createCriteria(classe).list();
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<T> getLista(String ordem) {
		return sessionFactory.getCurrentSession().createCriteria(classe).addOrder(Order.asc(ordem)).list();
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public T getById(Integer id) {
		return sessionFactory.getCurrentSession().get(classe, id);
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public Object getBySessionId(Class classeObjeto, Integer id) {
		return sessionFactory.getCurrentSession().get(classeObjeto, id);
	}
}
