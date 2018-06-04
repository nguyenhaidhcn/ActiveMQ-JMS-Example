package nl.marktplaats.consumer;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.spring.ActiveMQConnectionFactory;

public class Consumer {
    public Consumer() throws JMSException {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        connectionFactory.setBrokerURL("tcp://10.1.1.73:61616");

        Connection connection = connectionFactory.createConnection();
        connection.start();
        
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        MessageConsumer consumer = session.createConsumer(session.createTopic("OrderResponse.Topic"));
        consumer.setMessageListener(new HelloMessageListener());
        
    }
    
    private static class HelloMessageListener implements MessageListener {

        @Override
        public void onMessage(Message message) {
            TextMessage textMessage = (TextMessage) message;
            try {

                //do anything with response msg.
                System.out.println("Consumer " + Thread.currentThread().getName() + " received message: " + textMessage.getText());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
        
    }
}
