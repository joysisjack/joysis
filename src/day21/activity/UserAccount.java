
package day21.activity;

import java.util.Scanner;

public class UserAccount {
    private String firstName, middleName, lastName, email, password, address;
    
    public UserAccount(String firstName, String middleName, String lastName, String address, String email, String password){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.password = password;
        
        System.out.println("Account Created Successfully!");
    }
    
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAddress(){
        return address;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
        
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAddress(String address){
        this.address = address;
    }
    
}
