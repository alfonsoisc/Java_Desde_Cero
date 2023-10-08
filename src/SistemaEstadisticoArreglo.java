import java.util.Scanner;

public class SistemaEstadisticoArreglo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int sumaPos, contPos, sumaNeg, contNeg, contCero, i, arreglo[];

        arreglo = new int[7];
        sumaPos =0;
        sumaNeg = 0;
        contPos = 0;
        contNeg = 0;
        contCero = 0;

        //leemos los datos del teclado
        for (i = 0; i < arreglo.length; i++){
            if (arreglo[i] == 0){
                contCero++;
            }else {
                if (arreglo[i]>0){
                    sumaPos = sumaPos + arreglo[i];
                    contPos++;
                }else {
                    sumaNeg = sumaNeg + arreglo[i];
                    contNeg++;
                }
            }
        }

        if (contPos == 0) {
            System.out.println("No se pudo calcular el promedio de números positivos");
        } else {
            System.out.println("El promedio de los positivos: " + (float) sumaPos / contPos);
        }

        if (contNeg == 0) {
            System.out.println("No se pudo realizar el promedio de números negativos");
        } else {
            System.out.println("El promedio de los negativos: " + (float) sumaNeg / contNeg);
        }

        System.out.println("La cantidad de cero es de: " + contCero);
    }
}
