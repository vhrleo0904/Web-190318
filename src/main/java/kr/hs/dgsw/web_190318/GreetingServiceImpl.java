package kr.hs.dgsw.web_190318;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHi(String name) {
        return "SERVICE : Hello " + name;
    }

}
