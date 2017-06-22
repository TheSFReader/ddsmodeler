package Java5DdsGenerator;

import java.util.Set;

import ddsMetamodel.ViewStateKind;

public class ViewStateKind2Code {
	public String getViewStateCondition(ViewStateKind kind) {
		String value = "";
		switch (kind) {
		case ANY_VIEW_STATE:
			value = ".with(ViewState.NEW).with(ViewState.NOT_NEW)";
			break;
		case NEW_VIEW_STATE:
			value = ".with(ViewState.NEW)";
			break;
		case NOT_NEW_VIEW_STATE:
			value = ".with(ViewState.NOT_NEW)";
			break;
		default:
			break;
		}
		return value;
	}
}
