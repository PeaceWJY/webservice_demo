package com.lxl.test;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;  
import org.apache.axis2.addressing.EndpointReference;  
import org.apache.axis2.client.Options;  
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;
import org.tempuri.HISWebServiceStub;
import org.tempuri.HISWebServiceStub.MainMethod;
import org.tempuri.HISWebServiceStub.Input;

public class FirstClientTest {
	public static void main(String[] args) throws Exception{
		HISWebServiceStub stub = new HISWebServiceStub();  
        stub._getServiceClient().getOptions().setProperty(org.apache.axis2.transport.http.HTTPConstants.CHUNKED, Boolean.FALSE); 
        MainMethod mainMethod = new MainMethod();
        Input input = new Input();
        input.setSourceName("esb");
        input.setOpNum("001");
        input.setOpControl("<data><patientid>PID000010003</patientid><inPara1></inPara1><inPara2></inPara2><inPara3></inPara3><inPara4></inPara4><inPara5></inPara5><inPara6></inPara6></data>");
        input.setOpData("");
        mainMethod.setInput(input);
          
        String result = stub.mainMethod(mainMethod).getMainMethodResult();
        System.out.println(result);
	}

	public static void fun1s(String args[]) throws AxisFault{  
		   //  使用RPC方式调用WebService          
//		    RPCServiceClient serviceClient = new RPCServiceClient();  
//		    Options options = serviceClient.getOptions();  
//		    //  指定调用WebService的URL  
//		    EndpointReference targetEPR = new EndpointReference("http://localhost:8080/axis2/services/HelloService");  
//		    options.setTo(targetEPR);  
//		    //  指定sayName方法的参数值  
//		    Object[] opAddEntryArgs = new Object[] {"美女"};  
//		    //  指定sayName方法返回值的数据类型的Class对象  
//		    Class[] classes = new Class[] {String.class};  
//		    //  指定要调用的sayName方法及WSDL文件的命名空间  
//		    QName opAddEntry = new QName("http://service.lxl.com", "sayName");  
//		    //  调用sayName方法并输出该方法的返回值  
//		    System.out.println(serviceClient.invokeBlocking(opAddEntry, opAddEntryArgs, classes)[0]);
		    
		RPCServiceClient serviceClient = new RPCServiceClient();
	    Options options = serviceClient.getOptions();  
	    //指定调用WebService的URL  
	    EndpointReference targetEPR = new EndpointReference("http://192.168.1.11:8090/HISWebService.asmx");  
	    options.setTo(targetEPR);  
	    options.setAction("http://tempuri.org/MainMethod");
	    //设置不受限制
	    options.setProperty(HTTPConstants.CHUNKED, "false");
	    
	    OMFactory fac = OMAbstractFactory.getOMFactory();
	    OMNamespace omNs = fac.createOMNamespace("http://tempuri.org/", "");  
        OMElement method = fac.createOMElement("MainMethod", omNs);
        
        OMElement name = fac.createOMElement("prestr", omNs);// 设置入参名称  
        OMElement name2 = fac.createOMElement("key", omNs);// 设置入参名称  
        name.setText("hawei");// 设置入参值  
        name2.setText("6181a1fb89564b589283ad578baa7d5e");
        
        method.addChild(name);  
        method.addChild(name2);  
        method.build();  
        System.out.println("method：" + method.toString());  
        OMElement response = serviceClient.sendReceive(method);  
        System.out.println("response:" + response);  
        OMElement elementReturn = response.getFirstElement();  
        System.out.println("result:" + elementReturn.getText()); 
	    
	    
	    //指定要调用的MainMethod方法及WSDL文件的命名空间  
	    QName opAddEntry = new QName("http://tempuri.org/", "MainMethod");    
	    //指定MainMethod方法的参数值  
	    Object[] opAddEntryArgs = new Object[] {"esb","001",  
                "<data>"  
                +"<patientid>12354</patientid>"  
                +"<inPara1></inPara1>"+"<inPara2></inPara2>"+"<inPara3></inPara3>"
                +"<inPara4></inPara4>"+"<inPara5></inPara5>"+"<inPara6></inPara6>"  
                +"</data>",
                ""}; 
	    //指定MainMethod方法返回值的数据类型的Class对象  0
	    Class[] classes = new Class[] {String.class};  
	    //调用sayName方法并输出该方法的返回值  
	    System.out.println(serviceClient.invokeBlocking(opAddEntry, opAddEntryArgs, classes)[0]);

		}
}