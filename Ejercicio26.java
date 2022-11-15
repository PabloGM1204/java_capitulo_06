import java.util.Scanner;
public class Ejercicio26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pinta una tabla de turron con un bocado aleatorio");
        System.out.print("Introduzca la anchura de la tabla: ");
        int anc = sc.nextInt();
        System.out.print("Introduzca la altura de la tabla: ");
        int alt = sc.nextInt();
        int n = (int)(Math.random()*alt)+1;
        for(int i = 1; i<=alt; i++){
            int j = 1;
            if(i == n){
                for(j = 2; j<=anc; j++){
                    System.out.print("*");
                }
            }else{
                for(j = 1; j<=anc; j++){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}