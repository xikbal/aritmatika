/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmatika;

/**
 *
 * @author ASUS
 */
public class Kali extends Number implements Operation{

    @Override
    public float operate(int x, int y) {
    return x*y;
    }

    @Override
    public void display() {
        System.out.println("hasil "+operate(x, y));
    }
    
}
