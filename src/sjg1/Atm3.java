package sjg1;

public class Atm3 {
	public String pwd="";
	public void setPwd(String pwd){
		this.pwd=pwd;
	}
	public String getPwd(){
		return pwd;
	}
	public boolean pwdCheck(){
	boolean flag=true;
	if(this.pwd.equals("123")){
		flag=true;
		
	}else{
		flag=false;
	}
	return flag;	
    }
    //判断金额是否合法
	public boolean moneyCheck(int money){
		boolean moneyFlag=true;
		if(money%100==0){
			moneyFlag=true;
		}else{
			moneyFlag=false;
		}
		return moneyFlag;
	}   
}
