package controller;
import java.util.Scanner;

public class Main {
	
	    public static void main(String[] args) {

	        Scanner obj=new Scanner(System.in);
	        System.out.println("Library Management System\n");

	        int choice =0;

	        while(choice !=3){

	            System.out.println("Enter 1- for module 1 \nEnter 2 - for module 2");
	            choice =obj.nextInt();

	            if (choice == 1) {
	            module1 obj1=new module1();
	                System.out.println("Enter student's name");
	            obj1.name=obj.nextLine();obj1.name=obj.nextLine();
	                System.out.println("Enter the father's name");
	                obj1.fname=obj.nextLine();
	                System.out.println("Enter university id");
	                obj1.uni_id=obj.nextLine();
	                System.out.println("Enter the User id");
	                obj1.uid=obj.nextLine();
	                System.out.println("In which year do you study:");
	                obj1.year=obj.nextInt();

	                obj1.getdata(obj1.name, obj1.fname, obj1.uid,obj1.uni_id,obj1.year);
	                obj1.setdata();
	            }

	            else if(choice ==2){
	                module2 obj2=new module2();

	                obj2.chemistry();
	                obj2.physics();
	                obj2.biology();

	            }
	        }


	    }


}
