public class ReverseNum {

            public static void main(String[] args){

            int num = 87654321, r = 0;

            System.out.println("Original Number: " + num);

            // run loop until num becomes 0
            while(num != 0) {

                // get last digit from num
                int digit = num % 10;
                r = r * 10 + digit;

                // remove the last digit from num
                num = num/10;
            }
            System.out.println("Reversed Number: " + r);
        }
    }
