package view;

import com.view.utils.ADFUtils;
import com.view.utils.JSFUtils;

import java.math.BigDecimal;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import model.vo.MsfLetter_VORowImpl;

import oracle.adf.model.OperationBinding;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.Row;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;


public class AddEditMSF {
    private RichInputText loanAmount;
    private RichInputDate loandEffectiveDate;

    public AddEditMSF() {
        super();
    }

    public void setOrgId() {

        //  ADFContext.getCurrent().getSessionScope().put("personId", "100000001537088");

        Object obj = ADFContext.getCurrent()
                               .getSessionScope()
                               .get("personId");
        ViewObject LineVo =
            ADFUtils.getApplicationModuleForDataControl("Oando_AMDataControl").findViewObject("Employee_View_ROVO");
        ViewCriteria viewCriteria = LineVo.createViewCriteria();
        ViewCriteriaRow viewCriteriaRow = viewCriteria.createViewCriteriaRow();
        viewCriteriaRow.setAttribute("PersonId", obj);
        viewCriteria.addRow(viewCriteriaRow);
        LineVo.applyViewCriteria(viewCriteria);
        LineVo.executeQuery();
        ////  System.out.println("LineVo Query ----" + LineVo.getQuery());
        //  System.out.println("Person Id ----" + obj);

        if (LineVo.getEstimatedRowCount() > 0) {
            Row row = LineVo.first();
            row.getAttribute("BusinessUnitId");
            row.getAttribute("PersonNumber");
            row.getAttribute("FullName");
            row.getAttribute("EmailAddress");
            row.getAttribute("BusinessUnitName");
            row.getAttribute("Cadre");
            //            System.out.println(row.getAttribute("PersonNumber"));
            //            System.out.println(row.getAttribute("FullName"));
            //            System.out.println(row.getAttribute("EmailAddress"));
            //            System.out.println(row.getAttribute("BusinessUnitName"));
            Object orgObj = row.getAttribute("BusinessUnitId");
            ADFContext.getCurrent()
                      .getSessionScope()
                      .put("orgId", orgObj);
            //System.out.println("111111111");
            ViewObject MSFVo =
                ADFUtils.getApplicationModuleForDataControl("Oando_AMDataControl").findViewObject("MsfLetter_VO");
            Row newRow = MSFVo.createRow();
            newRow.setAttribute("PersonId", obj);
            newRow.setAttribute("Name_Trns", row.getAttribute("FullName"));
            newRow.setAttribute("Number_Trns", row.getAttribute("PersonNumber"));
            newRow.setAttribute("Email_Trns", row.getAttribute("EmailAddress"));
            newRow.setAttribute("Group_Trns", row.getAttribute("BusinessUnitName"));
            newRow.setAttribute("BusinessUnitId", row.getAttribute("BusinessUnitId"));
            newRow.setAttribute("Trans_Cadre", row.getAttribute("Cadre"));
            MSFVo.insertRow(newRow);


        }
    }

    public void onClickSave(ActionEvent actionEvent) {
        // Add event code here...
        //        DCIteratorBinding hdrIter = ADFUtils.findIterator("MsfLetter_VOIterator");
        //        MsfLetter_VORowImpl hdrRow = (MsfLetter_VORowImpl) hdrIter.getCurrentRow();
        //        hdrRow.setApprovalStatus("DRAFT");
        //
        //        ViewObject r = ADFUtils.findIterator("MsfLetter_VOIterator").getViewObject();
        //        BigDecimal gross =
        //            (r.getCurrentRow().getAttribute("GrossSalary") == null ? new BigDecimal(0) :
        //             (BigDecimal) r.getCurrentRow().getAttribute("GrossSalary"));
        //        r.getCurrentRow().setAttribute("GrossSalary", gross);
        //        BigDecimal eAmnt =
        //            (r.getCurrentRow().getAttribute("EntitledAmount") == null ? new BigDecimal(0) :
        //             (BigDecimal) r.getCurrentRow().getAttribute("EntitledAmount"));
        //        r.getCurrentRow().setAttribute("EntitledAmount", eAmnt);
        //
        //        ADFUtils.findOperation("Commit").execute();
        //        JSFUtils.addFacesInformationMessage("MSF Letter Saved Successfully");

    }


