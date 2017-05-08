/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ddsMetamodel.DdsMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface DdsMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ddsMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ddsMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ddsMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DdsMetamodelPackage eINSTANCE = ddsMetamodel.impl.DdsMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsApplicationImpl <em>Dds Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsApplicationImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsApplication()
	 * @generated
	 */
	int DDS_APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Application Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_APPLICATION__APPLICATION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Domain Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_APPLICATION__DOMAIN_PARTICIPANTS = 1;

	/**
	 * The feature id for the '<em><b>Waitset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_APPLICATION__WAITSET = 2;

	/**
	 * The number of structural features of the '<em>Dds Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_APPLICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dds Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDomainParticipantImpl <em>Dds Domain Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDomainParticipantImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDomainParticipant()
	 * @generated
	 */
	int DDS_DOMAIN_PARTICIPANT = 1;

	/**
	 * The feature id for the '<em><b>Domain Participant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Ddssubscriber</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT__DDSSUBSCRIBER = 1;

	/**
	 * The feature id for the '<em><b>Ddspublisher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT__DDSPUBLISHER = 2;

	/**
	 * The feature id for the '<em><b>Ddsdomainparticipantqosprofile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT__DDSDOMAINPARTICIPANTQOSPROFILE = 3;

	/**
	 * The feature id for the '<em><b>Domain Participant Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_LISTENER = 4;

	/**
	 * The feature id for the '<em><b>Domain Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT__DOMAIN_ID = 5;

	/**
	 * The number of structural features of the '<em>Dds Domain Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Dds Domain Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsTopicImpl <em>Dds Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsTopicImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsTopic()
	 * @generated
	 */
	int DDS_TOPIC = 2;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC__TOPIC_NAME = 0;

	/**
	 * The feature id for the '<em><b>Topic Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC__TOPIC_LISTENER = 1;

	/**
	 * The feature id for the '<em><b>Topic Qos Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC__TOPIC_QOS_PROFILE = 2;

	/**
	 * The feature id for the '<em><b>Ddsdatastructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC__DDSDATASTRUCTURE = 3;

	/**
	 * The number of structural features of the '<em>Dds Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dds Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsQosProfileImpl <em>Dds Qos Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsQosProfileImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsQosProfile()
	 * @generated
	 */
	int DDS_QOS_PROFILE = 3;

	/**
	 * The feature id for the '<em><b>Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_QOS_PROFILE__PROFILE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Dds Qos Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_QOS_PROFILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dds Qos Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_QOS_PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsSubscriberImpl <em>Dds Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsSubscriberImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsSubscriber()
	 * @generated
	 */
	int DDS_SUBSCRIBER = 4;

	/**
	 * The feature id for the '<em><b>Subscriber Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER__SUBSCRIBER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Ddsdatareader</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER__DDSDATAREADER = 1;

	/**
	 * The feature id for the '<em><b>Subscriber Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER__SUBSCRIBER_LISTENER = 2;

	/**
	 * The feature id for the '<em><b>Subscriber Qos Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER__SUBSCRIBER_QOS_PROFILE = 3;

	/**
	 * The number of structural features of the '<em>Dds Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dds Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDataReaderImpl <em>Dds Data Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDataReaderImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataReader()
	 * @generated
	 */
	int DDS_DATA_READER = 5;

	/**
	 * The feature id for the '<em><b>Data Reader Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER__DATA_READER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Readable Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER__READABLE_TOPIC = 1;

	/**
	 * The feature id for the '<em><b>Data Reader Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER__DATA_READER_LISTENER = 2;

	/**
	 * The feature id for the '<em><b>Data Reader Qos Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER__DATA_READER_QOS_PROFILE = 3;

	/**
	 * The number of structural features of the '<em>Dds Data Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dds Data Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsPublisherImpl <em>Dds Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsPublisherImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsPublisher()
	 * @generated
	 */
	int DDS_PUBLISHER = 6;

	/**
	 * The feature id for the '<em><b>Publisher Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER__PUBLISHER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Ddsdatawriter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER__DDSDATAWRITER = 1;

	/**
	 * The feature id for the '<em><b>Publisher Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER__PUBLISHER_LISTENER = 2;

	/**
	 * The feature id for the '<em><b>Publisher Qos Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER__PUBLISHER_QOS_PROFILE = 3;

	/**
	 * The number of structural features of the '<em>Dds Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dds Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDataWriterImpl <em>Dds Data Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDataWriterImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataWriter()
	 * @generated
	 */
	int DDS_DATA_WRITER = 7;

	/**
	 * The feature id for the '<em><b>Data Writer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER__DATA_WRITER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Publiable Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER__PUBLIABLE_TOPIC = 1;

	/**
	 * The feature id for the '<em><b>Data Writer Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER__DATA_WRITER_LISTENER = 2;

	/**
	 * The feature id for the '<em><b>Data Writer Qos Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER__DATA_WRITER_QOS_PROFILE = 3;

	/**
	 * The number of structural features of the '<em>Dds Data Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dds Data Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDataModuleImpl <em>Dds Data Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDataModuleImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataModule()
	 * @generated
	 */
	int DDS_DATA_MODULE = 8;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_MODULE__MODULE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_MODULE__DATA_STRUCTURES = 1;

	/**
	 * The feature id for the '<em><b>Inner Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_MODULE__INNER_MODULES = 2;

	/**
	 * The feature id for the '<em><b>Containing System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_MODULE__CONTAINING_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Containing Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_MODULE__CONTAINING_MODULE = 4;

	/**
	 * The number of structural features of the '<em>Dds Data Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_MODULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Dds Data Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDataStructureImpl <em>Dds Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDataStructureImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataStructure()
	 * @generated
	 */
	int DDS_DATA_STRUCTURE = 9;

	/**
	 * The feature id for the '<em><b>Structure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_STRUCTURE__STRUCTURE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_STRUCTURE__FIELDS = 1;

	/**
	 * The feature id for the '<em><b>Structured Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_STRUCTURE__STRUCTURED_FIELDS = 2;

	/**
	 * The feature id for the '<em><b>Container Data Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_STRUCTURE__CONTAINER_DATA_MODULE = 3;

	/**
	 * The number of structural features of the '<em>Dds Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_STRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dds Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDataFieldImpl <em>Dds Data Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDataFieldImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataField()
	 * @generated
	 */
	int DDS_DATA_FIELD = 10;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_FIELD__FIELD_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_FIELD__FIELD_NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_FIELD__IS_KEY = 2;

	/**
	 * The feature id for the '<em><b>Max Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_FIELD__MAX_MULTIPLICITY = 3;

	/**
	 * The number of structural features of the '<em>Dds Data Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_FIELD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dds Data Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDomainParticipantQosProfileImpl <em>Dds Domain Participant Qos Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDomainParticipantQosProfileImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDomainParticipantQosProfile()
	 * @generated
	 */
	int DDS_DOMAIN_PARTICIPANT_QOS_PROFILE = 11;

	/**
	 * The feature id for the '<em><b>Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__PROFILE_NAME = DDS_QOS_PROFILE__PROFILE_NAME;

	/**
	 * The feature id for the '<em><b>User Data Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__USER_DATA_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Factory Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__ENTITY_FACTORY_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dds Domain Participant Qos Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT_QOS_PROFILE_FEATURE_COUNT = DDS_QOS_PROFILE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dds Domain Participant Qos Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT_QOS_PROFILE_OPERATION_COUNT = DDS_QOS_PROFILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsUserDataQosImpl <em>Dds User Data Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsUserDataQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsUserDataQos()
	 * @generated
	 */
	int DDS_USER_DATA_QOS = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_USER_DATA_QOS__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Dds User Data Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_USER_DATA_QOS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dds User Data Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_USER_DATA_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsEntityFactoryQosImpl <em>Dds Entity Factory Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsEntityFactoryQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsEntityFactoryQos()
	 * @generated
	 */
	int DDS_ENTITY_FACTORY_QOS = 13;

	/**
	 * The feature id for the '<em><b>Autoenable created entities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_ENTITY_FACTORY_QOS__AUTOENABLE_CREATED_ENTITIES = 0;

	/**
	 * The number of structural features of the '<em>Dds Entity Factory Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_ENTITY_FACTORY_QOS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dds Entity Factory Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_ENTITY_FACTORY_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsTopicQosProfileImpl <em>Dds Topic Qos Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsTopicQosProfileImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsTopicQosProfile()
	 * @generated
	 */
	int DDS_TOPIC_QOS_PROFILE = 14;

	/**
	 * The feature id for the '<em><b>Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_QOS_PROFILE__PROFILE_NAME = DDS_QOS_PROFILE__PROFILE_NAME;

	/**
	 * The feature id for the '<em><b>Topic Data Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_QOS_PROFILE__TOPIC_DATA_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Durability Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_QOS_PROFILE__DURABILITY_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Durability Service Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_QOS_PROFILE__DURABILITY_SERVICE_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Latency Budget Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_QOS_PROFILE__LATENCY_BUDGET_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Liveliness Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_QOS_PROFILE__LIVELINESS_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ownership Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_QOS_PROFILE__OWNERSHIP_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reliability Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_QOS_PROFILE__RELIABILITY_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Destination Order Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_QOS_PROFILE__DESTINATION_ORDER_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>History Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_QOS_PROFILE__HISTORY_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Resource Limits Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_QOS_PROFILE__RESOURCE_LIMITS_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Transport Priority Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_QOS_PROFILE__TRANSPORT_PRIORITY_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Lifespan Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_QOS_PROFILE__LIFESPAN_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Deadline Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_QOS_PROFILE__DEADLINE_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Dds Topic Qos Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_QOS_PROFILE_FEATURE_COUNT = DDS_QOS_PROFILE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Dds Topic Qos Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_QOS_PROFILE_OPERATION_COUNT = DDS_QOS_PROFILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsTopicDataQosImpl <em>Dds Topic Data Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsTopicDataQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsTopicDataQos()
	 * @generated
	 */
	int DDS_TOPIC_DATA_QOS = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_DATA_QOS__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Dds Topic Data Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_DATA_QOS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dds Topic Data Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_DATA_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDurabilityQosImpl <em>Dds Durability Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDurabilityQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDurabilityQos()
	 * @generated
	 */
	int DDS_DURABILITY_QOS = 16;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DURABILITY_QOS__KIND = 0;

	/**
	 * The number of structural features of the '<em>Dds Durability Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DURABILITY_QOS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dds Durability Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DURABILITY_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDurabilityServiceQosImpl <em>Dds Durability Service Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDurabilityServiceQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDurabilityServiceQos()
	 * @generated
	 */
	int DDS_DURABILITY_SERVICE_QOS = 17;

	/**
	 * The feature id for the '<em><b>Service cleanup delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DURABILITY_SERVICE_QOS__SERVICE_CLEANUP_DELAY = 0;

	/**
	 * The feature id for the '<em><b>History kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DURABILITY_SERVICE_QOS__HISTORY_KIND = 1;

	/**
	 * The feature id for the '<em><b>History depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DURABILITY_SERVICE_QOS__HISTORY_DEPTH = 2;

	/**
	 * The feature id for the '<em><b>Max samples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DURABILITY_SERVICE_QOS__MAX_SAMPLES = 3;

	/**
	 * The feature id for the '<em><b>Max instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DURABILITY_SERVICE_QOS__MAX_INSTANCES = 4;

	/**
	 * The feature id for the '<em><b>Max samples per instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DURABILITY_SERVICE_QOS__MAX_SAMPLES_PER_INSTANCES = 5;

	/**
	 * The number of structural features of the '<em>Dds Durability Service Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DURABILITY_SERVICE_QOS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Dds Durability Service Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DURABILITY_SERVICE_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDurationImpl <em>Dds Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDurationImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDuration()
	 * @generated
	 */
	int DDS_DURATION = 18;

	/**
	 * The feature id for the '<em><b>Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DURATION__SEC = 0;

	/**
	 * The feature id for the '<em><b>Nano Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DURATION__NANO_SEC = 1;

	/**
	 * The number of structural features of the '<em>Dds Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dds Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsPresentationQosImpl <em>Dds Presentation Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsPresentationQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsPresentationQos()
	 * @generated
	 */
	int DDS_PRESENTATION_QOS = 19;

	/**
	 * The feature id for the '<em><b>Access scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PRESENTATION_QOS__ACCESS_SCOPE = 0;

	/**
	 * The feature id for the '<em><b>Coherent access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PRESENTATION_QOS__COHERENT_ACCESS = 1;

	/**
	 * The feature id for the '<em><b>Ordered access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PRESENTATION_QOS__ORDERED_ACCESS = 2;

	/**
	 * The number of structural features of the '<em>Dds Presentation Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PRESENTATION_QOS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dds Presentation Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PRESENTATION_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDeadlineQosImpl <em>Dds Deadline Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDeadlineQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDeadlineQos()
	 * @generated
	 */
	int DDS_DEADLINE_QOS = 20;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DEADLINE_QOS__PERIOD = 0;

	/**
	 * The number of structural features of the '<em>Dds Deadline Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DEADLINE_QOS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dds Deadline Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DEADLINE_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsLatencyBudgetQosImpl <em>Dds Latency Budget Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsLatencyBudgetQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsLatencyBudgetQos()
	 * @generated
	 */
	int DDS_LATENCY_BUDGET_QOS = 21;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_LATENCY_BUDGET_QOS__DURATION = 0;

	/**
	 * The number of structural features of the '<em>Dds Latency Budget Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_LATENCY_BUDGET_QOS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dds Latency Budget Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_LATENCY_BUDGET_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsOwnershipQosImpl <em>Dds Ownership Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsOwnershipQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsOwnershipQos()
	 * @generated
	 */
	int DDS_OWNERSHIP_QOS = 22;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_OWNERSHIP_QOS__KIND = 0;

	/**
	 * The number of structural features of the '<em>Dds Ownership Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_OWNERSHIP_QOS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dds Ownership Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_OWNERSHIP_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsOwnershipStrengthQosImpl <em>Dds Ownership Strength Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsOwnershipStrengthQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsOwnershipStrengthQos()
	 * @generated
	 */
	int DDS_OWNERSHIP_STRENGTH_QOS = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_OWNERSHIP_STRENGTH_QOS__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Dds Ownership Strength Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_OWNERSHIP_STRENGTH_QOS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dds Ownership Strength Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_OWNERSHIP_STRENGTH_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsLivelinessQosImpl <em>Dds Liveliness Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsLivelinessQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsLivelinessQos()
	 * @generated
	 */
	int DDS_LIVELINESS_QOS = 24;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_LIVELINESS_QOS__KIND = 0;

	/**
	 * The feature id for the '<em><b>Lease duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_LIVELINESS_QOS__LEASE_DURATION = 1;

	/**
	 * The number of structural features of the '<em>Dds Liveliness Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_LIVELINESS_QOS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dds Liveliness Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_LIVELINESS_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsTimeBasedFilterQosImpl <em>Dds Time Based Filter Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsTimeBasedFilterQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsTimeBasedFilterQos()
	 * @generated
	 */
	int DDS_TIME_BASED_FILTER_QOS = 25;

	/**
	 * The feature id for the '<em><b>Minimum separation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TIME_BASED_FILTER_QOS__MINIMUM_SEPARATION = 0;

	/**
	 * The number of structural features of the '<em>Dds Time Based Filter Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TIME_BASED_FILTER_QOS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dds Time Based Filter Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TIME_BASED_FILTER_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsPartitionQosImpl <em>Dds Partition Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsPartitionQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsPartitionQos()
	 * @generated
	 */
	int DDS_PARTITION_QOS = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PARTITION_QOS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Dds Partition Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PARTITION_QOS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dds Partition Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PARTITION_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsReliabilityQosImpl <em>Dds Reliability Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsReliabilityQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsReliabilityQos()
	 * @generated
	 */
	int DDS_RELIABILITY_QOS = 27;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_RELIABILITY_QOS__KIND = 0;

	/**
	 * The feature id for the '<em><b>Max blocking time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_RELIABILITY_QOS__MAX_BLOCKING_TIME = 1;

	/**
	 * The number of structural features of the '<em>Dds Reliability Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_RELIABILITY_QOS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dds Reliability Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_RELIABILITY_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsTransportPriorityQosImpl <em>Dds Transport Priority Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsTransportPriorityQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsTransportPriorityQos()
	 * @generated
	 */
	int DDS_TRANSPORT_PRIORITY_QOS = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TRANSPORT_PRIORITY_QOS__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Dds Transport Priority Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TRANSPORT_PRIORITY_QOS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dds Transport Priority Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TRANSPORT_PRIORITY_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsLifespanImpl <em>Dds Lifespan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsLifespanImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsLifespan()
	 * @generated
	 */
	int DDS_LIFESPAN = 29;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_LIFESPAN__DURATION = 0;

	/**
	 * The number of structural features of the '<em>Dds Lifespan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_LIFESPAN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dds Lifespan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_LIFESPAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsHistoryQosImpl <em>Dds History Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsHistoryQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsHistoryQos()
	 * @generated
	 */
	int DDS_HISTORY_QOS = 30;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_HISTORY_QOS__KIND = 0;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_HISTORY_QOS__DEPTH = 1;

	/**
	 * The number of structural features of the '<em>Dds History Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_HISTORY_QOS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dds History Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_HISTORY_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsResourceLimitsImpl <em>Dds Resource Limits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsResourceLimitsImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsResourceLimits()
	 * @generated
	 */
	int DDS_RESOURCE_LIMITS = 31;

	/**
	 * The feature id for the '<em><b>Max samples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_RESOURCE_LIMITS__MAX_SAMPLES = 0;

	/**
	 * The feature id for the '<em><b>Max instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_RESOURCE_LIMITS__MAX_INSTANCES = 1;

	/**
	 * The feature id for the '<em><b>Max samples per instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_RESOURCE_LIMITS__MAX_SAMPLES_PER_INSTANCES = 2;

	/**
	 * The number of structural features of the '<em>Dds Resource Limits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_RESOURCE_LIMITS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dds Resource Limits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_RESOURCE_LIMITS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDataWriterLifecycleQosImpl <em>Dds Data Writer Lifecycle Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDataWriterLifecycleQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataWriterLifecycleQos()
	 * @generated
	 */
	int DDS_DATA_WRITER_LIFECYCLE_QOS = 32;

	/**
	 * The feature id for the '<em><b>Autodispose unregistered instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_LIFECYCLE_QOS__AUTODISPOSE_UNREGISTERED_INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Autopurge suspended samples delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOPURGE_SUSPENDED_SAMPLES_DELAY = 1;

	/**
	 * The feature id for the '<em><b>Autounregister instance delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOUNREGISTER_INSTANCE_DELAY = 2;

	/**
	 * The number of structural features of the '<em>Dds Data Writer Lifecycle Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_LIFECYCLE_QOS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dds Data Writer Lifecycle Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_LIFECYCLE_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDataReaderLifecycleQosImpl <em>Dds Data Reader Lifecycle Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDataReaderLifecycleQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataReaderLifecycleQos()
	 * @generated
	 */
	int DDS_DATA_READER_LIFECYCLE_QOS = 33;

	/**
	 * The feature id for the '<em><b>Autopurge nowriters samples delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_NOWRITERS_SAMPLES_DELAY = 0;

	/**
	 * The feature id for the '<em><b>Autopurge disposed samples delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSED_SAMPLES_DELAY = 1;

	/**
	 * The feature id for the '<em><b>Autopurge dispose all</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSE_ALL = 2;

	/**
	 * The feature id for the '<em><b>Enable invalid samples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_LIFECYCLE_QOS__ENABLE_INVALID_SAMPLES = 3;

	/**
	 * The number of structural features of the '<em>Dds Data Reader Lifecycle Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_LIFECYCLE_QOS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dds Data Reader Lifecycle Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_LIFECYCLE_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDestinationOrderQosImpl <em>Dds Destination Order Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDestinationOrderQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDestinationOrderQos()
	 * @generated
	 */
	int DDS_DESTINATION_ORDER_QOS = 34;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DESTINATION_ORDER_QOS__KIND = 0;

	/**
	 * The number of structural features of the '<em>Dds Destination Order Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DESTINATION_ORDER_QOS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dds Destination Order Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DESTINATION_ORDER_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsPublisherQosProfileImpl <em>Dds Publisher Qos Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsPublisherQosProfileImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsPublisherQosProfile()
	 * @generated
	 */
	int DDS_PUBLISHER_QOS_PROFILE = 35;

	/**
	 * The feature id for the '<em><b>Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER_QOS_PROFILE__PROFILE_NAME = DDS_QOS_PROFILE__PROFILE_NAME;

	/**
	 * The feature id for the '<em><b>Group Data Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER_QOS_PROFILE__GROUP_DATA_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Factory Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER_QOS_PROFILE__ENTITY_FACTORY_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Presentation Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER_QOS_PROFILE__PRESENTATION_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Partition Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER_QOS_PROFILE__PARTITION_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dds Publisher Qos Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER_QOS_PROFILE_FEATURE_COUNT = DDS_QOS_PROFILE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Dds Publisher Qos Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER_QOS_PROFILE_OPERATION_COUNT = DDS_QOS_PROFILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsGroupDataQosImpl <em>Dds Group Data Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsGroupDataQosImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsGroupDataQos()
	 * @generated
	 */
	int DDS_GROUP_DATA_QOS = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_GROUP_DATA_QOS__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Dds Group Data Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_GROUP_DATA_QOS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dds Group Data Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_GROUP_DATA_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDataWriterQosProfileImpl <em>Dds Data Writer Qos Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDataWriterQosProfileImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataWriterQosProfile()
	 * @generated
	 */
	int DDS_DATA_WRITER_QOS_PROFILE = 37;

	/**
	 * The feature id for the '<em><b>Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_QOS_PROFILE__PROFILE_NAME = DDS_QOS_PROFILE__PROFILE_NAME;

	/**
	 * The feature id for the '<em><b>User Data Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_QOS_PROFILE__USER_DATA_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Durability Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_QOS_PROFILE__DURABILITY_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deadline Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_QOS_PROFILE__DEADLINE_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Latency Budget Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_QOS_PROFILE__LATENCY_BUDGET_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ownership Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ownership Strength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_STRENGTH = DDS_QOS_PROFILE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Liveliness Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_QOS_PROFILE__LIVELINESS_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reliability Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_QOS_PROFILE__RELIABILITY_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Transport Priority Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_QOS_PROFILE__TRANSPORT_PRIORITY_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Lifespan Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_QOS_PROFILE__LIFESPAN_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Destination Order Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_QOS_PROFILE__DESTINATION_ORDER_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>History Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_QOS_PROFILE__HISTORY_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Resource Limits Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_QOS_PROFILE__RESOURCE_LIMITS_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Data Writer Lifecycle Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_QOS_PROFILE__DATA_WRITER_LIFECYCLE_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Dds Data Writer Qos Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_QOS_PROFILE_FEATURE_COUNT = DDS_QOS_PROFILE_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Dds Data Writer Qos Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_QOS_PROFILE_OPERATION_COUNT = DDS_QOS_PROFILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsSubscriberQosProfileImpl <em>Dds Subscriber Qos Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsSubscriberQosProfileImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsSubscriberQosProfile()
	 * @generated
	 */
	int DDS_SUBSCRIBER_QOS_PROFILE = 38;

	/**
	 * The feature id for the '<em><b>Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER_QOS_PROFILE__PROFILE_NAME = DDS_QOS_PROFILE__PROFILE_NAME;

	/**
	 * The feature id for the '<em><b>Group Data Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER_QOS_PROFILE__GROUP_DATA_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Factory Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER_QOS_PROFILE__ENTITY_FACTORY_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Presentation Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER_QOS_PROFILE__PRESENTATION_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Partition Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER_QOS_PROFILE__PARTITION_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dds Subscriber Qos Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER_QOS_PROFILE_FEATURE_COUNT = DDS_QOS_PROFILE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Dds Subscriber Qos Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER_QOS_PROFILE_OPERATION_COUNT = DDS_QOS_PROFILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDataReaderQosProfileImpl <em>Dds Data Reader Qos Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDataReaderQosProfileImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataReaderQosProfile()
	 * @generated
	 */
	int DDS_DATA_READER_QOS_PROFILE = 39;

	/**
	 * The feature id for the '<em><b>Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_QOS_PROFILE__PROFILE_NAME = DDS_QOS_PROFILE__PROFILE_NAME;

	/**
	 * The feature id for the '<em><b>User Data Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_QOS_PROFILE__USER_DATA_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Durability Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_QOS_PROFILE__DURABILITY_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deadline Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_QOS_PROFILE__DEADLINE_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Latency Budget Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_QOS_PROFILE__LATENCY_BUDGET_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Liveliness Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_QOS_PROFILE__LIVELINESS_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ownership Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_QOS_PROFILE__OWNERSHIP_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Time Based Filter Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_QOS_PROFILE__TIME_BASED_FILTER_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reliability Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_QOS_PROFILE__RELIABILITY_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Destination Order Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_QOS_PROFILE__DESTINATION_ORDER_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>History Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_QOS_PROFILE__HISTORY_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Resource Limits Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_QOS_PROFILE__RESOURCE_LIMITS_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Data Reader Lifecycle Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_QOS_PROFILE__DATA_READER_LIFECYCLE_QOS = DDS_QOS_PROFILE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Dds Data Reader Qos Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_QOS_PROFILE_FEATURE_COUNT = DDS_QOS_PROFILE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Dds Data Reader Qos Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_QOS_PROFILE_OPERATION_COUNT = DDS_QOS_PROFILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDomainParticipantListenerImpl <em>Dds Domain Participant Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDomainParticipantListenerImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDomainParticipantListener()
	 * @generated
	 */
	int DDS_DOMAIN_PARTICIPANT_LISTENER = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT_LISTENER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Listened Status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT_LISTENER__LISTENED_STATUS = 1;

	/**
	 * The number of structural features of the '<em>Dds Domain Participant Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT_LISTENER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dds Domain Participant Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT_LISTENER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsSubscriberListenerImpl <em>Dds Subscriber Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsSubscriberListenerImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsSubscriberListener()
	 * @generated
	 */
	int DDS_SUBSCRIBER_LISTENER = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER_LISTENER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Listened Status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER_LISTENER__LISTENED_STATUS = 1;

	/**
	 * The number of structural features of the '<em>Dds Subscriber Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER_LISTENER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dds Subscriber Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER_LISTENER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsPublisherListenerImpl <em>Dds Publisher Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsPublisherListenerImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsPublisherListener()
	 * @generated
	 */
	int DDS_PUBLISHER_LISTENER = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER_LISTENER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Listened Status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER_LISTENER__LISTENED_STATUS = 1;

	/**
	 * The number of structural features of the '<em>Dds Publisher Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER_LISTENER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dds Publisher Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER_LISTENER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDataReaderListenerImpl <em>Dds Data Reader Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDataReaderListenerImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataReaderListener()
	 * @generated
	 */
	int DDS_DATA_READER_LISTENER = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_LISTENER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Listened Status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_LISTENER__LISTENED_STATUS = 1;

	/**
	 * The number of structural features of the '<em>Dds Data Reader Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_LISTENER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dds Data Reader Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_LISTENER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDataWriterListenerImpl <em>Dds Data Writer Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDataWriterListenerImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataWriterListener()
	 * @generated
	 */
	int DDS_DATA_WRITER_LISTENER = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_LISTENER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Listened Status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_LISTENER__LISTENED_STATUS = 1;

	/**
	 * The number of structural features of the '<em>Dds Data Writer Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_LISTENER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dds Data Writer Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_LISTENER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsTopicListenerImpl <em>Dds Topic Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsTopicListenerImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsTopicListener()
	 * @generated
	 */
	int DDS_TOPIC_LISTENER = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_LISTENER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Listened Status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_LISTENER__LISTENED_STATUS = 1;

	/**
	 * The number of structural features of the '<em>Dds Topic Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_LISTENER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dds Topic Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_LISTENER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsWaitSetImpl <em>Dds Wait Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsWaitSetImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsWaitSet()
	 * @generated
	 */
	int DDS_WAIT_SET = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_WAIT_SET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Read Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_WAIT_SET__READ_CONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Status Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_WAIT_SET__STATUS_CONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Guard Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_WAIT_SET__GUARD_CONDITIONS = 3;

	/**
	 * The number of structural features of the '<em>Dds Wait Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_WAIT_SET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dds Wait Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_WAIT_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsReadConditionImpl <em>Dds Read Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsReadConditionImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsReadCondition()
	 * @generated
	 */
	int DDS_READ_CONDITION = 47;

	/**
	 * The feature id for the '<em><b>View state mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_READ_CONDITION__VIEW_STATE_MASK = 0;

	/**
	 * The feature id for the '<em><b>Instance state mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_READ_CONDITION__INSTANCE_STATE_MASK = 1;

	/**
	 * The feature id for the '<em><b>Sample state mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_READ_CONDITION__SAMPLE_STATE_MASK = 2;

	/**
	 * The feature id for the '<em><b>Data Reader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_READ_CONDITION__DATA_READER = 3;

	/**
	 * The number of structural features of the '<em>Dds Read Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_READ_CONDITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dds Read Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_READ_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsStructuredFieldImpl <em>Dds Structured Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsStructuredFieldImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsStructuredField()
	 * @generated
	 */
	int DDS_STRUCTURED_FIELD = 48;

	/**
	 * The feature id for the '<em><b>Is Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_STRUCTURED_FIELD__IS_KEY = 0;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_STRUCTURED_FIELD__REFERENCED_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Data Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_STRUCTURED_FIELD__DATA_STRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_STRUCTURED_FIELD__FIELD_NAME = 3;

	/**
	 * The feature id for the '<em><b>Max Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_STRUCTURED_FIELD__MAX_MULTIPLICITY = 4;

	/**
	 * The number of structural features of the '<em>Dds Structured Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_STRUCTURED_FIELD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Dds Structured Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_STRUCTURED_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsStatusConditionImpl <em>Dds Status Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsStatusConditionImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsStatusCondition()
	 * @generated
	 */
	int DDS_STATUS_CONDITION = 49;

	/**
	 * The feature id for the '<em><b>Containing Waitset</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_STATUS_CONDITION__CONTAINING_WAITSET = 0;

	/**
	 * The number of structural features of the '<em>Dds Status Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_STATUS_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dds Status Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_STATUS_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDomainParticipantStatusConditionImpl <em>Dds Domain Participant Status Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDomainParticipantStatusConditionImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDomainParticipantStatusCondition()
	 * @generated
	 */
	int DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION = 50;

	/**
	 * The feature id for the '<em><b>Containing Waitset</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION__CONTAINING_WAITSET = DDS_STATUS_CONDITION__CONTAINING_WAITSET;

	/**
	 * The feature id for the '<em><b>Enabled status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION__ENABLED_STATUS = DDS_STATUS_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION__DOMAIN_PARTICIPANT = DDS_STATUS_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dds Domain Participant Status Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION_FEATURE_COUNT = DDS_STATUS_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dds Domain Participant Status Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION_OPERATION_COUNT = DDS_STATUS_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsPublisherStatusConditionImpl <em>Dds Publisher Status Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsPublisherStatusConditionImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsPublisherStatusCondition()
	 * @generated
	 */
	int DDS_PUBLISHER_STATUS_CONDITION = 51;

	/**
	 * The feature id for the '<em><b>Containing Waitset</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER_STATUS_CONDITION__CONTAINING_WAITSET = DDS_STATUS_CONDITION__CONTAINING_WAITSET;

	/**
	 * The feature id for the '<em><b>Enabled status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER_STATUS_CONDITION__ENABLED_STATUS = DDS_STATUS_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER_STATUS_CONDITION__PUBLISHER = DDS_STATUS_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dds Publisher Status Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER_STATUS_CONDITION_FEATURE_COUNT = DDS_STATUS_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dds Publisher Status Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_PUBLISHER_STATUS_CONDITION_OPERATION_COUNT = DDS_STATUS_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsSubscriberStatusConditionImpl <em>Dds Subscriber Status Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsSubscriberStatusConditionImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsSubscriberStatusCondition()
	 * @generated
	 */
	int DDS_SUBSCRIBER_STATUS_CONDITION = 52;

	/**
	 * The feature id for the '<em><b>Containing Waitset</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER_STATUS_CONDITION__CONTAINING_WAITSET = DDS_STATUS_CONDITION__CONTAINING_WAITSET;

	/**
	 * The feature id for the '<em><b>Enabled status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER_STATUS_CONDITION__ENABLED_STATUS = DDS_STATUS_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscriber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER_STATUS_CONDITION__SUBSCRIBER = DDS_STATUS_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dds Subscriber Status Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER_STATUS_CONDITION_FEATURE_COUNT = DDS_STATUS_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dds Subscriber Status Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SUBSCRIBER_STATUS_CONDITION_OPERATION_COUNT = DDS_STATUS_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDataWriterStatusConditionImpl <em>Dds Data Writer Status Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDataWriterStatusConditionImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataWriterStatusCondition()
	 * @generated
	 */
	int DDS_DATA_WRITER_STATUS_CONDITION = 53;

	/**
	 * The feature id for the '<em><b>Containing Waitset</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_STATUS_CONDITION__CONTAINING_WAITSET = DDS_STATUS_CONDITION__CONTAINING_WAITSET;

	/**
	 * The feature id for the '<em><b>Enabled status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_STATUS_CONDITION__ENABLED_STATUS = DDS_STATUS_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Writer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_STATUS_CONDITION__DATA_WRITER = DDS_STATUS_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dds Data Writer Status Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_STATUS_CONDITION_FEATURE_COUNT = DDS_STATUS_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dds Data Writer Status Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_WRITER_STATUS_CONDITION_OPERATION_COUNT = DDS_STATUS_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsDataReaderStatusConditionImpl <em>Dds Data Reader Status Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsDataReaderStatusConditionImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataReaderStatusCondition()
	 * @generated
	 */
	int DDS_DATA_READER_STATUS_CONDITION = 54;

	/**
	 * The feature id for the '<em><b>Containing Waitset</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_STATUS_CONDITION__CONTAINING_WAITSET = DDS_STATUS_CONDITION__CONTAINING_WAITSET;

	/**
	 * The feature id for the '<em><b>Enabled status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_STATUS_CONDITION__ENABLED_STATUS = DDS_STATUS_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Reader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_STATUS_CONDITION__DATA_READER = DDS_STATUS_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dds Data Reader Status Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_STATUS_CONDITION_FEATURE_COUNT = DDS_STATUS_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dds Data Reader Status Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_DATA_READER_STATUS_CONDITION_OPERATION_COUNT = DDS_STATUS_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsTopicStatusConditionImpl <em>Dds Topic Status Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsTopicStatusConditionImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsTopicStatusCondition()
	 * @generated
	 */
	int DDS_TOPIC_STATUS_CONDITION = 55;

	/**
	 * The feature id for the '<em><b>Containing Waitset</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_STATUS_CONDITION__CONTAINING_WAITSET = DDS_STATUS_CONDITION__CONTAINING_WAITSET;

	/**
	 * The feature id for the '<em><b>Enabled status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_STATUS_CONDITION__ENABLED_STATUS = DDS_STATUS_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_STATUS_CONDITION__TOPIC = DDS_STATUS_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dds Topic Status Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_STATUS_CONDITION_FEATURE_COUNT = DDS_STATUS_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dds Topic Status Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_TOPIC_STATUS_CONDITION_OPERATION_COUNT = DDS_STATUS_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.QueryConditionImpl <em>Query Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.QueryConditionImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getQueryCondition()
	 * @generated
	 */
	int QUERY_CONDITION = 56;

	/**
	 * The feature id for the '<em><b>View state mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONDITION__VIEW_STATE_MASK = DDS_READ_CONDITION__VIEW_STATE_MASK;

	/**
	 * The feature id for the '<em><b>Instance state mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONDITION__INSTANCE_STATE_MASK = DDS_READ_CONDITION__INSTANCE_STATE_MASK;

	/**
	 * The feature id for the '<em><b>Sample state mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONDITION__SAMPLE_STATE_MASK = DDS_READ_CONDITION__SAMPLE_STATE_MASK;

	/**
	 * The feature id for the '<em><b>Data Reader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONDITION__DATA_READER = DDS_READ_CONDITION__DATA_READER;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONDITION__QUERY = DDS_READ_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONDITION__QUERY_PARAMETERS = DDS_READ_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Query Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONDITION_FEATURE_COUNT = DDS_READ_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Query Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONDITION_OPERATION_COUNT = DDS_READ_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.GuardConditionImpl <em>Guard Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.GuardConditionImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getGuardCondition()
	 * @generated
	 */
	int GUARD_CONDITION = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_CONDITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Guard Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Guard Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsSystemImpl <em>Dds System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsSystemImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsSystem()
	 * @generated
	 */
	int DDS_SYSTEM = 58;

	/**
	 * The feature id for the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SYSTEM__SYSTEM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SYSTEM__HOSTS = 1;

	/**
	 * The feature id for the '<em><b>Qos Profiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SYSTEM__QOS_PROFILES = 2;

	/**
	 * The feature id for the '<em><b>Data Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SYSTEM__DATA_MODULES = 3;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SYSTEM__TOPICS = 4;

	/**
	 * The number of structural features of the '<em>Dds System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SYSTEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Dds System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.impl.DdsHostImpl <em>Dds Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.impl.DdsHostImpl
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsHost()
	 * @generated
	 */
	int DDS_HOST = 59;

	/**
	 * The feature id for the '<em><b>Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_HOST__HOST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_HOST__APPLICATIONS = 1;

	/**
	 * The number of structural features of the '<em>Dds Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_HOST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dds Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_HOST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ddsMetamodel.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.DurabilityQosPolicyKind
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDurabilityQosPolicyKind()
	 * @generated
	 */
	int DURABILITY_QOS_POLICY_KIND = 60;

	/**
	 * The meta object id for the '{@link ddsMetamodel.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.HistoryQosPolicyKind
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getHistoryQosPolicyKind()
	 * @generated
	 */
	int HISTORY_QOS_POLICY_KIND = 61;

	/**
	 * The meta object id for the '{@link ddsMetamodel.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.PresentationQosPolicyAccessScopeKind
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getPresentationQosPolicyAccessScopeKind()
	 * @generated
	 */
	int PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = 62;

	/**
	 * The meta object id for the '{@link ddsMetamodel.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.OwnershipQosPolicyKind
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getOwnershipQosPolicyKind()
	 * @generated
	 */
	int OWNERSHIP_QOS_POLICY_KIND = 63;

	/**
	 * The meta object id for the '{@link ddsMetamodel.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.LivelinessQosPolicyKind
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getLivelinessQosPolicyKind()
	 * @generated
	 */
	int LIVELINESS_QOS_POLICY_KIND = 64;

	/**
	 * The meta object id for the '{@link ddsMetamodel.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.ReliabilityQosPolicyKind
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getReliabilityQosPolicyKind()
	 * @generated
	 */
	int RELIABILITY_QOS_POLICY_KIND = 65;

	/**
	 * The meta object id for the '{@link ddsMetamodel.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.DestinationOrderQosPolicyKind
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDestinationOrderQosPolicyKind()
	 * @generated
	 */
	int DESTINATION_ORDER_QOS_POLICY_KIND = 66;

	/**
	 * The meta object id for the '{@link ddsMetamodel.InvalidSampleVisibilityQosPolicy <em>Invalid Sample Visibility Qos Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.InvalidSampleVisibilityQosPolicy
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getInvalidSampleVisibilityQosPolicy()
	 * @generated
	 */
	int INVALID_SAMPLE_VISIBILITY_QOS_POLICY = 67;

	/**
	 * The meta object id for the '{@link ddsMetamodel.ViewStateKind <em>View State Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.ViewStateKind
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getViewStateKind()
	 * @generated
	 */
	int VIEW_STATE_KIND = 68;

	/**
	 * The meta object id for the '{@link ddsMetamodel.InstanceStateKind <em>Instance State Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.InstanceStateKind
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getInstanceStateKind()
	 * @generated
	 */
	int INSTANCE_STATE_KIND = 69;

	/**
	 * The meta object id for the '{@link ddsMetamodel.SampleStateKind <em>Sample State Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.SampleStateKind
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getSampleStateKind()
	 * @generated
	 */
	int SAMPLE_STATE_KIND = 70;


	/**
	 * The meta object id for the '{@link ddsMetamodel.DomainParticipantStatus <em>Domain Participant Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.DomainParticipantStatus
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDomainParticipantStatus()
	 * @generated
	 */
	int DOMAIN_PARTICIPANT_STATUS = 71;

	/**
	 * The meta object id for the '{@link ddsMetamodel.SubscriberStatus <em>Subscriber Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.SubscriberStatus
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getSubscriberStatus()
	 * @generated
	 */
	int SUBSCRIBER_STATUS = 72;

	/**
	 * The meta object id for the '{@link ddsMetamodel.PublisherStatus <em>Publisher Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.PublisherStatus
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getPublisherStatus()
	 * @generated
	 */
	int PUBLISHER_STATUS = 73;

	/**
	 * The meta object id for the '{@link ddsMetamodel.DataWriterStatus <em>Data Writer Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.DataWriterStatus
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDataWriterStatus()
	 * @generated
	 */
	int DATA_WRITER_STATUS = 74;

	/**
	 * The meta object id for the '{@link ddsMetamodel.DataReaderStatus <em>Data Reader Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.DataReaderStatus
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDataReaderStatus()
	 * @generated
	 */
	int DATA_READER_STATUS = 75;

	/**
	 * The meta object id for the '{@link ddsMetamodel.TopicStatus <em>Topic Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ddsMetamodel.TopicStatus
	 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getTopicStatus()
	 * @generated
	 */
	int TOPIC_STATUS = 76;


	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsApplication <em>Dds Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Application</em>'.
	 * @see ddsMetamodel.DdsApplication
	 * @generated
	 */
	EClass getDdsApplication();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsApplication#getApplicationName <em>Application Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Name</em>'.
	 * @see ddsMetamodel.DdsApplication#getApplicationName()
	 * @see #getDdsApplication()
	 * @generated
	 */
	EAttribute getDdsApplication_ApplicationName();

	/**
	 * Returns the meta object for the containment reference list '{@link ddsMetamodel.DdsApplication#getDomainParticipants <em>Domain Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Participants</em>'.
	 * @see ddsMetamodel.DdsApplication#getDomainParticipants()
	 * @see #getDdsApplication()
	 * @generated
	 */
	EReference getDdsApplication_DomainParticipants();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsApplication#getWaitset <em>Waitset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Waitset</em>'.
	 * @see ddsMetamodel.DdsApplication#getWaitset()
	 * @see #getDdsApplication()
	 * @generated
	 */
	EReference getDdsApplication_Waitset();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDomainParticipant <em>Dds Domain Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Domain Participant</em>'.
	 * @see ddsMetamodel.DdsDomainParticipant
	 * @generated
	 */
	EClass getDdsDomainParticipant();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDomainParticipant#getDomainParticipantName <em>Domain Participant Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Participant Name</em>'.
	 * @see ddsMetamodel.DdsDomainParticipant#getDomainParticipantName()
	 * @see #getDdsDomainParticipant()
	 * @generated
	 */
	EAttribute getDdsDomainParticipant_DomainParticipantName();

	/**
	 * Returns the meta object for the containment reference list '{@link ddsMetamodel.DdsDomainParticipant#getDdssubscriber <em>Ddssubscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ddssubscriber</em>'.
	 * @see ddsMetamodel.DdsDomainParticipant#getDdssubscriber()
	 * @see #getDdsDomainParticipant()
	 * @generated
	 */
	EReference getDdsDomainParticipant_Ddssubscriber();

	/**
	 * Returns the meta object for the containment reference list '{@link ddsMetamodel.DdsDomainParticipant#getDdspublisher <em>Ddspublisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ddspublisher</em>'.
	 * @see ddsMetamodel.DdsDomainParticipant#getDdspublisher()
	 * @see #getDdsDomainParticipant()
	 * @generated
	 */
	EReference getDdsDomainParticipant_Ddspublisher();

	/**
	 * Returns the meta object for the reference '{@link ddsMetamodel.DdsDomainParticipant#getDdsdomainparticipantqosprofile <em>Ddsdomainparticipantqosprofile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ddsdomainparticipantqosprofile</em>'.
	 * @see ddsMetamodel.DdsDomainParticipant#getDdsdomainparticipantqosprofile()
	 * @see #getDdsDomainParticipant()
	 * @generated
	 */
	EReference getDdsDomainParticipant_Ddsdomainparticipantqosprofile();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDomainParticipant#getDomainParticipantListener <em>Domain Participant Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Participant Listener</em>'.
	 * @see ddsMetamodel.DdsDomainParticipant#getDomainParticipantListener()
	 * @see #getDdsDomainParticipant()
	 * @generated
	 */
	EReference getDdsDomainParticipant_DomainParticipantListener();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDomainParticipant#getDomainId <em>Domain Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Id</em>'.
	 * @see ddsMetamodel.DdsDomainParticipant#getDomainId()
	 * @see #getDdsDomainParticipant()
	 * @generated
	 */
	EAttribute getDdsDomainParticipant_DomainId();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsTopic <em>Dds Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Topic</em>'.
	 * @see ddsMetamodel.DdsTopic
	 * @generated
	 */
	EClass getDdsTopic();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsTopic#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see ddsMetamodel.DdsTopic#getTopicName()
	 * @see #getDdsTopic()
	 * @generated
	 */
	EAttribute getDdsTopic_TopicName();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsTopic#getTopicListener <em>Topic Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Topic Listener</em>'.
	 * @see ddsMetamodel.DdsTopic#getTopicListener()
	 * @see #getDdsTopic()
	 * @generated
	 */
	EReference getDdsTopic_TopicListener();

	/**
	 * Returns the meta object for the reference '{@link ddsMetamodel.DdsTopic#getTopicQosProfile <em>Topic Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic Qos Profile</em>'.
	 * @see ddsMetamodel.DdsTopic#getTopicQosProfile()
	 * @see #getDdsTopic()
	 * @generated
	 */
	EReference getDdsTopic_TopicQosProfile();

	/**
	 * Returns the meta object for the reference '{@link ddsMetamodel.DdsTopic#getDdsdatastructure <em>Ddsdatastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ddsdatastructure</em>'.
	 * @see ddsMetamodel.DdsTopic#getDdsdatastructure()
	 * @see #getDdsTopic()
	 * @generated
	 */
	EReference getDdsTopic_Ddsdatastructure();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsQosProfile <em>Dds Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Qos Profile</em>'.
	 * @see ddsMetamodel.DdsQosProfile
	 * @generated
	 */
	EClass getDdsQosProfile();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsQosProfile#getProfileName <em>Profile Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Name</em>'.
	 * @see ddsMetamodel.DdsQosProfile#getProfileName()
	 * @see #getDdsQosProfile()
	 * @generated
	 */
	EAttribute getDdsQosProfile_ProfileName();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsSubscriber <em>Dds Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Subscriber</em>'.
	 * @see ddsMetamodel.DdsSubscriber
	 * @generated
	 */
	EClass getDdsSubscriber();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsSubscriber#getSubscriberName <em>Subscriber Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscriber Name</em>'.
	 * @see ddsMetamodel.DdsSubscriber#getSubscriberName()
	 * @see #getDdsSubscriber()
	 * @generated
	 */
	EAttribute getDdsSubscriber_SubscriberName();

	/**
	 * Returns the meta object for the containment reference list '{@link ddsMetamodel.DdsSubscriber#getDdsdatareader <em>Ddsdatareader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ddsdatareader</em>'.
	 * @see ddsMetamodel.DdsSubscriber#getDdsdatareader()
	 * @see #getDdsSubscriber()
	 * @generated
	 */
	EReference getDdsSubscriber_Ddsdatareader();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsSubscriber#getSubscriberListener <em>Subscriber Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscriber Listener</em>'.
	 * @see ddsMetamodel.DdsSubscriber#getSubscriberListener()
	 * @see #getDdsSubscriber()
	 * @generated
	 */
	EReference getDdsSubscriber_SubscriberListener();

	/**
	 * Returns the meta object for the reference '{@link ddsMetamodel.DdsSubscriber#getSubscriberQosProfile <em>Subscriber Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscriber Qos Profile</em>'.
	 * @see ddsMetamodel.DdsSubscriber#getSubscriberQosProfile()
	 * @see #getDdsSubscriber()
	 * @generated
	 */
	EReference getDdsSubscriber_SubscriberQosProfile();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDataReader <em>Dds Data Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Data Reader</em>'.
	 * @see ddsMetamodel.DdsDataReader
	 * @generated
	 */
	EClass getDdsDataReader();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDataReader#getDataReaderName <em>Data Reader Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Reader Name</em>'.
	 * @see ddsMetamodel.DdsDataReader#getDataReaderName()
	 * @see #getDdsDataReader()
	 * @generated
	 */
	EAttribute getDdsDataReader_DataReaderName();

	/**
	 * Returns the meta object for the reference '{@link ddsMetamodel.DdsDataReader#getReadableTopic <em>Readable Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Readable Topic</em>'.
	 * @see ddsMetamodel.DdsDataReader#getReadableTopic()
	 * @see #getDdsDataReader()
	 * @generated
	 */
	EReference getDdsDataReader_ReadableTopic();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataReader#getDataReaderListener <em>Data Reader Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Reader Listener</em>'.
	 * @see ddsMetamodel.DdsDataReader#getDataReaderListener()
	 * @see #getDdsDataReader()
	 * @generated
	 */
	EReference getDdsDataReader_DataReaderListener();

	/**
	 * Returns the meta object for the reference '{@link ddsMetamodel.DdsDataReader#getDataReaderQosProfile <em>Data Reader Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Reader Qos Profile</em>'.
	 * @see ddsMetamodel.DdsDataReader#getDataReaderQosProfile()
	 * @see #getDdsDataReader()
	 * @generated
	 */
	EReference getDdsDataReader_DataReaderQosProfile();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsPublisher <em>Dds Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Publisher</em>'.
	 * @see ddsMetamodel.DdsPublisher
	 * @generated
	 */
	EClass getDdsPublisher();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsPublisher#getPublisherName <em>Publisher Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher Name</em>'.
	 * @see ddsMetamodel.DdsPublisher#getPublisherName()
	 * @see #getDdsPublisher()
	 * @generated
	 */
	EAttribute getDdsPublisher_PublisherName();

	/**
	 * Returns the meta object for the containment reference list '{@link ddsMetamodel.DdsPublisher#getDdsdatawriter <em>Ddsdatawriter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ddsdatawriter</em>'.
	 * @see ddsMetamodel.DdsPublisher#getDdsdatawriter()
	 * @see #getDdsPublisher()
	 * @generated
	 */
	EReference getDdsPublisher_Ddsdatawriter();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsPublisher#getPublisherListener <em>Publisher Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Listener</em>'.
	 * @see ddsMetamodel.DdsPublisher#getPublisherListener()
	 * @see #getDdsPublisher()
	 * @generated
	 */
	EReference getDdsPublisher_PublisherListener();

	/**
	 * Returns the meta object for the reference '{@link ddsMetamodel.DdsPublisher#getPublisherQosProfile <em>Publisher Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publisher Qos Profile</em>'.
	 * @see ddsMetamodel.DdsPublisher#getPublisherQosProfile()
	 * @see #getDdsPublisher()
	 * @generated
	 */
	EReference getDdsPublisher_PublisherQosProfile();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDataWriter <em>Dds Data Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Data Writer</em>'.
	 * @see ddsMetamodel.DdsDataWriter
	 * @generated
	 */
	EClass getDdsDataWriter();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDataWriter#getDataWriterName <em>Data Writer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Writer Name</em>'.
	 * @see ddsMetamodel.DdsDataWriter#getDataWriterName()
	 * @see #getDdsDataWriter()
	 * @generated
	 */
	EAttribute getDdsDataWriter_DataWriterName();

	/**
	 * Returns the meta object for the reference '{@link ddsMetamodel.DdsDataWriter#getPubliableTopic <em>Publiable Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publiable Topic</em>'.
	 * @see ddsMetamodel.DdsDataWriter#getPubliableTopic()
	 * @see #getDdsDataWriter()
	 * @generated
	 */
	EReference getDdsDataWriter_PubliableTopic();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataWriter#getDataWriterListener <em>Data Writer Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Writer Listener</em>'.
	 * @see ddsMetamodel.DdsDataWriter#getDataWriterListener()
	 * @see #getDdsDataWriter()
	 * @generated
	 */
	EReference getDdsDataWriter_DataWriterListener();

	/**
	 * Returns the meta object for the reference '{@link ddsMetamodel.DdsDataWriter#getDataWriterQosProfile <em>Data Writer Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Writer Qos Profile</em>'.
	 * @see ddsMetamodel.DdsDataWriter#getDataWriterQosProfile()
	 * @see #getDdsDataWriter()
	 * @generated
	 */
	EReference getDdsDataWriter_DataWriterQosProfile();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDataModule <em>Dds Data Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Data Module</em>'.
	 * @see ddsMetamodel.DdsDataModule
	 * @generated
	 */
	EClass getDdsDataModule();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDataModule#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Name</em>'.
	 * @see ddsMetamodel.DdsDataModule#getModuleName()
	 * @see #getDdsDataModule()
	 * @generated
	 */
	EAttribute getDdsDataModule_ModuleName();

	/**
	 * Returns the meta object for the containment reference list '{@link ddsMetamodel.DdsDataModule#getDataStructures <em>Data Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Structures</em>'.
	 * @see ddsMetamodel.DdsDataModule#getDataStructures()
	 * @see #getDdsDataModule()
	 * @generated
	 */
	EReference getDdsDataModule_DataStructures();

	/**
	 * Returns the meta object for the containment reference list '{@link ddsMetamodel.DdsDataModule#getInnerModules <em>Inner Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inner Modules</em>'.
	 * @see ddsMetamodel.DdsDataModule#getInnerModules()
	 * @see #getDdsDataModule()
	 * @generated
	 */
	EReference getDdsDataModule_InnerModules();

	/**
	 * Returns the meta object for the container reference '{@link ddsMetamodel.DdsDataModule#getContainingSystem <em>Containing System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing System</em>'.
	 * @see ddsMetamodel.DdsDataModule#getContainingSystem()
	 * @see #getDdsDataModule()
	 * @generated
	 */
	EReference getDdsDataModule_ContainingSystem();

	/**
	 * Returns the meta object for the container reference '{@link ddsMetamodel.DdsDataModule#getContainingModule <em>Containing Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Module</em>'.
	 * @see ddsMetamodel.DdsDataModule#getContainingModule()
	 * @see #getDdsDataModule()
	 * @generated
	 */
	EReference getDdsDataModule_ContainingModule();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDataStructure <em>Dds Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Data Structure</em>'.
	 * @see ddsMetamodel.DdsDataStructure
	 * @generated
	 */
	EClass getDdsDataStructure();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDataStructure#getStructureName <em>Structure Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structure Name</em>'.
	 * @see ddsMetamodel.DdsDataStructure#getStructureName()
	 * @see #getDdsDataStructure()
	 * @generated
	 */
	EAttribute getDdsDataStructure_StructureName();

	/**
	 * Returns the meta object for the containment reference list '{@link ddsMetamodel.DdsDataStructure#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see ddsMetamodel.DdsDataStructure#getFields()
	 * @see #getDdsDataStructure()
	 * @generated
	 */
	EReference getDdsDataStructure_Fields();

	/**
	 * Returns the meta object for the containment reference list '{@link ddsMetamodel.DdsDataStructure#getStructuredFields <em>Structured Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structured Fields</em>'.
	 * @see ddsMetamodel.DdsDataStructure#getStructuredFields()
	 * @see #getDdsDataStructure()
	 * @generated
	 */
	EReference getDdsDataStructure_StructuredFields();

	/**
	 * Returns the meta object for the container reference '{@link ddsMetamodel.DdsDataStructure#getContainerDataModule <em>Container Data Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Data Module</em>'.
	 * @see ddsMetamodel.DdsDataStructure#getContainerDataModule()
	 * @see #getDdsDataStructure()
	 * @generated
	 */
	EReference getDdsDataStructure_ContainerDataModule();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDataField <em>Dds Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Data Field</em>'.
	 * @see ddsMetamodel.DdsDataField
	 * @generated
	 */
	EClass getDdsDataField();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDataField#getFieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Type</em>'.
	 * @see ddsMetamodel.DdsDataField#getFieldType()
	 * @see #getDdsDataField()
	 * @generated
	 */
	EAttribute getDdsDataField_FieldType();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDataField#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see ddsMetamodel.DdsDataField#getFieldName()
	 * @see #getDdsDataField()
	 * @generated
	 */
	EAttribute getDdsDataField_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDataField#isIsKey <em>Is Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Key</em>'.
	 * @see ddsMetamodel.DdsDataField#isIsKey()
	 * @see #getDdsDataField()
	 * @generated
	 */
	EAttribute getDdsDataField_IsKey();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDataField#getMaxMultiplicity <em>Max Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Multiplicity</em>'.
	 * @see ddsMetamodel.DdsDataField#getMaxMultiplicity()
	 * @see #getDdsDataField()
	 * @generated
	 */
	EAttribute getDdsDataField_MaxMultiplicity();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDomainParticipantQosProfile <em>Dds Domain Participant Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Domain Participant Qos Profile</em>'.
	 * @see ddsMetamodel.DdsDomainParticipantQosProfile
	 * @generated
	 */
	EClass getDdsDomainParticipantQosProfile();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDomainParticipantQosProfile#getUserDataQos <em>User Data Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Data Qos</em>'.
	 * @see ddsMetamodel.DdsDomainParticipantQosProfile#getUserDataQos()
	 * @see #getDdsDomainParticipantQosProfile()
	 * @generated
	 */
	EReference getDdsDomainParticipantQosProfile_UserDataQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDomainParticipantQosProfile#getEntityFactoryQos <em>Entity Factory Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Factory Qos</em>'.
	 * @see ddsMetamodel.DdsDomainParticipantQosProfile#getEntityFactoryQos()
	 * @see #getDdsDomainParticipantQosProfile()
	 * @generated
	 */
	EReference getDdsDomainParticipantQosProfile_EntityFactoryQos();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsUserDataQos <em>Dds User Data Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds User Data Qos</em>'.
	 * @see ddsMetamodel.DdsUserDataQos
	 * @generated
	 */
	EClass getDdsUserDataQos();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsUserDataQos#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ddsMetamodel.DdsUserDataQos#getValue()
	 * @see #getDdsUserDataQos()
	 * @generated
	 */
	EAttribute getDdsUserDataQos_Value();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsEntityFactoryQos <em>Dds Entity Factory Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Entity Factory Qos</em>'.
	 * @see ddsMetamodel.DdsEntityFactoryQos
	 * @generated
	 */
	EClass getDdsEntityFactoryQos();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsEntityFactoryQos#isAutoenable_created_entities <em>Autoenable created entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autoenable created entities</em>'.
	 * @see ddsMetamodel.DdsEntityFactoryQos#isAutoenable_created_entities()
	 * @see #getDdsEntityFactoryQos()
	 * @generated
	 */
	EAttribute getDdsEntityFactoryQos_Autoenable_created_entities();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsTopicQosProfile <em>Dds Topic Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Topic Qos Profile</em>'.
	 * @see ddsMetamodel.DdsTopicQosProfile
	 * @generated
	 */
	EClass getDdsTopicQosProfile();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsTopicQosProfile#getTopicDataQos <em>Topic Data Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Topic Data Qos</em>'.
	 * @see ddsMetamodel.DdsTopicQosProfile#getTopicDataQos()
	 * @see #getDdsTopicQosProfile()
	 * @generated
	 */
	EReference getDdsTopicQosProfile_TopicDataQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsTopicQosProfile#getDurabilityQos <em>Durability Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Durability Qos</em>'.
	 * @see ddsMetamodel.DdsTopicQosProfile#getDurabilityQos()
	 * @see #getDdsTopicQosProfile()
	 * @generated
	 */
	EReference getDdsTopicQosProfile_DurabilityQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsTopicQosProfile#getDurabilityServiceQos <em>Durability Service Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Durability Service Qos</em>'.
	 * @see ddsMetamodel.DdsTopicQosProfile#getDurabilityServiceQos()
	 * @see #getDdsTopicQosProfile()
	 * @generated
	 */
	EReference getDdsTopicQosProfile_DurabilityServiceQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsTopicQosProfile#getLatencyBudgetQos <em>Latency Budget Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latency Budget Qos</em>'.
	 * @see ddsMetamodel.DdsTopicQosProfile#getLatencyBudgetQos()
	 * @see #getDdsTopicQosProfile()
	 * @generated
	 */
	EReference getDdsTopicQosProfile_LatencyBudgetQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsTopicQosProfile#getLivelinessQos <em>Liveliness Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Liveliness Qos</em>'.
	 * @see ddsMetamodel.DdsTopicQosProfile#getLivelinessQos()
	 * @see #getDdsTopicQosProfile()
	 * @generated
	 */
	EReference getDdsTopicQosProfile_LivelinessQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsTopicQosProfile#getOwnershipQos <em>Ownership Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ownership Qos</em>'.
	 * @see ddsMetamodel.DdsTopicQosProfile#getOwnershipQos()
	 * @see #getDdsTopicQosProfile()
	 * @generated
	 */
	EReference getDdsTopicQosProfile_OwnershipQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsTopicQosProfile#getReliabilityQos <em>Reliability Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reliability Qos</em>'.
	 * @see ddsMetamodel.DdsTopicQosProfile#getReliabilityQos()
	 * @see #getDdsTopicQosProfile()
	 * @generated
	 */
	EReference getDdsTopicQosProfile_ReliabilityQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsTopicQosProfile#getDestinationOrderQos <em>Destination Order Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination Order Qos</em>'.
	 * @see ddsMetamodel.DdsTopicQosProfile#getDestinationOrderQos()
	 * @see #getDdsTopicQosProfile()
	 * @generated
	 */
	EReference getDdsTopicQosProfile_DestinationOrderQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsTopicQosProfile#getHistoryQos <em>History Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>History Qos</em>'.
	 * @see ddsMetamodel.DdsTopicQosProfile#getHistoryQos()
	 * @see #getDdsTopicQosProfile()
	 * @generated
	 */
	EReference getDdsTopicQosProfile_HistoryQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsTopicQosProfile#getResourceLimitsQos <em>Resource Limits Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Limits Qos</em>'.
	 * @see ddsMetamodel.DdsTopicQosProfile#getResourceLimitsQos()
	 * @see #getDdsTopicQosProfile()
	 * @generated
	 */
	EReference getDdsTopicQosProfile_ResourceLimitsQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsTopicQosProfile#getTransportPriorityQos <em>Transport Priority Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport Priority Qos</em>'.
	 * @see ddsMetamodel.DdsTopicQosProfile#getTransportPriorityQos()
	 * @see #getDdsTopicQosProfile()
	 * @generated
	 */
	EReference getDdsTopicQosProfile_TransportPriorityQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsTopicQosProfile#getLifespanQos <em>Lifespan Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lifespan Qos</em>'.
	 * @see ddsMetamodel.DdsTopicQosProfile#getLifespanQos()
	 * @see #getDdsTopicQosProfile()
	 * @generated
	 */
	EReference getDdsTopicQosProfile_LifespanQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsTopicQosProfile#getDeadlineQos <em>Deadline Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deadline Qos</em>'.
	 * @see ddsMetamodel.DdsTopicQosProfile#getDeadlineQos()
	 * @see #getDdsTopicQosProfile()
	 * @generated
	 */
	EReference getDdsTopicQosProfile_DeadlineQos();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsTopicDataQos <em>Dds Topic Data Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Topic Data Qos</em>'.
	 * @see ddsMetamodel.DdsTopicDataQos
	 * @generated
	 */
	EClass getDdsTopicDataQos();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsTopicDataQos#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ddsMetamodel.DdsTopicDataQos#getValue()
	 * @see #getDdsTopicDataQos()
	 * @generated
	 */
	EAttribute getDdsTopicDataQos_Value();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDurabilityQos <em>Dds Durability Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Durability Qos</em>'.
	 * @see ddsMetamodel.DdsDurabilityQos
	 * @generated
	 */
	EClass getDdsDurabilityQos();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDurabilityQos#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ddsMetamodel.DdsDurabilityQos#getKind()
	 * @see #getDdsDurabilityQos()
	 * @generated
	 */
	EAttribute getDdsDurabilityQos_Kind();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDurabilityServiceQos <em>Dds Durability Service Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Durability Service Qos</em>'.
	 * @see ddsMetamodel.DdsDurabilityServiceQos
	 * @generated
	 */
	EClass getDdsDurabilityServiceQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDurabilityServiceQos#getService_cleanup_delay <em>Service cleanup delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service cleanup delay</em>'.
	 * @see ddsMetamodel.DdsDurabilityServiceQos#getService_cleanup_delay()
	 * @see #getDdsDurabilityServiceQos()
	 * @generated
	 */
	EReference getDdsDurabilityServiceQos_Service_cleanup_delay();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDurabilityServiceQos#getHistory_kind <em>History kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>History kind</em>'.
	 * @see ddsMetamodel.DdsDurabilityServiceQos#getHistory_kind()
	 * @see #getDdsDurabilityServiceQos()
	 * @generated
	 */
	EAttribute getDdsDurabilityServiceQos_History_kind();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDurabilityServiceQos#getHistory_depth <em>History depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>History depth</em>'.
	 * @see ddsMetamodel.DdsDurabilityServiceQos#getHistory_depth()
	 * @see #getDdsDurabilityServiceQos()
	 * @generated
	 */
	EAttribute getDdsDurabilityServiceQos_History_depth();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDurabilityServiceQos#getMax_samples <em>Max samples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max samples</em>'.
	 * @see ddsMetamodel.DdsDurabilityServiceQos#getMax_samples()
	 * @see #getDdsDurabilityServiceQos()
	 * @generated
	 */
	EAttribute getDdsDurabilityServiceQos_Max_samples();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDurabilityServiceQos#getMax_instances <em>Max instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max instances</em>'.
	 * @see ddsMetamodel.DdsDurabilityServiceQos#getMax_instances()
	 * @see #getDdsDurabilityServiceQos()
	 * @generated
	 */
	EAttribute getDdsDurabilityServiceQos_Max_instances();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDurabilityServiceQos#getMax_samples_per_instances <em>Max samples per instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max samples per instances</em>'.
	 * @see ddsMetamodel.DdsDurabilityServiceQos#getMax_samples_per_instances()
	 * @see #getDdsDurabilityServiceQos()
	 * @generated
	 */
	EAttribute getDdsDurabilityServiceQos_Max_samples_per_instances();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDuration <em>Dds Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Duration</em>'.
	 * @see ddsMetamodel.DdsDuration
	 * @generated
	 */
	EClass getDdsDuration();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDuration#getSec <em>Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sec</em>'.
	 * @see ddsMetamodel.DdsDuration#getSec()
	 * @see #getDdsDuration()
	 * @generated
	 */
	EAttribute getDdsDuration_Sec();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDuration#getNanoSec <em>Nano Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nano Sec</em>'.
	 * @see ddsMetamodel.DdsDuration#getNanoSec()
	 * @see #getDdsDuration()
	 * @generated
	 */
	EAttribute getDdsDuration_NanoSec();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsPresentationQos <em>Dds Presentation Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Presentation Qos</em>'.
	 * @see ddsMetamodel.DdsPresentationQos
	 * @generated
	 */
	EClass getDdsPresentationQos();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsPresentationQos#getAccess_scope <em>Access scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access scope</em>'.
	 * @see ddsMetamodel.DdsPresentationQos#getAccess_scope()
	 * @see #getDdsPresentationQos()
	 * @generated
	 */
	EAttribute getDdsPresentationQos_Access_scope();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsPresentationQos#isCoherent_access <em>Coherent access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coherent access</em>'.
	 * @see ddsMetamodel.DdsPresentationQos#isCoherent_access()
	 * @see #getDdsPresentationQos()
	 * @generated
	 */
	EAttribute getDdsPresentationQos_Coherent_access();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsPresentationQos#isOrdered_access <em>Ordered access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered access</em>'.
	 * @see ddsMetamodel.DdsPresentationQos#isOrdered_access()
	 * @see #getDdsPresentationQos()
	 * @generated
	 */
	EAttribute getDdsPresentationQos_Ordered_access();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDeadlineQos <em>Dds Deadline Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Deadline Qos</em>'.
	 * @see ddsMetamodel.DdsDeadlineQos
	 * @generated
	 */
	EClass getDdsDeadlineQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDeadlineQos#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see ddsMetamodel.DdsDeadlineQos#getPeriod()
	 * @see #getDdsDeadlineQos()
	 * @generated
	 */
	EReference getDdsDeadlineQos_Period();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsLatencyBudgetQos <em>Dds Latency Budget Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Latency Budget Qos</em>'.
	 * @see ddsMetamodel.DdsLatencyBudgetQos
	 * @generated
	 */
	EClass getDdsLatencyBudgetQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsLatencyBudgetQos#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see ddsMetamodel.DdsLatencyBudgetQos#getDuration()
	 * @see #getDdsLatencyBudgetQos()
	 * @generated
	 */
	EReference getDdsLatencyBudgetQos_Duration();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsOwnershipQos <em>Dds Ownership Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Ownership Qos</em>'.
	 * @see ddsMetamodel.DdsOwnershipQos
	 * @generated
	 */
	EClass getDdsOwnershipQos();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsOwnershipQos#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ddsMetamodel.DdsOwnershipQos#getKind()
	 * @see #getDdsOwnershipQos()
	 * @generated
	 */
	EAttribute getDdsOwnershipQos_Kind();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsOwnershipStrengthQos <em>Dds Ownership Strength Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Ownership Strength Qos</em>'.
	 * @see ddsMetamodel.DdsOwnershipStrengthQos
	 * @generated
	 */
	EClass getDdsOwnershipStrengthQos();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsOwnershipStrengthQos#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ddsMetamodel.DdsOwnershipStrengthQos#getValue()
	 * @see #getDdsOwnershipStrengthQos()
	 * @generated
	 */
	EAttribute getDdsOwnershipStrengthQos_Value();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsLivelinessQos <em>Dds Liveliness Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Liveliness Qos</em>'.
	 * @see ddsMetamodel.DdsLivelinessQos
	 * @generated
	 */
	EClass getDdsLivelinessQos();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsLivelinessQos#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ddsMetamodel.DdsLivelinessQos#getKind()
	 * @see #getDdsLivelinessQos()
	 * @generated
	 */
	EAttribute getDdsLivelinessQos_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsLivelinessQos#getLease_duration <em>Lease duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lease duration</em>'.
	 * @see ddsMetamodel.DdsLivelinessQos#getLease_duration()
	 * @see #getDdsLivelinessQos()
	 * @generated
	 */
	EReference getDdsLivelinessQos_Lease_duration();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsTimeBasedFilterQos <em>Dds Time Based Filter Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Time Based Filter Qos</em>'.
	 * @see ddsMetamodel.DdsTimeBasedFilterQos
	 * @generated
	 */
	EClass getDdsTimeBasedFilterQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsTimeBasedFilterQos#getMinimum_separation <em>Minimum separation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimum separation</em>'.
	 * @see ddsMetamodel.DdsTimeBasedFilterQos#getMinimum_separation()
	 * @see #getDdsTimeBasedFilterQos()
	 * @generated
	 */
	EReference getDdsTimeBasedFilterQos_Minimum_separation();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsPartitionQos <em>Dds Partition Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Partition Qos</em>'.
	 * @see ddsMetamodel.DdsPartitionQos
	 * @generated
	 */
	EClass getDdsPartitionQos();

	/**
	 * Returns the meta object for the attribute list '{@link ddsMetamodel.DdsPartitionQos#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see ddsMetamodel.DdsPartitionQos#getName()
	 * @see #getDdsPartitionQos()
	 * @generated
	 */
	EAttribute getDdsPartitionQos_Name();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsReliabilityQos <em>Dds Reliability Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Reliability Qos</em>'.
	 * @see ddsMetamodel.DdsReliabilityQos
	 * @generated
	 */
	EClass getDdsReliabilityQos();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsReliabilityQos#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ddsMetamodel.DdsReliabilityQos#getKind()
	 * @see #getDdsReliabilityQos()
	 * @generated
	 */
	EAttribute getDdsReliabilityQos_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsReliabilityQos#getMax_blocking_time <em>Max blocking time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max blocking time</em>'.
	 * @see ddsMetamodel.DdsReliabilityQos#getMax_blocking_time()
	 * @see #getDdsReliabilityQos()
	 * @generated
	 */
	EReference getDdsReliabilityQos_Max_blocking_time();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsTransportPriorityQos <em>Dds Transport Priority Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Transport Priority Qos</em>'.
	 * @see ddsMetamodel.DdsTransportPriorityQos
	 * @generated
	 */
	EClass getDdsTransportPriorityQos();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsTransportPriorityQos#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ddsMetamodel.DdsTransportPriorityQos#getValue()
	 * @see #getDdsTransportPriorityQos()
	 * @generated
	 */
	EAttribute getDdsTransportPriorityQos_Value();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsLifespan <em>Dds Lifespan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Lifespan</em>'.
	 * @see ddsMetamodel.DdsLifespan
	 * @generated
	 */
	EClass getDdsLifespan();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsLifespan#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see ddsMetamodel.DdsLifespan#getDuration()
	 * @see #getDdsLifespan()
	 * @generated
	 */
	EReference getDdsLifespan_Duration();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsHistoryQos <em>Dds History Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds History Qos</em>'.
	 * @see ddsMetamodel.DdsHistoryQos
	 * @generated
	 */
	EClass getDdsHistoryQos();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsHistoryQos#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ddsMetamodel.DdsHistoryQos#getKind()
	 * @see #getDdsHistoryQos()
	 * @generated
	 */
	EAttribute getDdsHistoryQos_Kind();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsHistoryQos#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see ddsMetamodel.DdsHistoryQos#getDepth()
	 * @see #getDdsHistoryQos()
	 * @generated
	 */
	EAttribute getDdsHistoryQos_Depth();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsResourceLimits <em>Dds Resource Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Resource Limits</em>'.
	 * @see ddsMetamodel.DdsResourceLimits
	 * @generated
	 */
	EClass getDdsResourceLimits();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsResourceLimits#getMax_samples <em>Max samples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max samples</em>'.
	 * @see ddsMetamodel.DdsResourceLimits#getMax_samples()
	 * @see #getDdsResourceLimits()
	 * @generated
	 */
	EAttribute getDdsResourceLimits_Max_samples();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsResourceLimits#getMax_instances <em>Max instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max instances</em>'.
	 * @see ddsMetamodel.DdsResourceLimits#getMax_instances()
	 * @see #getDdsResourceLimits()
	 * @generated
	 */
	EAttribute getDdsResourceLimits_Max_instances();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsResourceLimits#getMax_samples_per_instances <em>Max samples per instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max samples per instances</em>'.
	 * @see ddsMetamodel.DdsResourceLimits#getMax_samples_per_instances()
	 * @see #getDdsResourceLimits()
	 * @generated
	 */
	EAttribute getDdsResourceLimits_Max_samples_per_instances();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDataWriterLifecycleQos <em>Dds Data Writer Lifecycle Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Data Writer Lifecycle Qos</em>'.
	 * @see ddsMetamodel.DdsDataWriterLifecycleQos
	 * @generated
	 */
	EClass getDdsDataWriterLifecycleQos();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDataWriterLifecycleQos#isAutodispose_unregistered_instances <em>Autodispose unregistered instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autodispose unregistered instances</em>'.
	 * @see ddsMetamodel.DdsDataWriterLifecycleQos#isAutodispose_unregistered_instances()
	 * @see #getDdsDataWriterLifecycleQos()
	 * @generated
	 */
	EAttribute getDdsDataWriterLifecycleQos_Autodispose_unregistered_instances();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataWriterLifecycleQos#getAutopurge_suspended_samples_delay <em>Autopurge suspended samples delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Autopurge suspended samples delay</em>'.
	 * @see ddsMetamodel.DdsDataWriterLifecycleQos#getAutopurge_suspended_samples_delay()
	 * @see #getDdsDataWriterLifecycleQos()
	 * @generated
	 */
	EReference getDdsDataWriterLifecycleQos_Autopurge_suspended_samples_delay();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataWriterLifecycleQos#getAutounregister_instance_delay <em>Autounregister instance delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Autounregister instance delay</em>'.
	 * @see ddsMetamodel.DdsDataWriterLifecycleQos#getAutounregister_instance_delay()
	 * @see #getDdsDataWriterLifecycleQos()
	 * @generated
	 */
	EReference getDdsDataWriterLifecycleQos_Autounregister_instance_delay();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDataReaderLifecycleQos <em>Dds Data Reader Lifecycle Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Data Reader Lifecycle Qos</em>'.
	 * @see ddsMetamodel.DdsDataReaderLifecycleQos
	 * @generated
	 */
	EClass getDdsDataReaderLifecycleQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataReaderLifecycleQos#getAutopurge_nowriters_samples_delay <em>Autopurge nowriters samples delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Autopurge nowriters samples delay</em>'.
	 * @see ddsMetamodel.DdsDataReaderLifecycleQos#getAutopurge_nowriters_samples_delay()
	 * @see #getDdsDataReaderLifecycleQos()
	 * @generated
	 */
	EReference getDdsDataReaderLifecycleQos_Autopurge_nowriters_samples_delay();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataReaderLifecycleQos#getAutopurge_disposed_samples_delay <em>Autopurge disposed samples delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Autopurge disposed samples delay</em>'.
	 * @see ddsMetamodel.DdsDataReaderLifecycleQos#getAutopurge_disposed_samples_delay()
	 * @see #getDdsDataReaderLifecycleQos()
	 * @generated
	 */
	EReference getDdsDataReaderLifecycleQos_Autopurge_disposed_samples_delay();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDataReaderLifecycleQos#isAutopurge_dispose_all <em>Autopurge dispose all</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autopurge dispose all</em>'.
	 * @see ddsMetamodel.DdsDataReaderLifecycleQos#isAutopurge_dispose_all()
	 * @see #getDdsDataReaderLifecycleQos()
	 * @generated
	 */
	EAttribute getDdsDataReaderLifecycleQos_Autopurge_dispose_all();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDataReaderLifecycleQos#isEnable_invalid_samples <em>Enable invalid samples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable invalid samples</em>'.
	 * @see ddsMetamodel.DdsDataReaderLifecycleQos#isEnable_invalid_samples()
	 * @see #getDdsDataReaderLifecycleQos()
	 * @generated
	 */
	EAttribute getDdsDataReaderLifecycleQos_Enable_invalid_samples();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDestinationOrderQos <em>Dds Destination Order Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Destination Order Qos</em>'.
	 * @see ddsMetamodel.DdsDestinationOrderQos
	 * @generated
	 */
	EClass getDdsDestinationOrderQos();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDestinationOrderQos#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ddsMetamodel.DdsDestinationOrderQos#getKind()
	 * @see #getDdsDestinationOrderQos()
	 * @generated
	 */
	EAttribute getDdsDestinationOrderQos_Kind();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsPublisherQosProfile <em>Dds Publisher Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Publisher Qos Profile</em>'.
	 * @see ddsMetamodel.DdsPublisherQosProfile
	 * @generated
	 */
	EClass getDdsPublisherQosProfile();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsPublisherQosProfile#getGroupDataQos <em>Group Data Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group Data Qos</em>'.
	 * @see ddsMetamodel.DdsPublisherQosProfile#getGroupDataQos()
	 * @see #getDdsPublisherQosProfile()
	 * @generated
	 */
	EReference getDdsPublisherQosProfile_GroupDataQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsPublisherQosProfile#getEntityFactoryQos <em>Entity Factory Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Factory Qos</em>'.
	 * @see ddsMetamodel.DdsPublisherQosProfile#getEntityFactoryQos()
	 * @see #getDdsPublisherQosProfile()
	 * @generated
	 */
	EReference getDdsPublisherQosProfile_EntityFactoryQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsPublisherQosProfile#getPresentationQos <em>Presentation Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Presentation Qos</em>'.
	 * @see ddsMetamodel.DdsPublisherQosProfile#getPresentationQos()
	 * @see #getDdsPublisherQosProfile()
	 * @generated
	 */
	EReference getDdsPublisherQosProfile_PresentationQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsPublisherQosProfile#getPartitionQos <em>Partition Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partition Qos</em>'.
	 * @see ddsMetamodel.DdsPublisherQosProfile#getPartitionQos()
	 * @see #getDdsPublisherQosProfile()
	 * @generated
	 */
	EReference getDdsPublisherQosProfile_PartitionQos();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsGroupDataQos <em>Dds Group Data Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Group Data Qos</em>'.
	 * @see ddsMetamodel.DdsGroupDataQos
	 * @generated
	 */
	EClass getDdsGroupDataQos();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsGroupDataQos#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ddsMetamodel.DdsGroupDataQos#getValue()
	 * @see #getDdsGroupDataQos()
	 * @generated
	 */
	EAttribute getDdsGroupDataQos_Value();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDataWriterQosProfile <em>Dds Data Writer Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Data Writer Qos Profile</em>'.
	 * @see ddsMetamodel.DdsDataWriterQosProfile
	 * @generated
	 */
	EClass getDdsDataWriterQosProfile();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataWriterQosProfile#getUserDataQos <em>User Data Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Data Qos</em>'.
	 * @see ddsMetamodel.DdsDataWriterQosProfile#getUserDataQos()
	 * @see #getDdsDataWriterQosProfile()
	 * @generated
	 */
	EReference getDdsDataWriterQosProfile_UserDataQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataWriterQosProfile#getDurabilityQos <em>Durability Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Durability Qos</em>'.
	 * @see ddsMetamodel.DdsDataWriterQosProfile#getDurabilityQos()
	 * @see #getDdsDataWriterQosProfile()
	 * @generated
	 */
	EReference getDdsDataWriterQosProfile_DurabilityQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataWriterQosProfile#getDeadlineQos <em>Deadline Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deadline Qos</em>'.
	 * @see ddsMetamodel.DdsDataWriterQosProfile#getDeadlineQos()
	 * @see #getDdsDataWriterQosProfile()
	 * @generated
	 */
	EReference getDdsDataWriterQosProfile_DeadlineQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataWriterQosProfile#getLatencyBudgetQos <em>Latency Budget Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latency Budget Qos</em>'.
	 * @see ddsMetamodel.DdsDataWriterQosProfile#getLatencyBudgetQos()
	 * @see #getDdsDataWriterQosProfile()
	 * @generated
	 */
	EReference getDdsDataWriterQosProfile_LatencyBudgetQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataWriterQosProfile#getOwnershipQos <em>Ownership Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ownership Qos</em>'.
	 * @see ddsMetamodel.DdsDataWriterQosProfile#getOwnershipQos()
	 * @see #getDdsDataWriterQosProfile()
	 * @generated
	 */
	EReference getDdsDataWriterQosProfile_OwnershipQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataWriterQosProfile#getOwnershipStrength <em>Ownership Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ownership Strength</em>'.
	 * @see ddsMetamodel.DdsDataWriterQosProfile#getOwnershipStrength()
	 * @see #getDdsDataWriterQosProfile()
	 * @generated
	 */
	EReference getDdsDataWriterQosProfile_OwnershipStrength();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataWriterQosProfile#getLivelinessQos <em>Liveliness Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Liveliness Qos</em>'.
	 * @see ddsMetamodel.DdsDataWriterQosProfile#getLivelinessQos()
	 * @see #getDdsDataWriterQosProfile()
	 * @generated
	 */
	EReference getDdsDataWriterQosProfile_LivelinessQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataWriterQosProfile#getReliabilityQos <em>Reliability Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reliability Qos</em>'.
	 * @see ddsMetamodel.DdsDataWriterQosProfile#getReliabilityQos()
	 * @see #getDdsDataWriterQosProfile()
	 * @generated
	 */
	EReference getDdsDataWriterQosProfile_ReliabilityQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataWriterQosProfile#getTransportPriorityQos <em>Transport Priority Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport Priority Qos</em>'.
	 * @see ddsMetamodel.DdsDataWriterQosProfile#getTransportPriorityQos()
	 * @see #getDdsDataWriterQosProfile()
	 * @generated
	 */
	EReference getDdsDataWriterQosProfile_TransportPriorityQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataWriterQosProfile#getLifespanQos <em>Lifespan Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lifespan Qos</em>'.
	 * @see ddsMetamodel.DdsDataWriterQosProfile#getLifespanQos()
	 * @see #getDdsDataWriterQosProfile()
	 * @generated
	 */
	EReference getDdsDataWriterQosProfile_LifespanQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataWriterQosProfile#getDestinationOrderQos <em>Destination Order Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination Order Qos</em>'.
	 * @see ddsMetamodel.DdsDataWriterQosProfile#getDestinationOrderQos()
	 * @see #getDdsDataWriterQosProfile()
	 * @generated
	 */
	EReference getDdsDataWriterQosProfile_DestinationOrderQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataWriterQosProfile#getHistoryQos <em>History Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>History Qos</em>'.
	 * @see ddsMetamodel.DdsDataWriterQosProfile#getHistoryQos()
	 * @see #getDdsDataWriterQosProfile()
	 * @generated
	 */
	EReference getDdsDataWriterQosProfile_HistoryQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataWriterQosProfile#getResourceLimitsQos <em>Resource Limits Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Limits Qos</em>'.
	 * @see ddsMetamodel.DdsDataWriterQosProfile#getResourceLimitsQos()
	 * @see #getDdsDataWriterQosProfile()
	 * @generated
	 */
	EReference getDdsDataWriterQosProfile_ResourceLimitsQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataWriterQosProfile#getDataWriterLifecycleQos <em>Data Writer Lifecycle Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Writer Lifecycle Qos</em>'.
	 * @see ddsMetamodel.DdsDataWriterQosProfile#getDataWriterLifecycleQos()
	 * @see #getDdsDataWriterQosProfile()
	 * @generated
	 */
	EReference getDdsDataWriterQosProfile_DataWriterLifecycleQos();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsSubscriberQosProfile <em>Dds Subscriber Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Subscriber Qos Profile</em>'.
	 * @see ddsMetamodel.DdsSubscriberQosProfile
	 * @generated
	 */
	EClass getDdsSubscriberQosProfile();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsSubscriberQosProfile#getGroupDataQos <em>Group Data Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group Data Qos</em>'.
	 * @see ddsMetamodel.DdsSubscriberQosProfile#getGroupDataQos()
	 * @see #getDdsSubscriberQosProfile()
	 * @generated
	 */
	EReference getDdsSubscriberQosProfile_GroupDataQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsSubscriberQosProfile#getEntityFactoryQos <em>Entity Factory Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Factory Qos</em>'.
	 * @see ddsMetamodel.DdsSubscriberQosProfile#getEntityFactoryQos()
	 * @see #getDdsSubscriberQosProfile()
	 * @generated
	 */
	EReference getDdsSubscriberQosProfile_EntityFactoryQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsSubscriberQosProfile#getPresentationQos <em>Presentation Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Presentation Qos</em>'.
	 * @see ddsMetamodel.DdsSubscriberQosProfile#getPresentationQos()
	 * @see #getDdsSubscriberQosProfile()
	 * @generated
	 */
	EReference getDdsSubscriberQosProfile_PresentationQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsSubscriberQosProfile#getPartitionQos <em>Partition Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partition Qos</em>'.
	 * @see ddsMetamodel.DdsSubscriberQosProfile#getPartitionQos()
	 * @see #getDdsSubscriberQosProfile()
	 * @generated
	 */
	EReference getDdsSubscriberQosProfile_PartitionQos();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDataReaderQosProfile <em>Dds Data Reader Qos Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Data Reader Qos Profile</em>'.
	 * @see ddsMetamodel.DdsDataReaderQosProfile
	 * @generated
	 */
	EClass getDdsDataReaderQosProfile();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataReaderQosProfile#getUserDataQos <em>User Data Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Data Qos</em>'.
	 * @see ddsMetamodel.DdsDataReaderQosProfile#getUserDataQos()
	 * @see #getDdsDataReaderQosProfile()
	 * @generated
	 */
	EReference getDdsDataReaderQosProfile_UserDataQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataReaderQosProfile#getDurabilityQos <em>Durability Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Durability Qos</em>'.
	 * @see ddsMetamodel.DdsDataReaderQosProfile#getDurabilityQos()
	 * @see #getDdsDataReaderQosProfile()
	 * @generated
	 */
	EReference getDdsDataReaderQosProfile_DurabilityQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataReaderQosProfile#getDeadlineQos <em>Deadline Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deadline Qos</em>'.
	 * @see ddsMetamodel.DdsDataReaderQosProfile#getDeadlineQos()
	 * @see #getDdsDataReaderQosProfile()
	 * @generated
	 */
	EReference getDdsDataReaderQosProfile_DeadlineQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataReaderQosProfile#getLatencyBudgetQos <em>Latency Budget Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latency Budget Qos</em>'.
	 * @see ddsMetamodel.DdsDataReaderQosProfile#getLatencyBudgetQos()
	 * @see #getDdsDataReaderQosProfile()
	 * @generated
	 */
	EReference getDdsDataReaderQosProfile_LatencyBudgetQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataReaderQosProfile#getLivelinessQos <em>Liveliness Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Liveliness Qos</em>'.
	 * @see ddsMetamodel.DdsDataReaderQosProfile#getLivelinessQos()
	 * @see #getDdsDataReaderQosProfile()
	 * @generated
	 */
	EReference getDdsDataReaderQosProfile_LivelinessQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataReaderQosProfile#getOwnershipQos <em>Ownership Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ownership Qos</em>'.
	 * @see ddsMetamodel.DdsDataReaderQosProfile#getOwnershipQos()
	 * @see #getDdsDataReaderQosProfile()
	 * @generated
	 */
	EReference getDdsDataReaderQosProfile_OwnershipQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataReaderQosProfile#getTimeBasedFilterQos <em>Time Based Filter Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Based Filter Qos</em>'.
	 * @see ddsMetamodel.DdsDataReaderQosProfile#getTimeBasedFilterQos()
	 * @see #getDdsDataReaderQosProfile()
	 * @generated
	 */
	EReference getDdsDataReaderQosProfile_TimeBasedFilterQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataReaderQosProfile#getReliabilityQos <em>Reliability Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reliability Qos</em>'.
	 * @see ddsMetamodel.DdsDataReaderQosProfile#getReliabilityQos()
	 * @see #getDdsDataReaderQosProfile()
	 * @generated
	 */
	EReference getDdsDataReaderQosProfile_ReliabilityQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataReaderQosProfile#getDestinationOrderQos <em>Destination Order Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination Order Qos</em>'.
	 * @see ddsMetamodel.DdsDataReaderQosProfile#getDestinationOrderQos()
	 * @see #getDdsDataReaderQosProfile()
	 * @generated
	 */
	EReference getDdsDataReaderQosProfile_DestinationOrderQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataReaderQosProfile#getHistoryQos <em>History Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>History Qos</em>'.
	 * @see ddsMetamodel.DdsDataReaderQosProfile#getHistoryQos()
	 * @see #getDdsDataReaderQosProfile()
	 * @generated
	 */
	EReference getDdsDataReaderQosProfile_HistoryQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataReaderQosProfile#getResourceLimitsQos <em>Resource Limits Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Limits Qos</em>'.
	 * @see ddsMetamodel.DdsDataReaderQosProfile#getResourceLimitsQos()
	 * @see #getDdsDataReaderQosProfile()
	 * @generated
	 */
	EReference getDdsDataReaderQosProfile_ResourceLimitsQos();

	/**
	 * Returns the meta object for the containment reference '{@link ddsMetamodel.DdsDataReaderQosProfile#getDataReaderLifecycleQos <em>Data Reader Lifecycle Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Reader Lifecycle Qos</em>'.
	 * @see ddsMetamodel.DdsDataReaderQosProfile#getDataReaderLifecycleQos()
	 * @see #getDdsDataReaderQosProfile()
	 * @generated
	 */
	EReference getDdsDataReaderQosProfile_DataReaderLifecycleQos();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDomainParticipantListener <em>Dds Domain Participant Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Domain Participant Listener</em>'.
	 * @see ddsMetamodel.DdsDomainParticipantListener
	 * @generated
	 */
	EClass getDdsDomainParticipantListener();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDomainParticipantListener#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ddsMetamodel.DdsDomainParticipantListener#getName()
	 * @see #getDdsDomainParticipantListener()
	 * @generated
	 */
	EAttribute getDdsDomainParticipantListener_Name();

	/**
	 * Returns the meta object for the attribute list '{@link ddsMetamodel.DdsDomainParticipantListener#getListenedStatus <em>Listened Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Listened Status</em>'.
	 * @see ddsMetamodel.DdsDomainParticipantListener#getListenedStatus()
	 * @see #getDdsDomainParticipantListener()
	 * @generated
	 */
	EAttribute getDdsDomainParticipantListener_ListenedStatus();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsSubscriberListener <em>Dds Subscriber Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Subscriber Listener</em>'.
	 * @see ddsMetamodel.DdsSubscriberListener
	 * @generated
	 */
	EClass getDdsSubscriberListener();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsSubscriberListener#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ddsMetamodel.DdsSubscriberListener#getName()
	 * @see #getDdsSubscriberListener()
	 * @generated
	 */
	EAttribute getDdsSubscriberListener_Name();

	/**
	 * Returns the meta object for the attribute list '{@link ddsMetamodel.DdsSubscriberListener#getListenedStatus <em>Listened Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Listened Status</em>'.
	 * @see ddsMetamodel.DdsSubscriberListener#getListenedStatus()
	 * @see #getDdsSubscriberListener()
	 * @generated
	 */
	EAttribute getDdsSubscriberListener_ListenedStatus();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsPublisherListener <em>Dds Publisher Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Publisher Listener</em>'.
	 * @see ddsMetamodel.DdsPublisherListener
	 * @generated
	 */
	EClass getDdsPublisherListener();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsPublisherListener#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ddsMetamodel.DdsPublisherListener#getName()
	 * @see #getDdsPublisherListener()
	 * @generated
	 */
	EAttribute getDdsPublisherListener_Name();

	/**
	 * Returns the meta object for the attribute list '{@link ddsMetamodel.DdsPublisherListener#getListenedStatus <em>Listened Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Listened Status</em>'.
	 * @see ddsMetamodel.DdsPublisherListener#getListenedStatus()
	 * @see #getDdsPublisherListener()
	 * @generated
	 */
	EAttribute getDdsPublisherListener_ListenedStatus();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDataReaderListener <em>Dds Data Reader Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Data Reader Listener</em>'.
	 * @see ddsMetamodel.DdsDataReaderListener
	 * @generated
	 */
	EClass getDdsDataReaderListener();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDataReaderListener#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ddsMetamodel.DdsDataReaderListener#getName()
	 * @see #getDdsDataReaderListener()
	 * @generated
	 */
	EAttribute getDdsDataReaderListener_Name();

	/**
	 * Returns the meta object for the attribute list '{@link ddsMetamodel.DdsDataReaderListener#getListenedStatus <em>Listened Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Listened Status</em>'.
	 * @see ddsMetamodel.DdsDataReaderListener#getListenedStatus()
	 * @see #getDdsDataReaderListener()
	 * @generated
	 */
	EAttribute getDdsDataReaderListener_ListenedStatus();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDataWriterListener <em>Dds Data Writer Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Data Writer Listener</em>'.
	 * @see ddsMetamodel.DdsDataWriterListener
	 * @generated
	 */
	EClass getDdsDataWriterListener();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsDataWriterListener#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ddsMetamodel.DdsDataWriterListener#getName()
	 * @see #getDdsDataWriterListener()
	 * @generated
	 */
	EAttribute getDdsDataWriterListener_Name();

	/**
	 * Returns the meta object for the attribute list '{@link ddsMetamodel.DdsDataWriterListener#getListenedStatus <em>Listened Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Listened Status</em>'.
	 * @see ddsMetamodel.DdsDataWriterListener#getListenedStatus()
	 * @see #getDdsDataWriterListener()
	 * @generated
	 */
	EAttribute getDdsDataWriterListener_ListenedStatus();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsTopicListener <em>Dds Topic Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Topic Listener</em>'.
	 * @see ddsMetamodel.DdsTopicListener
	 * @generated
	 */
	EClass getDdsTopicListener();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsTopicListener#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ddsMetamodel.DdsTopicListener#getName()
	 * @see #getDdsTopicListener()
	 * @generated
	 */
	EAttribute getDdsTopicListener_Name();

	/**
	 * Returns the meta object for the attribute list '{@link ddsMetamodel.DdsTopicListener#getListenedStatus <em>Listened Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Listened Status</em>'.
	 * @see ddsMetamodel.DdsTopicListener#getListenedStatus()
	 * @see #getDdsTopicListener()
	 * @generated
	 */
	EAttribute getDdsTopicListener_ListenedStatus();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsWaitSet <em>Dds Wait Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Wait Set</em>'.
	 * @see ddsMetamodel.DdsWaitSet
	 * @generated
	 */
	EClass getDdsWaitSet();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsWaitSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ddsMetamodel.DdsWaitSet#getName()
	 * @see #getDdsWaitSet()
	 * @generated
	 */
	EAttribute getDdsWaitSet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ddsMetamodel.DdsWaitSet#getReadConditions <em>Read Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Read Conditions</em>'.
	 * @see ddsMetamodel.DdsWaitSet#getReadConditions()
	 * @see #getDdsWaitSet()
	 * @generated
	 */
	EReference getDdsWaitSet_ReadConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link ddsMetamodel.DdsWaitSet#getStatusConditions <em>Status Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Status Conditions</em>'.
	 * @see ddsMetamodel.DdsWaitSet#getStatusConditions()
	 * @see #getDdsWaitSet()
	 * @generated
	 */
	EReference getDdsWaitSet_StatusConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link ddsMetamodel.DdsWaitSet#getGuardConditions <em>Guard Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guard Conditions</em>'.
	 * @see ddsMetamodel.DdsWaitSet#getGuardConditions()
	 * @see #getDdsWaitSet()
	 * @generated
	 */
	EReference getDdsWaitSet_GuardConditions();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsReadCondition <em>Dds Read Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Read Condition</em>'.
	 * @see ddsMetamodel.DdsReadCondition
	 * @generated
	 */
	EClass getDdsReadCondition();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsReadCondition#getView_state_mask <em>View state mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View state mask</em>'.
	 * @see ddsMetamodel.DdsReadCondition#getView_state_mask()
	 * @see #getDdsReadCondition()
	 * @generated
	 */
	EAttribute getDdsReadCondition_View_state_mask();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsReadCondition#getInstance_state_mask <em>Instance state mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance state mask</em>'.
	 * @see ddsMetamodel.DdsReadCondition#getInstance_state_mask()
	 * @see #getDdsReadCondition()
	 * @generated
	 */
	EAttribute getDdsReadCondition_Instance_state_mask();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsReadCondition#getSample_state_mask <em>Sample state mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample state mask</em>'.
	 * @see ddsMetamodel.DdsReadCondition#getSample_state_mask()
	 * @see #getDdsReadCondition()
	 * @generated
	 */
	EAttribute getDdsReadCondition_Sample_state_mask();

	/**
	 * Returns the meta object for the reference '{@link ddsMetamodel.DdsReadCondition#getDataReader <em>Data Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Reader</em>'.
	 * @see ddsMetamodel.DdsReadCondition#getDataReader()
	 * @see #getDdsReadCondition()
	 * @generated
	 */
	EReference getDdsReadCondition_DataReader();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsStructuredField <em>Dds Structured Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Structured Field</em>'.
	 * @see ddsMetamodel.DdsStructuredField
	 * @generated
	 */
	EClass getDdsStructuredField();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsStructuredField#isIsKey <em>Is Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Key</em>'.
	 * @see ddsMetamodel.DdsStructuredField#isIsKey()
	 * @see #getDdsStructuredField()
	 * @generated
	 */
	EAttribute getDdsStructuredField_IsKey();

	/**
	 * Returns the meta object for the reference '{@link ddsMetamodel.DdsStructuredField#getReferencedType <em>Referenced Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Type</em>'.
	 * @see ddsMetamodel.DdsStructuredField#getReferencedType()
	 * @see #getDdsStructuredField()
	 * @generated
	 */
	EReference getDdsStructuredField_ReferencedType();

	/**
	 * Returns the meta object for the container reference '{@link ddsMetamodel.DdsStructuredField#getDataStructure <em>Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Structure</em>'.
	 * @see ddsMetamodel.DdsStructuredField#getDataStructure()
	 * @see #getDdsStructuredField()
	 * @generated
	 */
	EReference getDdsStructuredField_DataStructure();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsStructuredField#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see ddsMetamodel.DdsStructuredField#getFieldName()
	 * @see #getDdsStructuredField()
	 * @generated
	 */
	EAttribute getDdsStructuredField_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsStructuredField#getMaxMultiplicity <em>Max Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Multiplicity</em>'.
	 * @see ddsMetamodel.DdsStructuredField#getMaxMultiplicity()
	 * @see #getDdsStructuredField()
	 * @generated
	 */
	EAttribute getDdsStructuredField_MaxMultiplicity();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsStatusCondition <em>Dds Status Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Status Condition</em>'.
	 * @see ddsMetamodel.DdsStatusCondition
	 * @generated
	 */
	EClass getDdsStatusCondition();

	/**
	 * Returns the meta object for the container reference '{@link ddsMetamodel.DdsStatusCondition#getContainingWaitset <em>Containing Waitset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Waitset</em>'.
	 * @see ddsMetamodel.DdsStatusCondition#getContainingWaitset()
	 * @see #getDdsStatusCondition()
	 * @generated
	 */
	EReference getDdsStatusCondition_ContainingWaitset();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDomainParticipantStatusCondition <em>Dds Domain Participant Status Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Domain Participant Status Condition</em>'.
	 * @see ddsMetamodel.DdsDomainParticipantStatusCondition
	 * @generated
	 */
	EClass getDdsDomainParticipantStatusCondition();

	/**
	 * Returns the meta object for the attribute list '{@link ddsMetamodel.DdsDomainParticipantStatusCondition#getEnabled_status <em>Enabled status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enabled status</em>'.
	 * @see ddsMetamodel.DdsDomainParticipantStatusCondition#getEnabled_status()
	 * @see #getDdsDomainParticipantStatusCondition()
	 * @generated
	 */
	EAttribute getDdsDomainParticipantStatusCondition_Enabled_status();

	/**
	 * Returns the meta object for the reference '{@link ddsMetamodel.DdsDomainParticipantStatusCondition#getDomainParticipant <em>Domain Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Participant</em>'.
	 * @see ddsMetamodel.DdsDomainParticipantStatusCondition#getDomainParticipant()
	 * @see #getDdsDomainParticipantStatusCondition()
	 * @generated
	 */
	EReference getDdsDomainParticipantStatusCondition_DomainParticipant();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsPublisherStatusCondition <em>Dds Publisher Status Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Publisher Status Condition</em>'.
	 * @see ddsMetamodel.DdsPublisherStatusCondition
	 * @generated
	 */
	EClass getDdsPublisherStatusCondition();

	/**
	 * Returns the meta object for the attribute list '{@link ddsMetamodel.DdsPublisherStatusCondition#getEnabled_status <em>Enabled status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enabled status</em>'.
	 * @see ddsMetamodel.DdsPublisherStatusCondition#getEnabled_status()
	 * @see #getDdsPublisherStatusCondition()
	 * @generated
	 */
	EAttribute getDdsPublisherStatusCondition_Enabled_status();

	/**
	 * Returns the meta object for the reference '{@link ddsMetamodel.DdsPublisherStatusCondition#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publisher</em>'.
	 * @see ddsMetamodel.DdsPublisherStatusCondition#getPublisher()
	 * @see #getDdsPublisherStatusCondition()
	 * @generated
	 */
	EReference getDdsPublisherStatusCondition_Publisher();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsSubscriberStatusCondition <em>Dds Subscriber Status Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Subscriber Status Condition</em>'.
	 * @see ddsMetamodel.DdsSubscriberStatusCondition
	 * @generated
	 */
	EClass getDdsSubscriberStatusCondition();

	/**
	 * Returns the meta object for the attribute list '{@link ddsMetamodel.DdsSubscriberStatusCondition#getEnabled_status <em>Enabled status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enabled status</em>'.
	 * @see ddsMetamodel.DdsSubscriberStatusCondition#getEnabled_status()
	 * @see #getDdsSubscriberStatusCondition()
	 * @generated
	 */
	EAttribute getDdsSubscriberStatusCondition_Enabled_status();

	/**
	 * Returns the meta object for the reference '{@link ddsMetamodel.DdsSubscriberStatusCondition#getSubscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscriber</em>'.
	 * @see ddsMetamodel.DdsSubscriberStatusCondition#getSubscriber()
	 * @see #getDdsSubscriberStatusCondition()
	 * @generated
	 */
	EReference getDdsSubscriberStatusCondition_Subscriber();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDataWriterStatusCondition <em>Dds Data Writer Status Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Data Writer Status Condition</em>'.
	 * @see ddsMetamodel.DdsDataWriterStatusCondition
	 * @generated
	 */
	EClass getDdsDataWriterStatusCondition();

	/**
	 * Returns the meta object for the attribute list '{@link ddsMetamodel.DdsDataWriterStatusCondition#getEnabled_status <em>Enabled status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enabled status</em>'.
	 * @see ddsMetamodel.DdsDataWriterStatusCondition#getEnabled_status()
	 * @see #getDdsDataWriterStatusCondition()
	 * @generated
	 */
	EAttribute getDdsDataWriterStatusCondition_Enabled_status();

	/**
	 * Returns the meta object for the reference '{@link ddsMetamodel.DdsDataWriterStatusCondition#getDataWriter <em>Data Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Writer</em>'.
	 * @see ddsMetamodel.DdsDataWriterStatusCondition#getDataWriter()
	 * @see #getDdsDataWriterStatusCondition()
	 * @generated
	 */
	EReference getDdsDataWriterStatusCondition_DataWriter();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsDataReaderStatusCondition <em>Dds Data Reader Status Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Data Reader Status Condition</em>'.
	 * @see ddsMetamodel.DdsDataReaderStatusCondition
	 * @generated
	 */
	EClass getDdsDataReaderStatusCondition();

	/**
	 * Returns the meta object for the attribute list '{@link ddsMetamodel.DdsDataReaderStatusCondition#getEnabled_status <em>Enabled status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enabled status</em>'.
	 * @see ddsMetamodel.DdsDataReaderStatusCondition#getEnabled_status()
	 * @see #getDdsDataReaderStatusCondition()
	 * @generated
	 */
	EAttribute getDdsDataReaderStatusCondition_Enabled_status();

	/**
	 * Returns the meta object for the reference '{@link ddsMetamodel.DdsDataReaderStatusCondition#getDataReader <em>Data Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Reader</em>'.
	 * @see ddsMetamodel.DdsDataReaderStatusCondition#getDataReader()
	 * @see #getDdsDataReaderStatusCondition()
	 * @generated
	 */
	EReference getDdsDataReaderStatusCondition_DataReader();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsTopicStatusCondition <em>Dds Topic Status Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Topic Status Condition</em>'.
	 * @see ddsMetamodel.DdsTopicStatusCondition
	 * @generated
	 */
	EClass getDdsTopicStatusCondition();

	/**
	 * Returns the meta object for the attribute list '{@link ddsMetamodel.DdsTopicStatusCondition#getEnabled_status <em>Enabled status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enabled status</em>'.
	 * @see ddsMetamodel.DdsTopicStatusCondition#getEnabled_status()
	 * @see #getDdsTopicStatusCondition()
	 * @generated
	 */
	EAttribute getDdsTopicStatusCondition_Enabled_status();

	/**
	 * Returns the meta object for the reference '{@link ddsMetamodel.DdsTopicStatusCondition#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic</em>'.
	 * @see ddsMetamodel.DdsTopicStatusCondition#getTopic()
	 * @see #getDdsTopicStatusCondition()
	 * @generated
	 */
	EReference getDdsTopicStatusCondition_Topic();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.QueryCondition <em>Query Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Condition</em>'.
	 * @see ddsMetamodel.QueryCondition
	 * @generated
	 */
	EClass getQueryCondition();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.QueryCondition#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see ddsMetamodel.QueryCondition#getQuery()
	 * @see #getQueryCondition()
	 * @generated
	 */
	EAttribute getQueryCondition_Query();

	/**
	 * Returns the meta object for the attribute list '{@link ddsMetamodel.QueryCondition#getQueryParameters <em>Query Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Query Parameters</em>'.
	 * @see ddsMetamodel.QueryCondition#getQueryParameters()
	 * @see #getQueryCondition()
	 * @generated
	 */
	EAttribute getQueryCondition_QueryParameters();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.GuardCondition <em>Guard Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard Condition</em>'.
	 * @see ddsMetamodel.GuardCondition
	 * @generated
	 */
	EClass getGuardCondition();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.GuardCondition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ddsMetamodel.GuardCondition#getName()
	 * @see #getGuardCondition()
	 * @generated
	 */
	EAttribute getGuardCondition_Name();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsSystem <em>Dds System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds System</em>'.
	 * @see ddsMetamodel.DdsSystem
	 * @generated
	 */
	EClass getDdsSystem();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsSystem#getSystemName <em>System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Name</em>'.
	 * @see ddsMetamodel.DdsSystem#getSystemName()
	 * @see #getDdsSystem()
	 * @generated
	 */
	EAttribute getDdsSystem_SystemName();

	/**
	 * Returns the meta object for the containment reference list '{@link ddsMetamodel.DdsSystem#getHosts <em>Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hosts</em>'.
	 * @see ddsMetamodel.DdsSystem#getHosts()
	 * @see #getDdsSystem()
	 * @generated
	 */
	EReference getDdsSystem_Hosts();

	/**
	 * Returns the meta object for the containment reference list '{@link ddsMetamodel.DdsSystem#getQosProfiles <em>Qos Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qos Profiles</em>'.
	 * @see ddsMetamodel.DdsSystem#getQosProfiles()
	 * @see #getDdsSystem()
	 * @generated
	 */
	EReference getDdsSystem_QosProfiles();

	/**
	 * Returns the meta object for the containment reference list '{@link ddsMetamodel.DdsSystem#getDataModules <em>Data Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Modules</em>'.
	 * @see ddsMetamodel.DdsSystem#getDataModules()
	 * @see #getDdsSystem()
	 * @generated
	 */
	EReference getDdsSystem_DataModules();

	/**
	 * Returns the meta object for the containment reference list '{@link ddsMetamodel.DdsSystem#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topics</em>'.
	 * @see ddsMetamodel.DdsSystem#getTopics()
	 * @see #getDdsSystem()
	 * @generated
	 */
	EReference getDdsSystem_Topics();

	/**
	 * Returns the meta object for class '{@link ddsMetamodel.DdsHost <em>Dds Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dds Host</em>'.
	 * @see ddsMetamodel.DdsHost
	 * @generated
	 */
	EClass getDdsHost();

	/**
	 * Returns the meta object for the attribute '{@link ddsMetamodel.DdsHost#getHostName <em>Host Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Name</em>'.
	 * @see ddsMetamodel.DdsHost#getHostName()
	 * @see #getDdsHost()
	 * @generated
	 */
	EAttribute getDdsHost_HostName();

	/**
	 * Returns the meta object for the containment reference list '{@link ddsMetamodel.DdsHost#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see ddsMetamodel.DdsHost#getApplications()
	 * @see #getDdsHost()
	 * @generated
	 */
	EReference getDdsHost_Applications();

	/**
	 * Returns the meta object for enum '{@link ddsMetamodel.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Durability Qos Policy Kind</em>'.
	 * @see ddsMetamodel.DurabilityQosPolicyKind
	 * @generated
	 */
	EEnum getDurabilityQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link ddsMetamodel.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>History Qos Policy Kind</em>'.
	 * @see ddsMetamodel.HistoryQosPolicyKind
	 * @generated
	 */
	EEnum getHistoryQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link ddsMetamodel.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Presentation Qos Policy Access Scope Kind</em>'.
	 * @see ddsMetamodel.PresentationQosPolicyAccessScopeKind
	 * @generated
	 */
	EEnum getPresentationQosPolicyAccessScopeKind();

	/**
	 * Returns the meta object for enum '{@link ddsMetamodel.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ownership Qos Policy Kind</em>'.
	 * @see ddsMetamodel.OwnershipQosPolicyKind
	 * @generated
	 */
	EEnum getOwnershipQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link ddsMetamodel.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Liveliness Qos Policy Kind</em>'.
	 * @see ddsMetamodel.LivelinessQosPolicyKind
	 * @generated
	 */
	EEnum getLivelinessQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link ddsMetamodel.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reliability Qos Policy Kind</em>'.
	 * @see ddsMetamodel.ReliabilityQosPolicyKind
	 * @generated
	 */
	EEnum getReliabilityQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link ddsMetamodel.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Destination Order Qos Policy Kind</em>'.
	 * @see ddsMetamodel.DestinationOrderQosPolicyKind
	 * @generated
	 */
	EEnum getDestinationOrderQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link ddsMetamodel.InvalidSampleVisibilityQosPolicy <em>Invalid Sample Visibility Qos Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Invalid Sample Visibility Qos Policy</em>'.
	 * @see ddsMetamodel.InvalidSampleVisibilityQosPolicy
	 * @generated
	 */
	EEnum getInvalidSampleVisibilityQosPolicy();

	/**
	 * Returns the meta object for enum '{@link ddsMetamodel.ViewStateKind <em>View State Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>View State Kind</em>'.
	 * @see ddsMetamodel.ViewStateKind
	 * @generated
	 */
	EEnum getViewStateKind();

	/**
	 * Returns the meta object for enum '{@link ddsMetamodel.InstanceStateKind <em>Instance State Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instance State Kind</em>'.
	 * @see ddsMetamodel.InstanceStateKind
	 * @generated
	 */
	EEnum getInstanceStateKind();

	/**
	 * Returns the meta object for enum '{@link ddsMetamodel.SampleStateKind <em>Sample State Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sample State Kind</em>'.
	 * @see ddsMetamodel.SampleStateKind
	 * @generated
	 */
	EEnum getSampleStateKind();

	/**
	 * Returns the meta object for enum '{@link ddsMetamodel.DomainParticipantStatus <em>Domain Participant Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Domain Participant Status</em>'.
	 * @see ddsMetamodel.DomainParticipantStatus
	 * @generated
	 */
	EEnum getDomainParticipantStatus();

	/**
	 * Returns the meta object for enum '{@link ddsMetamodel.SubscriberStatus <em>Subscriber Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Subscriber Status</em>'.
	 * @see ddsMetamodel.SubscriberStatus
	 * @generated
	 */
	EEnum getSubscriberStatus();

	/**
	 * Returns the meta object for enum '{@link ddsMetamodel.PublisherStatus <em>Publisher Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Publisher Status</em>'.
	 * @see ddsMetamodel.PublisherStatus
	 * @generated
	 */
	EEnum getPublisherStatus();

	/**
	 * Returns the meta object for enum '{@link ddsMetamodel.DataWriterStatus <em>Data Writer Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Writer Status</em>'.
	 * @see ddsMetamodel.DataWriterStatus
	 * @generated
	 */
	EEnum getDataWriterStatus();

	/**
	 * Returns the meta object for enum '{@link ddsMetamodel.DataReaderStatus <em>Data Reader Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Reader Status</em>'.
	 * @see ddsMetamodel.DataReaderStatus
	 * @generated
	 */
	EEnum getDataReaderStatus();

	/**
	 * Returns the meta object for enum '{@link ddsMetamodel.TopicStatus <em>Topic Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Topic Status</em>'.
	 * @see ddsMetamodel.TopicStatus
	 * @generated
	 */
	EEnum getTopicStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DdsMetamodelFactory getDdsMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsApplicationImpl <em>Dds Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsApplicationImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsApplication()
		 * @generated
		 */
		EClass DDS_APPLICATION = eINSTANCE.getDdsApplication();

		/**
		 * The meta object literal for the '<em><b>Application Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_APPLICATION__APPLICATION_NAME = eINSTANCE.getDdsApplication_ApplicationName();

		/**
		 * The meta object literal for the '<em><b>Domain Participants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_APPLICATION__DOMAIN_PARTICIPANTS = eINSTANCE.getDdsApplication_DomainParticipants();

		/**
		 * The meta object literal for the '<em><b>Waitset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_APPLICATION__WAITSET = eINSTANCE.getDdsApplication_Waitset();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDomainParticipantImpl <em>Dds Domain Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDomainParticipantImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDomainParticipant()
		 * @generated
		 */
		EClass DDS_DOMAIN_PARTICIPANT = eINSTANCE.getDdsDomainParticipant();

		/**
		 * The meta object literal for the '<em><b>Domain Participant Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_NAME = eINSTANCE.getDdsDomainParticipant_DomainParticipantName();

		/**
		 * The meta object literal for the '<em><b>Ddssubscriber</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DOMAIN_PARTICIPANT__DDSSUBSCRIBER = eINSTANCE.getDdsDomainParticipant_Ddssubscriber();

		/**
		 * The meta object literal for the '<em><b>Ddspublisher</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DOMAIN_PARTICIPANT__DDSPUBLISHER = eINSTANCE.getDdsDomainParticipant_Ddspublisher();

		/**
		 * The meta object literal for the '<em><b>Ddsdomainparticipantqosprofile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DOMAIN_PARTICIPANT__DDSDOMAINPARTICIPANTQOSPROFILE = eINSTANCE.getDdsDomainParticipant_Ddsdomainparticipantqosprofile();

		/**
		 * The meta object literal for the '<em><b>Domain Participant Listener</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_LISTENER = eINSTANCE.getDdsDomainParticipant_DomainParticipantListener();

		/**
		 * The meta object literal for the '<em><b>Domain Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DOMAIN_PARTICIPANT__DOMAIN_ID = eINSTANCE.getDdsDomainParticipant_DomainId();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsTopicImpl <em>Dds Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsTopicImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsTopic()
		 * @generated
		 */
		EClass DDS_TOPIC = eINSTANCE.getDdsTopic();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_TOPIC__TOPIC_NAME = eINSTANCE.getDdsTopic_TopicName();

		/**
		 * The meta object literal for the '<em><b>Topic Listener</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_TOPIC__TOPIC_LISTENER = eINSTANCE.getDdsTopic_TopicListener();

		/**
		 * The meta object literal for the '<em><b>Topic Qos Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_TOPIC__TOPIC_QOS_PROFILE = eINSTANCE.getDdsTopic_TopicQosProfile();

		/**
		 * The meta object literal for the '<em><b>Ddsdatastructure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_TOPIC__DDSDATASTRUCTURE = eINSTANCE.getDdsTopic_Ddsdatastructure();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsQosProfileImpl <em>Dds Qos Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsQosProfileImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsQosProfile()
		 * @generated
		 */
		EClass DDS_QOS_PROFILE = eINSTANCE.getDdsQosProfile();

		/**
		 * The meta object literal for the '<em><b>Profile Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_QOS_PROFILE__PROFILE_NAME = eINSTANCE.getDdsQosProfile_ProfileName();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsSubscriberImpl <em>Dds Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsSubscriberImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsSubscriber()
		 * @generated
		 */
		EClass DDS_SUBSCRIBER = eINSTANCE.getDdsSubscriber();

		/**
		 * The meta object literal for the '<em><b>Subscriber Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_SUBSCRIBER__SUBSCRIBER_NAME = eINSTANCE.getDdsSubscriber_SubscriberName();

		/**
		 * The meta object literal for the '<em><b>Ddsdatareader</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_SUBSCRIBER__DDSDATAREADER = eINSTANCE.getDdsSubscriber_Ddsdatareader();

		/**
		 * The meta object literal for the '<em><b>Subscriber Listener</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_SUBSCRIBER__SUBSCRIBER_LISTENER = eINSTANCE.getDdsSubscriber_SubscriberListener();

		/**
		 * The meta object literal for the '<em><b>Subscriber Qos Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_SUBSCRIBER__SUBSCRIBER_QOS_PROFILE = eINSTANCE.getDdsSubscriber_SubscriberQosProfile();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDataReaderImpl <em>Dds Data Reader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDataReaderImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataReader()
		 * @generated
		 */
		EClass DDS_DATA_READER = eINSTANCE.getDdsDataReader();

		/**
		 * The meta object literal for the '<em><b>Data Reader Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DATA_READER__DATA_READER_NAME = eINSTANCE.getDdsDataReader_DataReaderName();

		/**
		 * The meta object literal for the '<em><b>Readable Topic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_READER__READABLE_TOPIC = eINSTANCE.getDdsDataReader_ReadableTopic();

		/**
		 * The meta object literal for the '<em><b>Data Reader Listener</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_READER__DATA_READER_LISTENER = eINSTANCE.getDdsDataReader_DataReaderListener();

		/**
		 * The meta object literal for the '<em><b>Data Reader Qos Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_READER__DATA_READER_QOS_PROFILE = eINSTANCE.getDdsDataReader_DataReaderQosProfile();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsPublisherImpl <em>Dds Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsPublisherImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsPublisher()
		 * @generated
		 */
		EClass DDS_PUBLISHER = eINSTANCE.getDdsPublisher();

		/**
		 * The meta object literal for the '<em><b>Publisher Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_PUBLISHER__PUBLISHER_NAME = eINSTANCE.getDdsPublisher_PublisherName();

		/**
		 * The meta object literal for the '<em><b>Ddsdatawriter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_PUBLISHER__DDSDATAWRITER = eINSTANCE.getDdsPublisher_Ddsdatawriter();

		/**
		 * The meta object literal for the '<em><b>Publisher Listener</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_PUBLISHER__PUBLISHER_LISTENER = eINSTANCE.getDdsPublisher_PublisherListener();

		/**
		 * The meta object literal for the '<em><b>Publisher Qos Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_PUBLISHER__PUBLISHER_QOS_PROFILE = eINSTANCE.getDdsPublisher_PublisherQosProfile();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDataWriterImpl <em>Dds Data Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDataWriterImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataWriter()
		 * @generated
		 */
		EClass DDS_DATA_WRITER = eINSTANCE.getDdsDataWriter();

		/**
		 * The meta object literal for the '<em><b>Data Writer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DATA_WRITER__DATA_WRITER_NAME = eINSTANCE.getDdsDataWriter_DataWriterName();

		/**
		 * The meta object literal for the '<em><b>Publiable Topic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER__PUBLIABLE_TOPIC = eINSTANCE.getDdsDataWriter_PubliableTopic();

		/**
		 * The meta object literal for the '<em><b>Data Writer Listener</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER__DATA_WRITER_LISTENER = eINSTANCE.getDdsDataWriter_DataWriterListener();

		/**
		 * The meta object literal for the '<em><b>Data Writer Qos Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER__DATA_WRITER_QOS_PROFILE = eINSTANCE.getDdsDataWriter_DataWriterQosProfile();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDataModuleImpl <em>Dds Data Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDataModuleImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataModule()
		 * @generated
		 */
		EClass DDS_DATA_MODULE = eINSTANCE.getDdsDataModule();

		/**
		 * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DATA_MODULE__MODULE_NAME = eINSTANCE.getDdsDataModule_ModuleName();

		/**
		 * The meta object literal for the '<em><b>Data Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_MODULE__DATA_STRUCTURES = eINSTANCE.getDdsDataModule_DataStructures();

		/**
		 * The meta object literal for the '<em><b>Inner Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_MODULE__INNER_MODULES = eINSTANCE.getDdsDataModule_InnerModules();

		/**
		 * The meta object literal for the '<em><b>Containing System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_MODULE__CONTAINING_SYSTEM = eINSTANCE.getDdsDataModule_ContainingSystem();

		/**
		 * The meta object literal for the '<em><b>Containing Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_MODULE__CONTAINING_MODULE = eINSTANCE.getDdsDataModule_ContainingModule();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDataStructureImpl <em>Dds Data Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDataStructureImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataStructure()
		 * @generated
		 */
		EClass DDS_DATA_STRUCTURE = eINSTANCE.getDdsDataStructure();

		/**
		 * The meta object literal for the '<em><b>Structure Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DATA_STRUCTURE__STRUCTURE_NAME = eINSTANCE.getDdsDataStructure_StructureName();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_STRUCTURE__FIELDS = eINSTANCE.getDdsDataStructure_Fields();

		/**
		 * The meta object literal for the '<em><b>Structured Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_STRUCTURE__STRUCTURED_FIELDS = eINSTANCE.getDdsDataStructure_StructuredFields();

		/**
		 * The meta object literal for the '<em><b>Container Data Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_STRUCTURE__CONTAINER_DATA_MODULE = eINSTANCE.getDdsDataStructure_ContainerDataModule();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDataFieldImpl <em>Dds Data Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDataFieldImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataField()
		 * @generated
		 */
		EClass DDS_DATA_FIELD = eINSTANCE.getDdsDataField();

		/**
		 * The meta object literal for the '<em><b>Field Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DATA_FIELD__FIELD_TYPE = eINSTANCE.getDdsDataField_FieldType();

		/**
		 * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DATA_FIELD__FIELD_NAME = eINSTANCE.getDdsDataField_FieldName();

		/**
		 * The meta object literal for the '<em><b>Is Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DATA_FIELD__IS_KEY = eINSTANCE.getDdsDataField_IsKey();

		/**
		 * The meta object literal for the '<em><b>Max Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DATA_FIELD__MAX_MULTIPLICITY = eINSTANCE.getDdsDataField_MaxMultiplicity();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDomainParticipantQosProfileImpl <em>Dds Domain Participant Qos Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDomainParticipantQosProfileImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDomainParticipantQosProfile()
		 * @generated
		 */
		EClass DDS_DOMAIN_PARTICIPANT_QOS_PROFILE = eINSTANCE.getDdsDomainParticipantQosProfile();

		/**
		 * The meta object literal for the '<em><b>User Data Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__USER_DATA_QOS = eINSTANCE.getDdsDomainParticipantQosProfile_UserDataQos();

		/**
		 * The meta object literal for the '<em><b>Entity Factory Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__ENTITY_FACTORY_QOS = eINSTANCE.getDdsDomainParticipantQosProfile_EntityFactoryQos();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsUserDataQosImpl <em>Dds User Data Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsUserDataQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsUserDataQos()
		 * @generated
		 */
		EClass DDS_USER_DATA_QOS = eINSTANCE.getDdsUserDataQos();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_USER_DATA_QOS__VALUE = eINSTANCE.getDdsUserDataQos_Value();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsEntityFactoryQosImpl <em>Dds Entity Factory Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsEntityFactoryQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsEntityFactoryQos()
		 * @generated
		 */
		EClass DDS_ENTITY_FACTORY_QOS = eINSTANCE.getDdsEntityFactoryQos();

		/**
		 * The meta object literal for the '<em><b>Autoenable created entities</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_ENTITY_FACTORY_QOS__AUTOENABLE_CREATED_ENTITIES = eINSTANCE.getDdsEntityFactoryQos_Autoenable_created_entities();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsTopicQosProfileImpl <em>Dds Topic Qos Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsTopicQosProfileImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsTopicQosProfile()
		 * @generated
		 */
		EClass DDS_TOPIC_QOS_PROFILE = eINSTANCE.getDdsTopicQosProfile();

		/**
		 * The meta object literal for the '<em><b>Topic Data Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_TOPIC_QOS_PROFILE__TOPIC_DATA_QOS = eINSTANCE.getDdsTopicQosProfile_TopicDataQos();

		/**
		 * The meta object literal for the '<em><b>Durability Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_TOPIC_QOS_PROFILE__DURABILITY_QOS = eINSTANCE.getDdsTopicQosProfile_DurabilityQos();

		/**
		 * The meta object literal for the '<em><b>Durability Service Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_TOPIC_QOS_PROFILE__DURABILITY_SERVICE_QOS = eINSTANCE.getDdsTopicQosProfile_DurabilityServiceQos();

		/**
		 * The meta object literal for the '<em><b>Latency Budget Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_TOPIC_QOS_PROFILE__LATENCY_BUDGET_QOS = eINSTANCE.getDdsTopicQosProfile_LatencyBudgetQos();

		/**
		 * The meta object literal for the '<em><b>Liveliness Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_TOPIC_QOS_PROFILE__LIVELINESS_QOS = eINSTANCE.getDdsTopicQosProfile_LivelinessQos();

		/**
		 * The meta object literal for the '<em><b>Ownership Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_TOPIC_QOS_PROFILE__OWNERSHIP_QOS = eINSTANCE.getDdsTopicQosProfile_OwnershipQos();

		/**
		 * The meta object literal for the '<em><b>Reliability Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_TOPIC_QOS_PROFILE__RELIABILITY_QOS = eINSTANCE.getDdsTopicQosProfile_ReliabilityQos();

		/**
		 * The meta object literal for the '<em><b>Destination Order Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_TOPIC_QOS_PROFILE__DESTINATION_ORDER_QOS = eINSTANCE.getDdsTopicQosProfile_DestinationOrderQos();

		/**
		 * The meta object literal for the '<em><b>History Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_TOPIC_QOS_PROFILE__HISTORY_QOS = eINSTANCE.getDdsTopicQosProfile_HistoryQos();

		/**
		 * The meta object literal for the '<em><b>Resource Limits Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_TOPIC_QOS_PROFILE__RESOURCE_LIMITS_QOS = eINSTANCE.getDdsTopicQosProfile_ResourceLimitsQos();

		/**
		 * The meta object literal for the '<em><b>Transport Priority Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_TOPIC_QOS_PROFILE__TRANSPORT_PRIORITY_QOS = eINSTANCE.getDdsTopicQosProfile_TransportPriorityQos();

		/**
		 * The meta object literal for the '<em><b>Lifespan Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_TOPIC_QOS_PROFILE__LIFESPAN_QOS = eINSTANCE.getDdsTopicQosProfile_LifespanQos();

		/**
		 * The meta object literal for the '<em><b>Deadline Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_TOPIC_QOS_PROFILE__DEADLINE_QOS = eINSTANCE.getDdsTopicQosProfile_DeadlineQos();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsTopicDataQosImpl <em>Dds Topic Data Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsTopicDataQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsTopicDataQos()
		 * @generated
		 */
		EClass DDS_TOPIC_DATA_QOS = eINSTANCE.getDdsTopicDataQos();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_TOPIC_DATA_QOS__VALUE = eINSTANCE.getDdsTopicDataQos_Value();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDurabilityQosImpl <em>Dds Durability Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDurabilityQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDurabilityQos()
		 * @generated
		 */
		EClass DDS_DURABILITY_QOS = eINSTANCE.getDdsDurabilityQos();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DURABILITY_QOS__KIND = eINSTANCE.getDdsDurabilityQos_Kind();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDurabilityServiceQosImpl <em>Dds Durability Service Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDurabilityServiceQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDurabilityServiceQos()
		 * @generated
		 */
		EClass DDS_DURABILITY_SERVICE_QOS = eINSTANCE.getDdsDurabilityServiceQos();

		/**
		 * The meta object literal for the '<em><b>Service cleanup delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DURABILITY_SERVICE_QOS__SERVICE_CLEANUP_DELAY = eINSTANCE.getDdsDurabilityServiceQos_Service_cleanup_delay();

		/**
		 * The meta object literal for the '<em><b>History kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DURABILITY_SERVICE_QOS__HISTORY_KIND = eINSTANCE.getDdsDurabilityServiceQos_History_kind();

		/**
		 * The meta object literal for the '<em><b>History depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DURABILITY_SERVICE_QOS__HISTORY_DEPTH = eINSTANCE.getDdsDurabilityServiceQos_History_depth();

		/**
		 * The meta object literal for the '<em><b>Max samples</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DURABILITY_SERVICE_QOS__MAX_SAMPLES = eINSTANCE.getDdsDurabilityServiceQos_Max_samples();

		/**
		 * The meta object literal for the '<em><b>Max instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DURABILITY_SERVICE_QOS__MAX_INSTANCES = eINSTANCE.getDdsDurabilityServiceQos_Max_instances();

		/**
		 * The meta object literal for the '<em><b>Max samples per instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DURABILITY_SERVICE_QOS__MAX_SAMPLES_PER_INSTANCES = eINSTANCE.getDdsDurabilityServiceQos_Max_samples_per_instances();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDurationImpl <em>Dds Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDurationImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDuration()
		 * @generated
		 */
		EClass DDS_DURATION = eINSTANCE.getDdsDuration();

		/**
		 * The meta object literal for the '<em><b>Sec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DURATION__SEC = eINSTANCE.getDdsDuration_Sec();

		/**
		 * The meta object literal for the '<em><b>Nano Sec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DURATION__NANO_SEC = eINSTANCE.getDdsDuration_NanoSec();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsPresentationQosImpl <em>Dds Presentation Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsPresentationQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsPresentationQos()
		 * @generated
		 */
		EClass DDS_PRESENTATION_QOS = eINSTANCE.getDdsPresentationQos();

		/**
		 * The meta object literal for the '<em><b>Access scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_PRESENTATION_QOS__ACCESS_SCOPE = eINSTANCE.getDdsPresentationQos_Access_scope();

		/**
		 * The meta object literal for the '<em><b>Coherent access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_PRESENTATION_QOS__COHERENT_ACCESS = eINSTANCE.getDdsPresentationQos_Coherent_access();

		/**
		 * The meta object literal for the '<em><b>Ordered access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_PRESENTATION_QOS__ORDERED_ACCESS = eINSTANCE.getDdsPresentationQos_Ordered_access();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDeadlineQosImpl <em>Dds Deadline Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDeadlineQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDeadlineQos()
		 * @generated
		 */
		EClass DDS_DEADLINE_QOS = eINSTANCE.getDdsDeadlineQos();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DEADLINE_QOS__PERIOD = eINSTANCE.getDdsDeadlineQos_Period();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsLatencyBudgetQosImpl <em>Dds Latency Budget Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsLatencyBudgetQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsLatencyBudgetQos()
		 * @generated
		 */
		EClass DDS_LATENCY_BUDGET_QOS = eINSTANCE.getDdsLatencyBudgetQos();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_LATENCY_BUDGET_QOS__DURATION = eINSTANCE.getDdsLatencyBudgetQos_Duration();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsOwnershipQosImpl <em>Dds Ownership Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsOwnershipQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsOwnershipQos()
		 * @generated
		 */
		EClass DDS_OWNERSHIP_QOS = eINSTANCE.getDdsOwnershipQos();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_OWNERSHIP_QOS__KIND = eINSTANCE.getDdsOwnershipQos_Kind();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsOwnershipStrengthQosImpl <em>Dds Ownership Strength Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsOwnershipStrengthQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsOwnershipStrengthQos()
		 * @generated
		 */
		EClass DDS_OWNERSHIP_STRENGTH_QOS = eINSTANCE.getDdsOwnershipStrengthQos();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_OWNERSHIP_STRENGTH_QOS__VALUE = eINSTANCE.getDdsOwnershipStrengthQos_Value();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsLivelinessQosImpl <em>Dds Liveliness Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsLivelinessQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsLivelinessQos()
		 * @generated
		 */
		EClass DDS_LIVELINESS_QOS = eINSTANCE.getDdsLivelinessQos();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_LIVELINESS_QOS__KIND = eINSTANCE.getDdsLivelinessQos_Kind();

		/**
		 * The meta object literal for the '<em><b>Lease duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_LIVELINESS_QOS__LEASE_DURATION = eINSTANCE.getDdsLivelinessQos_Lease_duration();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsTimeBasedFilterQosImpl <em>Dds Time Based Filter Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsTimeBasedFilterQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsTimeBasedFilterQos()
		 * @generated
		 */
		EClass DDS_TIME_BASED_FILTER_QOS = eINSTANCE.getDdsTimeBasedFilterQos();

		/**
		 * The meta object literal for the '<em><b>Minimum separation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_TIME_BASED_FILTER_QOS__MINIMUM_SEPARATION = eINSTANCE.getDdsTimeBasedFilterQos_Minimum_separation();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsPartitionQosImpl <em>Dds Partition Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsPartitionQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsPartitionQos()
		 * @generated
		 */
		EClass DDS_PARTITION_QOS = eINSTANCE.getDdsPartitionQos();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_PARTITION_QOS__NAME = eINSTANCE.getDdsPartitionQos_Name();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsReliabilityQosImpl <em>Dds Reliability Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsReliabilityQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsReliabilityQos()
		 * @generated
		 */
		EClass DDS_RELIABILITY_QOS = eINSTANCE.getDdsReliabilityQos();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_RELIABILITY_QOS__KIND = eINSTANCE.getDdsReliabilityQos_Kind();

		/**
		 * The meta object literal for the '<em><b>Max blocking time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_RELIABILITY_QOS__MAX_BLOCKING_TIME = eINSTANCE.getDdsReliabilityQos_Max_blocking_time();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsTransportPriorityQosImpl <em>Dds Transport Priority Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsTransportPriorityQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsTransportPriorityQos()
		 * @generated
		 */
		EClass DDS_TRANSPORT_PRIORITY_QOS = eINSTANCE.getDdsTransportPriorityQos();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_TRANSPORT_PRIORITY_QOS__VALUE = eINSTANCE.getDdsTransportPriorityQos_Value();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsLifespanImpl <em>Dds Lifespan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsLifespanImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsLifespan()
		 * @generated
		 */
		EClass DDS_LIFESPAN = eINSTANCE.getDdsLifespan();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_LIFESPAN__DURATION = eINSTANCE.getDdsLifespan_Duration();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsHistoryQosImpl <em>Dds History Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsHistoryQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsHistoryQos()
		 * @generated
		 */
		EClass DDS_HISTORY_QOS = eINSTANCE.getDdsHistoryQos();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_HISTORY_QOS__KIND = eINSTANCE.getDdsHistoryQos_Kind();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_HISTORY_QOS__DEPTH = eINSTANCE.getDdsHistoryQos_Depth();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsResourceLimitsImpl <em>Dds Resource Limits</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsResourceLimitsImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsResourceLimits()
		 * @generated
		 */
		EClass DDS_RESOURCE_LIMITS = eINSTANCE.getDdsResourceLimits();

		/**
		 * The meta object literal for the '<em><b>Max samples</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_RESOURCE_LIMITS__MAX_SAMPLES = eINSTANCE.getDdsResourceLimits_Max_samples();

		/**
		 * The meta object literal for the '<em><b>Max instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_RESOURCE_LIMITS__MAX_INSTANCES = eINSTANCE.getDdsResourceLimits_Max_instances();

		/**
		 * The meta object literal for the '<em><b>Max samples per instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_RESOURCE_LIMITS__MAX_SAMPLES_PER_INSTANCES = eINSTANCE.getDdsResourceLimits_Max_samples_per_instances();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDataWriterLifecycleQosImpl <em>Dds Data Writer Lifecycle Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDataWriterLifecycleQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataWriterLifecycleQos()
		 * @generated
		 */
		EClass DDS_DATA_WRITER_LIFECYCLE_QOS = eINSTANCE.getDdsDataWriterLifecycleQos();

		/**
		 * The meta object literal for the '<em><b>Autodispose unregistered instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DATA_WRITER_LIFECYCLE_QOS__AUTODISPOSE_UNREGISTERED_INSTANCES = eINSTANCE.getDdsDataWriterLifecycleQos_Autodispose_unregistered_instances();

		/**
		 * The meta object literal for the '<em><b>Autopurge suspended samples delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOPURGE_SUSPENDED_SAMPLES_DELAY = eINSTANCE.getDdsDataWriterLifecycleQos_Autopurge_suspended_samples_delay();

		/**
		 * The meta object literal for the '<em><b>Autounregister instance delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOUNREGISTER_INSTANCE_DELAY = eINSTANCE.getDdsDataWriterLifecycleQos_Autounregister_instance_delay();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDataReaderLifecycleQosImpl <em>Dds Data Reader Lifecycle Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDataReaderLifecycleQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataReaderLifecycleQos()
		 * @generated
		 */
		EClass DDS_DATA_READER_LIFECYCLE_QOS = eINSTANCE.getDdsDataReaderLifecycleQos();

		/**
		 * The meta object literal for the '<em><b>Autopurge nowriters samples delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_NOWRITERS_SAMPLES_DELAY = eINSTANCE.getDdsDataReaderLifecycleQos_Autopurge_nowriters_samples_delay();

		/**
		 * The meta object literal for the '<em><b>Autopurge disposed samples delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSED_SAMPLES_DELAY = eINSTANCE.getDdsDataReaderLifecycleQos_Autopurge_disposed_samples_delay();

		/**
		 * The meta object literal for the '<em><b>Autopurge dispose all</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSE_ALL = eINSTANCE.getDdsDataReaderLifecycleQos_Autopurge_dispose_all();

		/**
		 * The meta object literal for the '<em><b>Enable invalid samples</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DATA_READER_LIFECYCLE_QOS__ENABLE_INVALID_SAMPLES = eINSTANCE.getDdsDataReaderLifecycleQos_Enable_invalid_samples();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDestinationOrderQosImpl <em>Dds Destination Order Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDestinationOrderQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDestinationOrderQos()
		 * @generated
		 */
		EClass DDS_DESTINATION_ORDER_QOS = eINSTANCE.getDdsDestinationOrderQos();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DESTINATION_ORDER_QOS__KIND = eINSTANCE.getDdsDestinationOrderQos_Kind();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsPublisherQosProfileImpl <em>Dds Publisher Qos Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsPublisherQosProfileImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsPublisherQosProfile()
		 * @generated
		 */
		EClass DDS_PUBLISHER_QOS_PROFILE = eINSTANCE.getDdsPublisherQosProfile();

		/**
		 * The meta object literal for the '<em><b>Group Data Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_PUBLISHER_QOS_PROFILE__GROUP_DATA_QOS = eINSTANCE.getDdsPublisherQosProfile_GroupDataQos();

		/**
		 * The meta object literal for the '<em><b>Entity Factory Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_PUBLISHER_QOS_PROFILE__ENTITY_FACTORY_QOS = eINSTANCE.getDdsPublisherQosProfile_EntityFactoryQos();

		/**
		 * The meta object literal for the '<em><b>Presentation Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_PUBLISHER_QOS_PROFILE__PRESENTATION_QOS = eINSTANCE.getDdsPublisherQosProfile_PresentationQos();

		/**
		 * The meta object literal for the '<em><b>Partition Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_PUBLISHER_QOS_PROFILE__PARTITION_QOS = eINSTANCE.getDdsPublisherQosProfile_PartitionQos();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsGroupDataQosImpl <em>Dds Group Data Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsGroupDataQosImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsGroupDataQos()
		 * @generated
		 */
		EClass DDS_GROUP_DATA_QOS = eINSTANCE.getDdsGroupDataQos();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_GROUP_DATA_QOS__VALUE = eINSTANCE.getDdsGroupDataQos_Value();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDataWriterQosProfileImpl <em>Dds Data Writer Qos Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDataWriterQosProfileImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataWriterQosProfile()
		 * @generated
		 */
		EClass DDS_DATA_WRITER_QOS_PROFILE = eINSTANCE.getDdsDataWriterQosProfile();

		/**
		 * The meta object literal for the '<em><b>User Data Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER_QOS_PROFILE__USER_DATA_QOS = eINSTANCE.getDdsDataWriterQosProfile_UserDataQos();

		/**
		 * The meta object literal for the '<em><b>Durability Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER_QOS_PROFILE__DURABILITY_QOS = eINSTANCE.getDdsDataWriterQosProfile_DurabilityQos();

		/**
		 * The meta object literal for the '<em><b>Deadline Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER_QOS_PROFILE__DEADLINE_QOS = eINSTANCE.getDdsDataWriterQosProfile_DeadlineQos();

		/**
		 * The meta object literal for the '<em><b>Latency Budget Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER_QOS_PROFILE__LATENCY_BUDGET_QOS = eINSTANCE.getDdsDataWriterQosProfile_LatencyBudgetQos();

		/**
		 * The meta object literal for the '<em><b>Ownership Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_QOS = eINSTANCE.getDdsDataWriterQosProfile_OwnershipQos();

		/**
		 * The meta object literal for the '<em><b>Ownership Strength</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_STRENGTH = eINSTANCE.getDdsDataWriterQosProfile_OwnershipStrength();

		/**
		 * The meta object literal for the '<em><b>Liveliness Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER_QOS_PROFILE__LIVELINESS_QOS = eINSTANCE.getDdsDataWriterQosProfile_LivelinessQos();

		/**
		 * The meta object literal for the '<em><b>Reliability Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER_QOS_PROFILE__RELIABILITY_QOS = eINSTANCE.getDdsDataWriterQosProfile_ReliabilityQos();

		/**
		 * The meta object literal for the '<em><b>Transport Priority Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER_QOS_PROFILE__TRANSPORT_PRIORITY_QOS = eINSTANCE.getDdsDataWriterQosProfile_TransportPriorityQos();

		/**
		 * The meta object literal for the '<em><b>Lifespan Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER_QOS_PROFILE__LIFESPAN_QOS = eINSTANCE.getDdsDataWriterQosProfile_LifespanQos();

		/**
		 * The meta object literal for the '<em><b>Destination Order Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER_QOS_PROFILE__DESTINATION_ORDER_QOS = eINSTANCE.getDdsDataWriterQosProfile_DestinationOrderQos();

		/**
		 * The meta object literal for the '<em><b>History Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER_QOS_PROFILE__HISTORY_QOS = eINSTANCE.getDdsDataWriterQosProfile_HistoryQos();

		/**
		 * The meta object literal for the '<em><b>Resource Limits Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER_QOS_PROFILE__RESOURCE_LIMITS_QOS = eINSTANCE.getDdsDataWriterQosProfile_ResourceLimitsQos();

		/**
		 * The meta object literal for the '<em><b>Data Writer Lifecycle Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER_QOS_PROFILE__DATA_WRITER_LIFECYCLE_QOS = eINSTANCE.getDdsDataWriterQosProfile_DataWriterLifecycleQos();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsSubscriberQosProfileImpl <em>Dds Subscriber Qos Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsSubscriberQosProfileImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsSubscriberQosProfile()
		 * @generated
		 */
		EClass DDS_SUBSCRIBER_QOS_PROFILE = eINSTANCE.getDdsSubscriberQosProfile();

		/**
		 * The meta object literal for the '<em><b>Group Data Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_SUBSCRIBER_QOS_PROFILE__GROUP_DATA_QOS = eINSTANCE.getDdsSubscriberQosProfile_GroupDataQos();

		/**
		 * The meta object literal for the '<em><b>Entity Factory Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_SUBSCRIBER_QOS_PROFILE__ENTITY_FACTORY_QOS = eINSTANCE.getDdsSubscriberQosProfile_EntityFactoryQos();

		/**
		 * The meta object literal for the '<em><b>Presentation Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_SUBSCRIBER_QOS_PROFILE__PRESENTATION_QOS = eINSTANCE.getDdsSubscriberQosProfile_PresentationQos();

		/**
		 * The meta object literal for the '<em><b>Partition Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_SUBSCRIBER_QOS_PROFILE__PARTITION_QOS = eINSTANCE.getDdsSubscriberQosProfile_PartitionQos();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDataReaderQosProfileImpl <em>Dds Data Reader Qos Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDataReaderQosProfileImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataReaderQosProfile()
		 * @generated
		 */
		EClass DDS_DATA_READER_QOS_PROFILE = eINSTANCE.getDdsDataReaderQosProfile();

		/**
		 * The meta object literal for the '<em><b>User Data Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_READER_QOS_PROFILE__USER_DATA_QOS = eINSTANCE.getDdsDataReaderQosProfile_UserDataQos();

		/**
		 * The meta object literal for the '<em><b>Durability Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_READER_QOS_PROFILE__DURABILITY_QOS = eINSTANCE.getDdsDataReaderQosProfile_DurabilityQos();

		/**
		 * The meta object literal for the '<em><b>Deadline Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_READER_QOS_PROFILE__DEADLINE_QOS = eINSTANCE.getDdsDataReaderQosProfile_DeadlineQos();

		/**
		 * The meta object literal for the '<em><b>Latency Budget Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_READER_QOS_PROFILE__LATENCY_BUDGET_QOS = eINSTANCE.getDdsDataReaderQosProfile_LatencyBudgetQos();

		/**
		 * The meta object literal for the '<em><b>Liveliness Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_READER_QOS_PROFILE__LIVELINESS_QOS = eINSTANCE.getDdsDataReaderQosProfile_LivelinessQos();

		/**
		 * The meta object literal for the '<em><b>Ownership Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_READER_QOS_PROFILE__OWNERSHIP_QOS = eINSTANCE.getDdsDataReaderQosProfile_OwnershipQos();

		/**
		 * The meta object literal for the '<em><b>Time Based Filter Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_READER_QOS_PROFILE__TIME_BASED_FILTER_QOS = eINSTANCE.getDdsDataReaderQosProfile_TimeBasedFilterQos();

		/**
		 * The meta object literal for the '<em><b>Reliability Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_READER_QOS_PROFILE__RELIABILITY_QOS = eINSTANCE.getDdsDataReaderQosProfile_ReliabilityQos();

		/**
		 * The meta object literal for the '<em><b>Destination Order Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_READER_QOS_PROFILE__DESTINATION_ORDER_QOS = eINSTANCE.getDdsDataReaderQosProfile_DestinationOrderQos();

		/**
		 * The meta object literal for the '<em><b>History Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_READER_QOS_PROFILE__HISTORY_QOS = eINSTANCE.getDdsDataReaderQosProfile_HistoryQos();

		/**
		 * The meta object literal for the '<em><b>Resource Limits Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_READER_QOS_PROFILE__RESOURCE_LIMITS_QOS = eINSTANCE.getDdsDataReaderQosProfile_ResourceLimitsQos();

		/**
		 * The meta object literal for the '<em><b>Data Reader Lifecycle Qos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_READER_QOS_PROFILE__DATA_READER_LIFECYCLE_QOS = eINSTANCE.getDdsDataReaderQosProfile_DataReaderLifecycleQos();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDomainParticipantListenerImpl <em>Dds Domain Participant Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDomainParticipantListenerImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDomainParticipantListener()
		 * @generated
		 */
		EClass DDS_DOMAIN_PARTICIPANT_LISTENER = eINSTANCE.getDdsDomainParticipantListener();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DOMAIN_PARTICIPANT_LISTENER__NAME = eINSTANCE.getDdsDomainParticipantListener_Name();

		/**
		 * The meta object literal for the '<em><b>Listened Status</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DOMAIN_PARTICIPANT_LISTENER__LISTENED_STATUS = eINSTANCE.getDdsDomainParticipantListener_ListenedStatus();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsSubscriberListenerImpl <em>Dds Subscriber Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsSubscriberListenerImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsSubscriberListener()
		 * @generated
		 */
		EClass DDS_SUBSCRIBER_LISTENER = eINSTANCE.getDdsSubscriberListener();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_SUBSCRIBER_LISTENER__NAME = eINSTANCE.getDdsSubscriberListener_Name();

		/**
		 * The meta object literal for the '<em><b>Listened Status</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_SUBSCRIBER_LISTENER__LISTENED_STATUS = eINSTANCE.getDdsSubscriberListener_ListenedStatus();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsPublisherListenerImpl <em>Dds Publisher Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsPublisherListenerImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsPublisherListener()
		 * @generated
		 */
		EClass DDS_PUBLISHER_LISTENER = eINSTANCE.getDdsPublisherListener();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_PUBLISHER_LISTENER__NAME = eINSTANCE.getDdsPublisherListener_Name();

		/**
		 * The meta object literal for the '<em><b>Listened Status</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_PUBLISHER_LISTENER__LISTENED_STATUS = eINSTANCE.getDdsPublisherListener_ListenedStatus();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDataReaderListenerImpl <em>Dds Data Reader Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDataReaderListenerImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataReaderListener()
		 * @generated
		 */
		EClass DDS_DATA_READER_LISTENER = eINSTANCE.getDdsDataReaderListener();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DATA_READER_LISTENER__NAME = eINSTANCE.getDdsDataReaderListener_Name();

		/**
		 * The meta object literal for the '<em><b>Listened Status</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DATA_READER_LISTENER__LISTENED_STATUS = eINSTANCE.getDdsDataReaderListener_ListenedStatus();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDataWriterListenerImpl <em>Dds Data Writer Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDataWriterListenerImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataWriterListener()
		 * @generated
		 */
		EClass DDS_DATA_WRITER_LISTENER = eINSTANCE.getDdsDataWriterListener();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DATA_WRITER_LISTENER__NAME = eINSTANCE.getDdsDataWriterListener_Name();

		/**
		 * The meta object literal for the '<em><b>Listened Status</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DATA_WRITER_LISTENER__LISTENED_STATUS = eINSTANCE.getDdsDataWriterListener_ListenedStatus();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsTopicListenerImpl <em>Dds Topic Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsTopicListenerImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsTopicListener()
		 * @generated
		 */
		EClass DDS_TOPIC_LISTENER = eINSTANCE.getDdsTopicListener();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_TOPIC_LISTENER__NAME = eINSTANCE.getDdsTopicListener_Name();

		/**
		 * The meta object literal for the '<em><b>Listened Status</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_TOPIC_LISTENER__LISTENED_STATUS = eINSTANCE.getDdsTopicListener_ListenedStatus();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsWaitSetImpl <em>Dds Wait Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsWaitSetImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsWaitSet()
		 * @generated
		 */
		EClass DDS_WAIT_SET = eINSTANCE.getDdsWaitSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_WAIT_SET__NAME = eINSTANCE.getDdsWaitSet_Name();

		/**
		 * The meta object literal for the '<em><b>Read Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_WAIT_SET__READ_CONDITIONS = eINSTANCE.getDdsWaitSet_ReadConditions();

		/**
		 * The meta object literal for the '<em><b>Status Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_WAIT_SET__STATUS_CONDITIONS = eINSTANCE.getDdsWaitSet_StatusConditions();

		/**
		 * The meta object literal for the '<em><b>Guard Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_WAIT_SET__GUARD_CONDITIONS = eINSTANCE.getDdsWaitSet_GuardConditions();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsReadConditionImpl <em>Dds Read Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsReadConditionImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsReadCondition()
		 * @generated
		 */
		EClass DDS_READ_CONDITION = eINSTANCE.getDdsReadCondition();

		/**
		 * The meta object literal for the '<em><b>View state mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_READ_CONDITION__VIEW_STATE_MASK = eINSTANCE.getDdsReadCondition_View_state_mask();

		/**
		 * The meta object literal for the '<em><b>Instance state mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_READ_CONDITION__INSTANCE_STATE_MASK = eINSTANCE.getDdsReadCondition_Instance_state_mask();

		/**
		 * The meta object literal for the '<em><b>Sample state mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_READ_CONDITION__SAMPLE_STATE_MASK = eINSTANCE.getDdsReadCondition_Sample_state_mask();

		/**
		 * The meta object literal for the '<em><b>Data Reader</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_READ_CONDITION__DATA_READER = eINSTANCE.getDdsReadCondition_DataReader();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsStructuredFieldImpl <em>Dds Structured Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsStructuredFieldImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsStructuredField()
		 * @generated
		 */
		EClass DDS_STRUCTURED_FIELD = eINSTANCE.getDdsStructuredField();

		/**
		 * The meta object literal for the '<em><b>Is Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_STRUCTURED_FIELD__IS_KEY = eINSTANCE.getDdsStructuredField_IsKey();

		/**
		 * The meta object literal for the '<em><b>Referenced Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_STRUCTURED_FIELD__REFERENCED_TYPE = eINSTANCE.getDdsStructuredField_ReferencedType();

		/**
		 * The meta object literal for the '<em><b>Data Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_STRUCTURED_FIELD__DATA_STRUCTURE = eINSTANCE.getDdsStructuredField_DataStructure();

		/**
		 * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_STRUCTURED_FIELD__FIELD_NAME = eINSTANCE.getDdsStructuredField_FieldName();

		/**
		 * The meta object literal for the '<em><b>Max Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_STRUCTURED_FIELD__MAX_MULTIPLICITY = eINSTANCE.getDdsStructuredField_MaxMultiplicity();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsStatusConditionImpl <em>Dds Status Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsStatusConditionImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsStatusCondition()
		 * @generated
		 */
		EClass DDS_STATUS_CONDITION = eINSTANCE.getDdsStatusCondition();

		/**
		 * The meta object literal for the '<em><b>Containing Waitset</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_STATUS_CONDITION__CONTAINING_WAITSET = eINSTANCE.getDdsStatusCondition_ContainingWaitset();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDomainParticipantStatusConditionImpl <em>Dds Domain Participant Status Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDomainParticipantStatusConditionImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDomainParticipantStatusCondition()
		 * @generated
		 */
		EClass DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION = eINSTANCE.getDdsDomainParticipantStatusCondition();

		/**
		 * The meta object literal for the '<em><b>Enabled status</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION__ENABLED_STATUS = eINSTANCE.getDdsDomainParticipantStatusCondition_Enabled_status();

		/**
		 * The meta object literal for the '<em><b>Domain Participant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION__DOMAIN_PARTICIPANT = eINSTANCE.getDdsDomainParticipantStatusCondition_DomainParticipant();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsPublisherStatusConditionImpl <em>Dds Publisher Status Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsPublisherStatusConditionImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsPublisherStatusCondition()
		 * @generated
		 */
		EClass DDS_PUBLISHER_STATUS_CONDITION = eINSTANCE.getDdsPublisherStatusCondition();

		/**
		 * The meta object literal for the '<em><b>Enabled status</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_PUBLISHER_STATUS_CONDITION__ENABLED_STATUS = eINSTANCE.getDdsPublisherStatusCondition_Enabled_status();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_PUBLISHER_STATUS_CONDITION__PUBLISHER = eINSTANCE.getDdsPublisherStatusCondition_Publisher();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsSubscriberStatusConditionImpl <em>Dds Subscriber Status Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsSubscriberStatusConditionImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsSubscriberStatusCondition()
		 * @generated
		 */
		EClass DDS_SUBSCRIBER_STATUS_CONDITION = eINSTANCE.getDdsSubscriberStatusCondition();

		/**
		 * The meta object literal for the '<em><b>Enabled status</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_SUBSCRIBER_STATUS_CONDITION__ENABLED_STATUS = eINSTANCE.getDdsSubscriberStatusCondition_Enabled_status();

		/**
		 * The meta object literal for the '<em><b>Subscriber</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_SUBSCRIBER_STATUS_CONDITION__SUBSCRIBER = eINSTANCE.getDdsSubscriberStatusCondition_Subscriber();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDataWriterStatusConditionImpl <em>Dds Data Writer Status Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDataWriterStatusConditionImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataWriterStatusCondition()
		 * @generated
		 */
		EClass DDS_DATA_WRITER_STATUS_CONDITION = eINSTANCE.getDdsDataWriterStatusCondition();

		/**
		 * The meta object literal for the '<em><b>Enabled status</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DATA_WRITER_STATUS_CONDITION__ENABLED_STATUS = eINSTANCE.getDdsDataWriterStatusCondition_Enabled_status();

		/**
		 * The meta object literal for the '<em><b>Data Writer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_WRITER_STATUS_CONDITION__DATA_WRITER = eINSTANCE.getDdsDataWriterStatusCondition_DataWriter();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsDataReaderStatusConditionImpl <em>Dds Data Reader Status Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsDataReaderStatusConditionImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsDataReaderStatusCondition()
		 * @generated
		 */
		EClass DDS_DATA_READER_STATUS_CONDITION = eINSTANCE.getDdsDataReaderStatusCondition();

		/**
		 * The meta object literal for the '<em><b>Enabled status</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_DATA_READER_STATUS_CONDITION__ENABLED_STATUS = eINSTANCE.getDdsDataReaderStatusCondition_Enabled_status();

		/**
		 * The meta object literal for the '<em><b>Data Reader</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_DATA_READER_STATUS_CONDITION__DATA_READER = eINSTANCE.getDdsDataReaderStatusCondition_DataReader();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsTopicStatusConditionImpl <em>Dds Topic Status Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsTopicStatusConditionImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsTopicStatusCondition()
		 * @generated
		 */
		EClass DDS_TOPIC_STATUS_CONDITION = eINSTANCE.getDdsTopicStatusCondition();

		/**
		 * The meta object literal for the '<em><b>Enabled status</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_TOPIC_STATUS_CONDITION__ENABLED_STATUS = eINSTANCE.getDdsTopicStatusCondition_Enabled_status();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_TOPIC_STATUS_CONDITION__TOPIC = eINSTANCE.getDdsTopicStatusCondition_Topic();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.QueryConditionImpl <em>Query Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.QueryConditionImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getQueryCondition()
		 * @generated
		 */
		EClass QUERY_CONDITION = eINSTANCE.getQueryCondition();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_CONDITION__QUERY = eINSTANCE.getQueryCondition_Query();

		/**
		 * The meta object literal for the '<em><b>Query Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_CONDITION__QUERY_PARAMETERS = eINSTANCE.getQueryCondition_QueryParameters();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.GuardConditionImpl <em>Guard Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.GuardConditionImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getGuardCondition()
		 * @generated
		 */
		EClass GUARD_CONDITION = eINSTANCE.getGuardCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD_CONDITION__NAME = eINSTANCE.getGuardCondition_Name();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsSystemImpl <em>Dds System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsSystemImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsSystem()
		 * @generated
		 */
		EClass DDS_SYSTEM = eINSTANCE.getDdsSystem();

		/**
		 * The meta object literal for the '<em><b>System Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_SYSTEM__SYSTEM_NAME = eINSTANCE.getDdsSystem_SystemName();

		/**
		 * The meta object literal for the '<em><b>Hosts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_SYSTEM__HOSTS = eINSTANCE.getDdsSystem_Hosts();

		/**
		 * The meta object literal for the '<em><b>Qos Profiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_SYSTEM__QOS_PROFILES = eINSTANCE.getDdsSystem_QosProfiles();

		/**
		 * The meta object literal for the '<em><b>Data Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_SYSTEM__DATA_MODULES = eINSTANCE.getDdsSystem_DataModules();

		/**
		 * The meta object literal for the '<em><b>Topics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_SYSTEM__TOPICS = eINSTANCE.getDdsSystem_Topics();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.impl.DdsHostImpl <em>Dds Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.impl.DdsHostImpl
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDdsHost()
		 * @generated
		 */
		EClass DDS_HOST = eINSTANCE.getDdsHost();

		/**
		 * The meta object literal for the '<em><b>Host Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDS_HOST__HOST_NAME = eINSTANCE.getDdsHost_HostName();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDS_HOST__APPLICATIONS = eINSTANCE.getDdsHost_Applications();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.DurabilityQosPolicyKind
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDurabilityQosPolicyKind()
		 * @generated
		 */
		EEnum DURABILITY_QOS_POLICY_KIND = eINSTANCE.getDurabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.HistoryQosPolicyKind
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getHistoryQosPolicyKind()
		 * @generated
		 */
		EEnum HISTORY_QOS_POLICY_KIND = eINSTANCE.getHistoryQosPolicyKind();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.PresentationQosPolicyAccessScopeKind
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getPresentationQosPolicyAccessScopeKind()
		 * @generated
		 */
		EEnum PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = eINSTANCE.getPresentationQosPolicyAccessScopeKind();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.OwnershipQosPolicyKind
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getOwnershipQosPolicyKind()
		 * @generated
		 */
		EEnum OWNERSHIP_QOS_POLICY_KIND = eINSTANCE.getOwnershipQosPolicyKind();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.LivelinessQosPolicyKind
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getLivelinessQosPolicyKind()
		 * @generated
		 */
		EEnum LIVELINESS_QOS_POLICY_KIND = eINSTANCE.getLivelinessQosPolicyKind();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.ReliabilityQosPolicyKind
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getReliabilityQosPolicyKind()
		 * @generated
		 */
		EEnum RELIABILITY_QOS_POLICY_KIND = eINSTANCE.getReliabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.DestinationOrderQosPolicyKind
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDestinationOrderQosPolicyKind()
		 * @generated
		 */
		EEnum DESTINATION_ORDER_QOS_POLICY_KIND = eINSTANCE.getDestinationOrderQosPolicyKind();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.InvalidSampleVisibilityQosPolicy <em>Invalid Sample Visibility Qos Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.InvalidSampleVisibilityQosPolicy
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getInvalidSampleVisibilityQosPolicy()
		 * @generated
		 */
		EEnum INVALID_SAMPLE_VISIBILITY_QOS_POLICY = eINSTANCE.getInvalidSampleVisibilityQosPolicy();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.ViewStateKind <em>View State Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.ViewStateKind
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getViewStateKind()
		 * @generated
		 */
		EEnum VIEW_STATE_KIND = eINSTANCE.getViewStateKind();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.InstanceStateKind <em>Instance State Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.InstanceStateKind
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getInstanceStateKind()
		 * @generated
		 */
		EEnum INSTANCE_STATE_KIND = eINSTANCE.getInstanceStateKind();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.SampleStateKind <em>Sample State Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.SampleStateKind
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getSampleStateKind()
		 * @generated
		 */
		EEnum SAMPLE_STATE_KIND = eINSTANCE.getSampleStateKind();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.DomainParticipantStatus <em>Domain Participant Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.DomainParticipantStatus
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDomainParticipantStatus()
		 * @generated
		 */
		EEnum DOMAIN_PARTICIPANT_STATUS = eINSTANCE.getDomainParticipantStatus();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.SubscriberStatus <em>Subscriber Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.SubscriberStatus
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getSubscriberStatus()
		 * @generated
		 */
		EEnum SUBSCRIBER_STATUS = eINSTANCE.getSubscriberStatus();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.PublisherStatus <em>Publisher Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.PublisherStatus
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getPublisherStatus()
		 * @generated
		 */
		EEnum PUBLISHER_STATUS = eINSTANCE.getPublisherStatus();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.DataWriterStatus <em>Data Writer Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.DataWriterStatus
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDataWriterStatus()
		 * @generated
		 */
		EEnum DATA_WRITER_STATUS = eINSTANCE.getDataWriterStatus();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.DataReaderStatus <em>Data Reader Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.DataReaderStatus
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getDataReaderStatus()
		 * @generated
		 */
		EEnum DATA_READER_STATUS = eINSTANCE.getDataReaderStatus();

		/**
		 * The meta object literal for the '{@link ddsMetamodel.TopicStatus <em>Topic Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ddsMetamodel.TopicStatus
		 * @see ddsMetamodel.impl.DdsMetamodelPackageImpl#getTopicStatus()
		 * @generated
		 */
		EEnum TOPIC_STATUS = eINSTANCE.getTopicStatus();

	}

} //DdsMetamodelPackage
