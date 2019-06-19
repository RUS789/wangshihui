package wangsihui.lab2.cn.exception;

/**
 * @author WangShiHui
 * @date 16.06.2019
 */
public class NonKeySpecifiedException extends Exception {
    private static final long serialVersionUID = -6647544772732631047L;
    public static NonKeySpecifiedException DEFAULT_INSTANCE =
            new NonKeySpecifiedException("At least one key must be specified");

    public NonKeySpecifiedException(String message) {
        super(message);
    }
}
