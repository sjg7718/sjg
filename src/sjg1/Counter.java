package sjg1;

public class Counter {
	private double a;
	private double b;
	public Counter(){
		
	}
    public Counter(double a,double b){
    	this.a=a;
    	this.b=b;
    }
       
    public double plus(double a,double b){
    	
    	double s=a+b;
    	
    	return  s;    	
    }
    public double minus(double a,double b){
    	double j=a-b;
    	return j;
    }
    public double mult(double a,double b){
    	double k=a*b;
    	return k;
    }
    public double except(double a,double b){
    	double l=a/b;
    	return l;
    }
}
