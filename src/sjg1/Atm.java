package sjg1;

public class Atm {
	public int pwd=0;
	public int money=0;
	
	public Atm(int pwd,int money){
		this.pwd=pwd;
		this.money=money;
	}
    public void judge(){
    	int count = 0;
    	while(true){		
		if(111111 == pwd){
			break;
		}else{
			System.out.println("密码输入错误，请重新输入");
			count++;
		
    	}
		if(3 == count){
			System.out.println("请取卡");
			return;
		}
    }
		while(money%100!=0||money>1000){			
			
			System.out.println("您输入的金额不合法，请重新输入：");
		}
			
			System.out.println("您取了"+money+"元");
			System.out.println("交易完成，请取卡！");
	
    }
}