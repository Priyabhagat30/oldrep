package day2;
import java.lang.*;
public class QuestionPractise extends demo {
	
		public QuestionPractise(String name, int num) {
		super(name, num);
		int m;
	// TODO Auto-generated constructor stub
  }
	

	public void display() throws ArithmeticException {
		throw new ArithmeticException("Exception is thrown ");
		
	
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		demo d=new demo("Priya",89);
		d.display();
		QuestionPractise p=new QuestionPractise("priya",98);
         p.display();
         p.play();
	}

}
