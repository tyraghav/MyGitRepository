package jsonWork;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"OutputElement"})
public class ResponseSchema {
@JsonProperty("OutputElement")
private outputElement OutputElement;

public ResponseSchema(){}
public ResponseSchema(outputElement outputElement) {
	OutputElement = outputElement;
}

@JsonProperty("OutputElement")
public outputElement getOutputElement() {
	return OutputElement;
}

@JsonProperty("OutputElement")
public void setOutputElement(outputElement outputElement) {
	OutputElement = outputElement;
}
}
