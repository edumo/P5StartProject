import processing.core.PApplet;
import processing.core.PImage;

public class P5BlankTest extends PApplet {


	PImage[] bot;

	
	public void setup() {		
		println("setup");
		size(1024, 768,P3D);
		
	}

	public void draw() {
		background(0);
		text("HELLO WORLD TEST",300,300);
	}

	public void keyTyped(){
		
	}
	
	public void mousePressed() {

	}

	public void mouseDragged() {

	}

	public void mouseReleased() {
	
	}

	static public void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "P5BlankTest" };
		if (passedArgs != null) {
			PApplet.main(concat(appletArgs, passedArgs));
		} else {
			PApplet.main(appletArgs);
		}
	}
}
