public class Ejercicio13{
    public static void main(String[] args) {
        System.out.println("Este programa tira dos dados y si es el mismo número termina");
        int d1 = (int)(Math.random()*6)+1;
        int d2 = (int)(Math.random()*6)+1;
            while(d1 != d2){
                d1 = (int)(Math.random()*6)+1;
                d2 = (int)(Math.random()*6)+1;
                System.out.println(d1+" "+d2);
            }
        
    }
}