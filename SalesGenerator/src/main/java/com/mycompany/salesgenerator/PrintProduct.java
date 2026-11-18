/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesgenerator;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
       

/**
 *
 * @author mac
 */
public class PrintProduct extends Product{
    
    
     JFrame frame = new JFrame("My First Gui");
     //frame.setSize(200,400);
       
    Scanner input = new Scanner(System.in);
    
  
    int M1,M2,M3;
    
    
    int[][]Months = {{1,2,3},
                    {1,2,3},
                    {1,2,3}};
           
    int totalProduct = M1+M2+M3;
    double avrProduct;
    String mostPopular;

  public static void numberSales(){
     System.out.println("Enter number of sales for month");
  }
  public int GetTotalProductSold(){
  
     return totalProduct;
  }
  
  public double GetAverageProductSold(){
  
      return avrProduct;
  }
  
  public String GetMostPopularProduct(){
      for(int i =0;i<3;i++){
        if(Months[i][i]>Months[i++][i++]){
           return "";
        }return"";
      
      }
     
    //return mostPopular;
         return "";
  
  
}
