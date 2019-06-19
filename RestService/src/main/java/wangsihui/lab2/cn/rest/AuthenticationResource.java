package wangsihui.lab2.cn.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author WangShiHui
 * @date 16.06.2019
 */
@Path("/auth")
@Produces({MediaType.APPLICATION_JSON})
public class AuthenticationResource {

    @GET
    public String authSuccessful()
    {
        // Fail authentication will be rejected by filter
        return "Authorization is successful";
    }

}
