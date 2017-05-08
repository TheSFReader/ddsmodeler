/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsReadCondition;
import ddsMetamodel.DdsStatusCondition;
import ddsMetamodel.DdsWaitSet;

import ddsMetamodel.GuardCondition;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Wait Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsWaitSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsWaitSetImpl#getReadConditions <em>Read Conditions</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsWaitSetImpl#getStatusConditions <em>Status Conditions</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsWaitSetImpl#getGuardConditions <em>Guard Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsWaitSetImpl extends MinimalEObjectImpl.Container implements DdsWaitSet {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReadConditions() <em>Read Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsReadCondition> readConditions;

	/**
	 * The cached value of the '{@link #getStatusConditions() <em>Status Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsStatusCondition> statusConditions;

	/**
	 * The cached value of the '{@link #getGuardConditions() <em>Guard Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<GuardCondition> guardConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsWaitSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_WAIT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_WAIT_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsReadCondition> getReadConditions() {
		if (readConditions == null) {
			readConditions = new EObjectContainmentEList<DdsReadCondition>(DdsReadCondition.class, this, DdsMetamodelPackage.DDS_WAIT_SET__READ_CONDITIONS);
		}
		return readConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsStatusCondition> getStatusConditions() {
		if (statusConditions == null) {
			statusConditions = new EObjectContainmentWithInverseEList<DdsStatusCondition>(DdsStatusCondition.class, this, DdsMetamodelPackage.DDS_WAIT_SET__STATUS_CONDITIONS, DdsMetamodelPackage.DDS_STATUS_CONDITION__CONTAINING_WAITSET);
		}
		return statusConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GuardCondition> getGuardConditions() {
		if (guardConditions == null) {
			guardConditions = new EObjectContainmentEList<GuardCondition>(GuardCondition.class, this, DdsMetamodelPackage.DDS_WAIT_SET__GUARD_CONDITIONS);
		}
		return guardConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_WAIT_SET__STATUS_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStatusConditions()).basicAdd(otherEnd, msgs);
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
			case DdsMetamodelPackage.DDS_WAIT_SET__READ_CONDITIONS:
				return ((InternalEList<?>)getReadConditions()).basicRemove(otherEnd, msgs);
			case DdsMetamodelPackage.DDS_WAIT_SET__STATUS_CONDITIONS:
				return ((InternalEList<?>)getStatusConditions()).basicRemove(otherEnd, msgs);
			case DdsMetamodelPackage.DDS_WAIT_SET__GUARD_CONDITIONS:
				return ((InternalEList<?>)getGuardConditions()).basicRemove(otherEnd, msgs);
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
			case DdsMetamodelPackage.DDS_WAIT_SET__NAME:
				return getName();
			case DdsMetamodelPackage.DDS_WAIT_SET__READ_CONDITIONS:
				return getReadConditions();
			case DdsMetamodelPackage.DDS_WAIT_SET__STATUS_CONDITIONS:
				return getStatusConditions();
			case DdsMetamodelPackage.DDS_WAIT_SET__GUARD_CONDITIONS:
				return getGuardConditions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_WAIT_SET__NAME:
				setName((String)newValue);
				return;
			case DdsMetamodelPackage.DDS_WAIT_SET__READ_CONDITIONS:
				getReadConditions().clear();
				getReadConditions().addAll((Collection<? extends DdsReadCondition>)newValue);
				return;
			case DdsMetamodelPackage.DDS_WAIT_SET__STATUS_CONDITIONS:
				getStatusConditions().clear();
				getStatusConditions().addAll((Collection<? extends DdsStatusCondition>)newValue);
				return;
			case DdsMetamodelPackage.DDS_WAIT_SET__GUARD_CONDITIONS:
				getGuardConditions().clear();
				getGuardConditions().addAll((Collection<? extends GuardCondition>)newValue);
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
			case DdsMetamodelPackage.DDS_WAIT_SET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_WAIT_SET__READ_CONDITIONS:
				getReadConditions().clear();
				return;
			case DdsMetamodelPackage.DDS_WAIT_SET__STATUS_CONDITIONS:
				getStatusConditions().clear();
				return;
			case DdsMetamodelPackage.DDS_WAIT_SET__GUARD_CONDITIONS:
				getGuardConditions().clear();
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
			case DdsMetamodelPackage.DDS_WAIT_SET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DdsMetamodelPackage.DDS_WAIT_SET__READ_CONDITIONS:
				return readConditions != null && !readConditions.isEmpty();
			case DdsMetamodelPackage.DDS_WAIT_SET__STATUS_CONDITIONS:
				return statusConditions != null && !statusConditions.isEmpty();
			case DdsMetamodelPackage.DDS_WAIT_SET__GUARD_CONDITIONS:
				return guardConditions != null && !guardConditions.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DdsWaitSetImpl
