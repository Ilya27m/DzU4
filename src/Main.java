public class Main {
    public static void main(String[] args) {
        MyTreeSet s = new MyTreeSet();
        s.add(4);
        s.add(6);
        s.add(5);
        s.add(7);
        s.add(3);
        s.add(1);
        s.add(2);
        s.printTree();
        s.remove(4); // удаление корня
        s.printTree();
        s.remove(1); // удаление листьев
        s.remove(7);
        s.printTree();
        s.add(6); //добавление повторного элемента (элемент не добавляется)
    }
}