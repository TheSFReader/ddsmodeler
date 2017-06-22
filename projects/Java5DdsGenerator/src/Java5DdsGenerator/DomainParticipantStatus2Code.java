package Java5DdsGenerator;

import ddsMetamodel.DomainParticipantStatus;

public class DomainParticipantStatus2Code {
	public String getDomainParticipantStatusClassName(DomainParticipantStatus aStatus) {
		String name ="";
		switch (aStatus) {
		case INCONSISTENT_TOPIC_STATUS:
			name = "InconsistentTopic";
			break;
		case DATA_AVAILABLE_STATUS:
			name = "DataAvailable";
			break;
		case DATA_ON_READERS_STATUS:
			name = "DataOnReaders";
			break;
		case LIVELINESS_CHANGED_STATUS:
			name = "LivelinessChanged";
			break;
		case LIVELINESS_LOST_STATUS:
			name = "LivelinessLost";
			break;
		case OFFERED_DEADLINE_MISSED_STATUS:
			name = "OfferedDeadlineMissed";
			break;
		case OFFERED_INCOMPATIBLE_QOS_STATUS:
			name = "OfferedIncompatibleQos";
			break;
		case PUBLICATION_MATCHED_STATUS:
			name = "PublicationMatched";
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
	
	public String getDomainParticipantStatusMethodName(DomainParticipantStatus aStatus) {
		String name = "";
		switch (aStatus) {
		case INCONSISTENT_TOPIC_STATUS:
			name = "onInconsistentTopic";
			break;
		case DATA_AVAILABLE_STATUS:
			name = "onDataAvailable";
			break;
		case DATA_ON_READERS_STATUS:
			name = "onDataOnReader";
			break;
		case LIVELINESS_CHANGED_STATUS:
			name = "onLivelinessChanged";
			break;
		case LIVELINESS_LOST_STATUS:
			name = "onLivelinessLost";
			break;
		case OFFERED_DEADLINE_MISSED_STATUS:
			name = "onOfferedDeadlineMissed";
			break;
		case OFFERED_INCOMPATIBLE_QOS_STATUS:
			name = "onOfferedIncompatibleQos";
			break;
		case PUBLICATION_MATCHED_STATUS:
			name = "onPublicationMatched";
			break;
		case REQUESTED_DEADLINE_MISSED_STATUS:
			name = "onRequestedDeadlineMissed";
			break;
		case REQUESTED_INCOMPATIBLE_QOS_STATUS:
			name = "onRequestedIncompatibleQos";
			break;
		case SAMPLE_LOST_STATUS:
			name = "onSampleLost";
			break;
		case SAMPLE_REJECTED_STATUS:
			name = "onSampleRejected";
			break;
		case SUBSCRIPTION_MATCHED_STATUS:
			name = "onSubscriptionMatched";
			break;
		default:
			break;
			
		}
		return name;
	}
	
	public String getDomainParticipantStatusEventName(DomainParticipantStatus aStatus) {
		String name ="";
		switch (aStatus) {
		case INCONSISTENT_TOPIC_STATUS:
			name = "InconsistentTopicEvent<?>";
			break;
		case DATA_AVAILABLE_STATUS:
			name = "DataAvailableEvent<?>";
			break;
		case DATA_ON_READERS_STATUS:
			name = "DataOnReadersEvent";
			break;
		case LIVELINESS_CHANGED_STATUS:
			name = "LivelinessChangedEvent<?>";
			break;
		case LIVELINESS_LOST_STATUS:
			name = "LivelinessLostEvent<?>";
			break;
		case OFFERED_DEADLINE_MISSED_STATUS:
			name = "OfferedDeadlineMissedEvent<?>";
			break;
		case OFFERED_INCOMPATIBLE_QOS_STATUS:
			name = "OfferedIncompatibleQosEvent<?>";
			break;
		case PUBLICATION_MATCHED_STATUS:
			name = "PublicationMatchedEvent<?>";
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
