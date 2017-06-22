package ChatModule;

import org.opensplice.dds.dcps.Utilities;

public final class NameServiceTypeSupportHelper
{

    public static ChatModule.NameServiceTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof ChatModule.NameServiceTypeSupport) {
            return (ChatModule.NameServiceTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static ChatModule.NameServiceTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof ChatModule.NameServiceTypeSupport) {
            return (ChatModule.NameServiceTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
