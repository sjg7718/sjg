package sjg1;

public class Ticket {

	public String name="";
	public int     age=0;
	
	
	public Ticket(String name,int age){
		this.name=name;
		this.age=age;	
	}
	

	public void judge(){
	if(age>20){
		System.out.println(name+"的年龄为："+age+","+"门票全价");
	}else if(age>10){
		System.out.println(name+"的年龄为："+age+","+"门票的价格为：20");
	}else{
		System.out.println(name+"的年龄为："+age+","+"门票免费");
	}
  }
}
