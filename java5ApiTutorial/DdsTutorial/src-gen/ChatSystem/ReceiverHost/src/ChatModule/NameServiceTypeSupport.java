package ChatModule;

public class NameServiceTypeSupport extends org.opensplice.dds.dcps.TypeSupportImpl implements DDS.TypeSupportOperations
{
    private long copyCache;

    public NameServiceTypeSupport()
    {
        super("ChatModule::NameService",
              "",
              "id",
              null,
              ChatModule.NameServiceMetaHolder.metaDescriptor);
    }

    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
    }

    @Override
    protected DDS.DataWriter create_datawriter ()
    {
        return new NameServiceDataWriterImpl(this);
    }

    @Override
    protected DDS.DataReader create_datareader ()
    {
        return new NameServiceDataReaderImpl(this);
    }

    @Override
    protected DDS.DataReaderView create_dataview ()
    {
        return new NameServiceDataReaderViewImpl(this);
    }
}
