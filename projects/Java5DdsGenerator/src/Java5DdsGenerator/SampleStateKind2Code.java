package Java5DdsGenerator;

import ddsMetamodel.SampleStateKind;

public class SampleStateKind2Code {
	public String getSampleStateKindClassName(SampleStateKind kind) {
		String value = "";
		switch (kind) {
		case ANY_READ_SAMPLE_STATE:
			value = ".with(SampleState.READ).with(SampleState.NOT_READ)";
			break;
		case NOT_READ_SAMPLE_STATE:
			value = ".with(SampleState.NOT_READ)";
			break;
		case READ_SAMPLE_STATE:
			value = ".with(SampleState.READ)";
			break;
		default:
			break;
		}
		return value;
	}
}