    //     public void onClickSubmit()
    //     {
    //        // Add event code here...
    //
    //    boolean result = false;
    //    if (!result)
    //    {
    //    DCIteratorBinding hdrIter = ADFUtils.findIterator("MsfLetter_VOIterator");
    //    MsfLetter_VORowImpl hdrRow = (MsfLetter_VORowImpl) hdrIter.getCurrentRow();
    //    hdrRow.setApprovalStatus("SUBMITTED FOR APPROVAL");
    //    String xmlData = null;
    //    String[] a = null;
    //    String MSFWSDL = null;
    //    MSFWSDL = ApprovalPayload.MSF_WSDL;
    //    ViewObject HdrVo = ADFUtils.findIterator("MsfLetter_VOIterator").getViewObject();
    //    String p_EmployeeName = HdrVo.getCurrentRow().getAttribute("Name_Trns") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                 .getAttribute("Name_Trns")
    //                                                                                                 .toString();
    //    String p_EmployeeNumber =
    //        HdrVo.getCurrentRow().getAttribute("Number_Trns") == null ? " " :
    //        HdrVo.getCurrentRow()
    //                                                                                                     .getAttribute("Number_Trns")
    //                                                                                                     .toString();
    //    String p_Email = HdrVo.getCurrentRow().getAttribute("Email_Trns") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                           .getAttribute("Email_Trns")
    //                                                                                           .toString();
    //    String p_BusinessGroup = HdrVo.getCurrentRow().getAttribute("Group_Trns") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                   .getAttribute("Group_Trns")
    //                                                                                                   .toString();
    //    String p_Cadre =
    //        HdrVo.getCurrentRow().getAttribute("Trans_Cadre") == null ? " " :
    //        HdrVo.getCurrentRow()
    //                                                                                                           .getAttribute("Trans_Cadre")
    //                                                                                                           .toString();
    //
    //    String p_RequestId = HdrVo.getCurrentRow().getAttribute("MsfRequestId") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                    .getAttribute("MsfRequestId")
    //                                                                                                    .toString();
    //
    //    String p_RequestNo =
    //        HdrVo.getCurrentRow().getAttribute("MsfRequestNo") == null ? " " :
    //        HdrVo.getCurrentRow()
    //                                                                                                               .getAttribute("MsfRequestNo")
    //                                                                                                               .toString();
    //    String p_ApprovalStatus =
    //        HdrVo.getCurrentRow().getAttribute("ApprovalStatus") == null ? " " :
    //        HdrVo.getCurrentRow()
    //                                                                                                        .getAttribute("ApprovalStatus")
    //                                                                                                        .toString();
    //
    //    String p_Comments = HdrVo.getCurrentRow().getAttribute("Comments") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                            .getAttribute("Comments")
    //                                                                                            .toString();
    //
    //    String p_PersonId = HdrVo.getCurrentRow().getAttribute("PersonId") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                            .getAttribute("PersonId")
    //                                                                                            .toString();
    //        String p_BUSINESSUNITID = HdrVo.getCurrentRow().getAttribute("BusinessUnitId") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                .getAttribute("BusinessUnitId")
    //                                                                                                .toString();
    //        String p_MSFREQUESTDATE = HdrVo.getCurrentRow().getAttribute("MsfRequestDate") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                .getAttribute("MsfRequestDate")
    //                                                                                                .toString();
    //        String p_MsfLetter = HdrVo.getCurrentRow().getAttribute("MsfLetter") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                .getAttribute("MsfLetter")
    //                                                                                                .toString();
    //        String p_BankLetter = HdrVo.getCurrentRow().getAttribute("BankLetter") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                .getAttribute("BankLetter")
    //                                                                                                .toString();
    //        String p_MSFRECIPIENTNAME = HdrVo.getCurrentRow().getAttribute("MsfRecipientName") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                .getAttribute("MsfRecipientName")
    //                                                                                                .toString();
    //        String p_MsfRecipientDesignation = HdrVo.getCurrentRow().getAttribute("MsfRecipientDesignation") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                .getAttribute("MsfRecipientDesignation")
    //                                                                                                .toString();
    //        String p_LoanEffectiveDate = HdrVo.getCurrentRow().getAttribute("LoanEffectiveDate") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                .getAttribute("LoanEffectiveDate")
    //                                                                                                .toString();
    //        String p_LoanAmount = HdrVo.getCurrentRow().getAttribute("LoanAmount") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                .getAttribute("LoanAmount")
    //                                                                                                .toString();
    //        String p_BankName = HdrVo.getCurrentRow().getAttribute("BankName") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                .getAttribute("BankName")
    //                                                                                                .toString();
    //        String p_BankAddress1 = HdrVo.getCurrentRow().getAttribute("BankAddress1") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                .getAttribute("BankAddress1")
    //                                                                                                .toString();
    //
    //        String p_BankAddress2 = HdrVo.getCurrentRow().getAttribute("BankAddress2") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                .getAttribute("BankAddress2")
    //                                                                                                .toString();
    //        String p_EntitledAmount = HdrVo.getCurrentRow().getAttribute("EntitledAmount") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                .getAttribute("EntitledAmount")
    //                                                                                                .toString();
    //        String p_GrossSalary = HdrVo.getCurrentRow().getAttribute("GrossSalary") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                .getAttribute("GrossSalary")
    //                                                                                                .toString();
    //        String p_NextApprover = HdrVo.getCurrentRow().getAttribute("NextApprover") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                .getAttribute("NextApprover")
    //                                                                                                .toString();
    //        String p_PreviousApprover = HdrVo.getCurrentRow().getAttribute("PreviousApprover") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                .getAttribute("PreviousApprover")
    //                                                                                                .toString();
    //
    //        String p_ApproverComments = HdrVo.getCurrentRow().getAttribute("ApproverComments") == null ? " " : HdrVo.getCurrentRow()
    //                                                                                                .getAttribute("ApproverComments")
    //                                                                                                .toString();
    //
    //                xmlData =
    //                    ApprovalPayload.businessTypeXMLData(p_EmployeeName, p_EmployeeNumber, p_Email, p_BusinessGroup,
    //                                                        p_Cadre, p_RequestId, p_RequestNo, p_ApprovalStatus,
    //                                                        p_Comments, p_ApproverComments, p_PersonId, p_BUSINESSUNITID, p_MSFREQUESTDATE, p_MsfLetter,
    //                                                        p_BankLetter, p_PreviousApprover,p_NextApprover,p_GrossSalary,p_EntitledAmount,p_BankAddress2,p_BankAddress1,p_BankName,p_MsfRecipientDesignation,
    //                                                        p_LoanEffectiveDate,p_MSFRECIPIENTNAME,p_LoanAmount);
    //    System.err.println("xmlData =>" + xmlData);
    //    a = ApprovalProcess.invokeWsdl(xmlData, MSFWSDL, ApprovalPayload.MSF_METHOD);
    //    if (a[0] != null && a[0].equals("True")) {
    //        if (hdrRow != null) {
    //            OperationBinding binding = (OperationBinding) ADFUtils.findOperation("Commit").execute();
    //            hdrRow.setApprovalStatus("SUBMITTED");
    //        }
    //        JSFUtils.addFacesInformationMessage("MSF Letter Submitted Successfully");
    //
    //    } else {
    //        JSFUtils.addFacesInformationMessage("Error");
    //        hdrRow.setApprovalStatus("DRAFT");
    //
    //    }
    //
    //    }
    //
    //
    //     }


