import java.util.Scanner;

public class EjemploArregloDesplazarPosicion2b {
    public static void main(String[] args) {

        int[] a = new int[10];
        int elemento, posicion, ultimo;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.println("Ingrese el Numero: ");
            a[i] = s.nextInt();
        }
        System.out.println();
        System.out.println("Nuevo elemento: ");
        elemento = s.nextInt();

        System.out.println("posicion para agreadar elemento (0 - 9)");
        posicion = s.nextInt();

        ultimo = a[a.length-1];
        for (int i = a.length -2; i >= posicion; i--){
            a[i-1] = a[i];
        }
        a[posicion] = elemento;
        System.out.println("El arreglo: ");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
