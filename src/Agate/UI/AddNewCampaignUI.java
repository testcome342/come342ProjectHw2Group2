package Agate.UI;

import java.awt.event.ActionListener;

import javax.swing.*;



public class AddNewCampaignUI extends JFrame{
    /*Client*/
    private JLabel label1=new JLabel("Company Name");
    private JTextField firstLine = new JTextField(20);
    private JLabel label2=new JLabel("company Adress");
    private JTextField secondLine = new JTextField(20);
    private JLabel label3=new JLabel("contact Name");
    private JTextField thirdLine = new JTextField(20);
    private JButton clientButton=new JButton("Enter Client");
    private JTextField fourthLine = new JTextField(20);
    private JTextField fifthLine = new JTextField(20);
    private JTextField sixthLine = new JTextField(20);
    /*Campaign*/
    private JLabel label4=new JLabel("Campaign title");
    private JTextField firstLineCampaign = new JTextField(20);
    private JLabel label5=new JLabel("Campaign Start Date");

    private JTextField secondLineCampaign = new JTextField(20);
    private JLabel label6=new JLabel("Campaign Finish Date");
    private JTextField thirdLineCampaign = new JTextField(20);
    private JLabel label7=new JLabel("Estimated Cost");
    private JTextField fourthLineCampaign = new JTextField(20);
    private JButton campaignButton=new JButton("Enter Campaign");
    private JTextField textfieldCampaign1 = new JTextField(20);

    private JTextField  textfieldCampaign2 = new JTextField(20);
    private JTextField  textfieldCampaign3= new JTextField(20);
    private JTextField  textfieldCampaign4= new JTextField(20);

    public void startInterface() {
        System.out.println("Star System of Agate");
    }


    public AddNewCampaignUI() {

        JPanel clientPanel=new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,500);
		/*Client*/
        clientPanel.add(label1);
        clientPanel.add(firstLine);
        clientPanel.add(label2);
        clientPanel.add(secondLine);
        clientPanel.add(label3);
        clientPanel.add(thirdLine);
        clientPanel.add(clientButton);
        clientPanel.add(fourthLine);
        clientPanel.add(fifthLine);
        clientPanel.add(sixthLine);
		/*Campaign*/
        clientPanel.add(label4);
        clientPanel.add(firstLineCampaign);
        clientPanel.add(label5);
        clientPanel.add(secondLineCampaign);
        clientPanel.add(label6);
        clientPanel.add(thirdLineCampaign);
        clientPanel.add(label7);
        clientPanel.add(fourthLineCampaign);
        clientPanel.add(campaignButton);
        clientPanel.add(textfieldCampaign1);
        clientPanel.add(textfieldCampaign2);
        clientPanel.add(textfieldCampaign3);
        clientPanel.add(textfieldCampaign4);

        this.add(clientPanel);

    }
    /*client get label*/
    public String  getFirstLine() {
        return firstLine.getText();
    }

    public String getSecondLine() {
        return secondLine.getText();
    }

    public String  getThirdLine() {
        return thirdLine.getText();
    }

    /*client set textfield*/
    public void setFourthLine(String solution1) {
        fourthLine.setText(solution1);
    }
    public void setFifthLine(String solution2) {
        fifthLine.setText(solution2);
    }
    public void setSixthLine(String solution3) {
        sixthLine.setText(solution3);
    }
    /*client button*/
    public void addClientListener(ActionListener listenForClientButton) {
        clientButton.addActionListener(listenForClientButton);
    }

    /*campaign get label*/
    public String getFirstLineCampaign() {
        return firstLineCampaign.getText();
    }
    public String getSecondLineCampaign() {
        return secondLineCampaign.getText();
    }
    public String getThirdLineCampaign() {
        return thirdLineCampaign.getText();
    }
    public String getFourthLineCampaign() {
        return fourthLineCampaign.getText();
    }

    /*campaign set textfield*/
    public void setTextfieldCampaign1(String solution4) {
        textfieldCampaign1.setText(solution4);
    }
    public void setTextfieldCampaign2(String solution5) {
        textfieldCampaign2.setText(solution5);
    }
    public void setTextfieldCampaign3(String solution6) {
        textfieldCampaign3.setText(solution6);
    }
    public void setTextfieldCampaign4(String solution7) {
        textfieldCampaign4.setText(solution7);
    }
    /*campaign button*/
    public void addCampaignListener(ActionListener listenForCampaignButton) {
        campaignButton.addActionListener(listenForCampaignButton);
    }
    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this,errorMessage);
    }

}