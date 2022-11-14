import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa rellena una cuba con agua");
        System.out.print("Dime la capacidad de la cuba en litros: ");
        int alt = sc.nextInt();
        int agua = (int)(Math.random()*alt);
        for(int i = 1; i<=alt; i++){
            if(i>=agua){
                System.out.println("*====*");
            }else{
                System.out.println("*    *");
            }
        }
        System.out.println("******");
    }
}