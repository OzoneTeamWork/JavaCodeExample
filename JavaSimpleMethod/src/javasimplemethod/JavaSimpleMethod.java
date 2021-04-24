/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasimplemethod;

/**
 *
 * @author my
 */
public class JavaSimpleMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // usage of get sum of an integer
        int result = getSum(12345);
        System.out.println(result);
        
        // usage of get max number
        printMax(3, 99);
    }
    
    // get max number of tow integer
    public static void printMax(int a, int b){
        if(a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
    
    // get sum of an interger
    public static int getSum(int arg){
        int sum = 0;
        char[] items = (""+arg).toCharArray();
        for(char i : items){
            sum += Character.getNumericValue(i);
        }
        return sum;
    }
}
