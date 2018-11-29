package GeneticAlgorithm;

import java.util.Scanner;
import static GeneticAlgorithm.GA.*;

/**
* Author: Youssef Eleshy
* Student ID: 16001495
* Module: UFCFY3-15-3 - Biocomputation 
 */
public class Ruleset1 {
    //import
    static Scanner rules = new Scanner(Ruleset1.class.getResourceAsStream("data1.txt"));
    static String set2 = "";

    static public void GettingRulesData1() {
        DataRule = new String[32];
        Condition = new String[32];
        Output = new String[32];//32



        //Read the whole file
        for (int i = 0; i < 32; i++) { //read each line
            DataRule[i] = rules.nextLine().replaceAll("\\s+", ""); //Replaces spaces with nothing
        }
        //Join all lines together into one string
        for (int j = 0; j < DataRule.length; j++) {
            DataString += DataRule[j];
        }
        //Takes every 6th bit and puts it into the array of Output1
        for (int k = 0; k < DataRule.length; k++) {
            Output[k] = String.valueOf(DataRule[k].charAt(5));
        }
        //Takes the first

        for (int l = 0; l < DataRule.length; l++) {
            set2 = "";
            for (int m = 0; m < 5; m++) {
                set2 += String.valueOf(DataRule[l].charAt(m));
                Condition[l] = set2;
            }

        }

    }

}
