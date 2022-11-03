public class Ejercicio3{
    public static void main(String[] args) {
        System.out.println("Este programa ");
        int carta = (int)(Math.random()*10)+1;
        switch (carta) {
            case 1:
                System.out.print("Tu carta es el A de ");
                break;
            case 8:
                System.out.print("Tu carta es la Sota de ");
                break;
            case 9:
                System.out.print("Tu carta es el Caballo de ");
                break;
            case 10:
                System.out.print("Tu carta es el Rey de ");
                break;
            default:
                System.out.print("Tu carta es el "+carta+" de ");
                break;
        }
        int palo = (int)(Math.random()*4)+1;
        switch (palo) {
            case 1:
                System.out.print("Bastos");
                break;
            case 2:
                System.out.print("Copas");
                break;
            case 3:
                System.out.print("Monedas");
                break;
            case 4:
                System.out.print("Espadas");
                break;
            default:
                break;
        };
    }
}