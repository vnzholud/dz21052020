package dz20052020;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class feller {
    private static Object dow;


    public static void main(String[] args) {

        String[][] arr = new String[4][4];


        try {
            arrInfo((String[][]) dow);
        } catch (Exception e) {

        } finally {
            System.out.println("Слишком большой массив");
        }

    }


    private static void arrInfo(String[][] arr) {

        Integer sumArr = 0;


        for (int i = 0; i < arr.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < arr[i].length; j++) {

                sumArr = sumArr + Integer.parseInt(arr[i][j]);

                System.out.print(arr[i][j]+" ");



            }

        }

        System.out.println("Тестируем репозиторий");



        System.out.println(sumArr);
    }


}











