package model;

import java.util.ArrayList; 
import java.util.List;
    
public class Client { 
    private String companyName; 
    private String companyAddress; 
    private String contactName; 
    private List<Campaign> CampaignList = new ArrayList<Campaign>();
        
    public Client(){
        //PINAR
    }
       
    public List<Campaign> getClientCampaign(){ 
        return CampaignList; 
    } 
    public void setCompanyName(String cname){ 
        companyName=cname; 
    } 
    public void setCompanyAddress(String cadd){ 
        companyAddress=cadd; 
    } 
    public void setContactName(String conName){ 
        contactName=conName; 
    } 
    public String getContactName(){ 
        return contactName; 
    } 
    public String getCompanyName(){
        return companyName;
    } 
    public String getCompanyAddress(){
        return companyAddress; 
    }
    
    public void addNewCampaign(Campaign campaign) {
        this.CampaignList.add(campaign);
    }
}    