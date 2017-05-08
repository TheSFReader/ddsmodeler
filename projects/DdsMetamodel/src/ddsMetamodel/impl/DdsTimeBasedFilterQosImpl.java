/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDuration;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsTimeBasedFilterQos;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Time Based Filter Qos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsTimeBasedFilterQosImpl#getMinimum_separation <em>Minimum separation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsTimeBasedFilterQosImpl extends MinimalEObjectImpl.Container implements DdsTimeBasedFilterQos {
	/**
	 * The cached value of the '{@link #getMinimum_separation() <em>Minimum separation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum_separation()
	 * @generated
	 * @ordered
	 */
	protected DdsDuration minimum_separation;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsTimeBasedFilterQosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_TIME_BASED_FILTER_QOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDuration getMinimum_separation() {
		return minimum_separation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinimum_separation(DdsDuration newMinimum_separation, NotificationChain msgs) {
		DdsDuration oldMinimum_separation = minimum_separation;
		minimum_separation = newMinimum_separation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TIME_BASED_FILTER_QOS__MINIMUM_SEPARATION, oldMinimum_separation, newMinimum_separation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum_separation(DdsDuration newMinimum_separation) {
		if (newMinimum_separation != minimum_separation) {
			NotificationChain msgs = null;
			if (minimum_separation != null)
				msgs = ((InternalEObject)minimum_separation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TIME_BASED_FILTER_QOS__MINIMUM_SEPARATION, null, msgs);
			if (newMinimum_separation != null)
				msgs = ((InternalEObject)newMinimum_separation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TIME_BASED_FILTER_QOS__MINIMUM_SEPARATION, null, msgs);
			msgs = basicSetMinimum_separation(newMinimum_separation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TIME_BASED_FILTER_QOS__MINIMUM_SEPARATION, newMinimum_separation, newMinimum_separation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_TIME_BASED_FILTER_QOS__MINIMUM_SEPARATION:
				return basicSetMinimum_separation(null, msgs);
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
			case DdsMetamodelPackage.DDS_TIME_BASED_FILTER_QOS__MINIMUM_SEPARATION:
				return getMinimum_separation();
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
			case DdsMetamodelPackage.DDS_TIME_BASED_FILTER_QOS__MINIMUM_SEPARATION:
				setMinimum_separation((DdsDuration)newValue);
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
			case DdsMetamodelPackage.DDS_TIME_BASED_FILTER_QOS__MINIMUM_SEPARATION:
				setMinimum_separation((DdsDuration)null);
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
			case DdsMetamodelPackage.DDS_TIME_BASED_FILTER_QOS__MINIMUM_SEPARATION:
				return minimum_separation != null;
		}
		return super.eIsSet(featureID);
	}

} //DdsTimeBasedFilterQosImpl
