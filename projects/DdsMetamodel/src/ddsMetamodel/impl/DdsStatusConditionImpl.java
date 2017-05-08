/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsStatusCondition;

import ddsMetamodel.DdsWaitSet;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Status Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsStatusConditionImpl#getContainingWaitset <em>Containing Waitset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsStatusConditionImpl extends MinimalEObjectImpl.Container implements DdsStatusCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsStatusConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_STATUS_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsWaitSet getContainingWaitset() {
		if (eContainerFeatureID() != DdsMetamodelPackage.DDS_STATUS_CONDITION__CONTAINING_WAITSET) return null;
		return (DdsWaitSet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingWaitset(DdsWaitSet newContainingWaitset, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingWaitset, DdsMetamodelPackage.DDS_STATUS_CONDITION__CONTAINING_WAITSET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingWaitset(DdsWaitSet newContainingWaitset) {
		if (newContainingWaitset != eInternalContainer() || (eContainerFeatureID() != DdsMetamodelPackage.DDS_STATUS_CONDITION__CONTAINING_WAITSET && newContainingWaitset != null)) {
			if (EcoreUtil.isAncestor(this, newContainingWaitset))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingWaitset != null)
				msgs = ((InternalEObject)newContainingWaitset).eInverseAdd(this, DdsMetamodelPackage.DDS_WAIT_SET__STATUS_CONDITIONS, DdsWaitSet.class, msgs);
			msgs = basicSetContainingWaitset(newContainingWaitset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_STATUS_CONDITION__CONTAINING_WAITSET, newContainingWaitset, newContainingWaitset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_STATUS_CONDITION__CONTAINING_WAITSET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainingWaitset((DdsWaitSet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_STATUS_CONDITION__CONTAINING_WAITSET:
				return basicSetContainingWaitset(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DdsMetamodelPackage.DDS_STATUS_CONDITION__CONTAINING_WAITSET:
				return eInternalContainer().eInverseRemove(this, DdsMetamodelPackage.DDS_WAIT_SET__STATUS_CONDITIONS, DdsWaitSet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_STATUS_CONDITION__CONTAINING_WAITSET:
				return getContainingWaitset();
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
			case DdsMetamodelPackage.DDS_STATUS_CONDITION__CONTAINING_WAITSET:
				setContainingWaitset((DdsWaitSet)newValue);
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
			case DdsMetamodelPackage.DDS_STATUS_CONDITION__CONTAINING_WAITSET:
				setContainingWaitset((DdsWaitSet)null);
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
			case DdsMetamodelPackage.DDS_STATUS_CONDITION__CONTAINING_WAITSET:
				return getContainingWaitset() != null;
		}
		return super.eIsSet(featureID);
	}

} //DdsStatusConditionImpl
