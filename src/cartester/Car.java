/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

/**
 *
 * @author luoos2514
 */
public class Car {
    private String make, model, engineType;
    //private int year;
    private double price, engineHP, year, randomEngine;
    
    
    public Car(){
        make = "Clarkson";
        model = "P45";
        year = 2012;
        price = 28.39;
        engineType = "Hybrid";
        engineHP = 4.2;
    }
    
    public Car(String carMake, String carModel){
        make = carMake;
        model = carModel;
        year = Math.random() * 999999 + 1;
        price = Math.random() * 999999999;
        
        randomEngine = Math.random() * 3;
        if (randomEngine <= 1) {
            engineType = "Thomas the tank engine";
        }
        
        else if (randomEngine <= 2) {
            engineType = "Siege engine";
        }
        
        else {
            engineType = "Source engine";
        }
        
        //engineHP = "at least 1";
    }
    
    public Car(String carEngine, double carHP){
        
    }
    
    public Car(String carMake, String carModel, String carEngine, int carYear, int carHP){
        
    }
}
