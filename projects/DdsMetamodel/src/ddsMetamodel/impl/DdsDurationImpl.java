/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDuration;
import ddsMetamodel.DdsMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsDurationImpl#getSec <em>Sec</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDurationImpl#getNanoSec <em>Nano Sec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsDurationImpl extends MinimalEObjectImpl.Container implements DdsDuration {
	/**
	 * The default value of the '{@link #getSec() <em>Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSec()
	 * @generated
	 * @ordered
	 */
	protected static final long SEC_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSec() <em>Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSec()
	 * @generated
	 * @ordered
	 */
	protected long sec = SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getNanoSec() <em>Nano Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNanoSec()
	 * @generated
	 * @ordered
	 */
	protected static final long NANO_SEC_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNanoSec() <em>Nano Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNanoSec()
	 * @generated
	 * @ordered
	 */
	protected long nanoSec = NANO_SEC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsDurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_DURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSec() {
		return sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSec(long newSec) {
		long oldSec = sec;
		sec = newSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DURATION__SEC, oldSec, sec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNanoSec() {
		return nanoSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNanoSec(long newNanoSec) {
		long oldNanoSec = nanoSec;
		nanoSec = newNanoSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DURATION__NANO_SEC, oldNanoSec, nanoSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_DURATION__SEC:
				return getSec();
			case DdsMetamodelPackage.DDS_DURATION__NANO_SEC:
				return getNanoSec();
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
			case DdsMetamodelPackage.DDS_DURATION__SEC:
				setSec((Long)newValue);
				return;
			case DdsMetamodelPackage.DDS_DURATION__NANO_SEC:
				setNanoSec((Long)newValue);
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
			case DdsMetamodelPackage.DDS_DURATION__SEC:
				setSec(SEC_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_DURATION__NANO_SEC:
				setNanoSec(NANO_SEC_EDEFAULT);
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
			case DdsMetamodelPackage.DDS_DURATION__SEC:
				return sec != SEC_EDEFAULT;
			case DdsMetamodelPackage.DDS_DURATION__NANO_SEC:
				return nanoSec != NANO_SEC_EDEFAULT;
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
		result.append(" (sec: ");
		result.append(sec);
		result.append(", nanoSec: ");
		result.append(nanoSec);
		result.append(')');
		return result.toString();
	}

} //DdsDurationImpl
