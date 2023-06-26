public class Main {
    public static void main(String[] args) {
        MyTreeSet s = new MyTreeSet();
        s.add(4);
        s.add(6);
        s.add(8);
        s.add(3);
        s.add(9);
        s.add(1);
        s.add(2);
        s.printTree();
        s.remove(3);
        s.remove(4);
        s.remove(5);
        s.printTree();
    }
}