package wangsihui.lab2.cn.exception;
/**
 * @author WangShiHui
 * @date 16.06.2019
 */
public class EmptyIdentifierException extends Exception {
    private static final long serialVersionUID = -6647544772732631047L;
    public static EmptyIdentifierException DEFAULT_INSTANCE =
            new EmptyIdentifierException("Identifier cannot be null or empty");

    public EmptyIdentifierException(String message) {
        super(message);
    }
}
