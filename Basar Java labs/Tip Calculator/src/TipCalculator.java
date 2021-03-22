import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TipCalculator extends JFrame{

	public TipCalculator() {
		setSize(500,400);
		setTitle("Tip Calculator");
	}

	public static void main(String[] args) {
		TipCalculator tipGUI = new TipCalculator();
		JLabel lblTitle = new JLabel("The Tip Calculator");

		Font titleFont = new Font("Serif", Font.BOLD, 40);
		lblTitle.setFont(titleFont);

		JLabel lblBillAmount = new JLabel("Bill amount");
		JTextField tfBillAmount = new JTextField(20);
		lblBillAmount.setLabelFor(tfBillAmount);
		JButton btnCalculate = new JButton("Calculate");

		JLabel lblTipPercent = new JLabel("Tip percent");
		JTextField tfTipPercent = new JTextField(20);
		lblTipPercent.setLabelFor(tfTipPercent);
		
		JLabel lblNumOfPeople = new JLabel("# of People");
		JTextField tfNumOfPeople = new JTextField(20);
		lblNumOfPeople.setLabelFor(tfNumOfPeople);

		tfTipPercent.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						btnCalculate.doClick();
					}
				}


				);

		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 18);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);  
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				tfTipPercent.setText(String.valueOf(slider.getValue()));
			}
		});        		

		JLabel lblTipPerPerson = new JLabel("Tip Per Person");
		JTextField tfTipPerPerson = new JTextField(20);
		lblTipPerPerson.setLabelFor(tfTipPerPerson);
		
		JLabel lblTotalPerPerson = new JLabel("Total Per Person");
		JTextField tfTotalPerPerson = new JTextField(20);
		lblTotalPerPerson.setLabelFor(tfTotalPerPerson);
		
		JLabel lblBillTotal = new JLabel("Bill Total");
		JTextField tfBillTotal = new JTextField(20);
		lblBillTotal.setLabelFor(tfBillTotal);

		btnCalculate.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double TipPerPerson;
						double TotalPerPerson;
						double BillTotal;
						
						TipPerPerson = Double.parseDouble(tfBillAmount.getText()) *
							    (Double.parseDouble(tfTipPercent.getText())) / 100.0 / Double.parseDouble(tfNumOfPeople.getText());
						tfTipPerPerson.setText(String.format("$ %.2f", TipPerPerson));
						
						TotalPerPerson = Double.parseDouble(tfBillAmount.getText()) / Double.parseDouble(tfNumOfPeople.getText())
								+ Double.parseDouble(tfBillAmount.getText()) * (Double.parseDouble(tfTipPercent.getText())) / 100.0 / Double.parseDouble(tfNumOfPeople.getText());
						tfTotalPerPerson.setText(String.format("$ %.2f", TotalPerPerson));
						
						BillTotal = Double.parseDouble(tfBillAmount.getText()) *
								( 1 + Double.parseDouble(tfTipPercent.getText()) / 100.0 );
						tfBillTotal.setText(String.format("$ %.2f", BillTotal));
					}
				}
				);

		JPanel titlePanel = new JPanel(new FlowLayout());    
		titlePanel.add(lblTitle);

		JPanel panel = new JPanel(new GridLayout(7, 2, 5, 5) );
		panel.add(lblBillAmount);
		panel.add(tfBillAmount);
		panel.add(lblTipPercent);
		panel.add(tfTipPercent);
		panel.add(lblNumOfPeople);
		panel.add(tfNumOfPeople);
		panel.add(slider);
		panel.add(btnCalculate);
		panel.add(lblTipPerPerson);
		panel.add(tfTipPerPerson);
		panel.add(lblTotalPerPerson);
		panel.add(tfTotalPerPerson);
		panel.add(lblBillTotal);
		panel.add(tfBillTotal);

		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(titlePanel, BorderLayout.NORTH);
		mainPanel.add(panel, BorderLayout.CENTER);

		tipGUI.getContentPane().add(mainPanel);
		tipGUI.setVisible(true);
	}

}

