package ChatModule;

public final class NameServiceHolder
{

    public ChatModule.NameService value = null;

    public NameServiceHolder () { }

    public NameServiceHolder (ChatModule.NameService initialValue)
    {
        value = initialValue;
    }

}
