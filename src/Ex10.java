public class Ex10 {
    static class CaixaIsFullException extends Exception {}
    public static void main(String[] args) {
        Caixa5 caixa5 = new Caixa5();
        try {
            caixa5.add(1);
            caixa5.add(1);
            caixa5.add(1);
            caixa5.add(1);
            caixa5.add(1);
            caixa5.add(1);

        } catch (CaixaIsFullException e) {
            System.out.println("ERR");
        }
    }
}

class Caixa5 {
    private int[] ar = new int[5];
    private int index = 0;

    public void add(int n) throws Ex10.CaixaIsFullException {
        if (index == 5) throw new Ex10.CaixaIsFullException();
        ar[index] = n;
        index++;
    }
}