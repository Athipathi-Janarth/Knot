/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vikashsingh
 */
public class SingleUserDirectory {
    
//    should we make it private
    ArrayList <SingleUser>  singleUserList;
    
    public SingleUserDirectory() {
        singleUserList = new ArrayList();
}
    public ArrayList<SingleUser> getSingleUserList(){
        return singleUserList;
    }
    
    public SingleUser authenticateUser(String username, String password){
        for (SingleUser single : singleUserList)
            if (single.getUserName().equals(username) && single.getPassword().equals(password)){
                return single;
            }
        return null;
    }
    
//public CoupleUser(String name, String partnerName, String zodiacSign, String partnerZodiacSign, String userName, String password, Date weddingDate) {
// check if this is correct     
    
    public SingleUser createUserAccount(String name, String gender, int age, String zodiacSign, String userName, String password, String hobbies, String image, int preferredAge, String preferredGender, String preferredHobbies){
        SingleUser userAccount = new SingleUser(name, gender, age, zodiacSign, userName, password, hobbies, image, preferredAge, preferredGender, preferredHobbies);
        singleUserList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (SingleUser single : singleUserList){
            if (single.getUserName().equals(username))
                return false;
        }
        return true;
    }
    
    
}
