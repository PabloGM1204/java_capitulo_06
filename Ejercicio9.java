public class Ejercicio9{
    public static void main(String[] args) {
        System.out.println("Este programa va generando número hasta que salga el 24");
        int n;
        int cont = 0;
        do{
            n = (int)(Math.random() * 51) * 2;
            cont++;
        }while(n!=24);
        System.out.println("Se han generado "+cont+" números");
    }
}