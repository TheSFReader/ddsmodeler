package CppDdsGenerator;

import ddsMetamodel.DomainParticipantStatus;

public class DomainParticipantStatus2Code {
	public String getMethodDefinition(DomainParticipantStatus aStatus) {
		String methodDef = "";
		switch (aStatus) {
		case DATA_AVAILABLE_STATUS:
			methodDef = "virtual void on_data_available(AnyDataReader &reader)";
			break;
		case DATA_ON_READERS_STATUS:
			methodDef = "virtual void on_data_on_readers(Subscriber &sub)";
			break;
		case INCONSISTENT_TOPIC_STATUS:
			methodDef = "virtual void on_inconsistent_topic(AnyTopic &topic, const InconsistentTopicStatus &status)";
			break;
		case LIVELINESS_CHANGED_STATUS:
			methodDef = "virtual void on_liveliness_changed(AnyDataReader &reader, const LivelinessChangedStatus &status)";
			break;
		case LIVELINESS_LOST_STATUS:
			methodDef = "virtual void on_liveliness_lost(AnyDataWriter &writer, const LivelinessLostStatus &status)";
			break;
		case OFFERED_DEADLINE_MISSED_STATUS:
			methodDef = "virtual void on_offered_deadline_missed(AnyDataWriter &writer, const OfferedDeadlineMissedStatus &status)";
			break;
		case OFFERED_INCOMPATIBLE_QOS_STATUS:
			methodDef = "virtual void on_offered_incompatible_qos(AnyDataWriter &writer, const OfferedIncompatibleQosStatus &status)";
			break;
		case PUBLICATION_MATCHED_STATUS:
			methodDef = "virtual void on_publication_matched(AnyDataWriter &writer, const PublicationMatchedStatus &status)";
			break;
		case REQUESTED_DEADLINE_MISSED_STATUS:
			methodDef = "virtual void on_requested_deadline_missed(AnyDataReader &reader, RequestedDeadlineMissedStatus &status)";
			break;
		case REQUESTED_INCOMPATIBLE_QOS_STATUS:
			methodDef = "virtual void on_requested_incompatible_qos(AnyDataReader &reader, RequestedIncompatibleQosStatus &status)";
			break;
		case SAMPLE_LOST_STATUS:
			methodDef = "virtual void on_sample_lost(AnyDataReader &reader, SampleLostStatus &status)";
			break;
		case SAMPLE_REJECTED_STATUS:
			methodDef = "virtual void on_sample_rejected(AnyDataReader &reader, SampleRejectedStatus &status)";
			break;
		case SUBSCRIPTION_MATCHED_STATUS:
			methodDef = "virtual void on_subscription_matched(AnyDataReader &reader, SubscriptionMatchedStatus &status)";
			break;
		default:
			break;	
			
		}
		return methodDef;
	}
	
	public String getStatusMask(DomainParticipantStatus aStatus) {
		String mask = "";
		switch (aStatus) {
		case DATA_AVAILABLE_STATUS:
			mask = "data_available()";
			break;
		case DATA_ON_READERS_STATUS:
			mask = "data_on_readers()";
			break;
		case INCONSISTENT_TOPIC_STATUS:
			mask = "inconsistent_topic()";
			break;
		case LIVELINESS_CHANGED_STATUS:
			mask = "liveliness_changed()";
			break;
		case LIVELINESS_LOST_STATUS:
			mask = "liveliness_lost()";
			break;
		case OFFERED_DEADLINE_MISSED_STATUS:
			mask = "offered_deadline_missed()";
			break;
		case OFFERED_INCOMPATIBLE_QOS_STATUS:
			mask = "offered_incompatible_qos()";
			break;
		case PUBLICATION_MATCHED_STATUS:
			mask = "publication_matched()";
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
