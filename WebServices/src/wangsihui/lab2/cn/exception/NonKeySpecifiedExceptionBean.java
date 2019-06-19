package wangsihui.lab2.cn.exception;

/**
 * @author WangShiHui
 * @date 16.06.2019
 */
public class NonKeySpecifiedExceptionBean {
    private static final String DEFAULT_MESSAGE = "At least one key must be specified";
    protected String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static NonKeySpecifiedExceptionBean defaultInstance() {
        NonKeySpecifiedExceptionBean fault = new NonKeySpecifiedExceptionBean();
        fault.message = DEFAULT_MESSAGE;
        return fault;
    }
}
