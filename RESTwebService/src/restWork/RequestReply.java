 
package restWork;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import jaxbWork.InputElement;
import jaxbWork.JAXBmapper;
import jaxbWork.OutputElement;
import jsonWork.JSONconverter;
import jsonWork.RequestSchema;
import jsonWork.ResponseSchema;
import jsonWork.outputElement;


@Path("/RequestReply")
@Consumes({"application/json", "application/xml" })
@Produces({"application/json", "application/xml" })
public class RequestReply {
	/**
     * Default constructor. 
     */
    public RequestReply() {
        // TODO Auto-generated constructor stub
    }


    /**
     * Retrieves representation of an instance of RequestReply
     * @return an instance of String
     */
	@GET
	@Produces("text/plain")
	@Path("/l")
	public String resourceMethodGET() { 
		return "OOOOOAA";
	}

	/**
     * PUT method for updating or creating an instance of RequestReply
     * @content content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
	@PUT
	@Consumes("text/plain")
	public void resourceMethodPUT(String content) { 
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
	@POST
	@Path("/Add")
	public String Addition(String InXML)
	{
		JAXBmapper J=new JAXBmapper();
		InputElement I=(InputElement)J.stringToObject(InXML,InputElement.class);
		int temp=Integer.parseInt(I.getIn1())+Integer.parseInt(I.getIn2());
		OutputElement O=new OutputElement();
		O.setOut(Integer.toString(temp));
		return J.objectToString(O,OutputElement.class);
	}
	
	@POST
	@Path("/Sub")
	public String Subtraction(String InXML)
	{
		JAXBmapper J=new JAXBmapper();
		InputElement I=(InputElement)J.stringToObject(InXML,InputElement.class);
		int temp=Integer.parseInt(I.getIn1())-Integer.parseInt(I.getIn2());
		OutputElement O=new OutputElement();
		O.setOut(Integer.toString(temp));
		return J.objectToString(O,OutputElement.class);
	}
	
	@POST
	@Path("/Mul")
	public String Multiplication(String InXML)
	{
		JSONconverter J=new JSONconverter();
		RequestSchema Request=(RequestSchema)J.jsonStringToObject(InXML, RequestSchema.class);
		int temp=Integer.parseInt(Request.getInputElement().getIn1())*Integer.parseInt(Request.getInputElement().getIn2());
		outputElement O=new outputElement();
		O.setOut(Integer.toString(temp));
		ResponseSchema Response=new ResponseSchema(O);
		return J.objectToJsonString(Response);
	}
}