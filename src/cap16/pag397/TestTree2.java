package cap16.pag397;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTree2 {
    public static void main(String[] args) {
        new TestTree2().go();
    }

    private void go() {
        Book2 b1 = new Book2("How Cats Work");
        Book2 b2 = new Book2("Remix your Body");
        Book2 b3 = new Book2("Fiding Emo");
        BookCompare bCompare = new BookCompare();
        TreeSet<Book2> tree = new TreeSet<>(bCompare);
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}

class BookCompare implements Comparator<Book2>{
    public int compare(Book2 one, Book2 two) {
        return (one.title.compareTo(two.title));
    }
}

class Book2{
    String title;

    public Book2(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}