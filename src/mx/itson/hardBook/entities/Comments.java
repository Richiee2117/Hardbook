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
public class Comments {
    
    private String text;
    private int reactionPos;
    private int reactionNeg;
    private List <String> reply;   
    private Date date;
    private List <User> user;
    
    
    

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public List<String> getReply() {
        return reply;
    }

    public void setReply(List<String> reply) {
        this.reply = reply;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
