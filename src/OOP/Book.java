package OOP;

public class Book {

    //fields
    public String title;            //public fields
    public String author;           //public fields
    private int numberOfPages;      //private field

    //methods
    public void setNumberOfPages(int numberOfPages){
        if (isNumberOfPagesCorrect(numberOfPages)) {
            this.numberOfPages = numberOfPages;
        } else {
            System.out.println("The provided number of pages is incorrect " + numberOfPages);

        }
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    private boolean isNumberOfPagesCorrect(int numberOfPages){

        return numberOfPages > 10;
    }


    public void printBookInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " +  numberOfPages);
    }
}
