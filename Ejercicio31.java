import java.util.Scanner;
public class Ejercicio31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa realiza el juego de craps");
        System.out.print("Cuanto dinero quieres apostar: ");
        int apuesta = sc.nextInt();
        boolean acertado = false;
        int d1 = (int)(Math.random()*6)+1;
        int d2 = (int)(Math.random()*6)+1;
        int resultado = d1+d2;
        System.out.println("1ºDado: "+d1+" 2ºDado: "+d2);
        if((d1+d2)== 7 || (d1+d2)== 11){
            System.out.println("Ha salido: "+(d1+d2));
            System.out.println("¡¡Has ganado!!Tu dinero total ahora es: "+(apuesta*2));
            acertado = true;
        }else if((d1+d2) == 2 || (d1+d2) == 3 || (d1+d2)==12){
            System.out.println("Ha salido: "+(d1+d2));
            System.out.println("Has perdido");
        }else{
            System.out.println("Ha salido: "+(d1+d2)+" por lo que hay que tirar otra vez");
            do{
                d1 = (int)(Math.random()*6)+1;
                d2 = (int)(Math.random()*6)+1;
                if(resultado == d1+d2){
                    System.out.println("Tu número es "+(d1+d2)+" por lo tanto has ganado");
                    acertado = true;
                }else if(resultado == 7){
                    System.out.println("Tu número es "+(d1+d2)+" por lo que has perdido");
                    acertado = true;
                }else{
                    System.out.println("Tu número es "+(d1+d2)+" por lo que debes seguir jugando");
                    resultado = d1+d2;
                }
            }while(!acertado);
        }
    }
}