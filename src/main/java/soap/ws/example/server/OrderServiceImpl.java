package soap.ws.example.server;

import javax.jws.WebService;

@WebService(endpointInterface = "soap.ws.example.server.OrderService")
public class OrderServiceImpl implements OrderService {

    
    public String[] getOrders() {
        return new String[]{"SSD", "Graphic Card", "GPU"};
    }

    public boolean addOrder(String order) {
        System.out.println("Saving new order: " + order);
        return true;
    }
}