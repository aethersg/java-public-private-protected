package world;

public class Oak
        extends Plant
    {

    public Oak()
        {
        // type is private as such cannot access
        //type = "true"

        // this works as size is a protected and oak is a sub class of plant.
        this.size = "large";

        // no access specifier works as both in the same package.
        this.height = 14;
        }

    }
