public class Ejercicio19{
    public static void main(String[] args) {
        System.out.println("Este programa te da números aleatorios, te dice el maximo de los pares y el minimo de los impares y la media total.");
        int max = 0;
        int min = 0;
        int t = 0;
        for(int i = 1; i<=50; i++){
            int n = (int)(Math.random()*301)-100;
            System.out.print(n+" ");
            t += n;
            if((n>max) && (n % 2 == 0)){
                max = n;
            }else if((n<min) && (n % 2 != 0)){
                min = n;
            }
        }
        System.out.println("");
        System.out.println("El maximo de los pares es: "+max);
        System.out.println("El minimo de los impares es: "+min);
        System.out.println("La media total es: "+t/50);
    }
}