package sjg1;

public class Person {
	//����
	public String name="";
	public int    age =0;
	public String sexId="";
	public Person(){
		
	}
	//���췽��
	public Person(String name,int age,String sexId){
	
	
		this.name=name;
		this.age=age;
		this.sexId=sexId;
		
	}
	
	//��Ϊ	
	public  void sleep(){
		System.out.println("�𳳳�����˯���");
			
	}
	
	public void say(){
		System.out.println("�ҽ�"+name);
		System.out.println("�ҽ���"+age+"��");
		System.out.println("�ҵ��Ա��ǣ�"+sexId);
		
		
	}

}
