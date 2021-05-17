package arrs;

import java.util.Scanner;

public class Reverse {
    public static  void  outPrint(){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();
        char[] out = new char[100];
        for (int i=arr.length-1; i>=0; i--){
//            System.out.println(arr[i]);
            out[arr.length-1-i] = arr[i];
        }
        //your code goes here
        System.out.println(out);


    }
}
