public class SMS implements Readable {
    
    // Attributes
    
    private String sender;
    private String content;

    // Constructors
    
    public SMS(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    //Accessors
    
    public String getSender() {
        return this.sender;
    }

    @Override   // Implemented from the Readble Interface
    public String read() {
        return this.content;
    }
}