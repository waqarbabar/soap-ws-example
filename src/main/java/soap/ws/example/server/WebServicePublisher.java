package soap.ws.example.server;

import javax.xml.ws.Endpoint;

public class WebServicePublisher {

    public static void main(String[] args) {
        
    	Endpoint.publish("http://localhost:8888/service/order", new OrderServiceImpl());
    
    }

}