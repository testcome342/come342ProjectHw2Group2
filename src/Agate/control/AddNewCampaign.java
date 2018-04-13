package Agate.control;

import Agate.UI.AddNewCampaignUI;
import Agate.domain.Campaign;
import Agate.domain.Client;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JTextField;

public class AddNewCampaign {



    private Client model1;
    private AddNewCampaignUI view;
    private Campaign model2;
    public AddNewCampaign(Client model1, AddNewCampaignUI view,Campaign model2) {
        this.model1 = model1;
        this.model2=model2;
        this.view = view;
        this.view.addClientListener(new ClientListener());
        this.view.addCampaignListener(new CampaignListener());
    }

    class ClientListener implements ActionListener{


        public void actionPerformed(ActionEvent arg0) {
            String companyName;
            String companyAddress;
            String contactName;


            companyName=view.getFirstLine();
            companyAddress=view.getSecondLine();
            contactName=view.getThirdLine();
            model1.assignClient(companyName, companyAddress, contactName);
            view.setFourthLine(model1.getCompanyName());
            view.setFifthLine(model1.getCompanyAddress());
            view.setSixthLine(model1.getContactName());



        }

    }
    class CampaignListener implements ActionListener{


        public void actionPerformed(ActionEvent arg0) {
            String title;
            String campaignStartDate;
            String campaignFinishDate;
            String estimatedCost;

            title=view.getFirstLineCampaign();
            campaignStartDate=view.getSecondLineCampaign();
            campaignFinishDate=view.getThirdLineCampaign();
            estimatedCost=view.getFourthLineCampaign();
            model2.createCampaign(title, campaignStartDate, campaignFinishDate, estimatedCost);
            view.setTextfieldCampaign1(model2.getTitle());
            view.setTextfieldCampaign2(model2.getCampaignStartDate());
            view.setTextfieldCampaign3(model2.getCampaignFinishDate());
            view.setTextfieldCampaign4(model2.getEstimatedCost());
        }

    }


}
