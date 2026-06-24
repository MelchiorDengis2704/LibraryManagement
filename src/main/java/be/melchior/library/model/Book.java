package be.melchior.library.model;

public class Book {

    private String title;
    private Category category;

    public Book(String title, Category category){
        if(title == null || title.isEmpty()){
            throw new IllegalArgumentException("The book can't have a empty title ");
        }
        this.title = title;
        this.category = category;
    }


    public String getTitle(){
        return this.title;
    }

    public Category getCategory(){
        return this.category;
    }

    @Override
    public String toString() {
        return
                        "Book title : " + this.title + "\n" +
                        "Book category : " + this.getCategory().getName() + "\n";
    }
}
