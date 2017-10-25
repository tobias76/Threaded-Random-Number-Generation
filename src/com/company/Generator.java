package com.company;

public class Generator
{
    public static void main(String[] args)
    {
        ProgramOne prog1 = new ProgramOne();
        ProgramTwo prog2 = new ProgramTwo();

        Thread threadOne = new Thread(prog1);
        Thread threadTwo = new Thread(prog2);

        threadOne.start();
        threadTwo.start();
    }
}
