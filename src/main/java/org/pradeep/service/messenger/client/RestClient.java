package org.pradeep.service.messenger.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.pradeep.service.messenger.model.Message;

public class RestClient {
	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8081/messenger/webapi/");
		WebTarget messagesTarget = target.path("messages");
		WebTarget singlemessagesTarget = messagesTarget.path("{messageId}");
		Builder builder = singlemessagesTarget.resolveTemplate("messageId", 2).request(MediaType.APPLICATION_JSON);
		Response response = builder.get();
		Message message = response.readEntity(Message.class);
		System.out.println(message.getMessage());

		Message message2 = new Message(4, "PRadeep Message", "PRadeep");
		Response response2 = ClientBuilder.newClient().target("http://localhost:8081/messenger/webapi/messages")
				.request().post(Entity.json(message2));
		System.out.println(response2.readEntity(Message.class).getMessage());
	}
}
