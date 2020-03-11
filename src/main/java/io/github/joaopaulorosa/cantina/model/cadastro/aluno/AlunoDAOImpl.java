package io.github.joaopaulorosa.cantina.model.cadastro.aluno;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoDAOImpl implements AlunoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

//	public void insertUser(User user) {
//	    sessionFactory.getCurrentSession().save(user);
//	  }
	
//	@Override
//	  public User getUserById(int userId) {
//	    return (User) sessionFactory.
//	      getCurrentSession().
//	      get(User.class, userId);
//	  }
	
}
