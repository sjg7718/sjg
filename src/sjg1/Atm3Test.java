package sjg1;

import java.util.Scanner;

public class Atm3Test {
	public static void main(String[] args){
		Atm3 atm=new Atm3();
		Scanner input=new Scanner(System.in);
		System.out.println("���������룺");	
		int i=1;
		boolean flagPwd=true;
		while(i<=3){
			String pwd=input.next();
			atm.setPwd(pwd);
		
		    flagPwd=atm.pwdCheck();
		    if(flagPwd){
		    	break;
		    }else{
		
			System.out.println("�������,���ٴ�����");
			i++;
		
		    }	
		}
		if(flagPwd){
			System.out.println("������ȡ���");
			int money = input.nextInt();
			boolean moneyFlag=true;
			while(!moneyFlag){
			
			moneyFlag=atm.moneyCheck(money);
			
			if(moneyFlag){
				System.out.println("����ȡ�����ǣ�"+money);
				break;
			}else{
				System.out.println("������Ľ��Ϸ������������룺");
			}
			
		}
	}
}
}