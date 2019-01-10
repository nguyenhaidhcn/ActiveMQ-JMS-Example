package nl.marktplaats.producer;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.spring.ActiveMQConnectionFactory;

public class Producer {
    
    private Connection connection;
    private Session session;
    Destination destination;
    MessageProducer producer;

    public Producer() throws JMSException {
        // Create a ConnectionFactory
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
//        connectionFactory.setBrokerURL("tcp://192.168.1.109:61616");
//        connectionFactory.setBrokerURL("tcp://192.168.1.221:61616");
        connectionFactory.setBrokerURL("tcp://localhost:61616");
        connection = connectionFactory.createConnection();
        connection.start();
        session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        destination = session.createQueue("OrderMatching.Queue");
//        destination = session.createTopic("InitOrder.Topic");

//        destination = session.createTopic("NodeOrderBook.Topic");

        producer = session.createProducer(destination);
        producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

    }
    
    public void produceMessage(String msg) {
        try {

            // Create a messages
            TextMessage message = session.createTextMessage(msg);
            // Tell the producer to send the message
            System.out.println("Sent message: "+ message.getText());
            producer.send(message);
        }
        catch (Exception e) {
            System.out.println("Caught: " + e);
            e.printStackTrace();
        }
    }
}
