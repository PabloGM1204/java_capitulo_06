public class Ejercicio10{
    public static void main(String[] args) {
        System.out.println("Este programa pinta diez lineas con caracteres aleatorios");
        String s = " ";
        for(int i = 1; i<=10; i++){
            int c = (int)(Math.random()*6)+1;
            switch (c) {
                case 1:
                    s = "*";
                    break;
                case 2:
                    s = "-";
                    break;
                case 3:
                    s = "=";
                    break;
                case 4:
                    s = ".";
                    break;
                case 5:
                    s = "|";
                    break;
                case 6:
                    s = "@";
                    break;
                default:
                    break;
            }
            int n = (int)(Math.random()*40)+1;
            for(int a = 1; a<=n; a++){
                System.out.print(s);
            }
            System.out.println("");
        }
    }
}