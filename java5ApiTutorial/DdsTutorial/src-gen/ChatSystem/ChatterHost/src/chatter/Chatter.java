package chatter;

import org.omg.dds.domain.DomainParticipant;
import org.omg.dds.domain.DomainParticipantQos;
import org.omg.dds.pub.PublisherQos;
import org.omg.dds.pub.DataWriterQos;
import org.omg.dds.sub.SubscriberQos;
import org.omg.dds.sub.DataReaderQos;
import org.omg.dds.topic.TopicQos;
import org.omg.dds.core.ServiceEnvironment;
import org.omg.dds.domain.DomainParticipantFactory;
import org.omg.dds.core.InstanceHandle;
import org.omg.dds.core.QosProvider;
import java.util.Collection;
import java.util.HashSet;
import org.omg.dds.core.status.Status;
import org.omg.dds.topic.Topic;
import org.omg.dds.pub.Publisher;
import org.omg.dds.pub.DataWriter;
import org.omg.dds.sub.Subscriber;
import org.omg.dds.sub.DataReader;
import org.omg.dds.domain.DomainParticipantListener;
import org.omg.dds.pub.PublisherListener;
import org.omg.dds.pub.DataWriterListener;
import org.omg.dds.sub.SubscriberListener;
import org.omg.dds.sub.DataReaderListener;
import org.omg.dds.topic.TopicListener;
import ChatModule.NameService;
import ChatModule.ChatMessage;
import org.omg.dds.core.status.*;
import org.omg.dds.sub.SampleState;
import org.omg.dds.sub.ViewState;
import org.omg.dds.sub.InstanceState;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.ArrayList;
//Start of user code User defined imports
//End of user code

//Start of user code class comments
//End of user code
public class Chatter {

	//Attributes for participant ChatterDomainParticipant
	private ServiceEnvironment env;
	private DomainParticipant ChatterDomainParticipant;
	private Publisher ChatterPublisher;
	private DataWriter<NameService> NameServiceDataWriter;
	private DataWriter<ChatMessage> ChatMessageDataWriter;
	Topic<NameService> NameServiceTopic;
	Topic<ChatMessage> ChatMessageTopic;
	// Start of user code User defined attributes
	private int chatterId;
	private String chatterName;
	// End of user code

