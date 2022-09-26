/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21array;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class JPTV21Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random random = new Random();
        int a = 101;
        int sum = 0;

        int[] nums = new int[a];
        for (int i = 0; i < nums.length; i++) {
            while(true){
                int rundNum = random.nextInt(100);
                if (rundNum % 2 != 0){
                    nums[i] = rundNum;
                    break;
                }
            }
        }
        Arrays.sort(nums);    
        for (int i = 1; i < nums.length; i++) {
            System.out.printf("%-4d", nums[i]);
            sum += nums[i];  
            if (i%10==0){
                System.out.println("");
            }      
        }
        System.out.println();
        System.out.println("Average number : " + sum/a);
    }
}
