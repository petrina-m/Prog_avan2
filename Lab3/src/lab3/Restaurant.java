/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.time.LocalTime;

/**
 *
 * @author 40757
 */
public class Restaurant extends Location implements Visitable, Classifiable {
    private String name;
    private LocalTime openingTime, closingTime;
    private int rank;

    public Restaurant(String name) {
        super(name);
    }
    
    @Override
    public int getRank() {
        return rank;
    }
    public void setRank(int rank){
        this.rank=rank;
    }
    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }
}
