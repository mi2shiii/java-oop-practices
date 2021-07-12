package composition;

public class TestClass {

    public static void main(String[] args) {
        var author = new Author("mohammad", "mhm.asheri@gmail.com", "male");
        System.out.println(author);
        author.setEmail("hadi.asheri@gmail.com");
        System.out.println(author);

        var book = new Book("beheshte gom shode",author, 1000,2);
        System.out.println(book);

        book.setPrice(2000);
        System.out.println(book);
        System.out.println(book.getQty());

        System.out.println("Author email is: " + book.getAuthor().getEmail());
    }
}
