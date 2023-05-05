public class Ex3 {
    public static void main(String[] args) {
        try {
            int[] ar = new int[2];
            ar[4] = 4;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("La cassella seleccionada no existeix");
        }
    }
}
