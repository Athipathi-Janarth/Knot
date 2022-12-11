/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import UserRequest.UserRequest;
import java.util.ArrayList;

/**
 *
 * @author vikashsingh
 */
public class SingleUser {
    
//    private or public ??????
    int singleUserID;
    String name;
    String gender;
    int age;
    String zodiacSign;
    String userName;
    String password;
    String hobbies;
//    how to change this to image datatype 
    String image;
    int preferredAge;
    String preferredGender;
    String preferredZodiac;
    String preferredHobbies;
    ArrayList<UserRequest> requests;

    public SingleUser(String name, String gender, int age, String zodiacSign, String userName, String password, String hobbies, String image, int preferredAge, String preferredGender, String preferredHobbies,String preferredZodiac) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.zodiacSign = zodiacSign;
        this.userName = userName;
        this.password = password;
        this.hobbies = hobbies;
        this.image = image;
        this.preferredAge = preferredAge;
        this.preferredGender = preferredGender;
        this.preferredHobbies = preferredHobbies;
        this.preferredZodiac=preferredZodiac;
        this.requests= new ArrayList();
    }

    public ArrayList<UserRequest> getRequests() {
        if(requests==null){
            requests=new ArrayList();
        }
        return requests;
    }

    public void setRequests(ArrayList<UserRequest> requests) {
        this.requests = requests;
    }

    public int getSingleUserID() {
        return singleUserID;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getZodiacSign() {
        return zodiacSign;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getImage() {
        return image;
    }

    public int getPreferredAge() {
        return preferredAge;
    }

    public String getPreferredGender() {
        return preferredGender;
    }

    public String getPreferredHobbies() {
        return preferredHobbies;
    }

    
    
}
