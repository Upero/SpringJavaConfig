package soundsystem1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CDPlayer {
	
	private CompactDisc cd;
	
	public void Play() {
		cd.play();
		System.out.println("CDPlayer do....");
	}
	
}
