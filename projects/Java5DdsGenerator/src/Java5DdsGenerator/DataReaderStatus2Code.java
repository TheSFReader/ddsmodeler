package Java5DdsGenerator;

import ddsMetamodel.DataReaderStatus;

public class DataReaderStatus2Code {
	public String getDataReaderStatusClassName(DataReaderStatus status) {
		String name = "";
		switch (status) {
		case DATA_AVAILABLE_STATUS:
			name = "DataAvailable";
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
}
