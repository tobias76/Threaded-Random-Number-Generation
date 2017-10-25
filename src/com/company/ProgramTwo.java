package com.company;

import java.util.Random;

public class ProgramTwo implements Runnable
{
    Random rnd = new Random();

    public void displayInfo()
    {
        for(int i = 0; i < 20; i++)
        {
            System.out.println("I am Program 2: " + rnd.nextInt(40));
        }
    }

    @Override
    public void run()
    {
        displayInfo();
    }
}
