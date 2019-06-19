package wangsihui.lab2.cn.restc;

import com.sun.jersey.api.client.Client;
/**
 * @author WangShiHui
 * @date 16.06.2019
 */
public class App {
    public static void main(String[] args) {
        Client client = Client.create();
        ActionMenu menu = new ActionMenu();
        menu.start(client);
    }
}
