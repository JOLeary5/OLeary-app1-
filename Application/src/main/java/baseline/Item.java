/*
 *  UCF COP3330 Summer 2021 baseline.Application Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.util.Scanner;

public class Item {

    String Title;
    String Description;
    String Date;
    Boolean Complete = false;

    public String editTitle()
    {
        Scanner scanR = new Scanner(System.in);
        System.out.println("Edit Title");
        String DueDateX =  scanR.nextLine();
        return DueDateX;
    }

    public String editDescription()
    {
        Scanner scanR = new Scanner(System.in);
        System.out.println("Please enter an Item Description");
        String DescriptionX = scanR.nextLine();
        return DescriptionX;
    }


    public String editDate()
    {
        Scanner scanR = new Scanner(System.in);
        System.out.println("Edit Due-Date");
        String DueDateX =  scanR.nextLine();
        return DueDateX;
    }


    public boolean CheckComplete()
    {
        return true;
    }
    public boolean CheckIncomplete()
    {
        return false;
    }

}
