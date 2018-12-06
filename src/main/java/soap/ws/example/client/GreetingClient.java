package soap.ws.example.client;


import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import soap.ws.example.server.OrderService;

import java.net.URL;
import java.util.Arrays;

public class GreetingClient {

    public static void main(String[] args) throws Exception {

        URL wsdlUrl = new URL("http://localhost:8888/service/order?wsdl");
        QName qname = new QName("http://server.example.ws.soap/", "OrderServiceImplService");
        Service service = Service.create(wsdlUrl, qname);
        OrderService orderService = service.getPort(OrderService.class);

        System.out.println(Arrays.toString(orderService.getOrders()));
        System.out.println("Order completed: " + orderService.addOrder("Mother Board"));
    }
}