//In this program we use final keyword
//final is a keyword and is used to restrict the user
//here we are showing how the final keyword is assigned for class 
package keyword;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();//creating an object 
		Student1 student1=new Student1();
		
		student.display();//displaying the student value
		student1.display();
	}

}
//if I have taken Student class as final and that class cannot be extended
//another subclass because we declared it has final.
final class Student{//here the final keyword restrict to use other class. it means class can't 
//be extended. It can't take final class into subclass
	final int rollno=1274;
	//here we are taking rollno as 1274 and we are taking final 
	//even I tried to have a value of the rollno outside the final we 
	//can't change the value
	public final void display()
	{//we are using the display as final and the final variables will not change
	//and will have blank variables
		System.out.println("rollno of student:"+rollno);
	}
}
class Student1 extends Student
//here we are extending the final class we can assign them using constructor
{
	public void display()//displaying the values
	{
		System.out.println("print the rollno");
		//System is a final class in java.lang package
		//out is a static member field of system class and it's type PrintStream
		//println is a method of PrintStream class and it means print in next line
		//Inside the brackets is value which to be printed		
				

	}
}