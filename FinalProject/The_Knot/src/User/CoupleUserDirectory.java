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
    

    
    public CoupleUser createUserAccount(String name, String partnerName, String zodiacSign, String partnerZodiacSign, String userName, String password, Date weddingDate){
        CoupleUser userAccount = new CoupleUser(name, partnerName, zodiacSign, partnerZodiacSign, userName, password, weddingDate);
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
//    public UserAccountDirectory() {
//        userAccountList = new ArrayList();
//    }
//
//    public ArrayList<UserAccount> getUserAccountList() {
//        return userAccountList;
//    }
//    
//    public UserAccount authenticateUser(String username, String password){
//        for (UserAccount ua : userAccountList)
//            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
//                return ua;
//            }
//        return null;
//    }
//    
//    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
//        UserAccount userAccount = new UserAccount();
//        userAccount.setUsername(username);
//        userAccount.setPassword(password);
//        userAccount.setEmployee(employee);
//        userAccount.setRole(role);
//        userAccountList.add(userAccount);
//        return userAccount;
//    }
//    
//    public boolean checkIfUsernameIsUnique(String username){
//        for (UserAccount ua : userAccountList){
//            if (ua.getUsername().equals(username))
//                return false;
//        }
//        return true;
//    }