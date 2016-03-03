import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/ktomservice")


public class KtoMService {

	
		@GET
		@Produces("application/xml")
		public String convertKtoM() {
			Double kilometers;
			Double miles = 25.00;
			kilometers = miles/0.62134;
	 
			String result = "@Produces(\"application/xml\") Output: \n\nK to M Converter Output: \n\n" + kilometers;
			return "<ktomservice>" + "<miles>" + miles + "</miles>" + "<ktomoutput>" + result + "</ktomoutput>" + "</ktomservice>";
		}
	 
		@Path("{m}")
		@GET
		@Produces("application/xml")
		public String convertKtoMfromInput(@PathParam("m") Double m) {
			Double kilometers;
			Double miles = m;
			kilometers = miles/0.62134;
	 
			String result = "@Produces(\"application/xml\") Output: \n\nK to M Converter Output: \n\n" + kilometers;
			return "<ktomservice>" + "<miles>" + miles + "</miles>" + "<ktomoutput>" + result + "</ktomoutput>" + "</ktomservice>";
		
	
	}
		public double convertKtoMfromInput1(@PathParam("m") Double m) {
			
			Double kilometers;
			Double miles = m;
			kilometers = miles/0.62134;
			return kilometers;
		}
	
}
