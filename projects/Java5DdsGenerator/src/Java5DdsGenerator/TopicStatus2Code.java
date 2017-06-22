package Java5DdsGenerator;

import ddsMetamodel.TopicStatus;

public class TopicStatus2Code {
	public String getTopicStatusClassName(TopicStatus status) {
		String name = "";
		switch (status) {
		case INCONSISTENT_TOPIC_STATUS:
			name = "InconsistentTopic";
			break;

		default:
			break;
		}
		return name;
	}
}
