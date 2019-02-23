import java.util.Scanner ;
public class GradingDemo
{
	public static void main(String[] args)
	{
		Grading student_record = new Grading();
		student_record.setGrade() ;
		
		student_record.final_letter_grade();

		System.out.println(student_record.toString());


	}
}