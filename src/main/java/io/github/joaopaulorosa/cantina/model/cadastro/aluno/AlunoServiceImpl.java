package io.github.joaopaulorosa.cantina.model.cadastro.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlunoServiceImpl implements AlunoService{
	
	@Autowired
	private AlunoDAO alunoDAO;
	
//	@Override
//	  @Transactional
//	  public void insertUser(User user) {
//	    userDAO.insertUser(user);
//	  }
//
//	  @Override
//	  @Transactional
//	  public User getUserById(int userId) {
//	    return userDAO.getUserById(userId);
//	  }

}
