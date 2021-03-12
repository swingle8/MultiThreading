/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Even extends Thread {
    int len = 0;
    Even (int n) {
        len = n;
    }
    public void run () {
        for (int i = 0 ; i < len ; i = i+2) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Odd extends Thread {
    int len = 0;
    Odd (int n) {
        len = n;
    }
    public void run () {
        for (int i = 1 ; i < len ; i = i+2) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    } 
    }


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Thread even = new Even(10);
		Thread odd = new Odd(10);
		even.start();
		try {
            Thread.sleep(10);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        odd.start();
	}
}
