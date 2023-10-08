import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;



        productos[0] = "Kingston usb 32 gb";
        productos[1] = "Disco Duero Externo 1T";
        productos[2] = "Teclado logintech";
        productos[3] = "Web Cam usb";
        productos[4] = "Hub de usb";
        productos[5] = "Celular Redmi Note 12";
        productos[6] = "Acer TouchScreen";

        Arrays.sort(productos);
        System.out.println("=================Usando for=================");
        for (int i = 0; i < total; i++){
            System.out.println("para indice = " +  i + " : " + productos[i]);
        }
        System.out.println("=================Usando for each=================");
        for (String prod:productos){
            System.out.println("prod = " + prod);
        }
        System.out.println("=================Usando while=================");
        int i = 0;
        while ( i < total ){
            System.out.println("para indice = " +  i + " : " + productos[i]);
            i++;
        }
        System.out.println("=================Usando do while=================");
        int j = 0;
       do{
            System.out.println("para indice = " +  j + " : " + productos[j]);
            j++;
        } while ( j < total );

        int[] numeros = new int[10];

        int totalNum = numeros.length;

        for (int k = 0; k < totalNum; k++){
            System.out.println("totalNum = " + numeros[k]);
            numeros[k] = k*3;
        }

        for (int k = 0; k < totalNum; k++){
            System.out.println("totalNum = " + numeros[k]);
        }





    }
}
