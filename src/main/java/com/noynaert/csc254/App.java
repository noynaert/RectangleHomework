package com.noynaert.csc254;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int MAX = 100;

    public static void main( String[] args )
    {
        Rectangle[] boxes = new Rectangle[MAX];
        int n = 0;

        n = readBoxes(boxes, "input.txt");

        print(boxes, n);

        System.out.println( "Programmed by YOUR NAME" );
    }

    private static int readBoxes(Rectangle[] boxes, String fileName) {
        int n = 0;
        try {
            Scanner input = new Scanner(new File(fileName));
            while(input.hasNextLine() && n < MAX){
                double length, width;
                String line = input.nextLine();
                String[] parts = line.split("\\s+");

                //Print the parts
                System.out.printf("%d parts found: ", parts.length);
                for(int i=0;i<parts.length;i++){
                    System.out.printf("%f ", Double.parseDouble(parts[i]));
                }
                System.out.println();

                //Create objects and put them in the array.
                //You may have to use all 3 of the constructors depending
                //    on the number of parts.  Use a SWITCH statement
                switch(parts.length){
                    case 0:
                        boxes[n] = new Rectangle();
                        n++;
                        break;
                    case 1:
                        boxes[n] = new Rectangle(Double.parseDouble(parts[0]));
                        n++;
                        break;
                    case 2:
                        boxes[n] = new Rectangle(Double.parseDouble(parts[0]),
                                                 Double.parseDouble(parts[1]));
                        n++;
                        break;
                    default:
                        System.out.printf("Invalid line. Parts = %d\n",parts.length);
                }


            }

            input.close();
        }catch(FileNotFoundException e){
            System.err.printf("File %s was not found\n",fileName);
            System.exit(1);

        }


        return n;
    }
    public static void print(Object[] things, int n){
        System.out.println("\n---------------------");
        for(int i=0;i<n;i++){
            System.out.printf("[%3d]   %s\n",i,things[i]);
        }
    }
}
