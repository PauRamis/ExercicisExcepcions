public class Ex1 {
    public static void main(String[] args) {
        try {
            throw new Exception("Missatge");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program end");
        }
    }
}
