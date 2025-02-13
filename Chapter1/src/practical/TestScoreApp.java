/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TARUC
 */
public class TestScoreApp {
    private List<Integer> scoreList = new ArrayList<>();
    
    public void inputScore(){
        Scanner sc = new Scanner(System.in);
        int inputScore = -1;
        
        do{
            System.out.print("Enter Score or Enter -1 to exit:");
            inputScore = sc.nextInt();
            
            if(inputScore >-1 && inputScore<=100 ){
                scoreList.add(inputScore);
            }else if(inputScore >100){
                  System.out.println("Invalid Socre");
            }
        }while(inputScore >=0);
        
        
    }
    
    public void displayScore(){
        System.out.println("\nScore:");
        if(scoreList.size()<1){
            System.out.println("Empty Score List");
            return;
        }
        for (int i = 0; i < scoreList.size(); i++) {
            System.out.println(scoreList.get(i));
        }
    }
    public int findLower(){
        int min = scoreList.get(0);
        for (int i = 0; i < scoreList.size(); i++) {
            if(scoreList.get(i)<min){
                min = scoreList.get(i);
            }
            
        }
        return min;
    }
    
    public int fingHigher(){
        int max = scoreList.get(0);
        for (int i = 0; i < scoreList.size(); i++) {
            if(scoreList.get(i)>max){
                max = scoreList.get(i);
            }
            
        }
        return max;
    }
    
    public double computeAverage(){
        int sum =0;
        int i;
        for (i =0; i < scoreList.size(); i++) {
            sum += scoreList.get(i);
        }
        return sum/i;
    }
    
    public static void main(String[] args){
        int input =-1;
        Scanner sc = new Scanner(System.in);
        TestScoreApp app = new TestScoreApp();
        do{
            System.out.println("TestScoreApp");
            System.out.println("1. Add the test scores");
            System.out.println("2. Display all the test scores");
            System.out.println("3. Find and display the lowest score");
            System.out.println("4. Find and display the highest score in the list.");
            System.out.println("5. display the average of the scores in the list.");
            
            System.out.print("Enter number(-1~5):");
            input = sc.nextInt();
            switch(input){
                case 1:
                    app.inputScore();
                    break;
                case 2:
                    app.displayScore();
                case 3:
                    app.findLower();
                    break;
                case 4:
                    app.fingHigher();
                    break;
                case 5:
                    app.displayScore();
                case -1:
                    break;
                default:
                    System.out.println("Invalid input");
            }           
        }while(input >0);
    }
}
