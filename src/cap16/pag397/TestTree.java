package cap16.pag397;

import java.util.TreeSet;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    private void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Fiding Emo");

        TreeSet<Book> tree = new TreeSet<>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}

class Book implements Comparable{
    String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Object b) {
        Book book = (Book) b;
        return (title.compareTo(book.title));
    }
}