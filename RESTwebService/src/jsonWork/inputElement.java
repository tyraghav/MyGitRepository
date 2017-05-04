package jsonWork;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"In1","In2","In3","In4","In5"})
public class inputElement {
@JsonProperty("In1")
private String In1;
@JsonProperty("In2")
private String In2;
@JsonProperty("In3")
private String In3;
@JsonProperty("In4")
private String In4;
@JsonProperty("In5")
private String In5;

public inputElement(){}

public inputElement(String in1, String in2, String in3, String in4, String in5) {
	In1 = in1;
	In2 = in2;
	In3 = in3;
	In4 = in4;
	In5 = in5;
}

@JsonProperty("In1")
public String getIn1() {
	return In1;
}

@JsonProperty("In1")
public void setIn1(String in1) {
	In1 = in1;
}

@JsonProperty("In2")
public String getIn2() {
	return In2;
}

@JsonProperty("In2")
public void setIn2(String in2) {
	In2 = in2;
}

@JsonProperty("In3")
public String getIn3() {
	return In3;
}

@JsonProperty("In3")
public void setIn3(String in3) {
	In3 = in3;
}

@JsonProperty("In4")
public String getIn4() {
	return In4;
}

@JsonProperty("In4")
public void setIn4(String in4) {
	In4 = in4;
}

@JsonProperty("In5")
public String getIn5() {
	return In5;
}

@JsonProperty("In5")
public void setIn5(String in5) {
	In5 = in5;
}
}
