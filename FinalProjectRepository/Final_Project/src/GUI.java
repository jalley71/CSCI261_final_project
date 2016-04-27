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

import net.miginfocom.swing.MigLayout;
import java.awt.Choice;
import javax.swing.JProgressBar;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JTextField hoursworked;
	private JTextField federaltaxpaid;
	private JTextField statetaxpaid;
	private JTextField housecost;
	private JTextField transportationcost;
	
	private double Pay;
	private double pay_period;
	
	private String state_tax;
	private String state_work;
	
	private String net_income ;
	private String total_income ;
	private double gross_income;
	
	
	
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
		setBounds(100, 100, 891, 753);
		getContentPane().setLayout(new MigLayout("", "[][][][220.00,right][][119.00][][][grow]", "[top][11.00][][][][7.00][][5.00][][6.00][][8.00][][][][5.00][][6.00][][9.00][][5.00][][6.00][26.00][][][-2.00][][][][][]"));
		
		JLabel lblWelcomeToOur = new JLabel(" Welcome To Our Summer Job Income Calculator ");
		lblWelcomeToOur.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		getContentPane().add(lblWelcomeToOur, "cell 0 0 9 1,alignx center");
		
		JLabel lblLocation = new JLabel("LOCATION");
		lblLocation.setFont(new Font("Tahoma", Font.BOLD, 18));
		getContentPane().add(lblLocation, "cell 2 2");
		
		JLabel lblSelectTheState = new JLabel("Select The State You Will Work In:");
		getContentPane().add(lblSelectTheState, "cell 3 3");
		
		JComboBox statework = new JComboBox();
		statework.setModel(new DefaultComboBoxModel(new String[] {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"}));
		getContentPane().add(statework, "cell 5 3");
		
		JLabel lblSelectTheState_1 = new JLabel("Select The State You Pay Taxes In:");
		getContentPane().add(lblSelectTheState_1, "cell 3 4");
		
		JComboBox statetax = new JComboBox();
		statetax.setModel(new DefaultComboBoxModel(new String[] {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"}));
		getContentPane().add(statetax, "cell 5 4");
		
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
		
		JLabel lblNewLabel = new JLabel("How Many Hours Will You Work Each Day:");
		getContentPane().add(lblNewLabel, "cell 3 12");
		
		hoursworked = new JTextField("8.00");
		getContentPane().add(hoursworked, "cell 5 12,growx");
		hoursworked.setColumns(10);
		
		JLabel lblHousing = new JLabel("HOUSING");
		lblHousing.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHousing.setForeground(new Color(0, 0, 0));
		getContentPane().add(lblHousing, "cell 2 14 2 1");
		
		JLabel lblHowManyWeeks = new JLabel("How Long Will You Be Paying For Housing:");
		getContentPane().add(lblHowManyWeeks, "cell 3 16,alignx right");
		
		housingduration = new JTextField();
		getContentPane().add(housingduration, "cell 5 16,growx");
		housingduration.setColumns(10);
		
		JComboBox housingperiod = new JComboBox();
		housingperiod.setModel(new DefaultComboBoxModel(new String[] {"W", "M", "S"}));
		getContentPane().add(housingperiod, "cell 6 16,growx");
		
		JLabel lblHowMuchWill = new JLabel("How Much Will You Be Paying For Housing:");
		getContentPane().add(lblHowMuchWill, "cell 3 18,alignx right");
		
		JTextField housingrent = new JTextField();
		getContentPane().add(housingrent, "cell 5 18,growx");
		housingrent.setColumns(10);
		
		
		JComboBox housingcosttype = new JComboBox();
		housingcosttype.setModel(new DefaultComboBoxModel(new String[] {"W", "M", "S"}));
		getContentPane().add(housingcosttype, "cell 6 18,growx");
		
		JLabel label = new JLabel("");
		getContentPane().add(label, "flowx,cell 3 20");
		
		JLabel lblTaxes = new JLabel("TRANSPORTATION");
		lblTaxes.setFont(new Font("Tahoma", Font.BOLD, 18));
		getContentPane().add(lblTaxes, "cell 2 20 2 1");
		
		JLabel lblPleaseSelectThe = new JLabel("Car Gas Mileage:");
		getContentPane().add(lblPleaseSelectThe, "cell 3 22");
		
		carmileage = new JTextField();
		getContentPane().add(carmileage, "cell 5 22,growx");
		carmileage.setColumns(10);
		
		JLabel lblMpg = new JLabel("MPG");
		lblMpg.setFont(new Font("Tahoma", Font.ITALIC, 12));
		getContentPane().add(lblMpg, "cell 6 22");
		
		JLabel lblTransportationDistance = new JLabel("Transportation Distance:");
		getContentPane().add(lblTransportationDistance, "cell 3 24");
		
		transportationdistance = new JTextField();
		getContentPane().add(transportationdistance, "cell 5 24,growx");
		transportationdistance.setColumns(10);
		
		/**
		 * This Calculates Everything using the inputs you have.
		 */
		
		JLabel lblMiles = new JLabel("Miles");
		lblMiles.setFont(new Font("Tahoma", Font.ITALIC, 12));
		getContentPane().add(lblMiles, "cell 6 24");
		
		JButton calculateIncome = new JButton("CALCULATE");
		calculateIncome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Income Income = new Income();
				
				/**
				 * Sets up Variables to use in formulas
				 */
				
				double pay_period = Double.parseDouble(payperiod.getText());
				double Pay = Double.parseDouble(pay.getText());
				double hours_worked = Double.parseDouble(hoursworked.getText());
				
				String pay_type = String.valueOf(paytype.getSelectedItem());
				String pay_duration = String.valueOf(payduration.getSelectedItem());
				
				String state_work = String.valueOf(statework.getSelectedItem());
				String state_tax = String.valueOf(statetax.getSelectedItem());
				
				Income.setemploymentDuration(pay_period);
				Income.setemploymentdurationType(pay_duration);
				Income.sethoursperDay(hours_worked);
				
				Income.setpay(Pay);
				Income.setpayType(pay_type);
				
				double gross_income = Income.getsummerIncome();
				
				grossIncome.setText(Double.toString(gross_income));
				
			}
		}
		);
		
		getContentPane().add(calculateIncome, "cell 5 26,alignx center");
		
		JLabel lblGrossIncome = new JLabel("Gross Income:");
		lblGrossIncome.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(lblGrossIncome, "cell 3 29");
		
				
		
		grossIncome = new JTextField();
		getContentPane().add(grossIncome, "cell 5 29,growx");
		grossIncome.setColumns(10);
		
		JLabel lblStateIncomeTax = new JLabel("Federal Tax:");
		lblStateIncomeTax.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(lblStateIncomeTax, "cell 7 29,alignx trailing");
		
		federaltaxpaid = new JTextField();
		getContentPane().add(federaltaxpaid, "cell 8 29,growx");
		federaltaxpaid.setColumns(10);
		
		JLabel lblNetIncome = new JLabel("Net Income:");
		lblNetIncome.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(lblNetIncome, "cell 3 30");
		
		netIncome = new JTextField();
		getContentPane().add(netIncome, "cell 5 30,growx");
		netIncome.setColumns(10);
		netIncome.setText(net_income);
		
		JLabel lblNewLabel_1 = new JLabel("State Tax Paid:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(lblNewLabel_1, "cell 7 30,alignx trailing");
		
		statetaxpaid = new JTextField();
		getContentPane().add(statetaxpaid, "cell 8 30,growx");
		statetaxpaid.setColumns(10);
		
		JLabel lblIncomeWtransportation = new JLabel("Income w/Transportation & Housing:");
		lblIncomeWtransportation.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(lblIncomeWtransportation, "cell 3 31");
		
		totalIncome = new JTextField();
		getContentPane().add(totalIncome, "cell 5 31,growx");
		totalIncome.setColumns(10);
		totalIncome.setText(total_income);
		
		JLabel lblHousingCost = new JLabel("Housing Cost:");
		lblHousingCost.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(lblHousingCost, "cell 7 31,alignx trailing");
		
		housecost = new JTextField();
		getContentPane().add(housecost, "cell 8 31,growx");
		housecost.setColumns(10);
		
		JLabel lblTransportationCost = new JLabel("Transportation Cost:");
		lblTransportationCost.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(lblTransportationCost, "cell 7 32,alignx trailing");
		
		transportationcost = new JTextField();
		getContentPane().add(transportationcost, "cell 8 32,growx");
		transportationcost.setColumns(10);
				
		
			
		
	}
	
}
