import java.util.Scanner ;
public class Grading
{
	//private double quiz, midterm, , quiz_grade;
	public double quiz1, quiz2, quiz3, midterm, finalexam, total ;
	public String final_letter_grade ;



	public double setGrade()
	{
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter a grade for quiz 1: ") ;
		quiz1 = input.nextDouble();
		System.out.println("Enter a grade for quiz 2: ") ;
		quiz2 = input.nextDouble();
		System.out.println("Enter a grade for quiz 3: ") ;
		quiz3 = input.nextDouble();
		System.out.println("Enter a grade for midterm: ") ;
		midterm = input.nextDouble();
		System.out.println("Enter a grade for final exam: ") ;
		finalexam = input.nextDouble();

		double get_quiz_grade = ((((quiz1+quiz2+quiz3)/3)*0.1)*25);
		double get_midterm_grade = ((midterm/100)*35) ;
		double get_finalexam_grade = ((finalexam/100)*40);
		total = (get_quiz_grade+get_midterm_grade+get_finalexam_grade) ;
		return total ;

	}
		

		public String toString()
		{
			return("STUDENT RECORD:\n"+"Quiz 1: "+quiz1+"\nQuiz 2: "+quiz2+"\nQuiz 3: "+quiz3+"\nMidterm: "+midterm+"\nFinal Exam: "+finalexam+"\nTotal Numerical Grade: "+total+"\nLetter Grade: "+final_letter_grade) ;
		}

		public String final_letter_grade()
		{
			if(total>=90)
			{	
				final_letter_grade = "A" ;
			}
			else if((total>=80))
			{	
				final_letter_grade = "B" ;
			}
			else if((total>=70))
			{
				final_letter_grade = "C" ;
			}
			else if((total>=60))
			{	
				final_letter_grade = "D" ;
			}
			else
			{
				final_letter_grade = "F" ;
			}

			return final_letter_grade;
		}
	}

