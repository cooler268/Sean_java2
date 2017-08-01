/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Scanner;
import java.util.Random;
public class App {
    
    public static void main(String[] args) {
        Market market = new Market();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hello, and welcome to the stock market thing.\n\n");
        
        
        System.out.println("do you want to use (1) buy (2) sell (3) see gains or (4) quit?\n"
                + "Enter an integer b/w 1 and 4");
        
        int choice = sc.nextInt();
        switch (choice) {
            case (1):
                break;
            case (2):
                break;
            case (3):
                break;
            case (4):
                break;
            
            
        }
    }
    
    public void buy () {
        
    }
    
}
