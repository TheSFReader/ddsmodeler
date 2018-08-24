package CppDdsGenerator;

import ddsMetamodel.TopicStatus;

public class TopicStatus2Code {
	public String getMethodDefinition(TopicStatus aStatus, String dataStructureType) {
		String methodDef = "";
		switch (aStatus) {
		case INCONSISTENT_TOPIC_STATUS:
			methodDef = "virtual void on_inconsistent_topic(Topic<"+dataStructureType+"> &topic, InconsistentTopicStatus &status)";
			break;

		default:
			break;
		}
		return methodDef;
	}
	
	public String getStatusMask(TopicStatus aStatus) {
		String mask = "";
		switch (aStatus) {
		case INCONSISTENT_TOPIC_STATUS:
			mask = "inconsistent_topic()";
			break;

		default:
			break;
		}
		return mask;
	}
}
