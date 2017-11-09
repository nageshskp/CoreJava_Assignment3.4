import java.util.Scanner; 
 class StudentDetails {

	private String name="Soma";
	private int phone_number, roll_number, class_section;
	
	public String getname()
	{return name;}
	
	public int getphone_number()
	{return phone_number;}
	public int getroll_number()
	{return roll_number;}
	public int getclass_section()
	{return class_section;}
	
	
	public void setname(String newname) {
	name = newname;}
	public void setphone_number(int newphone_number) {
		phone_number = newphone_number;}
	public void setroll_number(int newroll_number) {
		roll_number = newroll_number;}
	public void setclass_section(int newclass_section) {
		class_section = newclass_section;}


}
public class StudentAssgmt {

	   public static void main(String args[]) {
	      StudentDetails encap = new StudentDetails();
	      int Ph,Rn, Cs;
	      String Nm;
	      System.out.print("Enter the student details"+ "\n");
	      Scanner scan = new Scanner(System.in);
	      System.out.print("Enter name"+ "\n");
	      Nm = scan.next();
	      System.out.print("Enter phone number/buzz number"+ "\n");
	      Ph=scan.nextInt();
	      System.out.print("Enter Roll number in integers"+ "\n");
	      Rn= scan.nextInt();
	      System.out.print("Enter class number"+ "\n");
	      Cs= scan.nextInt();
	      System.out.print("Details are now entered and output can be expected"+ "\n");
	      encap.setname(Nm);
	      encap.setphone_number(Ph);
	      encap.setroll_number(Rn);
	      encap.setclass_section(Cs);
	      System.out.print("Name : " + encap.getname() + "\n" + " phone_number : " + encap.getphone_number()+ "\n" + " roll_number:" + encap.getroll_number() + "\n"+ " class_section : " + encap.getclass_section());
	      //scan.close();
	      
	      MarksJavaPgm();
	   }



public static void MarksJavaPgm()
 {
	
	 //int mark[] = new int[5];
     //int i;
     float sum;
				      
     Scanner sc = new Scanner(System.in);
						
				        //System.out.print("Enter Marks Obtained in the exam : ");
				        //marks = scan.nextInt();				
				        
				  System.out.print("Enter Marks Obtained in 3 Subjects-P,C,M :"+ "\n");
				  int Physics, Chem, Maths, RollNumber;
				  float avg=0;
			      
				  System.out.print("Enter Student Roll No."+ "\n");
			      RollNumber= sc.nextInt();
				  
			      System.out.print("Enter Marks in 1st Subject"+ "\n");
			      Physics= sc.nextInt();
			      System.out.print("Enter Marks in 2nd Subject"+ "\n");
			      Chem= sc.nextInt();
			      System.out.print("Enter Marks in 3rd Subject"+ "\n");
			      Maths= sc.nextInt();
				  
		        /*for(i=0; i<3; i++)
		        {
		            mark[i] = sc.nextInt();
		            sum = sum + mark[i];
		        }*/
				      sum = Physics+Chem+Maths;
				  avg=sum/3;
				  
				  
				        System.out.print("Your Grade is ");
				        if(avg>40)
				        {
				            System.out.print("Student is Passed and rollnumber of student is" + RollNumber);
				        }
				        
				        else if (avg<40)
				        {
				            System.out.print("Student is Failed and rollnumber of student is: " + RollNumber);
				        }
				        sc.close();
				        
 }}
				

		

