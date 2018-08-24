package CppDdsGenerator;

import ddsMetamodel.ViewStateKind;

public class ViewStateKind2Code {
	public String getViewState(ViewStateKind viewStateKind) {
		String viewState = "";
		switch (viewStateKind) {
		case ANY_VIEW_STATE:
			viewState = "any()";
			break;
		case NEW_VIEW_STATE:
			viewState = "new_view()";
			break;
		case NOT_NEW_VIEW_STATE:
			viewState = "not_new_view()";
			break;
		default:
			break;
		}
		return viewState;
	}
}
