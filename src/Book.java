public class Book {

    private int id;
    private String title;
    private String author;
    private int publisherId;
    private String publicationDate;
    private boolean borrowed;

    public Book(int id, String title, String author,
                int publisherId, String publicationDate) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.publisherId = publisherId;
        this.publicationDate = publicationDate;
        this.borrowed = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisherId=" + publisherId +
                ", publicationDate='" + publicationDate + '\'' +
                ", borrowed=" + borrowed +
                '}';
    }
}

