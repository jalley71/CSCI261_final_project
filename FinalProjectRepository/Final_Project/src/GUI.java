import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import net.miginfocom.swing.MigLayout;
import java.awt.Choice;
import javax.swing.JProgressBar;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Label;
import java.awt.event.*;
import javax.swing.JPopupMenu;

public class GUI extends JFrame {
	private JTextField pay;
	private JTextField payperiod;
	private JTextField housingduration;
	private JTextField housingcost;
	private JTextField carmileage;
	private JTextField transportationdistance;
	private JTextField grossIncome;
	private JTextField netIncome;
	private JTextField totalIncome;
	private String gross_income;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(new MigLayout("", "[][][][220.00,right][][69.00,grow][][grow]", "[top][11.00][][][][7.00][][5.00][][6.00][][8.00][][5.00][][6.00][][9.00][][5.00][][6.00][][10.00][][25.00][24.00][25.00]"));
		
		JLabel lblWelcomeToOur = new JLabel(" Welcome To Our Summer Job Income Calculator ");
		lblWelcomeToOur.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		getContentPane().add(lblWelcomeToOur, "cell 0 0 8 1,alignx center");
		
		JLabel lblLocation = new JLabel("LOCATION");
		lblLocation.setFont(new Font("Tahoma", Font.BOLD, 18));
		getContentPane().add(lblLocation, "cell 2 2");
		
		JLabel lblSelectTheState = new JLabel("Select The State You Will Work In:");
		getContentPane().add(lblSelectTheState, "cell 3 3");
		
