package nl.marktplaats.producer;

import org.apache.activemq.broker.BrokerService;

public class Main {
    public static void main(String... args) throws Exception {

        Producer producer = new Producer();
        int x = 0;
        //while(true)
        {
            Thread.sleep(2000);

//            String request = "{" +
//					"\"baseSymbol\":\"LTC\"," +
//					"\"counterSymbol\":\"BTC\"," +
//					"\"volume\":\"0.01\"," +
//					"\"type\":\"BID\"," +
//					"\"status\":\"NEW\"," +
//					"\"price\":\"0.001\"," +
//					"\"orderID\":\"\""+
//					"}";

            String request = "{" +
                    "\"baseSymbol\":\"LTC\"," +
                    "\"counterSymbol\":\"BTC\"," +
                    "\"volume\":\"0.01\"," +
                    "\"type\":\"BID\"," +
                    "\"status\":\"PENDING_CANCEL\"," +
                    "\"price\":\"0.001\"," +
                    "\"orderID\":\"5b163d87fb4a174cbc8aeeaf\""+
                    "}";


            producer.produceMessage(request);
            x++;
        }
    }
}
