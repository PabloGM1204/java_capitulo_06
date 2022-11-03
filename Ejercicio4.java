public class Ejercicio4{
    public static void main(String[] args) {
        System.out.println("Este programa muestra 20 números aleatorios entre 0 y 10");
        for(int i = 1; i<=20; i++){
            System.out.print((int)(Math.random()*11)+" ");
        }
    }
}