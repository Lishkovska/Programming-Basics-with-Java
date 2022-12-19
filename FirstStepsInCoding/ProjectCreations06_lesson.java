package FirstStepsInCoding;

import java.util.Scanner;

public class ProjectCreations06_lesson {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine();
        int projects = Integer.parseInt( scanner.nextLine());
        int time = 3 * projects;
        System.out.print( "The architect" + " "+ name +" " +"will need "+ "" + time +" " +
                "hours to complete" + " "+
                projects +" " + "project/s.");
    }
}
