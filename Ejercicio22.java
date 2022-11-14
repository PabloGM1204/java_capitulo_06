import java.util.Scanner;
public class Ejercicio22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pinta una serpiente");
        System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        int serpiente = sc.nextInt();
        int n = 13;
        System.out.println("            @");
        while(serpiente > 1){
            n += (int)(Math.random()*3)-1;
            for(int i = 1; i<n; i++){
                System.out.print(" ");
            }
            System.out.println("*");
            serpiente--;
        }
    }
}