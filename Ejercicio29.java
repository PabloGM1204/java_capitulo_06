import java.util.Scanner;
public class Ejercicio29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Este programa te dice el tiempo que hara mañana");
        System.out.printf("\n 1. Primavera\n 2. Verano\n 3. Otoño\n 4. Invierno\n Seleccione la estación del año: ");
        int est = sc.nextInt();
        int tempMin = 0;
        int tempMax = 0;
        int max = 0;
        int min = 0;
        String tiempo = "";
        switch (est) {
            case 1:
                tempMin = 15;
                tempMax = 30;
                tiempo = (Math.random()) <= 0.6 ? "Soleado":"Nublado";
                break;
            case 2:
                tempMin = 25;
                tempMax = 45;
                tiempo = (Math.random()) <= 0.8 ? "Soleado":"Nublado";
                break;
            case 3:
                tempMin = 20;
                tempMax = 30;
                tiempo = (Math.random()) <= 0.4 ? "Soleado":"Nublado";
                break;
            case 4:
                tempMin = 0;
                tempMax = 25;
                tiempo = (Math.random()) <= 0.2 ? "Soleado":"Nublado";
                break;
            default:
                break;
        }
        max = (int)(Math.random()*(tempMax-tempMin)+tempMin);
        min = (int)(Math.random()*(tempMax-tempMin)+tempMin);
        System.out.printf("\n Prevision del tiempo para mañana \n --------------------------------");
        System.out.printf("\n Temperatura mínima: %2dºC",(min<max)?min:max);
        System.out.printf("\n Temperatura máxima: %2dºC",(max>min)?max:min);
        System.out.printf("\n %s",tiempo);
    }
}