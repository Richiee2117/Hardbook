/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.hardBook.entities;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class Post {
    
    private String title;
    private String description;
    private Date date;
    private String picture;
    private List<User> user;
    private Category category;
    private Comments comments;
    private int reactionPos;
    private int reactionNeg;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public int getReactionPos() {
        return reactionPos;
    }

    public void setReactionPos(int reactionPos) {
        this.reactionPos = reactionPos;
    }

    public int getReactionNeg() {
        return reactionNeg;
    }

    public void setReactionNeg(int reactionNeg) {
        this.reactionNeg = reactionNeg;
    }
   
    
   
    
    
    
    
}
