import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa intetara adivinar tu número");
        int max = 100;
        int min = 0;
        int na = 0;
        boolean acertado = false;
        for(int i = 1; i<=5; i++){
            int numpen = (int)(Math.random()*(max-min)+min);
            System.out.print("¿Es el "+numpen+" ?");
            System.out.print("El número que estás pensando es 1) mayor 2) menor 3) el mismo: ");
            int mayMenIgua = sc.nextInt();
            if(mayMenIgua == 1){
                min = numpen+1;
            }else if(mayMenIgua == 2){
                max = numpen-1;
            }else if(mayMenIgua == 3){
                acertado = true;
                System.out.println("Has acertado");
                i = 6;
            }else{
                System.out.println("Error, debes escribir bien");
            }
        }if(!acertado){
            System.out.println("Me he quedado sin intentos");
        }
    }
}