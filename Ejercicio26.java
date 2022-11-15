import java.util.Scanner;
public class Ejercicio26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pinta una tabla de turron con un bocado aleatorio");
        System.out.print("Introduzca la anchura de la tabla: ");
        int anc = sc.nextInt();
        System.out.print("Introduzca la altura de la tabla: ");
        int alt = sc.nextInt();
        int n = (int)(Math.random()*(anc*2+(alt-2)*2));
        int pos = 0;
        for(int i = 1; i<=alt; i++){
            for(int j = 1; j<=anc; j++){
                Boolean borde = (i == 1) || (i == alt) || (j == 1) || (j == anc);
                if((pos == n) && borde){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                if(borde){
                    pos++;
                }
            }
            System.out.println("");
        }
    }
}