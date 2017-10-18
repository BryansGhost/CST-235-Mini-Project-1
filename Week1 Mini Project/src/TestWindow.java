import javax.swing.JFrame;

public class TestWindow {

	public static void main(String[] args) {
		
		
		/**Here I will create a simple window that will populate a racehorse entry screen. */
		JFrame frame = new JFrame("Race-Horse");
		frame.setSize(500,500); //frame size
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Destroy window on closing
		

	}

}
