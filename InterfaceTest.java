import java.util.*;

public class InterfaceTest {
 
    public static void main (String[] args) {
        
        // Create an SMS object with recipient and message content
        SMS message = new SMS ("Mark", "this message is just a test!");
        // message.read() will return the content of the message.
        System.out.println(message.read());
        System.out.println();
 
        
        // Create an ArrayList with SMS objects
        ArrayList<SMS> messages = new ArrayList<>();
        // Add a new object of type SMS to the messages ArrayList
        messages.add(new SMS("unknown number", "this message is TOP secret!"));
        
        // Read out the cotnent of the message Array
        for (SMS msg : messages) {
            System.out.println("Content: " + msg.read());
            System.out.println("Sender: " + msg.getSender());
        }
        System.out.println();
        
        // Create an Ebook object and add some text to the pages.      
        // First, we create the content of the Ebook
        ArrayList<String> pagesOfTheBook = new ArrayList<>();
        pagesOfTheBook.add("Abracadabra simsalabim!");
        pagesOfTheBook.add("Hocus Pocus!");
        pagesOfTheBook.add("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
        pagesOfTheBook.add("This is the last page in the book");
        
        //Instantiate the Ebook
        EBook book = new EBook ("Random bullshittery", pagesOfTheBook);
        
        System.out.println("Title of the book: " + book.getName());
        //Reading through the pages of the book
        //First check how many pages there are
        //Then read each page with the read() method
        //read() returns the content of the page
        int amountOfPages = book.howManyPages();
        System.out.println("The book has: " + amountOfPages + " pages.");
        
        for (int page = 0; page < amountOfPages; page++) {
            System.out.println(book.read());
            
        }
        
        
    }
}
