package ChatModule;

import org.opensplice.dds.dcps.Utilities;

public final class ChatMessageDataReaderViewHelper
{

    public static ChatModule.ChatMessageDataReaderView narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof ChatModule.ChatMessageDataReaderView) {
            return (ChatModule.ChatMessageDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static ChatModule.ChatMessageDataReaderView unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof ChatModule.ChatMessageDataReaderView) {
            return (ChatModule.ChatMessageDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
