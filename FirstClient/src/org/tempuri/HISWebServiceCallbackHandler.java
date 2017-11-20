/**
 * HISWebServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package org.tempuri;


/**
 *  HISWebServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class HISWebServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public HISWebServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public HISWebServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getYYT_XXBG method
     * override this method for handling normal response from getYYT_XXBG operation
     */
    public void receiveResultgetYYT_XXBG(
        org.tempuri.HISWebServiceStub.GetYYT_XXBGResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getYYT_XXBG operation
     */
    public void receiveErrorgetYYT_XXBG(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createCardPatInfo method
     * override this method for handling normal response from createCardPatInfo operation
     */
    public void receiveResultcreateCardPatInfo(
        org.tempuri.HISWebServiceStub.CreateCardPatInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createCardPatInfo operation
     */
    public void receiveErrorcreateCardPatInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getGhlb method
     * override this method for handling normal response from getGhlb operation
     */
    public void receiveResultgetGhlb(
        org.tempuri.HISWebServiceStub.GetGhlbResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getGhlb operation
     */
    public void receiveErrorgetGhlb(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getYYT_XDTBG method
     * override this method for handling normal response from getYYT_XDTBG operation
     */
    public void receiveResultgetYYT_XDTBG(
        org.tempuri.HISWebServiceStub.GetYYT_XDTBGResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getYYT_XDTBG operation
     */
    public void receiveErrorgetYYT_XDTBG(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateZYYJJ method
     * override this method for handling normal response from updateZYYJJ operation
     */
    public void receiveResultupdateZYYJJ(
        org.tempuri.HISWebServiceStub.UpdateZYYJJResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateZYYJJ operation
     */
    public void receiveErrorupdateZYYJJ(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for appNoList method
     * override this method for handling normal response from appNoList operation
     */
    public void receiveResultappNoList(
        org.tempuri.HISWebServiceStub.AppNoListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from appNoList operation
     */
    public void receiveErrorappNoList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getItemData method
     * override this method for handling normal response from getItemData operation
     */
    public void receiveResultgetItemData(
        org.tempuri.HISWebServiceStub.GetItemDataResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getItemData operation
     */
    public void receiveErrorgetItemData(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for dOCHBList method
     * override this method for handling normal response from dOCHBList operation
     */
    public void receiveResultdOCHBList(
        org.tempuri.HISWebServiceStub.DOCHBListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from dOCHBList operation
     */
    public void receiveErrordOCHBList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for sapInterface method
     * override this method for handling normal response from sapInterface operation
     */
    public void receiveResultsapInterface(
        org.tempuri.HISWebServiceStub.SapInterfaceResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from sapInterface operation
     */
    public void receiveErrorsapInterface(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getYYT_ZQGSZSYBG method
     * override this method for handling normal response from getYYT_ZQGSZSYBG operation
     */
    public void receiveResultgetYYT_ZQGSZSYBG(
        org.tempuri.HISWebServiceStub.GetYYT_ZQGSZSYBGResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getYYT_ZQGSZSYBG operation
     */
    public void receiveErrorgetYYT_ZQGSZSYBG(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for msgInterface method
     * override this method for handling normal response from msgInterface operation
     */
    public void receiveResultmsgInterface(
        org.tempuri.HISWebServiceStub.MsgInterfaceResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from msgInterface operation
     */
    public void receiveErrormsgInterface(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getYYT_YDBG method
     * override this method for handling normal response from getYYT_YDBG operation
     */
    public void receiveResultgetYYT_YDBG(
        org.tempuri.HISWebServiceStub.GetYYT_YDBGResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getYYT_YDBG operation
     */
    public void receiveErrorgetYYT_YDBG(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPeopleFeeStatus method
     * override this method for handling normal response from getPeopleFeeStatus operation
     */
    public void receiveResultgetPeopleFeeStatus(
        org.tempuri.HISWebServiceStub.GetPeopleFeeStatusResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPeopleFeeStatus operation
     */
    public void receiveErrorgetPeopleFeeStatus(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getDoctorDe method
     * override this method for handling normal response from getDoctorDe operation
     */
    public void receiveResultgetDoctorDe(
        org.tempuri.HISWebServiceStub.GetDoctorDeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getDoctorDe operation
     */
    public void receiveErrorgetDoctorDe(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getsfzy method
     * override this method for handling normal response from getsfzy operation
     */
    public void receiveResultgetsfzy(
        org.tempuri.HISWebServiceStub.GetsfzyResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getsfzy operation
     */
    public void receiveErrorgetsfzy(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getDoctorList method
     * override this method for handling normal response from getDoctorList operation
     */
    public void receiveResultgetDoctorList(
        org.tempuri.HISWebServiceStub.GetDoctorListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getDoctorList operation
     */
    public void receiveErrorgetDoctorList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAdmByCardNo method
     * override this method for handling normal response from getAdmByCardNo operation
     */
    public void receiveResultgetAdmByCardNo(
        org.tempuri.HISWebServiceStub.GetAdmByCardNoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAdmByCardNo operation
     */
    public void receiveErrorgetAdmByCardNo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for bankAddDeposit method
     * override this method for handling normal response from bankAddDeposit operation
     */
    public void receiveResultbankAddDeposit(
        org.tempuri.HISWebServiceStub.BankAddDepositResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from bankAddDeposit operation
     */
    public void receiveErrorbankAddDeposit(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for accSearch method
     * override this method for handling normal response from accSearch operation
     */
    public void receiveResultaccSearch(
        org.tempuri.HISWebServiceStub.AccSearchResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from accSearch operation
     */
    public void receiveErroraccSearch(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getChargetariff method
     * override this method for handling normal response from getChargetariff operation
     */
    public void receiveResultgetChargetariff(
        org.tempuri.HISWebServiceStub.GetChargetariffResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getChargetariff operation
     */
    public void receiveErrorgetChargetariff(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getYYT_DTXYJCBG method
     * override this method for handling normal response from getYYT_DTXYJCBG operation
     */
    public void receiveResultgetYYT_DTXYJCBG(
        org.tempuri.HISWebServiceStub.GetYYT_DTXYJCBGResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getYYT_DTXYJCBG operation
     */
    public void receiveErrorgetYYT_DTXYJCBG(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getBillDetailByAd method
     * override this method for handling normal response from getBillDetailByAd operation
     */
    public void receiveResultgetBillDetailByAd(
        org.tempuri.HISWebServiceStub.GetBillDetailByAdResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getBillDetailByAd operation
     */
    public void receiveErrorgetBillDetailByAd(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getYYT_CTBG method
     * override this method for handling normal response from getYYT_CTBG operation
     */
    public void receiveResultgetYYT_CTBG(
        org.tempuri.HISWebServiceStub.GetYYT_CTBGResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getYYT_CTBG operation
     */
    public void receiveErrorgetYYT_CTBG(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for iDCardCheck method
     * override this method for handling normal response from iDCardCheck operation
     */
    public void receiveResultiDCardCheck(
        org.tempuri.HISWebServiceStub.IDCardCheckResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from iDCardCheck operation
     */
    public void receiveErroriDCardCheck(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for dOCKSList method
     * override this method for handling normal response from dOCKSList operation
     */
    public void receiveResultdOCKSList(
        org.tempuri.HISWebServiceStub.DOCKSListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from dOCKSList operation
     */
    public void receiveErrordOCKSList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for patChargeList method
     * override this method for handling normal response from patChargeList operation
     */
    public void receiveResultpatChargeList(
        org.tempuri.HISWebServiceStub.PatChargeListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from patChargeList operation
     */
    public void receiveErrorpatChargeList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for mainMethod method
     * override this method for handling normal response from mainMethod operation
     */
    public void receiveResultmainMethod(
        org.tempuri.HISWebServiceStub.MainMethodResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from mainMethod operation
     */
    public void receiveErrormainMethod(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for testDBStatus method
     * override this method for handling normal response from testDBStatus operation
     */
    public void receiveResulttestDBStatus(
        org.tempuri.HISWebServiceStub.TestDBStatusResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from testDBStatus operation
     */
    public void receiveErrortestDBStatus(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getBaseCardPrice method
     * override this method for handling normal response from getBaseCardPrice operation
     */
    public void receiveResultgetBaseCardPrice(
        org.tempuri.HISWebServiceStub.GetBaseCardPriceResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getBaseCardPrice operation
     */
    public void receiveErrorgetBaseCardPrice(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for netTest method
     * override this method for handling normal response from netTest operation
     */
    public void receiveResultnetTest(
        org.tempuri.HISWebServiceStub.NetTestResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from netTest operation
     */
    public void receiveErrornetTest(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getYYT_DTXDTBG method
     * override this method for handling normal response from getYYT_DTXDTBG operation
     */
    public void receiveResultgetYYT_DTXDTBG(
        org.tempuri.HISWebServiceStub.GetYYT_DTXDTBGResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getYYT_DTXDTBG operation
     */
    public void receiveErrorgetYYT_DTXDTBG(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addDeposit method
     * override this method for handling normal response from addDeposit operation
     */
    public void receiveResultaddDeposit(
        org.tempuri.HISWebServiceStub.AddDepositResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addDeposit operation
     */
    public void receiveErroraddDeposit(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for oPRegist method
     * override this method for handling normal response from oPRegist operation
     */
    public void receiveResultoPRegist(
        org.tempuri.HISWebServiceStub.OPRegistResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from oPRegist operation
     */
    public void receiveErroroPRegist(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for editInfo method
     * override this method for handling normal response from editInfo operation
     */
    public void receiveResulteditInfo(
        org.tempuri.HISWebServiceStub.EditInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from editInfo operation
     */
    public void receiveErroreditInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for yPrint method
     * override this method for handling normal response from yPrint operation
     */
    public void receiveResultyPrint(
        org.tempuri.HISWebServiceStub.YPrintResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from yPrint operation
     */
    public void receiveErroryPrint(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAppNo method
     * override this method for handling normal response from getAppNo operation
     */
    public void receiveResultgetAppNo(
        org.tempuri.HISWebServiceStub.GetAppNoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAppNo operation
     */
    public void receiveErrorgetAppNo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getItemDataPrint method
     * override this method for handling normal response from getItemDataPrint operation
     */
    public void receiveResultgetItemDataPrint(
        org.tempuri.HISWebServiceStub.GetItemDataPrintResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getItemDataPrint operation
     */
    public void receiveErrorgetItemDataPrint(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getXFList method
     * override this method for handling normal response from getXFList operation
     */
    public void receiveResultgetXFList(
        org.tempuri.HISWebServiceStub.GetXFListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getXFList operation
     */
    public void receiveErrorgetXFList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getBillInfo method
     * override this method for handling normal response from getBillInfo operation
     */
    public void receiveResultgetBillInfo(
        org.tempuri.HISWebServiceStub.GetBillInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getBillInfo operation
     */
    public void receiveErrorgetBillInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for autoOPBillCharge method
     * override this method for handling normal response from autoOPBillCharge operation
     */
    public void receiveResultautoOPBillCharge(
        org.tempuri.HISWebServiceStub.AutoOPBillChargeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from autoOPBillCharge operation
     */
    public void receiveErrorautoOPBillCharge(java.lang.Exception e) {
    }
}
