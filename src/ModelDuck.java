/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
public class ModelDuck extends Duck{
    
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    
    public void display(){
        System.out.println("Ik ben een modeleend.");
    }
}
