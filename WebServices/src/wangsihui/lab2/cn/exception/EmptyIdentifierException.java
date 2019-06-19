package wangsihui.lab2.cn.exception;


import javax.xml.ws.WebFault;

/**
 * @author WangShiHui
 * @date 16.06.2019
 */
@WebFault(faultBean = "wangsihui.lab2.cn.exception.EmptyIdentifierExceptionBean")
public class EmptyIdentifierException extends Exception {
    private final EmptyIdentifierExceptionBean fault;

    public EmptyIdentifierException(String message, EmptyIdentifierExceptionBean fault) {
        super(message);
        this.fault = fault;
    }

    public EmptyIdentifierException(String message, EmptyIdentifierExceptionBean fault, Throwable cause){
        super(message, cause);
        this.fault = fault;
    }

    public EmptyIdentifierExceptionBean getFaultInfo() {
        return fault;
    }
}
