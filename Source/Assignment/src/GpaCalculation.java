import javax.ws.rs.GET;
	import javax.ws.rs.Path;
	import javax.ws.rs.PathParam;
	import javax.ws.rs.Produces;
	 
	@Path("/gpacalculation")

public class GpaCalculation {
		@GET
		@Produces("application/xml")
		public String gpaCalculate() {
	 
			Double gpa;
			Double total = 600.00;
			Double credithrs = 65.0;
			gpa = total/credithrs;
	 
			String result = "@Produces(\"application/xml\") Output: \n\nGPA Calculation Output: \n\n" + gpa;
			return "<gpacalculationservice>" + "<total>" + total + "</total>" + "<credithrs>" + credithrs + "</credithrs>" + "<gpacalculationoutput>" + result + "</gpacalculationoutput>" + "</gpacalculationservice>";
		}
	 
		@Path("{t}/{c}")
		@GET
		@Produces("application/xml")
		public String gpaCalculatefromInput(@PathParam("t") Double t,@PathParam("c") Double c) {
			Double gpa;
			Double total = t;
			Double credithrs = c;
			gpa = total/credithrs;
			 
			String result = "@Produces(\"application/xml\") Output: \n\nGPA Calculation Output: \n\n" + gpa;
			return "<gpacalculationservice>" + "<total>" + total + "</total>" + "<credithrs>" + credithrs + "</credithrs>" + "<gpacalculationoutput>" + result + "</gpacalculationoutput>" + "</gpacalculationservice>";
		
	
	}
		public Double gpaCalculatefromInput1(@PathParam("t") Double t,@PathParam("c") Double c) {
			Double gpa;
			Double total = t;
			Double credithrs = c;
			gpa = total/credithrs;
			 
			return gpa;
		
	
	}
	
}

	

