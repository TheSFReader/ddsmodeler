/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDeadlineQos;
import ddsMetamodel.DdsDestinationOrderQos;
import ddsMetamodel.DdsDurabilityQos;
import ddsMetamodel.DdsDurabilityServiceQos;
import ddsMetamodel.DdsHistoryQos;
import ddsMetamodel.DdsLatencyBudgetQos;
import ddsMetamodel.DdsLifespan;
import ddsMetamodel.DdsLivelinessQos;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsOwnershipQos;
import ddsMetamodel.DdsReliabilityQos;
import ddsMetamodel.DdsResourceLimits;
import ddsMetamodel.DdsTopicDataQos;
import ddsMetamodel.DdsTopicQosProfile;
import ddsMetamodel.DdsTransportPriorityQos;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Topic Qos Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsTopicQosProfileImpl#getTopicDataQos <em>Topic Data Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsTopicQosProfileImpl#getDurabilityQos <em>Durability Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsTopicQosProfileImpl#getDurabilityServiceQos <em>Durability Service Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsTopicQosProfileImpl#getLatencyBudgetQos <em>Latency Budget Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsTopicQosProfileImpl#getLivelinessQos <em>Liveliness Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsTopicQosProfileImpl#getOwnershipQos <em>Ownership Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsTopicQosProfileImpl#getReliabilityQos <em>Reliability Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsTopicQosProfileImpl#getDestinationOrderQos <em>Destination Order Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsTopicQosProfileImpl#getHistoryQos <em>History Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsTopicQosProfileImpl#getResourceLimitsQos <em>Resource Limits Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsTopicQosProfileImpl#getTransportPriorityQos <em>Transport Priority Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsTopicQosProfileImpl#getLifespanQos <em>Lifespan Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsTopicQosProfileImpl#getDeadlineQos <em>Deadline Qos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsTopicQosProfileImpl extends DdsQosProfileImpl implements DdsTopicQosProfile {
	/**
	 * The cached value of the '{@link #getTopicDataQos() <em>Topic Data Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicDataQos()
	 * @generated
	 * @ordered
	 */
	protected DdsTopicDataQos topicDataQos;

	/**
	 * The cached value of the '{@link #getDurabilityQos() <em>Durability Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurabilityQos()
	 * @generated
	 * @ordered
	 */
	protected DdsDurabilityQos durabilityQos;

	/**
	 * The cached value of the '{@link #getDurabilityServiceQos() <em>Durability Service Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurabilityServiceQos()
	 * @generated
	 * @ordered
	 */
	protected DdsDurabilityServiceQos durabilityServiceQos;

	/**
	 * The cached value of the '{@link #getLatencyBudgetQos() <em>Latency Budget Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencyBudgetQos()
	 * @generated
	 * @ordered
	 */
	protected DdsLatencyBudgetQos latencyBudgetQos;

	/**
	 * The cached value of the '{@link #getLivelinessQos() <em>Liveliness Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLivelinessQos()
	 * @generated
	 * @ordered
	 */
	protected DdsLivelinessQos livelinessQos;

	/**
	 * The cached value of the '{@link #getOwnershipQos() <em>Ownership Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnershipQos()
	 * @generated
	 * @ordered
	 */
	protected DdsOwnershipQos ownershipQos;

	/**
	 * The cached value of the '{@link #getReliabilityQos() <em>Reliability Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliabilityQos()
	 * @generated
	 * @ordered
	 */
	protected DdsReliabilityQos reliabilityQos;

	/**
	 * The cached value of the '{@link #getDestinationOrderQos() <em>Destination Order Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationOrderQos()
	 * @generated
	 * @ordered
	 */
	protected DdsDestinationOrderQos destinationOrderQos;

	/**
	 * The cached value of the '{@link #getHistoryQos() <em>History Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryQos()
	 * @generated
	 * @ordered
	 */
	protected DdsHistoryQos historyQos;

	/**
	 * The cached value of the '{@link #getResourceLimitsQos() <em>Resource Limits Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceLimitsQos()
	 * @generated
	 * @ordered
	 */
	protected DdsResourceLimits resourceLimitsQos;

	/**
	 * The cached value of the '{@link #getTransportPriorityQos() <em>Transport Priority Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportPriorityQos()
	 * @generated
	 * @ordered
	 */
	protected DdsTransportPriorityQos transportPriorityQos;

	/**
	 * The cached value of the '{@link #getLifespanQos() <em>Lifespan Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifespanQos()
	 * @generated
	 * @ordered
	 */
	protected DdsLifespan lifespanQos;

	/**
	 * The cached value of the '{@link #getDeadlineQos() <em>Deadline Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadlineQos()
	 * @generated
	 * @ordered
	 */
	protected DdsDeadlineQos deadlineQos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsTopicQosProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_TOPIC_QOS_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTopicDataQos getTopicDataQos() {
		return topicDataQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopicDataQos(DdsTopicDataQos newTopicDataQos, NotificationChain msgs) {
		DdsTopicDataQos oldTopicDataQos = topicDataQos;
		topicDataQos = newTopicDataQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__TOPIC_DATA_QOS, oldTopicDataQos, newTopicDataQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicDataQos(DdsTopicDataQos newTopicDataQos) {
		if (newTopicDataQos != topicDataQos) {
			NotificationChain msgs = null;
			if (topicDataQos != null)
				msgs = ((InternalEObject)topicDataQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__TOPIC_DATA_QOS, null, msgs);
			if (newTopicDataQos != null)
				msgs = ((InternalEObject)newTopicDataQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__TOPIC_DATA_QOS, null, msgs);
			msgs = basicSetTopicDataQos(newTopicDataQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__TOPIC_DATA_QOS, newTopicDataQos, newTopicDataQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDurabilityQos getDurabilityQos() {
		return durabilityQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurabilityQos(DdsDurabilityQos newDurabilityQos, NotificationChain msgs) {
		DdsDurabilityQos oldDurabilityQos = durabilityQos;
		durabilityQos = newDurabilityQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DURABILITY_QOS, oldDurabilityQos, newDurabilityQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurabilityQos(DdsDurabilityQos newDurabilityQos) {
		if (newDurabilityQos != durabilityQos) {
			NotificationChain msgs = null;
			if (durabilityQos != null)
				msgs = ((InternalEObject)durabilityQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DURABILITY_QOS, null, msgs);
			if (newDurabilityQos != null)
				msgs = ((InternalEObject)newDurabilityQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DURABILITY_QOS, null, msgs);
			msgs = basicSetDurabilityQos(newDurabilityQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DURABILITY_QOS, newDurabilityQos, newDurabilityQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDurabilityServiceQos getDurabilityServiceQos() {
		return durabilityServiceQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurabilityServiceQos(DdsDurabilityServiceQos newDurabilityServiceQos, NotificationChain msgs) {
		DdsDurabilityServiceQos oldDurabilityServiceQos = durabilityServiceQos;
		durabilityServiceQos = newDurabilityServiceQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DURABILITY_SERVICE_QOS, oldDurabilityServiceQos, newDurabilityServiceQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurabilityServiceQos(DdsDurabilityServiceQos newDurabilityServiceQos) {
		if (newDurabilityServiceQos != durabilityServiceQos) {
			NotificationChain msgs = null;
			if (durabilityServiceQos != null)
				msgs = ((InternalEObject)durabilityServiceQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DURABILITY_SERVICE_QOS, null, msgs);
			if (newDurabilityServiceQos != null)
				msgs = ((InternalEObject)newDurabilityServiceQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DURABILITY_SERVICE_QOS, null, msgs);
			msgs = basicSetDurabilityServiceQos(newDurabilityServiceQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DURABILITY_SERVICE_QOS, newDurabilityServiceQos, newDurabilityServiceQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsLatencyBudgetQos getLatencyBudgetQos() {
		return latencyBudgetQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatencyBudgetQos(DdsLatencyBudgetQos newLatencyBudgetQos, NotificationChain msgs) {
		DdsLatencyBudgetQos oldLatencyBudgetQos = latencyBudgetQos;
		latencyBudgetQos = newLatencyBudgetQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LATENCY_BUDGET_QOS, oldLatencyBudgetQos, newLatencyBudgetQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatencyBudgetQos(DdsLatencyBudgetQos newLatencyBudgetQos) {
		if (newLatencyBudgetQos != latencyBudgetQos) {
			NotificationChain msgs = null;
			if (latencyBudgetQos != null)
				msgs = ((InternalEObject)latencyBudgetQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LATENCY_BUDGET_QOS, null, msgs);
			if (newLatencyBudgetQos != null)
				msgs = ((InternalEObject)newLatencyBudgetQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LATENCY_BUDGET_QOS, null, msgs);
			msgs = basicSetLatencyBudgetQos(newLatencyBudgetQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LATENCY_BUDGET_QOS, newLatencyBudgetQos, newLatencyBudgetQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsLivelinessQos getLivelinessQos() {
		return livelinessQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLivelinessQos(DdsLivelinessQos newLivelinessQos, NotificationChain msgs) {
		DdsLivelinessQos oldLivelinessQos = livelinessQos;
		livelinessQos = newLivelinessQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LIVELINESS_QOS, oldLivelinessQos, newLivelinessQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLivelinessQos(DdsLivelinessQos newLivelinessQos) {
		if (newLivelinessQos != livelinessQos) {
			NotificationChain msgs = null;
			if (livelinessQos != null)
				msgs = ((InternalEObject)livelinessQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LIVELINESS_QOS, null, msgs);
			if (newLivelinessQos != null)
				msgs = ((InternalEObject)newLivelinessQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LIVELINESS_QOS, null, msgs);
			msgs = basicSetLivelinessQos(newLivelinessQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LIVELINESS_QOS, newLivelinessQos, newLivelinessQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsOwnershipQos getOwnershipQos() {
		return ownershipQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnershipQos(DdsOwnershipQos newOwnershipQos, NotificationChain msgs) {
		DdsOwnershipQos oldOwnershipQos = ownershipQos;
		ownershipQos = newOwnershipQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__OWNERSHIP_QOS, oldOwnershipQos, newOwnershipQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnershipQos(DdsOwnershipQos newOwnershipQos) {
		if (newOwnershipQos != ownershipQos) {
			NotificationChain msgs = null;
			if (ownershipQos != null)
				msgs = ((InternalEObject)ownershipQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__OWNERSHIP_QOS, null, msgs);
			if (newOwnershipQos != null)
				msgs = ((InternalEObject)newOwnershipQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__OWNERSHIP_QOS, null, msgs);
			msgs = basicSetOwnershipQos(newOwnershipQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__OWNERSHIP_QOS, newOwnershipQos, newOwnershipQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsReliabilityQos getReliabilityQos() {
		return reliabilityQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReliabilityQos(DdsReliabilityQos newReliabilityQos, NotificationChain msgs) {
		DdsReliabilityQos oldReliabilityQos = reliabilityQos;
		reliabilityQos = newReliabilityQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__RELIABILITY_QOS, oldReliabilityQos, newReliabilityQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliabilityQos(DdsReliabilityQos newReliabilityQos) {
		if (newReliabilityQos != reliabilityQos) {
			NotificationChain msgs = null;
			if (reliabilityQos != null)
				msgs = ((InternalEObject)reliabilityQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__RELIABILITY_QOS, null, msgs);
			if (newReliabilityQos != null)
				msgs = ((InternalEObject)newReliabilityQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__RELIABILITY_QOS, null, msgs);
			msgs = basicSetReliabilityQos(newReliabilityQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__RELIABILITY_QOS, newReliabilityQos, newReliabilityQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDestinationOrderQos getDestinationOrderQos() {
		return destinationOrderQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestinationOrderQos(DdsDestinationOrderQos newDestinationOrderQos, NotificationChain msgs) {
		DdsDestinationOrderQos oldDestinationOrderQos = destinationOrderQos;
		destinationOrderQos = newDestinationOrderQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DESTINATION_ORDER_QOS, oldDestinationOrderQos, newDestinationOrderQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationOrderQos(DdsDestinationOrderQos newDestinationOrderQos) {
		if (newDestinationOrderQos != destinationOrderQos) {
			NotificationChain msgs = null;
			if (destinationOrderQos != null)
				msgs = ((InternalEObject)destinationOrderQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DESTINATION_ORDER_QOS, null, msgs);
			if (newDestinationOrderQos != null)
				msgs = ((InternalEObject)newDestinationOrderQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DESTINATION_ORDER_QOS, null, msgs);
			msgs = basicSetDestinationOrderQos(newDestinationOrderQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DESTINATION_ORDER_QOS, newDestinationOrderQos, newDestinationOrderQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsHistoryQos getHistoryQos() {
		return historyQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryQos(DdsHistoryQos newHistoryQos, NotificationChain msgs) {
		DdsHistoryQos oldHistoryQos = historyQos;
		historyQos = newHistoryQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__HISTORY_QOS, oldHistoryQos, newHistoryQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryQos(DdsHistoryQos newHistoryQos) {
		if (newHistoryQos != historyQos) {
			NotificationChain msgs = null;
			if (historyQos != null)
				msgs = ((InternalEObject)historyQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__HISTORY_QOS, null, msgs);
			if (newHistoryQos != null)
				msgs = ((InternalEObject)newHistoryQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__HISTORY_QOS, null, msgs);
			msgs = basicSetHistoryQos(newHistoryQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__HISTORY_QOS, newHistoryQos, newHistoryQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsResourceLimits getResourceLimitsQos() {
		return resourceLimitsQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceLimitsQos(DdsResourceLimits newResourceLimitsQos, NotificationChain msgs) {
		DdsResourceLimits oldResourceLimitsQos = resourceLimitsQos;
		resourceLimitsQos = newResourceLimitsQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__RESOURCE_LIMITS_QOS, oldResourceLimitsQos, newResourceLimitsQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceLimitsQos(DdsResourceLimits newResourceLimitsQos) {
		if (newResourceLimitsQos != resourceLimitsQos) {
			NotificationChain msgs = null;
			if (resourceLimitsQos != null)
				msgs = ((InternalEObject)resourceLimitsQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__RESOURCE_LIMITS_QOS, null, msgs);
			if (newResourceLimitsQos != null)
				msgs = ((InternalEObject)newResourceLimitsQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__RESOURCE_LIMITS_QOS, null, msgs);
			msgs = basicSetResourceLimitsQos(newResourceLimitsQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__RESOURCE_LIMITS_QOS, newResourceLimitsQos, newResourceLimitsQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTransportPriorityQos getTransportPriorityQos() {
		return transportPriorityQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportPriorityQos(DdsTransportPriorityQos newTransportPriorityQos, NotificationChain msgs) {
		DdsTransportPriorityQos oldTransportPriorityQos = transportPriorityQos;
		transportPriorityQos = newTransportPriorityQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__TRANSPORT_PRIORITY_QOS, oldTransportPriorityQos, newTransportPriorityQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportPriorityQos(DdsTransportPriorityQos newTransportPriorityQos) {
		if (newTransportPriorityQos != transportPriorityQos) {
			NotificationChain msgs = null;
			if (transportPriorityQos != null)
				msgs = ((InternalEObject)transportPriorityQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__TRANSPORT_PRIORITY_QOS, null, msgs);
			if (newTransportPriorityQos != null)
				msgs = ((InternalEObject)newTransportPriorityQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__TRANSPORT_PRIORITY_QOS, null, msgs);
			msgs = basicSetTransportPriorityQos(newTransportPriorityQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__TRANSPORT_PRIORITY_QOS, newTransportPriorityQos, newTransportPriorityQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsLifespan getLifespanQos() {
		return lifespanQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifespanQos(DdsLifespan newLifespanQos, NotificationChain msgs) {
		DdsLifespan oldLifespanQos = lifespanQos;
		lifespanQos = newLifespanQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LIFESPAN_QOS, oldLifespanQos, newLifespanQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifespanQos(DdsLifespan newLifespanQos) {
		if (newLifespanQos != lifespanQos) {
			NotificationChain msgs = null;
			if (lifespanQos != null)
				msgs = ((InternalEObject)lifespanQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LIFESPAN_QOS, null, msgs);
			if (newLifespanQos != null)
				msgs = ((InternalEObject)newLifespanQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LIFESPAN_QOS, null, msgs);
			msgs = basicSetLifespanQos(newLifespanQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LIFESPAN_QOS, newLifespanQos, newLifespanQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDeadlineQos getDeadlineQos() {
		return deadlineQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeadlineQos(DdsDeadlineQos newDeadlineQos, NotificationChain msgs) {
		DdsDeadlineQos oldDeadlineQos = deadlineQos;
		deadlineQos = newDeadlineQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DEADLINE_QOS, oldDeadlineQos, newDeadlineQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadlineQos(DdsDeadlineQos newDeadlineQos) {
		if (newDeadlineQos != deadlineQos) {
			NotificationChain msgs = null;
			if (deadlineQos != null)
				msgs = ((InternalEObject)deadlineQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DEADLINE_QOS, null, msgs);
			if (newDeadlineQos != null)
				msgs = ((InternalEObject)newDeadlineQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DEADLINE_QOS, null, msgs);
			msgs = basicSetDeadlineQos(newDeadlineQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DEADLINE_QOS, newDeadlineQos, newDeadlineQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__TOPIC_DATA_QOS:
				return basicSetTopicDataQos(null, msgs);
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DURABILITY_QOS:
				return basicSetDurabilityQos(null, msgs);
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DURABILITY_SERVICE_QOS:
				return basicSetDurabilityServiceQos(null, msgs);
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LATENCY_BUDGET_QOS:
				return basicSetLatencyBudgetQos(null, msgs);
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LIVELINESS_QOS:
				return basicSetLivelinessQos(null, msgs);
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__OWNERSHIP_QOS:
				return basicSetOwnershipQos(null, msgs);
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__RELIABILITY_QOS:
				return basicSetReliabilityQos(null, msgs);
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DESTINATION_ORDER_QOS:
				return basicSetDestinationOrderQos(null, msgs);
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__HISTORY_QOS:
				return basicSetHistoryQos(null, msgs);
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__RESOURCE_LIMITS_QOS:
				return basicSetResourceLimitsQos(null, msgs);
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__TRANSPORT_PRIORITY_QOS:
				return basicSetTransportPriorityQos(null, msgs);
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LIFESPAN_QOS:
				return basicSetLifespanQos(null, msgs);
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DEADLINE_QOS:
				return basicSetDeadlineQos(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__TOPIC_DATA_QOS:
				return getTopicDataQos();
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DURABILITY_QOS:
				return getDurabilityQos();
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DURABILITY_SERVICE_QOS:
				return getDurabilityServiceQos();
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LATENCY_BUDGET_QOS:
				return getLatencyBudgetQos();
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LIVELINESS_QOS:
				return getLivelinessQos();
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__OWNERSHIP_QOS:
				return getOwnershipQos();
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__RELIABILITY_QOS:
				return getReliabilityQos();
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DESTINATION_ORDER_QOS:
				return getDestinationOrderQos();
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__HISTORY_QOS:
				return getHistoryQos();
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__RESOURCE_LIMITS_QOS:
				return getResourceLimitsQos();
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__TRANSPORT_PRIORITY_QOS:
				return getTransportPriorityQos();
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LIFESPAN_QOS:
				return getLifespanQos();
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DEADLINE_QOS:
				return getDeadlineQos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__TOPIC_DATA_QOS:
				setTopicDataQos((DdsTopicDataQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DURABILITY_QOS:
				setDurabilityQos((DdsDurabilityQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DURABILITY_SERVICE_QOS:
				setDurabilityServiceQos((DdsDurabilityServiceQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LATENCY_BUDGET_QOS:
				setLatencyBudgetQos((DdsLatencyBudgetQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LIVELINESS_QOS:
				setLivelinessQos((DdsLivelinessQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__OWNERSHIP_QOS:
				setOwnershipQos((DdsOwnershipQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__RELIABILITY_QOS:
				setReliabilityQos((DdsReliabilityQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DESTINATION_ORDER_QOS:
				setDestinationOrderQos((DdsDestinationOrderQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__HISTORY_QOS:
				setHistoryQos((DdsHistoryQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__RESOURCE_LIMITS_QOS:
				setResourceLimitsQos((DdsResourceLimits)newValue);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__TRANSPORT_PRIORITY_QOS:
				setTransportPriorityQos((DdsTransportPriorityQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LIFESPAN_QOS:
				setLifespanQos((DdsLifespan)newValue);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DEADLINE_QOS:
				setDeadlineQos((DdsDeadlineQos)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__TOPIC_DATA_QOS:
				setTopicDataQos((DdsTopicDataQos)null);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DURABILITY_QOS:
				setDurabilityQos((DdsDurabilityQos)null);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DURABILITY_SERVICE_QOS:
				setDurabilityServiceQos((DdsDurabilityServiceQos)null);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LATENCY_BUDGET_QOS:
				setLatencyBudgetQos((DdsLatencyBudgetQos)null);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LIVELINESS_QOS:
				setLivelinessQos((DdsLivelinessQos)null);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__OWNERSHIP_QOS:
				setOwnershipQos((DdsOwnershipQos)null);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__RELIABILITY_QOS:
				setReliabilityQos((DdsReliabilityQos)null);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DESTINATION_ORDER_QOS:
				setDestinationOrderQos((DdsDestinationOrderQos)null);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__HISTORY_QOS:
				setHistoryQos((DdsHistoryQos)null);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__RESOURCE_LIMITS_QOS:
				setResourceLimitsQos((DdsResourceLimits)null);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__TRANSPORT_PRIORITY_QOS:
				setTransportPriorityQos((DdsTransportPriorityQos)null);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LIFESPAN_QOS:
				setLifespanQos((DdsLifespan)null);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DEADLINE_QOS:
				setDeadlineQos((DdsDeadlineQos)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__TOPIC_DATA_QOS:
				return topicDataQos != null;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DURABILITY_QOS:
				return durabilityQos != null;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DURABILITY_SERVICE_QOS:
				return durabilityServiceQos != null;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LATENCY_BUDGET_QOS:
				return latencyBudgetQos != null;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LIVELINESS_QOS:
				return livelinessQos != null;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__OWNERSHIP_QOS:
				return ownershipQos != null;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__RELIABILITY_QOS:
				return reliabilityQos != null;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DESTINATION_ORDER_QOS:
				return destinationOrderQos != null;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__HISTORY_QOS:
				return historyQos != null;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__RESOURCE_LIMITS_QOS:
				return resourceLimitsQos != null;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__TRANSPORT_PRIORITY_QOS:
				return transportPriorityQos != null;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__LIFESPAN_QOS:
				return lifespanQos != null;
			case DdsMetamodelPackage.DDS_TOPIC_QOS_PROFILE__DEADLINE_QOS:
				return deadlineQos != null;
		}
		return super.eIsSet(featureID);
	}

} //DdsTopicQosProfileImpl
