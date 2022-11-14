public class Ejercicio21{
    public static void main(String[] args) {
        System.out.println("Este programa te da 5 monedas aleatorias y te dice si es cara o cruz");
        int mon;
        for(int i = 1; i<=5; i++){
            mon = (int)(Math.random()*8);
            switch (mon) {
                case 0:
                    System.out.print("1 centimo - ");
                    break;
                case 1:
                    System.out.print("2 centimos - ");
                    break;
                case 2:
                    System.out.print("5 centimos - ");
                    break;
                case 3:
                    System.out.print("10 centimos - ");
                    break;
                case 4:
                    System.out.print("20 centimos - ");
                    break;
                case 5:
                    System.out.print("50 centimos - ");
                    break;
                case 6:
                    System.out.print("1 euro - ");
                    break;
                case 7:
                    System.out.print("2 euros - ");
                    break;
                default:
                    break;
            }
            int n = (int)(Math.random()*2);
            switch (n) {
                case 0:
                    System.out.println("cara");
                    break;
                case 1:
                    System.out.println("cruz");
                    break;
                default:
                    break;
            }
        }
    }
}