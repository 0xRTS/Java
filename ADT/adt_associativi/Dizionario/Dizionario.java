public interface Dizionario extends Container{
	//uguale ad una mappa tranne per il fatto che le singole chiavi posso corrispondere a più valori
	void insert(Object key, Object value);
	Object remove(Object key);
	Object[] removeAll(Object key);
	Object find(Object key);
	Object[] findAll(Object key);
	Object[] keys();
}