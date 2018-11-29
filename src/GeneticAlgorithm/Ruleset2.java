package GeneticAlgorithm;

import java.util.Scanner;
import static GeneticAlgorithm.GA.*;
/**
* Author: Youssef Eleshy
* Student ID: 16001495
* Module: UFCFY3-15-3 - Biocomputation 
 */
public class Ruleset2 {

    static Scanner rules = new Scanner(Ruleset1.class.getResourceAsStream("data2.txt"));
    static String DataString = ""; //Data1 as a long list of String
    static String set2 = "";

    static public void GettingRulesData2() {
        DataRule = new String[64];
        Condition = new String[64];
        Output = new String[64];
        //Reads the entire file, and removes any spaces
        for (int i = 0; i < 64; i++) {
            DataRule[i] = rules.nextLine().replaceAll("\\s+", ""); //Replaces spaces with nothing
        }
        //Joins all lines together to create one big string
        for (int j = 0; j < DataRule.length; j++) {
            DataString += DataRule[j];
        }
        //Takes every 6th bit and puts it into the array of Output1
        for (int k = 0; k < DataRule.length; k++) {
            Output[k] = String.valueOf(DataRule[k].charAt(6));
        }
        //Takes the first

        for (int l = 0; l < DataRule.length; l++) {
            set2 = "";
            for (int m = 0; m < 6; m++) {
                set2 += String.valueOf(DataRule[l].charAt(m));
                Condition[l] = set2;
            }

        }

    }


}
