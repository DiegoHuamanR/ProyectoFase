public interface TDAList<T> {
    boolean isEmptyList();
    int lenght();
    void destroyList();
    boolean search(T x);
    void insertLast(T x);
    void insertFirst(T x);
    void remove(T x);
    String toString();
    public Node<T> getFirst();
    public int search2(T x);//para arraylist


}
