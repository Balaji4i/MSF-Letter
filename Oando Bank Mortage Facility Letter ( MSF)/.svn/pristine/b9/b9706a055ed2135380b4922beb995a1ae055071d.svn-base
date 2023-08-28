package view;


import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.TimeZone;

public class ApprovalPayload {
    public ApprovalPayload() {
        super();
    }
   
    
    //bUSINESS
     /***Cloud purpose un comment these section while deploying to TEST cloud **/ 
     public static final String BUDDY_CARE_WSDL = "http://oaosoatst-wls-1.sub08071802371.oandopaasvcn.oraclevcn.com:9073/soa-infra/services/default/BuddyCareApproval/bpelprocess1_client_ep?WSDL";
    //public static final String DUTY_ALLOWANCE_WSDL ="https://oaosoatest.oandoplc.com/soa-infra/services/default/ExtraDutyAllowanceApproval/allowanceapprovalprocess_client_ep?WSDL";
    public static final String BUDDY_CARE_METHOD = "process";
    
    /***Cloud purpose un comment these section while deploying to TEST cloud **/ 
    public static final String DUTY_ALLOWANCE_WSDL = "http://oaosoatst-wls-1.sub08071802371.oandopaasvcn.oraclevcn.com:9073/soa-infra/services/default/ExtraDutyAllowanceApproval/allowanceapprovalprocess_client_ep?WSDL";
    //public static final String DUTY_ALLOWANCE_WSDL ="https://oaosoatest.oandoplc.com/soa-infra/services/default/ExtraDutyAllowanceApproval/allowanceapprovalprocess_client_ep?WSDL";
    public static final String DUTY_ALLOWANCE_METHOD = "process";
    
    /***Cloud purpose un comment these section while deploying to TEST cloud **/ 
    public static final String UNSUBSCRIBE_WSDL = "http://oaosoatst-wls-1.sub08071802371.oandopaasvcn.oraclevcn.com:9073/soa-infra/services/default/BuddyCareSubscription/buddyunsubscribebpel_client_ep?WSDL";
    
    public static final String UNSUBSCRIBE_METHOD = "process";
   
    /***Cloud purpose un comment these section while deploying to PROD cloud **/    
   //public static final String DUTY_ALLOWANCE_WSDL ="http://oaosoaprd-wls-1.sub08071802370.oandopaasvcn.oraclevcn.com:9073/soa-infra/services/default/ExtraDutyAllowanceApproval/allowanceapprovalprocess_client_ep?WSDL";
    
   public static final String MSF_WSDL = "http://oaosoatst-wls-1.sub08071802371.oandopaasvcn.oraclevcn.com:9073/soa-infra/services/default/MSF_Letter_Approval/msf_bpel_client_ep?WSDL";
   
    /***Cloud purpose un comment these section while deploying to PROD cloud **/    
   // public static final String MSF_WSDL = "http://oaosoaprd-wls-1.sub08071802370.oandopaasvcn.oraclevcn.com:9073/soa-infra/services/default/MSF_Letter_Approval/msf_bpel_client_ep?WSDL";
    
