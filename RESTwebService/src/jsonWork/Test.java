package jsonWork;

public class Test {
public static void main(String[] args) {
	RequestSchema r=new RequestSchema();
	inputElement i=new inputElement("11","222","33","44","55");			
	r.setInputElement(i);
	JSONconverter jc=new JSONconverter();
	String out=jc.objectToJsonString(r);
	System.out.println(out);
	
}
}
