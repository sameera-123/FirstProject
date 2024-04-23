package Practise;

public class Flower {

	//classes and objects
	
		// TODO Auto-generated method stub
		String colour;
		int size;
		String shape;
		
//Constructors
		
	public Flower(String colour, int size ,String shape) {
		this.colour=colour;
		this.size=size;
		this.shape=shape;
		
	}
     public void blossom() {
    	 System.out.println("flower is blossoming");
    	
    	}
     public static void main(String[]args) {
    	 Flower rose=new Flower("red",3,"small");
    	// rose.blossom();
    	 System.out.println(rose.colour);
    	 System.out.println(rose.size);
    	 System.out.println(rose.shape);
    	 rose.blossom();
   
   
     }
}