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
			System.out.println("���������������������");
			count++;
		
    	}
		if(3 == count){
			System.out.println("��ȡ��");
			return;
		}
    }
		while(money%100!=0||money>1000){			
			
			System.out.println("������Ľ��Ϸ������������룺");
		}
			
			System.out.println("��ȡ��"+money+"Ԫ");
			System.out.println("������ɣ���ȡ����");
	
    }
}