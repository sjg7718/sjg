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
		System.out.println(name+"������Ϊ��"+age+","+"��Ʊȫ��");
	}else if(age>10){
		System.out.println(name+"������Ϊ��"+age+","+"��Ʊ�ļ۸�Ϊ��20");
	}else{
		System.out.println(name+"������Ϊ��"+age+","+"��Ʊ���");
	}
  }
}
