package claseSinGenerica.claseConGenerica;

//T es un generico usado comunmente para referiste al tipo de clases
public class ClaseGenerica<T> {

    private T type;

    public void classType(T t1){
        System.out.println("El tipo de T es " + t1);
        System.out.println("El tipo de T es " +t1.getClass());
    }
}
