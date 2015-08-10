package sjg1;

public class Myself {
	public String name="";
	public int    age=0;
	public String sexId="";
	public double height=0;
	public double weight=0;
	
	
	public Myself(String name,int age,String sexId,double height,double weight){
		this.name=name;
		this.age=age;
		this.sexId=sexId;
		this.height=height;
		this.weight=weight;
	}
	
	
	    public  void say(){
		System.out.println("大家好！");
	    }
	    
	    
		public void property(){	
			System.out.print("我叫"+name+",");
			System.out.println("我今年"+age+"岁");
			System.out.println("我是一个身高"+height+","+"体重"+weight+"的"+sexId+"人");
		
		}
		
		
	}
	


