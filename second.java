package mphasis;

public class second {
	public static void main(String[] args) {
		Constructor ob= new Constructor();
		Constructor ob1= new Constructor(101,"Sandip","Bangalore");
		Constructor ob2= new Constructor(102,"Sandip","Bangalore");
		Constructor ob3= new Constructor(103,"Madip","Bangalore");
		
		
		System.out.println();
		System.out.println(ob);
		System.out.println(ob2);
		System.out.println(ob3);
		System.out.println(ob.sum(4, 5));
		System.out.println(ob.sum(4.3, 5.3));
		System.out.println(ob.sum(43.3f, 5.45f));
		
	}

}
