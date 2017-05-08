/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDataWriterLifecycleQos;
import ddsMetamodel.DdsDataWriterQosProfile;
import ddsMetamodel.DdsDeadlineQos;
import ddsMetamodel.DdsDestinationOrderQos;
import ddsMetamodel.DdsDurabilityQos;
import ddsMetamodel.DdsHistoryQos;
import ddsMetamodel.DdsLatencyBudgetQos;
import ddsMetamodel.DdsLifespan;
import ddsMetamodel.DdsLivelinessQos;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsOwnershipQos;
import ddsMetamodel.DdsOwnershipStrengthQos;
import ddsMetamodel.DdsReliabilityQos;
import ddsMetamodel.DdsResourceLimits;
import ddsMetamodel.DdsTransportPriorityQos;
import ddsMetamodel.DdsUserDataQos;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Data Writer Qos Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterQosProfileImpl#getUserDataQos <em>User Data Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterQosProfileImpl#getDurabilityQos <em>Durability Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterQosProfileImpl#getDeadlineQos <em>Deadline Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterQosProfileImpl#getLatencyBudgetQos <em>Latency Budget Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterQosProfileImpl#getOwnershipQos <em>Ownership Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterQosProfileImpl#getOwnershipStrength <em>Ownership Strength</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterQosProfileImpl#getLivelinessQos <em>Liveliness Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterQosProfileImpl#getReliabilityQos <em>Reliability Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterQosProfileImpl#getTransportPriorityQos <em>Transport Priority Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterQosProfileImpl#getLifespanQos <em>Lifespan Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterQosProfileImpl#getDestinationOrderQos <em>Destination Order Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterQosProfileImpl#getHistoryQos <em>History Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterQosProfileImpl#getResourceLimitsQos <em>Resource Limits Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterQosProfileImpl#getDataWriterLifecycleQos <em>Data Writer Lifecycle Qos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsDataWriterQosProfileImpl extends DdsQosProfileImpl implements DdsDataWriterQosProfile {
	/**
	 * The cached value of the '{@link #getUserDataQos() <em>User Data Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataQos()
	 * @generated
	 * @ordered
	 */
	protected DdsUserDataQos userDataQos;

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
	 * The cached value of the '{@link #getDeadlineQos() <em>Deadline Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadlineQos()
	 * @generated
	 * @ordered
	 */
	protected DdsDeadlineQos deadlineQos;

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
	 * The cached value of the '{@link #getOwnershipQos() <em>Ownership Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnershipQos()
	 * @generated
	 * @ordered
	 */
	protected DdsOwnershipQos ownershipQos;

	/**
	 * The cached value of the '{@link #getOwnershipStrength() <em>Ownership Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnershipStrength()
	 * @generated
	 * @ordered
	 */
	protected DdsOwnershipStrengthQos ownershipStrength;

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
	 * The cached value of the '{@link #getReliabilityQos() <em>Reliability Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliabilityQos()
	 * @generated
	 * @ordered
	 */
	protected DdsReliabilityQos reliabilityQos;

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
	 * The cached value of the '{@link #getDataWriterLifecycleQos() <em>Data Writer Lifecycle Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataWriterLifecycleQos()
	 * @generated
	 * @ordered
	 */
	protected DdsDataWriterLifecycleQos dataWriterLifecycleQos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsDataWriterQosProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_DATA_WRITER_QOS_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsUserDataQos getUserDataQos() {
		return userDataQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDataQos(DdsUserDataQos newUserDataQos, NotificationChain msgs) {
		DdsUserDataQos oldUserDataQos = userDataQos;
		userDataQos = newUserDataQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__USER_DATA_QOS, oldUserDataQos, newUserDataQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDataQos(DdsUserDataQos newUserDataQos) {
		if (newUserDataQos != userDataQos) {
			NotificationChain msgs = null;
			if (userDataQos != null)
				msgs = ((InternalEObject)userDataQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__USER_DATA_QOS, null, msgs);
			if (newUserDataQos != null)
				msgs = ((InternalEObject)newUserDataQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__USER_DATA_QOS, null, msgs);
			msgs = basicSetUserDataQos(newUserDataQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__USER_DATA_QOS, newUserDataQos, newUserDataQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DURABILITY_QOS, oldDurabilityQos, newDurabilityQos);
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
				msgs = ((InternalEObject)durabilityQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DURABILITY_QOS, null, msgs);
			if (newDurabilityQos != null)
				msgs = ((InternalEObject)newDurabilityQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DURABILITY_QOS, null, msgs);
			msgs = basicSetDurabilityQos(newDurabilityQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DURABILITY_QOS, newDurabilityQos, newDurabilityQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DEADLINE_QOS, oldDeadlineQos, newDeadlineQos);
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
				msgs = ((InternalEObject)deadlineQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DEADLINE_QOS, null, msgs);
			if (newDeadlineQos != null)
				msgs = ((InternalEObject)newDeadlineQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DEADLINE_QOS, null, msgs);
			msgs = basicSetDeadlineQos(newDeadlineQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DEADLINE_QOS, newDeadlineQos, newDeadlineQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LATENCY_BUDGET_QOS, oldLatencyBudgetQos, newLatencyBudgetQos);
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
				msgs = ((InternalEObject)latencyBudgetQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LATENCY_BUDGET_QOS, null, msgs);
			if (newLatencyBudgetQos != null)
				msgs = ((InternalEObject)newLatencyBudgetQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LATENCY_BUDGET_QOS, null, msgs);
			msgs = basicSetLatencyBudgetQos(newLatencyBudgetQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LATENCY_BUDGET_QOS, newLatencyBudgetQos, newLatencyBudgetQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_QOS, oldOwnershipQos, newOwnershipQos);
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
				msgs = ((InternalEObject)ownershipQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_QOS, null, msgs);
			if (newOwnershipQos != null)
				msgs = ((InternalEObject)newOwnershipQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_QOS, null, msgs);
			msgs = basicSetOwnershipQos(newOwnershipQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_QOS, newOwnershipQos, newOwnershipQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsOwnershipStrengthQos getOwnershipStrength() {
		return ownershipStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnershipStrength(DdsOwnershipStrengthQos newOwnershipStrength, NotificationChain msgs) {
		DdsOwnershipStrengthQos oldOwnershipStrength = ownershipStrength;
		ownershipStrength = newOwnershipStrength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_STRENGTH, oldOwnershipStrength, newOwnershipStrength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnershipStrength(DdsOwnershipStrengthQos newOwnershipStrength) {
		if (newOwnershipStrength != ownershipStrength) {
			NotificationChain msgs = null;
			if (ownershipStrength != null)
				msgs = ((InternalEObject)ownershipStrength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_STRENGTH, null, msgs);
			if (newOwnershipStrength != null)
				msgs = ((InternalEObject)newOwnershipStrength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_STRENGTH, null, msgs);
			msgs = basicSetOwnershipStrength(newOwnershipStrength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_STRENGTH, newOwnershipStrength, newOwnershipStrength));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LIVELINESS_QOS, oldLivelinessQos, newLivelinessQos);
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
				msgs = ((InternalEObject)livelinessQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LIVELINESS_QOS, null, msgs);
			if (newLivelinessQos != null)
				msgs = ((InternalEObject)newLivelinessQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LIVELINESS_QOS, null, msgs);
			msgs = basicSetLivelinessQos(newLivelinessQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LIVELINESS_QOS, newLivelinessQos, newLivelinessQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__RELIABILITY_QOS, oldReliabilityQos, newReliabilityQos);
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
				msgs = ((InternalEObject)reliabilityQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__RELIABILITY_QOS, null, msgs);
			if (newReliabilityQos != null)
				msgs = ((InternalEObject)newReliabilityQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__RELIABILITY_QOS, null, msgs);
			msgs = basicSetReliabilityQos(newReliabilityQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__RELIABILITY_QOS, newReliabilityQos, newReliabilityQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__TRANSPORT_PRIORITY_QOS, oldTransportPriorityQos, newTransportPriorityQos);
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
				msgs = ((InternalEObject)transportPriorityQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__TRANSPORT_PRIORITY_QOS, null, msgs);
			if (newTransportPriorityQos != null)
				msgs = ((InternalEObject)newTransportPriorityQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__TRANSPORT_PRIORITY_QOS, null, msgs);
			msgs = basicSetTransportPriorityQos(newTransportPriorityQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__TRANSPORT_PRIORITY_QOS, newTransportPriorityQos, newTransportPriorityQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LIFESPAN_QOS, oldLifespanQos, newLifespanQos);
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
				msgs = ((InternalEObject)lifespanQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LIFESPAN_QOS, null, msgs);
			if (newLifespanQos != null)
				msgs = ((InternalEObject)newLifespanQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LIFESPAN_QOS, null, msgs);
			msgs = basicSetLifespanQos(newLifespanQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LIFESPAN_QOS, newLifespanQos, newLifespanQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DESTINATION_ORDER_QOS, oldDestinationOrderQos, newDestinationOrderQos);
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
				msgs = ((InternalEObject)destinationOrderQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DESTINATION_ORDER_QOS, null, msgs);
			if (newDestinationOrderQos != null)
				msgs = ((InternalEObject)newDestinationOrderQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DESTINATION_ORDER_QOS, null, msgs);
			msgs = basicSetDestinationOrderQos(newDestinationOrderQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DESTINATION_ORDER_QOS, newDestinationOrderQos, newDestinationOrderQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__HISTORY_QOS, oldHistoryQos, newHistoryQos);
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
				msgs = ((InternalEObject)historyQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__HISTORY_QOS, null, msgs);
			if (newHistoryQos != null)
				msgs = ((InternalEObject)newHistoryQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__HISTORY_QOS, null, msgs);
			msgs = basicSetHistoryQos(newHistoryQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__HISTORY_QOS, newHistoryQos, newHistoryQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__RESOURCE_LIMITS_QOS, oldResourceLimitsQos, newResourceLimitsQos);
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
				msgs = ((InternalEObject)resourceLimitsQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__RESOURCE_LIMITS_QOS, null, msgs);
			if (newResourceLimitsQos != null)
				msgs = ((InternalEObject)newResourceLimitsQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__RESOURCE_LIMITS_QOS, null, msgs);
			msgs = basicSetResourceLimitsQos(newResourceLimitsQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__RESOURCE_LIMITS_QOS, newResourceLimitsQos, newResourceLimitsQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataWriterLifecycleQos getDataWriterLifecycleQos() {
		return dataWriterLifecycleQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataWriterLifecycleQos(DdsDataWriterLifecycleQos newDataWriterLifecycleQos, NotificationChain msgs) {
		DdsDataWriterLifecycleQos oldDataWriterLifecycleQos = dataWriterLifecycleQos;
		dataWriterLifecycleQos = newDataWriterLifecycleQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DATA_WRITER_LIFECYCLE_QOS, oldDataWriterLifecycleQos, newDataWriterLifecycleQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataWriterLifecycleQos(DdsDataWriterLifecycleQos newDataWriterLifecycleQos) {
		if (newDataWriterLifecycleQos != dataWriterLifecycleQos) {
			NotificationChain msgs = null;
			if (dataWriterLifecycleQos != null)
				msgs = ((InternalEObject)dataWriterLifecycleQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DATA_WRITER_LIFECYCLE_QOS, null, msgs);
			if (newDataWriterLifecycleQos != null)
				msgs = ((InternalEObject)newDataWriterLifecycleQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DATA_WRITER_LIFECYCLE_QOS, null, msgs);
			msgs = basicSetDataWriterLifecycleQos(newDataWriterLifecycleQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DATA_WRITER_LIFECYCLE_QOS, newDataWriterLifecycleQos, newDataWriterLifecycleQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__USER_DATA_QOS:
				return basicSetUserDataQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DURABILITY_QOS:
				return basicSetDurabilityQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DEADLINE_QOS:
				return basicSetDeadlineQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LATENCY_BUDGET_QOS:
				return basicSetLatencyBudgetQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_QOS:
				return basicSetOwnershipQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_STRENGTH:
				return basicSetOwnershipStrength(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LIVELINESS_QOS:
				return basicSetLivelinessQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__RELIABILITY_QOS:
				return basicSetReliabilityQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__TRANSPORT_PRIORITY_QOS:
				return basicSetTransportPriorityQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LIFESPAN_QOS:
				return basicSetLifespanQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DESTINATION_ORDER_QOS:
				return basicSetDestinationOrderQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__HISTORY_QOS:
				return basicSetHistoryQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__RESOURCE_LIMITS_QOS:
				return basicSetResourceLimitsQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DATA_WRITER_LIFECYCLE_QOS:
				return basicSetDataWriterLifecycleQos(null, msgs);
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
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__USER_DATA_QOS:
				return getUserDataQos();
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DURABILITY_QOS:
				return getDurabilityQos();
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DEADLINE_QOS:
				return getDeadlineQos();
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LATENCY_BUDGET_QOS:
				return getLatencyBudgetQos();
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_QOS:
				return getOwnershipQos();
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_STRENGTH:
				return getOwnershipStrength();
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LIVELINESS_QOS:
				return getLivelinessQos();
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__RELIABILITY_QOS:
				return getReliabilityQos();
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__TRANSPORT_PRIORITY_QOS:
				return getTransportPriorityQos();
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LIFESPAN_QOS:
				return getLifespanQos();
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DESTINATION_ORDER_QOS:
				return getDestinationOrderQos();
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__HISTORY_QOS:
				return getHistoryQos();
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__RESOURCE_LIMITS_QOS:
				return getResourceLimitsQos();
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DATA_WRITER_LIFECYCLE_QOS:
				return getDataWriterLifecycleQos();
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
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__USER_DATA_QOS:
				setUserDataQos((DdsUserDataQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DURABILITY_QOS:
				setDurabilityQos((DdsDurabilityQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DEADLINE_QOS:
				setDeadlineQos((DdsDeadlineQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LATENCY_BUDGET_QOS:
				setLatencyBudgetQos((DdsLatencyBudgetQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_QOS:
				setOwnershipQos((DdsOwnershipQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_STRENGTH:
				setOwnershipStrength((DdsOwnershipStrengthQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LIVELINESS_QOS:
				setLivelinessQos((DdsLivelinessQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__RELIABILITY_QOS:
				setReliabilityQos((DdsReliabilityQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__TRANSPORT_PRIORITY_QOS:
				setTransportPriorityQos((DdsTransportPriorityQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LIFESPAN_QOS:
				setLifespanQos((DdsLifespan)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DESTINATION_ORDER_QOS:
				setDestinationOrderQos((DdsDestinationOrderQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__HISTORY_QOS:
				setHistoryQos((DdsHistoryQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__RESOURCE_LIMITS_QOS:
				setResourceLimitsQos((DdsResourceLimits)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DATA_WRITER_LIFECYCLE_QOS:
				setDataWriterLifecycleQos((DdsDataWriterLifecycleQos)newValue);
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
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__USER_DATA_QOS:
				setUserDataQos((DdsUserDataQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DURABILITY_QOS:
				setDurabilityQos((DdsDurabilityQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DEADLINE_QOS:
				setDeadlineQos((DdsDeadlineQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LATENCY_BUDGET_QOS:
				setLatencyBudgetQos((DdsLatencyBudgetQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_QOS:
				setOwnershipQos((DdsOwnershipQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_STRENGTH:
				setOwnershipStrength((DdsOwnershipStrengthQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LIVELINESS_QOS:
				setLivelinessQos((DdsLivelinessQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__RELIABILITY_QOS:
				setReliabilityQos((DdsReliabilityQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__TRANSPORT_PRIORITY_QOS:
				setTransportPriorityQos((DdsTransportPriorityQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LIFESPAN_QOS:
				setLifespanQos((DdsLifespan)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DESTINATION_ORDER_QOS:
				setDestinationOrderQos((DdsDestinationOrderQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__HISTORY_QOS:
				setHistoryQos((DdsHistoryQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__RESOURCE_LIMITS_QOS:
				setResourceLimitsQos((DdsResourceLimits)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DATA_WRITER_LIFECYCLE_QOS:
				setDataWriterLifecycleQos((DdsDataWriterLifecycleQos)null);
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
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__USER_DATA_QOS:
				return userDataQos != null;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DURABILITY_QOS:
				return durabilityQos != null;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DEADLINE_QOS:
				return deadlineQos != null;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LATENCY_BUDGET_QOS:
				return latencyBudgetQos != null;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_QOS:
				return ownershipQos != null;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__OWNERSHIP_STRENGTH:
				return ownershipStrength != null;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LIVELINESS_QOS:
				return livelinessQos != null;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__RELIABILITY_QOS:
				return reliabilityQos != null;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__TRANSPORT_PRIORITY_QOS:
				return transportPriorityQos != null;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__LIFESPAN_QOS:
				return lifespanQos != null;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DESTINATION_ORDER_QOS:
				return destinationOrderQos != null;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__HISTORY_QOS:
				return historyQos != null;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__RESOURCE_LIMITS_QOS:
				return resourceLimitsQos != null;
			case DdsMetamodelPackage.DDS_DATA_WRITER_QOS_PROFILE__DATA_WRITER_LIFECYCLE_QOS:
				return dataWriterLifecycleQos != null;
		}
		return super.eIsSet(featureID);
	}

} //DdsDataWriterQosProfileImpl
