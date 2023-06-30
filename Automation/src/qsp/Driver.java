package qsp;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Driver {
public static void test(ArrayList<Employee> a1) {
				System.out.println("press 1 to add /create an employee");
				System.out.println("press 2 to display details of all the employee");
				System.out.println("press 3 to search an employee based on name");
				System.out.println("press 4 to delete an employee based on eid");
				System.out.println("press 5 to display details of all the employee in ascending order of salary");
				
				Scanner sc=new Scanner(System.in);
				int i=sc.nextInt();
				
				Employee en;
				if(i==1) {
					en=new Employee("",0,0.0);
					a1.add(en);
				}
				
		        else if(i==2) {
					for(int j=0;j<a1.size();j++) {
						
						System.out.println("name:"+a1.get(j).getName());
		    			System.out.println("eid:"+a1.get(j).getEid());
		    			System.out.println("salary:"+a1.get(j).getSalary());
		    			
					}
					}
		        else if(i==3) {
		        	System.out.println("enter the name your searched");
		        	        	String name=sc.next();
		        	for(int z=0;z<a1.size();z++) {
		                 if(name.equals(a1.get(z).getName()))
		        		{
		        			System.out.println("name:"+a1.get(z).getName());
		        			System.out.println("eid:"+a1.get(z).getEid());
		        			System.out.println("salary:"+a1.get(z).getSalary());
		        			}
		        	}
		        	
		        }
		        else if(i==4) {
		        	System.out.println("enter the eid your delted");
		        	int a=sc.nextInt();
		        	for(int k=0;k<a1.size();k++)
		        	{
		        		if(a==a1.get(k).getEid())
		        		{
		        			a1.remove(k);
		        		}
		        	
		        	}
		        }
		        else if(i==5) {
		        	Collections.sort(a1);
		        	for (Employee car : a1) {
		        		 
		                // Print the sorted ArrayList
		                System.out.println(car.getSalary() + " " + car.getName()
		                                   + " " + car.getEid());
		        	}}
		        		
				System.out.println("press 1 to continue");
				System.out.println(" press any number to exit");
				int c=sc.nextInt();
				if(c==1) {
					test(a1);
					
				}
				else {
					return;
					
				}
				
				}
			public static void main(String[] args) {
				System.out.println("hello user,welcome!");
				
				ArrayList<Employee> al = new ArrayList<>();
				test(al);
				
			}
				



	}


