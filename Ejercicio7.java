public class Ejercicio7{
    public static void main(String[] args) {
        System.out.println("Este programa muestra tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince.");
        int r = 0;
        for(int i = 1; i<=14; i++){
            System.out.printf("%2d. |", i);
            for(int a = 1; a<=3; a++){
                r = (int)(Math.random()*3)+1;
                switch (r) {
                    case 1:
                        System.out.print("1  |");
                        break;
                    case 2:
                        System.out.print("  2|");
                        break;
                    case 3:
                        System.out.print(" X |");
                        break;
                    default:
                        break;
                }
            }
            System.out.println();
        }
        System.out.print("Pleno al 15 - Local... ");
        int g = (int)(Math.random()*4);
        if(g<3){
            System.out.print(g);
        }else{
            System.out.print("M");
        }
        System.out.print(" Visitante ");
        g = (int)(Math.random()*4);
        if(g<3){
            System.out.print(g);
        }else{
            System.out.print("M");
        }
    }
}