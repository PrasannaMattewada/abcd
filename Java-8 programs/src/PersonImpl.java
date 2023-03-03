interface Person{
	public abstract void eat();//method
}
public class PersonImpl {
	public static void main(String[]args) {
	Person p1= new Person(){
		
		public  void eat() {
			System.out.println("Rich food");
		}
		};
		p1.eat();
}

}
