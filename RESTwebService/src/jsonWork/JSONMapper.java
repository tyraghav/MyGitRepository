package jsonWork;

import java.io.IOException;

import javax.json.JsonException;
import javax.json.stream.JsonParsingException;

import org.codehaus.jackson.map.ObjectMapper;

public class JSONMapper {
public Object stringToObject(String content, Class<?>mapToClass){
	ObjectMapper mapper=new ObjectMapper();
	Object retObj=null;
	try{
		retObj=mapper.readValue(content, mapToClass);
	}catch(JsonParsingException e){
		System.out.println(e);
	}catch(JsonException e){
		System.out.println(e);
	}catch(IOException e){
		System.out.println(e);
	}
	return retObj;
}
public String objectToString(Object obj, Class<?>mapFromObject){
	ObjectMapper mapper=new ObjectMapper();
	String ret=null;
	try{
		ret=mapper.writeValueAsString(obj);
	}catch(JsonParsingException e){
		System.out.println(e);
	}catch(JsonException e){
		System.out.println(e);
	}catch(IOException e){
		System.out.println(e);
	}
	return ret;
}
}

