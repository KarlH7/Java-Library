package _16_Interfaces;

public class CD implements IFUNCTIONS {

	String title;
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("CD is now playing");
		
	
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("CD is now stopped");
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skip to next song");
	}

	@Override
	public void menue() {
		// TODO Auto-generated method stub
		System.out.println("Show th menu");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pause song");
	}

	public void turnUpToEleven(int vloume) {
		System.out.println("11");
		
	}
	
	public void getTitle(String title){
		System.out.println(title);
		
	}

	
}
