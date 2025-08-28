/* 
42. Armstrong Numbers Between 100–500
Scenario: Print all Armstrong numbers between 100 and 500. Output:
153
370
371
407



Code: 
*/


import java.util.*;
public class Q42_Armstrong100_500 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int num=100; num<=500; num++){

        int orignal = num;
        int sum = 0;
        int temp = orignal;
        while(temp > 0){
            int last = temp % 10;
            sum += Math.pow(last, 3);
            temp = temp/10;
        }
        if(orignal == sum){
            System.out.println(orignal);
        }
    }
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q42_Armstrong100_500.java
153
370
371
407

*/