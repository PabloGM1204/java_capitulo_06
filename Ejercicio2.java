public class Ejercicio2{
    public static void main(String[] args) {
        System.out.println("Este programa muestra al azar el nombre de una baraja francesa");
        int carta = (int)(Math.random()*13)+1;
        switch (carta) {
            case 1:
                System.out.print("Tu carta es el A de ");
                break;
            case 11:
                System.out.print("Tu carta es la J de ");
                break;
            case 12:
                System.out.print("Tu carta es la Q de ");
                break;
            case 13:
                System.out.print("Tu carta es la K de ");
                break;
            default:
                System.out.print("Tu carta es "+carta+" de ");
                break;
        }
        int palo = (int)(Math.random()*4)+1;
        switch (palo) {
            case 1:
                System.out.print("picas");
                break;
            case 2:
                System.out.print("corazones");
                break;
            case 3:
                System.out.print("diamantes");
                break;
            case 4:
                System.out.print("treboles");
                break;
            default:
                break;
        };
    }
}