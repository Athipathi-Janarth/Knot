/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Order;

import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class DecorOrderDirectory extends OrderDirectory {
    private ArrayList<DecorOrder> decorOrderDirectory;

    public ArrayList<DecorOrder> getDecorOrderDirectory() {
        return decorOrderDirectory;
    }

    public void setDecorOrderDirectory(ArrayList<DecorOrder> decorOrderDirectory) {
        this.decorOrderDirectory = decorOrderDirectory;
    }

    public DecorOrderDirectory(ArrayList<DecorOrder> decorOrderDirectory, ArrayList<Order> orderDirectory) {
        super(orderDirectory);
        this.decorOrderDirectory = decorOrderDirectory;
    }
}
