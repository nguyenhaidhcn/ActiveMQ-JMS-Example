package nl.marktplaats.producer;

import org.apache.activemq.broker.BrokerService;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;



public class Main {

    static Integer id = 0;

    static String OrderString( String msgType,String OrderID,String orderSide, String orderType, double order_price,double quantity, double stop_price, double holdCost )
    {

        String order = "{\n" +
                "\"msgType\":\"%s\",\n" +
                "\"msg\":{\n" +
                "\"orderId\":\"%s\",\n" +
                "\"symbol\":\"ETHBTC\",\n" +
                "\"baseCC\":\"btc\",\n" +
                "\"counterCC\":\"eth\",\n" +
                "\"orderType\":\"%s\",\n" +
                "\"orderSide\":\"%s\",\n" +
                "\"rate\":\"%9f\",\n" +
                "\"quantity\":\"%9f\",\n" +
                "\"stopPrice\":\"%9f\",\n" +
                "\"holdCost\":\"%9f\",\n" +
                "\"remainAmount\":null,\n" +
                "\"fee\":null,\n" +
                "\"orderTime\":\"1530866673422\",\n" +
                "\"userId\":\"1\"\n" +
                "}\n" +
                "}";

        return String.format(order,msgType,OrderID, orderType, orderSide, order_price, quantity, stop_price, holdCost);

    }


    //order book sell 12. quantity 1
    static public void testSellStop1(Producer producer)
    {
        String msg;
        Scanner scan= new Scanner(System.in);
        String text;

        Random rand = new Random();
        int value = rand.nextInt(9000000);
        String id = new String(String.valueOf(value));


        System.out.println("Press any key to SELL STOP");
        msg = OrderString( "REQUESTNEW","3","SELL", "STOP_LIMIT",12, 1, 11,0);
        producer.produceMessage(msg);


        System.out.println("Press any key to SELL limit");
        msg = OrderString( "REQUESTNEW","3","SELL", "LIMIT",11, 1, 0,0);
        producer.produceMessage(msg);
        System.out.println("SELL limit");


        System.out.println("Press any key to Buy limit, stop have active");
        msg = OrderString( "REQUESTNEW","3","BUY", "LIMIT",11, 1, 0,0);
        producer.produceMessage(msg);
        System.out.println("Check sell stop active Price 12. quantity 1");
    }

    //order book null
    static public void testSellStop2(Producer producer)
    {
        String msg;
        Scanner scan= new Scanner(System.in);
        String text;

        System.out.println("Press any key to SELL limit");
        msg = OrderString( "REQUESTNEW","3","SELL", "LIMIT",11, 1, 0,0);
        producer.produceMessage(msg);
        System.out.println("SELL limit");

        System.out.println("Press any key to SELL STOP");
        msg = OrderString( "REQUESTNEW","3","SELL", "STOP_LIMIT",12, 1, 11,0);
        producer.produceMessage(msg);

        System.out.println("Press any key to Buy limit, stop have active");
        msg = OrderString( "REQUESTNEW","3","BUY", "LIMIT",11, 1, 0,0);
        producer.produceMessage(msg);

        System.out.println("Press any key to Buy limit");
        msg = OrderString( "REQUESTNEW","3","BUY", "LIMIT",12, 1, 11,0);
        producer.produceMessage(msg);

        System.out.println("Check order book null");
    }


    //order book remain sell
    static public void testMarketOrder1(Producer producer)
    {
        String msg;
        Scanner scan= new Scanner(System.in);
        String text;

        System.out.println("Press any key to SELL limit");
        msg = OrderString( "REQUESTNEW","3","SELL", "LIMIT",10, 1, 0,0);
        producer.produceMessage(msg);
        System.out.println("SELL limit");

        System.out.println("Press any key to SELL limit");
        msg = OrderString( "REQUESTNEW","5","SELL", "LIMIT",12, 1, 0,0);
        producer.produceMessage(msg);
        System.out.println("SELL limit");


        System.out.println("Press any key to MARKET");
//        text = scan.nextLine();
        msg = OrderString( "REQUESTNEW","4","BUY", "MARKET",0, 1.5, 0,4);
        producer.produceMessage(msg);


        System.out.println("Check order book remain sell");
    }



    //order book BUY 12. quantity 1
    static public void testBuyStop1(Producer producer)
    {
        String msg;
        Scanner scan= new Scanner(System.in);
        String text;

        System.out.println("Press any key to SELL STOP");
        msg = OrderString( "REQUESTNEW","3","BUY", "STOP_LIMIT",12, 1, 11,0);
        producer.produceMessage(msg);


        System.out.println("Press any key to SELL limit");
        msg = OrderString( "REQUESTNEW","3","SELL", "LIMIT",11, 1, 0,0);
        producer.produceMessage(msg);
        System.out.println("SELL limit");


        System.out.println("Press any key to Buy limit, stop have active");
        msg = OrderString( "REQUESTNEW","3","BUY", "LIMIT",11, 1, 0,0);
        producer.produceMessage(msg);
        System.out.println("Check sell stop active Price 12. quantity 1");
    }

    //order book null
    static public void testBuyStop2(Producer producer)
    {
        String msg;
        Scanner scan= new Scanner(System.in);
        String text;

        System.out.println("Press any key to SELL limit");
        msg = OrderString( "REQUESTNEW","3","SELL", "LIMIT",11, 1, 0,0);
        producer.produceMessage(msg);
        System.out.println("SELL limit");

        System.out.println("Press any key to Buy STOP");
        msg = OrderString( "REQUESTNEW","3","BUY", "STOP_LIMIT",12, 1, 11,0);
        producer.produceMessage(msg);

        System.out.println("Press any key to Buy limit, stop have active");
        msg = OrderString( "REQUESTNEW","3","BUY", "LIMIT",11, 1, 0,0);
        producer.produceMessage(msg);

        System.out.println("Press any key to SELL limit");
        msg = OrderString( "REQUESTNEW","3","SELL", "LIMIT",12, 1, 0,0);
        producer.produceMessage(msg);

        System.out.println("Check order book null");
    }

