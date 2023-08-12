package API;

	import org.apache.http.client.methods.CloseableHttpResponse;
	import org.apache.http.client.methods.HttpGet;
	import org.apache.http.impl.client.CloseableHttpClient;
	import org.apache.http.impl.client.HttpClients;
	import org.apache.http.util.EntityUtils;
	import org.json.JSONObject;
import org.testng.Assert;

	//Author: rpendyala19@gmail.com
	public class GetUserByID_2 {
	    public static void main(String[] args) {
	        // Create the HTTP GET request
	        HttpGet httpGet = new HttpGet("https://reqres.in/api/users/2");
	        httpGet.addHeader("Content-Type", "application/json");

	        // Execute the request using Apache HttpClient
	        try (CloseableHttpClient httpClient = HttpClients.createDefault();
	             CloseableHttpResponse response = httpClient.execute(httpGet)) {

	            // Get the response entity and convert it to a JSON object
	            String responseBody = EntityUtils.toString(response.getEntity());
	            JSONObject jsonResponse = new JSONObject(responseBody);

//	            ===============================================================================================
	            // Process the API response as needed
	            System.out.println("API Response:");
	            System.out.println(jsonResponse.toString(2));
	            
	         // Extract user information from JSON response
	            JSONObject userObject = jsonResponse.getJSONObject("data");
	            String actualFirstName = userObject.getString("first_name");
	            String actualLastName = userObject.getString("last_name");
	            String actualEmail = userObject.getString("email");
	            System.out.println(userObject);
	            System.out.println(actualFirstName);
	            System.out.println(actualLastName);
	            System.out.println(actualEmail);
	            //expected values for the user's information
	            String expectedFirstName = "Janet";
	            String expectedLastName = "Weaver";
	            String expectedEmail = "janet.weaver@reqres.in";

	            Assert.assertEquals(actualFirstName, expectedFirstName, "First name mismatch");
	            Assert.assertEquals(actualLastName, expectedLastName, "Last name mismatch");
	            Assert.assertEquals(actualEmail, expectedEmail, "Email mismatch");
	            
	            System.out.println(userObject);
//	            ================================================================================================
	            // Process the API response as needed
	            System.out.println("API Response:");
	            System.out.println(jsonResponse.toString(2));
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	


	
}
