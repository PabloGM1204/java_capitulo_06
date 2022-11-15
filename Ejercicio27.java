import java.util.Scanner;
public class Ejercicio27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa juega al piedra papel o tijera");
        System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
        String j = sc.next();
        int ganador = 2;
        if((j.equals("piedra")) || (j.equals("papel")) || (j.equals("tijera"))){
            String pc = "";
            switch ((int)(Math.random()*3)) {
                case 0:
                    pc = "piedra";
                    break;
                case 1:
                    pc = "papel";
                    break;
                case 2:
                    pc = "tijera";
                    break;
                default:
                    break;
            }
            System.out.println("Turno del ordenador: "+pc);
            if(j.equals(pc)){
                System.out.print("Empate");
            }else{
                switch (j) {
                    case "piedra":
                        if(pc.equals("tijera")){
                            ganador = 1;
                        }
                        break;
                    case "papel":
                        if(pc.equals("piedra")){
                            ganador = 1;
                        }
                        break;
                    case "tijera":
                        if(pc.equals("papel")){
                            ganador = 1;
                        }
                        break;
                    default:
                        break;
                }
                if(ganador == 1){
                    System.out.println("Gana el jugador");
                }else{
                    System.out.println("Gana el ordenador");
                }
            }
        }else{
            System.out.println("Error debe escribir bien");
        }
    }
}