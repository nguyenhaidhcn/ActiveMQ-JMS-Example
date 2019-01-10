package nl.marktplaats.producer;

import java.util.Scanner;
import java.util.Vector;

public class TestNotResponse {

    //order book remain sell
    public void testNotResponse(Producer producer)
    {
        Vector<String> msgs = new Vector<String>();
        String msg = new String();


        Scanner scan= new Scanner(System.in);
        String text;
//        text = scan.nextLine();


        msgs.add("{   \"msgType\" : \"REQUESTNEW\",   \"msg\" : {     \"orderId\" : \"66939\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"LIMIT\",     \"orderSide\" : \"BUY\",     \"rate\" : \"1.00000000\",     \"quantity\" : \"5.00000000\",     \"orderTime\" : null,     \"userId\" : \"u-ab00008c-0c6e-47e1-b8c7-248a4df771fa\",     \"orderStatus\" : 2,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"0.00000000\",     \"holdCost\" : \"5.00000000\",     \"decimalPlaceAmount\" : 6,     \"decimalPlacePrice\" : 2   } }");

        msgs.add("{   \"msgType\" : \"REQUESTCANCEL\",   \"msg\" : {     \"orderId\" : \"66939\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"LIMIT\",     \"orderSide\" : \"BUY\",     \"rate\" : \"1.00000000\",     \"quantity\" : \"5.00000000\",     \"orderTime\" : 1542599588198,     \"userId\" : \"u-ab00008c-0c6e-47e1-b8c7-248a4df771fa\",     \"orderStatus\" : 8,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"5.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"0.00000000\",     \"holdCost\" : null,     \"decimalPlaceAmount\" : null,     \"decimalPlacePrice\" : null   } }");
        msgs.add("{   \"msgType\" : \"REQUESTNEW\",   \"msg\" : {     \"orderId\" : \"66940\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"STOP_LIMIT\",     \"orderSide\" : \"BUY\",     \"rate\" : \"2.40000000\",     \"quantity\" : \"2.00000000\",     \"orderTime\" : null,     \"userId\" : \"u-ab00008c-0c6e-47e1-b8c7-248a4df771fa\",     \"orderStatus\" : 2,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"2.30000000\",     \"holdCost\" : \"4.80000000\",     \"decimalPlaceAmount\" : 6,     \"decimalPlacePrice\" : 2   } }");
        msgs.add("{   \"msgType\" : \"REQUESTNEW\",   \"msg\" : {     \"orderId\" : \"66942\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"LIMIT\",     \"orderSide\" : \"BUY\",     \"rate\" : \"2.30000000\",     \"quantity\" : \"1.00000000\",     \"orderTime\" : null,     \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",     \"orderStatus\" : 2,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"0.00000000\",     \"holdCost\" : \"2.30000000\",     \"decimalPlaceAmount\" : 6,     \"decimalPlacePrice\" : 2   } }");

        msgs.add("{   \"msgType\" : \"REQUESTNEW\",   \"msg\" : {     \"orderId\" : \"66943\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"LIMIT\",     \"orderSide\" : \"SELL\",     \"rate\" : \"2.30000000\",     \"quantity\" : \"2.00000000\",     \"orderTime\" : null,     \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",     \"orderStatus\" : 2,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"0.00000000\",     \"holdCost\" : \"0.00000000\",     \"decimalPlaceAmount\" : 6,     \"decimalPlacePrice\" : 2   } }");

        msgs.add("{   \"msgType\" : \"REQUESTNEW\",   \"msg\" : {     \"orderId\" : \"66945\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"LIMIT\",     \"orderSide\" : \"SELL\",     \"rate\" : \"2.30000000\",     \"quantity\" : \"0.00000100\",     \"orderTime\" : null,     \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",     \"orderStatus\" : 2,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"0.00000000\",     \"holdCost\" : \"0.00000000\",     \"decimalPlaceAmount\" : 6,     \"decimalPlacePrice\" : 2   } }");

        msgs.add("{   \"msgType\" : \"REQUESTNEW\",   \"msg\" : {     \"orderId\" : \"66946\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"LIMIT\",     \"orderSide\" : \"SELL\",     \"rate\" : \"2.50000000\",     \"quantity\" : \"0.00000100\",     \"orderTime\" : null,     \"userId\" : \"u-ab00008c-0c6e-47e1-b8c7-248a4df771fa\",     \"orderStatus\" : 2,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"0.00000000\",     \"holdCost\" : \"0.00000000\",     \"decimalPlaceAmount\" : 6,     \"decimalPlacePrice\" : 2   } }");

        msgs.add("{   \"msgType\" : \"REQUESTNEW\",   \"msg\" : {     \"orderId\" : \"66947\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"LIMIT\",     \"orderSide\" : \"SELL\",     \"rate\" : \"2.30000000\",     \"quantity\" : \"0.00000100\",     \"orderTime\" : null,     \"userId\" : \"u-ab00008c-0c6e-47e1-b8c7-248a4df771fa\",     \"orderStatus\" : 2,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"0.00000000\",     \"holdCost\" : \"0.00000000\",     \"decimalPlaceAmount\" : 6,     \"decimalPlacePrice\" : 2   } }");

        msgs.add("{   \"msgType\" : \"REQUESTNEW\",   \"msg\" : {     \"orderId\" : \"66948\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"LIMIT\",     \"orderSide\" : \"SELL\",     \"rate\" : \"2.40000000\",     \"quantity\" : \"0.00000100\",     \"orderTime\" : null,     \"userId\" : \"u-ab00008c-0c6e-47e1-b8c7-248a4df771fa\",     \"orderStatus\" : 2,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"0.00000000\",     \"holdCost\" : \"0.00000000\",     \"decimalPlaceAmount\" : 6,     \"decimalPlacePrice\" : 2   } }");

        msgs.add("{   \"msgType\" : \"REQUESTNEW\",   \"msg\" : {     \"orderId\" : \"66949\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"LIMIT\",     \"orderSide\" : \"SELL\",     \"rate\" : \"2.40000000\",     \"quantity\" : \"0.99999700\",     \"orderTime\" : null,     \"userId\" : \"u-ab00008c-0c6e-47e1-b8c7-248a4df771fa\",     \"orderStatus\" : 2,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"0.00000000\",     \"holdCost\" : \"0.00000000\",     \"decimalPlaceAmount\" : 6,     \"decimalPlacePrice\" : 2   } }");

        msgs.add("{   \"msgType\" : \"REQUESTCANCEL\",   \"msg\" : {     \"orderId\" : \"66946\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"LIMIT\",     \"orderSide\" : \"SELL\",     \"rate\" : \"2.50000000\",     \"quantity\" : \"0.00000100\",     \"orderTime\" : 1542600127342,     \"userId\" : \"u-ab00008c-0c6e-47e1-b8c7-248a4df771fa\",     \"orderStatus\" : 8,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000100\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"0.00000000\",     \"holdCost\" : null,     \"decimalPlaceAmount\" : null,     \"decimalPlacePrice\" : null   } }");

        msgs.add("{   \"msgType\" : \"REQUESTNEW\",   \"msg\" : {     \"orderId\" : \"66950\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"STOP_LIMIT\",     \"orderSide\" : \"BUY\",     \"rate\" : \"3.45000000\",     \"quantity\" : \"2.65545400\",     \"orderTime\" : null,     \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",     \"orderStatus\" : 2,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"3.37000000\",     \"holdCost\" : \"9.16131600\",     \"decimalPlaceAmount\" : 6,     \"decimalPlacePrice\" : 2   } }");

        msgs.add("{   \"msgType\" : \"REQUESTCANCEL\",   \"msg\" : {     \"orderId\" : \"66950\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"STOP_LIMIT\",     \"orderSide\" : \"BUY\",     \"rate\" : \"3.45000000\",     \"quantity\" : \"2.65545400\",     \"orderTime\" : 1542600342185,     \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",     \"orderStatus\" : 8,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"2.65545400\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"3.37000000\",     \"holdCost\" : null,     \"decimalPlaceAmount\" : null,     \"decimalPlacePrice\" : null   } }");
        msgs.add("{   \"msgType\" : \"REQUESTNEW\",   \"msg\" : {     \"orderId\" : \"66972\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"STOP_LIMIT\",     \"orderSide\" : \"BUY\",     \"rate\" : \"2.60000000\",     \"quantity\" : \"2.00000000\",     \"orderTime\" : null,     \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",     \"orderStatus\" : 2,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"2.50000000\",     \"holdCost\" : \"5.20000000\",     \"decimalPlaceAmount\" : 6,     \"decimalPlacePrice\" : 2   } }");
        msgs.add("{   \"msgType\" : \"REQUESTNEW\",   \"msg\" : {     \"orderId\" : \"66973\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"LIMIT\",     \"orderSide\" : \"BUY\",     \"rate\" : \"2.50000000\",     \"quantity\" : \"1.00000000\",     \"orderTime\" : null,     \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",     \"orderStatus\" : 2,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"0.00000000\",     \"holdCost\" : \"2.50000000\",     \"decimalPlaceAmount\" : 6,     \"decimalPlacePrice\" : 2   } }");
        msgs.add("{   \"msgType\" : \"REQUESTNEW\",   \"msg\" : {     \"orderId\" : \"66974\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"LIMIT\",     \"orderSide\" : \"SELL\",     \"rate\" : \"2.50000000\",     \"quantity\" : \"1.00000000\",     \"orderTime\" : null,     \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",     \"orderStatus\" : 2,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"0.00000000\",     \"holdCost\" : \"0.00000000\",     \"decimalPlaceAmount\" : 6,     \"decimalPlacePrice\" : 2   } }");
        msgs.add("{   \"msgType\" : \"REQUESTNEW\",   \"msg\" : {     \"orderId\" : \"66975\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"LIMIT\",     \"orderSide\" : \"SELL\",     \"rate\" : \"2.60000000\",     \"quantity\" : \"2.00000000\",     \"orderTime\" : null,     \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",     \"orderStatus\" : 2,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"0.00000000\",     \"holdCost\" : \"0.00000000\",     \"decimalPlaceAmount\" : 6,     \"decimalPlacePrice\" : 2   } }");
        msgs.add("{   \"msgType\" : \"REQUESTNEW\",   \"msg\" : {     \"orderId\" : \"66976\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"STOP_LIMIT\",     \"orderSide\" : \"BUY\",     \"rate\" : \"2.80000000\",     \"quantity\" : \"2.00000000\",     \"orderTime\" : null,     \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",     \"orderStatus\" : 2,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"2.70000000\",     \"holdCost\" : \"5.60000000\",     \"decimalPlaceAmount\" : 6,     \"decimalPlacePrice\" : 2   } }");
        msgs.add("{   \"msgType\" : \"REQUESTNEW\",   \"msg\" : {     \"orderId\" : \"66977\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"LIMIT\",     \"orderSide\" : \"BUY\",     \"rate\" : \"2.70000000\",     \"quantity\" : \"1.00000000\",     \"orderTime\" : null,     \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",     \"orderStatus\" : 2,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"0.00000000\",     \"holdCost\" : \"2.70000000\",     \"decimalPlaceAmount\" : 6,     \"decimalPlacePrice\" : 2   } }");
        msgs.add("{   \"msgType\" : \"REQUESTNEW\",   \"msg\" : {     \"orderId\" : \"66978\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"LIMIT\",     \"orderSide\" : \"SELL\",     \"rate\" : \"2.70000000\",     \"quantity\" : \"1.00000000\",     \"orderTime\" : null,     \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",     \"orderStatus\" : 2,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"0.00000000\",     \"holdCost\" : \"0.00000000\",     \"decimalPlaceAmount\" : 6,     \"decimalPlacePrice\" : 2   } }");
        msgs.add("{   \"msgType\" : \"REQUESTNEW\",   \"msg\" : {     \"orderId\" : \"66980\",     \"symbol\" : \"BTCUSDT\",     \"baseCC\" : \"BTC\",     \"counterCC\" : \"USDT\",     \"orderType\" : \"LIMIT\",     \"orderSide\" : \"SELL\",     \"rate\" : \"2.80000000\",     \"quantity\" : \"2.00000000\",     \"orderTime\" : null,     \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",     \"orderStatus\" : 2,     \"filledQuantity\" : \"0.00000000\",     \"remainQuantity\" : \"0.00000000\",     \"fillCost\" : \"0.00000000\",     \"totalFillCost\" : \"0.00000000\",     \"totalFilledQuantity\" : \"0.00000000\",     \"stopPrice\" : \"0.00000000\",     \"holdCost\" : \"0.00000000\",     \"decimalPlaceAmount\" : 6,     \"decimalPlacePrice\" : 2   } }");
        msgs.add("{\n" +
                "  \"msgType\" : \"REQUESTNEW\",\n" +
                "  \"msg\" : {\n" +
                "    \"orderId\" : \"66989\",\n" +
                "    \"symbol\" : \"BTCUSDT\",\n" +
                "    \"baseCC\" : \"BTC\",\n" +
                "    \"counterCC\" : \"USDT\",\n" +
                "    \"orderType\" : \"STOP_LIMIT\",\n" +
                "    \"orderSide\" : \"BUY\",\n" +
                "    \"rate\" : \"2.83000000\",\n" +
                "    \"quantity\" : \"2.00000000\",\n" +
                "    \"orderTime\" : null,\n" +
                "    \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",\n" +
                "    \"orderStatus\" : 2,\n" +
                "    \"filledQuantity\" : \"0.00000000\",\n" +
                "    \"remainQuantity\" : \"0.00000000\",\n" +
                "    \"fillCost\" : \"0.00000000\",\n" +
                "    \"totalFillCost\" : \"0.00000000\",\n" +
                "    \"totalFilledQuantity\" : \"0.00000000\",\n" +
                "    \"stopPrice\" : \"2.81000000\",\n" +
                "    \"holdCost\" : \"5.66000000\",\n" +
                "    \"decimalPlaceAmount\" : 6,\n" +
                "    \"decimalPlacePrice\" : 2\n" +
                "  }\n" +
                "}");
        msgs.add("{\n" +
                "  \"msgType\" : \"REQUESTNEW\",\n" +
                "  \"msg\" : {\n" +
                "    \"orderId\" : \"66990\",\n" +
                "    \"symbol\" : \"BTCUSDT\",\n" +
                "    \"baseCC\" : \"BTC\",\n" +
                "    \"counterCC\" : \"USDT\",\n" +
                "    \"orderType\" : \"LIMIT\",\n" +
                "    \"orderSide\" : \"BUY\",\n" +
                "    \"rate\" : \"2.81000000\",\n" +
                "    \"quantity\" : \"1.00000000\",\n" +
                "    \"orderTime\" : null,\n" +
                "    \"userId\" : \"u-ab00008c-0c6e-47e1-b8c7-248a4df771fa\",\n" +
                "    \"orderStatus\" : 2,\n" +
                "    \"filledQuantity\" : \"0.00000000\",\n" +
                "    \"remainQuantity\" : \"0.00000000\",\n" +
                "    \"fillCost\" : \"0.00000000\",\n" +
                "    \"totalFillCost\" : \"0.00000000\",\n" +
                "    \"totalFilledQuantity\" : \"0.00000000\",\n" +
                "    \"stopPrice\" : \"0.00000000\",\n" +
                "    \"holdCost\" : \"2.81000000\",\n" +
                "    \"decimalPlaceAmount\" : 6,\n" +
                "    \"decimalPlacePrice\" : 2\n" +
                "  }\n" +
                "}");
        msgs.add("{\n" +
                "  \"msgType\" : \"REQUESTNEW\",\n" +
                "  \"msg\" : {\n" +
                "    \"orderId\" : \"66991\",\n" +
                "    \"symbol\" : \"BTCUSDT\",\n" +
                "    \"baseCC\" : \"BTC\",\n" +
                "    \"counterCC\" : \"USDT\",\n" +
                "    \"orderType\" : \"LIMIT\",\n" +
                "    \"orderSide\" : \"SELL\",\n" +
                "    \"rate\" : \"2.81000000\",\n" +
                "    \"quantity\" : \"1.00000000\",\n" +
                "    \"orderTime\" : null,\n" +
                "    \"userId\" : \"u-ab00008c-0c6e-47e1-b8c7-248a4df771fa\",\n" +
                "    \"orderStatus\" : 2,\n" +
                "    \"filledQuantity\" : \"0.00000000\",\n" +
                "    \"remainQuantity\" : \"0.00000000\",\n" +
                "    \"fillCost\" : \"0.00000000\",\n" +
                "    \"totalFillCost\" : \"0.00000000\",\n" +
                "    \"totalFilledQuantity\" : \"0.00000000\",\n" +
                "    \"stopPrice\" : \"0.00000000\",\n" +
                "    \"holdCost\" : \"0.00000000\",\n" +
                "    \"decimalPlaceAmount\" : 6,\n" +
                "    \"decimalPlacePrice\" : 2\n" +
                "  }\n" +
                "}");
        msgs.add("{\n" +
                "  \"msgType\" : \"REQUESTNEW\",\n" +
                "  \"msg\" : {\n" +
                "    \"orderId\" : \"66992\",\n" +
                "    \"symbol\" : \"BTCUSDT\",\n" +
                "    \"baseCC\" : \"BTC\",\n" +
                "    \"counterCC\" : \"USDT\",\n" +
                "    \"orderType\" : \"LIMIT\",\n" +
                "    \"orderSide\" : \"SELL\",\n" +
                "    \"rate\" : \"2.83000000\",\n" +
                "    \"quantity\" : \"1.00000000\",\n" +
                "    \"orderTime\" : null,\n" +
                "    \"userId\" : \"u-ab00008c-0c6e-47e1-b8c7-248a4df771fa\",\n" +
                "    \"orderStatus\" : 2,\n" +
                "    \"filledQuantity\" : \"0.00000000\",\n" +
                "    \"remainQuantity\" : \"0.00000000\",\n" +
                "    \"fillCost\" : \"0.00000000\",\n" +
                "    \"totalFillCost\" : \"0.00000000\",\n" +
                "    \"totalFilledQuantity\" : \"0.00000000\",\n" +
                "    \"stopPrice\" : \"0.00000000\",\n" +
                "    \"holdCost\" : \"0.00000000\",\n" +
                "    \"decimalPlaceAmount\" : 6,\n" +
                "    \"decimalPlacePrice\" : 2\n" +
                "  }\n" +
                "}");
        msgs.add("{\n" +
                "  \"msgType\" : \"REQUESTNEW\",\n" +
                "  \"msg\" : {\n" +
                "    \"orderId\" : \"66993\",\n" +
                "    \"symbol\" : \"BTCUSDT\",\n" +
                "    \"baseCC\" : \"BTC\",\n" +
                "    \"counterCC\" : \"USDT\",\n" +
                "    \"orderType\" : \"LIMIT\",\n" +
                "    \"orderSide\" : \"SELL\",\n" +
                "    \"rate\" : \"2.82000000\",\n" +
                "    \"quantity\" : \"0.00055600\",\n" +
                "    \"orderTime\" : null,\n" +
                "    \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",\n" +
                "    \"orderStatus\" : 2,\n" +
                "    \"filledQuantity\" : \"0.00000000\",\n" +
                "    \"remainQuantity\" : \"0.00000000\",\n" +
                "    \"fillCost\" : \"0.00000000\",\n" +
                "    \"totalFillCost\" : \"0.00000000\",\n" +
                "    \"totalFilledQuantity\" : \"0.00000000\",\n" +
                "    \"stopPrice\" : \"0.00000000\",\n" +
                "    \"holdCost\" : \"0.00000000\",\n" +
                "    \"decimalPlaceAmount\" : 6,\n" +
                "    \"decimalPlacePrice\" : 2\n" +
                "  }\n" +
                "}");
        msgs.add("{\n" +
                "  \"msgType\" : \"REQUESTNEW\",\n" +
                "  \"msg\" : {\n" +
                "    \"orderId\" : \"66994\",\n" +
                "    \"symbol\" : \"BTCUSDT\",\n" +
                "    \"baseCC\" : \"BTC\",\n" +
                "    \"counterCC\" : \"USDT\",\n" +
                "    \"orderType\" : \"LIMIT\",\n" +
                "    \"orderSide\" : \"SELL\",\n" +
                "    \"rate\" : \"2.80000000\",\n" +
                "    \"quantity\" : \"0.99900000\",\n" +
                "    \"orderTime\" : null,\n" +
                "    \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",\n" +
                "    \"orderStatus\" : 2,\n" +
                "    \"filledQuantity\" : \"0.00000000\",\n" +
                "    \"remainQuantity\" : \"0.00000000\",\n" +
                "    \"fillCost\" : \"0.00000000\",\n" +
                "    \"totalFillCost\" : \"0.00000000\",\n" +
                "    \"totalFilledQuantity\" : \"0.00000000\",\n" +
                "    \"stopPrice\" : \"0.00000000\",\n" +
                "    \"holdCost\" : \"0.00000000\",\n" +
                "    \"decimalPlaceAmount\" : 6,\n" +
                "    \"decimalPlacePrice\" : 2\n" +
                "  }\n" +
                "}");
        msgs.add("{\n" +
                "  \"msgType\" : \"REQUESTNEW\",\n" +
                "  \"msg\" : {\n" +
                "    \"orderId\" : \"66995\",\n" +
                "    \"symbol\" : \"BTCUSDT\",\n" +
                "    \"baseCC\" : \"BTC\",\n" +
                "    \"counterCC\" : \"USDT\",\n" +
                "    \"orderType\" : \"LIMIT\",\n" +
                "    \"orderSide\" : \"SELL\",\n" +
                "    \"rate\" : \"2.83000000\",\n" +
                "    \"quantity\" : \"0.00000100\",\n" +
                "    \"orderTime\" : null,\n" +
                "    \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",\n" +
                "    \"orderStatus\" : 2,\n" +
                "    \"filledQuantity\" : \"0.00000000\",\n" +
                "    \"remainQuantity\" : \"0.00000000\",\n" +
                "    \"fillCost\" : \"0.00000000\",\n" +
                "    \"totalFillCost\" : \"0.00000000\",\n" +
                "    \"totalFilledQuantity\" : \"0.00000000\",\n" +
                "    \"stopPrice\" : \"0.00000000\",\n" +
                "    \"holdCost\" : \"0.00000000\",\n" +
                "    \"decimalPlaceAmount\" : 6,\n" +
                "    \"decimalPlacePrice\" : 2\n" +
                "  }\n" +
                "}");
        msgs.add("{\n" +
                "  \"msgType\" : \"REQUESTNEW\",\n" +
                "  \"msg\" : {\n" +
                "    \"orderId\" : \"66996\",\n" +
                "    \"symbol\" : \"BTCUSDT\",\n" +
                "    \"baseCC\" : \"BTC\",\n" +
                "    \"counterCC\" : \"USDT\",\n" +
                "    \"orderType\" : \"LIMIT\",\n" +
                "    \"orderSide\" : \"SELL\",\n" +
                "    \"rate\" : \"2.82000000\",\n" +
                "    \"quantity\" : \"0.00044300\",\n" +
                "    \"orderTime\" : null,\n" +
                "    \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",\n" +
                "    \"orderStatus\" : 2,\n" +
                "    \"filledQuantity\" : \"0.00000000\",\n" +
                "    \"remainQuantity\" : \"0.00000000\",\n" +
                "    \"fillCost\" : \"0.00000000\",\n" +
                "    \"totalFillCost\" : \"0.00000000\",\n" +
                "    \"totalFilledQuantity\" : \"0.00000000\",\n" +
                "    \"stopPrice\" : \"0.00000000\",\n" +
                "    \"holdCost\" : \"0.00000000\",\n" +
                "    \"decimalPlaceAmount\" : 6,\n" +
                "    \"decimalPlacePrice\" : 2\n" +
                "  }\n" +
                "}");
        msgs.add("{\n" +
                "  \"msgType\" : \"REQUESTNEW\",\n" +
                "  \"msg\" : {\n" +
                "    \"orderId\" : \"66997\",\n" +
                "    \"symbol\" : \"BTCUSDT\",\n" +
                "    \"baseCC\" : \"BTC\",\n" +
                "    \"counterCC\" : \"USDT\",\n" +
                "    \"orderType\" : \"STOP_LIMIT\",\n" +
                "    \"orderSide\" : \"BUY\",\n" +
                "    \"rate\" : \"2.85000000\",\n" +
                "    \"quantity\" : \"1.25565600\",\n" +
                "    \"orderTime\" : null,\n" +
                "    \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",\n" +
                "    \"orderStatus\" : 2,\n" +
                "    \"filledQuantity\" : \"0.00000000\",\n" +
                "    \"remainQuantity\" : \"0.00000000\",\n" +
                "    \"fillCost\" : \"0.00000000\",\n" +
                "    \"totalFillCost\" : \"0.00000000\",\n" +
                "    \"totalFilledQuantity\" : \"0.00000000\",\n" +
                "    \"stopPrice\" : \"2.84000000\",\n" +
                "    \"holdCost\" : \"3.57862000\",\n" +
                "    \"decimalPlaceAmount\" : 6,\n" +
                "    \"decimalPlacePrice\" : 2\n" +
                "  }\n" +
                "}");
        msgs.add("{\n" +
                "  \"msgType\" : \"REQUESTNEW\",\n" +
                "  \"msg\" : {\n" +
                "    \"orderId\" : \"67000\",\n" +
                "    \"symbol\" : \"BTCUSDT\",\n" +
                "    \"baseCC\" : \"BTC\",\n" +
                "    \"counterCC\" : \"USDT\",\n" +
                "    \"orderType\" : \"LIMIT\",\n" +
                "    \"orderSide\" : \"BUY\",\n" +
                "    \"rate\" : \"2.84000000\",\n" +
                "    \"quantity\" : \"1.00000000\",\n" +
                "    \"orderTime\" : null,\n" +
                "    \"userId\" : \"u-ab00008c-0c6e-47e1-b8c7-248a4df771fa\",\n" +
                "    \"orderStatus\" : 2,\n" +
                "    \"filledQuantity\" : \"0.00000000\",\n" +
                "    \"remainQuantity\" : \"0.00000000\",\n" +
                "    \"fillCost\" : \"0.00000000\",\n" +
                "    \"totalFillCost\" : \"0.00000000\",\n" +
                "    \"totalFilledQuantity\" : \"0.00000000\",\n" +
                "    \"stopPrice\" : \"0.00000000\",\n" +
                "    \"holdCost\" : \"2.84000000\",\n" +
                "    \"decimalPlaceAmount\" : 6,\n" +
                "    \"decimalPlacePrice\" : 2\n" +
                "  }\n" +
                "}");
        msgs.add("{\n" +
                "  \"msgType\" : \"REQUESTNEW\",\n" +
                "  \"msg\" : {\n" +
                "    \"orderId\" : \"67001\",\n" +
                "    \"symbol\" : \"BTCUSDT\",\n" +
                "    \"baseCC\" : \"BTC\",\n" +
                "    \"counterCC\" : \"USDT\",\n" +
                "    \"orderType\" : \"LIMIT\",\n" +
                "    \"orderSide\" : \"SELL\",\n" +
                "    \"rate\" : \"2.84000000\",\n" +
                "    \"quantity\" : \"1.00000000\",\n" +
                "    \"orderTime\" : null,\n" +
                "    \"userId\" : \"u-ab00008c-0c6e-47e1-b8c7-248a4df771fa\",\n" +
                "    \"orderStatus\" : 2,\n" +
                "    \"filledQuantity\" : \"0.00000000\",\n" +
                "    \"remainQuantity\" : \"0.00000000\",\n" +
                "    \"fillCost\" : \"0.00000000\",\n" +
                "    \"totalFillCost\" : \"0.00000000\",\n" +
                "    \"totalFilledQuantity\" : \"0.00000000\",\n" +
                "    \"stopPrice\" : \"0.00000000\",\n" +
                "    \"holdCost\" : \"0.00000000\",\n" +
                "    \"decimalPlaceAmount\" : 6,\n" +
                "    \"decimalPlacePrice\" : 2\n" +
                "  }\n" +
                "}");
        msgs.add("{\n" +
                "  \"msgType\" : \"REQUESTNEW\",\n" +
                "  \"msg\" : {\n" +
                "    \"orderId\" : \"67002\",\n" +
                "    \"symbol\" : \"BTCUSDT\",\n" +
                "    \"baseCC\" : \"BTC\",\n" +
                "    \"counterCC\" : \"USDT\",\n" +
                "    \"orderType\" : \"LIMIT\",\n" +
                "    \"orderSide\" : \"SELL\",\n" +
                "    \"rate\" : \"2.85000000\",\n" +
                "    \"quantity\" : \"1.25565600\",\n" +
                "    \"orderTime\" : null,\n" +
                "    \"userId\" : \"u-ab00008c-0c6e-47e1-b8c7-248a4df771fa\",\n" +
                "    \"orderStatus\" : 2,\n" +
                "    \"filledQuantity\" : \"0.00000000\",\n" +
                "    \"remainQuantity\" : \"0.00000000\",\n" +
                "    \"fillCost\" : \"0.00000000\",\n" +
                "    \"totalFillCost\" : \"0.00000000\",\n" +
                "    \"totalFilledQuantity\" : \"0.00000000\",\n" +
                "    \"stopPrice\" : \"0.00000000\",\n" +
                "    \"holdCost\" : \"0.00000000\",\n" +
                "    \"decimalPlaceAmount\" : 6,\n" +
                "    \"decimalPlacePrice\" : 2\n" +
                "  }\n" +
                "}");
        msgs.add("{\n" +
                "  \"msgType\" : \"REQUESTNEW\",\n" +
                "  \"msg\" : {\n" +
                "    \"orderId\" : \"67009\",\n" +
                "    \"symbol\" : \"BTCUSDT\",\n" +
                "    \"baseCC\" : \"BTC\",\n" +
                "    \"counterCC\" : \"USDT\",\n" +
                "    \"orderType\" : \"STOP_LIMIT\",\n" +
                "    \"orderSide\" : \"BUY\",\n" +
                "    \"rate\" : \"2.87000000\",\n" +
                "    \"quantity\" : \"2.55466800\",\n" +
                "    \"orderTime\" : null,\n" +
                "    \"userId\" : \"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",\n" +
                "    \"orderStatus\" : 2,\n" +
                "    \"filledQuantity\" : \"0.00000000\",\n" +
                "    \"remainQuantity\" : \"0.00000000\",\n" +
                "    \"fillCost\" : \"0.00000000\",\n" +
                "    \"totalFillCost\" : \"0.00000000\",\n" +
                "    \"totalFilledQuantity\" : \"0.00000000\",\n" +
                "    \"stopPrice\" : \"2.86000000\",\n" +
                "    \"holdCost\" : \"7.33189700\",\n" +
                "    \"decimalPlaceAmount\" : 6,\n" +
                "    \"decimalPlacePrice\" : 2\n" +
                "  }\n" +
                "}");
        msgs.add("{\n" +
                "  \"msgType\" : \"REQUESTNEW\",\n" +
                "  \"msg\" : {\n" +
                "    \"orderId\" : \"67012\",\n" +
                "    \"symbol\" : \"BTCUSDT\",\n" +
                "    \"baseCC\" : \"BTC\",\n" +
                "    \"counterCC\" : \"USDT\",\n" +
                "    \"orderType\" : \"LIMIT\",\n" +
                "    \"orderSide\" : \"SELL\",\n" +
                "    \"rate\" : \"2.86000000\",\n" +
                "    \"quantity\" : \"2.00000000\",\n" +
                "    \"orderTime\" : null,\n" +
                "    \"userId\" : \"u-ab00008c-0c6e-47e1-b8c7-248a4df771fa\",\n" +
                "    \"orderStatus\" : 2,\n" +
                "    \"filledQuantity\" : \"0.00000000\",\n" +
                "    \"remainQuantity\" : \"0.00000000\",\n" +
                "    \"fillCost\" : \"0.00000000\",\n" +
                "    \"totalFillCost\" : \"0.00000000\",\n" +
                "    \"totalFilledQuantity\" : \"0.00000000\",\n" +
                "    \"stopPrice\" : \"0.00000000\",\n" +
                "    \"holdCost\" : \"0.00000000\",\n" +
                "    \"decimalPlaceAmount\" : 6,\n" +
                "    \"decimalPlacePrice\" : 2\n" +
                "  }\n" +
                "}");
        msgs.add("{\n" +
                "  \"msgType\" : \"REQUESTNEW\",\n" +
                "  \"msg\" : {\n" +
                "    \"orderId\" : \"67013\",\n" +
                "    \"symbol\" : \"BTCUSDT\",\n" +
                "    \"baseCC\" : \"BTC\",\n" +
                "    \"counterCC\" : \"USDT\",\n" +
                "    \"orderType\" : \"LIMIT\",\n" +
                "    \"orderSide\" : \"BUY\",\n" +
                "    \"rate\" : \"2.86000000\",\n" +
                "    \"quantity\" : \"1.00000000\",\n" +
                "    \"orderTime\" : null,\n" +
                "    \"userId\" : \"u-ab00008c-0c6e-47e1-b8c7-248a4df771fa\",\n" +
                "    \"orderStatus\" : 2,\n" +
                "    \"filledQuantity\" : \"0.00000000\",\n" +
                "    \"remainQuantity\" : \"0.00000000\",\n" +
                "    \"fillCost\" : \"0.00000000\",\n" +
                "    \"totalFillCost\" : \"0.00000000\",\n" +
                "    \"totalFilledQuantity\" : \"0.00000000\",\n" +
                "    \"stopPrice\" : \"0.00000000\",\n" +
                "    \"holdCost\" : \"2.86000000\",\n" +
                "    \"decimalPlaceAmount\" : 6,\n" +
                "    \"decimalPlacePrice\" : 2\n" +
                "  }\n" +
                "}");
        msgs.add("{\n" +
                "  \"msgType\" : \"REQUESTNEW\",\n" +
                "  \"msg\" : {\n" +
                "    \"orderId\" : \"67015\",\n" +
                "    \"symbol\" : \"BTCUSDT\",\n" +
                "    \"baseCC\" : \"BTC\",\n" +
                "    \"counterCC\" : \"USDT\",\n" +
                "    \"orderType\" : \"LIMIT\",\n" +
                "    \"orderSide\" : \"SELL\",\n" +
                "    \"rate\" : \"2.87000000\",\n" +
                "    \"quantity\" : \"0.50000000\",\n" +
                "    \"orderTime\" : null,\n" +
                "    \"userId\" : \"u-ab00008c-0c6e-47e1-b8c7-248a4df771fa\",\n" +
                "    \"orderStatus\" : 2,\n" +
                "    \"filledQuantity\" : \"0.00000000\",\n" +
                "    \"remainQuantity\" : \"0.00000000\",\n" +
                "    \"fillCost\" : \"0.00000000\",\n" +
                "    \"totalFillCost\" : \"0.00000000\",\n" +
                "    \"totalFilledQuantity\" : \"0.00000000\",\n" +
                "    \"stopPrice\" : \"0.00000000\",\n" +
                "    \"holdCost\" : \"0.00000000\",\n" +
                "    \"decimalPlaceAmount\" : 6,\n" +
                "    \"decimalPlacePrice\" : 2\n" +
                "  }\n" +
                "}");

        for(String msg1: msgs)
        {
            producer.produceMessage(msg1);

        }


    }
}
