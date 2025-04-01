package com.github.matbishop333.javaoops.ZooEcosystem;

public class Registration {
   private String email;
   private String userName;
   private String password;

   public Registration(String email, String userName, String password){
       this.email = email;
       this.userName = userName;
       this.password = password;

       if(!email.contains("yahoo")){
           System.out.println("Error! Only Yahoo Domain Accepted.");
       }

       if(userName.length() < 7 || password.length() < 7){
           System.out.println("Error! Username and Password must be longer than 6 characters");
       }

       if(password.contains(userName)){
           System.out.println("Error! Password can not be the same as Username.");
       }
   }

    public void setEmail(String email) {
        if(!email.contains("yahoo")){
            System.out.println("Error! Only Yahoo Domain Accepted.");
        } else {
            this.email = email;
        }
    }

    public void setUserName(String userName) {
        if(userName.length() < 7){
            System.out.println("Error! Username must be longer than 6 characters.");
        } else {
            this.userName = userName;
        }
    }

    public void setPassword(String password) {
        if (password.length() < 7 || password.contains(userName)) {
            System.out.println("Error! Password must be longer than 6 characters and can not contain username.");
        } else {
            this.password = password;
        }
    }

    public static void main(String[] args) {
        Registration newUser = new Registration("Test","Test2", "Test3");
        Registration newUser2 = new Registration("Test","Test2", "Test3");
        newUser2.setEmail("Test@yahoo.com");
        newUser2.setPassword("test123456");
        newUser2.setUserName("Username123456");
        System.out.println(newUser2.email);
    }

}


