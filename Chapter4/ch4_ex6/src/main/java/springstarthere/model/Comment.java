package springstarthere.model;

public class Comment {

    // instance variables
    private String text;
    private String author;

    // getter methods
    public String getAuthor() {
        return this.author;
    }

    public String getText() {
        return this.text;
    }

    // setter methods
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }
    
}
