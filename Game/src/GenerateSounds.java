import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

import javax.swing.JPanel;

public class GenerateSounds {
	URL url = GenerateSounds.class.getResource("sound/Shag.wav");
	URL url2 = GenerateSounds.class.getResource("sound/mech3.wav");
	URL url3 = GenerateSounds.class.getResource("sound/scream.wav");
	URL url4 = GenerateSounds.class.getResource("sound/arrow.wav");
	URL url5 = GenerateSounds.class.getResource("sound/VaseSmash.wav");
	URL url6 = GenerateSounds.class.getResource("sound/QUICK_AP.wav");
	URL url7 = GenerateSounds.class.getResource("sound/DoorCreakSlam.wav");
	AudioClip clip = Applet.newAudioClip(url);
	AudioClip clip2 = Applet.newAudioClip(url2);
	AudioClip clip3 = Applet.newAudioClip(url3);
	AudioClip clip4 = Applet.newAudioClip(url4);
	AudioClip clip5 = Applet.newAudioClip(url5);
	AudioClip clip6 = Applet.newAudioClip(url6);
	AudioClip clip7 = Applet.newAudioClip(url7);

	public GenerateSounds() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		GenerateSounds gs = new GenerateSounds();
	}

}
