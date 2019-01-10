package nl.marktplaats.producer;

import java.util.Scanner;

public class TestInitOrder {

    //order book remain sell
    public void testInitOrder(Producer producer)
    {
        String msg;
        Scanner scan= new Scanner(System.in);
        String text;
        text = scan.nextLine();

        msg = "{\"msgType\":\"REQUESTOPENORDER\",\"msg\":{\"orderId\":\"66104\",\"symbol\":\"ETHBTC\",\"baseCC\":\"ETH\",\"counterCC\":\"BTC\",\"orderType\":\"LIMIT\",\"orderSide\":\"BUY\",\"rate\":\"0.50000000\",\"quantity\":\"1.00000000\",\"orderTime\":1542336617573,\"userId\":\"u-512977fd-2968-4681-8b2c-b99aa40f734b\",\"orderStatus\":6,\"filledQuantity\":\"0.25500000\",\"remainQuantity\":\"0.74500000\",\"fillCost\":\"0.10385000\",\"totalFillCost\":\"0.10385000\",\"totalFilledQuantity\":\"0.25500000\",\"stopPrice\":\"0.00000000\",\"holdCost\":\"0.39615000\",\"decimalPlaceAmount\":3,\"decimalPlacePrice\":6}}";
        producer.produceMessage(msg);

        msg = "{\"msgType\":\"REQUESTOPENORDER\",\"msg\":{\"orderId\":\"66098\",\"symbol\":\"ETHBTC\",\"baseCC\":\"ETH\",\"counterCC\":\"BTC\",\"orderType\":\"LIMIT\",\"orderSide\":\"BUY\",\"rate\":\"0.06356400\",\"quantity\":\"0.14300000\",\"orderTime\":1542302971479,\"userId\":\"u-6a9fcfc8-6ad5-4432-b215-d23ab40b0389\",\"orderStatus\":2,\"filledQuantity\":\"0.00000000\",\"remainQuantity\":\"0.14300000\",\"fillCost\":\"0.00000000\",\"totalFillCost\":\"0.00000000\",\"totalFilledQuantity\":\"0.00000000\",\"stopPrice\":\"0.00000000\",\"holdCost\":\"0.00909000\",\"decimalPlaceAmount\":3,\"decimalPlacePrice\":6}}";
        producer.produceMessage(msg);

        msg = "{\"msgType\":\"REQUESTOPENORDER\",\"msg\":{\"orderId\":\"66097\",\"symbol\":\"ETHBTC\",\"baseCC\":\"ETH\",\"counterCC\":\"BTC\",\"orderType\":\"LIMIT\",\"orderSide\":\"BUY\",\"rate\":\"0.00000100\",\"quantity\":\"0.14500000\",\"orderTime\":1542302572840,\"userId\":\"u-6a9fcfc8-6ad5-4432-b215-d23ab40b0389\",\"orderStatus\":2,\"filledQuantity\":\"0.00000000\",\"remainQuantity\":\"0.14500000\",\"fillCost\":\"0.00000000\",\"totalFillCost\":\"0.00000000\",\"totalFilledQuantity\":\"0.00000000\",\"stopPrice\":\"0.00000000\",\"holdCost\":\"0.00000000\",\"decimalPlaceAmount\":3,\"decimalPlacePrice\":6}}";
        producer.produceMessage(msg);

        msg = "{\"msgType\":\"REQUESTOPENORDER\",\"msg\":{\"orderId\":\"66069\",\"symbol\":\"ETHBTC\",\"baseCC\":\"ETH\",\"counterCC\":\"BTC\",\"orderType\":\"LIMIT\",\"orderSide\":\"BUY\",\"rate\":\"0.06356400\",\"quantity\":\"0.14300000\",\"orderTime\":1542284672127,\"userId\":\"u-5c92881b-c270-487d-8aa1-7b22204df624\",\"orderStatus\":6,\"filledQuantity\":\"0.01000000\",\"remainQuantity\":\"0.13300000\",\"fillCost\":\"0.00063564\",\"totalFillCost\":\"0.00063564\",\"totalFilledQuantity\":\"0.01000000\",\"stopPrice\":\"0.00000000\",\"holdCost\":\"0.00845436\",\"decimalPlaceAmount\":3,\"decimalPlacePrice\":6}}";
        producer.produceMessage(msg);

        msg = "{\"msgType\":\"REQUESTOPENORDER\",\"msg\":{\"orderId\":\"66063\",\"symbol\":\"ETHBTC\",\"baseCC\":\"ETH\",\"counterCC\":\"BTC\",\"orderType\":\"LIMIT\",\"orderSide\":\"BUY\",\"rate\":\"0.00000100\",\"quantity\":\"0.14500000\",\"orderTime\":1542283357720,\"userId\":\"u-5c92881b-c270-487d-8aa1-7b22204df624\",\"orderStatus\":2,\"filledQuantity\":\"0.00000000\",\"remainQuantity\":\"0.14500000\",\"fillCost\":\"0.00000000\",\"totalFillCost\":\"0.00000000\",\"totalFilledQuantity\":\"0.00000000\",\"stopPrice\":\"0.00000000\",\"holdCost\":\"0.00000000\",\"decimalPlaceAmount\":3,\"decimalPlacePrice\":6}}";
        producer.produceMessage(msg);

        msg = "{\"msgType\":\"REQUESTOPENORDER\",\"msg\":{\"orderId\":\"66062\",\"symbol\":\"ETHBTC\",\"baseCC\":\"ETH\",\"counterCC\":\"BTC\",\"orderType\":\"LIMIT\",\"orderSide\":\"BUY\",\"rate\":\"0.00000300\",\"quantity\":\"0.23400000\",\"orderTime\":1542283303040,\"userId\":\"u-5c92881b-c270-487d-8aa1-7b22204df624\",\"orderStatus\":2,\"filledQuantity\":\"0.00000000\",\"remainQuantity\":\"0.23400000\",\"fillCost\":\"0.00000000\",\"totalFillCost\":\"0.00000000\",\"totalFilledQuantity\":\"0.00000000\",\"stopPrice\":\"0.00000000\",\"holdCost\":\"0.00000100\",\"decimalPlaceAmount\":3,\"decimalPlacePrice\":6}}";
        producer.produceMessage(msg);

        msg = "{\"msgType\":\"REQUESTOPENORDER\",\"msg\":{\"orderId\":\"66061\",\"symbol\":\"ETHBTC\",\"baseCC\":\"ETH\",\"counterCC\":\"BTC\",\"orderType\":\"LIMIT\",\"orderSide\":\"BUY\",\"rate\":\"0.00033500\",\"quantity\":\"0.23400000\",\"orderTime\":1542283263379,\"userId\":\"u-5c92881b-c270-487d-8aa1-7b22204df624\",\"orderStatus\":2,\"filledQuantity\":\"0.00000000\",\"remainQuantity\":\"0.23400000\",\"fillCost\":\"0.00000000\",\"totalFillCost\":\"0.00000000\",\"totalFilledQuantity\":\"0.00000000\",\"stopPrice\":\"0.00000000\",\"holdCost\":\"0.00007800\",\"decimalPlaceAmount\":3,\"decimalPlacePrice\":6}}";
        producer.produceMessage(msg);

        msg = "{\"msgType\":\"REQUESTOPENORDER\",\"msg\":{\"orderId\":\"66051\",\"symbol\":\"ETHBTC\",\"baseCC\":\"ETH\",\"counterCC\":\"BTC\",\"orderType\":\"LIMIT\",\"orderSide\":\"SELL\",\"rate\":\"3.00000000\",\"quantity\":\"4.00000000\",\"orderTime\":1542282583307,\"userId\":\"u-5c92881b-c270-487d-8aa1-7b22204df624\",\"orderStatus\":2,\"filledQuantity\":\"0.00000000\",\"remainQuantity\":\"4.00000000\",\"fillCost\":\"0.00000000\",\"totalFillCost\":\"0.00000000\",\"totalFilledQuantity\":\"0.00000000\",\"stopPrice\":\"0.00000000\",\"holdCost\":\"0.00000000\",\"decimalPlaceAmount\":3,\"decimalPlacePrice\":6}}";
        producer.produceMessage(msg);

        msg = "{\"msgType\":\"REQUESTOPENORDER\",\"msg\":{\"orderId\":\"66049\",\"symbol\":\"ETHBTC\",\"baseCC\":\"ETH\",\"counterCC\":\"BTC\",\"orderType\":\"LIMIT\",\"orderSide\":\"SELL\",\"rate\":\"2.90000000\",\"quantity\":\"4.00000000\",\"orderTime\":1542282566761,\"userId\":\"u-5c92881b-c270-487d-8aa1-7b22204df624\",\"orderStatus\":6,\"filledQuantity\":\"1.00000000\",\"remainQuantity\":\"3.00000000\",\"fillCost\":\"2.90000000\",\"totalFillCost\":\"2.90000000\",\"totalFilledQuantity\":\"1.00000000\",\"stopPrice\":\"0.00000000\",\"holdCost\":\"0.00000000\",\"decimalPlaceAmount\":3,\"decimalPlacePrice\":6}}";
        producer.produceMessage(msg);

        msg = "{\"msgType\":\"REQUESTOPENORDER\",\"msg\":{\"orderId\":\"66005\",\"symbol\":\"ETHBTC\",\"baseCC\":\"ETH\",\"counterCC\":\"BTC\",\"orderType\":\"LIMIT\",\"orderSide\":\"BUY\",\"rate\":\"2.60000000\",\"quantity\":\"2.00000000\",\"orderTime\":1542280688264,\"userId\":\"u-6a9fcfc8-6ad5-4432-b215-d23ab40b0389\",\"orderStatus\":6,\"filledQuantity\":\"1.63500000\",\"remainQuantity\":\"0.36500000\",\"fillCost\":\"4.25100000\",\"totalFillCost\":\"4.25100000\",\"totalFilledQuantity\":\"2.00000000\",\"stopPrice\":\"0.00000000\",\"holdCost\":\"0.94900000\",\"decimalPlaceAmount\":3,\"decimalPlacePrice\":6}}";
        producer.produceMessage(msg);

        msg = "{\"msgType\":\"REQUESTOPENORDER\",\"msg\":{\"orderId\":\"65984\",\"symbol\":\"ETHBTC\",\"baseCC\":\"ETH\",\"counterCC\":\"BTC\",\"orderType\":\"LIMIT\",\"orderSide\":\"BUY\",\"rate\":\"2.50000000\",\"quantity\":\"0.43500000\",\"orderTime\":1542279587261,\"userId\":\"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",\"orderStatus\":2,\"filledQuantity\":\"0.00000000\",\"remainQuantity\":\"0.43500000\",\"fillCost\":\"0.00000000\",\"totalFillCost\":\"0.00000000\",\"totalFilledQuantity\":\"0.00000000\",\"stopPrice\":\"0.00000000\",\"holdCost\":\"1.08750000\",\"decimalPlaceAmount\":3,\"decimalPlacePrice\":6}}";
        producer.produceMessage(msg);

        msg = "{\"msgType\":\"REQUESTOPENORDER\",\"msg\":{\"orderId\":\"65983\",\"symbol\":\"ETHBTC\",\"baseCC\":\"ETH\",\"counterCC\":\"BTC\",\"orderType\":\"LIMIT\",\"orderSide\":\"BUY\",\"rate\":\"2.60000000\",\"quantity\":\"1.20000000\",\"orderTime\":1542279575926,\"userId\":\"u-f9e9996e-346a-4dda-85c2-4619dbc7334f\",\"orderStatus\":2,\"filledQuantity\":\"0.00000000\",\"remainQuantity\":\"1.20000000\",\"fillCost\":\"0.00000000\",\"totalFillCost\":\"0.00000000\",\"totalFilledQuantity\":\"0.00000000\",\"stopPrice\":\"0.00000000\",\"holdCost\":\"3.12000000\",\"decimalPlaceAmount\":3,\"decimalPlacePrice\":6}}";
        producer.produceMessage(msg);

        msg = "{\"msgType\":\"FINISH\",\"msg\":\"FINISH\"}";
        producer.produceMessage(msg);

//        msg = "";
//        producer.produceMessage(msg);
//
//
////        System.out.println("Press any key to SELL STOP");
////        text = scan.nextLine();
//        msg = "";
//        producer.produceMessage(msg);
//
//
//        System.out.println("Check order book remain sell");
    }
}
