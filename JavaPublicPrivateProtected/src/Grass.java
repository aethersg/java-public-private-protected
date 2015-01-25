
import world.Plant;

public class Grass
        extends Plant
    {

    public Grass()
        {
        // this will not work as ---- Grass not in same package as plant even thought it is a sub class.
        //System.out.println(this.height);
        }

    }