    public void onClickCancel(ActionEvent actionEvent) {
        // Add event code here...
        ViewObject HdrVO = ADFUtils.findIterator("MsfLetter_VOIterator").getViewObject();
        HdrVO.applyViewCriteria(null);
        HdrVO.executeQuery();
        ADFUtils.findOperation("Rollback").execute();
    }


    public void onClickSubmit(ActionEvent actionEvent) {
        // Add event code here...

    }

    public String onClickSaveAction() {
        if(checkRequiredFeilds()){
            ViewObject msfFormVO = ADFUtils.findIterator("MsfLetter_VOIterator").getViewObject();
            DCIteratorBinding hdrIter = ADFUtils.findIterator("MsfLetter_VOIterator");
            MsfLetter_VORowImpl hdrRow = (MsfLetter_VORowImpl) hdrIter.getCurrentRow();
            hdrRow.setApprovalStatus("DRAFT");

            ViewObject r = ADFUtils.findIterator("MsfLetter_VOIterator").getViewObject();
            BigDecimal gross =
                (r.getCurrentRow().getAttribute("GrossSalary") == null ? new BigDecimal(0) :
                 (BigDecimal) r.getCurrentRow().getAttribute("GrossSalary"));
            r.getCurrentRow().setAttribute("GrossSalary", gross);
            BigDecimal eAmnt =
                (r.getCurrentRow().getAttribute("EntitledAmount") == null ? new BigDecimal(0) :
                 (BigDecimal) r.getCurrentRow().getAttribute("EntitledAmount"));
            r.getCurrentRow().setAttribute("EntitledAmount", eAmnt);

            ADFUtils.findOperation("Commit").execute();
            JSFUtils.addFacesInformationMessage("MSF Letter Saved Successfully");
            msfFormVO.applyViewCriteria(null);
            msfFormVO.executeQuery();
            //  System.out.println("Get Query-------- " + msfFormVO.getQuery());
            // System.out.println("COuntnnn ----------- " + msfFormVO.getEstimatedRowCount());
            return "back";
        }else{
            return "";
        }
    }

