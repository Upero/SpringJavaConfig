package soundsystem1;

public class AnoPeppers implements CompactDisc{

	private String title = "Anto";
	
	private String artist = "The Cheng" ;
	
	@Override
	public void play() {
		
		System.out.println("Playing "+ title +" by "+artist);
		
	}

}
