package restwithspringjpdravila.Exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {
    private static final long serialVersionUID = 1l;

    private Date timestampe;
    private String message;
    private String details;

    public ExceptionResponse(Date timestampe, String message, String details) {
        this.timestampe = timestampe;
        this.message = message;
        this.details = details;
    }

    public Date getTimestampe() {
        return timestampe;
    }

    public void setTimestampe(Date timestampe) {
        this.timestampe = timestampe;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
