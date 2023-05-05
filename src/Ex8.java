public class Ex8 {
    public static void main(String[] args) {
        try {
            MyClass.f();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("End");
        }
    }
}

class MyClass {
    static void f() throws Exception {
        try {
            g();
        } catch (Exception e) {
            throw new Exception("F-Exception");
        }
    }

    static void g() throws Exception {
        throw new Exception("G-Exception");
    }
}
