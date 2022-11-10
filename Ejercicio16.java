public class Ejercicio16{
    public static void main(String[] args) {
        System.out.println("Este programa funciona como una tragaperras");
        System.out.println("Pulsa enter para jugar");
        System.console().readLine();
        int fig = 0;
        int fig1 = 0;
        int fig2 = 0;
        int fig3 = 0;
        for(int i = 1; i<=3; i++){
            fig = (int)(Math.random()*5);
            switch (fig) {
                case 0:
                    System.out.print("diamante ");
                    break;
                case 1:
                    System.out.print("corazon ");
                    break;
                case 2:
                    System.out.print("herradura ");
                    break;
                case 3:
                    System.out.print("campana ");
                    break;
                case 4:
                    System.out.print("limon ");
                    break;
                default:
                    break;
            }
            switch (i) {
                case 0:
                    fig1 = fig;
                    break;
                case 1:
                    fig2 = fig;
                    break;
                case 2:
                    fig3 = fig;
                    break;
                default:
                    break;
            }
        }
        if ((fig1 == fig2) && (fig2 == fig3) && (fig1 == fig3)) {
            System.out.println("\nEnhorabuena, ha ganado 10 monedas.");
        } else if ((fig1 == fig2) || (fig2 == fig3) || (fig1 == fig3)) {
            System.out.println("\nBien, ha recuperado su moneda.");
        } else {
            System.out.println("\nLo siento, ha perdido.");
        }
    }
}