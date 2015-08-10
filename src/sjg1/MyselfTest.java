package sjg1;

public class MyselfTest {
	public static void main(String[] args){
		//调用构造函数
		 Myself my =new  Myself("阿宝",25,"男",120.0,175.0);
		 Myself my1=new  Myself("美美",21,"女",100.0,165.0);		
		
		  my.say();
		  my.property();
		  my1.say(); 
		  my1.property();
       
      
}
}