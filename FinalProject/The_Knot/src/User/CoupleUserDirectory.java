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
public class CoupleUserDirectory {
    
//    should we make it private
    ArrayList <CoupleUser>  coupleUserList;
    
    public CoupleUserDirectory() {
        coupleUserList = new ArrayList();
}
    public ArrayList<CoupleUser> getCoupleUserList(){
        return coupleUserList;
    }
    
    public CoupleUser authenticateUser(String username, String password){
        for (CoupleUser couple : coupleUserList)
            if (couple.getUserName().equals(username) && couple.getPassword().equals(password)){
                return couple;
            }
        return null;
    }
    

    
    public CoupleUser createUserAccount(CoupleUser userAccount){
        coupleUserList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (CoupleUser couple : coupleUserList){
            if (couple.getUserName().equals(username))
                return false;
        }
        return true;
    }
    
    
}
