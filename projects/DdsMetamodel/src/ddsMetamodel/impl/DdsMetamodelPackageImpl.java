/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DataReaderStatus;
import ddsMetamodel.DataWriterStatus;
import ddsMetamodel.DdsApplication;
import ddsMetamodel.DdsDataField;
import ddsMetamodel.DdsDataModule;
import ddsMetamodel.DdsDataReader;
import ddsMetamodel.DdsDataReaderLifecycleQos;
import ddsMetamodel.DdsDataReaderListener;
import ddsMetamodel.DdsDataReaderQosProfile;
import ddsMetamodel.DdsDataReaderStatusCondition;
import ddsMetamodel.DdsDataStructure;
import ddsMetamodel.DdsDataWriter;
import ddsMetamodel.DdsDataWriterLifecycleQos;
import ddsMetamodel.DdsDataWriterListener;
import ddsMetamodel.DdsDataWriterQosProfile;
import ddsMetamodel.DdsDataWriterStatusCondition;
import ddsMetamodel.DdsDeadlineQos;
import ddsMetamodel.DdsDestinationOrderQos;
import ddsMetamodel.DdsDomainParticipant;
import ddsMetamodel.DdsDomainParticipantListener;
import ddsMetamodel.DdsDomainParticipantQosProfile;
import ddsMetamodel.DdsDomainParticipantStatusCondition;
import ddsMetamodel.DdsDurabilityQos;
import ddsMetamodel.DdsDurabilityServiceQos;
import ddsMetamodel.DdsDuration;
import ddsMetamodel.DdsEntityFactoryQos;
import ddsMetamodel.DdsGroupDataQos;
import ddsMetamodel.DdsHistoryQos;
import ddsMetamodel.DdsHost;
import ddsMetamodel.DdsLatencyBudgetQos;
import ddsMetamodel.DdsLifespan;
import ddsMetamodel.DdsLivelinessQos;
import ddsMetamodel.DdsMetamodelFactory;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsOwnershipQos;
import ddsMetamodel.DdsOwnershipStrengthQos;
import ddsMetamodel.DdsPartitionQos;
import ddsMetamodel.DdsPresentationQos;
import ddsMetamodel.DdsPublisher;
import ddsMetamodel.DdsPublisherListener;
import ddsMetamodel.DdsPublisherQosProfile;
import ddsMetamodel.DdsPublisherStatusCondition;
import ddsMetamodel.DdsQosProfile;
import ddsMetamodel.DdsReadCondition;
import ddsMetamodel.DdsReliabilityQos;
import ddsMetamodel.DdsResourceLimits;
import ddsMetamodel.DdsStatusCondition;
import ddsMetamodel.DdsStructuredField;
import ddsMetamodel.DdsSubscriber;
import ddsMetamodel.DdsSubscriberListener;
import ddsMetamodel.DdsSubscriberQosProfile;
import ddsMetamodel.DdsSubscriberStatusCondition;
import ddsMetamodel.DdsSystem;
import ddsMetamodel.DdsTimeBasedFilterQos;
import ddsMetamodel.DdsTopic;
import ddsMetamodel.DdsTopicDataQos;
import ddsMetamodel.DdsTopicListener;
import ddsMetamodel.DdsTopicQosProfile;
import ddsMetamodel.DdsTopicStatusCondition;
import ddsMetamodel.DdsTransportPriorityQos;
import ddsMetamodel.DdsUserDataQos;
import ddsMetamodel.DdsWaitSet;
import ddsMetamodel.DestinationOrderQosPolicyKind;
import ddsMetamodel.DomainParticipantStatus;
import ddsMetamodel.DurabilityQosPolicyKind;
import ddsMetamodel.GuardCondition;
import ddsMetamodel.HistoryQosPolicyKind;
import ddsMetamodel.InstanceStateKind;
import ddsMetamodel.InvalidSampleVisibilityQosPolicy;
import ddsMetamodel.LivelinessQosPolicyKind;
import ddsMetamodel.OwnershipQosPolicyKind;
import ddsMetamodel.PresentationQosPolicyAccessScopeKind;
import ddsMetamodel.PublisherStatus;
import ddsMetamodel.QueryCondition;
import ddsMetamodel.ReliabilityQosPolicyKind;
import ddsMetamodel.SampleStateKind;
import ddsMetamodel.SubscriberStatus;
import ddsMetamodel.TopicStatus;
import ddsMetamodel.ViewStateKind;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DdsMetamodelPackageImpl extends EPackageImpl implements DdsMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDomainParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsTopicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsQosProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsSubscriberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDataReaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsPublisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDataWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDataModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDataStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDataFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDomainParticipantQosProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsUserDataQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsEntityFactoryQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsTopicQosProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsTopicDataQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDurabilityQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDurabilityServiceQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsPresentationQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDeadlineQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsLatencyBudgetQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsOwnershipQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsOwnershipStrengthQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsLivelinessQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsTimeBasedFilterQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsPartitionQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsReliabilityQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsTransportPriorityQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsLifespanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsHistoryQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsResourceLimitsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDataWriterLifecycleQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDataReaderLifecycleQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDestinationOrderQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsPublisherQosProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsGroupDataQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDataWriterQosProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsSubscriberQosProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDataReaderQosProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDomainParticipantListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsSubscriberListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsPublisherListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDataReaderListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDataWriterListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsTopicListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsWaitSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsReadConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsStructuredFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsStatusConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDomainParticipantStatusConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsPublisherStatusConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsSubscriberStatusConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDataWriterStatusConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsDataReaderStatusConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsTopicStatusConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsHostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durabilityQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum historyQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum presentationQosPolicyAccessScopeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ownershipQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum livelinessQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reliabilityQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum destinationOrderQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum invalidSampleVisibilityQosPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum viewStateKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instanceStateKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sampleStateKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum domainParticipantStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subscriberStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum publisherStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataWriterStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataReaderStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum topicStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ddsMetamodel.DdsMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DdsMetamodelPackageImpl() {
		super(eNS_URI, DdsMetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DdsMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DdsMetamodelPackage init() {
		if (isInited) return (DdsMetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(DdsMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		DdsMetamodelPackageImpl theDdsMetamodelPackage = (DdsMetamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DdsMetamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DdsMetamodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDdsMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theDdsMetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDdsMetamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DdsMetamodelPackage.eNS_URI, theDdsMetamodelPackage);
		return theDdsMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsApplication() {
		return ddsApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsApplication_ApplicationName() {
		return (EAttribute)ddsApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsApplication_DomainParticipants() {
		return (EReference)ddsApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsApplication_Waitset() {
		return (EReference)ddsApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDomainParticipant() {
		return ddsDomainParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDomainParticipant_DomainParticipantName() {
		return (EAttribute)ddsDomainParticipantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDomainParticipant_Ddssubscriber() {
		return (EReference)ddsDomainParticipantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDomainParticipant_Ddspublisher() {
		return (EReference)ddsDomainParticipantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDomainParticipant_Ddsdomainparticipantqosprofile() {
		return (EReference)ddsDomainParticipantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDomainParticipant_DomainParticipantListener() {
		return (EReference)ddsDomainParticipantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDomainParticipant_DomainId() {
		return (EAttribute)ddsDomainParticipantEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsTopic() {
		return ddsTopicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsTopic_TopicName() {
		return (EAttribute)ddsTopicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsTopic_TopicListener() {
		return (EReference)ddsTopicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsTopic_TopicQosProfile() {
		return (EReference)ddsTopicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsTopic_Ddsdatastructure() {
		return (EReference)ddsTopicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsQosProfile() {
		return ddsQosProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsQosProfile_ProfileName() {
		return (EAttribute)ddsQosProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsSubscriber() {
		return ddsSubscriberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsSubscriber_SubscriberName() {
		return (EAttribute)ddsSubscriberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsSubscriber_Ddsdatareader() {
		return (EReference)ddsSubscriberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsSubscriber_SubscriberListener() {
		return (EReference)ddsSubscriberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsSubscriber_SubscriberQosProfile() {
		return (EReference)ddsSubscriberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDataReader() {
		return ddsDataReaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDataReader_DataReaderName() {
		return (EAttribute)ddsDataReaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReader_ReadableTopic() {
		return (EReference)ddsDataReaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReader_DataReaderListener() {
		return (EReference)ddsDataReaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReader_DataReaderQosProfile() {
		return (EReference)ddsDataReaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReader_ContainingSubscriber() {
		return (EReference)ddsDataReaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsPublisher() {
		return ddsPublisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsPublisher_PublisherName() {
		return (EAttribute)ddsPublisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsPublisher_Ddsdatawriter() {
		return (EReference)ddsPublisherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsPublisher_PublisherListener() {
		return (EReference)ddsPublisherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsPublisher_PublisherQosProfile() {
		return (EReference)ddsPublisherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDataWriter() {
		return ddsDataWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDataWriter_DataWriterName() {
		return (EAttribute)ddsDataWriterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriter_PubliableTopic() {
		return (EReference)ddsDataWriterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriter_DataWriterListener() {
		return (EReference)ddsDataWriterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriter_DataWriterQosProfile() {
		return (EReference)ddsDataWriterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDataModule() {
		return ddsDataModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDataModule_ModuleName() {
		return (EAttribute)ddsDataModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataModule_DataStructures() {
		return (EReference)ddsDataModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataModule_InnerModules() {
		return (EReference)ddsDataModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataModule_ContainingSystem() {
		return (EReference)ddsDataModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataModule_ContainingModule() {
		return (EReference)ddsDataModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDataStructure() {
		return ddsDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDataStructure_StructureName() {
		return (EAttribute)ddsDataStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataStructure_Fields() {
		return (EReference)ddsDataStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataStructure_StructuredFields() {
		return (EReference)ddsDataStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataStructure_ContainerDataModule() {
		return (EReference)ddsDataStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDataField() {
		return ddsDataFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDataField_FieldType() {
		return (EAttribute)ddsDataFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDataField_FieldName() {
		return (EAttribute)ddsDataFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDataField_IsKey() {
		return (EAttribute)ddsDataFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDataField_MaxMultiplicity() {
		return (EAttribute)ddsDataFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDomainParticipantQosProfile() {
		return ddsDomainParticipantQosProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDomainParticipantQosProfile_UserDataQos() {
		return (EReference)ddsDomainParticipantQosProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDomainParticipantQosProfile_EntityFactoryQos() {
		return (EReference)ddsDomainParticipantQosProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsUserDataQos() {
		return ddsUserDataQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsUserDataQos_Value() {
		return (EAttribute)ddsUserDataQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsEntityFactoryQos() {
		return ddsEntityFactoryQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsEntityFactoryQos_Autoenable_created_entities() {
		return (EAttribute)ddsEntityFactoryQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsTopicQosProfile() {
		return ddsTopicQosProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsTopicQosProfile_TopicDataQos() {
		return (EReference)ddsTopicQosProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsTopicQosProfile_DurabilityQos() {
		return (EReference)ddsTopicQosProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsTopicQosProfile_DurabilityServiceQos() {
		return (EReference)ddsTopicQosProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsTopicQosProfile_LatencyBudgetQos() {
		return (EReference)ddsTopicQosProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsTopicQosProfile_LivelinessQos() {
		return (EReference)ddsTopicQosProfileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsTopicQosProfile_OwnershipQos() {
		return (EReference)ddsTopicQosProfileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsTopicQosProfile_ReliabilityQos() {
		return (EReference)ddsTopicQosProfileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsTopicQosProfile_DestinationOrderQos() {
		return (EReference)ddsTopicQosProfileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsTopicQosProfile_HistoryQos() {
		return (EReference)ddsTopicQosProfileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsTopicQosProfile_ResourceLimitsQos() {
		return (EReference)ddsTopicQosProfileEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsTopicQosProfile_TransportPriorityQos() {
		return (EReference)ddsTopicQosProfileEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsTopicQosProfile_LifespanQos() {
		return (EReference)ddsTopicQosProfileEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsTopicQosProfile_DeadlineQos() {
		return (EReference)ddsTopicQosProfileEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsTopicDataQos() {
		return ddsTopicDataQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsTopicDataQos_Value() {
		return (EAttribute)ddsTopicDataQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDurabilityQos() {
		return ddsDurabilityQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDurabilityQos_Kind() {
		return (EAttribute)ddsDurabilityQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDurabilityServiceQos() {
		return ddsDurabilityServiceQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDurabilityServiceQos_Service_cleanup_delay() {
		return (EReference)ddsDurabilityServiceQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDurabilityServiceQos_History_kind() {
		return (EAttribute)ddsDurabilityServiceQosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDurabilityServiceQos_History_depth() {
		return (EAttribute)ddsDurabilityServiceQosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDurabilityServiceQos_Max_samples() {
		return (EAttribute)ddsDurabilityServiceQosEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDurabilityServiceQos_Max_instances() {
		return (EAttribute)ddsDurabilityServiceQosEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDurabilityServiceQos_Max_samples_per_instances() {
		return (EAttribute)ddsDurabilityServiceQosEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDuration() {
		return ddsDurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDuration_Sec() {
		return (EAttribute)ddsDurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDuration_NanoSec() {
		return (EAttribute)ddsDurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsPresentationQos() {
		return ddsPresentationQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsPresentationQos_Access_scope() {
		return (EAttribute)ddsPresentationQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsPresentationQos_Coherent_access() {
		return (EAttribute)ddsPresentationQosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsPresentationQos_Ordered_access() {
		return (EAttribute)ddsPresentationQosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDeadlineQos() {
		return ddsDeadlineQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDeadlineQos_Period() {
		return (EReference)ddsDeadlineQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsLatencyBudgetQos() {
		return ddsLatencyBudgetQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsLatencyBudgetQos_Duration() {
		return (EReference)ddsLatencyBudgetQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsOwnershipQos() {
		return ddsOwnershipQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsOwnershipQos_Kind() {
		return (EAttribute)ddsOwnershipQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsOwnershipStrengthQos() {
		return ddsOwnershipStrengthQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsOwnershipStrengthQos_Value() {
		return (EAttribute)ddsOwnershipStrengthQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsLivelinessQos() {
		return ddsLivelinessQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsLivelinessQos_Kind() {
		return (EAttribute)ddsLivelinessQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsLivelinessQos_Lease_duration() {
		return (EReference)ddsLivelinessQosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsTimeBasedFilterQos() {
		return ddsTimeBasedFilterQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsTimeBasedFilterQos_Minimum_separation() {
		return (EReference)ddsTimeBasedFilterQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsPartitionQos() {
		return ddsPartitionQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsPartitionQos_Name() {
		return (EAttribute)ddsPartitionQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsReliabilityQos() {
		return ddsReliabilityQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsReliabilityQos_Kind() {
		return (EAttribute)ddsReliabilityQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsReliabilityQos_Max_blocking_time() {
		return (EReference)ddsReliabilityQosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsTransportPriorityQos() {
		return ddsTransportPriorityQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsTransportPriorityQos_Value() {
		return (EAttribute)ddsTransportPriorityQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsLifespan() {
		return ddsLifespanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsLifespan_Duration() {
		return (EReference)ddsLifespanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsHistoryQos() {
		return ddsHistoryQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsHistoryQos_Kind() {
		return (EAttribute)ddsHistoryQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsHistoryQos_Depth() {
		return (EAttribute)ddsHistoryQosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsResourceLimits() {
		return ddsResourceLimitsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsResourceLimits_Max_samples() {
		return (EAttribute)ddsResourceLimitsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsResourceLimits_Max_instances() {
		return (EAttribute)ddsResourceLimitsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsResourceLimits_Max_samples_per_instances() {
		return (EAttribute)ddsResourceLimitsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDataWriterLifecycleQos() {
		return ddsDataWriterLifecycleQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDataWriterLifecycleQos_Autodispose_unregistered_instances() {
		return (EAttribute)ddsDataWriterLifecycleQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriterLifecycleQos_Autopurge_suspended_samples_delay() {
		return (EReference)ddsDataWriterLifecycleQosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriterLifecycleQos_Autounregister_instance_delay() {
		return (EReference)ddsDataWriterLifecycleQosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDataReaderLifecycleQos() {
		return ddsDataReaderLifecycleQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReaderLifecycleQos_Autopurge_nowriters_samples_delay() {
		return (EReference)ddsDataReaderLifecycleQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReaderLifecycleQos_Autopurge_disposed_samples_delay() {
		return (EReference)ddsDataReaderLifecycleQosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDataReaderLifecycleQos_Autopurge_dispose_all() {
		return (EAttribute)ddsDataReaderLifecycleQosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDataReaderLifecycleQos_Enable_invalid_samples() {
		return (EAttribute)ddsDataReaderLifecycleQosEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDestinationOrderQos() {
		return ddsDestinationOrderQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDestinationOrderQos_Kind() {
		return (EAttribute)ddsDestinationOrderQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsPublisherQosProfile() {
		return ddsPublisherQosProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsPublisherQosProfile_GroupDataQos() {
		return (EReference)ddsPublisherQosProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsPublisherQosProfile_EntityFactoryQos() {
		return (EReference)ddsPublisherQosProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsPublisherQosProfile_PresentationQos() {
		return (EReference)ddsPublisherQosProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsPublisherQosProfile_PartitionQos() {
		return (EReference)ddsPublisherQosProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsGroupDataQos() {
		return ddsGroupDataQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsGroupDataQos_Value() {
		return (EAttribute)ddsGroupDataQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDataWriterQosProfile() {
		return ddsDataWriterQosProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriterQosProfile_UserDataQos() {
		return (EReference)ddsDataWriterQosProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriterQosProfile_DurabilityQos() {
		return (EReference)ddsDataWriterQosProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriterQosProfile_DeadlineQos() {
		return (EReference)ddsDataWriterQosProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriterQosProfile_LatencyBudgetQos() {
		return (EReference)ddsDataWriterQosProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriterQosProfile_OwnershipQos() {
		return (EReference)ddsDataWriterQosProfileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriterQosProfile_OwnershipStrength() {
		return (EReference)ddsDataWriterQosProfileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriterQosProfile_LivelinessQos() {
		return (EReference)ddsDataWriterQosProfileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriterQosProfile_ReliabilityQos() {
		return (EReference)ddsDataWriterQosProfileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriterQosProfile_TransportPriorityQos() {
		return (EReference)ddsDataWriterQosProfileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriterQosProfile_LifespanQos() {
		return (EReference)ddsDataWriterQosProfileEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriterQosProfile_DestinationOrderQos() {
		return (EReference)ddsDataWriterQosProfileEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriterQosProfile_HistoryQos() {
		return (EReference)ddsDataWriterQosProfileEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriterQosProfile_ResourceLimitsQos() {
		return (EReference)ddsDataWriterQosProfileEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriterQosProfile_DataWriterLifecycleQos() {
		return (EReference)ddsDataWriterQosProfileEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsSubscriberQosProfile() {
		return ddsSubscriberQosProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsSubscriberQosProfile_GroupDataQos() {
		return (EReference)ddsSubscriberQosProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsSubscriberQosProfile_EntityFactoryQos() {
		return (EReference)ddsSubscriberQosProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsSubscriberQosProfile_PresentationQos() {
		return (EReference)ddsSubscriberQosProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsSubscriberQosProfile_PartitionQos() {
		return (EReference)ddsSubscriberQosProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDataReaderQosProfile() {
		return ddsDataReaderQosProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReaderQosProfile_UserDataQos() {
		return (EReference)ddsDataReaderQosProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReaderQosProfile_DurabilityQos() {
		return (EReference)ddsDataReaderQosProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReaderQosProfile_DeadlineQos() {
		return (EReference)ddsDataReaderQosProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReaderQosProfile_LatencyBudgetQos() {
		return (EReference)ddsDataReaderQosProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReaderQosProfile_LivelinessQos() {
		return (EReference)ddsDataReaderQosProfileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReaderQosProfile_OwnershipQos() {
		return (EReference)ddsDataReaderQosProfileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReaderQosProfile_TimeBasedFilterQos() {
		return (EReference)ddsDataReaderQosProfileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReaderQosProfile_ReliabilityQos() {
		return (EReference)ddsDataReaderQosProfileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReaderQosProfile_DestinationOrderQos() {
		return (EReference)ddsDataReaderQosProfileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReaderQosProfile_HistoryQos() {
		return (EReference)ddsDataReaderQosProfileEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReaderQosProfile_ResourceLimitsQos() {
		return (EReference)ddsDataReaderQosProfileEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReaderQosProfile_DataReaderLifecycleQos() {
		return (EReference)ddsDataReaderQosProfileEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDomainParticipantListener() {
		return ddsDomainParticipantListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDomainParticipantListener_Name() {
		return (EAttribute)ddsDomainParticipantListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDomainParticipantListener_ListenedStatus() {
		return (EAttribute)ddsDomainParticipantListenerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsSubscriberListener() {
		return ddsSubscriberListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsSubscriberListener_Name() {
		return (EAttribute)ddsSubscriberListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsSubscriberListener_ListenedStatus() {
		return (EAttribute)ddsSubscriberListenerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsPublisherListener() {
		return ddsPublisherListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsPublisherListener_Name() {
		return (EAttribute)ddsPublisherListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsPublisherListener_ListenedStatus() {
		return (EAttribute)ddsPublisherListenerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDataReaderListener() {
		return ddsDataReaderListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDataReaderListener_Name() {
		return (EAttribute)ddsDataReaderListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDataReaderListener_ListenedStatus() {
		return (EAttribute)ddsDataReaderListenerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDataWriterListener() {
		return ddsDataWriterListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDataWriterListener_Name() {
		return (EAttribute)ddsDataWriterListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDataWriterListener_ListenedStatus() {
		return (EAttribute)ddsDataWriterListenerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsTopicListener() {
		return ddsTopicListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsTopicListener_Name() {
		return (EAttribute)ddsTopicListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsTopicListener_ListenedStatus() {
		return (EAttribute)ddsTopicListenerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsWaitSet() {
		return ddsWaitSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsWaitSet_Name() {
		return (EAttribute)ddsWaitSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsWaitSet_ReadConditions() {
		return (EReference)ddsWaitSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsWaitSet_StatusConditions() {
		return (EReference)ddsWaitSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsWaitSet_GuardConditions() {
		return (EReference)ddsWaitSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsReadCondition() {
		return ddsReadConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsReadCondition_View_state_mask() {
		return (EAttribute)ddsReadConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsReadCondition_Instance_state_mask() {
		return (EAttribute)ddsReadConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsReadCondition_Sample_state_mask() {
		return (EAttribute)ddsReadConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsReadCondition_DataReader() {
		return (EReference)ddsReadConditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsStructuredField() {
		return ddsStructuredFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsStructuredField_IsKey() {
		return (EAttribute)ddsStructuredFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsStructuredField_ReferencedType() {
		return (EReference)ddsStructuredFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsStructuredField_DataStructure() {
		return (EReference)ddsStructuredFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsStructuredField_FieldName() {
		return (EAttribute)ddsStructuredFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsStructuredField_MaxMultiplicity() {
		return (EAttribute)ddsStructuredFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsStatusCondition() {
		return ddsStatusConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsStatusCondition_ContainingWaitset() {
		return (EReference)ddsStatusConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDomainParticipantStatusCondition() {
		return ddsDomainParticipantStatusConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDomainParticipantStatusCondition_Enabled_status() {
		return (EAttribute)ddsDomainParticipantStatusConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDomainParticipantStatusCondition_DomainParticipant() {
		return (EReference)ddsDomainParticipantStatusConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsPublisherStatusCondition() {
		return ddsPublisherStatusConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsPublisherStatusCondition_Enabled_status() {
		return (EAttribute)ddsPublisherStatusConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsPublisherStatusCondition_Publisher() {
		return (EReference)ddsPublisherStatusConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsSubscriberStatusCondition() {
		return ddsSubscriberStatusConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsSubscriberStatusCondition_Enabled_status() {
		return (EAttribute)ddsSubscriberStatusConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsSubscriberStatusCondition_Subscriber() {
		return (EReference)ddsSubscriberStatusConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDataWriterStatusCondition() {
		return ddsDataWriterStatusConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDataWriterStatusCondition_Enabled_status() {
		return (EAttribute)ddsDataWriterStatusConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataWriterStatusCondition_DataWriter() {
		return (EReference)ddsDataWriterStatusConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsDataReaderStatusCondition() {
		return ddsDataReaderStatusConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsDataReaderStatusCondition_Enabled_status() {
		return (EAttribute)ddsDataReaderStatusConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsDataReaderStatusCondition_DataReader() {
		return (EReference)ddsDataReaderStatusConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsTopicStatusCondition() {
		return ddsTopicStatusConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsTopicStatusCondition_Enabled_status() {
		return (EAttribute)ddsTopicStatusConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsTopicStatusCondition_Topic() {
		return (EReference)ddsTopicStatusConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryCondition() {
		return queryConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryCondition_Query() {
		return (EAttribute)queryConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryCondition_QueryParameters() {
		return (EAttribute)queryConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuardCondition() {
		return guardConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuardCondition_Name() {
		return (EAttribute)guardConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsSystem() {
		return ddsSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsSystem_SystemName() {
		return (EAttribute)ddsSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsSystem_Hosts() {
		return (EReference)ddsSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsSystem_QosProfiles() {
		return (EReference)ddsSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsSystem_DataModules() {
		return (EReference)ddsSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsSystem_Topics() {
		return (EReference)ddsSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsHost() {
		return ddsHostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsHost_HostName() {
		return (EAttribute)ddsHostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsHost_Applications() {
		return (EReference)ddsHostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDurabilityQosPolicyKind() {
		return durabilityQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHistoryQosPolicyKind() {
		return historyQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPresentationQosPolicyAccessScopeKind() {
		return presentationQosPolicyAccessScopeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOwnershipQosPolicyKind() {
		return ownershipQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLivelinessQosPolicyKind() {
		return livelinessQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReliabilityQosPolicyKind() {
		return reliabilityQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDestinationOrderQosPolicyKind() {
		return destinationOrderQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInvalidSampleVisibilityQosPolicy() {
		return invalidSampleVisibilityQosPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getViewStateKind() {
		return viewStateKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstanceStateKind() {
		return instanceStateKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSampleStateKind() {
		return sampleStateKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDomainParticipantStatus() {
		return domainParticipantStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubscriberStatus() {
		return subscriberStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPublisherStatus() {
		return publisherStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataWriterStatus() {
		return dataWriterStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataReaderStatus() {
		return dataReaderStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTopicStatus() {
		return topicStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsMetamodelFactory getDdsMetamodelFactory() {
		return (DdsMetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ddsApplicationEClass = createEClass(DDS_APPLICATION);
		createEAttribute(ddsApplicationEClass, DDS_APPLICATION__APPLICATION_NAME);
		createEReference(ddsApplicationEClass, DDS_APPLICATION__DOMAIN_PARTICIPANTS);
		createEReference(ddsApplicationEClass, DDS_APPLICATION__WAITSET);

		ddsDomainParticipantEClass = createEClass(DDS_DOMAIN_PARTICIPANT);
		createEAttribute(ddsDomainParticipantEClass, DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_NAME);
		createEReference(ddsDomainParticipantEClass, DDS_DOMAIN_PARTICIPANT__DDSSUBSCRIBER);
		createEReference(ddsDomainParticipantEClass, DDS_DOMAIN_PARTICIPANT__DDSPUBLISHER);
		createEReference(ddsDomainParticipantEClass, DDS_DOMAIN_PARTICIPANT__DDSDOMAINPARTICIPANTQOSPROFILE);
		createEReference(ddsDomainParticipantEClass, DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_LISTENER);
		createEAttribute(ddsDomainParticipantEClass, DDS_DOMAIN_PARTICIPANT__DOMAIN_ID);

		ddsTopicEClass = createEClass(DDS_TOPIC);
		createEAttribute(ddsTopicEClass, DDS_TOPIC__TOPIC_NAME);
		createEReference(ddsTopicEClass, DDS_TOPIC__TOPIC_LISTENER);
		createEReference(ddsTopicEClass, DDS_TOPIC__TOPIC_QOS_PROFILE);
		createEReference(ddsTopicEClass, DDS_TOPIC__DDSDATASTRUCTURE);

		ddsQosProfileEClass = createEClass(DDS_QOS_PROFILE);
		createEAttribute(ddsQosProfileEClass, DDS_QOS_PROFILE__PROFILE_NAME);

		ddsSubscriberEClass = createEClass(DDS_SUBSCRIBER);
		createEAttribute(ddsSubscriberEClass, DDS_SUBSCRIBER__SUBSCRIBER_NAME);
		createEReference(ddsSubscriberEClass, DDS_SUBSCRIBER__DDSDATAREADER);
		createEReference(ddsSubscriberEClass, DDS_SUBSCRIBER__SUBSCRIBER_LISTENER);
		createEReference(ddsSubscriberEClass, DDS_SUBSCRIBER__SUBSCRIBER_QOS_PROFILE);

		ddsDataReaderEClass = createEClass(DDS_DATA_READER);
		createEAttribute(ddsDataReaderEClass, DDS_DATA_READER__DATA_READER_NAME);
		createEReference(ddsDataReaderEClass, DDS_DATA_READER__READABLE_TOPIC);
		createEReference(ddsDataReaderEClass, DDS_DATA_READER__DATA_READER_LISTENER);
		createEReference(ddsDataReaderEClass, DDS_DATA_READER__DATA_READER_QOS_PROFILE);
		createEReference(ddsDataReaderEClass, DDS_DATA_READER__CONTAINING_SUBSCRIBER);

		ddsPublisherEClass = createEClass(DDS_PUBLISHER);
		createEAttribute(ddsPublisherEClass, DDS_PUBLISHER__PUBLISHER_NAME);
		createEReference(ddsPublisherEClass, DDS_PUBLISHER__DDSDATAWRITER);
		createEReference(ddsPublisherEClass, DDS_PUBLISHER__PUBLISHER_LISTENER);
		createEReference(ddsPublisherEClass, DDS_PUBLISHER__PUBLISHER_QOS_PROFILE);

		ddsDataWriterEClass = createEClass(DDS_DATA_WRITER);
		createEAttribute(ddsDataWriterEClass, DDS_DATA_WRITER__DATA_WRITER_NAME);
		createEReference(ddsDataWriterEClass, DDS_DATA_WRITER__PUBLIABLE_TOPIC);
		createEReference(ddsDataWriterEClass, DDS_DATA_WRITER__DATA_WRITER_LISTENER);
		createEReference(ddsDataWriterEClass, DDS_DATA_WRITER__DATA_WRITER_QOS_PROFILE);

		ddsDataModuleEClass = createEClass(DDS_DATA_MODULE);
		createEAttribute(ddsDataModuleEClass, DDS_DATA_MODULE__MODULE_NAME);
		createEReference(ddsDataModuleEClass, DDS_DATA_MODULE__DATA_STRUCTURES);
		createEReference(ddsDataModuleEClass, DDS_DATA_MODULE__INNER_MODULES);
		createEReference(ddsDataModuleEClass, DDS_DATA_MODULE__CONTAINING_SYSTEM);
		createEReference(ddsDataModuleEClass, DDS_DATA_MODULE__CONTAINING_MODULE);

		ddsDataStructureEClass = createEClass(DDS_DATA_STRUCTURE);
		createEAttribute(ddsDataStructureEClass, DDS_DATA_STRUCTURE__STRUCTURE_NAME);
		createEReference(ddsDataStructureEClass, DDS_DATA_STRUCTURE__FIELDS);
		createEReference(ddsDataStructureEClass, DDS_DATA_STRUCTURE__STRUCTURED_FIELDS);
		createEReference(ddsDataStructureEClass, DDS_DATA_STRUCTURE__CONTAINER_DATA_MODULE);

		ddsDataFieldEClass = createEClass(DDS_DATA_FIELD);
		createEAttribute(ddsDataFieldEClass, DDS_DATA_FIELD__FIELD_TYPE);
		createEAttribute(ddsDataFieldEClass, DDS_DATA_FIELD__FIELD_NAME);
		createEAttribute(ddsDataFieldEClass, DDS_DATA_FIELD__IS_KEY);
		createEAttribute(ddsDataFieldEClass, DDS_DATA_FIELD__MAX_MULTIPLICITY);

		ddsDomainParticipantQosProfileEClass = createEClass(DDS_DOMAIN_PARTICIPANT_QOS_PROFILE);
		createEReference(ddsDomainParticipantQosProfileEClass, DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__USER_DATA_QOS);
		createEReference(ddsDomainParticipantQosProfileEClass, DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__ENTITY_FACTORY_QOS);

		ddsUserDataQosEClass = createEClass(DDS_USER_DATA_QOS);
		createEAttribute(ddsUserDataQosEClass, DDS_USER_DATA_QOS__VALUE);

		ddsEntityFactoryQosEClass = createEClass(DDS_ENTITY_FACTORY_QOS);
		createEAttribute(ddsEntityFactoryQosEClass, DDS_ENTITY_FACTORY_QOS__AUTOENABLE_CREATED_ENTITIES);

		ddsTopicQosProfileEClass = createEClass(DDS_TOPIC_QOS_PROFILE);
		createEReference(ddsTopicQosProfileEClass, DDS_TOPIC_QOS_PROFILE__TOPIC_DATA_QOS);
		createEReference(ddsTopicQosProfileEClass, DDS_TOPIC_QOS_PROFILE__DURABILITY_QOS);
		createEReference(ddsTopicQosProfileEClass, DDS_TOPIC_QOS_PROFILE__DURABILITY_SERVICE_QOS);
		createEReference(ddsTopicQosProfileEClass, DDS_TOPIC_QOS_PROFILE__LATENCY_BUDGET_QOS);
		createEReference(ddsTopicQosProfileEClass, DDS_TOPIC_QOS_PROFILE__LIVELINESS_QOS);
		createEReference(ddsTopicQosProfileEClass, DDS_TOPIC_QOS_PROFILE__OWNERSHIP_QOS);
		createEReference(ddsTopicQosProfileEClass, DDS_TOPIC_QOS_PROFILE__RELIABILITY_QOS);
		createEReference(ddsTopicQosProfileEClass, DDS_TOPIC_QOS_PROFILE__DESTINATION_ORDER_QOS);
		createEReference(ddsTopicQosProfileEClass, DDS_TOPIC_QOS_PROFILE__HISTORY_QOS);
		createEReference(ddsTopicQosProfileEClass, DDS_TOPIC_QOS_PROFILE__RESOURCE_LIMITS_QOS);
		createEReference(ddsTopicQosProfileEClass, DDS_TOPIC_QOS_PROFILE__TRANSPORT_PRIORITY_QOS);
		createEReference(ddsTopicQosProfileEClass, DDS_TOPIC_QOS_PROFILE__LIFESPAN_QOS);
		createEReference(ddsTopicQosProfileEClass, DDS_TOPIC_QOS_PROFILE__DEADLINE_QOS);

		ddsTopicDataQosEClass = createEClass(DDS_TOPIC_DATA_QOS);
		createEAttribute(ddsTopicDataQosEClass, DDS_TOPIC_DATA_QOS__VALUE);

		ddsDurabilityQosEClass = createEClass(DDS_DURABILITY_QOS);
		createEAttribute(ddsDurabilityQosEClass, DDS_DURABILITY_QOS__KIND);

		ddsDurabilityServiceQosEClass = createEClass(DDS_DURABILITY_SERVICE_QOS);
		createEReference(ddsDurabilityServiceQosEClass, DDS_DURABILITY_SERVICE_QOS__SERVICE_CLEANUP_DELAY);
		createEAttribute(ddsDurabilityServiceQosEClass, DDS_DURABILITY_SERVICE_QOS__HISTORY_KIND);
		createEAttribute(ddsDurabilityServiceQosEClass, DDS_DURABILITY_SERVICE_QOS__HISTORY_DEPTH);
		createEAttribute(ddsDurabilityServiceQosEClass, DDS_DURABILITY_SERVICE_QOS__MAX_SAMPLES);
		createEAttribute(ddsDurabilityServiceQosEClass, DDS_DURABILITY_SERVICE_QOS__MAX_INSTANCES);
		createEAttribute(ddsDurabilityServiceQosEClass, DDS_DURABILITY_SERVICE_QOS__MAX_SAMPLES_PER_INSTANCES);

		ddsDurationEClass = createEClass(DDS_DURATION);
		createEAttribute(ddsDurationEClass, DDS_DURATION__SEC);
		createEAttribute(ddsDurationEClass, DDS_DURATION__NANO_SEC);

		ddsPresentationQosEClass = createEClass(DDS_PRESENTATION_QOS);
		createEAttribute(ddsPresentationQosEClass, DDS_PRESENTATION_QOS__ACCESS_SCOPE);
		createEAttribute(ddsPresentationQosEClass, DDS_PRESENTATION_QOS__COHERENT_ACCESS);
		createEAttribute(ddsPresentationQosEClass, DDS_PRESENTATION_QOS__ORDERED_ACCESS);

		ddsDeadlineQosEClass = createEClass(DDS_DEADLINE_QOS);
		createEReference(ddsDeadlineQosEClass, DDS_DEADLINE_QOS__PERIOD);

		ddsLatencyBudgetQosEClass = createEClass(DDS_LATENCY_BUDGET_QOS);
		createEReference(ddsLatencyBudgetQosEClass, DDS_LATENCY_BUDGET_QOS__DURATION);

		ddsOwnershipQosEClass = createEClass(DDS_OWNERSHIP_QOS);
		createEAttribute(ddsOwnershipQosEClass, DDS_OWNERSHIP_QOS__KIND);

		ddsOwnershipStrengthQosEClass = createEClass(DDS_OWNERSHIP_STRENGTH_QOS);
		createEAttribute(ddsOwnershipStrengthQosEClass, DDS_OWNERSHIP_STRENGTH_QOS__VALUE);

		ddsLivelinessQosEClass = createEClass(DDS_LIVELINESS_QOS);
		createEAttribute(ddsLivelinessQosEClass, DDS_LIVELINESS_QOS__KIND);
		createEReference(ddsLivelinessQosEClass, DDS_LIVELINESS_QOS__LEASE_DURATION);

		ddsTimeBasedFilterQosEClass = createEClass(DDS_TIME_BASED_FILTER_QOS);
		createEReference(ddsTimeBasedFilterQosEClass, DDS_TIME_BASED_FILTER_QOS__MINIMUM_SEPARATION);

		ddsPartitionQosEClass = createEClass(DDS_PARTITION_QOS);
		createEAttribute(ddsPartitionQosEClass, DDS_PARTITION_QOS__NAME);

		ddsReliabilityQosEClass = createEClass(DDS_RELIABILITY_QOS);
		createEAttribute(ddsReliabilityQosEClass, DDS_RELIABILITY_QOS__KIND);
		createEReference(ddsReliabilityQosEClass, DDS_RELIABILITY_QOS__MAX_BLOCKING_TIME);

		ddsTransportPriorityQosEClass = createEClass(DDS_TRANSPORT_PRIORITY_QOS);
		createEAttribute(ddsTransportPriorityQosEClass, DDS_TRANSPORT_PRIORITY_QOS__VALUE);

		ddsLifespanEClass = createEClass(DDS_LIFESPAN);
		createEReference(ddsLifespanEClass, DDS_LIFESPAN__DURATION);

		ddsHistoryQosEClass = createEClass(DDS_HISTORY_QOS);
		createEAttribute(ddsHistoryQosEClass, DDS_HISTORY_QOS__KIND);
		createEAttribute(ddsHistoryQosEClass, DDS_HISTORY_QOS__DEPTH);

		ddsResourceLimitsEClass = createEClass(DDS_RESOURCE_LIMITS);
		createEAttribute(ddsResourceLimitsEClass, DDS_RESOURCE_LIMITS__MAX_SAMPLES);
		createEAttribute(ddsResourceLimitsEClass, DDS_RESOURCE_LIMITS__MAX_INSTANCES);
		createEAttribute(ddsResourceLimitsEClass, DDS_RESOURCE_LIMITS__MAX_SAMPLES_PER_INSTANCES);

		ddsDataWriterLifecycleQosEClass = createEClass(DDS_DATA_WRITER_LIFECYCLE_QOS);
		createEAttribute(ddsDataWriterLifecycleQosEClass, DDS_DATA_WRITER_LIFECYCLE_QOS__AUTODISPOSE_UNREGISTERED_INSTANCES);
		createEReference(ddsDataWriterLifecycleQosEClass, DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOPURGE_SUSPENDED_SAMPLES_DELAY);
		createEReference(ddsDataWriterLifecycleQosEClass, DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOUNREGISTER_INSTANCE_DELAY);

		ddsDataReaderLifecycleQosEClass = createEClass(DDS_DATA_READER_LIFECYCLE_QOS);
		createEReference(ddsDataReaderLifecycleQosEClass, DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_NOWRITERS_SAMPLES_DELAY);
		createEReference(ddsDataReaderLifecycleQosEClass, DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSED_SAMPLES_DELAY);
		createEAttribute(ddsDataReaderLifecycleQosEClass, DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSE_ALL);
		createEAttribute(ddsDataReaderLifecycleQosEClass, DDS_DATA_READER_LIFECYCLE_QOS__ENABLE_INVALID_SAMPLES);

		ddsDestinationOrderQosEClass = createEClass(DDS_DESTINATION_ORDER_QOS);
		createEAttribute(ddsDestinationOrderQosEClass, DDS_DESTINATION_ORDER_QOS__KIND);

		ddsPublisherQosProfileEClass = createEClass(DDS_PUBLISHER_QOS_PROFILE);
		createEReference(ddsPublisherQosProfileEClass, DDS_PUBLISHER_QOS_PROFILE__GROUP_DATA_QOS);
		createEReference(ddsPublisherQosProfileEClass, DDS_PUBLISHER_QOS_PROFILE__ENTITY_FACTORY_QOS);
		createEReference(ddsPublisherQosProfileEClass, DDS_PUBLISHER_QOS_PROFILE__PRESENTATION_QOS);
		createEReference(ddsPublisherQosProfileEClass, DDS_PUBLISHER_QOS_PROFILE__PARTITION_QOS);

		ddsGroupDataQosEClass = createEClass(DDS_GROUP_DATA_QOS);
		createEAttribute(ddsGroupDataQosEClass, DDS_GROUP_DATA_QOS__VALUE);

		ddsDataWriterQosProfileEClass = createEClass(DDS_DATA_WRITER_QOS_PROFILE);
		createEReference(ddsDataWriterQosProfileEClass, DDS_DATA_WRITER_QOS_PROFILE__USER_DATA_QOS);
		createEReference(ddsDataWriterQosProfileEClass, DDS_DATA_WRITER_QOS_PROFILE__DURABILITY_QOS);
		createEReference(ddsDataWriterQosProfileEClass, DDS_DATA_WRITER_QOS_PROFILE__DEADLINE_QOS);
		createEReference(ddsDataWriterQosProfileEClass, DDS_DATA_WRITER_QOS_PROFILE__LATENCY_BUDGET_QOS);
		createEReference(ddsDataWriterQosProfileEClass, DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_QOS);
		createEReference(ddsDataWriterQosProfileEClass, DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_STRENGTH);
		createEReference(ddsDataWriterQosProfileEClass, DDS_DATA_WRITER_QOS_PROFILE__LIVELINESS_QOS);
		createEReference(ddsDataWriterQosProfileEClass, DDS_DATA_WRITER_QOS_PROFILE__RELIABILITY_QOS);
		createEReference(ddsDataWriterQosProfileEClass, DDS_DATA_WRITER_QOS_PROFILE__TRANSPORT_PRIORITY_QOS);
		createEReference(ddsDataWriterQosProfileEClass, DDS_DATA_WRITER_QOS_PROFILE__LIFESPAN_QOS);
		createEReference(ddsDataWriterQosProfileEClass, DDS_DATA_WRITER_QOS_PROFILE__DESTINATION_ORDER_QOS);
		createEReference(ddsDataWriterQosProfileEClass, DDS_DATA_WRITER_QOS_PROFILE__HISTORY_QOS);
		createEReference(ddsDataWriterQosProfileEClass, DDS_DATA_WRITER_QOS_PROFILE__RESOURCE_LIMITS_QOS);
		createEReference(ddsDataWriterQosProfileEClass, DDS_DATA_WRITER_QOS_PROFILE__DATA_WRITER_LIFECYCLE_QOS);

		ddsSubscriberQosProfileEClass = createEClass(DDS_SUBSCRIBER_QOS_PROFILE);
		createEReference(ddsSubscriberQosProfileEClass, DDS_SUBSCRIBER_QOS_PROFILE__GROUP_DATA_QOS);
		createEReference(ddsSubscriberQosProfileEClass, DDS_SUBSCRIBER_QOS_PROFILE__ENTITY_FACTORY_QOS);
		createEReference(ddsSubscriberQosProfileEClass, DDS_SUBSCRIBER_QOS_PROFILE__PRESENTATION_QOS);
		createEReference(ddsSubscriberQosProfileEClass, DDS_SUBSCRIBER_QOS_PROFILE__PARTITION_QOS);

		ddsDataReaderQosProfileEClass = createEClass(DDS_DATA_READER_QOS_PROFILE);
		createEReference(ddsDataReaderQosProfileEClass, DDS_DATA_READER_QOS_PROFILE__USER_DATA_QOS);
		createEReference(ddsDataReaderQosProfileEClass, DDS_DATA_READER_QOS_PROFILE__DURABILITY_QOS);
		createEReference(ddsDataReaderQosProfileEClass, DDS_DATA_READER_QOS_PROFILE__DEADLINE_QOS);
		createEReference(ddsDataReaderQosProfileEClass, DDS_DATA_READER_QOS_PROFILE__LATENCY_BUDGET_QOS);
		createEReference(ddsDataReaderQosProfileEClass, DDS_DATA_READER_QOS_PROFILE__LIVELINESS_QOS);
		createEReference(ddsDataReaderQosProfileEClass, DDS_DATA_READER_QOS_PROFILE__OWNERSHIP_QOS);
		createEReference(ddsDataReaderQosProfileEClass, DDS_DATA_READER_QOS_PROFILE__TIME_BASED_FILTER_QOS);
		createEReference(ddsDataReaderQosProfileEClass, DDS_DATA_READER_QOS_PROFILE__RELIABILITY_QOS);
		createEReference(ddsDataReaderQosProfileEClass, DDS_DATA_READER_QOS_PROFILE__DESTINATION_ORDER_QOS);
		createEReference(ddsDataReaderQosProfileEClass, DDS_DATA_READER_QOS_PROFILE__HISTORY_QOS);
		createEReference(ddsDataReaderQosProfileEClass, DDS_DATA_READER_QOS_PROFILE__RESOURCE_LIMITS_QOS);
		createEReference(ddsDataReaderQosProfileEClass, DDS_DATA_READER_QOS_PROFILE__DATA_READER_LIFECYCLE_QOS);

		ddsDomainParticipantListenerEClass = createEClass(DDS_DOMAIN_PARTICIPANT_LISTENER);
		createEAttribute(ddsDomainParticipantListenerEClass, DDS_DOMAIN_PARTICIPANT_LISTENER__NAME);
		createEAttribute(ddsDomainParticipantListenerEClass, DDS_DOMAIN_PARTICIPANT_LISTENER__LISTENED_STATUS);

		ddsSubscriberListenerEClass = createEClass(DDS_SUBSCRIBER_LISTENER);
		createEAttribute(ddsSubscriberListenerEClass, DDS_SUBSCRIBER_LISTENER__NAME);
		createEAttribute(ddsSubscriberListenerEClass, DDS_SUBSCRIBER_LISTENER__LISTENED_STATUS);

		ddsPublisherListenerEClass = createEClass(DDS_PUBLISHER_LISTENER);
		createEAttribute(ddsPublisherListenerEClass, DDS_PUBLISHER_LISTENER__NAME);
		createEAttribute(ddsPublisherListenerEClass, DDS_PUBLISHER_LISTENER__LISTENED_STATUS);

		ddsDataReaderListenerEClass = createEClass(DDS_DATA_READER_LISTENER);
		createEAttribute(ddsDataReaderListenerEClass, DDS_DATA_READER_LISTENER__NAME);
		createEAttribute(ddsDataReaderListenerEClass, DDS_DATA_READER_LISTENER__LISTENED_STATUS);

		ddsDataWriterListenerEClass = createEClass(DDS_DATA_WRITER_LISTENER);
		createEAttribute(ddsDataWriterListenerEClass, DDS_DATA_WRITER_LISTENER__NAME);
		createEAttribute(ddsDataWriterListenerEClass, DDS_DATA_WRITER_LISTENER__LISTENED_STATUS);

		ddsTopicListenerEClass = createEClass(DDS_TOPIC_LISTENER);
		createEAttribute(ddsTopicListenerEClass, DDS_TOPIC_LISTENER__NAME);
		createEAttribute(ddsTopicListenerEClass, DDS_TOPIC_LISTENER__LISTENED_STATUS);

		ddsWaitSetEClass = createEClass(DDS_WAIT_SET);
		createEAttribute(ddsWaitSetEClass, DDS_WAIT_SET__NAME);
		createEReference(ddsWaitSetEClass, DDS_WAIT_SET__READ_CONDITIONS);
		createEReference(ddsWaitSetEClass, DDS_WAIT_SET__STATUS_CONDITIONS);
		createEReference(ddsWaitSetEClass, DDS_WAIT_SET__GUARD_CONDITIONS);

		ddsReadConditionEClass = createEClass(DDS_READ_CONDITION);
		createEAttribute(ddsReadConditionEClass, DDS_READ_CONDITION__VIEW_STATE_MASK);
		createEAttribute(ddsReadConditionEClass, DDS_READ_CONDITION__INSTANCE_STATE_MASK);
		createEAttribute(ddsReadConditionEClass, DDS_READ_CONDITION__SAMPLE_STATE_MASK);
		createEReference(ddsReadConditionEClass, DDS_READ_CONDITION__DATA_READER);

		ddsStructuredFieldEClass = createEClass(DDS_STRUCTURED_FIELD);
		createEAttribute(ddsStructuredFieldEClass, DDS_STRUCTURED_FIELD__IS_KEY);
		createEReference(ddsStructuredFieldEClass, DDS_STRUCTURED_FIELD__REFERENCED_TYPE);
		createEReference(ddsStructuredFieldEClass, DDS_STRUCTURED_FIELD__DATA_STRUCTURE);
		createEAttribute(ddsStructuredFieldEClass, DDS_STRUCTURED_FIELD__FIELD_NAME);
		createEAttribute(ddsStructuredFieldEClass, DDS_STRUCTURED_FIELD__MAX_MULTIPLICITY);

		ddsStatusConditionEClass = createEClass(DDS_STATUS_CONDITION);
		createEReference(ddsStatusConditionEClass, DDS_STATUS_CONDITION__CONTAINING_WAITSET);

		ddsDomainParticipantStatusConditionEClass = createEClass(DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION);
		createEAttribute(ddsDomainParticipantStatusConditionEClass, DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION__ENABLED_STATUS);
		createEReference(ddsDomainParticipantStatusConditionEClass, DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION__DOMAIN_PARTICIPANT);

		ddsPublisherStatusConditionEClass = createEClass(DDS_PUBLISHER_STATUS_CONDITION);
		createEAttribute(ddsPublisherStatusConditionEClass, DDS_PUBLISHER_STATUS_CONDITION__ENABLED_STATUS);
		createEReference(ddsPublisherStatusConditionEClass, DDS_PUBLISHER_STATUS_CONDITION__PUBLISHER);

		ddsSubscriberStatusConditionEClass = createEClass(DDS_SUBSCRIBER_STATUS_CONDITION);
		createEAttribute(ddsSubscriberStatusConditionEClass, DDS_SUBSCRIBER_STATUS_CONDITION__ENABLED_STATUS);
		createEReference(ddsSubscriberStatusConditionEClass, DDS_SUBSCRIBER_STATUS_CONDITION__SUBSCRIBER);

		ddsDataWriterStatusConditionEClass = createEClass(DDS_DATA_WRITER_STATUS_CONDITION);
		createEAttribute(ddsDataWriterStatusConditionEClass, DDS_DATA_WRITER_STATUS_CONDITION__ENABLED_STATUS);
		createEReference(ddsDataWriterStatusConditionEClass, DDS_DATA_WRITER_STATUS_CONDITION__DATA_WRITER);

		ddsDataReaderStatusConditionEClass = createEClass(DDS_DATA_READER_STATUS_CONDITION);
		createEAttribute(ddsDataReaderStatusConditionEClass, DDS_DATA_READER_STATUS_CONDITION__ENABLED_STATUS);
		createEReference(ddsDataReaderStatusConditionEClass, DDS_DATA_READER_STATUS_CONDITION__DATA_READER);

		ddsTopicStatusConditionEClass = createEClass(DDS_TOPIC_STATUS_CONDITION);
		createEAttribute(ddsTopicStatusConditionEClass, DDS_TOPIC_STATUS_CONDITION__ENABLED_STATUS);
		createEReference(ddsTopicStatusConditionEClass, DDS_TOPIC_STATUS_CONDITION__TOPIC);

		queryConditionEClass = createEClass(QUERY_CONDITION);
		createEAttribute(queryConditionEClass, QUERY_CONDITION__QUERY);
		createEAttribute(queryConditionEClass, QUERY_CONDITION__QUERY_PARAMETERS);

		guardConditionEClass = createEClass(GUARD_CONDITION);
		createEAttribute(guardConditionEClass, GUARD_CONDITION__NAME);

		ddsSystemEClass = createEClass(DDS_SYSTEM);
		createEAttribute(ddsSystemEClass, DDS_SYSTEM__SYSTEM_NAME);
		createEReference(ddsSystemEClass, DDS_SYSTEM__HOSTS);
		createEReference(ddsSystemEClass, DDS_SYSTEM__QOS_PROFILES);
		createEReference(ddsSystemEClass, DDS_SYSTEM__DATA_MODULES);
		createEReference(ddsSystemEClass, DDS_SYSTEM__TOPICS);

		ddsHostEClass = createEClass(DDS_HOST);
		createEAttribute(ddsHostEClass, DDS_HOST__HOST_NAME);
		createEReference(ddsHostEClass, DDS_HOST__APPLICATIONS);

		// Create enums
		durabilityQosPolicyKindEEnum = createEEnum(DURABILITY_QOS_POLICY_KIND);
		historyQosPolicyKindEEnum = createEEnum(HISTORY_QOS_POLICY_KIND);
		presentationQosPolicyAccessScopeKindEEnum = createEEnum(PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND);
		ownershipQosPolicyKindEEnum = createEEnum(OWNERSHIP_QOS_POLICY_KIND);
		livelinessQosPolicyKindEEnum = createEEnum(LIVELINESS_QOS_POLICY_KIND);
		reliabilityQosPolicyKindEEnum = createEEnum(RELIABILITY_QOS_POLICY_KIND);
		destinationOrderQosPolicyKindEEnum = createEEnum(DESTINATION_ORDER_QOS_POLICY_KIND);
		invalidSampleVisibilityQosPolicyEEnum = createEEnum(INVALID_SAMPLE_VISIBILITY_QOS_POLICY);
		viewStateKindEEnum = createEEnum(VIEW_STATE_KIND);
		instanceStateKindEEnum = createEEnum(INSTANCE_STATE_KIND);
		sampleStateKindEEnum = createEEnum(SAMPLE_STATE_KIND);
		domainParticipantStatusEEnum = createEEnum(DOMAIN_PARTICIPANT_STATUS);
		subscriberStatusEEnum = createEEnum(SUBSCRIBER_STATUS);
		publisherStatusEEnum = createEEnum(PUBLISHER_STATUS);
		dataWriterStatusEEnum = createEEnum(DATA_WRITER_STATUS);
		dataReaderStatusEEnum = createEEnum(DATA_READER_STATUS);
		topicStatusEEnum = createEEnum(TOPIC_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ddsDomainParticipantQosProfileEClass.getESuperTypes().add(this.getDdsQosProfile());
		ddsTopicQosProfileEClass.getESuperTypes().add(this.getDdsQosProfile());
		ddsPublisherQosProfileEClass.getESuperTypes().add(this.getDdsQosProfile());
		ddsDataWriterQosProfileEClass.getESuperTypes().add(this.getDdsQosProfile());
		ddsSubscriberQosProfileEClass.getESuperTypes().add(this.getDdsQosProfile());
		ddsDataReaderQosProfileEClass.getESuperTypes().add(this.getDdsQosProfile());
		ddsDomainParticipantStatusConditionEClass.getESuperTypes().add(this.getDdsStatusCondition());
		ddsPublisherStatusConditionEClass.getESuperTypes().add(this.getDdsStatusCondition());
		ddsSubscriberStatusConditionEClass.getESuperTypes().add(this.getDdsStatusCondition());
		ddsDataWriterStatusConditionEClass.getESuperTypes().add(this.getDdsStatusCondition());
		ddsDataReaderStatusConditionEClass.getESuperTypes().add(this.getDdsStatusCondition());
		ddsTopicStatusConditionEClass.getESuperTypes().add(this.getDdsStatusCondition());
		queryConditionEClass.getESuperTypes().add(this.getDdsReadCondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(ddsApplicationEClass, DdsApplication.class, "DdsApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsApplication_ApplicationName(), ecorePackage.getEString(), "applicationName", null, 0, 1, DdsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsApplication_DomainParticipants(), this.getDdsDomainParticipant(), null, "domainParticipants", null, 0, -1, DdsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsApplication_Waitset(), this.getDdsWaitSet(), null, "waitset", null, 0, 1, DdsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDomainParticipantEClass, DdsDomainParticipant.class, "DdsDomainParticipant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsDomainParticipant_DomainParticipantName(), ecorePackage.getEString(), "domainParticipantName", null, 0, 1, DdsDomainParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDomainParticipant_Ddssubscriber(), this.getDdsSubscriber(), null, "ddssubscriber", null, 0, -1, DdsDomainParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDomainParticipant_Ddspublisher(), this.getDdsPublisher(), null, "ddspublisher", null, 0, -1, DdsDomainParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDomainParticipant_Ddsdomainparticipantqosprofile(), this.getDdsDomainParticipantQosProfile(), null, "ddsdomainparticipantqosprofile", null, 0, 1, DdsDomainParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDomainParticipant_DomainParticipantListener(), this.getDdsDomainParticipantListener(), null, "domainParticipantListener", null, 0, 1, DdsDomainParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsDomainParticipant_DomainId(), ecorePackage.getEInt(), "domainId", null, 0, 1, DdsDomainParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsTopicEClass, DdsTopic.class, "DdsTopic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsTopic_TopicName(), ecorePackage.getEString(), "topicName", null, 0, 1, DdsTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsTopic_TopicListener(), this.getDdsTopicListener(), null, "topicListener", null, 0, 1, DdsTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsTopic_TopicQosProfile(), this.getDdsTopicQosProfile(), null, "topicQosProfile", null, 0, 1, DdsTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsTopic_Ddsdatastructure(), this.getDdsDataStructure(), null, "ddsdatastructure", null, 0, 1, DdsTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsQosProfileEClass, DdsQosProfile.class, "DdsQosProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsQosProfile_ProfileName(), ecorePackage.getEString(), "profileName", null, 0, 1, DdsQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsSubscriberEClass, DdsSubscriber.class, "DdsSubscriber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsSubscriber_SubscriberName(), ecorePackage.getEString(), "subscriberName", null, 0, 1, DdsSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsSubscriber_Ddsdatareader(), this.getDdsDataReader(), this.getDdsDataReader_ContainingSubscriber(), "ddsdatareader", null, 0, -1, DdsSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsSubscriber_SubscriberListener(), this.getDdsSubscriberListener(), null, "subscriberListener", null, 0, 1, DdsSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsSubscriber_SubscriberQosProfile(), this.getDdsSubscriberQosProfile(), null, "subscriberQosProfile", null, 0, 1, DdsSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDataReaderEClass, DdsDataReader.class, "DdsDataReader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsDataReader_DataReaderName(), ecorePackage.getEString(), "dataReaderName", null, 0, 1, DdsDataReader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataReader_ReadableTopic(), this.getDdsTopic(), null, "readableTopic", null, 1, 1, DdsDataReader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataReader_DataReaderListener(), this.getDdsDataReaderListener(), null, "dataReaderListener", null, 0, 1, DdsDataReader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataReader_DataReaderQosProfile(), this.getDdsDataReaderQosProfile(), null, "dataReaderQosProfile", null, 0, 1, DdsDataReader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataReader_ContainingSubscriber(), this.getDdsSubscriber(), this.getDdsSubscriber_Ddsdatareader(), "containingSubscriber", null, 1, 1, DdsDataReader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsPublisherEClass, DdsPublisher.class, "DdsPublisher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsPublisher_PublisherName(), ecorePackage.getEString(), "publisherName", null, 0, 1, DdsPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsPublisher_Ddsdatawriter(), this.getDdsDataWriter(), null, "ddsdatawriter", null, 0, -1, DdsPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsPublisher_PublisherListener(), this.getDdsPublisherListener(), null, "publisherListener", null, 0, 1, DdsPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsPublisher_PublisherQosProfile(), this.getDdsPublisherQosProfile(), null, "publisherQosProfile", null, 0, 1, DdsPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDataWriterEClass, DdsDataWriter.class, "DdsDataWriter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsDataWriter_DataWriterName(), ecorePackage.getEString(), "dataWriterName", null, 0, 1, DdsDataWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriter_PubliableTopic(), this.getDdsTopic(), null, "publiableTopic", null, 1, 1, DdsDataWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriter_DataWriterListener(), this.getDdsDataWriterListener(), null, "dataWriterListener", null, 0, 1, DdsDataWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriter_DataWriterQosProfile(), this.getDdsDataWriterQosProfile(), null, "dataWriterQosProfile", null, 0, 1, DdsDataWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDataModuleEClass, DdsDataModule.class, "DdsDataModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsDataModule_ModuleName(), ecorePackage.getEString(), "moduleName", null, 0, 1, DdsDataModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataModule_DataStructures(), this.getDdsDataStructure(), this.getDdsDataStructure_ContainerDataModule(), "dataStructures", null, 0, -1, DdsDataModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataModule_InnerModules(), this.getDdsDataModule(), this.getDdsDataModule_ContainingModule(), "innerModules", null, 0, -1, DdsDataModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataModule_ContainingSystem(), this.getDdsSystem(), this.getDdsSystem_DataModules(), "containingSystem", null, 0, 1, DdsDataModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataModule_ContainingModule(), this.getDdsDataModule(), this.getDdsDataModule_InnerModules(), "containingModule", null, 0, 1, DdsDataModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDataStructureEClass, DdsDataStructure.class, "DdsDataStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsDataStructure_StructureName(), ecorePackage.getEString(), "structureName", null, 0, 1, DdsDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataStructure_Fields(), this.getDdsDataField(), null, "fields", null, 0, -1, DdsDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataStructure_StructuredFields(), this.getDdsStructuredField(), this.getDdsStructuredField_DataStructure(), "structuredFields", null, 0, -1, DdsDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataStructure_ContainerDataModule(), this.getDdsDataModule(), this.getDdsDataModule_DataStructures(), "containerDataModule", null, 0, 1, DdsDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDataFieldEClass, DdsDataField.class, "DdsDataField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsDataField_FieldType(), ecorePackage.getEString(), "fieldType", null, 0, 1, DdsDataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsDataField_FieldName(), ecorePackage.getEString(), "fieldName", null, 0, 1, DdsDataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsDataField_IsKey(), ecorePackage.getEBoolean(), "isKey", null, 0, 1, DdsDataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsDataField_MaxMultiplicity(), ecorePackage.getEInt(), "maxMultiplicity", null, 1, 1, DdsDataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDomainParticipantQosProfileEClass, DdsDomainParticipantQosProfile.class, "DdsDomainParticipantQosProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsDomainParticipantQosProfile_UserDataQos(), this.getDdsUserDataQos(), null, "userDataQos", null, 0, 1, DdsDomainParticipantQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDomainParticipantQosProfile_EntityFactoryQos(), this.getDdsEntityFactoryQos(), null, "entityFactoryQos", null, 0, 1, DdsDomainParticipantQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsUserDataQosEClass, DdsUserDataQos.class, "DdsUserDataQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsUserDataQos_Value(), ecorePackage.getEString(), "value", null, 0, 1, DdsUserDataQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsEntityFactoryQosEClass, DdsEntityFactoryQos.class, "DdsEntityFactoryQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsEntityFactoryQos_Autoenable_created_entities(), ecorePackage.getEBoolean(), "autoenable_created_entities", "true", 0, 1, DdsEntityFactoryQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsTopicQosProfileEClass, DdsTopicQosProfile.class, "DdsTopicQosProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsTopicQosProfile_TopicDataQos(), this.getDdsTopicDataQos(), null, "topicDataQos", null, 0, 1, DdsTopicQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsTopicQosProfile_DurabilityQos(), this.getDdsDurabilityQos(), null, "durabilityQos", null, 0, 1, DdsTopicQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsTopicQosProfile_DurabilityServiceQos(), this.getDdsDurabilityServiceQos(), null, "durabilityServiceQos", null, 0, 1, DdsTopicQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsTopicQosProfile_LatencyBudgetQos(), this.getDdsLatencyBudgetQos(), null, "latencyBudgetQos", null, 0, 1, DdsTopicQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsTopicQosProfile_LivelinessQos(), this.getDdsLivelinessQos(), null, "livelinessQos", null, 0, 1, DdsTopicQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsTopicQosProfile_OwnershipQos(), this.getDdsOwnershipQos(), null, "ownershipQos", null, 0, 1, DdsTopicQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsTopicQosProfile_ReliabilityQos(), this.getDdsReliabilityQos(), null, "reliabilityQos", null, 0, 1, DdsTopicQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsTopicQosProfile_DestinationOrderQos(), this.getDdsDestinationOrderQos(), null, "destinationOrderQos", null, 0, 1, DdsTopicQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsTopicQosProfile_HistoryQos(), this.getDdsHistoryQos(), null, "historyQos", null, 0, 1, DdsTopicQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsTopicQosProfile_ResourceLimitsQos(), this.getDdsResourceLimits(), null, "resourceLimitsQos", null, 0, 1, DdsTopicQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsTopicQosProfile_TransportPriorityQos(), this.getDdsTransportPriorityQos(), null, "transportPriorityQos", null, 0, 1, DdsTopicQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsTopicQosProfile_LifespanQos(), this.getDdsLifespan(), null, "lifespanQos", null, 0, 1, DdsTopicQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsTopicQosProfile_DeadlineQos(), this.getDdsDeadlineQos(), null, "deadlineQos", null, 0, 1, DdsTopicQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsTopicDataQosEClass, DdsTopicDataQos.class, "DdsTopicDataQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsTopicDataQos_Value(), ecorePackage.getEString(), "value", null, 0, 1, DdsTopicDataQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDurabilityQosEClass, DdsDurabilityQos.class, "DdsDurabilityQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsDurabilityQos_Kind(), this.getDurabilityQosPolicyKind(), "kind", null, 0, 1, DdsDurabilityQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDurabilityServiceQosEClass, DdsDurabilityServiceQos.class, "DdsDurabilityServiceQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsDurabilityServiceQos_Service_cleanup_delay(), this.getDdsDuration(), null, "service_cleanup_delay", null, 0, 1, DdsDurabilityServiceQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsDurabilityServiceQos_History_kind(), this.getHistoryQosPolicyKind(), "history_kind", null, 0, 1, DdsDurabilityServiceQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsDurabilityServiceQos_History_depth(), ecorePackage.getELong(), "history_depth", null, 0, 1, DdsDurabilityServiceQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsDurabilityServiceQos_Max_samples(), ecorePackage.getELong(), "max_samples", null, 0, 1, DdsDurabilityServiceQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsDurabilityServiceQos_Max_instances(), ecorePackage.getELong(), "max_instances", null, 0, 1, DdsDurabilityServiceQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsDurabilityServiceQos_Max_samples_per_instances(), ecorePackage.getELong(), "max_samples_per_instances", null, 0, 1, DdsDurabilityServiceQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDurationEClass, DdsDuration.class, "DdsDuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsDuration_Sec(), ecorePackage.getELong(), "sec", null, 0, 1, DdsDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsDuration_NanoSec(), ecorePackage.getELong(), "nanoSec", null, 0, 1, DdsDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsPresentationQosEClass, DdsPresentationQos.class, "DdsPresentationQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsPresentationQos_Access_scope(), this.getPresentationQosPolicyAccessScopeKind(), "access_scope", null, 0, 1, DdsPresentationQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsPresentationQos_Coherent_access(), ecorePackage.getEBoolean(), "coherent_access", null, 0, 1, DdsPresentationQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsPresentationQos_Ordered_access(), ecorePackage.getEBoolean(), "ordered_access", null, 0, 1, DdsPresentationQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDeadlineQosEClass, DdsDeadlineQos.class, "DdsDeadlineQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsDeadlineQos_Period(), this.getDdsDuration(), null, "period", null, 0, 1, DdsDeadlineQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsLatencyBudgetQosEClass, DdsLatencyBudgetQos.class, "DdsLatencyBudgetQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsLatencyBudgetQos_Duration(), this.getDdsDuration(), null, "duration", null, 0, 1, DdsLatencyBudgetQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsOwnershipQosEClass, DdsOwnershipQos.class, "DdsOwnershipQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsOwnershipQos_Kind(), this.getOwnershipQosPolicyKind(), "kind", null, 0, 1, DdsOwnershipQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsOwnershipStrengthQosEClass, DdsOwnershipStrengthQos.class, "DdsOwnershipStrengthQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsOwnershipStrengthQos_Value(), ecorePackage.getELong(), "value", null, 0, 1, DdsOwnershipStrengthQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsLivelinessQosEClass, DdsLivelinessQos.class, "DdsLivelinessQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsLivelinessQos_Kind(), this.getLivelinessQosPolicyKind(), "kind", null, 0, 1, DdsLivelinessQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsLivelinessQos_Lease_duration(), this.getDdsDuration(), null, "lease_duration", null, 0, 1, DdsLivelinessQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsTimeBasedFilterQosEClass, DdsTimeBasedFilterQos.class, "DdsTimeBasedFilterQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsTimeBasedFilterQos_Minimum_separation(), this.getDdsDuration(), null, "minimum_separation", null, 0, 1, DdsTimeBasedFilterQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsPartitionQosEClass, DdsPartitionQos.class, "DdsPartitionQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsPartitionQos_Name(), ecorePackage.getEString(), "name", null, 1, -1, DdsPartitionQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsReliabilityQosEClass, DdsReliabilityQos.class, "DdsReliabilityQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsReliabilityQos_Kind(), this.getReliabilityQosPolicyKind(), "kind", "BEST_EFFORT", 0, 1, DdsReliabilityQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsReliabilityQos_Max_blocking_time(), this.getDdsDuration(), null, "max_blocking_time", null, 0, 1, DdsReliabilityQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsTransportPriorityQosEClass, DdsTransportPriorityQos.class, "DdsTransportPriorityQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsTransportPriorityQos_Value(), ecorePackage.getELong(), "value", null, 0, 1, DdsTransportPriorityQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsLifespanEClass, DdsLifespan.class, "DdsLifespan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsLifespan_Duration(), this.getDdsDuration(), null, "duration", null, 0, 1, DdsLifespan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsHistoryQosEClass, DdsHistoryQos.class, "DdsHistoryQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsHistoryQos_Kind(), this.getHistoryQosPolicyKind(), "kind", null, 1, 1, DdsHistoryQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsHistoryQos_Depth(), ecorePackage.getELong(), "depth", "1", 0, 1, DdsHistoryQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsResourceLimitsEClass, DdsResourceLimits.class, "DdsResourceLimits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsResourceLimits_Max_samples(), ecorePackage.getELong(), "max_samples", null, 0, 1, DdsResourceLimits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsResourceLimits_Max_instances(), ecorePackage.getELong(), "max_instances", null, 0, 1, DdsResourceLimits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsResourceLimits_Max_samples_per_instances(), ecorePackage.getELong(), "max_samples_per_instances", null, 0, 1, DdsResourceLimits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDataWriterLifecycleQosEClass, DdsDataWriterLifecycleQos.class, "DdsDataWriterLifecycleQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsDataWriterLifecycleQos_Autodispose_unregistered_instances(), ecorePackage.getEBoolean(), "autodispose_unregistered_instances", "true", 0, 1, DdsDataWriterLifecycleQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriterLifecycleQos_Autopurge_suspended_samples_delay(), this.getDdsDuration(), null, "autopurge_suspended_samples_delay", null, 0, 1, DdsDataWriterLifecycleQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriterLifecycleQos_Autounregister_instance_delay(), this.getDdsDuration(), null, "autounregister_instance_delay", null, 0, 1, DdsDataWriterLifecycleQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDataReaderLifecycleQosEClass, DdsDataReaderLifecycleQos.class, "DdsDataReaderLifecycleQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsDataReaderLifecycleQos_Autopurge_nowriters_samples_delay(), this.getDdsDuration(), null, "autopurge_nowriters_samples_delay", null, 0, 1, DdsDataReaderLifecycleQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataReaderLifecycleQos_Autopurge_disposed_samples_delay(), this.getDdsDuration(), null, "autopurge_disposed_samples_delay", null, 0, 1, DdsDataReaderLifecycleQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsDataReaderLifecycleQos_Autopurge_dispose_all(), ecorePackage.getEBoolean(), "autopurge_dispose_all", null, 0, 1, DdsDataReaderLifecycleQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsDataReaderLifecycleQos_Enable_invalid_samples(), ecorePackage.getEBoolean(), "enable_invalid_samples", "true", 0, 1, DdsDataReaderLifecycleQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDestinationOrderQosEClass, DdsDestinationOrderQos.class, "DdsDestinationOrderQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsDestinationOrderQos_Kind(), this.getDestinationOrderQosPolicyKind(), "kind", null, 0, 1, DdsDestinationOrderQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsPublisherQosProfileEClass, DdsPublisherQosProfile.class, "DdsPublisherQosProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsPublisherQosProfile_GroupDataQos(), this.getDdsGroupDataQos(), null, "groupDataQos", null, 0, 1, DdsPublisherQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsPublisherQosProfile_EntityFactoryQos(), this.getDdsEntityFactoryQos(), null, "entityFactoryQos", null, 0, 1, DdsPublisherQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsPublisherQosProfile_PresentationQos(), this.getDdsPresentationQos(), null, "presentationQos", null, 0, 1, DdsPublisherQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsPublisherQosProfile_PartitionQos(), this.getDdsPartitionQos(), null, "partitionQos", null, 0, 1, DdsPublisherQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsGroupDataQosEClass, DdsGroupDataQos.class, "DdsGroupDataQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsGroupDataQos_Value(), ecorePackage.getEString(), "value", null, 0, 1, DdsGroupDataQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDataWriterQosProfileEClass, DdsDataWriterQosProfile.class, "DdsDataWriterQosProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsDataWriterQosProfile_UserDataQos(), this.getDdsUserDataQos(), null, "userDataQos", null, 0, 1, DdsDataWriterQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriterQosProfile_DurabilityQos(), this.getDdsDurabilityQos(), null, "durabilityQos", null, 0, 1, DdsDataWriterQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriterQosProfile_DeadlineQos(), this.getDdsDeadlineQos(), null, "deadlineQos", null, 0, 1, DdsDataWriterQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriterQosProfile_LatencyBudgetQos(), this.getDdsLatencyBudgetQos(), null, "latencyBudgetQos", null, 0, 1, DdsDataWriterQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriterQosProfile_OwnershipQos(), this.getDdsOwnershipQos(), null, "ownershipQos", null, 0, 1, DdsDataWriterQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriterQosProfile_OwnershipStrength(), this.getDdsOwnershipStrengthQos(), null, "ownershipStrength", null, 0, 1, DdsDataWriterQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriterQosProfile_LivelinessQos(), this.getDdsLivelinessQos(), null, "livelinessQos", null, 0, 1, DdsDataWriterQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriterQosProfile_ReliabilityQos(), this.getDdsReliabilityQos(), null, "reliabilityQos", null, 0, 1, DdsDataWriterQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriterQosProfile_TransportPriorityQos(), this.getDdsTransportPriorityQos(), null, "transportPriorityQos", null, 0, 1, DdsDataWriterQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriterQosProfile_LifespanQos(), this.getDdsLifespan(), null, "lifespanQos", null, 0, 1, DdsDataWriterQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriterQosProfile_DestinationOrderQos(), this.getDdsDestinationOrderQos(), null, "destinationOrderQos", null, 0, 1, DdsDataWriterQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriterQosProfile_HistoryQos(), this.getDdsHistoryQos(), null, "historyQos", null, 0, 1, DdsDataWriterQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriterQosProfile_ResourceLimitsQos(), this.getDdsResourceLimits(), null, "resourceLimitsQos", null, 0, 1, DdsDataWriterQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriterQosProfile_DataWriterLifecycleQos(), this.getDdsDataWriterLifecycleQos(), null, "dataWriterLifecycleQos", null, 0, 1, DdsDataWriterQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsSubscriberQosProfileEClass, DdsSubscriberQosProfile.class, "DdsSubscriberQosProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsSubscriberQosProfile_GroupDataQos(), this.getDdsGroupDataQos(), null, "groupDataQos", null, 0, 1, DdsSubscriberQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsSubscriberQosProfile_EntityFactoryQos(), this.getDdsEntityFactoryQos(), null, "entityFactoryQos", null, 0, 1, DdsSubscriberQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsSubscriberQosProfile_PresentationQos(), this.getDdsPresentationQos(), null, "presentationQos", null, 0, 1, DdsSubscriberQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsSubscriberQosProfile_PartitionQos(), this.getDdsPartitionQos(), null, "partitionQos", null, 0, 1, DdsSubscriberQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDataReaderQosProfileEClass, DdsDataReaderQosProfile.class, "DdsDataReaderQosProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsDataReaderQosProfile_UserDataQos(), this.getDdsUserDataQos(), null, "userDataQos", null, 0, 1, DdsDataReaderQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataReaderQosProfile_DurabilityQos(), this.getDdsDurabilityQos(), null, "durabilityQos", null, 0, 1, DdsDataReaderQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataReaderQosProfile_DeadlineQos(), this.getDdsDeadlineQos(), null, "deadlineQos", null, 0, 1, DdsDataReaderQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataReaderQosProfile_LatencyBudgetQos(), this.getDdsLatencyBudgetQos(), null, "latencyBudgetQos", null, 0, 1, DdsDataReaderQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataReaderQosProfile_LivelinessQos(), this.getDdsLivelinessQos(), null, "livelinessQos", null, 0, 1, DdsDataReaderQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataReaderQosProfile_OwnershipQos(), this.getDdsOwnershipQos(), null, "ownershipQos", null, 0, 1, DdsDataReaderQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataReaderQosProfile_TimeBasedFilterQos(), this.getDdsTimeBasedFilterQos(), null, "timeBasedFilterQos", null, 0, 1, DdsDataReaderQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataReaderQosProfile_ReliabilityQos(), this.getDdsReliabilityQos(), null, "reliabilityQos", null, 0, 1, DdsDataReaderQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataReaderQosProfile_DestinationOrderQos(), this.getDdsDestinationOrderQos(), null, "destinationOrderQos", null, 0, 1, DdsDataReaderQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataReaderQosProfile_HistoryQos(), this.getDdsHistoryQos(), null, "historyQos", null, 0, 1, DdsDataReaderQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataReaderQosProfile_ResourceLimitsQos(), this.getDdsResourceLimits(), null, "resourceLimitsQos", null, 0, 1, DdsDataReaderQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataReaderQosProfile_DataReaderLifecycleQos(), this.getDdsDataReaderLifecycleQos(), null, "dataReaderLifecycleQos", null, 0, 1, DdsDataReaderQosProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDomainParticipantListenerEClass, DdsDomainParticipantListener.class, "DdsDomainParticipantListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsDomainParticipantListener_Name(), ecorePackage.getEString(), "name", null, 0, 1, DdsDomainParticipantListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsDomainParticipantListener_ListenedStatus(), this.getDomainParticipantStatus(), "listenedStatus", null, 0, -1, DdsDomainParticipantListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsSubscriberListenerEClass, DdsSubscriberListener.class, "DdsSubscriberListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsSubscriberListener_Name(), ecorePackage.getEString(), "name", null, 0, 1, DdsSubscriberListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsSubscriberListener_ListenedStatus(), this.getSubscriberStatus(), "listenedStatus", null, 0, -1, DdsSubscriberListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsPublisherListenerEClass, DdsPublisherListener.class, "DdsPublisherListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsPublisherListener_Name(), ecorePackage.getEString(), "name", null, 0, 1, DdsPublisherListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsPublisherListener_ListenedStatus(), this.getPublisherStatus(), "listenedStatus", null, 0, -1, DdsPublisherListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDataReaderListenerEClass, DdsDataReaderListener.class, "DdsDataReaderListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsDataReaderListener_Name(), ecorePackage.getEString(), "name", null, 0, 1, DdsDataReaderListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsDataReaderListener_ListenedStatus(), this.getDataReaderStatus(), "listenedStatus", null, 0, -1, DdsDataReaderListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDataWriterListenerEClass, DdsDataWriterListener.class, "DdsDataWriterListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsDataWriterListener_Name(), ecorePackage.getEString(), "name", null, 0, 1, DdsDataWriterListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsDataWriterListener_ListenedStatus(), this.getDataWriterStatus(), "listenedStatus", null, 0, -1, DdsDataWriterListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsTopicListenerEClass, DdsTopicListener.class, "DdsTopicListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsTopicListener_Name(), ecorePackage.getEString(), "name", null, 0, 1, DdsTopicListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsTopicListener_ListenedStatus(), this.getTopicStatus(), "listenedStatus", null, 0, -1, DdsTopicListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsWaitSetEClass, DdsWaitSet.class, "DdsWaitSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsWaitSet_Name(), ecorePackage.getEString(), "name", null, 0, 1, DdsWaitSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsWaitSet_ReadConditions(), this.getDdsReadCondition(), null, "readConditions", null, 0, -1, DdsWaitSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsWaitSet_StatusConditions(), this.getDdsStatusCondition(), this.getDdsStatusCondition_ContainingWaitset(), "statusConditions", null, 0, -1, DdsWaitSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsWaitSet_GuardConditions(), this.getGuardCondition(), null, "guardConditions", null, 0, -1, DdsWaitSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsReadConditionEClass, DdsReadCondition.class, "DdsReadCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsReadCondition_View_state_mask(), this.getViewStateKind(), "view_state_mask", null, 0, -1, DdsReadCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsReadCondition_Instance_state_mask(), this.getInstanceStateKind(), "instance_state_mask", null, 0, -1, DdsReadCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsReadCondition_Sample_state_mask(), this.getSampleStateKind(), "sample_state_mask", null, 0, -1, DdsReadCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsReadCondition_DataReader(), this.getDdsDataReader(), null, "dataReader", null, 0, 1, DdsReadCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsStructuredFieldEClass, DdsStructuredField.class, "DdsStructuredField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsStructuredField_IsKey(), ecorePackage.getEBoolean(), "isKey", null, 0, 1, DdsStructuredField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsStructuredField_ReferencedType(), this.getDdsDataStructure(), null, "referencedType", null, 0, 1, DdsStructuredField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsStructuredField_DataStructure(), this.getDdsDataStructure(), this.getDdsDataStructure_StructuredFields(), "dataStructure", null, 0, 1, DdsStructuredField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsStructuredField_FieldName(), ecorePackage.getEString(), "fieldName", null, 1, 1, DdsStructuredField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdsStructuredField_MaxMultiplicity(), ecorePackage.getEInt(), "maxMultiplicity", null, 1, 1, DdsStructuredField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsStatusConditionEClass, DdsStatusCondition.class, "DdsStatusCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsStatusCondition_ContainingWaitset(), this.getDdsWaitSet(), this.getDdsWaitSet_StatusConditions(), "containingWaitset", null, 0, 1, DdsStatusCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDomainParticipantStatusConditionEClass, DdsDomainParticipantStatusCondition.class, "DdsDomainParticipantStatusCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsDomainParticipantStatusCondition_Enabled_status(), this.getDomainParticipantStatus(), "enabled_status", null, 0, -1, DdsDomainParticipantStatusCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDomainParticipantStatusCondition_DomainParticipant(), this.getDdsDomainParticipant(), null, "domainParticipant", null, 1, 1, DdsDomainParticipantStatusCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsPublisherStatusConditionEClass, DdsPublisherStatusCondition.class, "DdsPublisherStatusCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsPublisherStatusCondition_Enabled_status(), this.getPublisherStatus(), "enabled_status", null, 0, -1, DdsPublisherStatusCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsPublisherStatusCondition_Publisher(), this.getDdsPublisher(), null, "publisher", null, 1, 1, DdsPublisherStatusCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsSubscriberStatusConditionEClass, DdsSubscriberStatusCondition.class, "DdsSubscriberStatusCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsSubscriberStatusCondition_Enabled_status(), this.getSubscriberStatus(), "enabled_status", null, 0, -1, DdsSubscriberStatusCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsSubscriberStatusCondition_Subscriber(), this.getDdsSubscriber(), null, "subscriber", null, 1, 1, DdsSubscriberStatusCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDataWriterStatusConditionEClass, DdsDataWriterStatusCondition.class, "DdsDataWriterStatusCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsDataWriterStatusCondition_Enabled_status(), this.getDataWriterStatus(), "enabled_status", null, 0, -1, DdsDataWriterStatusCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataWriterStatusCondition_DataWriter(), this.getDdsDataWriter(), null, "dataWriter", null, 1, 1, DdsDataWriterStatusCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsDataReaderStatusConditionEClass, DdsDataReaderStatusCondition.class, "DdsDataReaderStatusCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsDataReaderStatusCondition_Enabled_status(), this.getDataReaderStatus(), "enabled_status", null, 0, -1, DdsDataReaderStatusCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsDataReaderStatusCondition_DataReader(), this.getDdsDataReader(), null, "dataReader", null, 1, 1, DdsDataReaderStatusCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsTopicStatusConditionEClass, DdsTopicStatusCondition.class, "DdsTopicStatusCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsTopicStatusCondition_Enabled_status(), this.getTopicStatus(), "enabled_status", null, 0, -1, DdsTopicStatusCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsTopicStatusCondition_Topic(), this.getDdsTopic(), null, "topic", null, 1, 1, DdsTopicStatusCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryConditionEClass, QueryCondition.class, "QueryCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryCondition_Query(), ecorePackage.getEString(), "query", null, 0, 1, QueryCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryCondition_QueryParameters(), ecorePackage.getEString(), "queryParameters", null, 0, -1, QueryCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guardConditionEClass, GuardCondition.class, "GuardCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuardCondition_Name(), ecorePackage.getEString(), "name", null, 0, 1, GuardCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsSystemEClass, DdsSystem.class, "DdsSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsSystem_SystemName(), ecorePackage.getEString(), "systemName", null, 0, 1, DdsSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsSystem_Hosts(), this.getDdsHost(), null, "hosts", null, 0, -1, DdsSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsSystem_QosProfiles(), this.getDdsQosProfile(), null, "qosProfiles", null, 0, -1, DdsSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsSystem_DataModules(), this.getDdsDataModule(), this.getDdsDataModule_ContainingSystem(), "dataModules", null, 0, -1, DdsSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsSystem_Topics(), this.getDdsTopic(), null, "topics", null, 0, -1, DdsSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddsHostEClass, DdsHost.class, "DdsHost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsHost_HostName(), ecorePackage.getEString(), "hostName", null, 0, 1, DdsHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdsHost_Applications(), this.getDdsApplication(), null, "applications", null, 0, -1, DdsHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.class, "DurabilityQosPolicyKind");
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.VOLATILE_DURABILITY_QOS);
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.TRANSIENT_LOCAL_DURABILITY_QOS);
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.TRANSIENT_DURABILITY_QOS);
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.PERSISTENT_DURABILITY_QOS);

		initEEnum(historyQosPolicyKindEEnum, HistoryQosPolicyKind.class, "HistoryQosPolicyKind");
		addEEnumLiteral(historyQosPolicyKindEEnum, HistoryQosPolicyKind.KEEP_LAST_HISTORY_QOS);
		addEEnumLiteral(historyQosPolicyKindEEnum, HistoryQosPolicyKind.KEEP_ALL_HISTORY_QOS);

		initEEnum(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.class, "PresentationQosPolicyAccessScopeKind");
		addEEnumLiteral(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.INSTANCE_PRESENTATION_QOS);
		addEEnumLiteral(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.TOPIC_PRESENTATION_QOS);
		addEEnumLiteral(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.GROUP_PRESENTATION_QOS);

		initEEnum(ownershipQosPolicyKindEEnum, OwnershipQosPolicyKind.class, "OwnershipQosPolicyKind");
		addEEnumLiteral(ownershipQosPolicyKindEEnum, OwnershipQosPolicyKind.SHARED_OWNERSHIP_QOS);
		addEEnumLiteral(ownershipQosPolicyKindEEnum, OwnershipQosPolicyKind.EXCLUSIVE_OWNERSHIP_QOS);

		initEEnum(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.class, "LivelinessQosPolicyKind");
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.AUTOMATIC_LIVELINESS_QOS);
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.MANUAL_LIVELINESS_QOS);
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.MANUAL_BY_PARTICIPANT_LIVELINESS_QOS);
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.MANUAL_BY_TOPIC_LIVELINESS_QOS);

		initEEnum(reliabilityQosPolicyKindEEnum, ReliabilityQosPolicyKind.class, "ReliabilityQosPolicyKind");
		addEEnumLiteral(reliabilityQosPolicyKindEEnum, ReliabilityQosPolicyKind.RELIABLE_RELIABILITY_QOS);
		addEEnumLiteral(reliabilityQosPolicyKindEEnum, ReliabilityQosPolicyKind.BEST_EFFORT_RELIABILITY_QOS);

		initEEnum(destinationOrderQosPolicyKindEEnum, DestinationOrderQosPolicyKind.class, "DestinationOrderQosPolicyKind");
		addEEnumLiteral(destinationOrderQosPolicyKindEEnum, DestinationOrderQosPolicyKind.BY_RECEPTION_TIMESTAMP_DESTINATIONORDER_QOS);
		addEEnumLiteral(destinationOrderQosPolicyKindEEnum, DestinationOrderQosPolicyKind.BY_SOURCE_TIMESTAMP_DESTINATIONORDER_QOS);

		initEEnum(invalidSampleVisibilityQosPolicyEEnum, InvalidSampleVisibilityQosPolicy.class, "InvalidSampleVisibilityQosPolicy");
		addEEnumLiteral(invalidSampleVisibilityQosPolicyEEnum, InvalidSampleVisibilityQosPolicy.NO_INVALID_SAMPLES);
		addEEnumLiteral(invalidSampleVisibilityQosPolicyEEnum, InvalidSampleVisibilityQosPolicy.MINIMUM_INVALID_SAMPLES);
		addEEnumLiteral(invalidSampleVisibilityQosPolicyEEnum, InvalidSampleVisibilityQosPolicy.ALL_INVALID_SAMPLES);

		initEEnum(viewStateKindEEnum, ViewStateKind.class, "ViewStateKind");
		addEEnumLiteral(viewStateKindEEnum, ViewStateKind.NEW_VIEW_STATE);
		addEEnumLiteral(viewStateKindEEnum, ViewStateKind.NOT_NEW_VIEW_STATE);
		addEEnumLiteral(viewStateKindEEnum, ViewStateKind.ANY_VIEW_STATE);

		initEEnum(instanceStateKindEEnum, InstanceStateKind.class, "InstanceStateKind");
		addEEnumLiteral(instanceStateKindEEnum, InstanceStateKind.ALIVE_INSTANCE_STATE);
		addEEnumLiteral(instanceStateKindEEnum, InstanceStateKind.NOT_ALIVE_DISPOSED_INSTANCE_STATE);
		addEEnumLiteral(instanceStateKindEEnum, InstanceStateKind.NOT_ALIVE_NO_WRITERS_INSTANCE_STATE);
		addEEnumLiteral(instanceStateKindEEnum, InstanceStateKind.ANY_INSTANCE_STATE);

		initEEnum(sampleStateKindEEnum, SampleStateKind.class, "SampleStateKind");
		addEEnumLiteral(sampleStateKindEEnum, SampleStateKind.READ_SAMPLE_STATE);
		addEEnumLiteral(sampleStateKindEEnum, SampleStateKind.NOT_READ_SAMPLE_STATE);
		addEEnumLiteral(sampleStateKindEEnum, SampleStateKind.ANY_READ_SAMPLE_STATE);

		initEEnum(domainParticipantStatusEEnum, DomainParticipantStatus.class, "DomainParticipantStatus");
		addEEnumLiteral(domainParticipantStatusEEnum, DomainParticipantStatus.INCONSISTENT_TOPIC_STATUS);
		addEEnumLiteral(domainParticipantStatusEEnum, DomainParticipantStatus.LIVELINESS_LOST_STATUS);
		addEEnumLiteral(domainParticipantStatusEEnum, DomainParticipantStatus.OFFERED_DEADLINE_MISSED_STATUS);
		addEEnumLiteral(domainParticipantStatusEEnum, DomainParticipantStatus.OFFERED_INCOMPATIBLE_QOS_STATUS);
		addEEnumLiteral(domainParticipantStatusEEnum, DomainParticipantStatus.PUBLICATION_MATCHED_STATUS);
		addEEnumLiteral(domainParticipantStatusEEnum, DomainParticipantStatus.SAMPLE_REJECTED_STATUS);
		addEEnumLiteral(domainParticipantStatusEEnum, DomainParticipantStatus.LIVELINESS_CHANGED_STATUS);
		addEEnumLiteral(domainParticipantStatusEEnum, DomainParticipantStatus.REQUESTED_DEADLINE_MISSED_STATUS);
		addEEnumLiteral(domainParticipantStatusEEnum, DomainParticipantStatus.REQUESTED_INCOMPATIBLE_QOS_STATUS);
		addEEnumLiteral(domainParticipantStatusEEnum, DomainParticipantStatus.DATA_AVAILABLE_STATUS);
		addEEnumLiteral(domainParticipantStatusEEnum, DomainParticipantStatus.SAMPLE_LOST_STATUS);
		addEEnumLiteral(domainParticipantStatusEEnum, DomainParticipantStatus.SUBSCRIPTION_MATCHED_STATUS);
		addEEnumLiteral(domainParticipantStatusEEnum, DomainParticipantStatus.DATA_ON_READERS_STATUS);

		initEEnum(subscriberStatusEEnum, SubscriberStatus.class, "SubscriberStatus");
		addEEnumLiteral(subscriberStatusEEnum, SubscriberStatus.DATA_ON_READERS_STATUS);
		addEEnumLiteral(subscriberStatusEEnum, SubscriberStatus.DATA_AVAILABLE_STATUS);
		addEEnumLiteral(subscriberStatusEEnum, SubscriberStatus.LIVELINESS_CHANGED_STATUS);
		addEEnumLiteral(subscriberStatusEEnum, SubscriberStatus.REQUESTED_DEADLINE_MISSED_STATUS);
		addEEnumLiteral(subscriberStatusEEnum, SubscriberStatus.REQUESTED_INCOMPATIBLE_QOS_STATUS);
		addEEnumLiteral(subscriberStatusEEnum, SubscriberStatus.SAMPLE_LOST_STATUS);
		addEEnumLiteral(subscriberStatusEEnum, SubscriberStatus.SAMPLE_REJECTED_STATUS);
		addEEnumLiteral(subscriberStatusEEnum, SubscriberStatus.SUBSCRIPTION_MATCHED_STATUS);

		initEEnum(publisherStatusEEnum, PublisherStatus.class, "PublisherStatus");
		addEEnumLiteral(publisherStatusEEnum, PublisherStatus.LIVELINESS_LOST_STATUS);
		addEEnumLiteral(publisherStatusEEnum, PublisherStatus.OFFERED_DEADLINE_MISSED_STATUS);
		addEEnumLiteral(publisherStatusEEnum, PublisherStatus.OFFERED_INCOMPATIBLE_QOS_STATUS);
		addEEnumLiteral(publisherStatusEEnum, PublisherStatus.PUBLICATION_MATCHED_STATUS);

		initEEnum(dataWriterStatusEEnum, DataWriterStatus.class, "DataWriterStatus");
		addEEnumLiteral(dataWriterStatusEEnum, DataWriterStatus.LIVELINESS_LOST_STATUS);
		addEEnumLiteral(dataWriterStatusEEnum, DataWriterStatus.OFFERED_DEADLINE_MISSED_STATUS);
		addEEnumLiteral(dataWriterStatusEEnum, DataWriterStatus.OFFERED_INCOMPATIBLE_QOS_STATUS);
		addEEnumLiteral(dataWriterStatusEEnum, DataWriterStatus.PUBLICATION_MATCHED_STATUS);

		initEEnum(dataReaderStatusEEnum, DataReaderStatus.class, "DataReaderStatus");
		addEEnumLiteral(dataReaderStatusEEnum, DataReaderStatus.DATA_AVAILABLE_STATUS);
		addEEnumLiteral(dataReaderStatusEEnum, DataReaderStatus.LIVELINESS_CHANGED_STATUS);
		addEEnumLiteral(dataReaderStatusEEnum, DataReaderStatus.SAMPLE_REJECTED_STATUS);
		addEEnumLiteral(dataReaderStatusEEnum, DataReaderStatus.REQUESTED_DEADLINE_MISSED_STATUS);
		addEEnumLiteral(dataReaderStatusEEnum, DataReaderStatus.REQUESTED_INCOMPATIBLE_QOS_STATUS);
		addEEnumLiteral(dataReaderStatusEEnum, DataReaderStatus.SAMPLE_LOST_STATUS);
		addEEnumLiteral(dataReaderStatusEEnum, DataReaderStatus.SUBSCRIPTION_MATCHED_STATUS);

		initEEnum(topicStatusEEnum, TopicStatus.class, "TopicStatus");
		addEEnumLiteral(topicStatusEEnum, TopicStatus.INCONSISTENT_TOPIC_STATUS);

		// Create resource
		createResource(eNS_URI);
	}

} //DdsMetamodelPackageImpl
