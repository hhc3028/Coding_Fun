package com.matrix.amazon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void readFile(String filename, int n)
    {
        char[][] value = new char[n][n];

        try {
            // Read in text file
            Scanner sc = new Scanner(new File(filename));

            // Iterate through file
            while (sc.hasNext() )
            {
                for(int col=0; col < n; col++)
                {
                    for(int row=0; row < n; row++ )
                    {
//                        value[col][row] = sc.;
                    }
                }

//                System.out.println(sc.next());
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void Neo(int n)
    {
        switch (n){
            case 1:
                System.out.println("This is already done");
                break;
            case 2:
                readFile("2x2.txt", n);
                break;
            case 3:
                readFile("3x3.txt", n);
                break;
            case 4:
                readFile("4x4.txt", n);
                break;
            case 5:
                readFile("5x5.txt", n);
                break;
            default:
                System.out.println("Dpnt have it bro!");
                break;

        }




    }

    public static void main(String[] args) {

    }

}
