import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      int [] a = {1,532,124,534};
      int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if(min<a[i]){
                min = a[i];
            }
        }System.out.println(min);
    }
}