package enums;



import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class HttpService {
    public void handleHttpCode(int httpCode) {
        //todo finish the enum and this method
        HttpCode response = HttpCode.findByDbCode(httpCode/100);
        System.out.println(response);
    }

    public static void main(String[] args) {

    HttpService service = new HttpService();
    service.handleHttpCode(471);

    }

}


