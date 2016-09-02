/**
 * 
 */
package org.pradeep.service.messenger.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import org.pradeep.service.messenger.model.Message;

/**
 * @author pradeep
 *
 */
public class RestClientInvocationGenerics {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8081/messenger/webapi/");
		System.out.println(target.path("messages").request().get(new GenericType<List<Message>>() {
		}).get(0).getAuthor());
	}

}
