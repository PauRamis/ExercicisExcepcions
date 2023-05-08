public class Ex13 {
    public static void main(String[] args) {
        System.out.println(exceptionFunction());
        //Encara que primer vengui el return, primer s'executa i es mostra per pantalla el finally.
    }

    private static String exceptionFunction() {
        try {
            throw new Exception("Exception");
        } catch (Exception e) {
            return "return";
        } finally {
            System.out.println("finally");
        }
    }
}
