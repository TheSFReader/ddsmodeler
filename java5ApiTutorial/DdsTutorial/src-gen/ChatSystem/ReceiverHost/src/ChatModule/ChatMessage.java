package ChatModule;

public final class ChatMessage {

    public int senderId;
    public int messageIndex;
    public java.lang.String message = "";

    public ChatMessage() {
    }

    public ChatMessage(
        int _senderId,
        int _messageIndex,
        java.lang.String _message)
    {
        senderId = _senderId;
        messageIndex = _messageIndex;
        message = _message;
    }

}
