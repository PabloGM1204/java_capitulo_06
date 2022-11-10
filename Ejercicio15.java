public class Ejercicio15{
    public static void main(String[] args) {
        System.out.println("Este programa crea una melodia");
        int cont = 0;
        String nota = "";
        String primNot = "";
        int notas = 4 * (int)(Math.random() * 7 + 1);
        do{
            switch ((int)(Math.random()*7)+1) {
                case 1:
                    nota = "do ";
                    break;
                case 2:
                    nota = "re ";
                    break;
                case 3:
                    nota = "mi ";
                    break;
                case 4:
                    nota = "fa ";
                    break;
                case 5:
                    nota = "sol ";
                    break;
                case 6:
                    nota = "la ";
                    break;
                case 7:
                    nota = "si ";
                    break;
                default:
                    break;
            }
            cont ++;
            if(cont == 1){
                primNot = nota;
            }else if(cont == notas){
                nota = primNot;
            }
            System.out.print(nota + " ");
            if(cont == notas){
                System.out.print("||");
            }else if(cont % 4 == 0){
                System.out.print("| ");
            }
        }while(cont<notas);
    }
}