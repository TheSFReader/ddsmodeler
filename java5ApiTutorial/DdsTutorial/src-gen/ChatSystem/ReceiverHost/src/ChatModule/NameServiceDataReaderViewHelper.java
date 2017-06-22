package ChatModule;

import org.opensplice.dds.dcps.Utilities;

public final class NameServiceDataReaderViewHelper
{

    public static ChatModule.NameServiceDataReaderView narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof ChatModule.NameServiceDataReaderView) {
            return (ChatModule.NameServiceDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static ChatModule.NameServiceDataReaderView unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof ChatModule.NameServiceDataReaderView) {
            return (ChatModule.NameServiceDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
