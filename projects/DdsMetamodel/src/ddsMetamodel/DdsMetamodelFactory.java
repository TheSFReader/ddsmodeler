/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ddsMetamodel.DdsMetamodelPackage
 * @generated
 */
public interface DdsMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DdsMetamodelFactory eINSTANCE = ddsMetamodel.impl.DdsMetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dds Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Application</em>'.
	 * @generated
	 */
	DdsApplication createDdsApplication();

	/**
	 * Returns a new object of class '<em>Dds Domain Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Domain Participant</em>'.
	 * @generated
	 */
	DdsDomainParticipant createDdsDomainParticipant();

	/**
	 * Returns a new object of class '<em>Dds Topic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Topic</em>'.
	 * @generated
	 */
	DdsTopic createDdsTopic();

	/**
	 * Returns a new object of class '<em>Dds Qos Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Qos Profile</em>'.
	 * @generated
	 */
	DdsQosProfile createDdsQosProfile();

	/**
	 * Returns a new object of class '<em>Dds Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Subscriber</em>'.
	 * @generated
	 */
	DdsSubscriber createDdsSubscriber();

	/**
	 * Returns a new object of class '<em>Dds Data Reader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Data Reader</em>'.
	 * @generated
	 */
	DdsDataReader createDdsDataReader();

	/**
	 * Returns a new object of class '<em>Dds Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Publisher</em>'.
	 * @generated
	 */
	DdsPublisher createDdsPublisher();

	/**
	 * Returns a new object of class '<em>Dds Data Writer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Data Writer</em>'.
	 * @generated
	 */
	DdsDataWriter createDdsDataWriter();

	/**
	 * Returns a new object of class '<em>Dds Data Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Data Module</em>'.
	 * @generated
	 */
	DdsDataModule createDdsDataModule();

	/**
	 * Returns a new object of class '<em>Dds Data Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Data Structure</em>'.
	 * @generated
	 */
	DdsDataStructure createDdsDataStructure();

	/**
	 * Returns a new object of class '<em>Dds Data Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Data Field</em>'.
	 * @generated
	 */
	DdsDataField createDdsDataField();

	/**
	 * Returns a new object of class '<em>Dds Domain Participant Qos Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Domain Participant Qos Profile</em>'.
	 * @generated
	 */
	DdsDomainParticipantQosProfile createDdsDomainParticipantQosProfile();

	/**
	 * Returns a new object of class '<em>Dds User Data Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds User Data Qos</em>'.
	 * @generated
	 */
	DdsUserDataQos createDdsUserDataQos();

	/**
	 * Returns a new object of class '<em>Dds Entity Factory Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Entity Factory Qos</em>'.
	 * @generated
	 */
	DdsEntityFactoryQos createDdsEntityFactoryQos();

	/**
	 * Returns a new object of class '<em>Dds Topic Qos Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Topic Qos Profile</em>'.
	 * @generated
	 */
	DdsTopicQosProfile createDdsTopicQosProfile();

	/**
	 * Returns a new object of class '<em>Dds Topic Data Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Topic Data Qos</em>'.
	 * @generated
	 */
	DdsTopicDataQos createDdsTopicDataQos();

	/**
	 * Returns a new object of class '<em>Dds Durability Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Durability Qos</em>'.
	 * @generated
	 */
	DdsDurabilityQos createDdsDurabilityQos();

	/**
	 * Returns a new object of class '<em>Dds Durability Service Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Durability Service Qos</em>'.
	 * @generated
	 */
	DdsDurabilityServiceQos createDdsDurabilityServiceQos();

	/**
	 * Returns a new object of class '<em>Dds Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Duration</em>'.
	 * @generated
	 */
	DdsDuration createDdsDuration();

	/**
	 * Returns a new object of class '<em>Dds Presentation Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Presentation Qos</em>'.
	 * @generated
	 */
	DdsPresentationQos createDdsPresentationQos();

	/**
	 * Returns a new object of class '<em>Dds Deadline Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Deadline Qos</em>'.
	 * @generated
	 */
	DdsDeadlineQos createDdsDeadlineQos();

	/**
	 * Returns a new object of class '<em>Dds Latency Budget Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Latency Budget Qos</em>'.
	 * @generated
	 */
	DdsLatencyBudgetQos createDdsLatencyBudgetQos();

	/**
	 * Returns a new object of class '<em>Dds Ownership Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Ownership Qos</em>'.
	 * @generated
	 */
	DdsOwnershipQos createDdsOwnershipQos();

	/**
	 * Returns a new object of class '<em>Dds Ownership Strength Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Ownership Strength Qos</em>'.
	 * @generated
	 */
	DdsOwnershipStrengthQos createDdsOwnershipStrengthQos();

	/**
	 * Returns a new object of class '<em>Dds Liveliness Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Liveliness Qos</em>'.
	 * @generated
	 */
	DdsLivelinessQos createDdsLivelinessQos();

	/**
	 * Returns a new object of class '<em>Dds Time Based Filter Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Time Based Filter Qos</em>'.
	 * @generated
	 */
	DdsTimeBasedFilterQos createDdsTimeBasedFilterQos();

	/**
	 * Returns a new object of class '<em>Dds Partition Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Partition Qos</em>'.
	 * @generated
	 */
	DdsPartitionQos createDdsPartitionQos();

	/**
	 * Returns a new object of class '<em>Dds Reliability Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Reliability Qos</em>'.
	 * @generated
	 */
	DdsReliabilityQos createDdsReliabilityQos();

	/**
	 * Returns a new object of class '<em>Dds Transport Priority Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Transport Priority Qos</em>'.
	 * @generated
	 */
	DdsTransportPriorityQos createDdsTransportPriorityQos();

	/**
	 * Returns a new object of class '<em>Dds Lifespan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Lifespan</em>'.
	 * @generated
	 */
	DdsLifespan createDdsLifespan();

	/**
	 * Returns a new object of class '<em>Dds History Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds History Qos</em>'.
	 * @generated
	 */
	DdsHistoryQos createDdsHistoryQos();

	/**
	 * Returns a new object of class '<em>Dds Resource Limits</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Resource Limits</em>'.
	 * @generated
	 */
	DdsResourceLimits createDdsResourceLimits();

	/**
	 * Returns a new object of class '<em>Dds Data Writer Lifecycle Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Data Writer Lifecycle Qos</em>'.
	 * @generated
	 */
	DdsDataWriterLifecycleQos createDdsDataWriterLifecycleQos();

	/**
	 * Returns a new object of class '<em>Dds Data Reader Lifecycle Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Data Reader Lifecycle Qos</em>'.
	 * @generated
	 */
	DdsDataReaderLifecycleQos createDdsDataReaderLifecycleQos();

	/**
	 * Returns a new object of class '<em>Dds Destination Order Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Destination Order Qos</em>'.
	 * @generated
	 */
	DdsDestinationOrderQos createDdsDestinationOrderQos();

	/**
	 * Returns a new object of class '<em>Dds Publisher Qos Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Publisher Qos Profile</em>'.
	 * @generated
	 */
	DdsPublisherQosProfile createDdsPublisherQosProfile();

	/**
	 * Returns a new object of class '<em>Dds Group Data Qos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Group Data Qos</em>'.
	 * @generated
	 */
	DdsGroupDataQos createDdsGroupDataQos();

	/**
	 * Returns a new object of class '<em>Dds Data Writer Qos Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Data Writer Qos Profile</em>'.
	 * @generated
	 */
	DdsDataWriterQosProfile createDdsDataWriterQosProfile();

	/**
	 * Returns a new object of class '<em>Dds Subscriber Qos Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Subscriber Qos Profile</em>'.
	 * @generated
	 */
	DdsSubscriberQosProfile createDdsSubscriberQosProfile();

	/**
	 * Returns a new object of class '<em>Dds Data Reader Qos Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Data Reader Qos Profile</em>'.
	 * @generated
	 */
	DdsDataReaderQosProfile createDdsDataReaderQosProfile();

	/**
	 * Returns a new object of class '<em>Dds Domain Participant Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Domain Participant Listener</em>'.
	 * @generated
	 */
	DdsDomainParticipantListener createDdsDomainParticipantListener();

	/**
	 * Returns a new object of class '<em>Dds Subscriber Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Subscriber Listener</em>'.
	 * @generated
	 */
	DdsSubscriberListener createDdsSubscriberListener();

	/**
	 * Returns a new object of class '<em>Dds Publisher Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Publisher Listener</em>'.
	 * @generated
	 */
	DdsPublisherListener createDdsPublisherListener();

	/**
	 * Returns a new object of class '<em>Dds Data Reader Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Data Reader Listener</em>'.
	 * @generated
	 */
	DdsDataReaderListener createDdsDataReaderListener();

	/**
	 * Returns a new object of class '<em>Dds Data Writer Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Data Writer Listener</em>'.
	 * @generated
	 */
	DdsDataWriterListener createDdsDataWriterListener();

	/**
	 * Returns a new object of class '<em>Dds Topic Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Topic Listener</em>'.
	 * @generated
	 */
	DdsTopicListener createDdsTopicListener();

	/**
	 * Returns a new object of class '<em>Dds Wait Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Wait Set</em>'.
	 * @generated
	 */
	DdsWaitSet createDdsWaitSet();

	/**
	 * Returns a new object of class '<em>Dds Read Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Read Condition</em>'.
	 * @generated
	 */
	DdsReadCondition createDdsReadCondition();

	/**
	 * Returns a new object of class '<em>Dds Structured Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Structured Field</em>'.
	 * @generated
	 */
	DdsStructuredField createDdsStructuredField();

	/**
	 * Returns a new object of class '<em>Dds Status Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Status Condition</em>'.
	 * @generated
	 */
	DdsStatusCondition createDdsStatusCondition();

	/**
	 * Returns a new object of class '<em>Dds Domain Participant Status Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Domain Participant Status Condition</em>'.
	 * @generated
	 */
	DdsDomainParticipantStatusCondition createDdsDomainParticipantStatusCondition();

	/**
	 * Returns a new object of class '<em>Dds Publisher Status Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Publisher Status Condition</em>'.
	 * @generated
	 */
	DdsPublisherStatusCondition createDdsPublisherStatusCondition();

	/**
	 * Returns a new object of class '<em>Dds Subscriber Status Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Subscriber Status Condition</em>'.
	 * @generated
	 */
	DdsSubscriberStatusCondition createDdsSubscriberStatusCondition();

	/**
	 * Returns a new object of class '<em>Dds Data Writer Status Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Data Writer Status Condition</em>'.
	 * @generated
	 */
	DdsDataWriterStatusCondition createDdsDataWriterStatusCondition();

	/**
	 * Returns a new object of class '<em>Dds Data Reader Status Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Data Reader Status Condition</em>'.
	 * @generated
	 */
	DdsDataReaderStatusCondition createDdsDataReaderStatusCondition();

	/**
	 * Returns a new object of class '<em>Dds Topic Status Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Topic Status Condition</em>'.
	 * @generated
	 */
	DdsTopicStatusCondition createDdsTopicStatusCondition();

	/**
	 * Returns a new object of class '<em>Query Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Condition</em>'.
	 * @generated
	 */
	QueryCondition createQueryCondition();

	/**
	 * Returns a new object of class '<em>Guard Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guard Condition</em>'.
	 * @generated
	 */
	GuardCondition createGuardCondition();

	/**
	 * Returns a new object of class '<em>Dds System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds System</em>'.
	 * @generated
	 */
	DdsSystem createDdsSystem();

	/**
	 * Returns a new object of class '<em>Dds Host</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dds Host</em>'.
	 * @generated
	 */
	DdsHost createDdsHost();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DdsMetamodelPackage getDdsMetamodelPackage();

} //DdsMetamodelFactory
