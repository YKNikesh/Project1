package qsp;


import java.util.Scanner;


public class Employee implements Comparable {
	private String name;
	private int eid;
	private double salary;
	Scanner sc=new Scanner(System.in);
	public String getName()
	{
		return name;
		
	}
	public void setName(String name)
	{
		this.name=sc.next();
		
	}
	public int getEid()
	{
		
		return eid;
		
	}
	public void setId(int eid) {
		this.eid=sc.nextInt();
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary=sc.nextDouble();
		
	}
	 Employee(String name,int eid,double salary){
		System.out.println("enter the name");
	
		this.name=sc.next();
		System.out.println("enter the eid");
		this.eid=sc.nextInt();
		System.out.println("enter the salary");
		this.salary=sc.nextDouble();}
		public int  compareTo(Object obj)
		{
			if(this.salary==(((Employee)obj).salary))
          {
	        return 0;
	
            }
			else if(this.salary>((Employee)obj).salary)
			{
				return 1;
				
			}
			else {
				return -1;
			}
			
		}
		
		
	
	}
