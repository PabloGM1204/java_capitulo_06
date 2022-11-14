public class Ejercicio18{
    public static void main(String[] args) {
        System.out.println("Este programa elige tres colores aleatorios");
        int n1;
        int n2;
        int n3;
        do{
            n1 = (int)(Math.random()*6);
            n2 = (int)(Math.random()*6);
            n3 = (int)(Math.random()*6);
        }while ((n1 == n2) || (n2 == n3) || (n3 == n1));
        String c1 = "";
            switch (n1) {
                case 0:
                    c1="Rojo";
                    break;
                case 1:
                    c1="Azul";
                    
                    break;
                case 2:
                    c1="Verde";
                    
                    break;
                case 3:
                    c1="Amarillo";
                    
                    break;
                case 4:
                    c1="Violeta";
                    
                    break;
                case 5:
                    c1="Naranja";
                    
                    break;
                default:
                    break;
        }
        String c2 = "";
            switch (n2) {
                case 0:
                    c2="Rojo";
                    break;
                case 1:
                    c2="Azul";
                    
                    break;
                case 2:
                    c2="Verde";
                    
                    break;
                case 3:
                    c2="Amarillo";
                    
                    break;
                case 4:
                    c2="Violeta";
                    
                    break;
                case 5:
                    c2="Naranja";
                    
                    break;
                default:
                    break;
        }
        String c3 = "";
            switch (n3) {
                case 0:
                    c3="Rojo";
                    break;
                case 1:
                    c3="Azul";
                    
                    break;
                case 2:
                    c3="Verde";
                    
                    break;
                case 3:
                    c3="Amarillo";
                    
                    break;
                case 4:
                    c3="Violeta";
                    
                    break;
                case 5:
                    c3="Naranja";
                    
                    break;
                default:
                    break;
        }
        System.out.println(c1+", "+c2+", "+c3+".");
    }
}