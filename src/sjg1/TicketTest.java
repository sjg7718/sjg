package sjg1;

import java.util.Scanner;

public class TicketTest {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������������");
		String name=input.next();
		System.out.println("���������䣺");
		int age=input.nextInt();
		Ticket ti=new Ticket(name,age);
		ti.judge();
		
	}
     
}
