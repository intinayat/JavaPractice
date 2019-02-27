package mphasis;

public class Constructor {
	int empno;
	String name,address;
	public Constructor(int empno, String name, String address) {
		super();
		this.empno = empno;
		this.name = name;
		this.address = address;
	}
	    public Constructor() {
	    	System.out.println("default constructor");
	    }
		@Override
		public String toString() {
			return "Constructor [empno=" + empno + ", name=" + name + ", address=" + address + "]";
		}
		int sum(int a,int b)
		{
		return a+b;	
		}

		float sum(float a,float b)
		{
			return a+b;
		}
		double sum(double a,double b)
		{
			return a+b;
		}

		}