	public Chatter() {
		System.setProperty(ServiceEnvironment.IMPLEMENTATION_CLASS_NAME_PROPERTY,
			"org.opensplice.dds.core.OsplServiceEnvironment");
		this.env = ServiceEnvironment.createInstance(Chatter.class.getClassLoader());
		DomainParticipantFactory dpf = DomainParticipantFactory.getInstance(env);
		
		//Initializing DomainParticipant ChatterDomainParticipant
		DomainParticipantQos ChatterDomainParticipantQos = dpf.getDefaultParticipantQos();
		DomainParticipantListener ChatterDomainParticipantListener = null;
		Collection<Class<? extends Status>> ChatterDomainParticipantStatus = new HashSet<>();
		this.ChatterDomainParticipant = dpf.createParticipant(0, ChatterDomainParticipantQos, ChatterDomainParticipantListener, ChatterDomainParticipantStatus);
		PublisherQos ChatterPublisherQos = this.ChatterDomainParticipant.getDefaultPublisherQos();
		PublisherListener ChatterPublisherListener = null;
		Collection<Class<? extends Status>> ChatterPublisherStatus = new HashSet<>();
		this.ChatterPublisher = this.ChatterDomainParticipant.createPublisher(ChatterPublisherQos, ChatterPublisherListener, ChatterPublisherStatus);
		QosProvider NameServiceTopicQosProvider = QosProvider.newQosProvider("file://./qos/NameServiceQosProfile.xml", "NameServiceQosProfile", env);
		TopicQos NameServiceTopicQos = NameServiceTopicQosProvider.getTopicQos();
		TopicListener<NameService> NameServiceTopicListener = null;
		Collection<Class<? extends Status>> NameServiceTopicStatus = new HashSet<>();
		this.NameServiceTopic = this.ChatterDomainParticipant.createTopic("NameServiceTopic", NameService.class, NameServiceTopicQos, NameServiceTopicListener, NameServiceTopicStatus);
		DataWriterQos NameServiceDataWriterQos = this.ChatterPublisher.copyFromTopicQos(this.ChatterPublisher.getDefaultDataWriterQos(), this.NameServiceTopic.getQos());
		DataWriterListener<NameService> NameServiceDataWriterListener = null;
		Collection<Class<? extends Status>> NameServiceDataWriterStatus = new HashSet<>();
		this.NameServiceDataWriter = this.ChatterPublisher.createDataWriter(this.NameServiceTopic, NameServiceDataWriterQos, NameServiceDataWriterListener, NameServiceDataWriterStatus);
		QosProvider ChatMessageTopicQosProvider = QosProvider.newQosProvider("file://./qos/ChatMessageQosProfile.xml", "ChatMessageQosProfile", env);
		TopicQos ChatMessageTopicQos = ChatMessageTopicQosProvider.getTopicQos();
		TopicListener<ChatMessage> ChatMessageTopicListener = null;
		Collection<Class<? extends Status>> ChatMessageTopicStatus = new HashSet<>();
		this.ChatMessageTopic = this.ChatterDomainParticipant.createTopic("ChatMessageTopic", ChatMessage.class, ChatMessageTopicQos, ChatMessageTopicListener, ChatMessageTopicStatus);
		DataWriterQos ChatMessageDataWriterQos = this.ChatterPublisher.copyFromTopicQos(this.ChatterPublisher.getDefaultDataWriterQos(), this.ChatMessageTopic.getQos());
		DataWriterListener<ChatMessage> ChatMessageDataWriterListener = null;
		Collection<Class<? extends Status>> ChatMessageDataWriterStatus = new HashSet<>();
		this.ChatMessageDataWriter = this.ChatterPublisher.createDataWriter(this.ChatMessageTopic, ChatMessageDataWriterQos, ChatMessageDataWriterListener, ChatMessageDataWriterStatus);
		

		//Start of user code User attributes initialization
		//End of user code
	}

	public void applicationBehavior() {
		//Start of user code Application behavior
		NameService name = new NameService();
		name.id = this.chatterId;
		name.Name = this.chatterName;
		
		try {
			InstanceHandle nameHandle = this.NameServiceDataWriter.registerInstance(name);
			this.NameServiceDataWriter.write(name, nameHandle);
			if (this.chatterId == -1) {
				this.NameServiceDataWriter.dispose(nameHandle);
				this.NameServiceDataWriter.unregisterInstance(nameHandle);
				System.exit(0);
			}
			int msgIndex = 0;
			ChatMessage msg = new ChatMessage();
			msg.senderId = this.chatterId;
			msg.messageIndex = msgIndex;
			msg.message = "Hi, I am " + this.chatterName + " I will send you ten more messages";
			msgIndex++;
			InstanceHandle msgHandle = this.ChatMessageDataWriter.registerInstance(msg);
			this.ChatMessageDataWriter.write(msg, msgHandle);
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				msg.messageIndex = msgIndex;
				msg.message = "Message number " + i;
				this.ChatMessageDataWriter.write(msg, msgHandle);
				msgIndex++;
			}
			this.ChatMessageDataWriter.dispose(msgHandle);
			this.ChatMessageDataWriter.unregisterInstance(msgHandle);
			this.NameServiceDataWriter.dispose(nameHandle);
			this.NameServiceDataWriter.unregisterInstance(nameHandle);
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//End of user code
	}

	// Start of user code User defined methods
	public int getChatterId() {
		return this.chatterId;
	}
	
	public void setChatterId(int chatterId) {
		this.chatterId = chatterId;
	}
	
	public String getChatterName() {
		return this.chatterName;
	}
	
	public void setChatterName(String chatterName) {
		this.chatterName = chatterName;
	}
	// End of user code

	public static void main(String[] args) {
		Chatter application = new Chatter();
		//Start of user code User attribute settings
		if (args.length < 2) {
			System.out.println("Usage: java Chatter id name");
			System.exit(0);
		}
		application.setChatterId(Integer.parseInt(args[0]));
		application.setChatterName(args[1]);
		//End of user code
		application.applicationBehavior();
	}
}
