package world;

public class Plant
    {
    //Bad practise
    public String name;
    //---- Acceptable practise as this is accessing a constant.
    public final static int ID = 8;

    private String type;

    protected String size;

    int height;

    public Plant()
        {
        this.name = "Freddy";
        this.type = "plant";

        this.size = "medium";
        this.height = 7;
        }

    }
