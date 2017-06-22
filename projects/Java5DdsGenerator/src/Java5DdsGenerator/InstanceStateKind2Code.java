package Java5DdsGenerator;

import ddsMetamodel.InstanceStateKind;

public class InstanceStateKind2Code {
	public String getInstanceStateName(InstanceStateKind kind) {
		String value = "";
		switch (kind) {
		case ANY_INSTANCE_STATE:
			value = ".with(InstanceState.ALIVE).with(InstanceState.NOT_ALIVE_DISPOSED).with(InstanceState.NOT_ALIVE_NO_WRITERS)";
			break;
		case ALIVE_INSTANCE_STATE:
			value = ".with(InstanceState.ALIVE)";
			break;
		case NOT_ALIVE_DISPOSED_INSTANCE_STATE:
			value = ".with(InstanceState.NOT_ALIVE_DISPOSED)";
			break;
		case NOT_ALIVE_NO_WRITERS_INSTANCE_STATE:
			value = ".with(InstanceState.NOT_ALIVE_NO_WRITERS)";
			break;
		default:
			break;
		}
		return value;
	}
}
