package Java5DdsGenerator;

import ddsMetamodel.PublisherStatus;

public class PublisherStatus2Code {
	public String getPublisherStatusClassName(PublisherStatus status) {
		String name = "";
		switch (status) {
		case PUBLICATION_MATCHED_STATUS:
			name = "PublicationMatched";
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
		default:
			break;
		}
		return name;
	}
	
	public String getPublisherStatusMethodName(PublisherStatus status) {
		String name = "";
		switch (status) {
		case PUBLICATION_MATCHED_STATUS:
			name = "onPublicationMatched";
			break;
		case LIVELINESS_LOST_STATUS:
			name = "onLivelinessLost";
			break;
		case OFFERED_DEADLINE_MISSED_STATUS:
			name = "onOfferedDeadlineMissedStatus";
			break;
		case OFFERED_INCOMPATIBLE_QOS_STATUS:
			name = "onOfferedIncompatibleQos";
			break;
		default:
			break;
		}
		return name;
	}
	
	public String getPublisherStatusEventName(PublisherStatus status) {
		String name = "";
		switch (status) {
		case PUBLICATION_MATCHED_STATUS:
			name = "PublicationMatchedEvent<?>";
			break;
		case LIVELINESS_LOST_STATUS:
			name = "LivelinessLostEvent<?>";
			break;
		case OFFERED_DEADLINE_MISSED_STATUS:
			name = "OfferedDeadlineMissedStatusEvent<?>";
			break;
		case OFFERED_INCOMPATIBLE_QOS_STATUS:
			name = "OfferedIncompatibleQosEvent<?>";
			break;
		default:
			break;
		}
		return name;
	}
}
