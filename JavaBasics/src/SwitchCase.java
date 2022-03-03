public class SwitchCase {
    public static void main(String[] args) {
        int number  = 22;
        String length = null;
        switch (number){
            case 1:
                length = "too small";
                System.out.println("The number selected is 1");
                break;
            case 22:
                length = "medium";
                System.out.println("The number selected is 22");
                break;
            case 44:
                length = "big";
                System.out.println("The number selected is 44");
                break;
            default:
                System.out.println("Number doesn't match any of the cases");
        }
        System.out.println("The length selected is :"+length);
    }
}
