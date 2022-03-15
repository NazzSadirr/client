package enumCode;

public enum ErrorCode {
    NotFound(404),
    Internal(500);

    public int code;

    private ErrorCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }


}
