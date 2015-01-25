
import world.Plant;
/*
private --- only within same class
public --- from anywhere
protected --- same class , subclass and same package
no modifier --- only same package
*/

public class Application
    {

    /**
     *
     * @param args
     */
    public static void main(String[] args)
        {
        Plant plant = new Plant();

        System.out.println(plant.name);

        System.out.println(plant.ID);
        // will not work as it is private
        // System.out.println(plant.type);

        // size is protected and as application is not in the same package it will not work.
        // System.out.println(plant.size);

        // this will not work as application and plant are in different packages.
        //System.out.println(plant.height);
        }
    }
