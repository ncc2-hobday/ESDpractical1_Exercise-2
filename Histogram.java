
package Exercise2;

import java.util.Scanner;
import java.io.*;

public class Histogram {
    
    public static void main(String[] args){        

        // Variable Declarations
        int[] grades = new int[100];
        int[] group = new int[10];
        int number = 0;
        int i = 0;
        
        // Get Data
        InputStream stream = Histogram.class.getResourceAsStream("grades.txt");     
        Scanner input = new Scanner(stream);
        
        // Store data in array
        while (input.hasNext()){
            number = input.nextInt();
            if (i < 100){
                grades[i] = number;
            }
            i++;            
        }
        
        // Classify numbers
        for (int j = 0; j < grades.length; j++){
            if (grades[j] <= 10){
                group[0]++;
            }
            else if (grades[j] > 10 && grades[j] <=20){
                group[1]++;
            }
            else if (grades[j] > 20 && grades[j] <=30){
                group[2]++;
            }
            else if (grades[j] > 30 && grades[j] <=40){
                group[3]++;
            }
            else if (grades[j] > 40 && grades[j] <=50){
                group[4]++;
            }
            else if (grades[j] > 50 && grades[j] <=60){
                group[5]++;
            }
            else if (grades[j] > 60 && grades[j] <=70){
                group[6]++;
            }
            else if (grades[j] > 70 && grades[j] <=80){
                group[7]++;
            }
            else if (grades[j] > 80 && grades[j] <=90){
                group[8]++;
            }
            else if (grades[j] > 90 && grades[j] <=100){
                group[9]++;
            }           
        }
        
        // Output Classified Data         
        i = 0;        
        System.out.print(" 1 - " + (i+1) + "0  |");
        for (int l = 0; l < group[0]; l++){
            System.out.print("*");
        }
        System.out.println();
        i++;
        for (int k = 1; k < 9; k++){
            System.out.print(k + "0" + " - " + (i+1) + "0  |");
            for (int l = 0; l < group[k]; l++){
                System.out.print("*");
            }
        System.out.println();
            i++;
        }   
        System.out.print("90 - " + (i+1) + "0 |");
        for (int l = 0; l < group[9]; l++){
            System.out.print("*");
        }
    }
}
