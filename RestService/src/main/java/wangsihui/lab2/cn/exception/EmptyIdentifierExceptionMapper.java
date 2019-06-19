package wangsihui.lab2.cn.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * @author WangShiHui
 * @date 16.06.2019
 */
public class EmptyIdentifierExceptionMapper implements ExceptionMapper<EmptyIdentifierException> {

    @Override
    public Response toResponse(EmptyIdentifierException e) {
        return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
    }
}
