/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDataReaderLifecycleQos;
import ddsMetamodel.DdsDataReaderQosProfile;
import ddsMetamodel.DdsDeadlineQos;
import ddsMetamodel.DdsDestinationOrderQos;
import ddsMetamodel.DdsDurabilityQos;
import ddsMetamodel.DdsHistoryQos;
import ddsMetamodel.DdsLatencyBudgetQos;
import ddsMetamodel.DdsLivelinessQos;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsOwnershipQos;
import ddsMetamodel.DdsReliabilityQos;
import ddsMetamodel.DdsResourceLimits;
import ddsMetamodel.DdsTimeBasedFilterQos;
import ddsMetamodel.DdsUserDataQos;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Data Reader Qos Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderQosProfileImpl#getUserDataQos <em>User Data Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderQosProfileImpl#getDurabilityQos <em>Durability Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderQosProfileImpl#getDeadlineQos <em>Deadline Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderQosProfileImpl#getLatencyBudgetQos <em>Latency Budget Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderQosProfileImpl#getLivelinessQos <em>Liveliness Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderQosProfileImpl#getOwnershipQos <em>Ownership Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderQosProfileImpl#getTimeBasedFilterQos <em>Time Based Filter Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderQosProfileImpl#getReliabilityQos <em>Reliability Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderQosProfileImpl#getDestinationOrderQos <em>Destination Order Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderQosProfileImpl#getHistoryQos <em>History Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderQosProfileImpl#getResourceLimitsQos <em>Resource Limits Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderQosProfileImpl#getDataReaderLifecycleQos <em>Data Reader Lifecycle Qos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsDataReaderQosProfileImpl extends DdsQosProfileImpl implements DdsDataReaderQosProfile {
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
	 * The cached value of the '{@link #getTimeBasedFilterQos() <em>Time Based Filter Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeBasedFilterQos()
	 * @generated
	 * @ordered
	 */
	protected DdsTimeBasedFilterQos timeBasedFilterQos;

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
	 * The cached value of the '{@link #getDataReaderLifecycleQos() <em>Data Reader Lifecycle Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataReaderLifecycleQos()
	 * @generated
	 * @ordered
	 */
	protected DdsDataReaderLifecycleQos dataReaderLifecycleQos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsDataReaderQosProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__USER_DATA_QOS, oldUserDataQos, newUserDataQos);
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
				msgs = ((InternalEObject)userDataQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__USER_DATA_QOS, null, msgs);
			if (newUserDataQos != null)
				msgs = ((InternalEObject)newUserDataQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__USER_DATA_QOS, null, msgs);
			msgs = basicSetUserDataQos(newUserDataQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__USER_DATA_QOS, newUserDataQos, newUserDataQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DURABILITY_QOS, oldDurabilityQos, newDurabilityQos);
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
				msgs = ((InternalEObject)durabilityQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DURABILITY_QOS, null, msgs);
			if (newDurabilityQos != null)
				msgs = ((InternalEObject)newDurabilityQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DURABILITY_QOS, null, msgs);
			msgs = basicSetDurabilityQos(newDurabilityQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DURABILITY_QOS, newDurabilityQos, newDurabilityQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DEADLINE_QOS, oldDeadlineQos, newDeadlineQos);
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
				msgs = ((InternalEObject)deadlineQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DEADLINE_QOS, null, msgs);
			if (newDeadlineQos != null)
				msgs = ((InternalEObject)newDeadlineQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DEADLINE_QOS, null, msgs);
			msgs = basicSetDeadlineQos(newDeadlineQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DEADLINE_QOS, newDeadlineQos, newDeadlineQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LATENCY_BUDGET_QOS, oldLatencyBudgetQos, newLatencyBudgetQos);
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
				msgs = ((InternalEObject)latencyBudgetQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LATENCY_BUDGET_QOS, null, msgs);
			if (newLatencyBudgetQos != null)
				msgs = ((InternalEObject)newLatencyBudgetQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LATENCY_BUDGET_QOS, null, msgs);
			msgs = basicSetLatencyBudgetQos(newLatencyBudgetQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LATENCY_BUDGET_QOS, newLatencyBudgetQos, newLatencyBudgetQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LIVELINESS_QOS, oldLivelinessQos, newLivelinessQos);
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
				msgs = ((InternalEObject)livelinessQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LIVELINESS_QOS, null, msgs);
			if (newLivelinessQos != null)
				msgs = ((InternalEObject)newLivelinessQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LIVELINESS_QOS, null, msgs);
			msgs = basicSetLivelinessQos(newLivelinessQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LIVELINESS_QOS, newLivelinessQos, newLivelinessQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__OWNERSHIP_QOS, oldOwnershipQos, newOwnershipQos);
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
				msgs = ((InternalEObject)ownershipQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__OWNERSHIP_QOS, null, msgs);
			if (newOwnershipQos != null)
				msgs = ((InternalEObject)newOwnershipQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__OWNERSHIP_QOS, null, msgs);
			msgs = basicSetOwnershipQos(newOwnershipQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__OWNERSHIP_QOS, newOwnershipQos, newOwnershipQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTimeBasedFilterQos getTimeBasedFilterQos() {
		return timeBasedFilterQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeBasedFilterQos(DdsTimeBasedFilterQos newTimeBasedFilterQos, NotificationChain msgs) {
		DdsTimeBasedFilterQos oldTimeBasedFilterQos = timeBasedFilterQos;
		timeBasedFilterQos = newTimeBasedFilterQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__TIME_BASED_FILTER_QOS, oldTimeBasedFilterQos, newTimeBasedFilterQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeBasedFilterQos(DdsTimeBasedFilterQos newTimeBasedFilterQos) {
		if (newTimeBasedFilterQos != timeBasedFilterQos) {
			NotificationChain msgs = null;
			if (timeBasedFilterQos != null)
				msgs = ((InternalEObject)timeBasedFilterQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__TIME_BASED_FILTER_QOS, null, msgs);
			if (newTimeBasedFilterQos != null)
				msgs = ((InternalEObject)newTimeBasedFilterQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__TIME_BASED_FILTER_QOS, null, msgs);
			msgs = basicSetTimeBasedFilterQos(newTimeBasedFilterQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__TIME_BASED_FILTER_QOS, newTimeBasedFilterQos, newTimeBasedFilterQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RELIABILITY_QOS, oldReliabilityQos, newReliabilityQos);
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
				msgs = ((InternalEObject)reliabilityQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RELIABILITY_QOS, null, msgs);
			if (newReliabilityQos != null)
				msgs = ((InternalEObject)newReliabilityQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RELIABILITY_QOS, null, msgs);
			msgs = basicSetReliabilityQos(newReliabilityQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RELIABILITY_QOS, newReliabilityQos, newReliabilityQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DESTINATION_ORDER_QOS, oldDestinationOrderQos, newDestinationOrderQos);
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
				msgs = ((InternalEObject)destinationOrderQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DESTINATION_ORDER_QOS, null, msgs);
			if (newDestinationOrderQos != null)
				msgs = ((InternalEObject)newDestinationOrderQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DESTINATION_ORDER_QOS, null, msgs);
			msgs = basicSetDestinationOrderQos(newDestinationOrderQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DESTINATION_ORDER_QOS, newDestinationOrderQos, newDestinationOrderQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__HISTORY_QOS, oldHistoryQos, newHistoryQos);
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
				msgs = ((InternalEObject)historyQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__HISTORY_QOS, null, msgs);
			if (newHistoryQos != null)
				msgs = ((InternalEObject)newHistoryQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__HISTORY_QOS, null, msgs);
			msgs = basicSetHistoryQos(newHistoryQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__HISTORY_QOS, newHistoryQos, newHistoryQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RESOURCE_LIMITS_QOS, oldResourceLimitsQos, newResourceLimitsQos);
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
				msgs = ((InternalEObject)resourceLimitsQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RESOURCE_LIMITS_QOS, null, msgs);
			if (newResourceLimitsQos != null)
				msgs = ((InternalEObject)newResourceLimitsQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RESOURCE_LIMITS_QOS, null, msgs);
			msgs = basicSetResourceLimitsQos(newResourceLimitsQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RESOURCE_LIMITS_QOS, newResourceLimitsQos, newResourceLimitsQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataReaderLifecycleQos getDataReaderLifecycleQos() {
		return dataReaderLifecycleQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataReaderLifecycleQos(DdsDataReaderLifecycleQos newDataReaderLifecycleQos, NotificationChain msgs) {
		DdsDataReaderLifecycleQos oldDataReaderLifecycleQos = dataReaderLifecycleQos;
		dataReaderLifecycleQos = newDataReaderLifecycleQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DATA_READER_LIFECYCLE_QOS, oldDataReaderLifecycleQos, newDataReaderLifecycleQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataReaderLifecycleQos(DdsDataReaderLifecycleQos newDataReaderLifecycleQos) {
		if (newDataReaderLifecycleQos != dataReaderLifecycleQos) {
			NotificationChain msgs = null;
			if (dataReaderLifecycleQos != null)
				msgs = ((InternalEObject)dataReaderLifecycleQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DATA_READER_LIFECYCLE_QOS, null, msgs);
			if (newDataReaderLifecycleQos != null)
				msgs = ((InternalEObject)newDataReaderLifecycleQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DATA_READER_LIFECYCLE_QOS, null, msgs);
			msgs = basicSetDataReaderLifecycleQos(newDataReaderLifecycleQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DATA_READER_LIFECYCLE_QOS, newDataReaderLifecycleQos, newDataReaderLifecycleQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__USER_DATA_QOS:
				return basicSetUserDataQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DURABILITY_QOS:
				return basicSetDurabilityQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DEADLINE_QOS:
				return basicSetDeadlineQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LATENCY_BUDGET_QOS:
				return basicSetLatencyBudgetQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LIVELINESS_QOS:
				return basicSetLivelinessQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__OWNERSHIP_QOS:
				return basicSetOwnershipQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__TIME_BASED_FILTER_QOS:
				return basicSetTimeBasedFilterQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RELIABILITY_QOS:
				return basicSetReliabilityQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DESTINATION_ORDER_QOS:
				return basicSetDestinationOrderQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__HISTORY_QOS:
				return basicSetHistoryQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RESOURCE_LIMITS_QOS:
				return basicSetResourceLimitsQos(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DATA_READER_LIFECYCLE_QOS:
				return basicSetDataReaderLifecycleQos(null, msgs);
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
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__USER_DATA_QOS:
				return getUserDataQos();
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DURABILITY_QOS:
				return getDurabilityQos();
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DEADLINE_QOS:
				return getDeadlineQos();
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LATENCY_BUDGET_QOS:
				return getLatencyBudgetQos();
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LIVELINESS_QOS:
				return getLivelinessQos();
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__OWNERSHIP_QOS:
				return getOwnershipQos();
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__TIME_BASED_FILTER_QOS:
				return getTimeBasedFilterQos();
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RELIABILITY_QOS:
				return getReliabilityQos();
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DESTINATION_ORDER_QOS:
				return getDestinationOrderQos();
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__HISTORY_QOS:
				return getHistoryQos();
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RESOURCE_LIMITS_QOS:
				return getResourceLimitsQos();
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DATA_READER_LIFECYCLE_QOS:
				return getDataReaderLifecycleQos();
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
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__USER_DATA_QOS:
				setUserDataQos((DdsUserDataQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DURABILITY_QOS:
				setDurabilityQos((DdsDurabilityQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DEADLINE_QOS:
				setDeadlineQos((DdsDeadlineQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LATENCY_BUDGET_QOS:
				setLatencyBudgetQos((DdsLatencyBudgetQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LIVELINESS_QOS:
				setLivelinessQos((DdsLivelinessQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__OWNERSHIP_QOS:
				setOwnershipQos((DdsOwnershipQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__TIME_BASED_FILTER_QOS:
				setTimeBasedFilterQos((DdsTimeBasedFilterQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RELIABILITY_QOS:
				setReliabilityQos((DdsReliabilityQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DESTINATION_ORDER_QOS:
				setDestinationOrderQos((DdsDestinationOrderQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__HISTORY_QOS:
				setHistoryQos((DdsHistoryQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RESOURCE_LIMITS_QOS:
				setResourceLimitsQos((DdsResourceLimits)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DATA_READER_LIFECYCLE_QOS:
				setDataReaderLifecycleQos((DdsDataReaderLifecycleQos)newValue);
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
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__USER_DATA_QOS:
				setUserDataQos((DdsUserDataQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DURABILITY_QOS:
				setDurabilityQos((DdsDurabilityQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DEADLINE_QOS:
				setDeadlineQos((DdsDeadlineQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LATENCY_BUDGET_QOS:
				setLatencyBudgetQos((DdsLatencyBudgetQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LIVELINESS_QOS:
				setLivelinessQos((DdsLivelinessQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__OWNERSHIP_QOS:
				setOwnershipQos((DdsOwnershipQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__TIME_BASED_FILTER_QOS:
				setTimeBasedFilterQos((DdsTimeBasedFilterQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RELIABILITY_QOS:
				setReliabilityQos((DdsReliabilityQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DESTINATION_ORDER_QOS:
				setDestinationOrderQos((DdsDestinationOrderQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__HISTORY_QOS:
				setHistoryQos((DdsHistoryQos)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RESOURCE_LIMITS_QOS:
				setResourceLimitsQos((DdsResourceLimits)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DATA_READER_LIFECYCLE_QOS:
				setDataReaderLifecycleQos((DdsDataReaderLifecycleQos)null);
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
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__USER_DATA_QOS:
				return userDataQos != null;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DURABILITY_QOS:
				return durabilityQos != null;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DEADLINE_QOS:
				return deadlineQos != null;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LATENCY_BUDGET_QOS:
				return latencyBudgetQos != null;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LIVELINESS_QOS:
				return livelinessQos != null;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__OWNERSHIP_QOS:
				return ownershipQos != null;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__TIME_BASED_FILTER_QOS:
				return timeBasedFilterQos != null;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RELIABILITY_QOS:
				return reliabilityQos != null;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DESTINATION_ORDER_QOS:
				return destinationOrderQos != null;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__HISTORY_QOS:
				return historyQos != null;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RESOURCE_LIMITS_QOS:
				return resourceLimitsQos != null;
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DATA_READER_LIFECYCLE_QOS:
				return dataReaderLifecycleQos != null;
		}
		return super.eIsSet(featureID);
	}

} //DdsDataReaderQosProfileImpl
