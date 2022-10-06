public class Linear_Search_Algorithm7 {
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    //Find Numbers with Even Number of Digits
    public static void main(String[] args) {
        int[] nums = {22,26366};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }


    static int digits(int num){
        if (num < 0){    // encase if the number is written in the array is in negative -1234 it won't show u number that is y ye how to make it positive
            num = num * -1;
        }

        if (num == 0){ // if inputted num is 0 it will show number count in zero but the zero also a 1 digit that is why we put return as 1
            return 1;
        }

        int number = 0;
        while (num > 0 ){
            number ++;
            num = num / 10;
        }
        return number;
    }
}
