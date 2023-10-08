import java.util.Arrays;

public class EjemploArreglosForInversa {
    public static void main(String[] args) {

        //String[] productos = new String[7];
        String[] productos = {"Kingston usb 32 gb","Disco Duero Externo 1T","Teclado logintech",
                "Web Cam usb","Hub de usb","Celular Redmi Note 12","Acer TouchScreen"};
        int total = productos.length;


/*
        productos[0] = "Kingston usb 32 gb";
        productos[1] = "Disco Duero Externo 1T";
        productos[2] = "Teclado logintech";
        productos[3] = "Web Cam usb";
        productos[4] = "Hub de usb";
        productos[5] = "Celular Redmi Note 12";
        productos[6] = "Acer TouchScreen";
*/
        Arrays.sort(productos);
        System.out.println("=================Usando for=================");
        for (int i = 0; i < total; i++){
            System.out.println("para indice = " +  i + " : " + productos[i]);
        }
        System.out.println("=================Usando for inverso=================");
        for (int i = 0; i < total; i++){
            System.out.println("para indice = " +  (total -1-i) + " : " + productos[total -1-i]);
        }
        System.out.println("=================Usando for inverso 2=================");
        for (int i = total -1; i >= 0; i--){
            System.out.println("para indice = " +  i + " : " + productos[i]);
        }






    }
}
