public class Ex2 {
    public static void main(String[] args) {
        try {
            String a = "null";
            System.out.println(a.length());
        } catch (NullPointerException e) {
            System.out.println("Error: String Null");
        }
        System.out.println("AAA");
    }
}
