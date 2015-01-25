package world;


public class Field
    {
    private Plant plant = new Plant();

    public Field()
        {
        //size is protected but as field is in the same package it will work.
            System.out.println("plant.size");
        }
    }
