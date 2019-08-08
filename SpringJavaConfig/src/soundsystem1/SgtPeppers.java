package soundsystem1;

public class SgtPeppers implements CompactDisc{

	private String title = "SgtPeppers";
	
	private String artist = "The Beatles";
	
	@Override
	public void play() {
		
		System.out.println("Playing "+ title +" by "+artist);
		
	}

}
