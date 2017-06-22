package ChatModule;

import org.opensplice.dds.dcps.Utilities;

public final class ChatMessageTypeSupportHelper
{

    public static ChatModule.ChatMessageTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof ChatModule.ChatMessageTypeSupport) {
            return (ChatModule.ChatMessageTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static ChatModule.ChatMessageTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof ChatModule.ChatMessageTypeSupport) {
            return (ChatModule.ChatMessageTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
