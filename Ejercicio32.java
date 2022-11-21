import java.util.Scanner;
public class Ejercicio32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa dibuja un sendero aleatorio");
        System.out.print("Dime la altura del sendero en metros: ");
        int alt = sc.nextInt();
        int mov = 0;
        int esp = alt;
        boolean obs = false;
        boolean hecho = true;
        for(int i = 0; i<alt; i++){
            for(int j = 0; j<esp; j++){
                System.out.print(" ");
            }
            mov = (int)(Math.random()*3);
            switch (mov) {
                case 0:
                    esp -=1;
                    break;
                case 1:
                    esp +=1;
                    break;
                default:
                    break;
            }
            System.out.print("|");
            for(int j = 0; j<4; j++){
                switch ((int)(Math.random()*2)) {
                    case 0:
                        obs = true;
                        break;
                    default:
                        obs = false;
                        break;
                }
                if(obs && hecho){
                    switch ((int)(Math.random()*2)) {
                        case 1:
                        System.out.print("*");
                        obs = false;
                        hecho = false;
                        break;
                        default:
                        System.out.print("O");
                        obs = false;
                        hecho = false;
                        break;
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("|");
            switch ((int)(Math.random()*2)) {
                case 0:
                    hecho = true;
                    break;
                default:
                    hecho = false;
                    break;
            }
        }
    }
}