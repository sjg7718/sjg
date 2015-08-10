package sjg1;

import java.util.Scanner;

 public class AtmTest {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÃÜÂë£º");
		int pwd=input.nextInt();
		System.out.println("ÇëÊäÈë½ğ¶î£º");	
		int money =input.nextInt();		
		
		Atm t=new Atm(pwd,money);
		t.judge();
    }
}