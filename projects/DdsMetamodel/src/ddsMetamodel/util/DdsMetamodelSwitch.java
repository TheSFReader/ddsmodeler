/**
 */
package ddsMetamodel.util;

import ddsMetamodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ddsMetamodel.DdsMetamodelPackage
 * @generated
 */
public class DdsMetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DdsMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsMetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = DdsMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DdsMetamodelPackage.DDS_APPLICATION: {
				DdsApplication ddsApplication = (DdsApplication)theEObject;
				T result = caseDdsApplication(ddsApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT: {
				DdsDomainParticipant ddsDomainParticipant = (DdsDomainParticipant)theEObject;
				T result = caseDdsDomainParticipant(ddsDomainParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_TOPIC: {
				DdsTopic ddsTopic = (DdsTopic)theEObject;
				T result = caseDdsTopic(ddsTopic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_QOS_PROFILE: {
				DdsQosProfile ddsQosProfile = (DdsQosProfile)theEObject;
				T result = caseDdsQosProfile(ddsQosProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_SUBSCRIBER: {
				DdsSubscriber ddsSubscriber = (DdsSubscriber)theEObject;
				T result = caseDdsSubscriber(ddsSubscriber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DATA_READER: {
				DdsDataReader ddsDataReader = (DdsDataReader)theEObject;
				T result = caseDdsDataReader(ddsDataReader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_PUBLISHER: {
				DdsPublisher ddsPublisher = (DdsPublisher)theEObject;
				T result = caseDdsPublisher(ddsPublisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DATA_WRITER: {
				DdsDataWriter ddsDataWriter = (DdsDataWriter)theEObject;
				T result = caseDdsDataWriter(ddsDataWriter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DATA_MODULE: {
				DdsDataModule ddsDataModule = (DdsDataModule)theEObject;
				T result = caseDdsDataModule(ddsDataModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE: {
				DdsDataStructure ddsDataStructure = (DdsDataStructure)theEObject;
				T result = caseDdsDataStructure(ddsDataStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DATA_FIELD: {
				DdsDataField ddsDataField = (DdsDataField)theEObject;
				T result = caseDdsDataField(ddsDataField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE: {
				DdsDomainParticipantQosProfile ddsDomainParticipantQosProfile = (DdsDomainParticipantQosProfile)theEObject;
				T result = caseDdsDomainParticipantQosProfile(ddsDomainParticipantQosProfile);
				if (result == null) result = caseDdsQosProfile(ddsDomainParticipantQosProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_USER_DATA_QOS: {
				DdsUserDataQos ddsUserDataQos = (DdsUserDataQos)theEObject;
				T result = caseDdsUserDataQos(ddsUserDataQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_ENTITY_FACTORY_QOS: {
				DdsEntityFactoryQos ddsEntityFactoryQos = (DdsEntityFactoryQos)theEObject;
				T result = caseDdsEntityFactoryQos(ddsEntityFactoryQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE: {
				DdsTopicQosProfile ddsTopicQosProfile = (DdsTopicQosProfile)theEObject;
				T result = caseDdsTopicQosProfile(ddsTopicQosProfile);
				if (result == null) result = caseDdsQosProfile(ddsTopicQosProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_TOPIC_DATA_QOS: {
				DdsTopicDataQos ddsTopicDataQos = (DdsTopicDataQos)theEObject;
				T result = caseDdsTopicDataQos(ddsTopicDataQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DURABILITY_QOS: {
				DdsDurabilityQos ddsDurabilityQos = (DdsDurabilityQos)theEObject;
				T result = caseDdsDurabilityQos(ddsDurabilityQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS: {
				DdsDurabilityServiceQos ddsDurabilityServiceQos = (DdsDurabilityServiceQos)theEObject;
				T result = caseDdsDurabilityServiceQos(ddsDurabilityServiceQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DURATION: {
				DdsDuration ddsDuration = (DdsDuration)theEObject;
				T result = caseDdsDuration(ddsDuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_PRESENTATION_QOS: {
				DdsPresentationQos ddsPresentationQos = (DdsPresentationQos)theEObject;
				T result = caseDdsPresentationQos(ddsPresentationQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DEADLINE_QOS: {
				DdsDeadlineQos ddsDeadlineQos = (DdsDeadlineQos)theEObject;
				T result = caseDdsDeadlineQos(ddsDeadlineQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_LATENCY_BUDGET_QOS: {
				DdsLatencyBudgetQos ddsLatencyBudgetQos = (DdsLatencyBudgetQos)theEObject;
				T result = caseDdsLatencyBudgetQos(ddsLatencyBudgetQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_OWNERSHIP_QOS: {
				DdsOwnershipQos ddsOwnershipQos = (DdsOwnershipQos)theEObject;
				T result = caseDdsOwnershipQos(ddsOwnershipQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_OWNERSHIP_STRENGTH_QOS: {
				DdsOwnershipStrengthQos ddsOwnershipStrengthQos = (DdsOwnershipStrengthQos)theEObject;
				T result = caseDdsOwnershipStrengthQos(ddsOwnershipStrengthQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_LIVELINESS_QOS: {
				DdsLivelinessQos ddsLivelinessQos = (DdsLivelinessQos)theEObject;
				T result = caseDdsLivelinessQos(ddsLivelinessQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_TIME_BASED_FILTER_QOS: {
				DdsTimeBasedFilterQos ddsTimeBasedFilterQos = (DdsTimeBasedFilterQos)theEObject;
				T result = caseDdsTimeBasedFilterQos(ddsTimeBasedFilterQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_PARTITION_QOS: {
				DdsPartitionQos ddsPartitionQos = (DdsPartitionQos)theEObject;
				T result = caseDdsPartitionQos(ddsPartitionQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_RELIABILITY_QOS: {
				DdsReliabilityQos ddsReliabilityQos = (DdsReliabilityQos)theEObject;
				T result = caseDdsReliabilityQos(ddsReliabilityQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_TRANSPORT_PRIORITY_QOS: {
				DdsTransportPriorityQos ddsTransportPriorityQos = (DdsTransportPriorityQos)theEObject;
				T result = caseDdsTransportPriorityQos(ddsTransportPriorityQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_LIFESPAN: {
				DdsLifespan ddsLifespan = (DdsLifespan)theEObject;
				T result = caseDdsLifespan(ddsLifespan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_HISTORY_QOS: {
				DdsHistoryQos ddsHistoryQos = (DdsHistoryQos)theEObject;
				T result = caseDdsHistoryQos(ddsHistoryQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_RESOURCE_LIMITS: {
				DdsResourceLimits ddsResourceLimits = (DdsResourceLimits)theEObject;
				T result = caseDdsResourceLimits(ddsResourceLimits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS: {
				DdsDataWriterLifecycleQos ddsDataWriterLifecycleQos = (DdsDataWriterLifecycleQos)theEObject;
				T result = caseDdsDataWriterLifecycleQos(ddsDataWriterLifecycleQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS: {
				DdsDataReaderLifecycleQos ddsDataReaderLifecycleQos = (DdsDataReaderLifecycleQos)theEObject;
				T result = caseDdsDataReaderLifecycleQos(ddsDataReaderLifecycleQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DESTINATION_ORDER_QOS: {
				DdsDestinationOrderQos ddsDestinationOrderQos = (DdsDestinationOrderQos)theEObject;
				T result = caseDdsDestinationOrderQos(ddsDestinationOrderQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE: {
				DdsPublisherQosProfile ddsPublisherQosProfile = (DdsPublisherQosProfile)theEObject;
				T result = caseDdsPublisherQosProfile(ddsPublisherQosProfile);
				if (result == null) result = caseDdsQosProfile(ddsPublisherQosProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_GROUP_DATA_QOS: {
				DdsGroupDataQos ddsGroupDataQos = (DdsGroupDataQos)theEObject;
				T result = caseDdsGroupDataQos(ddsGroupDataQos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE: {
				DdsDataWriterQosProfile ddsDataWriterQosProfile = (DdsDataWriterQosProfile)theEObject;
				T result = caseDdsDataWriterQosProfile(ddsDataWriterQosProfile);
				if (result == null) result = caseDdsQosProfile(ddsDataWriterQosProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_SUBSCRIBER_QOS_PROFILE: {
				DdsSubscriberQosProfile ddsSubscriberQosProfile = (DdsSubscriberQosProfile)theEObject;
				T result = caseDdsSubscriberQosProfile(ddsSubscriberQosProfile);
				if (result == null) result = caseDdsQosProfile(ddsSubscriberQosProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE: {
				DdsDataReaderQosProfile ddsDataReaderQosProfile = (DdsDataReaderQosProfile)theEObject;
				T result = caseDdsDataReaderQosProfile(ddsDataReaderQosProfile);
				if (result == null) result = caseDdsQosProfile(ddsDataReaderQosProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_LISTENER: {
				DdsDomainParticipantListener ddsDomainParticipantListener = (DdsDomainParticipantListener)theEObject;
				T result = caseDdsDomainParticipantListener(ddsDomainParticipantListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_SUBSCRIBER_LISTENER: {
				DdsSubscriberListener ddsSubscriberListener = (DdsSubscriberListener)theEObject;
				T result = caseDdsSubscriberListener(ddsSubscriberListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_PUBLISHER_LISTENER: {
				DdsPublisherListener ddsPublisherListener = (DdsPublisherListener)theEObject;
				T result = caseDdsPublisherListener(ddsPublisherListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DATA_READER_LISTENER: {
				DdsDataReaderListener ddsDataReaderListener = (DdsDataReaderListener)theEObject;
				T result = caseDdsDataReaderListener(ddsDataReaderListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DATA_WRITER_LISTENER: {
				DdsDataWriterListener ddsDataWriterListener = (DdsDataWriterListener)theEObject;
				T result = caseDdsDataWriterListener(ddsDataWriterListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_TOPIC_LISTENER: {
				DdsTopicListener ddsTopicListener = (DdsTopicListener)theEObject;
				T result = caseDdsTopicListener(ddsTopicListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_WAIT_SET: {
				DdsWaitSet ddsWaitSet = (DdsWaitSet)theEObject;
				T result = caseDdsWaitSet(ddsWaitSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_READ_CONDITION: {
				DdsReadCondition ddsReadCondition = (DdsReadCondition)theEObject;
				T result = caseDdsReadCondition(ddsReadCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD: {
				DdsStructuredField ddsStructuredField = (DdsStructuredField)theEObject;
				T result = caseDdsStructuredField(ddsStructuredField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_STATUS_CONDITION: {
				DdsStatusCondition ddsStatusCondition = (DdsStatusCondition)theEObject;
				T result = caseDdsStatusCondition(ddsStatusCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION: {
				DdsDomainParticipantStatusCondition ddsDomainParticipantStatusCondition = (DdsDomainParticipantStatusCondition)theEObject;
				T result = caseDdsDomainParticipantStatusCondition(ddsDomainParticipantStatusCondition);
				if (result == null) result = caseDdsStatusCondition(ddsDomainParticipantStatusCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_PUBLISHER_STATUS_CONDITION: {
				DdsPublisherStatusCondition ddsPublisherStatusCondition = (DdsPublisherStatusCondition)theEObject;
				T result = caseDdsPublisherStatusCondition(ddsPublisherStatusCondition);
				if (result == null) result = caseDdsStatusCondition(ddsPublisherStatusCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_SUBSCRIBER_STATUS_CONDITION: {
				DdsSubscriberStatusCondition ddsSubscriberStatusCondition = (DdsSubscriberStatusCondition)theEObject;
				T result = caseDdsSubscriberStatusCondition(ddsSubscriberStatusCondition);
				if (result == null) result = caseDdsStatusCondition(ddsSubscriberStatusCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DATA_WRITER_STATUS_CONDITION: {
				DdsDataWriterStatusCondition ddsDataWriterStatusCondition = (DdsDataWriterStatusCondition)theEObject;
				T result = caseDdsDataWriterStatusCondition(ddsDataWriterStatusCondition);
				if (result == null) result = caseDdsStatusCondition(ddsDataWriterStatusCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_DATA_READER_STATUS_CONDITION: {
				DdsDataReaderStatusCondition ddsDataReaderStatusCondition = (DdsDataReaderStatusCondition)theEObject;
				T result = caseDdsDataReaderStatusCondition(ddsDataReaderStatusCondition);
				if (result == null) result = caseDdsStatusCondition(ddsDataReaderStatusCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_TOPIC_STATUS_CONDITION: {
				DdsTopicStatusCondition ddsTopicStatusCondition = (DdsTopicStatusCondition)theEObject;
				T result = caseDdsTopicStatusCondition(ddsTopicStatusCondition);
				if (result == null) result = caseDdsStatusCondition(ddsTopicStatusCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.QUERY_CONDITION: {
				QueryCondition queryCondition = (QueryCondition)theEObject;
				T result = caseQueryCondition(queryCondition);
				if (result == null) result = caseDdsReadCondition(queryCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.GUARD_CONDITION: {
				GuardCondition guardCondition = (GuardCondition)theEObject;
				T result = caseGuardCondition(guardCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_SYSTEM: {
				DdsSystem ddsSystem = (DdsSystem)theEObject;
				T result = caseDdsSystem(ddsSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DdsMetamodelPackage.DDS_HOST: {
				DdsHost ddsHost = (DdsHost)theEObject;
				T result = caseDdsHost(ddsHost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsApplication(DdsApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Domain Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Domain Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDomainParticipant(DdsDomainParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Topic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Topic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsTopic(DdsTopic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Qos Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Qos Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsQosProfile(DdsQosProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Subscriber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsSubscriber(DdsSubscriber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Data Reader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Data Reader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDataReader(DdsDataReader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsPublisher(DdsPublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Data Writer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Data Writer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDataWriter(DdsDataWriter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Data Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Data Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDataModule(DdsDataModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Data Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Data Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDataStructure(DdsDataStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Data Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Data Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDataField(DdsDataField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Domain Participant Qos Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Domain Participant Qos Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDomainParticipantQosProfile(DdsDomainParticipantQosProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds User Data Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds User Data Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsUserDataQos(DdsUserDataQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Entity Factory Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Entity Factory Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsEntityFactoryQos(DdsEntityFactoryQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Topic Qos Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Topic Qos Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsTopicQosProfile(DdsTopicQosProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Topic Data Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Topic Data Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsTopicDataQos(DdsTopicDataQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Durability Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Durability Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDurabilityQos(DdsDurabilityQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Durability Service Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Durability Service Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDurabilityServiceQos(DdsDurabilityServiceQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDuration(DdsDuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Presentation Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Presentation Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsPresentationQos(DdsPresentationQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Deadline Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Deadline Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDeadlineQos(DdsDeadlineQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Latency Budget Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Latency Budget Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsLatencyBudgetQos(DdsLatencyBudgetQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Ownership Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Ownership Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsOwnershipQos(DdsOwnershipQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Ownership Strength Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Ownership Strength Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsOwnershipStrengthQos(DdsOwnershipStrengthQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Liveliness Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Liveliness Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsLivelinessQos(DdsLivelinessQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Time Based Filter Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Time Based Filter Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsTimeBasedFilterQos(DdsTimeBasedFilterQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Partition Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Partition Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsPartitionQos(DdsPartitionQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Reliability Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Reliability Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsReliabilityQos(DdsReliabilityQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Transport Priority Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Transport Priority Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsTransportPriorityQos(DdsTransportPriorityQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Lifespan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Lifespan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsLifespan(DdsLifespan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds History Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds History Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsHistoryQos(DdsHistoryQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Resource Limits</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Resource Limits</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsResourceLimits(DdsResourceLimits object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Data Writer Lifecycle Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Data Writer Lifecycle Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDataWriterLifecycleQos(DdsDataWriterLifecycleQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Data Reader Lifecycle Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Data Reader Lifecycle Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDataReaderLifecycleQos(DdsDataReaderLifecycleQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Destination Order Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Destination Order Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDestinationOrderQos(DdsDestinationOrderQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Publisher Qos Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Publisher Qos Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsPublisherQosProfile(DdsPublisherQosProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Group Data Qos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Group Data Qos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsGroupDataQos(DdsGroupDataQos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Data Writer Qos Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Data Writer Qos Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDataWriterQosProfile(DdsDataWriterQosProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Subscriber Qos Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Subscriber Qos Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsSubscriberQosProfile(DdsSubscriberQosProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Data Reader Qos Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Data Reader Qos Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDataReaderQosProfile(DdsDataReaderQosProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Domain Participant Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Domain Participant Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDomainParticipantListener(DdsDomainParticipantListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Subscriber Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Subscriber Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsSubscriberListener(DdsSubscriberListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Publisher Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Publisher Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsPublisherListener(DdsPublisherListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Data Reader Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Data Reader Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDataReaderListener(DdsDataReaderListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Data Writer Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Data Writer Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDataWriterListener(DdsDataWriterListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Topic Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Topic Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsTopicListener(DdsTopicListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Wait Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Wait Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsWaitSet(DdsWaitSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Read Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Read Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsReadCondition(DdsReadCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Structured Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Structured Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsStructuredField(DdsStructuredField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Status Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Status Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsStatusCondition(DdsStatusCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Domain Participant Status Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Domain Participant Status Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDomainParticipantStatusCondition(DdsDomainParticipantStatusCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Publisher Status Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Publisher Status Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsPublisherStatusCondition(DdsPublisherStatusCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Subscriber Status Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Subscriber Status Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsSubscriberStatusCondition(DdsSubscriberStatusCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Data Writer Status Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Data Writer Status Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDataWriterStatusCondition(DdsDataWriterStatusCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Data Reader Status Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Data Reader Status Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsDataReaderStatusCondition(DdsDataReaderStatusCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Topic Status Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Topic Status Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsTopicStatusCondition(DdsTopicStatusCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryCondition(QueryCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guard Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guard Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuardCondition(GuardCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsSystem(DdsSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dds Host</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dds Host</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsHost(DdsHost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DdsMetamodelSwitch
