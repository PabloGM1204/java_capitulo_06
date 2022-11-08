import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa intetara adivinar tu número");
        System.out.print("Dime el número a adivinar: ");
        int n = sc.nextInt();
        int max = 100;
        int min = 0;
        int na = 0;
        boolean acertado = true;
        for(int i = 1; i<=5; i++){
            int a = (int)(Math.random()*(max-min)+min);
            na = a;
            System.out.print(a+" ");
            if(a == n){
                i = 6;
                System.out.println("He adivinado el número");
                acertado = true;
            }else{
                acertado = false;
                System.out.print("Tu número es mayor o menor: ");
                String ayuda = sc.next();
                if(ayuda.equals("mayor")){
                    min = na-1;
                }else if(ayuda.equals("menor")){
                    max = na+1;
                }else{
                    System.out.println("Error, debes escribir bien");
                }
            }
        }if(!acertado){
            System.out.println("Me he quedado sin intentos");
        }
    }
}