   public static final String MSF_METHOD = "process";
    public static String businessTypeXMLData(String p_EmployeeName,String p_EmployeeNumber,String p_Email,String p_BusinessGroup,
                                                       String p_Cadre,String p_RequestId,String p_RequestNo,String p_ApprovalStatus,
                                                       String p_Comments,String p_ApproverComments,String p_PersonId,String p_BUSINESSUNITID,String p_MSFREQUESTDATE,String p_MsfLetter,
                                                       String p_BankLetter,String p_PreviousApprover,String p_NextApprover,String p_GrossSalary, String p_EntitledAmount, String p_BankAddress2,String p_BankAddress1,String p_BankName,String p_MsfRecipientDesignation,
                                                       String p_LoanEffectiveDate,String p_MSFRECIPIENTNAME,String p_LoanAmount )
                                              {
        String[] info=payloadHeader();          
        System.err.println("Created time===>"+info[0]);
        System.err.println("User===========>"+info[1]);
        System.err.println("Password=======>"+info[2]);
        System.err.println("End time=======>"+info[3]); 
        String xmlData="<soapenv:Envelope xmlns:msf=\"http://xmlns.oracle.com/MSF_Letter_Approval/MSF_Letter_Approval/MSF_BPEL\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" + 
        "   <soapenv:Header/>\n" +  
        "   <soapenv:Body>\n" + 
        "<msf:process>\n" + 
                "<msf:EMPLOYEE_NUMBER>"+p_EmployeeNumber+"</msf:EMPLOYEE_NUMBER>\n" + 
                "<msf:EMPLOYEE_NAME>"+p_EmployeeName+"</msf:EMPLOYEE_NAME>\n" + 
                "<msf:EMAIL_ADDRESS>"+p_Email+"</msf:EMAIL_ADDRESS>\n" + 
                "<msf:CADRE>"+p_Cadre+"</msf:CADRE>\n" + 
                "<msf:BUSINESS_GROUP>"+p_BusinessGroup+"</msf:BUSINESS_GROUP>\n" + 
                "<msf:HEADER>\n" + 
                "<msf:MSF_REQUEST_ID>"+p_RequestId+"</msf:MSF_REQUEST_ID>\n" + 
                "<msf:MSF_REQUEST_NO>"+p_RequestNo+"</msf:MSF_REQUEST_NO>\n" + 
                "<msf:PERSON_ID>"+p_PersonId+"</msf:PERSON_ID>\n" + 
                "<msf:BUSINESS_UNIT_ID>"+p_BUSINESSUNITID+"</msf:BUSINESS_UNIT_ID>\n" + 
                "<msf:MSF_REQUEST_DATE>"+p_MSFREQUESTDATE+"</msf:MSF_REQUEST_DATE>\n" + 
                "<msf:BANK_LETTER>"+p_BankLetter+"</msf:BANK_LETTER>\n" + 
                "<msf:MSF_LETTER>"+p_MsfLetter+"</msf:MSF_LETTER>\n" + 
                "<msf:MSF_RECIPIENT_NAME>"+p_MSFRECIPIENTNAME+"</msf:MSF_RECIPIENT_NAME>\n" + 
                "<msf:MSF_RECIPIENT_DESIGNATION>"+p_MsfRecipientDesignation+"</msf:MSF_RECIPIENT_DESIGNATION>\n" + 
                "<msf:LOAN_EFFECTIVE_DATE>"+p_LoanEffectiveDate+"</msf:LOAN_EFFECTIVE_DATE>\n" + 
                "<msf:BANK_NAME>"+p_BankName+"</msf:BANK_NAME>\n" + 
                "<msf:BANK_ADDRESS1>"+p_BankAddress1+"</msf:BANK_ADDRESS1>\n" + 
                "<msf:BANK_ADDRESS2>"+p_BankAddress2+"</msf:BANK_ADDRESS2>\n" + 
                "<msf:LOAN_AMOUNT>"+p_LoanAmount+"</msf:LOAN_AMOUNT>\n" + 
                "<msf:ENTITLED_AMOUNT>"+p_EntitledAmount+"</msf:ENTITLED_AMOUNT>\n" + 
                "<msf:COMMENTS>"+p_Comments+"</msf:COMMENTS>         \n" + 
                "<msf:APPROVAL_STATUS>"+p_ApprovalStatus+"</msf:APPROVAL_STATUS>\n" + 
                "<msf:PREVIOUS_APPROVER>"+p_PreviousApprover+"</msf:PREVIOUS_APPROVER> \n" + 
                "<msf:NEXT_APPROVER>"+p_NextApprover+"</msf:NEXT_APPROVER> \n" + 
                "<msf:APPROVER_COMMENTS>"+p_ApproverComments+"</msf:APPROVER_COMMENTS>        \n" + 
                
                "</msf:HEADER>\n" + 
         "     </msf:process>\n" + 
        "   </soapenv:Body>\n" + 
        "</soapenv:Envelope>";
               System.err.println("Totalxml"+xmlData);
               return xmlData;
        
        
   
       
    }