    public static void main(String... args) throws Exception {


        Producer producer = new Producer();
        int x = 0;
        String msg;
        Scanner scan= new Scanner(System.in);
        String text;

        while(true)
        {

            text = scan.nextLine();
            testMarketOrder1(producer);
//            testBuyStop2(producer);
//            producer.produceMessage("{\"symbol\":\"ETHBTC\",\"asks\":[{\"price\":\"0.0354367000\",\"quantity\":\"1.1184000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354406000\",\"quantity\":\"0.2932000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354432000\",\"quantity\":\"0.5212000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354523000\",\"quantity\":\"0.9832000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354536000\",\"quantity\":\"1.4532000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354718000\",\"quantity\":\"0.0828000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354744000\",\"quantity\":\"1.7888000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354770000\",\"quantity\":\"2.3448000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354861000\",\"quantity\":\"5.8700000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354874000\",\"quantity\":\"7.0648000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354887000\",\"quantity\":\"2.9332000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354900000\",\"quantity\":\"1.3392000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354978000\",\"quantity\":\"24.3364000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354991000\",\"quantity\":\"7.3384000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0355004000\",\"quantity\":\"2.0480000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0355030000\",\"quantity\":\"3.3596000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0355056000\",\"quantity\":\"20.0000000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0355069000\",\"quantity\":\"0.1600000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0355147000\",\"quantity\":\"1.6328000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0355160000\",\"quantity\":\"1.2996000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354354000\",\"quantity\":\"0.4032000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354367000\",\"quantity\":\"1.1184000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354406000\",\"quantity\":\"0.2932000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354432000\",\"quantity\":\"0.5212000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354523000\",\"quantity\":\"0.9832000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354536000\",\"quantity\":\"1.4532000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354718000\",\"quantity\":\"0.0828000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354744000\",\"quantity\":\"1.7888000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354770000\",\"quantity\":\"2.3448000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354861000\",\"quantity\":\"5.8700000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354874000\",\"quantity\":\"7.0648000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354887000\",\"quantity\":\"2.9332000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354900000\",\"quantity\":\"1.3392000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354978000\",\"quantity\":\"24.3364000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0354991000\",\"quantity\":\"7.3384000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0355004000\",\"quantity\":\"2.0480000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0355030000\",\"quantity\":\"3.3596000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0355056000\",\"quantity\":\"20.0000000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0355069000\",\"quantity\":\"0.1600000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0355147000\",\"quantity\":\"1.6328000000\",\"exchange\":\"Binance\"}],\"bids\":[{\"price\":\"0.0190743000\",\"quantity\":\"5.8108000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190617000\",\"quantity\":\"0.0356000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190575000\",\"quantity\":\"80.1236000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190554000\",\"quantity\":\"5.8704000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190547000\",\"quantity\":\"0.3228000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190526000\",\"quantity\":\"7.4144000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190491000\",\"quantity\":\"2.9352000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190484000\",\"quantity\":\"0.0992000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190463000\",\"quantity\":\"0.6928000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190442000\",\"quantity\":\"24.5656000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190435000\",\"quantity\":\"21.6800000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190428000\",\"quantity\":\"73.4984000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190386000\",\"quantity\":\"7.3396000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190379000\",\"quantity\":\"0.1684000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190316000\",\"quantity\":\"15.6000000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190295000\",\"quantity\":\"7.3568000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190281000\",\"quantity\":\"1.6968000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190274000\",\"quantity\":\"57.9044000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190239000\",\"quantity\":\"80.0000000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190232000\",\"quantity\":\"7.7080000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190743000\",\"quantity\":\"5.8108000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190617000\",\"quantity\":\"0.0356000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190575000\",\"quantity\":\"80.1236000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190554000\",\"quantity\":\"5.8704000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190547000\",\"quantity\":\"0.3228000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190526000\",\"quantity\":\"7.4144000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190491000\",\"quantity\":\"2.9352000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190484000\",\"quantity\":\"0.0992000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190463000\",\"quantity\":\"0.6928000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190442000\",\"quantity\":\"24.5656000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190435000\",\"quantity\":\"21.6800000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190428000\",\"quantity\":\"73.4984000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190386000\",\"quantity\":\"7.3396000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190379000\",\"quantity\":\"0.1684000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190316000\",\"quantity\":\"15.6000000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190295000\",\"quantity\":\"7.3568000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190281000\",\"quantity\":\"1.6968000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190274000\",\"quantity\":\"57.9044000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190239000\",\"quantity\":\"80.0000000000\",\"exchange\":\"Binance\"},{\"price\":\"0.0190232000\",\"quantity\":\"7.7080000000\",\"exchange\":\"Binance\"}],\"digit\":8,\"msgType\":\"RATE\"}");
//        id = id +1;
//        String id_str = new String(String.valueOf(id));
//
//            {
//                text = scan.nextLine();
////                testBuyStop2(producer);
////                testMarketOrder1(producer);
////                TestInitOrder testInitOrder = new TestInitOrder();
////                testInitOrder.testInitOrder(producer);
//
//                  TestNotResponse testNotResponse = new TestNotResponse();
//                  testNotResponse.testNotResponse(producer);
//            }
//
//
//            x++;
//            if(x > 10000)
//            {
//                break;
//            }
        }
    }
}
