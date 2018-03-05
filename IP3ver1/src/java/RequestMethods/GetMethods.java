/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*TO DO: Separate the tenantId/authCode into its own method
         Create an interface for all methods to make more generic
         Parse the response into an object
         Integrate methods with the mvc (important!)
*/
package RequestMethods;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
/**
 *
 * @author jidev
 */
public class GetMethods {
    
    private final String tenantId = "Team18";
    private final String authToken = "ddd8af7c-3e22-4d31-aefa-3e834071c954";
    
    public static void main(String[] args) throws Exception {

		GetMethods http = new GetMethods();

		System.out.println("Testing 1 - Recieve all timelines");
		http.sendGetAllTimelines();
                System.out.println("Testing 2 - Recieve specified timeline with the id '123456'");
                http.sendGetTimeline("TimelineId", "123456");
	}
    
    public HttpURLConnection setAuthToken(String url, String reqType) throws Exception {
        URL query = new URL(url);
        HttpURLConnection con = (HttpURLConnection) query.openConnection();
        con.setRequestMethod(reqType);
        con.setRequestProperty("tenantId", tenantId);
        con.setRequestProperty("AuthToken", authToken);
        return con;
    }
    
    public void sendGetAllTimelines() throws Exception {
        
        HttpURLConnection con = setAuthToken("https://gcu.ideagen-development.com/Timeline/GetTimelines", "GET");
        int responseCode = con.getResponseCode();
        System.out.println("Sending GET request to: https://gcu.ideagen-development.com/Timeline/GetTimelines" );
        System.out.println("Response code: " + responseCode);
        
        BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
                System.out.println(response.toString());
        
    }
    
    public void sendGetTimeline(String timeLineIdKey, String timeLineIdVal) throws Exception {
        
        HttpURLConnection con = setAuthToken("https://gcu.ideagen-development.com/Timeline/GetTimeline", "GET");
        con.setRequestProperty(timeLineIdKey, timeLineIdVal);
        int responseCode = con.getResponseCode();
        System.out.println("Sending GET request to: https://gcu.ideagen-development.com/Timeline/GetTimeline");
        System.out.println("Response code: " + responseCode);
        
        BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
                System.out.println(response.toString());
    }
    
    public void sendGetLinkedEvents(String timeLineIdKey, String timeLineIdVal) throws Exception {
        HttpURLConnection con = setAuthToken("https://gcu.ideagen-development.com/Timeline/GetEvents", "GET");
        con.setRequestProperty(timeLineIdKey, timeLineIdVal);
        int responseCode = con.getResponseCode();
        System.out.println("Sending GET request to: https://gcu.ideagen-development.com/Timeline/GetEvents");
        System.out.println("Response code: " + responseCode);
        BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
                System.out.println(response.toString());
    }
    
    public void sendGetAllEventsAndTimelines() throws Exception {
        
        HttpURLConnection con = setAuthToken("https://gcu.ideagen-development.com/Timeline/GetAllTimelinesAndEvent", "GET");
        int responseCode = con.getResponseCode();
        System.out.println("Sending GET request to: https://gcu.ideagen-development.com/Timeline/GetAllTimelinesAndEvent" );
        System.out.println("Response code: " + responseCode);
        
        BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
                System.out.println(response.toString());
        
    }
    
    public void sendGetLinkedTimelineEvents(String TimelineEventIdKey, String TimelineEventIdVal) throws Exception {
        
        HttpURLConnection con = setAuthToken("https://gcu.ideagen-development.com/TimelineEvent/GetLinkedTimelineEvents", "GET");
        con.setRequestProperty(TimelineEventIdKey, TimelineEventIdVal);
        int responseCode = con.getResponseCode();
        System.out.println("Sending GET request to: https://gcu.ideagen-development.com/TimelineEvent/GetLinkedTimelineEvents" );
        System.out.println("Response code: " + responseCode);
        
        BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
                System.out.println(response.toString());
        
    }
    
    public void sendGetTimelineEvent(String TimelineEventIdKey, String TimelineEventIdVal) throws Exception {
        
        HttpURLConnection con = setAuthToken("https://gcu.ideagen-development.com/TimelineEvent/GetTimelineEvent", "GET");
        con.setRequestProperty(TimelineEventIdKey, TimelineEventIdVal);
        int responseCode = con.getResponseCode();
        System.out.println("Sending GET request to: https://gcu.ideagen-development.com/TimelineEvent/GetTimelineEvent" );
        System.out.println("Response code: " + responseCode);
        
        BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
                System.out.println(response.toString());
        
    }
    
    public void sendGetTimelineEvents() throws Exception {
        
        HttpURLConnection con = setAuthToken("https://gcu.ideagen-development.com/TimelineEvent/GetAllEvents", "GET");
        int responseCode = con.getResponseCode();
        System.out.println("Sending GET request to: https://gcu.ideagen-development.com/TimelineEvent/GetAllEvents" );
        System.out.println("Response code: " + responseCode);
        
        BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
                System.out.println(response.toString());
        
    }
    
    public void sendGetUploadURL(String AttachmentIdKey, String AttachmentIdVal) throws Exception {
        
        HttpURLConnection con = setAuthToken("https://gcu.ideagen-development.com/TimelineEventAttachment/GenerateUploadPresignedUrl", "GET");
        con.setRequestProperty(AttachmentIdKey, AttachmentIdVal);
        int responseCode = con.getResponseCode();
        System.out.println("Sending GET request to: https://gcu.ideagen-development.com/TimelineEventAttachment/GenerateUploadPresignedUrl" );
        System.out.println("Response code: " + responseCode);
        
        BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
                System.out.println(response.toString());
        
    }
    
    public void sendGetDownloadURL(String AttachmentIdKey, String AttachmentIdVal) throws Exception {
        
        HttpURLConnection con = setAuthToken("https://gcu.ideagen-development.com/TimelineEventAttachment/GenerateGetPresignedUrl", "GET");
        con.setRequestProperty(AttachmentIdKey, AttachmentIdVal);
        int responseCode = con.getResponseCode();
        System.out.println("Sending GET request to: https://gcu.ideagen-development.com/TimelineEventAttachment/GenerateGetPresignedUrl" );
        System.out.println("Response code: " + responseCode);
        
        BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
                System.out.println(response.toString());
        
    }
    
    public void sendGetEventAttachment(String AttachmentIdKey, String AttachmentIdVal) throws Exception {
        
        HttpURLConnection con = setAuthToken("https://gcu.ideagen-development.com/TimelineEventAttachment/GetAttachment", "GET");
        con.setRequestProperty(AttachmentIdKey, AttachmentIdVal);
        int responseCode = con.getResponseCode();
        System.out.println("Sending GET request to: https://gcu.ideagen-development.com/TimelineEventAttachment/GenerateGetAttachment" );
        System.out.println("Response code: " + responseCode);
        
        BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
                System.out.println(response.toString());
        
    }
    
    public void sendGetAllAttachments(String TimelineEventIdKey, String TimelineEventIdVal) throws Exception {
        
        HttpURLConnection con = setAuthToken("https://gcu.ideagen-development.com/TimelineEventAttachment/GetAttachments", "GET");
        con.setRequestProperty(TimelineEventIdKey, TimelineEventIdVal);
        int responseCode = con.getResponseCode();
        System.out.println("Sending GET request to: https://gcu.ideagen-development.com/TimelineEventAttachment/GetAttachments" );
        System.out.println("Response code: " + responseCode);
        
        BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
                System.out.println(response.toString());
        
    }
}
