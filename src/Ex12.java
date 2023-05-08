public class Ex12 {
    public static void main(String[] args) {
        try {
            try {
                throw new Exception(); //Faltava ';'
            } catch (Exception e) {} //Faltava '{}'
            finally {
//...
            }
        } catch (Exception e) { //Faltava completar '(Exception e)'
//...
        } finally {
//...
        }
    }
}
//El programa no fá res, pero ara s'executa.