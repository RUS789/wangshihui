package wangsihui.lab2.cn.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
/**
 * @author WangShiHui
 * @date 16.06.2019
 */
@Provider
public class NonKeySpecifiedExceptionMapper implements ExceptionMapper<NonKeySpecifiedException> {

    @Override
    public Response toResponse(NonKeySpecifiedException e) {
        return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
    }
}
