public class Ejercicio5{
    public static void main(String[] args) {
        System.out.println("Este programa muestra 50 números aleatorios entre 100 y 199 y la media de los mismos");
        for(int i = 1; i<=50; i++){
            System.out.print((int)(Math.random()*100)+100+" ");
        }
    }
}