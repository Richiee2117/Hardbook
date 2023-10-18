/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.hardBook.ui;

import java.lang.ref.Reference;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.hardBook.entities.Category;
import mx.itson.hardBook.entities.Comments;
import mx.itson.hardBook.entities.Post;
import mx.itson.hardBook.entities.User;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
       
       
        
        User user1 = new User();
        user1.setNickname("Luis Miguel");
        user1.setEmail("Luismi.23@gmail.com");
        user1.setPassword("Eldiabloandasuelto");
        user1.setRole("Usuario");
        
        User user2 = new User();
        user2.setNickname("Juan Lopez");
        user2.setEmail("juanin.23@gmail.com");
        user2.setPassword("Eld");
        user2.setRole("Usuario");
        
        
        User user3 = new User();
        user3.setNickname("CarlosS");
        user3.setEmail("carlos.smith@example.com");
        user3.setPassword("StrongPass123");
        user3.setRole("Admin");

        User user4 = new User();
        user4.setNickname("LauraJ");
        user4.setEmail("laura.johnson@example.com");
        user4.setPassword("P@ssw0rd");
        user4.setRole("Usuario");

        User user5 = new User();
        user5.setNickname("PedroM");
        user5.setEmail("pedro.martinez@example.com");
        user5.setPassword("Secret1234");
        user5.setRole("Usuario");


        User user6 = new User();
        user6.setNickname("MariaG");
        user6.setEmail("maria.gomez@example.com");
        user6.setPassword("SecurePassword1");
        user6.setRole("Usuario");



                
        List<User> user = new ArrayList<>();
        user.add(user1);
        user.add(user2);
        user.add(user3);
        user.add(user4);
        user.add(user5);
        user.add(user6);
        
        
        
       Category category = new Category(); 
       category.setName("Informativo");
       
       
       List<String> reply = new ArrayList<>();
       reply.add(user.get(2).getNickname()+": "+"Nel no esta chido");
       reply.add(user.get(3).getNickname()+": "+"A mi me parece padre");
       reply.add(user.get(4).getNickname()+": "+"si a mi igual");
       reply.add(user.get(5).getNickname()+": "+"a mi equis");
         
         
         
         
       Comments comments = new Comments();
        comments.setDate(new Date());
        comments.setReactionNeg(10);
        comments.setReactionPos(11);
        comments.setText("Esta chido");
        comments.setUser(user);
        comments.setReply(reply);
        
        
        Post post = new Post();
        post.setCategory(category);
        post.setComments(comments);
        post.setDate(new Date());
        post.setTitle("Yo en la playa");
        post.setPicture("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtS4aEc8qA-KE6vXdxcXLTgnGTVoNXDK-dMA&usqp=CAU");
        post.setDescription("Fue un dia muy bonito ;)");
        post.setReactionNeg(10);
        post.setReactionPos(500);
        post.setUser(user);
        
        System.out.println("HARDBOOK.COM");
        System.out.println("----------------------------------------------------------");
        System.out.println("                                          "+post.getUser().get(0).getNickname());
        System.out.println(post.getTitle());
        System.out.println("");
        System.out.println(post.getDescription());
        System.out.println("                                          "+post.getCategory().getName());
        System.out.println(post.getPicture());
        System.out.println("");
        System.out.println("Reacciones negativas: "+post.getReactionNeg());
        System.out.println("Reacciones Positivas: "+post.getReactionPos());
        System.out.println("----------------------------------------------------------");
        System.out.println("COMMENTS");
        System.out.println("                                          "+post.getComments().getUser().get(1).getNickname());
        System.out.println(post.getComments().getText()); 
        System.out.println("");
        System.out.println("Reacciones Negativas: "+post.getComments().getReactionNeg());
        System.out.println("Reacciones Positivas: "+post.getComments().getReactionPos());
        System.out.println("----------------------------------------------------------");
        System.out.println("RESPUESTAS");
        System.out.println(post.getComments().getReply().get(0));
        System.out.println(post.getComments().getReply().get(1));
        System.out.println(post.getComments().getReply().get(2));
        System.out.println(post.getComments().getReply().get(3));
        
    
        
        
        
    }
    
}
