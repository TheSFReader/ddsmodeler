package ChatModule;

public interface ChatMessageDataWriterOperations extends
    DDS.DataWriterOperations
{

    long register_instance(
            ChatModule.ChatMessage instance_data);

    long register_instance_w_timestamp(
            ChatModule.ChatMessage instance_data, 
            DDS.Time_t source_timestamp);

    int unregister_instance(
            ChatModule.ChatMessage instance_data, 
            long handle);

    int unregister_instance_w_timestamp(
            ChatModule.ChatMessage instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int write(
            ChatModule.ChatMessage instance_data, 
            long handle);

    int write_w_timestamp(
            ChatModule.ChatMessage instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int dispose(
            ChatModule.ChatMessage instance_data, 
            long instance_handle);

    int dispose_w_timestamp(
            ChatModule.ChatMessage instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);
    
    int writedispose(
            ChatModule.ChatMessage instance_data, 
            long instance_handle);

    int writedispose_w_timestamp(
            ChatModule.ChatMessage instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);

    int get_key_value(
            ChatModule.ChatMessageHolder key_holder, 
            long handle);
    
    long lookup_instance(
            ChatModule.ChatMessage instance_data);

}