    public String onClickSubmitAction() {
        this.onClickSaveAction();
        boolean result = false;
        boolean value = false;
        ViewObject HdrVo = ADFUtils.findIterator("MsfLetter_VOIterator").getViewObject();
        if (!result) {
            DCIteratorBinding hdrIter = ADFUtils.findIterator("MsfLetter_VOIterator");
            MsfLetter_VORowImpl hdrRow = (MsfLetter_VORowImpl) hdrIter.getCurrentRow();
            hdrRow.setApprovalStatus("SUBMITTED FOR APPROVAL");
            String xmlData = null;
            String[] a = null;
            String MSFWSDL = null;
            MSFWSDL = ApprovalPayload.MSF_WSDL;

            String p_EmployeeName = HdrVo.getCurrentRow().getAttribute("Name_Trns") == null ? " " : HdrVo.getCurrentRow()
                                                                                                         .getAttribute("Name_Trns")
                                                                                                         .toString();
            String p_EmployeeNumber =
                HdrVo.getCurrentRow().getAttribute("Number_Trns") == null ? " " :
                HdrVo.getCurrentRow()
                                                                                                             .getAttribute("Number_Trns")
                                                                                                             .toString();
            String p_Email = HdrVo.getCurrentRow().getAttribute("Email_Trns") == null ? " " : HdrVo.getCurrentRow()
                                                                                                   .getAttribute("Email_Trns")
                                                                                                   .toString();
            String p_BusinessGroup = HdrVo.getCurrentRow().getAttribute("Group_Trns") == null ? " " : HdrVo.getCurrentRow()
                                                                                                           .getAttribute("Group_Trns")
                                                                                                           .toString();
            String p_Cadre = HdrVo.getCurrentRow().getAttribute("Trans_Cadre") == null ? " " : HdrVo.getCurrentRow()
                                                                                                    .getAttribute("Trans_Cadre")
                                                                                                    .toString();

            String p_RequestId = HdrVo.getCurrentRow().getAttribute("MsfRequestId") == null ? " " : HdrVo.getCurrentRow()
                                                                                                         .getAttribute("MsfRequestId")
                                                                                                         .toString();

            String p_RequestNo = HdrVo.getCurrentRow().getAttribute("MsfRequestNo") == null ? " " : HdrVo.getCurrentRow()
                                                                                                         .getAttribute("MsfRequestNo")
                                                                                                         .toString();
            String p_ApprovalStatus =
                HdrVo.getCurrentRow().getAttribute("ApprovalStatus") == null ? " " :
                HdrVo.getCurrentRow()
                                                                                                                .getAttribute("ApprovalStatus")
                                                                                                                .toString();

            String p_Comments = HdrVo.getCurrentRow().getAttribute("Comments") == null ? " " : HdrVo.getCurrentRow()
                                                                                                    .getAttribute("Comments")
                                                                                                    .toString();

            String p_PersonId = HdrVo.getCurrentRow().getAttribute("PersonId") == null ? " " : HdrVo.getCurrentRow()
                                                                                                    .getAttribute("PersonId")
                                                                                                    .toString();
            String p_BUSINESSUNITID =
                HdrVo.getCurrentRow().getAttribute("BusinessUnitId") == null ? " " :
                HdrVo.getCurrentRow()
                                                                                                                .getAttribute("BusinessUnitId")
                                                                                                                .toString();
            String p_MSFREQUESTDATE =
                HdrVo.getCurrentRow().getAttribute("MsfRequestDate") == null ? " " :
                HdrVo.getCurrentRow()
                                                                                                                .getAttribute("MsfRequestDate")
                                                                                                                .toString();
            String p_MsfLetter = HdrVo.getCurrentRow().getAttribute("MsfLetter") == null ? " " : HdrVo.getCurrentRow()
                                                                                                      .getAttribute("MsfLetter")
                                                                                                      .toString();
            String p_BankLetter = HdrVo.getCurrentRow().getAttribute("BankLetter") == null ? " " : HdrVo.getCurrentRow()
                                                                                                        .getAttribute("BankLetter")
                                                                                                        .toString();
            String p_MSFRECIPIENTNAME =
                HdrVo.getCurrentRow().getAttribute("MsfRecipientName") == null ? " " :
                HdrVo.getCurrentRow()
                                                                                                                    .getAttribute("MsfRecipientName")
                                                                                                                    .toString();
            String p_MsfRecipientDesignation =
                HdrVo.getCurrentRow().getAttribute("MsfRecipientDesignation") == null ? " " : HdrVo.getCurrentRow()
                                                                                                   .getAttribute("MsfRecipientDesignation")
                                                                                                   .toString();
            String p_LoanEffectiveDate =
                HdrVo.getCurrentRow().getAttribute("LoanEffectiveDate") == null ? " " :
                HdrVo.getCurrentRow()
                                                                                                                      .getAttribute("LoanEffectiveDate")
                                                                                                                      .toString();
            String p_LoanAmount = HdrVo.getCurrentRow().getAttribute("LoanAmount") == null ? " " : HdrVo.getCurrentRow()
                                                                                                        .getAttribute("LoanAmount")
                                                                                                        .toString();
            String p_BankName = HdrVo.getCurrentRow().getAttribute("BankName") == null ? " " : HdrVo.getCurrentRow()
                                                                                                    .getAttribute("BankName")
                                                                                                    .toString();
            String p_BankAddress1 = HdrVo.getCurrentRow().getAttribute("BankAddress1") == null ? " " : HdrVo.getCurrentRow()
                                                                                                            .getAttribute("BankAddress1")
                                                                                                            .toString();

            String p_BankAddress2 = HdrVo.getCurrentRow().getAttribute("BankAddress2") == null ? " " : HdrVo.getCurrentRow()
                                                                                                            .getAttribute("BankAddress2")
                                                                                                            .toString();
            String p_EntitledAmount =
                HdrVo.getCurrentRow().getAttribute("EntitledAmount") == null ? " " :
                HdrVo.getCurrentRow()
                                                                                                                .getAttribute("EntitledAmount")
                                                                                                                .toString();
            String p_GrossSalary = HdrVo.getCurrentRow().getAttribute("GrossSalary") == null ? " " : HdrVo.getCurrentRow()
                                                                                                          .getAttribute("GrossSalary")
                                                                                                          .toString();
            String p_NextApprover = HdrVo.getCurrentRow().getAttribute("NextApprover") == null ? " " : HdrVo.getCurrentRow()
                                                                                                            .getAttribute("NextApprover")
                                                                                                            .toString();
            String p_PreviousApprover =
                HdrVo.getCurrentRow().getAttribute("PreviousApprover") == null ? " " :
                HdrVo.getCurrentRow()
                                                                                                                    .getAttribute("PreviousApprover")
                                                                                                                    .toString();

            String p_ApproverComments =
                HdrVo.getCurrentRow().getAttribute("ApproverComments") == null ? " " :
                HdrVo.getCurrentRow()
                                                                                                                    .getAttribute("ApproverComments")
                                                                                                                    .toString();

            xmlData =
                ApprovalPayload.businessTypeXMLData(p_EmployeeName, p_EmployeeNumber, p_Email, p_BusinessGroup, p_Cadre,
                                                    p_RequestId, p_RequestNo, p_ApprovalStatus, p_Comments,
                                                    p_ApproverComments, p_PersonId, p_BUSINESSUNITID, p_MSFREQUESTDATE,
                                                    p_MsfLetter, p_BankLetter, p_PreviousApprover, p_NextApprover,
                                                    p_GrossSalary, p_EntitledAmount, p_BankAddress2, p_BankAddress1,
                                                    p_BankName, p_MsfRecipientDesignation, p_LoanEffectiveDate,
                                                    p_MSFRECIPIENTNAME, p_LoanAmount);
            System.err.println("xmlData =>" + xmlData);
            a = ApprovalProcess.invokeWsdl(xmlData, MSFWSDL, ApprovalPayload.MSF_METHOD);
            if (a[0] != null && a[0].equals("True")) {
                if (hdrRow != null) {
                    OperationBinding binding = (OperationBinding) ADFUtils.findOperation("Commit").execute();
                    //  hdrRow.setApprovalStatus("SUBMITTED");
                }
                JSFUtils.addFacesInformationMessage("MSF Letter Submitted Successfully");
                value = true;
            } else {
                JSFUtils.addFacesInformationMessage("Error");
                hdrRow.setApprovalStatus("DRAFT");

            }

        }
        if (value) {
            HdrVo.applyViewCriteria(null);
            HdrVo.executeQuery();
            return "back";
        } else {
            return null;

        }
    }

