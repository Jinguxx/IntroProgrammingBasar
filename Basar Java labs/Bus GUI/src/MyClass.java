import javax.swing.JFrame;
public class MyClass extends JFrame {
	public MyClass() {
		setSize(400, 400);
		setTitle("First Swing App");
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyClass();
	}
}
