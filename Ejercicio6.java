import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice un número un número entre 0 y 100");
        int a = (int)(Math.random()*100)+1;
        boolean acierto = false;
        System.out.print("Tienes 5 intentos, dime un número: ");
        for(int i = 4; i>=0; i--){
            int n = sc.nextInt();
            if(n==a){
                acierto = true;
                i=0;
            }else{
                System.out.println("Te quedan "+i+" intentos");
            }
        }
        if(acierto){
            System.out.println("Has acertado");
        }else{
            System.out.println("No te quedan intentos");
        }
    }
}