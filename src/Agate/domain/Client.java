package Agate.domain;
import java.util.Scanner;



public class Client {
    public String companyName;
    public String companyAddress;
    public String contactName;

    public void getClientCampaigns() {

    }
    public void addNewCampaign() {

    }
    public String getCompanyName() {
        return companyName;

    }
    public String getCompanyAddress() {
        return companyAddress;

    }
    public String getContactName() {
        return contactName;

    }
    public void assignClient(String companyName,String companyAddress,String contactName) {

        this.companyName=companyName;
        this.companyAddress=companyAddress;
        this.contactName=contactName;


    }
}