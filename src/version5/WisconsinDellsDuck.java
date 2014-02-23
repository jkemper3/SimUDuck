/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package version5;

/**
 *
 * @author Justin
 */
public class WisconsinDellsDuck implements Duck,DriveStrategy{

    private DriveStrategy DriveStrategy;

    public WisconsinDellsDuck(DriveStrategy DriveStrategy) {
        this.DriveStrategy = DriveStrategy;
    }

    public DriveStrategy getDriveStategy() {
        return DriveStrategy;
    }

    public void setDriveStategy(DriveStrategy DriveStrategy) {
        this.DriveStrategy = DriveStrategy;
    }
    
    @Override
    public void display() {
        System.out.println("I am a WIsconsin Dells Duck");
    }

    @Override
    public void smiw() {
        System.out.println("I am a boat I  can swim");
    }

    @Override
    public void drive() {
     DriveStrategy.drive();
    }
    
}
