package jsonWork;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"InputElement"})
public class RequestSchema {
	@JsonProperty("InputElement")
	private inputElement InputElement;
	
	public RequestSchema(){}
	public RequestSchema(inputElement inputElement) {
		InputElement = inputElement;
	}
	
	@JsonProperty("InputElement")
	public inputElement getInputElement() {
		return InputElement;
	}
	
	@JsonProperty("InputElement")
	public void setInputElement(inputElement inputElement) {
		InputElement = inputElement;
	}

}
