package me.aboullaite.bookstore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @JsonIgnore
    String id = UUID.randomUUID().toString();

    String title, isbn;
    int price;

    private List<Author> authors;

    public Book(String title, String isbn,int price, List<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.authors = authors;
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
   public String getIsbn() {
        return isbn;
    }

    public int getPrice(){
        return price;
    }
//
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
//
//    public List<Author> getAuthors() {
//        return authors;
//    }
//
//    public void setAuthors(List<Author> authors) {
//        this.authors = authors;
//    }
}
