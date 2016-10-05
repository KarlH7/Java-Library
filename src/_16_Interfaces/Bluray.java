package _16_Interfaces;

public class Bluray implements IFUNCTIONS{

	String title;
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Bluray movie");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop BluRay movie");
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skip BluRay Movie");
	}

	@Override
	public void menue() {
		// TODO Auto-generated method stub
		System.out.println("Show BluRay menue");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pause BluRay movie");
		
	}
	
	public void BlurayQuality (Boolean Quality){
		
		System.out.println("High Quality is on");

	}
				
}
