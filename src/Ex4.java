public class Ex4 {
    public static void main(String[] args) {
        try {
            throw new SubException("LAAA");
        } catch (SubException e) {
            System.out.println("SubException executat");
        }
    }
}

class SubException extends Exception {
    String mm;

    SubException(String mm) {
        this.mm = mm;
        print();
    }

    public void print() {
        System.out.println(this.mm);
    }
}
