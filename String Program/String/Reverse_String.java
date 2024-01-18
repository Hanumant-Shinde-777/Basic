
public class Reverse_String {
    public static void reverse(String str) {
        // String output = "";
        // for (int i = str.length() - 1; i >= 0; i--) {
        //     output = output + str.charAt(i);
        // }
        // System.out.println(output);
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
            //using the string builder
            StringBuilder builder = new StringBuilder(str);
            builder.reverse();
            System.out.println(builder);
    }
    public static void main(String[] args) {
        String str = "Hello World";
        reverse(str);
        // System.out.println(str);
    }
}
