/**
 * This is a message producer code.
 * It can be used any where in the springboot application
 * where you want to send the message.
 */
package com.stackroute.pocrabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Producer {

    /*Queue name*/
    private final static String QUEUE_NAME = "hello";

    /*The main method establishes a connection between consumer using connection factory.
    And passes the messages in the form of queue.
     */
    public static void main(String[] argv) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            String message = "Hello World!";
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));
            System.out.println(" [x] Sent '" + message + "'");
        }
    }
}
