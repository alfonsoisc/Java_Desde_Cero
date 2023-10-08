import java.util.Scanner;

public class ProgramaOrdenarArreglo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int i, arreglo[];
        arreglo = new int[10];
        for (i = 0; i < 10; i++){
            System.out.println("Inserte un numero");
            arreglo[i] = s.nextInt();
        }
        System.out.println("El resultado es: ");
        for (i = 0; i <=4; i++){
            System.out.println(arreglo[9-i]);
            System.out.println(arreglo[i]);
        }
    }
}
