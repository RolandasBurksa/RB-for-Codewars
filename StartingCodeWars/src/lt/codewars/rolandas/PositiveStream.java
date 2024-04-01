package lt.codewars.rolandas;

import java.util.Arrays;

public class PositiveStream {

    public static int sum(int[] arr){
        int sumNum = Arrays.stream(arr).sum();

        return sumNum;
    }
}
