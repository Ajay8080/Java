class Book{
    private String author;
    private String title;

    Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    public String toString(){
        return "Title: "+title+"\nAuthor: "+author;
    }
}