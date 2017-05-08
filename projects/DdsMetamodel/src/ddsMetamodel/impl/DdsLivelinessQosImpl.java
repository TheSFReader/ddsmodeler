/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDuration;
import ddsMetamodel.DdsLivelinessQos;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.LivelinessQosPolicyKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Liveliness Qos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsLivelinessQosImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsLivelinessQosImpl#getLease_duration <em>Lease duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsLivelinessQosImpl extends MinimalEObjectImpl.Container implements DdsLivelinessQos {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final LivelinessQosPolicyKind KIND_EDEFAULT = LivelinessQosPolicyKind.AUTOMATIC_LIVELINESS_QOS;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected LivelinessQosPolicyKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLease_duration() <em>Lease duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLease_duration()
	 * @generated
	 * @ordered
	 */
	protected DdsDuration lease_duration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsLivelinessQosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_LIVELINESS_QOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivelinessQosPolicyKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(LivelinessQosPolicyKind newKind) {
		LivelinessQosPolicyKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_LIVELINESS_QOS__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDuration getLease_duration() {
		return lease_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLease_duration(DdsDuration newLease_duration, NotificationChain msgs) {
		DdsDuration oldLease_duration = lease_duration;
		lease_duration = newLease_duration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_LIVELINESS_QOS__LEASE_DURATION, oldLease_duration, newLease_duration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLease_duration(DdsDuration newLease_duration) {
		if (newLease_duration != lease_duration) {
			NotificationChain msgs = null;
			if (lease_duration != null)
				msgs = ((InternalEObject)lease_duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_LIVELINESS_QOS__LEASE_DURATION, null, msgs);
			if (newLease_duration != null)
				msgs = ((InternalEObject)newLease_duration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_LIVELINESS_QOS__LEASE_DURATION, null, msgs);
			msgs = basicSetLease_duration(newLease_duration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_LIVELINESS_QOS__LEASE_DURATION, newLease_duration, newLease_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_LIVELINESS_QOS__LEASE_DURATION:
				return basicSetLease_duration(null, msgs);
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
			case DdsMetamodelPackage.DDS_LIVELINESS_QOS__KIND:
				return getKind();
			case DdsMetamodelPackage.DDS_LIVELINESS_QOS__LEASE_DURATION:
				return getLease_duration();
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
			case DdsMetamodelPackage.DDS_LIVELINESS_QOS__KIND:
				setKind((LivelinessQosPolicyKind)newValue);
				return;
			case DdsMetamodelPackage.DDS_LIVELINESS_QOS__LEASE_DURATION:
				setLease_duration((DdsDuration)newValue);
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
			case DdsMetamodelPackage.DDS_LIVELINESS_QOS__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_LIVELINESS_QOS__LEASE_DURATION:
				setLease_duration((DdsDuration)null);
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
			case DdsMetamodelPackage.DDS_LIVELINESS_QOS__KIND:
				return kind != KIND_EDEFAULT;
			case DdsMetamodelPackage.DDS_LIVELINESS_QOS__LEASE_DURATION:
				return lease_duration != null;
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

} //DdsLivelinessQosImpl
