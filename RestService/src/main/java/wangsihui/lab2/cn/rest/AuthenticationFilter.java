package wangsihui.lab2.cn.rest;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import static javax.ws.rs.core.Response.Status.UNAUTHORIZED;

/**
 * @author WangShiHui
 * @date 16.06.2019
 */
public class AuthenticationFilter implements ContainerRequestFilter {
    public static final String AUTHENTICATION_HEADER = "Authorization";

    @Override
    public ContainerRequest filter(ContainerRequest containerRequest)
            throws WebApplicationException
    {
        String authCredentials = containerRequest.getHeaderValue(AUTHENTICATION_HEADER);
        if (!AuthenticationService.authenticate(authCredentials))
        {
            throw new WebApplicationException(
                    Response.status(UNAUTHORIZED)
                            .entity("Wrong login or password").build());
        }

        return containerRequest;
    }
}

