import org.apache.log4j.Logger;
import org.edumo.util.TracingPrintStream;

import processing.core.PApplet;
import processing.core.PImage;

public class P5Blank extends PApplet {


	PImage[] bot;

	Logger logger = Logger.getLogger(this.getClass());
	
	public void setup() {
		System.setOut(new TracingPrintStream(System.out));
		System.setErr(new TracingPrintStream(System.err));
		println("setup");
		size(1024, 768,P3D);
		logger.info("Blank PRject started");
	}

	public void draw() {
		background(0);
		text("HELLO WORLD",300,300);
	}

	public void keyTyped(){
		
	}
	
	public void mousePressed() {
		
		println("salida estandar");
		logger.info("saida por logger");

	}

	public void mouseDragged() {

	}

	public void mouseReleased() {
	
	}

	static public void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "P5Blank" };
		if (passedArgs != null) {
			PApplet.main(concat(appletArgs, passedArgs));
		} else {
			PApplet.main(appletArgs);
		}
	}
}
