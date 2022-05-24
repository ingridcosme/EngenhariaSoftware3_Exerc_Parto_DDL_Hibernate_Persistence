package persistence;

import java.util.List;

public interface IObjectDAO<T> {

	public void adicionar(T t);
	public void alterar(T t);
	public void remover(T t);
	public T buscar(T t);
	public List<T> listar();
	
}
