package dz20052020;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Feller {

    public static void main(String[] args) {
    Integer size = 4;

        //Dow dow = new Dow();
        //arr = dow.addArr();
        String[][] arr = Dow.addArr();




        try {
            if (arr.length>size){
                throw new Exception("Массив больше");
            }
            arrInfo(arr);

        } catch (Exception e) {
            System.out.println("Вылезла ошибка: " + e.getMessage());
        }

    }


    private static void arrInfo(String[][] arr) {

        Integer sumArr = 0;


        for (int i = 0; i < arr.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < arr[i].length; j++) {

                sumArr = sumArr + Integer.parseInt(arr[i][j]);

                System.out.print(arr[i][j] + " ");


            }

        }

        System.out.println("");


        System.out.println(sumArr);
    }


}











