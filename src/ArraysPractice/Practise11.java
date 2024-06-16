package ArraysPractice;

public class Practise11 {
    public static void main(String[] args) {
        /**
         *
         */
        int [] number = {1,2,3,4,6,7,8};
        int bucket = 0;
        // find missing number from sequence
        for (int i = 0; i < number.length; i++) {
          bucket+=number[i];

        } int newVar = 0;
        for (int i = 1; i <=8; i++) {
            newVar+=i;
        }
        System.out.println(newVar-bucket);
    }
}
