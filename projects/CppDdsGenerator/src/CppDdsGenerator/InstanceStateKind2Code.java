package CppDdsGenerator;

import ddsMetamodel.InstanceStateKind;

public class InstanceStateKind2Code {
	public String getInstanceState(InstanceStateKind instanceStateKind) {
		String instanceState = "";
		switch (instanceStateKind) {
		case ALIVE_INSTANCE_STATE:
			instanceState = "alive()";
			break;
		case ANY_INSTANCE_STATE:
			instanceState = "any()";
			break;
		case NOT_ALIVE_DISPOSED_INSTANCE_STATE:
			instanceState = "not_alive_disposed()";
			break;
		case NOT_ALIVE_NO_WRITERS_INSTANCE_STATE:
			instanceState = "not_alive_no_writers()";
			break;
		default:
			break;
		}
		return instanceState;
	}
}
