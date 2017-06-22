package ChatModule;

public class ChatMessageTypeSupport extends org.opensplice.dds.dcps.TypeSupportImpl implements DDS.TypeSupportOperations
{
    private long copyCache;

    public ChatMessageTypeSupport()
    {
        super("ChatModule::ChatMessage",
              "",
              "senderId",
              null,
              ChatModule.ChatMessageMetaHolder.metaDescriptor);
    }

    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
    }

    @Override
    protected DDS.DataWriter create_datawriter ()
    {
        return new ChatMessageDataWriterImpl(this);
    }

    @Override
    protected DDS.DataReader create_datareader ()
    {
        return new ChatMessageDataReaderImpl(this);
    }

    @Override
    protected DDS.DataReaderView create_dataview ()
    {
        return new ChatMessageDataReaderViewImpl(this);
    }
}
