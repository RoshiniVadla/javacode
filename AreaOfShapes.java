package anudip;
//program for method overloading
public class AreaOfShapes {
	
	int side;
	int length;
	int breadth;
	float base;
	float height;
	int area(int side)//method for area of square
	{
		int area=side*side;
		return area;
	}
	int area(int length,int breadth)//method for area of rectangle
	{
		int area=length*breadth;
		return area;
	}
    float area( float base,float height )//method for area of triangle
    {
      float area=(base*height)/2;
       return area;
    }
	public static void main(String[] args) {
	AreaOfShapes aof=new AreaOfShapes();//creating object for class
	System.out.println("area of square is:"+aof.area(4));
	System.out.println("area of rectangle is:"+aof.area(20,15));
	System.out.println("area of triangle is:"+aof.area(5.3f,4.5f));
	

	}

}
