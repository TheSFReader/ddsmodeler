package CppDdsGenerator;

import ddsMetamodel.SampleStateKind;

public class SampleStateKind2Code {
	public String getSampleState(SampleStateKind sampleStateKind) {
		String sampleState = "";
		switch (sampleStateKind) {
		case ANY_READ_SAMPLE_STATE:
			sampleState = "any()";
			break;
		case NOT_READ_SAMPLE_STATE:
			sampleState = "not_read()";
			break;
		case READ_SAMPLE_STATE:
			sampleState = "read()";
			break;
		default:
			break;
		}
		return sampleState;
	}
}
