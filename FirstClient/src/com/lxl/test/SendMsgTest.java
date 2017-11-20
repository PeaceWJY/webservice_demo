package com.lxl.test;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

public class SendMsgTest {
	public static void main(String args[]) throws AxisFault{
		//  使用RPC方式调用WebService          
	    RPCServiceClient serviceClient = new RPCServiceClient();  
	    Options options = serviceClient.getOptions();  
	    //  指定调用WebService的URL  
	    EndpointReference targetEPR = new EndpointReference("http://localhost:8080/axis2/services/sendMsg");  
	    options.setTo(targetEPR);  
	    /**
	     * 指定sayName方法的参数值
	     * param1:CorpId
	     * param2:CorpSecret
	     * param3:用户id
	     * param4:消息内容
	     * */    
//	    Object[] opAddEntryArgs = new Object[] {"dingecf16f55b4d1467235c2f4657eb6378f","ZTG_YQS4XJzGOktfRUVCwBHlIynb9QXqZxViXM8Ly9oqfh0lhdNrlUl1ePxs07Kw","manager3122","next  hhhh"};  
	    Object[] opAddEntryArgs = new Object[] {"ding0bffa32d74a4a66135c2f4657eb6378f", "ZEUrEq174o6nEXUMRz8ycOXxLA7tEIqSdtF52okE50Byme0DOjg1f7UdM3Drszof", "0239202404468126428", "hiIamSAP"};
	    //  指定sendMsg方法返回值的数据类型的Class对象  
	    Class[] classes = new Class[] {String.class};  
	    //  指定要调用的sendMsg方法及WSDL文件的命名空间  
	    QName opAddEntry = new QName("http://service.lxl.com", "sendMsg");  
	    //  调用sendMsg方法并输出该方法的返回值  
	    System.out.println(serviceClient.invokeBlocking(opAddEntry, opAddEntryArgs, classes)[0]);
	}
}
