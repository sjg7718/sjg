package sjg1;

public class Atm2Test {
	public static void main(String[] args){
		Atm2 atm=new Atm2();
		int pwd=123;
		String name="张三";
		boolean result=atm.pwdCheck(pwd,name);
		if(result){
			System.out.println("密码正确");
		}else{
			System.out.println("密码错误");
			
		}
		
	}

}