		JComboBox state_work = new JComboBox();
		state_work.setModel(new DefaultComboBoxModel(new String[] {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"}));
		getContentPane().add(state_work, "cell 5 3");
		
		JLabel lblSelectTheState_1 = new JLabel("Select The State You Pay Taxes In:");
		getContentPane().add(lblSelectTheState_1, "cell 3 4");
		
		JComboBox state_tax = new JComboBox();
		state_tax.setModel(new DefaultComboBoxModel(new String[] {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"}));
		getContentPane().add(state_tax, "cell 5 4");
		
		JLabel lblPayment = new JLabel("PAYMENT");
		lblPayment.setFont(new Font("Tahoma", Font.BOLD, 18));
		getContentPane().add(lblPayment, "cell 2 6 2 1");
		
		JLabel lblPleaseSelectYour = new JLabel("Please Select Your Salary/Wage:");
		getContentPane().add(lblPleaseSelectYour, "cell 3 8,alignx trailing");
		
		pay = new JTextField();
		getContentPane().add(pay, "cell 5 8,growx");
		pay.setColumns(10);
		
		JComboBox paytype = new JComboBox();
		paytype.setModel(new DefaultComboBoxModel(new String[] {"H", "D", "W", "M", "S"}));
		getContentPane().add(paytype, "cell 6 8,growx");
		
		JLabel lblPleaseEnterHow = new JLabel("Please Enter How Long You Will Be Working:");
		getContentPane().add(lblPleaseEnterHow, "cell 3 10,alignx trailing");
		
		payperiod = new JTextField();
		getContentPane().add(payperiod, "cell 5 10,growx");
		payperiod.setColumns(10);
		
		JComboBox payduration = new JComboBox();
		payduration.setModel(new DefaultComboBoxModel(new String[] {"H", "D", "W", "M", "S"}));
		getContentPane().add(payduration, "cell 6 10,growx");
		
		JLabel lblHousing = new JLabel("HOUSING");
		lblHousing.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHousing.setForeground(new Color(0, 0, 0));
		getContentPane().add(lblHousing, "cell 2 12 2 1");
		
		JLabel lblHowManyWeeks = new JLabel("How Long Will You Be Paying For Housing:");
		getContentPane().add(lblHowManyWeeks, "cell 3 14,alignx right");
		
		housingduration = new JTextField();
		getContentPane().add(housingduration, "cell 5 14,growx");
		housingduration.setColumns(10);
		
		JComboBox housingperiod = new JComboBox();
		housingperiod.setModel(new DefaultComboBoxModel(new String[] {"W", "M", "S"}));
		getContentPane().add(housingperiod, "cell 6 14,growx");
		
		JLabel lblHowMuchWill = new JLabel("How Much Will You Be Paying For Housing:");
		getContentPane().add(lblHowMuchWill, "cell 3 16,alignx right");
		
		JTextField housingcost = new JTextField();
		getContentPane().add(housingcost, "cell 5 16,growx");
		housingcost.setColumns(10);
		
		
		JComboBox housingcosttype = new JComboBox();
		housingcosttype.setModel(new DefaultComboBoxModel(new String[] {"W", "M", "S"}));
		getContentPane().add(housingcosttype, "cell 6 16,growx");
		
		JLabel label = new JLabel("");
		getContentPane().add(label, "flowx,cell 3 18");
		
		JLabel lblTaxes = new JLabel("TRANSPORTATION");
		lblTaxes.setFont(new Font("Tahoma", Font.BOLD, 18));
		getContentPane().add(lblTaxes, "cell 2 18 2 1");
		
		JLabel lblPleaseSelectThe = new JLabel("Car Gas Mileage:");
		getContentPane().add(lblPleaseSelectThe, "cell 3 20");
		
		carmileage = new JTextField();
		getContentPane().add(carmileage, "cell 5 20,growx");
		carmileage.setColumns(10);
		
		JLabel lblMpg = new JLabel("MPG");
		lblMpg.setFont(new Font("Tahoma", Font.ITALIC, 12));
		getContentPane().add(lblMpg, "cell 6 20");
		
		JLabel lblTransportationDistance = new JLabel("Transportation Distance:");
		getContentPane().add(lblTransportationDistance, "cell 3 22");
		
		transportationdistance = new JTextField();
		getContentPane().add(transportationdistance, "cell 5 22,growx");
		transportationdistance.setColumns(10);
		
		JLabel lblMiles = new JLabel("Miles");
		lblMiles.setFont(new Font("Tahoma", Font.ITALIC, 12));
		getContentPane().add(lblMiles, "cell 6 22");
		
		/**
		 * This Calculates Everything using the inputs you have.
		 */
		
		JButton calculateIncome = new JButton("CALCULATE");
		calculateIncome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double housing_cost = Double.parseDouble(housingcost.getText());
					grossIncome.setText(Double.toString(housing_cost));
				}
			}
		);
		getContentPane().add(calculateIncome, "cell 2 24");
		
		JLabel lblGrossIncome = new JLabel("Gross Income:");
		lblGrossIncome.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(lblGrossIncome, "cell 3 24");
		
		/**
		 * Messing Around Here
		 */
		
		
		
		grossIncome = new JTextField();
		getContentPane().add(grossIncome, "cell 5 24,growx");
		grossIncome.setColumns(10);
		grossIncome.setText(gross_income);
		
		JLabel lblTransportationCost = new JLabel("Transportation Cost:");
		lblTransportationCost.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(lblTransportationCost, "cell 6 24,alignx right");
		
		JLabel transportationCost = new JLabel("####");
		getContentPane().add(transportationCost, "cell 7 24");
		
		JLabel lblNetIncome = new JLabel("Net Income:");
		lblNetIncome.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(lblNetIncome, "cell 3 25");
		
		netIncome = new JTextField();
		getContentPane().add(netIncome, "cell 5 25,growx");
		netIncome.setColumns(10);
		
		JLabel lblHousingCost = new JLabel("Housing Cost:");
		lblHousingCost.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(lblHousingCost, "cell 6 25,alignx right");
		
		JLabel housingCost = new JLabel("####");
		getContentPane().add(housingCost, "cell 7 25");
		
		JLabel lblIncomeWtransportation = new JLabel("Income w/Transportation & Housing:");
		lblIncomeWtransportation.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(lblIncomeWtransportation, "cell 3 26");
		
		totalIncome = new JTextField();
		getContentPane().add(totalIncome, "cell 5 26,growx");
		totalIncome.setColumns(10);
		
				
		
			
		
	}
	
}
