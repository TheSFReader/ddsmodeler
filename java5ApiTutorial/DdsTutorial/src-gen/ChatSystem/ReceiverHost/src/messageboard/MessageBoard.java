package messageboard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
//Start of user code User defined imports
import java.util.Map;
import java.util.concurrent.TimeoutException;

import org.omg.dds.core.Condition;
import org.omg.dds.core.Duration;
import org.omg.dds.core.QosProvider;
import org.omg.dds.core.ServiceEnvironment;
import org.omg.dds.core.WaitSet;
import org.omg.dds.core.status.Status;
import org.omg.dds.domain.DomainParticipant;
import org.omg.dds.domain.DomainParticipantFactory;
import org.omg.dds.domain.DomainParticipantListener;
import org.omg.dds.domain.DomainParticipantQos;
import org.omg.dds.sub.DataReader;
import org.omg.dds.sub.DataReaderListener;
import org.omg.dds.sub.DataReaderQos;
import org.omg.dds.sub.InstanceState;
import org.omg.dds.sub.ReadCondition;
import org.omg.dds.sub.Sample;
import org.omg.dds.sub.SampleState;
import org.omg.dds.sub.Subscriber;
import org.omg.dds.sub.SubscriberListener;
import org.omg.dds.sub.SubscriberQos;
import org.omg.dds.sub.ViewState;
import org.omg.dds.topic.Topic;
import org.omg.dds.topic.TopicListener;
import org.omg.dds.topic.TopicQos;

import ChatModule.ChatMessage;
import ChatModule.NameService;

//Start of user code class comments
//End of user code

//Start of user code class comments
//End of user code
public class MessageBoard {

	//Attributes for participant MessageBoardParticipant
	private ServiceEnvironment env;
	private DomainParticipant MessageBoardParticipant;
	private Subscriber MessageBoardSubscriber;
	private DataReader<ChatMessage> ChatMessageDataReader;
	private DataReader<NameService> NameServiceDataReader;
	Topic<NameService> NameServiceTopic;
	Topic<ChatMessage> ChatMessageTopic;
	//Attributes for Waitset MessageBoardWaitset
	private WaitSet MessageBoardWaitset;
	private ReadCondition<NameService> NameServiceDataReaderRC;
	private Subscriber.DataState NameServiceDataReaderRCDS;
	private ReadCondition<ChatMessage> ChatMessageDataReaderRC;
	private Subscriber.DataState ChatMessageDataReaderRCDS;

	// Start of user code User defined attributes
	private Map<Integer, String> userNames;
	// End of user code

