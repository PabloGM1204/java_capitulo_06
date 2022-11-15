import java.util.Scanner;
public class Ejercicio30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Este programa hace una pecera con tres peces\n");
        System.out.print("Dime la altura de la pecera(4 como minimo): ");
        int alt = sc.nextInt();
        System.out.print("Dime la anchura de la pecera(4 como minimo): ");
        int anc = sc.nextInt();
        int posCab;
        int posPez;
        int posCar;
        do{
            posCab = (int)(Math.random()*(anc-2)*(alt-2));
            posPez = (int)(Math.random()*(anc-2)*(alt-2));
            posCar = (int)(Math.random()*(anc-2)*(alt-2));
        }while((posCab == posPez) || (posPez == posCar) || (posCar == posCab));
        int puesto = 0;
        for(int i = 1; i<=anc; i++){
            System.out.print("* ");
        }
        System.out.println("");
        for(int i = 1; i<=alt-2; i++){
            System.out.print("* ");
            for(int j = 1; j<=anc-2; j++){
                if(posCab == puesto){
                    System.out.print("$ ");
                }else if(posPez == puesto){
                    System.out.print("& ");
                }else if(posCar == puesto){
                    System.out.print("@ ");
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
        System.out.println("");

    }
}