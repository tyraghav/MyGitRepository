package jaxbWork;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JAXBmapper {
protected final Log log=LogFactory.getLog(this.getClass());
public Object stringToObject(String content,Class mapToObject)
{
	System.out.println(content);
	Object retObj=null;
	try{
		JAXBContext  jc=JAXBContext.newInstance(mapToObject);
		Unmarshaller unmarshaller=jc.createUnmarshaller();
		StringReader reader=new StringReader(content);
		retObj=unmarshaller.unmarshal(reader);
	}
	catch(JAXBException jaxbe){
		log.error(this.getClass().getName()+jaxbe);
	}
	return retObj;
	}
public String objectToString(Object obj,Class mapFromObject)
{
	StringWriter xmlStr=new StringWriter();
	String ret=null;
	try{
		JAXBContext jc=JAXBContext.newInstance(obj.getClass());
		Marshaller marshaller=jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
		marshaller.marshal(obj,xmlStr);
		ret=xmlStr.toString();
	}catch(Exception E)
	{
		System.out.println(E.getMessage());
	}
	System.out.println(ret);
	return ret;
}
}
