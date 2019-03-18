package kr.hs.dgsw.web_190318;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetController {

    @Autowired
    GreetingService gs;

    // REQUEST : httpL//hostname:port/greeting?name=DGSW
    // RESPONSE : Hello DGSW
    @GetMapping("/greeting")
    public String sayHi(@RequestParam String name) {
        return "Hello " + name;
    }

    // REQUEST : httpL//hostname:port/greeting/DGSW
    // RESPONSE : Hello DGSW
    @GetMapping("/greeting/{name}")
    public String sayHi2(@PathVariable String name) {
        return gs.sayHi(name);
    }

}
