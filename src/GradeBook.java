import java.util.Scanner;
public class GradeBook {

	public static void main(String[] args) 
	{
	String Name[] = new String[100];
	String Grade[]=new String[100];
	String Gender[]=new String[100];
	String Major[]=new String[100];
	String State[]=new String[100];
	double Score[]=new double[100];
	
	int counter=1;
	double tempTotal=0;
	double maleTotal=0;
	double femaleTotal=0;
	double avg=0;
	double avgMale=0;
	double avgFemale=0;
	double econTotal=0;
	double compTotal=0;
	double eeTotal=0;
	double avgEcon=0;
	double avgEE=0;
	double avgComp=0;
	double mdTotal=0;
	double vaTotal=0;
	double dcTotal=0;
	double avgMD=0;
	double avgVA=0;
	double avgDC=0;
	
	Scanner keyboard = new Scanner(System.in);
		for (int i = 1; i<100; i++)
		{
			System.out.println("Enter the name of the student");
			Name[i]= keyboard.nextLine();
			System.out.println("Enter the grade of the student");
			Grade[i]= keyboard.nextLine();
			System.out.println("Enter the gender of the student. \"m\" or \"f\"");
			Gender[i]= keyboard.nextLine();
			System.out.println("Enter the major of the student");
			Major[i]= keyboard.nextLine();
			System.out.println("Enter the state of the student");
			State[i]= keyboard.nextLine();
			System.out.println("Enter the score of the student");
			Score[i]= keyboard.nextDouble();
			tempTotal = tempTotal + Score[i];
			
			keyboard.nextLine();
			System.out.println("Would you like to enter a new data - \" YES \" or \" NO \"");
			String ans=keyboard.nextLine();
	
			if(ans.equals("NO"))
				break;
			
			if(Name[i]!=null)
				counter++;
			
			//Checking for Gender
			
			if(Gender[i].equals("m"))
			{
				maleTotal = maleTotal + Score[i];
			}
			else if(Gender[i].equals("f"))
			{
				femaleTotal = femaleTotal +Score[i];
			}
			//Checking for Major
			
			if(Major[i].equals("Econ"))
			{
				econTotal = econTotal + Score[i];
			}
			else if(Major[i].equals("CompSci"))
			{
				compTotal = compTotal + Score[i];
			}
			else if(Major[i].equals("eeTotal"))
				eeTotal = eeTotal+Score[i];
			
			
			if(Major[i].equals("Econ"))
			{
				econTotal = econTotal + Score[i];
			}
			else if(Major[i].equals("CompSci"))
			{
				compTotal = compTotal + Score[i];
			}
			else if(Major[i].equals("eeTotal"))
				eeTotal = eeTotal+Score[i];
			
			//Checking for state avg
			
			if(State[i].equals("MD"))
			{
				mdTotal = mdTotal + Score[i];
			}
			else if(State[i].equals("VA"))
			{
				vaTotal = vaTotal + Score[i];
			}
			else if(State[i].equals("DC"))
				dcTotal = dcTotal+Score[i];
			
		}
		avg = tempTotal/counter;
		avgMale = maleTotal/counter;
		avgFemale = femaleTotal/counter;
		avgEcon=econTotal/counter;
		avgComp=compTotal/counter;
		avgEE=eeTotal/counter;
		avgMD=mdTotal/counter;
		avgVA=vaTotal/counter;
		avgDC=dcTotal/counter;
		System.out.println("Number of Students are   :" +counter);
		System.out.println("The overall average is    " +avg);
		System.out.println("The overall male average is    " +avgMale);
		System.out.println("The overall female average is    " +avgFemale);
		System.out.println("The overall econ average is    " +avgEcon);
		System.out.println("The overall comp sci average is    " +avgComp);
		System.out.println("The overall EE average is    " +avgEE);
		System.out.println("The overall Maryland average is    " +avgMD);
		System.out.println("The overall Virginia average is    " +avgVA);
		System.out.println("The overall DC average is    " +avgDC);

	keyboard.close();
	}
	}


