package practice_2;


public class Accessmodifiers {
	
	private class Datatest{
		
		private void xyz() {
			
		
			System.out.println("hello world");
		
	}}

		public void abc() {
			Datatest obj = new Datatest();
			obj.xyz();
			
		}
	
	
}
