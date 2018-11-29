package GeneticAlgorithm;
import static GeneticAlgorithm.Individual.*;
import static GeneticAlgorithm.GA.*;
/**
* Author: Youssef Eleshy
* Student ID: 16001495
* Module: UFCFY3-15-3 - Biocomputation 
 */
public class StringData {
    //Sets must be string for calc
    static String currentGenes = "";
    static String set = "";
    static String set1 = "";
    static String set2 = "";
    static String[] RandRule = new String[defaultGeneLength/RuleSet];
    static String[] OutputForRandom = new String[defaultGeneLength/RuleSet];
    static String[] ConditionForRandom = new String[defaultGeneLength/RuleSet];

    public static void ConvertingRandomStringToRules() {
        //Breaks the randomly genereated string in groups of 6 using modulus
        int k = 0;
        for (int i = 1; i < currentGenes.length() + 1; i++) {
            set += currentGenes.charAt(i - 1);
            int test = i % RuleSet;
            if (test == 0) {
                RandRule[k] = set;
                k++;
                set = "";
            }
        }

        //Gets the output (6th bit) for each rule of the randomly generated string
        for (int j = 0; j < RandRule.length; j++) {
            OutputForRandom[j] = String.valueOf(RandRule[j].charAt(RuleSet-1));
        }

        //Gets every 5 bits for the 6bit rules declared as "set"
        for (int l = 0; l < RandRule.length; l++) {
            set1 = "";
            for (int m = 0; m < RuleSet -1; m++) {

                set1 += String.valueOf(RandRule[l].charAt(m));
                ConditionForRandom[l] = set1;

            }

        }
    }
}
