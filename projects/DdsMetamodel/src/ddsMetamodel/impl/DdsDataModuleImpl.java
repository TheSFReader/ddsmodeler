/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDataModule;
import ddsMetamodel.DdsDataStructure;
import ddsMetamodel.DdsMetamodelPackage;

import ddsMetamodel.DdsSystem;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Data Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsDataModuleImpl#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataModuleImpl#getDataStructures <em>Data Structures</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataModuleImpl#getInnerModules <em>Inner Modules</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataModuleImpl#getContainingSystem <em>Containing System</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataModuleImpl#getContainingModule <em>Containing Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsDataModuleImpl extends MinimalEObjectImpl.Container implements DdsDataModule {
	/**
	 * The default value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected String moduleName = MODULE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataStructures() <em>Data Structures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsDataStructure> dataStructures;

	/**
	 * The cached value of the '{@link #getInnerModules() <em>Inner Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerModules()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsDataModule> innerModules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsDataModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_DATA_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleName() {
		return moduleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleName(String newModuleName) {
		String oldModuleName = moduleName;
		moduleName = newModuleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_MODULE__MODULE_NAME, oldModuleName, moduleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsDataStructure> getDataStructures() {
		if (dataStructures == null) {
			dataStructures = new EObjectContainmentWithInverseEList<DdsDataStructure>(DdsDataStructure.class, this, DdsMetamodelPackage.DDS_DATA_MODULE__DATA_STRUCTURES, DdsMetamodelPackage.DDS_DATA_STRUCTURE__CONTAINER_DATA_MODULE);
		}
		return dataStructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsDataModule> getInnerModules() {
		if (innerModules == null) {
			innerModules = new EObjectContainmentWithInverseEList<DdsDataModule>(DdsDataModule.class, this, DdsMetamodelPackage.DDS_DATA_MODULE__INNER_MODULES, DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_MODULE);
		}
		return innerModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsSystem getContainingSystem() {
		if (eContainerFeatureID() != DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_SYSTEM) return null;
		return (DdsSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingSystem(DdsSystem newContainingSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingSystem, DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingSystem(DdsSystem newContainingSystem) {
		if (newContainingSystem != eInternalContainer() || (eContainerFeatureID() != DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_SYSTEM && newContainingSystem != null)) {
			if (EcoreUtil.isAncestor(this, newContainingSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingSystem != null)
				msgs = ((InternalEObject)newContainingSystem).eInverseAdd(this, DdsMetamodelPackage.DDS_SYSTEM__DATA_MODULES, DdsSystem.class, msgs);
			msgs = basicSetContainingSystem(newContainingSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_SYSTEM, newContainingSystem, newContainingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataModule getContainingModule() {
		if (eContainerFeatureID() != DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_MODULE) return null;
		return (DdsDataModule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingModule(DdsDataModule newContainingModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingModule, DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingModule(DdsDataModule newContainingModule) {
		if (newContainingModule != eInternalContainer() || (eContainerFeatureID() != DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_MODULE && newContainingModule != null)) {
			if (EcoreUtil.isAncestor(this, newContainingModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingModule != null)
				msgs = ((InternalEObject)newContainingModule).eInverseAdd(this, DdsMetamodelPackage.DDS_DATA_MODULE__INNER_MODULES, DdsDataModule.class, msgs);
			msgs = basicSetContainingModule(newContainingModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_MODULE, newContainingModule, newContainingModule));
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
			case DdsMetamodelPackage.DDS_DATA_MODULE__DATA_STRUCTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDataStructures()).basicAdd(otherEnd, msgs);
			case DdsMetamodelPackage.DDS_DATA_MODULE__INNER_MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInnerModules()).basicAdd(otherEnd, msgs);
			case DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainingSystem((DdsSystem)otherEnd, msgs);
			case DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainingModule((DdsDataModule)otherEnd, msgs);
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
			case DdsMetamodelPackage.DDS_DATA_MODULE__DATA_STRUCTURES:
				return ((InternalEList<?>)getDataStructures()).basicRemove(otherEnd, msgs);
			case DdsMetamodelPackage.DDS_DATA_MODULE__INNER_MODULES:
				return ((InternalEList<?>)getInnerModules()).basicRemove(otherEnd, msgs);
			case DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_SYSTEM:
				return basicSetContainingSystem(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_MODULE:
				return basicSetContainingModule(null, msgs);
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
			case DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_SYSTEM:
				return eInternalContainer().eInverseRemove(this, DdsMetamodelPackage.DDS_SYSTEM__DATA_MODULES, DdsSystem.class, msgs);
			case DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_MODULE:
				return eInternalContainer().eInverseRemove(this, DdsMetamodelPackage.DDS_DATA_MODULE__INNER_MODULES, DdsDataModule.class, msgs);
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
			case DdsMetamodelPackage.DDS_DATA_MODULE__MODULE_NAME:
				return getModuleName();
			case DdsMetamodelPackage.DDS_DATA_MODULE__DATA_STRUCTURES:
				return getDataStructures();
			case DdsMetamodelPackage.DDS_DATA_MODULE__INNER_MODULES:
				return getInnerModules();
			case DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_SYSTEM:
				return getContainingSystem();
			case DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_MODULE:
				return getContainingModule();
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
			case DdsMetamodelPackage.DDS_DATA_MODULE__MODULE_NAME:
				setModuleName((String)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_MODULE__DATA_STRUCTURES:
				getDataStructures().clear();
				getDataStructures().addAll((Collection<? extends DdsDataStructure>)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_MODULE__INNER_MODULES:
				getInnerModules().clear();
				getInnerModules().addAll((Collection<? extends DdsDataModule>)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_SYSTEM:
				setContainingSystem((DdsSystem)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_MODULE:
				setContainingModule((DdsDataModule)newValue);
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
			case DdsMetamodelPackage.DDS_DATA_MODULE__MODULE_NAME:
				setModuleName(MODULE_NAME_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_DATA_MODULE__DATA_STRUCTURES:
				getDataStructures().clear();
				return;
			case DdsMetamodelPackage.DDS_DATA_MODULE__INNER_MODULES:
				getInnerModules().clear();
				return;
			case DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_SYSTEM:
				setContainingSystem((DdsSystem)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_MODULE:
				setContainingModule((DdsDataModule)null);
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
			case DdsMetamodelPackage.DDS_DATA_MODULE__MODULE_NAME:
				return MODULE_NAME_EDEFAULT == null ? moduleName != null : !MODULE_NAME_EDEFAULT.equals(moduleName);
			case DdsMetamodelPackage.DDS_DATA_MODULE__DATA_STRUCTURES:
				return dataStructures != null && !dataStructures.isEmpty();
			case DdsMetamodelPackage.DDS_DATA_MODULE__INNER_MODULES:
				return innerModules != null && !innerModules.isEmpty();
			case DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_SYSTEM:
				return getContainingSystem() != null;
			case DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_MODULE:
				return getContainingModule() != null;
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
		result.append(" (moduleName: ");
		result.append(moduleName);
		result.append(')');
		return result.toString();
	}

} //DdsDataModuleImpl
