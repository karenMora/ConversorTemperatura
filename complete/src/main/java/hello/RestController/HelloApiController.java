package hello.RestController;

import hello.services.ConvServices;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value="/info")
public class HelloApiController {
    /*
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @Autowired
    ConvServices convServices;
    @RequestMapping(method = RequestMethod.GET,value="/{numero}")
    public ResponseEntity<?> getOrders(@PathVariable("numero") Float accion){
        try{
            return new ResponseEntity(convServices.getInfo(accion),HttpStatus.ACCEPTED);            
        }catch(Exception ex){
            Logger.getLogger(HelloApiController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }*/
    
}
