/**
 * 
 */
package org.pradeep.service.messenger.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.pradeep.service.messenger.model.Message;

/**
 * @author pradeep
 *
 */
public class RestClientInvocation {

	public static void main(String[] args) {
		RestClientInvocation clientInvocation = new RestClientInvocation();
		Invocation invocation = clientInvocation.prepareRequestforMessageByYear(2016);
		Response response = invocation.invoke();
		System.out.println(response.getStatus());
	}

	public Invocation prepareRequestforMessageByYear(int year) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8081/messenger/webapi/");
		return target.path("messages").queryParam("year", year).request().buildGet();

	}
}
