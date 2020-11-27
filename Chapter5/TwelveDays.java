/**
 * TwelveDays
 */

 /*
 On the first day of Christmas my true love sent to me
A partridge in a pear tree

[ 2]
On the second day of Christmas my true love sent to me
Two turtle doves, and
A partridge in a pear tree

[ 3]
On the third day of Christmas my true love sent to me
Three french hens
Two turtle doves, and
A partridge in a pear tree

[ 4]
On the fourth day of Christmas my true love sent to me
Four calling birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[ 5]
On the fifth day of Christmas my true love sent to me
Five golden rings
Four calling birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[ 6]
On the sixth day of Christmas my true love sent to me
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[ 7]
On the seventh day of Christmas my true love sent to me
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[ 8]
On the eighth day of Christmas my true love sent to me
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[ 9]
On the ninth day of Christmas my true love sent to me
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[ 10]
On the 10th day of Christmas my true love sent to me
10 lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves, and
A partridge in a pear tree
 */
import java.util.Scanner;


public class TwelveDays {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter which day of the song you want to display: ");
        byte day = input.nextByte();

        System.out.println("On the " + day + "th day of Christmas my true love sent to me");
        
        switch (day) {
        
            case 12:
                System.out.println("12 drummers drumming");

            case 11:
                System.out.println("11 pipers piping");
            
            case 10:
                System.out.println("10 lords a-leaping");
            
            case 9:
                System.out.println("Nine ladies dancing");
            
            case 8:
                System.out.println("Eight maids a-milking");

            case 7:
                System.out.println("Seven swans a-swimming");

            case 6:
                System.out.println("Six geese a-laying");

            case 5:
                System.out.println("Five golden rings");
                
            case 4:
                System.out.println("Four calling birds");

            case 3:
                System.out.println("Three french hens");
            
            case 2:
                System.out.println("Two turtle doves, and");   

            case 1:
                System.out.println("A partridge in a pear tree");
            break;
        
            default:
            break;
        }
    }
}