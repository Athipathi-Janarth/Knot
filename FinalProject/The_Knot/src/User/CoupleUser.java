/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.util.Date;

/**
 *
 * @author vikashsingh
 */
public class CoupleUser {
    
//    private or public ??????
    int coupleUserID;
    String name; 
    String partnerName;
    String zodiacSign;
    String partnerZodiacSign;
    String userName;
    String password;
    Date weddingDate;

    public CoupleUser(String name, String partnerName, String zodiacSign, String partnerZodiacSign, String userName, String password, Date weddingDate) {
        this.name = name;
        this.partnerName = partnerName;
        this.zodiacSign = zodiacSign;
        this.partnerZodiacSign = partnerZodiacSign;
        this.userName = userName;
        this.password = password;
        this.weddingDate = weddingDate;
    }

    public int getCoupleUserID() {
        return coupleUserID;
    }

    public String getName() {
        return name;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public String getZodiacSign() {
        return zodiacSign;
    }

    public String getPartnerZodiacSign() {
        return partnerZodiacSign;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Date getWeddingDate() {
        return weddingDate;
    }
    
    
}
