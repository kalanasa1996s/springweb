package ijse.ws.day6.starter.api;

import ijse.ws.day6.starter.data.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Date;


@RestController
public class MyRestController{
    @GetMapping("/api/hello")
    public Message greeting(){
        Message msg = new Message();
        msg.setSender("Server");
        msg.setMessage("Hello Spring");
        msg.setSentTime(new Date());
        return msg;
    }
}
