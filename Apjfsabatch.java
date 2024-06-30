package anudip;

public class Apjfsabatch {

	public static void main(String[] args) {
		Studentt[] students=new Studentt[5];
		students[0]=new Studentt(1,"ram",20);
		students[1]=new Studentt(2,"bheem",23);
		students[2]=new Studentt(3,"gokul",21);
		students[3]=new Studentt(4,"jai",22);
		students[4]=new Studentt(5,"sri",20);
		int i;
		for(i=0;i<5;i++) {
			System.out.println(students[i]);
		}
		for(Studentt s:students)
			System.out.println(s);
		
	}

}
