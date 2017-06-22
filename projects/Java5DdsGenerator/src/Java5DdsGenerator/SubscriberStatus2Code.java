package Java5DdsGenerator;

import ddsMetamodel.SubscriberStatus;

public class SubscriberStatus2Code {
	public String getSubscriberStatusClassName(SubscriberStatus status) {
		String name = "";
		switch (status) {
		case DATA_AVAILABLE_STATUS:
			name = "DataAvailable";
			break;
		case DATA_ON_READERS_STATUS:
			name = "DataOnReaders";
			break;
		case LIVELINESS_CHANGED_STATUS:
			name = "LivelinessChanged";
			break;
		case REQUESTED_DEADLINE_MISSED_STATUS:
			name = "RequestedDeadlineMissed";
			break;
		case REQUESTED_INCOMPATIBLE_QOS_STATUS:
			name = "RequestedIncompatibleQos";
			break;
		case SAMPLE_LOST_STATUS:
			name = "SampleLost";
			break;
		case SAMPLE_REJECTED_STATUS:
			name = "SampleRejected";
			break;
		case SUBSCRIPTION_MATCHED_STATUS:
			name = "SubscriptionMatched";
			break;
		default:
			break;
		}
		return name;
	}
	
	public String getSubscriberStatusEventName(SubscriberStatus status) {
		String name = "";
		switch (status) {
		case DATA_AVAILABLE_STATUS:
			name = "DataAvailableEvent<?>";
			break;
		case DATA_ON_READERS_STATUS:
			name = "DataOnReadersEvent";
			break;
		case LIVELINESS_CHANGED_STATUS:
			name = "LivelinessChangedEvent<?>";
			break;
		case REQUESTED_DEADLINE_MISSED_STATUS:
			name = "RequestedDeadlineMissedEvent<?>";
			break;
		case REQUESTED_INCOMPATIBLE_QOS_STATUS:
			name = "RequestedIncompatibleQosEvent<?>";
			break;
		case SAMPLE_LOST_STATUS:
			name = "SampleLostEvent<?>";
			break;
		case SAMPLE_REJECTED_STATUS:
			name = "SampleRejectedEvent<?>";
			break;
		case SUBSCRIPTION_MATCHED_STATUS:
			name = "SubscriptionMatchedEvent<?>";
			break;
		default:
			break;
		}
		return name;
	}
}
