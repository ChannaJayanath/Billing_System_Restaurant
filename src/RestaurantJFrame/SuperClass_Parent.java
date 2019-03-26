/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RestaurantJFrame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Channa Jayanath
 */
public class SuperClass_Parent {
    
    public double ChickenRice;
    public double EggRice;
    public double FishRice;
    public double Biriyani;
    public double Noodles;
    
    public double MilkShake;
    public double Cocacola;
    public double EGB;
    public double Water;
    public double Vanila;
    
    public double Meals;
    public double Drinks;
    public double TotalOfMD;
    
    public double AllTotalOfMD;
    
    
    public double GetAmount(){
        
        Meals= ChickenRice+EggRice+FishRice+Biriyani+Noodles;
        Drinks= MilkShake+Cocacola+EGB+Water+Vanila;
        TotalOfMD=Meals+Drinks;
        AllTotalOfMD= TotalOfMD;
        
        return AllTotalOfMD;
        
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame= new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Restaurant Management Systems",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    public double pChickenRice = 150;
    public double pEggRice = 120;
    public double pFishRice = 130;
    public double pBiriyani = 200;
    public double pNoodles = 110;
    
    public double pMilkShake = 70;
    public double pCocacola =45;
    public double pEGB = 40;
    public double pWater = 35;
    public double pVanila = 50;
    
    public double mcTax= 0.90;
    
    public double cFindTax(double cAmount){
        
        double FindTax= cAmount - (cAmount * mcTax);
        return FindTax;
        
    }
    
    
    
    
}
    

