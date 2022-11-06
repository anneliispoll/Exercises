package OOP;

public class CallingBook {
    public static void main(String[] args) {

        //create book class object
        Book book1 = new Book();

        //setting field values
        book1.title = "Test";
        book1.author = "Test Author";
        book1.setNumberOfPages(160);


        book1.printBookInfo();

        //creating new instance of Book class
        Book book2 = new Book();
        book2.author = "Book 2 author";
        book2.title = "Book 2 title";
        book2.setNumberOfPages(200);

        book2.printBookInfo();
    }
}
