package com.principal.test;

import java.io.File;
import java.io.StringWriter;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueReceiver;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

import com.ibm.mq.jms.MQQueueConnectionFactory;


/**
 *
 *	Provide Comments
 *
 */
public class HRODSMsgPublisher2 {
	/**
     * Sends the Message to the queue
     *
     * @param String
     *            messageBuffer
     * @throws JMSException, Exception
     */

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String msg ="Hello";
		
		try {
			publishMessageToQueue(msg);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void publishMessageToQueue(String XML) throws Exception {
        String qManager = "ZZZZZ";
        String channel = "XXXXX";
        String hostname = "CCCCCC";
        String qName = "COR.LTR.NOTIFICATION.Q";
        String portNumber = "1416";
        
        Integer port = new Integer(portNumber);

        QueueSession session = null;
        Queue queue = null;
        QueueConnection con = null;
        QueueReceiver receiver = null;
        QueueSender sender = null;
        String userid = "XACSSLFK";
        String pwd = "gk7429y#";

        try {
            MQQueueConnectionFactory factory = new MQQueueConnectionFactory();

            factory.setTransportType(com.ibm.mq.jms.JMSC.MQJMS_TP_CLIENT_MQ_TCPIP);
            factory.setHostName(hostname);
            factory.setPort(port.intValue());
            factory.setQueueManager(qManager);
            factory.setChannel(channel);

            con = factory.createQueueConnection(userid, pwd);
            con.start();

            session = con.createQueueSession(true, Session.AUTO_ACKNOWLEDGE);
            queue = session.createQueue(qName);

            receiver = session.createReceiver(queue);
            sender = session.createSender(queue);

            TextMessage textMsg = session.createTextMessage();
            textMsg.setText(XML);
            sender.send(textMsg);
            session.commit();
            System.out.println("message published : " + textMsg);
            System.out.println("message Posted ");

        } catch (JMSException jmse) {
        	jmse.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (receiver != null) {
                receiver.close();
            }
            if (sender != null) {
                sender.close();
            }
            if (session != null) {
                session.close();
            }
            if (con != null) {
                con.stop();
                con.close();
            }
        }
    }
}
