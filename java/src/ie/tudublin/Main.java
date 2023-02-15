package ie.tudublin;

public class Main
{

	public static void HelloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }

	public static void main(String[] args)
	{
		System.out.println("Hello world");
		
		Dog penny = new Dog();
		penny.setName("Penny");
		penny.speak();

		HelloProcessing();
        /* 
		Cat ginger = new Cat();
		ginger.setName("Ginger");
		ginger.kill();
		*/
	}
	
}