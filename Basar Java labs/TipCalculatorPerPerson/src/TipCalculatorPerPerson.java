import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class TipCalculatorPerPerson extends JFrame {

	public TipCalculatorPerPerson() {
		setSize(500, 200);
		setTitle("Tip Calculator");
	}

	public static void main(String[] args) {
		TipCalculatorPerPerson demo = new TipCalculatorPerPerson();
		
		JLabel lblBillAmount = new JLabel("Bill Amount");
		JTextField tfBillAmount = new JTextField(30);
		lblBillAmount.setLabelFor(tfBillAmount);
		
		JLabel lblTipPercent = new JLabel("Tip Percent");
		JTextField tfTipPercent = new JTextField(30);
		lblTipPercent.setLabelFor(tfTipPercent);
		
		JLabel lblNumOfPeople = new JLabel("Number of People");
		JTextField tfNumOfPeople = new JTextField(30);
		lblNumOfPeople.setLabelFor(tfNumOfPeople);
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		JLabel lblTipPerPerson = new JLabel("Tip Per Person");
		JTextField tfTipPerPerson = new JTextField(30);
		lblTipPerPerson.setLabelFor(tfTipPerPerson);
		
		JLabel lblTotalPerPerson = new JLabel("Total Per Person");
		JTextField tfTotalPerPerson = new JTextField(30);
		lblTotalPerPerson.setLabelFor(tfTotalPerPerson);
		
		JLabel lblBillTotal = new JLabel("Bil Total");
		JTextField tfBillTotal = new JTextField(30);
		lblBillTotal.setLabelFor(tfBillTotal);
		
		JPanel panel = new JPanel(new GridLayout(2, 2, 0, 0));

		panel.add(lblBillAmount);
		panel.add(lblTipPercent);
		panel.add(lblNumOfPeople);
		panel.add(lblTipPerPerson);
		panel.add(lblTotalPerPerson);
		panel.add(lblBillTotal);
		
		demo.getContentPane().add(panel);
		demo.setVisible(true);
	}

}
