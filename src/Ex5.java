public class Ex5 {
    public static void main(String[] args) {
        int[] ar = {0, 1, 2, 3, 4};
        int index = 10;
        while (index > 0) {
            try {
                System.out.println(ar[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posició inexistent: " + index);
            }
            index--;
        }
    }
}
