import javax.ws.rs.GET;
	import javax.ws.rs.Path;
	import javax.ws.rs.PathParam;
	import javax.ws.rs.Produces;
	import javax.ws.rs.core.Response;
	import org.json.JSONException;
	import org.json.JSONObject;
	 
	@Path("/speedcalculation")
	public class SpeedCalculation {
	 
		  @GET
		  @Produces("application/json")
		  public Response convertFtoC() throws JSONException {
	 
			JSONObject jsonObject = new JSONObject();
			Double speed;
			Double distance = 120.00;
			Double time = 2.0;
			speed = distance/time;
			jsonObject.put("S Value", speed); 
			jsonObject.put("D Value", distance);
			jsonObject.put("T Value", time);
	 
			String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
			return Response.status(200).entity(result).build();
		  }
	 
		  @Path("{d}/{t}")
		  @GET
		  @Produces("application/json")
		  public Response speedCalculatefromInput(@PathParam("d") Double d,@PathParam("t") Double t) throws JSONException {
	 
			JSONObject jsonObject = new JSONObject();
			Double speed;
			speed = d/t; 
			jsonObject.put("S Value", speed); 
			jsonObject.put("D Value", d);
			jsonObject.put("T Value", t);
			String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
			return Response.status(200).entity(result).build();
		  }
		  public Double speedCalculatefromInput1(@PathParam("d") Double d,@PathParam("t") Double t) throws JSONException {
				 
			
			Double speed;
			speed = d/t; 
			return speed;
			
		  }
	}
	
	
	

	
