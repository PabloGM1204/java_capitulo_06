public class Ejercicio25{
    public static void main(String[] args) {
        System.out.println("Este programa genera 100 números entre 10 y 200");
        int n;
        int r = 1;
        for(int i = 1; i<=100; i++){
            n = (int)(Math.random()*(201-10))+10;
            if(r<=2){
                System.out.println("#"+n+"#");
                r++;
            }else if(n % 5 == 0){
                System.out.println("["+n+"]");
            }else{
                System.out.println(n);
            }
        }
    }
}