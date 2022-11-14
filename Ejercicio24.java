import java.util.Scanner;
public class Ejercicio24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa coge un número aleatorio de otro");
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        int aux = n;
        int longi = 0;
        while(aux>0){
            longi++;
            aux /=10;
        }
        int posicion = (int)(Math.random()*longi)+1;
        for(int i = 1; i<=posicion; i++){
            n /=10;
        }
        System.out.print(n%10);
    }
}