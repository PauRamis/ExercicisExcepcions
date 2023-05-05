import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        try {
            if (r == 1) throw new SubEx1();
            if (r == 2) throw new SubEx2();
            else throw new SubEx3();
        } catch (Exception e) {
            System.out.println("Exception");
            if (e instanceof SubEx1)
                System.out.println("Ex1");
            if (e instanceof SubEx2)
                System.out.println("Ex2");
            else System.out.println("Ex3");
        }
    }
}
class SubEx1 extends Exception {}
class SubEx2 extends Exception {}
class SubEx3 extends Exception {}

