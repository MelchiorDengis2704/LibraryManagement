package be.melchior.library.model;

public class Category {

    private String name;


    public Category(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("A category can't have a empty name ");
        }this.name = name;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
