/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDurabilityServiceQos;
import ddsMetamodel.DdsDuration;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.HistoryQosPolicyKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Durability Service Qos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsDurabilityServiceQosImpl#getService_cleanup_delay <em>Service cleanup delay</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDurabilityServiceQosImpl#getHistory_kind <em>History kind</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDurabilityServiceQosImpl#getHistory_depth <em>History depth</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDurabilityServiceQosImpl#getMax_samples <em>Max samples</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDurabilityServiceQosImpl#getMax_instances <em>Max instances</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDurabilityServiceQosImpl#getMax_samples_per_instances <em>Max samples per instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsDurabilityServiceQosImpl extends MinimalEObjectImpl.Container implements DdsDurabilityServiceQos {
	/**
	 * The cached value of the '{@link #getService_cleanup_delay() <em>Service cleanup delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService_cleanup_delay()
	 * @generated
	 * @ordered
	 */
	protected DdsDuration service_cleanup_delay;

	/**
	 * The default value of the '{@link #getHistory_kind() <em>History kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory_kind()
	 * @generated
	 * @ordered
	 */
	protected static final HistoryQosPolicyKind HISTORY_KIND_EDEFAULT = HistoryQosPolicyKind.KEEP_LAST_HISTORY_QOS;

	/**
	 * The cached value of the '{@link #getHistory_kind() <em>History kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory_kind()
	 * @generated
	 * @ordered
	 */
	protected HistoryQosPolicyKind history_kind = HISTORY_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getHistory_depth() <em>History depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory_depth()
	 * @generated
	 * @ordered
	 */
	protected static final long HISTORY_DEPTH_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getHistory_depth() <em>History depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory_depth()
	 * @generated
	 * @ordered
	 */
	protected long history_depth = HISTORY_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_samples() <em>Max samples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_samples()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_SAMPLES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMax_samples() <em>Max samples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_samples()
	 * @generated
	 * @ordered
	 */
	protected long max_samples = MAX_SAMPLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_instances() <em>Max instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_instances()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_INSTANCES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMax_instances() <em>Max instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_instances()
	 * @generated
	 * @ordered
	 */
	protected long max_instances = MAX_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_samples_per_instances() <em>Max samples per instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_samples_per_instances()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_SAMPLES_PER_INSTANCES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMax_samples_per_instances() <em>Max samples per instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_samples_per_instances()
	 * @generated
	 * @ordered
	 */
	protected long max_samples_per_instances = MAX_SAMPLES_PER_INSTANCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsDurabilityServiceQosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_DURABILITY_SERVICE_QOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDuration getService_cleanup_delay() {
		return service_cleanup_delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService_cleanup_delay(DdsDuration newService_cleanup_delay, NotificationChain msgs) {
		DdsDuration oldService_cleanup_delay = service_cleanup_delay;
		service_cleanup_delay = newService_cleanup_delay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__SERVICE_CLEANUP_DELAY, oldService_cleanup_delay, newService_cleanup_delay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService_cleanup_delay(DdsDuration newService_cleanup_delay) {
		if (newService_cleanup_delay != service_cleanup_delay) {
			NotificationChain msgs = null;
			if (service_cleanup_delay != null)
				msgs = ((InternalEObject)service_cleanup_delay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__SERVICE_CLEANUP_DELAY, null, msgs);
			if (newService_cleanup_delay != null)
				msgs = ((InternalEObject)newService_cleanup_delay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__SERVICE_CLEANUP_DELAY, null, msgs);
			msgs = basicSetService_cleanup_delay(newService_cleanup_delay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__SERVICE_CLEANUP_DELAY, newService_cleanup_delay, newService_cleanup_delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryQosPolicyKind getHistory_kind() {
		return history_kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistory_kind(HistoryQosPolicyKind newHistory_kind) {
		HistoryQosPolicyKind oldHistory_kind = history_kind;
		history_kind = newHistory_kind == null ? HISTORY_KIND_EDEFAULT : newHistory_kind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__HISTORY_KIND, oldHistory_kind, history_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getHistory_depth() {
		return history_depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistory_depth(long newHistory_depth) {
		long oldHistory_depth = history_depth;
		history_depth = newHistory_depth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__HISTORY_DEPTH, oldHistory_depth, history_depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMax_samples() {
		return max_samples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_samples(long newMax_samples) {
		long oldMax_samples = max_samples;
		max_samples = newMax_samples;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__MAX_SAMPLES, oldMax_samples, max_samples));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMax_instances() {
		return max_instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_instances(long newMax_instances) {
		long oldMax_instances = max_instances;
		max_instances = newMax_instances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__MAX_INSTANCES, oldMax_instances, max_instances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMax_samples_per_instances() {
		return max_samples_per_instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_samples_per_instances(long newMax_samples_per_instances) {
		long oldMax_samples_per_instances = max_samples_per_instances;
		max_samples_per_instances = newMax_samples_per_instances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__MAX_SAMPLES_PER_INSTANCES, oldMax_samples_per_instances, max_samples_per_instances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__SERVICE_CLEANUP_DELAY:
				return basicSetService_cleanup_delay(null, msgs);
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
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__SERVICE_CLEANUP_DELAY:
				return getService_cleanup_delay();
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__HISTORY_KIND:
				return getHistory_kind();
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__HISTORY_DEPTH:
				return getHistory_depth();
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__MAX_SAMPLES:
				return getMax_samples();
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__MAX_INSTANCES:
				return getMax_instances();
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__MAX_SAMPLES_PER_INSTANCES:
				return getMax_samples_per_instances();
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
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__SERVICE_CLEANUP_DELAY:
				setService_cleanup_delay((DdsDuration)newValue);
				return;
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__HISTORY_KIND:
				setHistory_kind((HistoryQosPolicyKind)newValue);
				return;
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__HISTORY_DEPTH:
				setHistory_depth((Long)newValue);
				return;
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__MAX_SAMPLES:
				setMax_samples((Long)newValue);
				return;
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__MAX_INSTANCES:
				setMax_instances((Long)newValue);
				return;
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__MAX_SAMPLES_PER_INSTANCES:
				setMax_samples_per_instances((Long)newValue);
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
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__SERVICE_CLEANUP_DELAY:
				setService_cleanup_delay((DdsDuration)null);
				return;
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__HISTORY_KIND:
				setHistory_kind(HISTORY_KIND_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__HISTORY_DEPTH:
				setHistory_depth(HISTORY_DEPTH_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__MAX_SAMPLES:
				setMax_samples(MAX_SAMPLES_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__MAX_INSTANCES:
				setMax_instances(MAX_INSTANCES_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__MAX_SAMPLES_PER_INSTANCES:
				setMax_samples_per_instances(MAX_SAMPLES_PER_INSTANCES_EDEFAULT);
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
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__SERVICE_CLEANUP_DELAY:
				return service_cleanup_delay != null;
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__HISTORY_KIND:
				return history_kind != HISTORY_KIND_EDEFAULT;
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__HISTORY_DEPTH:
				return history_depth != HISTORY_DEPTH_EDEFAULT;
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__MAX_SAMPLES:
				return max_samples != MAX_SAMPLES_EDEFAULT;
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__MAX_INSTANCES:
				return max_instances != MAX_INSTANCES_EDEFAULT;
			case DdsMetamodelPackage.DDS_DURABILITY_SERVICE_QOS__MAX_SAMPLES_PER_INSTANCES:
				return max_samples_per_instances != MAX_SAMPLES_PER_INSTANCES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (history_kind: ");
		result.append(history_kind);
		result.append(", history_depth: ");
		result.append(history_depth);
		result.append(", max_samples: ");
		result.append(max_samples);
		result.append(", max_instances: ");
		result.append(max_instances);
		result.append(", max_samples_per_instances: ");
		result.append(max_samples_per_instances);
		result.append(')');
		return result.toString();
	}

} //DdsDurabilityServiceQosImpl
