package userload;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.TimeoutException;

import org.omg.dds.core.Condition;
import org.omg.dds.core.Duration;
import org.omg.dds.core.GuardCondition;
//Start of user code User defined imports
//End of user code
import org.omg.dds.core.QosProvider;
import org.omg.dds.core.ServiceEnvironment;
import org.omg.dds.core.WaitSet;
import org.omg.dds.core.status.DataAvailableStatus;
import org.omg.dds.core.status.Status;
import org.omg.dds.domain.DomainParticipant;
import org.omg.dds.domain.DomainParticipantFactory;
import org.omg.dds.domain.DomainParticipantListener;
import org.omg.dds.domain.DomainParticipantQos;
import org.omg.dds.sub.DataReader;
import org.omg.dds.sub.DataReaderQos;
import org.omg.dds.sub.Subscriber;
import org.omg.dds.sub.SubscriberListener;
import org.omg.dds.sub.SubscriberQos;
import org.omg.dds.topic.Topic;
import org.omg.dds.topic.TopicListener;
import org.omg.dds.topic.TopicQos;

import ChatModule.ChatMessage;
import ChatModule.NameService;

//Start of user code class comments
//End of user code
public class UserLoad {

	//Attributes for participant UserLoadParticipant
	private ServiceEnvironment env;
	private DomainParticipant UserLoadParticipant;
	private Subscriber UserLoadSubscriber;
	private DataReader<NameService> NameServiceDataReader;
	Topic<NameService> NameServiceTopic;
	Topic<ChatMessage> ChatMessageTopic;
	//Attributes for Waitset userLoadWaitset
	private WaitSet userLoadWaitset;
	private GuardCondition userLoadGuard;
	
	// Start of user code User defined attributes
	// End of user code

	public UserLoad() {
		System.setProperty(ServiceEnvironment.IMPLEMENTATION_CLASS_NAME_PROPERTY,
			"org.opensplice.dds.core.OsplServiceEnvironment");
		this.env = ServiceEnvironment.createInstance(UserLoad.class.getClassLoader());
		DomainParticipantFactory dpf = DomainParticipantFactory.getInstance(env);
		
		//Initializing DomainParticipant UserLoadParticipant
		DomainParticipantQos UserLoadParticipantQos = dpf.getDefaultParticipantQos();
		DomainParticipantListener UserLoadParticipantListener = null;
		Collection<Class<? extends Status>> UserLoadParticipantStatus = new HashSet<>();
		this.UserLoadParticipant = dpf.createParticipant(0, UserLoadParticipantQos, UserLoadParticipantListener, UserLoadParticipantStatus);
		SubscriberQos UserLoadSubscriberQos = this.UserLoadParticipant.getDefaultSubscriberQos();
		SubscriberListener UserLoadSubscriberListener = null;
		Collection<Class<? extends Status>> UserLoadSubscriberStatus = new HashSet<>();
		this.UserLoadSubscriber = this.UserLoadParticipant.createSubscriber(UserLoadSubscriberQos, UserLoadSubscriberListener, UserLoadSubscriberStatus);
		QosProvider NameServiceTopicQosProvider = QosProvider.newQosProvider("file://./qos/NameServiceQosProfile.xml", "NameServiceQosProfile", env);
		TopicQos NameServiceTopicQos = NameServiceTopicQosProvider.getTopicQos();
		TopicListener<NameService> NameServiceTopicListener = null;
		Collection<Class<? extends Status>> NameServiceTopicStatus = new HashSet<>();
		this.NameServiceTopic = this.UserLoadParticipant.createTopic("NameServiceTopic", NameService.class, NameServiceTopicQos, NameServiceTopicListener, NameServiceTopicStatus);
		DataReaderQos NameServiceDataReaderQos = this.UserLoadSubscriber.copyFromTopicQos(this.UserLoadSubscriber.getDefaultDataReaderQos(), this.NameServiceTopic.getQos());
		
		NameServiceDataReaderListener NameServiceDataReaderListener = new NameServiceDataReaderListener();
		Collection<Class<? extends Status>> NameServiceDataReaderStatus = new HashSet<>();
		NameServiceDataReaderStatus.add(DataAvailableStatus.class);
		this.NameServiceDataReader = this.UserLoadSubscriber.createDataReader(this.NameServiceTopic, NameServiceDataReaderQos, NameServiceDataReaderListener, NameServiceDataReaderStatus);
		
		this.userLoadWaitset = WaitSet.newWaitSet(env);
		this.userLoadGuard = GuardCondition.newGuardCondition(env);
		this.userLoadWaitset.attachCondition(this.userLoadGuard);
		

		//Start of user code User attributes initialization
		NameServiceDataReaderListener.setReaderGuardCondition(this.userLoadGuard);
		NameServiceDataReaderListener.setNameServiceDataReader(NameServiceDataReader);
		NameServiceDataReaderListener.setReaderSubscriber(UserLoadSubscriber);
		//End of user code
	}

	public void applicationBehavior() {
		//Start of user code Application behavior
		boolean isRunning = true;
		while (isRunning) {
			HashSet<Condition> triggeredConditions = new HashSet<>();
			Duration timeout = Duration.infiniteDuration(env);
			try {
				this.userLoadWaitset.waitForConditions(triggeredConditions, timeout);
				for (Condition cond : triggeredConditions) {
					if (cond == this.userLoadGuard) {
						System.out.println("Guard");
						isRunning = false;
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
		UserLoad application = new UserLoad();
		//Start of user code User attribute settings
		//End of user code
		application.applicationBehavior();
	}
}
