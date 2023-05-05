public class Ex9 {
    public static void main(String[] args) {
        try {
            MyOtherClass.f();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("End");
        }
    }
}

class MyOtherClass {
    static void f() {
        try {
            g();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    static void g() throws Exception {
        throw new Exception("G-Exception");
    }
}
