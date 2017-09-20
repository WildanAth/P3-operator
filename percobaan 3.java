public class Demologika{

    public static void main(string[] args) {

        //beberapa nilai
        int i = 37;
        int j = 42;
        int k = 42;

        system.out.println("Nilai variabel . . . ");
        system.out.println(" i = " + i);
        system.out.println(" j = " + j);
        system.out.println(" k = " + k);

        //Lebih besar dari
        system.out.println("Lebih besar dari . . . ");
        system.out.println(" i > j = " + (i > j)); //false
        system.out.println(" j > i = " + (j > i)); //true
        system.out.println(" k > j = " + (k > j)); //true

        //Lebih besar atau sama dengan
        system.out.println("Lebih besar atau sama dengan . . . ");
        system.out.println(" i >= j = " + (i >= j)); //false
        system.out.println(" j >= i = " + (j >= i)); //true
        system.out.println(" k >= j = " + (k >= j)); //true

        //Lebih kecil dari
        system.out.println("Lebih kecil dari . . . ");
        system.out.println(" i < j = " + (i < j)); //true
        system.out.println(" j < i = " + (j < i)); //false
        system.out.println(" k < j = " + (k < j)); //false

        //Lebih kecil atau sama dengan
        system.out.println("Lebih kecil atau sama dengan . . . ");
        system.out.println(" i <= j = " + (i <= j)); //true
        system.out.println(" j <= i = " + (j <= i)); //false
        system.out.println(" k <= j = " + (k <= j)); //false

        //Sama dengan
        system.out.println("Sama dengan . . . ");
        system.out.println(" i == j = " + (i == j)); //false
        system.out.println(" k == j = " + (k == j)); //true

        //Tidak Sama dengan
        system.out.println("Tidak Sama dengan . . . ");
        system.out.println(" i != j = " + (i != j)); //false
        system.out.println(" k != j = " + (k != j)); //true

    }
}