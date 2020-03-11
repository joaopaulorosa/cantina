package io.github.joaopaulorosa.cantina.model;

import java.util.List;

public interface DefaultDAO<T> {
	void delete(T obj);
	//    void deleteAll(List<T> lista);
	void save(T obj);
	void saveOrUpdate(T obj);
	//    void saveAll(List<T> lista);
	void update(T obj);
	List<T> getLista();
	List<T> getLista(String ordem);
	T getById(Integer id);
	Object getBySessionId(Class classeObjeto, Integer id);
}
