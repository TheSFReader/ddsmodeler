/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDuration;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsReliabilityQos;
import ddsMetamodel.ReliabilityQosPolicyKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Reliability Qos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsReliabilityQosImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsReliabilityQosImpl#getMax_blocking_time <em>Max blocking time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsReliabilityQosImpl extends MinimalEObjectImpl.Container implements DdsReliabilityQos {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ReliabilityQosPolicyKind KIND_EDEFAULT = ReliabilityQosPolicyKind.RELIABLE_RELIABILITY_QOS;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ReliabilityQosPolicyKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMax_blocking_time() <em>Max blocking time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_blocking_time()
	 * @generated
	 * @ordered
	 */
	protected DdsDuration max_blocking_time;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsReliabilityQosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_RELIABILITY_QOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityQosPolicyKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ReliabilityQosPolicyKind newKind) {
		ReliabilityQosPolicyKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_RELIABILITY_QOS__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDuration getMax_blocking_time() {
		return max_blocking_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax_blocking_time(DdsDuration newMax_blocking_time, NotificationChain msgs) {
		DdsDuration oldMax_blocking_time = max_blocking_time;
		max_blocking_time = newMax_blocking_time;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_RELIABILITY_QOS__MAX_BLOCKING_TIME, oldMax_blocking_time, newMax_blocking_time);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_blocking_time(DdsDuration newMax_blocking_time) {
		if (newMax_blocking_time != max_blocking_time) {
			NotificationChain msgs = null;
			if (max_blocking_time != null)
				msgs = ((InternalEObject)max_blocking_time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_RELIABILITY_QOS__MAX_BLOCKING_TIME, null, msgs);
			if (newMax_blocking_time != null)
				msgs = ((InternalEObject)newMax_blocking_time).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_RELIABILITY_QOS__MAX_BLOCKING_TIME, null, msgs);
			msgs = basicSetMax_blocking_time(newMax_blocking_time, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_RELIABILITY_QOS__MAX_BLOCKING_TIME, newMax_blocking_time, newMax_blocking_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_RELIABILITY_QOS__MAX_BLOCKING_TIME:
				return basicSetMax_blocking_time(null, msgs);
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
			case DdsMetamodelPackage.DDS_RELIABILITY_QOS__KIND:
				return getKind();
			case DdsMetamodelPackage.DDS_RELIABILITY_QOS__MAX_BLOCKING_TIME:
				return getMax_blocking_time();
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
			case DdsMetamodelPackage.DDS_RELIABILITY_QOS__KIND:
				setKind((ReliabilityQosPolicyKind)newValue);
				return;
			case DdsMetamodelPackage.DDS_RELIABILITY_QOS__MAX_BLOCKING_TIME:
				setMax_blocking_time((DdsDuration)newValue);
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
			case DdsMetamodelPackage.DDS_RELIABILITY_QOS__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_RELIABILITY_QOS__MAX_BLOCKING_TIME:
				setMax_blocking_time((DdsDuration)null);
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
			case DdsMetamodelPackage.DDS_RELIABILITY_QOS__KIND:
				return kind != KIND_EDEFAULT;
			case DdsMetamodelPackage.DDS_RELIABILITY_QOS__MAX_BLOCKING_TIME:
				return max_blocking_time != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //DdsReliabilityQosImpl
