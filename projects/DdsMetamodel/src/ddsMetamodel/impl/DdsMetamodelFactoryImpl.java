/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DdsMetamodelFactoryImpl extends EFactoryImpl implements DdsMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DdsMetamodelFactory init() {
		try {
			DdsMetamodelFactory theDdsMetamodelFactory = (DdsMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(DdsMetamodelPackage.eNS_URI);
			if (theDdsMetamodelFactory != null) {
				return theDdsMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DdsMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DdsMetamodelPackage.DDS_APPLICATION: return createDdsApplication();
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT: return createDdsDomainParticipant();
			case DdsMetamodelPackage.DDS_TOPIC: return createDdsTopic();
			case DdsMetamodelPackage.DDS_QOS_PROFILE: return createDdsQosProfile();
			case DdsMetamodelPackage.DDS_SUBSCRIBER: return createDdsSubscriber();
			case DdsMetamodelPackage.DDS_DATA_READER: return createDdsDataReader();
			case DdsMetamodelPackage.DDS_PUBLISHER: return createDdsPublisher();
			case DdsMetamodelPackage.DDS_DATA_WRITER: return createDdsDataWriter();
			case DdsMetamodelPackage.DDS_DATA_MODULE: return createDdsDataModule();
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE: return createDdsDataStructure();
			case DdsMetamodelPackage.DDS_DATA_FIELD: return createDdsDataField();
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE: return createDdsDomainParticipantQosProfile();
			case DdsMetamodelPackage.DDS_USER_DATA_QOS: return createDdsUserDataQos();
			case DdsMetamodelPackage.DDS_ENTITY_FACTORY_QOS: return createDdsEntityFactoryQos();
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE: return createDdsTopicQosProfile();
			case DdsMetamodelPackage.DDS_TOPIC_DATA_QOS: return createDdsTopicDataQos();
			case DdsMetamodelPackage.DDS_DURABILITY_QOS: return createDdsDurabilityQos();
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS: return createDdsDurabilityServiceQos();
			case DdsMetamodelPackage.DDS_DURATION: return createDdsDuration();
			case DdsMetamodelPackage.DDS_PRESENTATION_QOS: return createDdsPresentationQos();
			case DdsMetamodelPackage.DDS_DEADLINE_QOS: return createDdsDeadlineQos();
			case DdsMetamodelPackage.DDS_LATENCY_BUDGET_QOS: return createDdsLatencyBudgetQos();
			case DdsMetamodelPackage.DDS_OWNERSHIP_QOS: return createDdsOwnershipQos();
			case DdsMetamodelPackage.DDS_OWNERSHIP_STRENGTH_QOS: return createDdsOwnershipStrengthQos();
			case DdsMetamodelPackage.DDS_LIVELINESS_QOS: return createDdsLivelinessQos();
			case DdsMetamodelPackage.DDS_TIME_BASED_FILTER_QOS: return createDdsTimeBasedFilterQos();
			case DdsMetamodelPackage.DDS_PARTITION_QOS: return createDdsPartitionQos();
			case DdsMetamodelPackage.DDS_RELIABILITY_QOS: return createDdsReliabilityQos();
			case DdsMetamodelPackage.DDS_TRANSPORT_PRIORITY_QOS: return createDdsTransportPriorityQos();
			case DdsMetamodelPackage.DDS_LIFESPAN: return createDdsLifespan();
			case DdsMetamodelPackage.DDS_HISTORY_QOS: return createDdsHistoryQos();
			case DdsMetamodelPackage.DDS_RESOURCE_LIMITS: return createDdsResourceLimits();
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS: return createDdsDataWriterLifecycleQos();
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS: return createDdsDataReaderLifecycleQos();
			case DdsMetamodelPackage.DDS_DESTINATION_ORDER_QOS: return createDdsDestinationOrderQos();
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE: return createDdsPublisherQosProfile();
			case DdsMetamodelPackage.DDS_GROUP_DATA_QOS: return createDdsGroupDataQos();
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE: return createDdsDataWriterQosProfile();
			case DdsMetamodelPackage.DDS_SUBSCRIBER_QOS_PROFILE: return createDdsSubscriberQosProfile();
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE: return createDdsDataReaderQosProfile();
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_LISTENER: return createDdsDomainParticipantListener();
			case DdsMetamodelPackage.DDS_SUBSCRIBER_LISTENER: return createDdsSubscriberListener();
			case DdsMetamodelPackage.DDS_PUBLISHER_LISTENER: return createDdsPublisherListener();
			case DdsMetamodelPackage.DDS_DATA_READER_LISTENER: return createDdsDataReaderListener();
			case DdsMetamodelPackage.DDS_DATA_WRITER_LISTENER: return createDdsDataWriterListener();
			case DdsMetamodelPackage.DDS_TOPIC_LISTENER: return createDdsTopicListener();
			case DdsMetamodelPackage.DDS_WAIT_SET: return createDdsWaitSet();
			case DdsMetamodelPackage.DDS_READ_CONDITION: return createDdsReadCondition();
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD: return createDdsStructuredField();
			case DdsMetamodelPackage.DDS_STATUS_CONDITION: return createDdsStatusCondition();
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION: return createDdsDomainParticipantStatusCondition();
			case DdsMetamodelPackage.DDS_PUBLISHER_STATUS_CONDITION: return createDdsPublisherStatusCondition();
			case DdsMetamodelPackage.DDS_SUBSCRIBER_STATUS_CONDITION: return createDdsSubscriberStatusCondition();
			case DdsMetamodelPackage.DDS_DATA_WRITER_STATUS_CONDITION: return createDdsDataWriterStatusCondition();
			case DdsMetamodelPackage.DDS_DATA_READER_STATUS_CONDITION: return createDdsDataReaderStatusCondition();
			case DdsMetamodelPackage.DDS_TOPIC_STATUS_CONDITION: return createDdsTopicStatusCondition();
			case DdsMetamodelPackage.QUERY_CONDITION: return createQueryCondition();
			case DdsMetamodelPackage.GUARD_CONDITION: return createGuardCondition();
			case DdsMetamodelPackage.DDS_SYSTEM: return createDdsSystem();
			case DdsMetamodelPackage.DDS_HOST: return createDdsHost();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DdsMetamodelPackage.DURABILITY_QOS_POLICY_KIND:
				return createDurabilityQosPolicyKindFromString(eDataType, initialValue);
			case DdsMetamodelPackage.HISTORY_QOS_POLICY_KIND:
				return createHistoryQosPolicyKindFromString(eDataType, initialValue);
			case DdsMetamodelPackage.PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND:
				return createPresentationQosPolicyAccessScopeKindFromString(eDataType, initialValue);
			case DdsMetamodelPackage.OWNERSHIP_QOS_POLICY_KIND:
				return createOwnershipQosPolicyKindFromString(eDataType, initialValue);
			case DdsMetamodelPackage.LIVELINESS_QOS_POLICY_KIND:
				return createLivelinessQosPolicyKindFromString(eDataType, initialValue);
			case DdsMetamodelPackage.RELIABILITY_QOS_POLICY_KIND:
				return createReliabilityQosPolicyKindFromString(eDataType, initialValue);
			case DdsMetamodelPackage.DESTINATION_ORDER_QOS_POLICY_KIND:
				return createDestinationOrderQosPolicyKindFromString(eDataType, initialValue);
			case DdsMetamodelPackage.INVALID_SAMPLE_VISIBILITY_QOS_POLICY:
				return createInvalidSampleVisibilityQosPolicyFromString(eDataType, initialValue);
			case DdsMetamodelPackage.VIEW_STATE_KIND:
				return createViewStateKindFromString(eDataType, initialValue);
			case DdsMetamodelPackage.INSTANCE_STATE_KIND:
				return createInstanceStateKindFromString(eDataType, initialValue);
			case DdsMetamodelPackage.SAMPLE_STATE_KIND:
				return createSampleStateKindFromString(eDataType, initialValue);
			case DdsMetamodelPackage.DOMAIN_PARTICIPANT_STATUS:
				return createDomainParticipantStatusFromString(eDataType, initialValue);
			case DdsMetamodelPackage.SUBSCRIBER_STATUS:
				return createSubscriberStatusFromString(eDataType, initialValue);
			case DdsMetamodelPackage.PUBLISHER_STATUS:
				return createPublisherStatusFromString(eDataType, initialValue);
			case DdsMetamodelPackage.DATA_WRITER_STATUS:
				return createDataWriterStatusFromString(eDataType, initialValue);
			case DdsMetamodelPackage.DATA_READER_STATUS:
				return createDataReaderStatusFromString(eDataType, initialValue);
			case DdsMetamodelPackage.TOPIC_STATUS:
				return createTopicStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DdsMetamodelPackage.DURABILITY_QOS_POLICY_KIND:
				return convertDurabilityQosPolicyKindToString(eDataType, instanceValue);
			case DdsMetamodelPackage.HISTORY_QOS_POLICY_KIND:
				return convertHistoryQosPolicyKindToString(eDataType, instanceValue);
			case DdsMetamodelPackage.PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND:
				return convertPresentationQosPolicyAccessScopeKindToString(eDataType, instanceValue);
			case DdsMetamodelPackage.OWNERSHIP_QOS_POLICY_KIND:
				return convertOwnershipQosPolicyKindToString(eDataType, instanceValue);
			case DdsMetamodelPackage.LIVELINESS_QOS_POLICY_KIND:
				return convertLivelinessQosPolicyKindToString(eDataType, instanceValue);
			case DdsMetamodelPackage.RELIABILITY_QOS_POLICY_KIND:
				return convertReliabilityQosPolicyKindToString(eDataType, instanceValue);
			case DdsMetamodelPackage.DESTINATION_ORDER_QOS_POLICY_KIND:
				return convertDestinationOrderQosPolicyKindToString(eDataType, instanceValue);
			case DdsMetamodelPackage.INVALID_SAMPLE_VISIBILITY_QOS_POLICY:
				return convertInvalidSampleVisibilityQosPolicyToString(eDataType, instanceValue);
			case DdsMetamodelPackage.VIEW_STATE_KIND:
				return convertViewStateKindToString(eDataType, instanceValue);
			case DdsMetamodelPackage.INSTANCE_STATE_KIND:
				return convertInstanceStateKindToString(eDataType, instanceValue);
			case DdsMetamodelPackage.SAMPLE_STATE_KIND:
				return convertSampleStateKindToString(eDataType, instanceValue);
			case DdsMetamodelPackage.DOMAIN_PARTICIPANT_STATUS:
				return convertDomainParticipantStatusToString(eDataType, instanceValue);
			case DdsMetamodelPackage.SUBSCRIBER_STATUS:
				return convertSubscriberStatusToString(eDataType, instanceValue);
			case DdsMetamodelPackage.PUBLISHER_STATUS:
				return convertPublisherStatusToString(eDataType, instanceValue);
			case DdsMetamodelPackage.DATA_WRITER_STATUS:
				return convertDataWriterStatusToString(eDataType, instanceValue);
			case DdsMetamodelPackage.DATA_READER_STATUS:
				return convertDataReaderStatusToString(eDataType, instanceValue);
			case DdsMetamodelPackage.TOPIC_STATUS:
				return convertTopicStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsApplication createDdsApplication() {
		DdsApplicationImpl ddsApplication = new DdsApplicationImpl();
		return ddsApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDomainParticipant createDdsDomainParticipant() {
		DdsDomainParticipantImpl ddsDomainParticipant = new DdsDomainParticipantImpl();
		return ddsDomainParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTopic createDdsTopic() {
		DdsTopicImpl ddsTopic = new DdsTopicImpl();
		return ddsTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsQosProfile createDdsQosProfile() {
		DdsQosProfileImpl ddsQosProfile = new DdsQosProfileImpl();
		return ddsQosProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsSubscriber createDdsSubscriber() {
		DdsSubscriberImpl ddsSubscriber = new DdsSubscriberImpl();
		return ddsSubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataReader createDdsDataReader() {
		DdsDataReaderImpl ddsDataReader = new DdsDataReaderImpl();
		return ddsDataReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsPublisher createDdsPublisher() {
		DdsPublisherImpl ddsPublisher = new DdsPublisherImpl();
		return ddsPublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataWriter createDdsDataWriter() {
		DdsDataWriterImpl ddsDataWriter = new DdsDataWriterImpl();
		return ddsDataWriter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataModule createDdsDataModule() {
		DdsDataModuleImpl ddsDataModule = new DdsDataModuleImpl();
		return ddsDataModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataStructure createDdsDataStructure() {
		DdsDataStructureImpl ddsDataStructure = new DdsDataStructureImpl();
		return ddsDataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataField createDdsDataField() {
		DdsDataFieldImpl ddsDataField = new DdsDataFieldImpl();
		return ddsDataField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDomainParticipantQosProfile createDdsDomainParticipantQosProfile() {
		DdsDomainParticipantQosProfileImpl ddsDomainParticipantQosProfile = new DdsDomainParticipantQosProfileImpl();
		return ddsDomainParticipantQosProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsUserDataQos createDdsUserDataQos() {
		DdsUserDataQosImpl ddsUserDataQos = new DdsUserDataQosImpl();
		return ddsUserDataQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsEntityFactoryQos createDdsEntityFactoryQos() {
		DdsEntityFactoryQosImpl ddsEntityFactoryQos = new DdsEntityFactoryQosImpl();
		return ddsEntityFactoryQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTopicQosProfile createDdsTopicQosProfile() {
		DdsTopicQosProfileImpl ddsTopicQosProfile = new DdsTopicQosProfileImpl();
		return ddsTopicQosProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTopicDataQos createDdsTopicDataQos() {
		DdsTopicDataQosImpl ddsTopicDataQos = new DdsTopicDataQosImpl();
		return ddsTopicDataQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDurabilityQos createDdsDurabilityQos() {
		DdsDurabilityQosImpl ddsDurabilityQos = new DdsDurabilityQosImpl();
		return ddsDurabilityQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDurabilityServiceQos createDdsDurabilityServiceQos() {
		DdsDurabilityServiceQosImpl ddsDurabilityServiceQos = new DdsDurabilityServiceQosImpl();
		return ddsDurabilityServiceQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDuration createDdsDuration() {
		DdsDurationImpl ddsDuration = new DdsDurationImpl();
		return ddsDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsPresentationQos createDdsPresentationQos() {
		DdsPresentationQosImpl ddsPresentationQos = new DdsPresentationQosImpl();
		return ddsPresentationQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDeadlineQos createDdsDeadlineQos() {
		DdsDeadlineQosImpl ddsDeadlineQos = new DdsDeadlineQosImpl();
		return ddsDeadlineQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsLatencyBudgetQos createDdsLatencyBudgetQos() {
		DdsLatencyBudgetQosImpl ddsLatencyBudgetQos = new DdsLatencyBudgetQosImpl();
		return ddsLatencyBudgetQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsOwnershipQos createDdsOwnershipQos() {
		DdsOwnershipQosImpl ddsOwnershipQos = new DdsOwnershipQosImpl();
		return ddsOwnershipQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsOwnershipStrengthQos createDdsOwnershipStrengthQos() {
		DdsOwnershipStrengthQosImpl ddsOwnershipStrengthQos = new DdsOwnershipStrengthQosImpl();
		return ddsOwnershipStrengthQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsLivelinessQos createDdsLivelinessQos() {
		DdsLivelinessQosImpl ddsLivelinessQos = new DdsLivelinessQosImpl();
		return ddsLivelinessQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTimeBasedFilterQos createDdsTimeBasedFilterQos() {
		DdsTimeBasedFilterQosImpl ddsTimeBasedFilterQos = new DdsTimeBasedFilterQosImpl();
		return ddsTimeBasedFilterQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsPartitionQos createDdsPartitionQos() {
		DdsPartitionQosImpl ddsPartitionQos = new DdsPartitionQosImpl();
		return ddsPartitionQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsReliabilityQos createDdsReliabilityQos() {
		DdsReliabilityQosImpl ddsReliabilityQos = new DdsReliabilityQosImpl();
		return ddsReliabilityQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTransportPriorityQos createDdsTransportPriorityQos() {
		DdsTransportPriorityQosImpl ddsTransportPriorityQos = new DdsTransportPriorityQosImpl();
		return ddsTransportPriorityQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsLifespan createDdsLifespan() {
		DdsLifespanImpl ddsLifespan = new DdsLifespanImpl();
		return ddsLifespan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsHistoryQos createDdsHistoryQos() {
		DdsHistoryQosImpl ddsHistoryQos = new DdsHistoryQosImpl();
		return ddsHistoryQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsResourceLimits createDdsResourceLimits() {
		DdsResourceLimitsImpl ddsResourceLimits = new DdsResourceLimitsImpl();
		return ddsResourceLimits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataWriterLifecycleQos createDdsDataWriterLifecycleQos() {
		DdsDataWriterLifecycleQosImpl ddsDataWriterLifecycleQos = new DdsDataWriterLifecycleQosImpl();
		return ddsDataWriterLifecycleQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataReaderLifecycleQos createDdsDataReaderLifecycleQos() {
		DdsDataReaderLifecycleQosImpl ddsDataReaderLifecycleQos = new DdsDataReaderLifecycleQosImpl();
		return ddsDataReaderLifecycleQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDestinationOrderQos createDdsDestinationOrderQos() {
		DdsDestinationOrderQosImpl ddsDestinationOrderQos = new DdsDestinationOrderQosImpl();
		return ddsDestinationOrderQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsPublisherQosProfile createDdsPublisherQosProfile() {
		DdsPublisherQosProfileImpl ddsPublisherQosProfile = new DdsPublisherQosProfileImpl();
		return ddsPublisherQosProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsGroupDataQos createDdsGroupDataQos() {
		DdsGroupDataQosImpl ddsGroupDataQos = new DdsGroupDataQosImpl();
		return ddsGroupDataQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataWriterQosProfile createDdsDataWriterQosProfile() {
		DdsDataWriterQosProfileImpl ddsDataWriterQosProfile = new DdsDataWriterQosProfileImpl();
		return ddsDataWriterQosProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsSubscriberQosProfile createDdsSubscriberQosProfile() {
		DdsSubscriberQosProfileImpl ddsSubscriberQosProfile = new DdsSubscriberQosProfileImpl();
		return ddsSubscriberQosProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataReaderQosProfile createDdsDataReaderQosProfile() {
		DdsDataReaderQosProfileImpl ddsDataReaderQosProfile = new DdsDataReaderQosProfileImpl();
		return ddsDataReaderQosProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDomainParticipantListener createDdsDomainParticipantListener() {
		DdsDomainParticipantListenerImpl ddsDomainParticipantListener = new DdsDomainParticipantListenerImpl();
		return ddsDomainParticipantListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsSubscriberListener createDdsSubscriberListener() {
		DdsSubscriberListenerImpl ddsSubscriberListener = new DdsSubscriberListenerImpl();
		return ddsSubscriberListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsPublisherListener createDdsPublisherListener() {
		DdsPublisherListenerImpl ddsPublisherListener = new DdsPublisherListenerImpl();
		return ddsPublisherListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataReaderListener createDdsDataReaderListener() {
		DdsDataReaderListenerImpl ddsDataReaderListener = new DdsDataReaderListenerImpl();
		return ddsDataReaderListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataWriterListener createDdsDataWriterListener() {
		DdsDataWriterListenerImpl ddsDataWriterListener = new DdsDataWriterListenerImpl();
		return ddsDataWriterListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTopicListener createDdsTopicListener() {
		DdsTopicListenerImpl ddsTopicListener = new DdsTopicListenerImpl();
		return ddsTopicListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsWaitSet createDdsWaitSet() {
		DdsWaitSetImpl ddsWaitSet = new DdsWaitSetImpl();
		return ddsWaitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsReadCondition createDdsReadCondition() {
		DdsReadConditionImpl ddsReadCondition = new DdsReadConditionImpl();
		return ddsReadCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsStructuredField createDdsStructuredField() {
		DdsStructuredFieldImpl ddsStructuredField = new DdsStructuredFieldImpl();
		return ddsStructuredField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsStatusCondition createDdsStatusCondition() {
		DdsStatusConditionImpl ddsStatusCondition = new DdsStatusConditionImpl();
		return ddsStatusCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDomainParticipantStatusCondition createDdsDomainParticipantStatusCondition() {
		DdsDomainParticipantStatusConditionImpl ddsDomainParticipantStatusCondition = new DdsDomainParticipantStatusConditionImpl();
		return ddsDomainParticipantStatusCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsPublisherStatusCondition createDdsPublisherStatusCondition() {
		DdsPublisherStatusConditionImpl ddsPublisherStatusCondition = new DdsPublisherStatusConditionImpl();
		return ddsPublisherStatusCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsSubscriberStatusCondition createDdsSubscriberStatusCondition() {
		DdsSubscriberStatusConditionImpl ddsSubscriberStatusCondition = new DdsSubscriberStatusConditionImpl();
		return ddsSubscriberStatusCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataWriterStatusCondition createDdsDataWriterStatusCondition() {
		DdsDataWriterStatusConditionImpl ddsDataWriterStatusCondition = new DdsDataWriterStatusConditionImpl();
		return ddsDataWriterStatusCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataReaderStatusCondition createDdsDataReaderStatusCondition() {
		DdsDataReaderStatusConditionImpl ddsDataReaderStatusCondition = new DdsDataReaderStatusConditionImpl();
		return ddsDataReaderStatusCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTopicStatusCondition createDdsTopicStatusCondition() {
		DdsTopicStatusConditionImpl ddsTopicStatusCondition = new DdsTopicStatusConditionImpl();
		return ddsTopicStatusCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryCondition createQueryCondition() {
		QueryConditionImpl queryCondition = new QueryConditionImpl();
		return queryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardCondition createGuardCondition() {
		GuardConditionImpl guardCondition = new GuardConditionImpl();
		return guardCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsSystem createDdsSystem() {
		DdsSystemImpl ddsSystem = new DdsSystemImpl();
		return ddsSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsHost createDdsHost() {
		DdsHostImpl ddsHost = new DdsHostImpl();
		return ddsHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurabilityQosPolicyKind createDurabilityQosPolicyKindFromString(EDataType eDataType, String initialValue) {
		DurabilityQosPolicyKind result = DurabilityQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurabilityQosPolicyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryQosPolicyKind createHistoryQosPolicyKindFromString(EDataType eDataType, String initialValue) {
		HistoryQosPolicyKind result = HistoryQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHistoryQosPolicyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationQosPolicyAccessScopeKind createPresentationQosPolicyAccessScopeKindFromString(EDataType eDataType, String initialValue) {
		PresentationQosPolicyAccessScopeKind result = PresentationQosPolicyAccessScopeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationQosPolicyAccessScopeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnershipQosPolicyKind createOwnershipQosPolicyKindFromString(EDataType eDataType, String initialValue) {
		OwnershipQosPolicyKind result = OwnershipQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOwnershipQosPolicyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivelinessQosPolicyKind createLivelinessQosPolicyKindFromString(EDataType eDataType, String initialValue) {
		LivelinessQosPolicyKind result = LivelinessQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLivelinessQosPolicyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityQosPolicyKind createReliabilityQosPolicyKindFromString(EDataType eDataType, String initialValue) {
		ReliabilityQosPolicyKind result = ReliabilityQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReliabilityQosPolicyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestinationOrderQosPolicyKind createDestinationOrderQosPolicyKindFromString(EDataType eDataType, String initialValue) {
		DestinationOrderQosPolicyKind result = DestinationOrderQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDestinationOrderQosPolicyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidSampleVisibilityQosPolicy createInvalidSampleVisibilityQosPolicyFromString(EDataType eDataType, String initialValue) {
		InvalidSampleVisibilityQosPolicy result = InvalidSampleVisibilityQosPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidSampleVisibilityQosPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewStateKind createViewStateKindFromString(EDataType eDataType, String initialValue) {
		ViewStateKind result = ViewStateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewStateKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceStateKind createInstanceStateKindFromString(EDataType eDataType, String initialValue) {
		InstanceStateKind result = InstanceStateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceStateKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleStateKind createSampleStateKindFromString(EDataType eDataType, String initialValue) {
		SampleStateKind result = SampleStateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSampleStateKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainParticipantStatus createDomainParticipantStatusFromString(EDataType eDataType, String initialValue) {
		DomainParticipantStatus result = DomainParticipantStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDomainParticipantStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriberStatus createSubscriberStatusFromString(EDataType eDataType, String initialValue) {
		SubscriberStatus result = SubscriberStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriberStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublisherStatus createPublisherStatusFromString(EDataType eDataType, String initialValue) {
		PublisherStatus result = PublisherStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublisherStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWriterStatus createDataWriterStatusFromString(EDataType eDataType, String initialValue) {
		DataWriterStatus result = DataWriterStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataWriterStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataReaderStatus createDataReaderStatusFromString(EDataType eDataType, String initialValue) {
		DataReaderStatus result = DataReaderStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataReaderStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicStatus createTopicStatusFromString(EDataType eDataType, String initialValue) {
		TopicStatus result = TopicStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTopicStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsMetamodelPackage getDdsMetamodelPackage() {
		return (DdsMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DdsMetamodelPackage getPackage() {
		return DdsMetamodelPackage.eINSTANCE;
	}

} //DdsMetamodelFactoryImpl
