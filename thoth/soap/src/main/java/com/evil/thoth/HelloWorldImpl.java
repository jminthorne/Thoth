
package com.evil.thoth;

import javax.jws.WebService;

@WebService(endpointInterface = "com.evil.thoth.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

