package sjg1;

public class Person {
	//属性
	public String name="";
	public int    age =0;
	public String sexId="";
	public Person(){
		
	}
	//构造方法
	public Person(String name,int age,String sexId){
	
	
		this.name=name;
		this.age=age;
		this.sexId=sexId;
		
	}
	
	//行为	
	public  void sleep(){
		System.out.println("别吵吵，再睡会儿");
			
	}
	
	public void say(){
		System.out.println("我叫"+name);
		System.out.println("我今年"+age+"岁");
		System.out.println("我的性别是："+sexId);
		
		
	}

}