    public void onChangeOfLoanAmt(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        BigDecimal loanAmt = new BigDecimal(0);
        ViewObject msfLetterVO = ADFUtils.findIterator("MsfLetter_VOIterator").getViewObject();
        if (valueChangeEvent.getNewValue() != null) {
            loanAmt = (BigDecimal) valueChangeEvent.getNewValue();
            BigDecimal entitledAmt =
                msfLetterVO.getCurrentRow().getAttribute("EntitledAmount") != null ?
                (BigDecimal) msfLetterVO.getCurrentRow().getAttribute("EntitledAmount") : new BigDecimal(0);
            if (loanAmt.compareTo(entitledAmt) == 1) {              
                JSFUtils.addFacesErrorMessage("Loan Amount Should be equal to or less than the Entitled Amount ");
                msfLetterVO.getCurrentRow().setAttribute("LoanAmount", "");
            }
        }
    }

    public void loanAmountMand(ValueChangeEvent valueChangeEvent) {
        System.err.println("CAME INNNN");
        loandEffectiveDate.setRequired(false);
        loanAmount.setRequired(false);
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        loandEffectiveDate.setRequired(true);
        loanAmount.setRequired(true);
        AdfFacesContext.getCurrentInstance().addPartialTarget(loandEffectiveDate);
        AdfFacesContext.getCurrentInstance().addPartialTarget(loanAmount);

        String loanAmt = valueChangeEvent.getNewValue().toString();
        if (loanAmt.equals("NO")) {
            System.err.println("CAME INNNN NO");
            loandEffectiveDate.setRequired(false);
            loanAmount.setRequired(false);
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            AdfFacesContext.getCurrentInstance().addPartialTarget(loanAmount);
            AdfFacesContext.getCurrentInstance().addPartialTarget(loandEffectiveDate);
        }
    }

