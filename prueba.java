import java.util.Scanner;
public class prueba{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String pr = "0";
        int esIz = (38-a.length())/2;
        int esDe = (38-a.length())/2;
        System.out.printf("*%-"+esIz+"s %s %"+esDe+"s*",pr, a, pr);
        // Se que el total es 40 por lo que dos se ocupan por los asteriscos y me quedan 38 que a eso le resto el length y me queda eso entre dos
    }
}