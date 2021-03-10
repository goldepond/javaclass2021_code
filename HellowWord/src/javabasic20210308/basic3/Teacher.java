package javabasic20210308.basic3;

public class Teacher extends Person
{
	String TeacherID;
	 String info() 
	{
			return "이름 : "+ name+ ", 나이 : "+ age +", 아이디 : "+TeacherID ;
	}
}
