package CppDdsGenerator;

import ddsMetamodel.DataReaderStatus;

public class DataReaderStatus2Code {
	public String getMethodDefinition(DataReaderStatus aStatus, String dataTypeName) {
		String methodDef = "";
		switch (aStatus) {
		case DATA_AVAILABLE_STATUS:
			methodDef = "virtual void on_data_available(DataReader<"+dataTypeName+"> &reader)";
			break;
		case LIVELINESS_CHANGED_STATUS:
			methodDef = "virtual void on_liveliness_changed(DataReader<"+dataTypeName+"> &reader, const LivelinessChangedStatus &status)";
			break;
		case REQUESTED_DEADLINE_MISSED_STATUS:
			methodDef = "virtual void on_requested_deadline_missed(DataReader<"+dataTypeName+"> &reader, const RequestedDeadlineMissedStatus &status)";
			break;
		case REQUESTED_INCOMPATIBLE_QOS_STATUS:
			methodDef = "virtual void on_requested_incompatible_qos(DataReader<"+dataTypeName+"> &reader, const RequestedIncompatibleQosStatus &status)";
			break;
		case SAMPLE_LOST_STATUS:
			methodDef = "virtual void on_sample_lost(DataReader<"+dataTypeName+">, const SampleLostStatus &status)";
			break;
		case SAMPLE_REJECTED_STATUS:
			methodDef = "virtual void on_sample_rejected(DataReader<"+dataTypeName+">, const SampleRejectedStatus &status)";
			break;
		case SUBSCRIPTION_MATCHED_STATUS:
			methodDef = "virtual void on_subscription_matched(DataReader<"+dataTypeName+">, const SubscriptionMatchedStatus &status)";
			break;
		
		default:
			break;
		}
		return methodDef;
	}
	
	public String getStatusMask(DataReaderStatus aStatus) {
		String mask = "";
		switch (aStatus) {
		case DATA_AVAILABLE_STATUS:
			mask = "data_available()";
			break;
		case LIVELINESS_CHANGED_STATUS:
			mask = "liveliness_changed()";
			break;
		case REQUESTED_DEADLINE_MISSED_STATUS:
			mask = "requested_deadline_missed()";
			break;
		case REQUESTED_INCOMPATIBLE_QOS_STATUS:
			mask = "requested_incompatible_qos()";
			break;
		case SAMPLE_LOST_STATUS:
			mask = "sample_lost()";
			break;
		case SAMPLE_REJECTED_STATUS:
			mask = "sample_rejected()";
			break;
		case SUBSCRIPTION_MATCHED_STATUS:
			mask = "subscription_matched()";
			break;

		default:
			break;
		}
		return mask;
	}
}
