package sjg1;

public class Atm2Test {
	public static void main(String[] args){
		Atm2 atm=new Atm2();
		int pwd=123;
		String name="����";
		boolean result=atm.pwdCheck(pwd,name);
		if(result){
			System.out.println("������ȷ");
		}else{
			System.out.println("�������");
			
		}
		
	}

}
