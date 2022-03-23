package genericos;

import java.util.Objects;

public class Dupla<T1 , T2> {

    private T1 type1;
    private T2 type2;

    public Dupla(T1 type1, T2 type2) {
        this.type1 = type1;
        this.type2 = type2;
    }

    public T1 getType1() {
        return type1;
    }

    public void setType1(T1 type1) {
        this.type1 = type1;
    }

    public T2 getType2() {
        return type2;
    }

    public void setType2(T2 type2) {
        this.type2 = type2;
    }


    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Dupla) ) return false;
        Dupla<?, ?> dupla = (Dupla<?, ?>) o;
        return type1.equals(dupla.type1) && type2.equals(dupla.type2);
    }



    @Override
    public int hashCode() {
        return Objects.hash(type1, type2);
    }

    @Override
    public String toString() {
        return "Dupla{" +
                "type1=" + type1 +
                ", type2=" + type2 +
                '}';
    }
}
