import java.util.Scanner;
public class Ejercicio17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pinta una pecera y un pez dentro");
        System.out.print("Dime la altura de la pecera: ");
        int alt = sc.nextInt();
        System.out.print("Dime la anchura de la pecera: ");
        int anc = sc.nextInt();
        int puesto = 0;
        int pez = (int)(Math.random()*(anc-2)*(alt-2));
        for(int i = 1; i<=anc; i++){
            System.out.print("* ");
        }
        System.out.println("");
        for(int i = 2; i<alt; i++){
            System.out.print("* ");
            for(int j = 2; j<anc; j++){
                if(pez == puesto){
                    System.out.print("& ");
                }else{
                    System.out.print("  ");
                }
                puesto++;
            }
            System.out.println("* ");
        }
        for(int i = 1; i<=anc; i++){
            System.out.print("* ");
        }
    }
}