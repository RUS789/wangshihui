package wangsihui.lab2.cn.exception;

/**
 * @author WangShiHui
 * @date 16.06.2019
 */
public class EmptyIdentifierExceptionBean {
    private static final String DEFAULT_MESSAGE = "Identifier cannot be null or empty";
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static EmptyIdentifierExceptionBean defaultInstance() {
        EmptyIdentifierExceptionBean fault = new EmptyIdentifierExceptionBean();
        fault.message = DEFAULT_MESSAGE;
        return fault;
    }
}
