package ChatModule;

import org.opensplice.dds.dcps.Utilities;

public final class ChatMessageDataReaderHelper
{

    public static ChatModule.ChatMessageDataReader narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof ChatModule.ChatMessageDataReader) {
            return (ChatModule.ChatMessageDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static ChatModule.ChatMessageDataReader unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof ChatModule.ChatMessageDataReader) {
            return (ChatModule.ChatMessageDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
