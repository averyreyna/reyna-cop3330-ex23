/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String inputKey = input.nextLine();

        if (inputKey.equals("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            String inputBattery = input.nextLine();

            if (inputBattery.equals("y"))
            {
                System.out.print("Clean terminals and try starting again.");
                return;
            }
            else if (inputBattery.equals("n"))
            {
                System.out.print("Replace cables and try again.");
                return;
            }
        }
        else if (inputKey.equals("n"))
        {
            System.out.print("Does the car make a slicking noise? ");
            String inputSlicking = input.nextLine();

            if (inputSlicking.equals("y"))
            {
                System.out.print("Replace the battery.");
                return;
            }
            if (inputSlicking.equals("n"))
            {
                System.out.print("Does the car crank up but fail to start? ");
                String inputCrank = input.nextLine();

                if (inputCrank.equals("y"))
                {
                    System.out.print("Check spark plug connections.");
                    return;
                }
                else if (inputCrank.equals("n"))
                {
                    System.out.print("Does the engine start and then die? ");
                    String inputStart = input.nextLine();

                    if (inputStart.equals("y")) {
                        System.out.print("Does you car have fuel injection? ");
                        String inputInjection = input.nextLine();

                        if (inputInjection.equals("y"))
                        {
                            System.out.print("Get it in for service.");
                            return;
                        }
                        else if (inputInjection.equals("n"))
                        {
                            System.out.print("Check to ensure the choke is opening and closing.");
                            return;
                        }
                    }
                    else if (inputStart.equals("n"))
                    {
                        System.out.print("This should not be possible.");
                        return;
                    }
                }
            }
        }
    }
}
