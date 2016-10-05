package _16_Interfaces;

public class DVD implements IFUNCTIONS {

	String title;
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("DVD is now playing movie");
		
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("DVD has stopped");
		
		
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skip Movie");
		
		
	}

	@Override
	public void menue() {
		// TODO Auto-generated method stub
		System.out.println("DVD menu");
		
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("DVD is now playing Movie");
		
		
	}

}
