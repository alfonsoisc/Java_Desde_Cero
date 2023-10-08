import java.util.Scanner;

public class ImprimirNumeroMasAlto {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] arreglo = new int[10];

        int max =0;
        for (int i = 0; i < 7; i++){
            max = (max > arreglo[i])? max: arreglo[i];
        }
        System.out.println("el numero mas alto es: " + max);
    }
}
