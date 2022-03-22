package serVivo;

public class MainSerVivo {

    public static void main(String[] args) throws CloneNotSupportedException {

        Animal animal1 = new Animal("Bos taurus","Vaca comun",300,140 );
        Animal animal2 = animal1;
        Animal animal3 = new Animal("Panthera leo", "Leon", 200, 110);
        Animal animal4 = new Animal("Bos taurus","Vaca comun",300,140 );


        Vegetal vegetal1 = new Vegetal("Bellis perennis", "Margarita", 50);
        Vegetal vegetal2 = vegetal1;
        Vegetal vegetal3 = new Vegetal("Taraxacum officinale", "Diente de Leon", 10);
        Vegetal vegetal4 = new Vegetal("Bellis perennis", "Margarita", 50);

        System.out.println(animal1.equals(animal2) ? "Iguales" : "Diferentes");
        System.out.println(vegetal1.equals(vegetal2) ? "Iguales" : "Diferentes");
        System.out.println(animal1.equals(vegetal1) ? "Iguales" : "Diferentes");
        System.out.println(animal1.equals(animal3) ? "Iguales" : "Diferentes");
        System.out.println(vegetal1.equals(vegetal3) ? "Iguales" : "Diferentes");
        System.out.println(animal1.equals(animal4) ? "Iguales" : "Diferentes");
        System.out.println(vegetal1.equals(vegetal4) ? "Iguales" : "Diferentes");


        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);

    }
}











