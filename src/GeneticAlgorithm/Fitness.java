package GeneticAlgorithm;

import static GeneticAlgorithm.Individual.*;
import static GeneticAlgorithm.StringData.*;
import static GeneticAlgorithm.GA.*;

/**
* Author: Youssef Eleshy
* Student ID: 16001495
* Module: UFCFY3-15-3 - Biocomputation 
 */
public class Fitness {
    static byte[] solution = new byte[defaultGeneLength];
    static boolean passed;
    static boolean OutputMatched = false;

    // Set solution as a byte array; toby remember to keep/do not remove break or higher
    public static void setSolution(byte[] newSolution) {
        solution = newSolution;
    }

    // To make it easier we can use this method to set our candidate solution
    // with string of 0s and 1s
    static void setSolution(String newSolution) {
        solution = new byte[newSolution.length()];
        //toby loop through each character of our string and save it in our byte array
        for (int i = 0; i < newSolution.length(); i++) {
            String character = newSolution.substring(i, i + 1);
            if (character.contains("0") || character.contains("1")) {
                solution[i] = Byte.parseByte(character);
            } else {
                solution[i] = 0;
            }
        }
    }

    static int getTheFitness(Individual individual) {
        int fitness = 0;

        currentGenes = individual.toString();
        ConvertingRandomStringToRules();

        for (int k = 0; k < Condition.length; k++) { //k = 32
            for (int j = 0; j < ConditionForRandom.length; j++) { //j = 10 = rules
                passed = true;

                for (int i = 0; i < ConditionForRandom[i].length(); i++) {
                    if (passed == true) {
                        if (Condition[k].charAt(i) != ConditionForRandom[j].charAt(i)) {
                            if (ConditionForRandom[j].charAt(i) != '2') {
                                passed = false;
                            }
                        }
                    }
                }
                if (passed == true) {
                    if (Output[k].equals(OutputForRandom[j])) {
                        fitness++;
                    }
                   // OutputMatched = true;
                    break;

                }
                   // break;
            }
                }
        //}
        return fitness;
    }

    static int getMaxFitness() {
        int maxFitness = Condition.length; //Sets the max fitness
        return maxFitness;
    }

}
