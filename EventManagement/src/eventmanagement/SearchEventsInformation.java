
package eventmanagement;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class SearchEventsInformation  implements KeyListener,ActionListener
{
    dbConnection dc = new dbConnection();

    JFrame frame = new JFrame("Search Event ID");
    JLabel lblOrderReceiveEventInformation = new JLabel("Order Receive Event Information");
    JLabel lblProgramID = new JLabel("Program ID:");
    JLabel lblProgramName = new JLabel("Program Name:");
    JLabel lblClientName = new JLabel("Program Name:");
    JLabel lblMobileNo = new JLabel("Mobile No:");
    JLabel lblGmailAddress = new JLabel("Gmail Address:");
    JLabel lblEventAddress = new JLabel("Event Address:");
    JLabel lblAdvancePaid = new JLabel("Advance Paid:");
    JLabel lblReceiveDate = new JLabel("Receive Date:");

    JLabel lblImplementedInformation = new JLabel("Implementation Information:");
    JLabel lblProgramID2 = new JLabel("Program ID:");
    JLabel lblProgramName2 = new JLabel("Program Name:");
    JLabel lblEmployeesName = new JLabel("Employees Name:");
    JLabel lblTotalFee = new JLabel("Total Fee:");
    JLabel lblAdvancePaidFee = new JLabel("Advance Paid Fee:");
    JLabel lblPaidFee = new JLabel("Paid Fee:");
    JLabel lblDueFee = new JLabel("Due Fee:");
    JLabel lblEventAddress2 = new JLabel("Event Address:");
    JLabel lblProgramFinishedDate = new JLabel("Program Finished Date:");
    JLabel lblPaidDate = new JLabel("Paid Date:");


    JTextArea txtProgramID = new JTextArea();
    JTextArea txtProgramName = new JTextArea();
    JTextArea txtClientName = new JTextArea();
    JTextArea txtMobileNo = new JTextArea();
    JTextArea txtGmailAddress = new JTextArea();
    JTextArea txtEventAddress = new JTextArea();
    JTextArea txtAdvancePaid = new JTextArea();
    JTextArea txtReceiveDate = new JTextArea();

    JTextArea txtProgramID2 = new JTextArea();
    JTextArea txtProgramName2 = new JTextArea();
    JTextArea txtEmployeeName = new JTextArea();
    JTextArea txtTotalFee = new JTextArea();
    JTextArea txtAdvancePaidfee = new JTextArea();
    JTextArea txtPaidFee = new JTextArea();
    JTextArea txtDueFee = new JTextArea();
    JTextArea txtEventAddress2 = new JTextArea();
    JTextArea txtProgramFinishedDate = new JTextArea();
    JTextArea txtPaidDate = new JTextArea();

    JButton btnExit = new JButton("Exit");


    public SearchEventsInformation()
    {
        frame.add(lblOrderReceiveEventInformation);
        lblOrderReceiveEventInformation.setBounds(20,60,300,25);
        Font orderFont = new Font("sans-serif",Font.PLAIN,18);
        lblOrderReceiveEventInformation.setFont(orderFont);

        frame.add(lblProgramID);
        lblProgramID.setBounds(20,100,100,25);

        frame.add(lblProgramName);
        lblProgramName.setBounds(20,130,100,25);

        frame.add(lblClientName);
        lblClientName.setBounds(20,160,100,25);

        frame.add(lblMobileNo);
        lblMobileNo.setBounds(20,190,100,25);

        frame.add(lblGmailAddress);
        lblGmailAddress.setBounds(20,220,100,25);

        frame.add(lblEventAddress);
        lblEventAddress.setBounds(20,250,100,25);

        frame.add(lblAdvancePaid);
        lblAdvancePaid.setBounds(20,280,100,25);

        frame.add(lblReceiveDate);
        lblReceiveDate.setBounds(20,310,100,25);

        frame.add(lblImplementedInformation);
        lblImplementedInformation.setBounds(450,60,300,25);
        Font implementationFont = new Font("sans-serif",Font.PLAIN,18);
        lblImplementedInformation.setFont(implementationFont);

        frame.add(txtProgramID);
        txtProgramID.setBounds(130,100,250,25);
        txtProgramID.addKeyListener(this);


        frame.add(txtProgramName);
        txtProgramName.setBounds(130,130,250,25);

        frame.add(txtClientName);
        txtClientName.setBounds(130,160,250,25);

        frame.add(txtMobileNo);
        txtMobileNo.setBounds(130,190,250,25);

        frame.add(txtGmailAddress);
        txtGmailAddress.setBounds(130,220,250,25);

        frame.add(txtEventAddress);
        txtEventAddress.setBounds(130,250,250,25);

        frame.add(txtAdvancePaid);
        txtAdvancePaid.setBounds(130,280,250,25);

		frame.add(txtPaidFee);
        txtPaidFee.setBounds(130,280,250,25);

        frame.add(txtReceiveDate);
        txtReceiveDate.setBounds(130,310,250,25);

        //*****end or order receive information ****

        /*frame.add(lblProgramID2);
        lblProgramID2.setBounds(450,100,100,25);*/

        frame.add(lblProgramName2);
        lblProgramName2.setBounds(450,100,100,25);

        frame.add(lblEmployeesName);
        lblEmployeesName.setBounds(450,130,150,25);

        frame.add(lblTotalFee);
        lblTotalFee.setBounds(450,160,100,25);

        frame.add(lblAdvancePaidFee);
        lblAdvancePaidFee.setBounds(450,190,150,25);

        frame.add(lblPaidFee);
        lblPaidFee.setBounds(450,220,150,25);

        frame.add(lblDueFee);
        lblDueFee.setBounds(450,250,100,25);

        frame.add(lblEventAddress2);
        lblEventAddress2.setBounds(450,280,150,25);

        frame.add(lblProgramFinishedDate);
        lblProgramFinishedDate.setBounds(450,310,150,25);

        frame.add(lblPaidDate);
        lblPaidDate.setBounds(450,340,150,25);


        frame.add(txtProgramName2);
        txtProgramName2.setBounds(610,100,250,25);

        frame.add(txtEmployeeName);
        txtEmployeeName.setBounds(610,130,250,25);

        frame.add(txtTotalFee);
        txtTotalFee.setBounds(610,160,250,25);

        frame.add(txtAdvancePaidfee);
        txtAdvancePaidfee.setBounds(610,190,250,25);

        frame.add(txtPaidFee);
        txtPaidFee.setBounds(610,220,250,25);

        frame.add(txtDueFee);
        txtDueFee.setBounds(610,250,250,25);

        frame.add(txtEventAddress2);
        txtEventAddress2.setBounds(610,280,250,25);

        frame.add(txtProgramFinishedDate);
        txtProgramFinishedDate.setBounds(610,310,250,25);

        frame.add(txtPaidDate);
        txtPaidDate.setBounds(610,340,250,25);

        frame.add(btnExit);
        btnExit.setBounds(450,450,80,25);
        btnExit.addActionListener(this);


        frame.setLayout(null);
        frame.setBounds(10,10,1000,600);
        frame.setVisible(true);
    }
    public void refreshTextFileds()
    {
		txtProgramName2.setText(null);
		txtEmployeeName.setText(null);
		txtTotalFee.setText(null);
		txtPaidFee.setText(null);
		txtDueFee.setText(null);
		txtEventAddress2.setText(null);
		txtProgramFinishedDate.setText(null);
		txtPaidDate.setText(null);
		txtProgramName.setText(null);
		txtClientName.setText(null);
		txtMobileNo.setText(null);
		txtGmailAddress.setText(null);
		txtEventAddress.setText(null);
		txtAdvancePaid.setText(null);
		txtAdvancePaidfee.setText(null);
		txtReceiveDate.setText(null);
	}
   	public void getDataTextField()
    {
       try
       {
           String sql = ("SELECT `OrderName`, `ClientName`, `MobileNo`, `Gmail`, `EventAddress`, `AdvancePaid`, `ReceiveDate` FROM `orderreceiveevent` WHERE `OrderID` = '"+txtProgramID.getText()+"'");
           dc.rs = dc.stat.executeQuery(sql);
           while(dc.rs.next())
           {
               txtProgramName.setText(dc.rs.getString("OrderName"));
               txtClientName.setText(dc.rs.getString("ClientName"));
               txtMobileNo.setText(dc.rs.getString("MobileNo"));
               txtGmailAddress.setText(dc.rs.getString("Gmail"));
               txtEventAddress.setText(dc.rs.getString("EventAddress"));
               txtAdvancePaid.setText(dc.rs.getString("AdvancePaid"));
               txtAdvancePaidfee.setText(dc.rs.getString("AdvancePaid"));
               txtReceiveDate.setText(dc.rs.getString("ReceiveDate"));


           }
       }
       catch(SQLException ae)
       {
           JOptionPane.showMessageDialog(null,ae);
       }
    }
    	public void getDataTextField2()
	    {
	       try
	       {
	           String sql = ("SELECT `ProgramName`, `EmployeesName`, `TotalFee`, `PaidFee`, `DueFee`, `EventAddress`, `ProgramFinishedDate`, `PaidDate` FROM `implementationevent` WHERE `ProgramID` = '"+txtProgramID.getText()+"'");
	           dc.rs = dc.stat.executeQuery(sql);
	           while(dc.rs.next())
	           {
	               txtProgramName2.setText(dc.rs.getString("ProgramName"));
	               txtEmployeeName.setText(dc.rs.getString("EmployeesName"));
	               txtTotalFee.setText(dc.rs.getString("TotalFee"));
	               txtPaidFee.setText(dc.rs.getString("PaidFee"));
	               txtDueFee.setText(dc.rs.getString("DueFee"));
	               txtEventAddress2.setText(dc.rs.getString("EventAddress"));
	               txtProgramFinishedDate.setText(dc.rs.getString("ProgramFinishedDate"));
	               txtPaidDate.setText(dc.rs.getString("PaidDate"));


	           }
	       }
	       catch(SQLException ae)
	       {
	           JOptionPane.showMessageDialog(null,ae);
	       }
    }


//*********************************************************************************************************
	public void keyPressed(KeyEvent ke)
	{

	}
	public void keyReleased(KeyEvent ke)
	{
		refreshTextFileds();
		getDataTextField();
		getDataTextField2();

	}
	public void keyTyped(KeyEvent ke)
	{

	}


	//******************************************************************************************************

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnExit)
		{
			frame.dispose();
		}
	}


    public static void main(String args[])
    {
        SearchEventsInformation searchEventInfo = new SearchEventsInformation();
    }

}