    public static String[] payloadHeader() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.000'Z'"); //Hours:Minutes:Seconds
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        java.util.Date date = new java.util.Date();
        long t = date.getTime();
        java.util.Date expDate;
        expDate = new java.util.Date(t + (10 * 600000000));
        String[] headerInfo = new String[4];
        headerInfo[0] = dateFormat.format(date);
        headerInfo[1] = "oaopdtst";
        headerInfo[2] = "O_0Pst#819";
        headerInfo[3] = dateFormat.format(expDate);
        return headerInfo;
    }
    
    public static String getUser(){        
        return null;
    }   
    
    
    public static String businessTypeXMLData1(String p_EmployeeName,String p_EmployeeNumber,String p_Email,
                                             String p_BusinessGroup,String p_Cadre,String p_AssignmentType,
                                             String p_BuddyCareNo,String p_TransDate, String p_DepartmentName,
                                             String p_PreviousApprover,String p_NextApprover,
                                             String p_ApprovalStatus,String p_Comments,String p_ApproverComments,
                                             ArrayList p_KbcPeriodId , ArrayList p_KnowBuddyCareId , 
                                             ArrayList p_EffectiveStartDate, ArrayList p_EffectiveEndate ,
                                             ArrayList p_CurrentAvailablityInd )
                                              {
        String[] info=payloadHeader();  
        String totalXml=null;
        String xmlData2="\n";
        System.err.println("Created time===>"+info[0]);
        System.err.println("User===========>"+info[1]);
        System.err.println("Password=======>"+info[2]);
        System.err.println("End time=======>"+info[3]);  
        String xmlData="<soapenv:Envelope xmlns:bud=\"http://xmlns.oracle.com/BuudyCare_subscription/BuddyCareSubscription/buddyunsubscribebpel\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" + 
        "   <soapenv:Header/>\n" +  
        "   <soapenv:Body>\n" + 
               " <bud:process>\n" + 
               "         <bud:EmployeeNo>"+p_EmployeeNumber+"</bud:EmployeeNo>\n" + 
               "         <bud:EmployeeName>"+p_EmployeeName+"</bud:EmployeeName>\n" +              
               "         <bud:EmailAddress>"+p_Email+"</bud:EmailAddress>\n" + 
               "         <bud:BusinessGroup>"+p_BusinessGroup+"</bud:BusinessGroup>\n" + 
               "         <bud:Cadre>"+p_Cadre+"</bud:Cadre>\n" +
               "         <bud:AssignmentType>"+p_AssignmentType+"</bud:AssignmentType>\n" +
               "         <bud:KnowBuddyCareNo>"+p_BuddyCareNo+"</bud:KnowBuddyCareNo>\n" +
               "         <bud:TransactionDate>"+p_TransDate+"</bud:TransactionDate>\n" +
               "         <bud:PreviousApprover>"+p_PreviousApprover+"</bud:PreviousApprover>\n" +
               "         <bud:NextApprover>"+p_NextApprover+"</bud:NextApprover>\n" +
               "         <bud:DepartmentName>"+p_DepartmentName+"</bud:DepartmentName>\n" +                 
               "         <bud:Comments>"+p_Comments+"</bud:Comments>\n" +
               "         <bud:Status>"+p_ApprovalStatus+"</bud:Status>\n" +
               "         <bud:ApproverComments>"+p_ApproverComments+"</bud:ApproverComments>\n" +
               "         <bud:SubscriptionStatus>"+p_ApprovalStatus+"</bud:SubscriptionStatus>\n" +
               "         <!--1 or more repetitions:-->\n" ;  
        for(int i=0;i<p_KbcPeriodId.size() ;i++){ 
                    String tempXml=
                      "         <bud:subscription_elements>\n" + 
                              "         <bud:KbcPeriodId>"+p_KbcPeriodId.get(i)+"</bud:KbcPeriodId>\n" + 
                              "         <bud:KnowBuddyCareId>"+p_KnowBuddyCareId.get(i)+"</bud:KnowBuddyCareId>\n" + 
                              "         <bud:EffectiveStartDate>"+p_EffectiveStartDate.get(i)+"</bud:EffectiveStartDate>\n" + 
                              "         <bud:EffectiveEndate>"+p_EffectiveEndate.get(i)+"</bud:EffectiveEndate>\n" + 
                              "         <bud:CurrentAvailablityInd>"+p_CurrentAvailablityInd.get(i)+"</bud:CurrentAvailablityInd>\n" + 
                      "         </bud:subscription_elements>\n" ;
                    xmlData2=xmlData2+"\n"+tempXml;
                          }
               String xmlData3 =  "      </bud:process>\n" + 
               "   </soapenv:Body>\n" + 
               "</soapenv:Envelope>";
               totalXml= xmlData+xmlData2+"\n"+xmlData3;
               System.err.println("Totalxml"+totalXml);
               return totalXml;
       
    }

    static String businessTypeXMLData(String p_EmployeeName, String p_EmployeeNumber, String p_Email,
                                      String p_BusinessGroup, String p_Cadre, String p_AssignmentType,
                                      String p_BuddyCareNo, String p_TransDate, String p_DepartmentName,
                                      String p_PreviousApprover, String p_NextApprover, String p_ApprovalStatus,
                                      String p_Comments, String p_ApproverComments, ArrayList<String> p_KbcPeriodId,
                                      ArrayList<String> p_KnowBuddyCareId, ArrayList<String> p_EffectiveStartDate,
                                      ArrayList<String> p_EffectiveEndate, ArrayList<String> p_CurrentAvailablityInd) {
        return null;
    }
}
