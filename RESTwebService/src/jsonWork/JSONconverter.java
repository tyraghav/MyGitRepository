package jsonWork;

public class JSONconverter {
JSONMapper processor=new JSONMapper();
public Object jsonStringToObject(String content, Class<?> requestSchemaClass){
	Object schemaObj=null;
	try {
		schemaObj=requestSchemaClass.newInstance();
	} catch (InstantiationException|IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try{
	schemaObj=requestSchemaClass.cast(processor.stringToObject(content, requestSchemaClass));
}catch(Exception e){
	System.out.println(e);
}
return schemaObj;
}
public String objectToJsonString(Object object)
{
	String ret=null;
	ret=processor.objectToString(object,object.getClass());
	return ret;
}
}
