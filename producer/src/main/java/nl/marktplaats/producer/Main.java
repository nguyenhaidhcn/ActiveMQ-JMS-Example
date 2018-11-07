package nl.marktplaats.producer;

import org.apache.activemq.broker.BrokerService;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Vector;



public class Main {

    static Integer id = 0;

    static String OrderString( String msgType,String OrderID,String orderSide, String orderType, double order_price,double quantity, double stop_price)
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
                "\"rate\":%9f,\n" +
                "\"quantity\":%9f,\n" +
                "\"stopPrice\":%9f,\n" +
                "\"convertAmount\":7.0090739471,\n" +
                "\"remainAmount\":null,\n" +
                "\"fee\":null,\n" +
                "\"orderTime\":1530866673422,\n" +
                "\"userId\":\"1\"\n" +
                "}\n" +
                "}";

        return String.format(order,msgType,OrderID, orderType, orderSide, order_price, quantity, stop_price);

    }


    //order book sell 12. quantity 1
    static public void testSellStop1(Producer producer)
    {
        String msg;
        Scanner scan= new Scanner(System.in);
        String text;

        System.out.println("Press any key to SELL STOP");
        msg = OrderString( "REQUESTNEW","3","SELL", "STOP_LIMIT",12, 1, 11);
        producer.produceMessage(msg);


        System.out.println("Press any key to SELL limit");
        msg = OrderString( "REQUESTNEW","3","SELL", "LIMIT",11, 1, 0);
        producer.produceMessage(msg);
        System.out.println("SELL limit");


        System.out.println("Press any key to Buy limit, stop have active");
        msg = OrderString( "REQUESTNEW","3","BUY", "LIMIT",11, 1, 0);
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
        msg = OrderString( "REQUESTNEW","3","SELL", "LIMIT",11, 1, 0);
        producer.produceMessage(msg);
        System.out.println("SELL limit");

        System.out.println("Press any key to SELL STOP");
        msg = OrderString( "REQUESTNEW","3","SELL", "STOP_LIMIT",12, 1, 11);
        producer.produceMessage(msg);

        System.out.println("Press any key to Buy limit, stop have active");
        msg = OrderString( "REQUESTNEW","3","BUY", "LIMIT",11, 1, 0);
        producer.produceMessage(msg);

        System.out.println("Press any key to Buy limit");
        msg = OrderString( "REQUESTNEW","3","BUY", "LIMIT",12, 1, 11);
        producer.produceMessage(msg);

        System.out.println("Check order book null");
    }

    //order book BUY 12. quantity 1
    static public void testBuyStop1(Producer producer)
    {
        String msg;
        Scanner scan= new Scanner(System.in);
        String text;

        System.out.println("Press any key to SELL STOP");
        msg = OrderString( "REQUESTNEW","3","BUY", "STOP_LIMIT",12, 1, 11);
        producer.produceMessage(msg);


        System.out.println("Press any key to SELL limit");
        msg = OrderString( "REQUESTNEW","3","SELL", "LIMIT",11, 1, 0);
        producer.produceMessage(msg);
        System.out.println("SELL limit");


        System.out.println("Press any key to Buy limit, stop have active");
        msg = OrderString( "REQUESTNEW","3","BUY", "LIMIT",11, 1, 0);
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
        msg = OrderString( "REQUESTNEW","3","SELL", "LIMIT",11, 1, 0);
        producer.produceMessage(msg);
        System.out.println("SELL limit");

        System.out.println("Press any key to Buy STOP");
        msg = OrderString( "REQUESTNEW","3","BUY", "STOP_LIMIT",12, 1, 11);
        producer.produceMessage(msg);

        System.out.println("Press any key to Buy limit, stop have active");
        msg = OrderString( "REQUESTNEW","3","BUY", "LIMIT",11, 1, 0);
        producer.produceMessage(msg);

        System.out.println("Press any key to SELL limit");
        msg = OrderString( "REQUESTNEW","3","SELL", "LIMIT",12, 1, 0);
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


        id = id +1;
        String id_str = new String(String.valueOf(id));

            {
                text = scan.nextLine();
                testBuyStop2(producer);


            }


            x++;
            if(x > 10000)
            {
                break;
            }
        }
    }
}
