package Java5DdsGenerator;

import ddsMetamodel.DataWriterStatus;

public class DataWriterStatus2Code {
	public String getDataWriterStatusClassName(DataWriterStatus status) {
		String name = "";
		switch (status) {
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
		default:
			break;
		}
		return name;
	}
	
	public String getDataWriterStatusMethodName(DataWriterStatus status) {
		String name = "";
		switch (status) {
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
		default:
			break;
		}
		return name;
	}
	
	public String getDataWriterStatusEventName(DataWriterStatus status) {
		String name = "";
		switch (status) {
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
		default:
			break;
		}
		return name;
	}
}
