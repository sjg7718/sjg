package sjg1;

public class Student {
	private String name="";
	private String classes="";
	private double grade =0;
	private int  stuNo   =0;
	public void setName(){
		this.name=name;	
	}
	public String getName(String name){
		return this.name;
		
	}
     public void setClasses(){
		this.classes=classes;
	}
	public String getClasses(String classes){
		
		return this.classes;
	}
	
	public void setGrade(){
		this.grade=grade;		
	}
	public double getGrade(double grade){
		return this.grade;
	}
	public void setStuNo(){
		this.stuNo=stuNo;
		
	}
	public int getStuNo(int stuNo){
		return this.stuNo;
	}
	public void getResult(){
		System.out.println(name+",��ĳɼ��ǣ�"+grade);
	}
    public double getResult(double gread){
    	System.out.println("�ɼ��ǣ�"+grade);
    	
    } 
    public void getResult(double grade){
    	String lev="";
    	if(grade>=90){
    		lev="����";   		
    	}else if(grade>=80){
    		lev="����";
    		
    	}else if(grade<=70){
    		lev="�е�";
    	}else{
    		lev="����";
    	}
    }
    
}
