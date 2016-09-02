/**
 * 
 */
package org.pradeep.service.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.pradeep.service.messenger.model.ErrorMessage;

/**
 * @author pradeep
 *
 */
@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException dataNotFoundException) {
		ErrorMessage errorMessage = new ErrorMessage(dataNotFoundException.getMessage(), , "Hello Link");
		return Response.status(Status.NOT_FOUND).entity(errorMessage).build();
	}404

}
