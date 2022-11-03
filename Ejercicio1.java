public class Ejercicio1{
    public static void main(String[] args) {
        System.out.println("Este programa muestra la tirada de tres dados y su suma total");
        int t;
        int suma = 0;
        for(int i = 1; i<=3; i++){
            t = (int)(Math.random()*6)+1;
            System.out.print(t+" ");
            suma += t;
        }
        System.out.println("Suma: "+suma);
    }
}