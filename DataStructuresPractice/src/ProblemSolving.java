import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ProblemSolving {

    /*get to number of pairs from an array whose sum would be given number, array numbers are distinct
    * array[] = {-2,5,7,11,-3,16,9,14,13,4,15,-1} sum = 13
    * */

    /*1 3 5 7*/
    /*logic:
    *
    * */

    //1st way
    public int getTwoNumbers(int[] array, int sum){
        int pairs = 0;
        for(int count=0; count<array.length;count++){
            /*search if we have (sum - number) in array
            * you have to keep track of the numbers that are matched
            *
            * e.g. 13-(-2) = 15, so 15 should not be considered again for a match
            * */
            int temp = sum - array[count];
            if(find(array, temp)) {
                System.out.println(temp + " " + array[count]);
                pairs++;
            }
        }
        return pairs/2;
    }

    private boolean find(int[] array, int num) {
        return Arrays.stream(array).anyMatch(n -> n==num);
    }

    /* array must be sorted
    *  array[] = {-3,-2,-1,4,5,7,9,11,13,14,15,16} sum = 13
    * */
    public int getTwoNumbers1(int[] array, int sum){
        int leadingPointer = 0;
        int trailingPointer = array.length-1;

        int pairs = 0;
        while(leadingPointer <= trailingPointer) {
            if(array[leadingPointer] + array[trailingPointer] == sum){
                System.out.println(array[leadingPointer] +" "+ array[trailingPointer]);
                pairs++;
                trailingPointer--;
                leadingPointer++;
            }
            else if(array[leadingPointer] + array[trailingPointer] > sum){
                trailingPointer--;
            }
            else{
                leadingPointer++;
            }
        }
        return pairs;
    }
}
