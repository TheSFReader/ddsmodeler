package ChatModule;

import org.opensplice.dds.dcps.Utilities;

public final class ChatMessageDataWriterHelper
{

    public static ChatModule.ChatMessageDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof ChatModule.ChatMessageDataWriter) {
            return (ChatModule.ChatMessageDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static ChatModule.ChatMessageDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof ChatModule.ChatMessageDataWriter) {
            return (ChatModule.ChatMessageDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
