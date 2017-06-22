package ChatModule;

import org.opensplice.dds.dcps.Utilities;

public final class NameServiceDataWriterHelper
{

    public static ChatModule.NameServiceDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof ChatModule.NameServiceDataWriter) {
            return (ChatModule.NameServiceDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static ChatModule.NameServiceDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof ChatModule.NameServiceDataWriter) {
            return (ChatModule.NameServiceDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
