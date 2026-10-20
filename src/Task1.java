import java.util.Scanner;

public class Task1 {
    public static String printStrip(int n) {
        String result = "";
        for (int i = 0; i<n; i++) {
            result += "#";
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(printStrip(15));
    }
}


