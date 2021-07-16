
public interface TDAList<T>{

	boolean isEmptyList();
	int length();
	void destroyList();
	boolean search(Vendedor x);
	void insertFirst(T x);
	void insertLast(T x);
	void remove(T x);
}
