package com.company;

import java.util.Random;

public class ProgramOne implements Runnable
{
    Random rand = new Random();

    public void displayInfo()
    {
         for (int i = 0; i < 30; i++)
         {
             System.out.println("I am program 1: " + rand.nextInt(100));
         }
    }

    @Override
    public void run()
    {
        displayInfo();
    }
}
