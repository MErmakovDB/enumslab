package enums;

public enum HttpCode {

    INFORMATIONAL(1,"Логика информации"), SUCCESS(2,"Логика успеха"), REDIRECTION(3,"Логика перенаправления"), CLIENTERROR(4,"Логика ошибки клиента"),SERVERERROR(5,"Логика ошибки сервера");

    private final String response;
    private final int code;

    HttpCode(int code,String response) {
        this.response = response;
        this.code = code;
    }

    public static HttpCode findByDbCode(int code) {
        HttpCode[] statuses = values();
        for (HttpCode status : statuses) {
            if (status.code == code) {
                return status;
            }
        }
        throw new IllegalStateException(code+" not supported");

    }

    @Override
    public String toString() {

        return getResponse();
    }

    public String getResponse() {
        return this.response;
    }

    public int getCode() {
        return this.code;
    }
}
