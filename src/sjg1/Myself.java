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
		System.out.println("��Һã�");
	    }
	    
	    
		public void property(){	
			System.out.print("�ҽ�"+name+",");
			System.out.println("�ҽ���"+age+"��");
			System.out.println("����һ�����"+height+","+"����"+weight+"��"+sexId+"��");
		
		}
		
		
	}
	


