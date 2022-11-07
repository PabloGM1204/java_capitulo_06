public class Ejercicio11{
    public static void main(String[] args) {
        System.out.println("Este programa muestra varias notas y te dice cuantas ha salido");
        int n = 0;
        int sus = 0;
        int sufi = 0;
        int b = 0;
        int not = 0;
        int sobre = 0;
        for(int i = 1; i<=20; i++){
            n = (int)(Math.random()*11);
            switch (n) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Suspenso");
                    sus++;
                    break;
                case 5:
                    System.out.println("Suficiente");
                    sufi++;
                    break;
                case 6:
                    System.out.println("Bien");
                    b++;
                    break;
                case 7:
                case 8:
                    System.out.println("Notable");
                    not++;
                    break;
                case 9:
                case 10:
                System.out.println("Sobresaliente");
                sobre++;
                    break;
                default:
                    break;
            }
        }
        System.out.printf("%d Suspensos, %d Suficientes, %d Bien, %d Notable, %d Sobresaliente", sus, sufi, b, not, sobre);
    }
}