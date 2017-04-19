import java.util.*;

public class EBook implements Readable {
    
    // Attributes
    
    private String name;
    private ArrayList<String> pages;
    private int pageNumber;

    // Constructors
    
    public EBook(String name, ArrayList<String> pages) {
        this.name = name;
        this.pages = pages;
        this.pageNumber = 0;    // Default value in the constructor is 0.
    }

    // Accessors
    
    public String getName() {
        return this.name;
    }

    public int howManyPages() {
        return this.pages.size();
    }

    // Methods
    
    @Override
    public String read() {
        // This method gets the page in the Array and returns he content of the page
        String page = this.pages.get(this.pageNumber);  // read the contents of the page in the ArrayList
        nextPage();
        return page;
    }

    private void nextPage() {
        // This method turns the page in the Ebook
        this.pageNumber = this.pageNumber + 1;
        if(this.pageNumber % this.pages.size() == 0) {
            this.pageNumber = 0;
        }
    }
}