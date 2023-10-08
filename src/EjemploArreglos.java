import javax.swing.*;
import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "Kingston usb 32 gb";
        productos[1] = "Disco Duero Externo 1T";
        productos[2] = "Teclado logintech";
        productos[3] = "Web Cam usb";
        productos[4] = "Hub de usb";
        productos[5] = "Celular Redmi Note 12";
        productos[6] = "Acer TouchScreen";

        Arrays.sort(productos);

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);

        /*
        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = 23;
        numeros[2] = 21;
        numeros[3] = -1;

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length -1];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

         */


    }
}
