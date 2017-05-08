/**
 */
package ddsMetamodel.util;

import ddsMetamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ddsMetamodel.DdsMetamodelPackage
 * @generated
 */
public class DdsMetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DdsMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsMetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DdsMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsMetamodelSwitch<Adapter> modelSwitch =
		new DdsMetamodelSwitch<Adapter>() {
			@Override
			public Adapter caseDdsApplication(DdsApplication object) {
				return createDdsApplicationAdapter();
			}
			@Override
			public Adapter caseDdsDomainParticipant(DdsDomainParticipant object) {
				return createDdsDomainParticipantAdapter();
			}
			@Override
			public Adapter caseDdsTopic(DdsTopic object) {
				return createDdsTopicAdapter();
			}
			@Override
			public Adapter caseDdsQosProfile(DdsQosProfile object) {
				return createDdsQosProfileAdapter();
			}
			@Override
			public Adapter caseDdsSubscriber(DdsSubscriber object) {
				return createDdsSubscriberAdapter();
			}
			@Override
			public Adapter caseDdsDataReader(DdsDataReader object) {
				return createDdsDataReaderAdapter();
			}
			@Override
			public Adapter caseDdsPublisher(DdsPublisher object) {
				return createDdsPublisherAdapter();
			}
			@Override
			public Adapter caseDdsDataWriter(DdsDataWriter object) {
				return createDdsDataWriterAdapter();
			}
			@Override
			public Adapter caseDdsDataModule(DdsDataModule object) {
				return createDdsDataModuleAdapter();
			}
			@Override
			public Adapter caseDdsDataStructure(DdsDataStructure object) {
				return createDdsDataStructureAdapter();
			}
			@Override
			public Adapter caseDdsDataField(DdsDataField object) {
				return createDdsDataFieldAdapter();
			}
			@Override
			public Adapter caseDdsDomainParticipantQosProfile(DdsDomainParticipantQosProfile object) {
				return createDdsDomainParticipantQosProfileAdapter();
			}
			@Override
			public Adapter caseDdsUserDataQos(DdsUserDataQos object) {
				return createDdsUserDataQosAdapter();
			}
			@Override
			public Adapter caseDdsEntityFactoryQos(DdsEntityFactoryQos object) {
				return createDdsEntityFactoryQosAdapter();
			}
			@Override
			public Adapter caseDdsTopicQosProfile(DdsTopicQosProfile object) {
				return createDdsTopicQosProfileAdapter();
			}
			@Override
			public Adapter caseDdsTopicDataQos(DdsTopicDataQos object) {
				return createDdsTopicDataQosAdapter();
			}
			@Override
			public Adapter caseDdsDurabilityQos(DdsDurabilityQos object) {
				return createDdsDurabilityQosAdapter();
			}
			@Override
			public Adapter caseDdsDurabilityServiceQos(DdsDurabilityServiceQos object) {
				return createDdsDurabilityServiceQosAdapter();
			}
			@Override
			public Adapter caseDdsDuration(DdsDuration object) {
				return createDdsDurationAdapter();
			}
			@Override
			public Adapter caseDdsPresentationQos(DdsPresentationQos object) {
				return createDdsPresentationQosAdapter();
			}
			@Override
			public Adapter caseDdsDeadlineQos(DdsDeadlineQos object) {
				return createDdsDeadlineQosAdapter();
			}
			@Override
			public Adapter caseDdsLatencyBudgetQos(DdsLatencyBudgetQos object) {
				return createDdsLatencyBudgetQosAdapter();
			}
			@Override
			public Adapter caseDdsOwnershipQos(DdsOwnershipQos object) {
				return createDdsOwnershipQosAdapter();
			}
			@Override
			public Adapter caseDdsOwnershipStrengthQos(DdsOwnershipStrengthQos object) {
				return createDdsOwnershipStrengthQosAdapter();
			}
			@Override
			public Adapter caseDdsLivelinessQos(DdsLivelinessQos object) {
				return createDdsLivelinessQosAdapter();
			}
			@Override
			public Adapter caseDdsTimeBasedFilterQos(DdsTimeBasedFilterQos object) {
				return createDdsTimeBasedFilterQosAdapter();
			}
			@Override
			public Adapter caseDdsPartitionQos(DdsPartitionQos object) {
				return createDdsPartitionQosAdapter();
			}
			@Override
			public Adapter caseDdsReliabilityQos(DdsReliabilityQos object) {
				return createDdsReliabilityQosAdapter();
			}
			@Override
			public Adapter caseDdsTransportPriorityQos(DdsTransportPriorityQos object) {
				return createDdsTransportPriorityQosAdapter();
			}
			@Override
			public Adapter caseDdsLifespan(DdsLifespan object) {
				return createDdsLifespanAdapter();
			}
			@Override
			public Adapter caseDdsHistoryQos(DdsHistoryQos object) {
				return createDdsHistoryQosAdapter();
			}
			@Override
			public Adapter caseDdsResourceLimits(DdsResourceLimits object) {
				return createDdsResourceLimitsAdapter();
			}
			@Override
			public Adapter caseDdsDataWriterLifecycleQos(DdsDataWriterLifecycleQos object) {
				return createDdsDataWriterLifecycleQosAdapter();
			}
			@Override
			public Adapter caseDdsDataReaderLifecycleQos(DdsDataReaderLifecycleQos object) {
				return createDdsDataReaderLifecycleQosAdapter();
			}
			@Override
			public Adapter caseDdsDestinationOrderQos(DdsDestinationOrderQos object) {
				return createDdsDestinationOrderQosAdapter();
			}
			@Override
			public Adapter caseDdsPublisherQosProfile(DdsPublisherQosProfile object) {
				return createDdsPublisherQosProfileAdapter();
			}
			@Override
			public Adapter caseDdsGroupDataQos(DdsGroupDataQos object) {
				return createDdsGroupDataQosAdapter();
			}
			@Override
			public Adapter caseDdsDataWriterQosProfile(DdsDataWriterQosProfile object) {
				return createDdsDataWriterQosProfileAdapter();
			}
			@Override
			public Adapter caseDdsSubscriberQosProfile(DdsSubscriberQosProfile object) {
				return createDdsSubscriberQosProfileAdapter();
			}
			@Override
			public Adapter caseDdsDataReaderQosProfile(DdsDataReaderQosProfile object) {
				return createDdsDataReaderQosProfileAdapter();
			}
			@Override
			public Adapter caseDdsDomainParticipantListener(DdsDomainParticipantListener object) {
				return createDdsDomainParticipantListenerAdapter();
			}
			@Override
			public Adapter caseDdsSubscriberListener(DdsSubscriberListener object) {
				return createDdsSubscriberListenerAdapter();
			}
			@Override
			public Adapter caseDdsPublisherListener(DdsPublisherListener object) {
				return createDdsPublisherListenerAdapter();
			}
			@Override
			public Adapter caseDdsDataReaderListener(DdsDataReaderListener object) {
				return createDdsDataReaderListenerAdapter();
			}
			@Override
			public Adapter caseDdsDataWriterListener(DdsDataWriterListener object) {
				return createDdsDataWriterListenerAdapter();
			}
			@Override
			public Adapter caseDdsTopicListener(DdsTopicListener object) {
				return createDdsTopicListenerAdapter();
			}
			@Override
			public Adapter caseDdsWaitSet(DdsWaitSet object) {
				return createDdsWaitSetAdapter();
			}
			@Override
			public Adapter caseDdsReadCondition(DdsReadCondition object) {
				return createDdsReadConditionAdapter();
			}
			@Override
			public Adapter caseDdsStructuredField(DdsStructuredField object) {
				return createDdsStructuredFieldAdapter();
			}
			@Override
			public Adapter caseDdsStatusCondition(DdsStatusCondition object) {
				return createDdsStatusConditionAdapter();
			}
			@Override
			public Adapter caseDdsDomainParticipantStatusCondition(DdsDomainParticipantStatusCondition object) {
				return createDdsDomainParticipantStatusConditionAdapter();
			}
			@Override
			public Adapter caseDdsPublisherStatusCondition(DdsPublisherStatusCondition object) {
				return createDdsPublisherStatusConditionAdapter();
			}
			@Override
			public Adapter caseDdsSubscriberStatusCondition(DdsSubscriberStatusCondition object) {
				return createDdsSubscriberStatusConditionAdapter();
			}
			@Override
			public Adapter caseDdsDataWriterStatusCondition(DdsDataWriterStatusCondition object) {
				return createDdsDataWriterStatusConditionAdapter();
			}
			@Override
			public Adapter caseDdsDataReaderStatusCondition(DdsDataReaderStatusCondition object) {
				return createDdsDataReaderStatusConditionAdapter();
			}
			@Override
			public Adapter caseDdsTopicStatusCondition(DdsTopicStatusCondition object) {
				return createDdsTopicStatusConditionAdapter();
			}
			@Override
			public Adapter caseQueryCondition(QueryCondition object) {
				return createQueryConditionAdapter();
			}
			@Override
			public Adapter caseGuardCondition(GuardCondition object) {
				return createGuardConditionAdapter();
			}
			@Override
			public Adapter caseDdsSystem(DdsSystem object) {
				return createDdsSystemAdapter();
			}
			@Override
			public Adapter caseDdsHost(DdsHost object) {
				return createDdsHostAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsApplication <em>Dds Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsApplication
	 * @generated
	 */
	public Adapter createDdsApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDomainParticipant <em>Dds Domain Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDomainParticipant
	 * @generated
	 */
	public Adapter createDdsDomainParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsTopic <em>Dds Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsTopic
	 * @generated
	 */
	public Adapter createDdsTopicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsQosProfile <em>Dds Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsQosProfile
	 * @generated
	 */
	public Adapter createDdsQosProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsSubscriber <em>Dds Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsSubscriber
	 * @generated
	 */
	public Adapter createDdsSubscriberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDataReader <em>Dds Data Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDataReader
	 * @generated
	 */
	public Adapter createDdsDataReaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsPublisher <em>Dds Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsPublisher
	 * @generated
	 */
	public Adapter createDdsPublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDataWriter <em>Dds Data Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDataWriter
	 * @generated
	 */
	public Adapter createDdsDataWriterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDataModule <em>Dds Data Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDataModule
	 * @generated
	 */
	public Adapter createDdsDataModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDataStructure <em>Dds Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDataStructure
	 * @generated
	 */
	public Adapter createDdsDataStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDataField <em>Dds Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDataField
	 * @generated
	 */
	public Adapter createDdsDataFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDomainParticipantQosProfile <em>Dds Domain Participant Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDomainParticipantQosProfile
	 * @generated
	 */
	public Adapter createDdsDomainParticipantQosProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsUserDataQos <em>Dds User Data Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsUserDataQos
	 * @generated
	 */
	public Adapter createDdsUserDataQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsEntityFactoryQos <em>Dds Entity Factory Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsEntityFactoryQos
	 * @generated
	 */
	public Adapter createDdsEntityFactoryQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsTopicQosProfile <em>Dds Topic Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsTopicQosProfile
	 * @generated
	 */
	public Adapter createDdsTopicQosProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsTopicDataQos <em>Dds Topic Data Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsTopicDataQos
	 * @generated
	 */
	public Adapter createDdsTopicDataQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDurabilityQos <em>Dds Durability Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDurabilityQos
	 * @generated
	 */
	public Adapter createDdsDurabilityQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDurabilityServiceQos <em>Dds Durability Service Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDurabilityServiceQos
	 * @generated
	 */
	public Adapter createDdsDurabilityServiceQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDuration <em>Dds Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDuration
	 * @generated
	 */
	public Adapter createDdsDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsPresentationQos <em>Dds Presentation Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsPresentationQos
	 * @generated
	 */
	public Adapter createDdsPresentationQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDeadlineQos <em>Dds Deadline Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDeadlineQos
	 * @generated
	 */
	public Adapter createDdsDeadlineQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsLatencyBudgetQos <em>Dds Latency Budget Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsLatencyBudgetQos
	 * @generated
	 */
	public Adapter createDdsLatencyBudgetQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsOwnershipQos <em>Dds Ownership Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsOwnershipQos
	 * @generated
	 */
	public Adapter createDdsOwnershipQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsOwnershipStrengthQos <em>Dds Ownership Strength Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsOwnershipStrengthQos
	 * @generated
	 */
	public Adapter createDdsOwnershipStrengthQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsLivelinessQos <em>Dds Liveliness Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsLivelinessQos
	 * @generated
	 */
	public Adapter createDdsLivelinessQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsTimeBasedFilterQos <em>Dds Time Based Filter Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsTimeBasedFilterQos
	 * @generated
	 */
	public Adapter createDdsTimeBasedFilterQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsPartitionQos <em>Dds Partition Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsPartitionQos
	 * @generated
	 */
	public Adapter createDdsPartitionQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsReliabilityQos <em>Dds Reliability Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsReliabilityQos
	 * @generated
	 */
	public Adapter createDdsReliabilityQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsTransportPriorityQos <em>Dds Transport Priority Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsTransportPriorityQos
	 * @generated
	 */
	public Adapter createDdsTransportPriorityQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsLifespan <em>Dds Lifespan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsLifespan
	 * @generated
	 */
	public Adapter createDdsLifespanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsHistoryQos <em>Dds History Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsHistoryQos
	 * @generated
	 */
	public Adapter createDdsHistoryQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsResourceLimits <em>Dds Resource Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsResourceLimits
	 * @generated
	 */
	public Adapter createDdsResourceLimitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDataWriterLifecycleQos <em>Dds Data Writer Lifecycle Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDataWriterLifecycleQos
	 * @generated
	 */
	public Adapter createDdsDataWriterLifecycleQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDataReaderLifecycleQos <em>Dds Data Reader Lifecycle Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDataReaderLifecycleQos
	 * @generated
	 */
	public Adapter createDdsDataReaderLifecycleQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDestinationOrderQos <em>Dds Destination Order Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDestinationOrderQos
	 * @generated
	 */
	public Adapter createDdsDestinationOrderQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsPublisherQosProfile <em>Dds Publisher Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsPublisherQosProfile
	 * @generated
	 */
	public Adapter createDdsPublisherQosProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsGroupDataQos <em>Dds Group Data Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsGroupDataQos
	 * @generated
	 */
	public Adapter createDdsGroupDataQosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDataWriterQosProfile <em>Dds Data Writer Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDataWriterQosProfile
	 * @generated
	 */
	public Adapter createDdsDataWriterQosProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsSubscriberQosProfile <em>Dds Subscriber Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsSubscriberQosProfile
	 * @generated
	 */
	public Adapter createDdsSubscriberQosProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDataReaderQosProfile <em>Dds Data Reader Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDataReaderQosProfile
	 * @generated
	 */
	public Adapter createDdsDataReaderQosProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDomainParticipantListener <em>Dds Domain Participant Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDomainParticipantListener
	 * @generated
	 */
	public Adapter createDdsDomainParticipantListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsSubscriberListener <em>Dds Subscriber Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsSubscriberListener
	 * @generated
	 */
	public Adapter createDdsSubscriberListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsPublisherListener <em>Dds Publisher Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsPublisherListener
	 * @generated
	 */
	public Adapter createDdsPublisherListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDataReaderListener <em>Dds Data Reader Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDataReaderListener
	 * @generated
	 */
	public Adapter createDdsDataReaderListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDataWriterListener <em>Dds Data Writer Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDataWriterListener
	 * @generated
	 */
	public Adapter createDdsDataWriterListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsTopicListener <em>Dds Topic Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsTopicListener
	 * @generated
	 */
	public Adapter createDdsTopicListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsWaitSet <em>Dds Wait Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsWaitSet
	 * @generated
	 */
	public Adapter createDdsWaitSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsReadCondition <em>Dds Read Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsReadCondition
	 * @generated
	 */
	public Adapter createDdsReadConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsStructuredField <em>Dds Structured Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsStructuredField
	 * @generated
	 */
	public Adapter createDdsStructuredFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsStatusCondition <em>Dds Status Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsStatusCondition
	 * @generated
	 */
	public Adapter createDdsStatusConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDomainParticipantStatusCondition <em>Dds Domain Participant Status Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDomainParticipantStatusCondition
	 * @generated
	 */
	public Adapter createDdsDomainParticipantStatusConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsPublisherStatusCondition <em>Dds Publisher Status Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsPublisherStatusCondition
	 * @generated
	 */
	public Adapter createDdsPublisherStatusConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsSubscriberStatusCondition <em>Dds Subscriber Status Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsSubscriberStatusCondition
	 * @generated
	 */
	public Adapter createDdsSubscriberStatusConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDataWriterStatusCondition <em>Dds Data Writer Status Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDataWriterStatusCondition
	 * @generated
	 */
	public Adapter createDdsDataWriterStatusConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsDataReaderStatusCondition <em>Dds Data Reader Status Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsDataReaderStatusCondition
	 * @generated
	 */
	public Adapter createDdsDataReaderStatusConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsTopicStatusCondition <em>Dds Topic Status Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsTopicStatusCondition
	 * @generated
	 */
	public Adapter createDdsTopicStatusConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.QueryCondition <em>Query Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.QueryCondition
	 * @generated
	 */
	public Adapter createQueryConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.GuardCondition <em>Guard Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.GuardCondition
	 * @generated
	 */
	public Adapter createGuardConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsSystem <em>Dds System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsSystem
	 * @generated
	 */
	public Adapter createDdsSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ddsMetamodel.DdsHost <em>Dds Host</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ddsMetamodel.DdsHost
	 * @generated
	 */
	public Adapter createDdsHostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DdsMetamodelAdapterFactory
