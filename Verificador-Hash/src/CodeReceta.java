public class CodeReceta<E> implements Comparable<CodeReceta<E>> {
    protected int key;
    protected E pastilla;
    protected E horas;
    protected E precio;
    public CodeReceta(int key, E value,E direc, E precio) {
        this.key = key;
        this.pastilla = value;
        this.horas = direc;
        this.precio = precio;
    }
    public int compareTo(CodeReceta<E> r) {
        return this.key - r.key;
    }
    public boolean equals(Object o) {
        if(o instanceof CodeReceta) {
            CodeReceta<E> r = (CodeReceta<E>)o;
            return r.key == this.key;
        }
        return false;
    }
    public int getKey() {return this.key;}
    public E getPastilla() {return this.pastilla;}
    public E getHoras() {return this.horas;}//Se creó el getValue para obtener el value.
    public E getPrecio() {return this.precio;}

    public String toString() {
        return this.key+":"+this.pastilla+"  "+this.horas+"  "+this.precio.toString();
    }
}