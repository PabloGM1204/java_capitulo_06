public class Ejercicio12{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Este programa llena la pantalla de caracteres aleatorios del codigo ascii");
        System.out.print("\033[32m");
        for(int i = 1; i<100000; i++){
            System.out.print((char)(Math.random()*(126-32+1)+32));
            Thread.sleep(1);
        }
    }
}