    public void setLoanAmount(RichInputText loanAmount) {
        this.loanAmount = loanAmount;
    }

    public RichInputText getLoanAmount() {
        return loanAmount;
    }

    public void setLoandEffectiveDate(RichInputDate loandEffectiveDate) {
        this.loandEffectiveDate = loandEffectiveDate;
    }

    public RichInputDate getLoandEffectiveDate() {
        return loandEffectiveDate;
    }

    private boolean checkRequiredFeilds() {
        ViewObject vo = ADFUtils.findIterator("MsfLetter_VOIterator").getViewObject();
        Row row = vo.getCurrentRow();
        String bankLetter = row.getAttribute("BankLetter")!=null?row.getAttribute("BankLetter").toString():"0";
        String recName = row.getAttribute("MsfRecipientName")!=null?row.getAttribute("MsfRecipientName").toString():"0";
        String recDesi = row.getAttribute("MsfRecipientDesignation")!=null?row.getAttribute("MsfRecipientDesignation").toString():"0";
        String bankName = row.getAttribute("BankName")!=null?row.getAttribute("BankName").toString():"0";
        String reciAdd = row.getAttribute("BankAddress1")!=null?row.getAttribute("BankAddress1").toString():"0";
        String msfLetter = row.getAttribute("MsfLetter")!=null?row.getAttribute("MsfLetter").toString():"0";
        
        String loanAmt = row.getAttribute("LoanAmount")!=null?row.getAttribute("LoanAmount").toString():"-";
        String loanEffDate = row.getAttribute("LoanEffectiveDate")!=null?row.getAttribute("LoanEffectiveDate").toString():"0";
        
        if("0".equals(bankLetter)){
            JSFUtils.addFacesErrorMessage("Bank Letter is required !");
            return false;
        }
        if("0".equals(recName)){
            JSFUtils.addFacesErrorMessage("Recipient's Name is required !");
            return false;
        }
        if("0".equals(recDesi)){
            JSFUtils.addFacesErrorMessage("Recipient's Designation is required !");
            return false;
        }
        if("0".equals(bankName)){
            JSFUtils.addFacesErrorMessage("Bank Name is required !");
            return false;
        }
        if("0".equals(reciAdd)){
            JSFUtils.addFacesErrorMessage("Recipient's Address is required !");
            return false;
        }
        if("0".equals(msfLetter)){
            JSFUtils.addFacesErrorMessage("MSF Letter is required !");
            return false;
        }
        if("YES".equals(msfLetter)){
            if("-".equals(loanAmt)){
                JSFUtils.addFacesErrorMessage("Loan Amount is required !");
                return false;
            }
            if("0".equals(loanEffDate)){
                JSFUtils.addFacesErrorMessage("Loan Effective Date is required !");
                return false;
            }
        }
        
        return true;
    }
}
