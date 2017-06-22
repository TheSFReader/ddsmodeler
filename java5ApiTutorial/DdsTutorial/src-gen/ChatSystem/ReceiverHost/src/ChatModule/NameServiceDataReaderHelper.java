package ChatModule;

import org.opensplice.dds.dcps.Utilities;

public final class NameServiceDataReaderHelper
{

    public static ChatModule.NameServiceDataReader narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof ChatModule.NameServiceDataReader) {
            return (ChatModule.NameServiceDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static ChatModule.NameServiceDataReader unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof ChatModule.NameServiceDataReader) {
            return (ChatModule.NameServiceDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
