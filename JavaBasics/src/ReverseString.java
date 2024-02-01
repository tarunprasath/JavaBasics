public class ReverseString {
    public static void main(String[] args){
        String stringtorev = "Arun Prasath T", rstr="";
        char ch;

        int num = 2134;

        for (int i = 0;i < stringtorev.length();i++ ){
            ch = stringtorev.charAt(i);
            rstr = ch + rstr;
        }
        System.out.println(rstr);
    }
}
