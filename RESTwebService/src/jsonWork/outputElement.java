package jsonWork;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"Out"})
public class outputElement {

@JsonProperty("Out")
private String Out;

public outputElement(){}

public outputElement(String out) {
	Out = out;
}

@JsonProperty("Out")
public String getOut() {
	return Out;
}

@JsonProperty("Out")
public void setOut(String out) {
	Out = out;
}

}
