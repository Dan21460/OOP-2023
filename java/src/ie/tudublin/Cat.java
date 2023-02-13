package ie.tudublin;


public class Cat {

    String name;
    private int catlives = 9; 

    public void setName(String name)
	{
		this.name = name;
	}

    
    public void kill()
    {

        if (catlives > 0)
        {

            System.out.println(catlives--);

        }

        else
        {

            System.out.println("Dead");

        }

    }

}

