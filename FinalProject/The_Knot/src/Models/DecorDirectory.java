/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Models.Organization.Decor;
import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class DecorDirectory {
    private ArrayList<Decor> decorDirectory = new ArrayList<>();

    public ArrayList<Decor> getDecorDirectory() {
        return decorDirectory;
    }

    public DecorDirectory() {
    }

    public void setDecorDirectory(ArrayList<Decor> decorDirectory) {
        this.decorDirectory = decorDirectory;
    }
}
