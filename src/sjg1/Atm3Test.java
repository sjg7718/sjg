package sjg1;

import java.util.Scanner;

public class Atm3Test {
	public static void main(String[] args){
		Atm3 atm=new Atm3();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入密码：");	
		int i=1;
		boolean flagPwd=true;
		while(i<=3){
			String pwd=input.next();
			atm.setPwd(pwd);
		
		    flagPwd=atm.pwdCheck();
		    if(flagPwd){
		    	break;
		    }else{
		
			System.out.println("密码错误,请再次输入");
			i++;
		
		    }	
		}
		if(flagPwd){
			System.out.println("请输入取款金额：");
			int money = input.nextInt();
			boolean moneyFlag=true;
			while(!moneyFlag){
			
			moneyFlag=atm.moneyCheck(money);
			
			if(moneyFlag){
				System.out.println("您的取款金额是："+money);
				break;
			}else{
				System.out.println("您输入的金额不合法，请重新输入：");
			}
			
		}
	}
}
}