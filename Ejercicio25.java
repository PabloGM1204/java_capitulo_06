public class Ejercicio25{
    public static void main(String[] args) {
        System.out.println("Este programa genera 100 números entre 10 y 200");
        int n;
        for(int i = 1; i<=100; i++){
            n = (int)(Math.random()*(201-10))+10;
            boolean primo = true;
            for(int j = 2; j < n/2+1; j++){
                if((n % j) == 0){
                    primo = false;
                }
            }
            if(primo){
                System.out.print("#"+n+"# ");
            }else if(n % 5 == 0){
                System.out.print("["+n+"] ");
            }else{
                System.out.print(n+" ");
            }
        }
    }
}