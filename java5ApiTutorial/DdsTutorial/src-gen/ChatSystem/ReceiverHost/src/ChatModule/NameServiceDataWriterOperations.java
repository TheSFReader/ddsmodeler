package ChatModule;

public interface NameServiceDataWriterOperations extends
    DDS.DataWriterOperations
{

    long register_instance(
            ChatModule.NameService instance_data);

    long register_instance_w_timestamp(
            ChatModule.NameService instance_data, 
            DDS.Time_t source_timestamp);

    int unregister_instance(
            ChatModule.NameService instance_data, 
            long handle);

    int unregister_instance_w_timestamp(
            ChatModule.NameService instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int write(
            ChatModule.NameService instance_data, 
            long handle);

    int write_w_timestamp(
            ChatModule.NameService instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int dispose(
            ChatModule.NameService instance_data, 
            long instance_handle);

    int dispose_w_timestamp(
            ChatModule.NameService instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);
    
    int writedispose(
            ChatModule.NameService instance_data, 
            long instance_handle);

    int writedispose_w_timestamp(
            ChatModule.NameService instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);

    int get_key_value(
            ChatModule.NameServiceHolder key_holder, 
            long handle);
    
    long lookup_instance(
            ChatModule.NameService instance_data);

}
