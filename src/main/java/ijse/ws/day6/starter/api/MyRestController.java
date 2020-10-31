package ijse.ws.day6.starter.api;

import ijse.ws.day6.starter.data.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping("/api/message")
    public Message messageBuilder(@RequestParam("username") String user, @RequestParam("message") String message){
        Message msg = new Message();
        msg.setSender("Server");
        msg.setMessage("Hello Spring");
        msg.setSentTime(new Date());
        return msg;
    }

    @PostMapping("/api/message")
    public Message createMessage(@RequestBody() Message message){
        System.out.println(message);
        return message;
    }
}