	public MessageBoard() {
		System.setProperty(ServiceEnvironment.IMPLEMENTATION_CLASS_NAME_PROPERTY,
				"org.opensplice.dds.core.OsplServiceEnvironment");
		this.env = ServiceEnvironment.createInstance(MessageBoard.class.getClassLoader());
		DomainParticipantFactory dpf = DomainParticipantFactory.getInstance(env);

		//Initializing DomainParticipant MessageBoardParticipant
		DomainParticipantQos MessageBoardParticipantQos = dpf.getDefaultParticipantQos();
		DomainParticipantListener MessageBoardParticipantListener = null;
		Collection<Class<? extends Status>> MessageBoardParticipantStatus = new HashSet<>();
		this.MessageBoardParticipant = dpf.createParticipant(0, MessageBoardParticipantQos, MessageBoardParticipantListener, MessageBoardParticipantStatus);
		SubscriberQos MessageBoardSubscriberQos = this.MessageBoardParticipant.getDefaultSubscriberQos();
		SubscriberListener MessageBoardSubscriberListener = null;
		Collection<Class<? extends Status>> MessageBoardSubscriberStatus = new HashSet<>();
		this.MessageBoardSubscriber = this.MessageBoardParticipant.createSubscriber(MessageBoardSubscriberQos, MessageBoardSubscriberListener, MessageBoardSubscriberStatus);
		QosProvider ChatMessageTopicQosProvider = QosProvider.newQosProvider("file://./qos/ChatMessageQosProfile.xml", "ChatMessageQosProfile", env);
		TopicQos ChatMessageTopicQos = ChatMessageTopicQosProvider.getTopicQos();
		TopicListener<ChatMessage> ChatMessageTopicListener = null;
		Collection<Class<? extends Status>> ChatMessageTopicStatus = new HashSet<>();
		this.ChatMessageTopic = this.MessageBoardParticipant.createTopic("ChatMessageTopic", ChatMessage.class, ChatMessageTopicQos, ChatMessageTopicListener, ChatMessageTopicStatus);
		DataReaderQos ChatMessageDataReaderQos = this.MessageBoardSubscriber.copyFromTopicQos(this.MessageBoardSubscriber.getDefaultDataReaderQos(), this.ChatMessageTopic.getQos());
		DataReaderListener<ChatMessage> ChatMessageDataReaderListener = null;
		Collection<Class<? extends Status>> ChatMessageDataReaderStatus = new HashSet<>();
		this.ChatMessageDataReader = this.MessageBoardSubscriber.createDataReader(this.ChatMessageTopic, ChatMessageDataReaderQos, ChatMessageDataReaderListener, ChatMessageDataReaderStatus);
		QosProvider NameServiceTopicQosProvider = QosProvider.newQosProvider("file://./qos/NameServiceQosProfile.xml", "NameServiceQosProfile", env);
		TopicQos NameServiceTopicQos = NameServiceTopicQosProvider.getTopicQos();
		TopicListener<NameService> NameServiceTopicListener = null;
		Collection<Class<? extends Status>> NameServiceTopicStatus = new HashSet<>();
		this.NameServiceTopic = this.MessageBoardParticipant.createTopic("NameServiceTopic", NameService.class, NameServiceTopicQos, NameServiceTopicListener, NameServiceTopicStatus);
		DataReaderQos NameServiceDataReaderQos = this.MessageBoardSubscriber.copyFromTopicQos(this.MessageBoardSubscriber.getDefaultDataReaderQos(), this.NameServiceTopic.getQos());
		DataReaderListener<NameService> NameServiceDataReaderListener = null;
		Collection<Class<? extends Status>> NameServiceDataReaderStatus = new HashSet<>();
		this.NameServiceDataReader = this.MessageBoardSubscriber.createDataReader(this.NameServiceTopic, NameServiceDataReaderQos, NameServiceDataReaderListener, NameServiceDataReaderStatus);

		this.MessageBoardWaitset = WaitSet.newWaitSet(env);
		this.NameServiceDataReaderRCDS = this.MessageBoardSubscriber.createDataState();
		this.NameServiceDataReaderRCDS = this.NameServiceDataReaderRCDS
				.with(SampleState.NOT_READ)
				.with(ViewState.NEW).with(ViewState.NOT_NEW)
				.with(InstanceState.ALIVE)
				;
		this.NameServiceDataReaderRC = this.NameServiceDataReader.createReadCondition(NameServiceDataReaderRCDS);
		this.MessageBoardWaitset.attachCondition(this.NameServiceDataReaderRC);
		this.ChatMessageDataReaderRCDS = this.MessageBoardSubscriber.createDataState();
		this.ChatMessageDataReaderRCDS = this.ChatMessageDataReaderRCDS
				.with(SampleState.NOT_READ)
				.with(ViewState.NEW).with(ViewState.NOT_NEW)
				.with(InstanceState.ALIVE)
				;
		this.ChatMessageDataReaderRC = this.ChatMessageDataReader.createReadCondition(ChatMessageDataReaderRCDS);
		this.MessageBoardWaitset.attachCondition(this.ChatMessageDataReaderRC);


		//Start of user code User attributes initialization
		this.userNames = new HashMap<>();
		//End of user code
	}

	public void applicationBehavior() {
		//Start of user code Application behavior
		boolean isRunning = true;
		HashSet<Condition> triggeredConditions = new HashSet<>();
		Duration timeout = Duration.infiniteDuration(env);
		while (isRunning) {
			try {
				this.MessageBoardWaitset.waitForConditions(triggeredConditions, timeout);
				for (Condition cond : triggeredConditions) {
					if (cond == this.ChatMessageDataReaderRC) {
						List<Sample<ChatMessage>> samples = new ArrayList<>();
						this.ChatMessageDataReader.select().dataState(this.ChatMessageDataReaderRCDS).take(samples);
						for (Sample<ChatMessage> sample : samples) {
							ChatMessage msg = sample.getData();
							String senderName = this.userNames.get(msg.senderId); 
							if (senderName == null) {
								System.out.println(msg.senderId + " sent: " + msg.message);
							} else {
								System.out.println(senderName + " sent: " + msg.message);
							}
						}
					} else if (cond == this.NameServiceDataReaderRC) {
						List<Sample<NameService>> samples = new ArrayList<>();
						this.NameServiceDataReader.select().dataState(this.NameServiceDataReaderRCDS).take(samples);
						for (Sample<NameService> sample : samples) {
							if (sample.getData().id == -1) {
								isRunning = false;
							} else {
								this.userNames.put(sample.getData().id, sample.getData().Name);
							}
						}
					}
				}
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//End of user code
	}

	// Start of user code User defined methods
	// End of user code

	public static void main(String[] args) {
		MessageBoard application = new MessageBoard();
		//Start of user code User attribute settings
		//End of user code
		application.applicationBehavior();
	}
}
