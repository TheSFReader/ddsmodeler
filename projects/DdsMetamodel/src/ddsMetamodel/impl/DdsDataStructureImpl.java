/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDataField;
import ddsMetamodel.DdsDataModule;
import ddsMetamodel.DdsDataStructure;
import ddsMetamodel.DdsMetamodelPackage;

import ddsMetamodel.DdsStructuredField;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Data Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsDataStructureImpl#getStructureName <em>Structure Name</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataStructureImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataStructureImpl#getStructuredFields <em>Structured Fields</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataStructureImpl#getContainerDataModule <em>Container Data Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsDataStructureImpl extends MinimalEObjectImpl.Container implements DdsDataStructure {
	/**
	 * The default value of the '{@link #getStructureName() <em>Structure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureName()
	 * @generated
	 * @ordered
	 */
	protected static final String STRUCTURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStructureName() <em>Structure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureName()
	 * @generated
	 * @ordered
	 */
	protected String structureName = STRUCTURE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsDataField> fields;

	/**
	 * The cached value of the '{@link #getStructuredFields() <em>Structured Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredFields()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsStructuredField> structuredFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsDataStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_DATA_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStructureName() {
		return structureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureName(String newStructureName) {
		String oldStructureName = structureName;
		structureName = newStructureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_STRUCTURE__STRUCTURE_NAME, oldStructureName, structureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsDataField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<DdsDataField>(DdsDataField.class, this, DdsMetamodelPackage.DDS_DATA_STRUCTURE__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsStructuredField> getStructuredFields() {
		if (structuredFields == null) {
			structuredFields = new EObjectContainmentWithInverseEList<DdsStructuredField>(DdsStructuredField.class, this, DdsMetamodelPackage.DDS_DATA_STRUCTURE__STRUCTURED_FIELDS, DdsMetamodelPackage.DDS_STRUCTURED_FIELD__DATA_STRUCTURE);
		}
		return structuredFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataModule getContainerDataModule() {
		if (eContainerFeatureID() != DdsMetamodelPackage.DDS_DATA_STRUCTURE__CONTAINER_DATA_MODULE) return null;
		return (DdsDataModule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerDataModule(DdsDataModule newContainerDataModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainerDataModule, DdsMetamodelPackage.DDS_DATA_STRUCTURE__CONTAINER_DATA_MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerDataModule(DdsDataModule newContainerDataModule) {
		if (newContainerDataModule != eInternalContainer() || (eContainerFeatureID() != DdsMetamodelPackage.DDS_DATA_STRUCTURE__CONTAINER_DATA_MODULE && newContainerDataModule != null)) {
			if (EcoreUtil.isAncestor(this, newContainerDataModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerDataModule != null)
				msgs = ((InternalEObject)newContainerDataModule).eInverseAdd(this, DdsMetamodelPackage.DDS_DATA_MODULE__DATA_STRUCTURES, DdsDataModule.class, msgs);
			msgs = basicSetContainerDataModule(newContainerDataModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_STRUCTURE__CONTAINER_DATA_MODULE, newContainerDataModule, newContainerDataModule));
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
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__STRUCTURED_FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStructuredFields()).basicAdd(otherEnd, msgs);
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__CONTAINER_DATA_MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainerDataModule((DdsDataModule)otherEnd, msgs);
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
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__STRUCTURED_FIELDS:
				return ((InternalEList<?>)getStructuredFields()).basicRemove(otherEnd, msgs);
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__CONTAINER_DATA_MODULE:
				return basicSetContainerDataModule(null, msgs);
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
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__CONTAINER_DATA_MODULE:
				return eInternalContainer().eInverseRemove(this, DdsMetamodelPackage.DDS_DATA_MODULE__DATA_STRUCTURES, DdsDataModule.class, msgs);
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
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__STRUCTURE_NAME:
				return getStructureName();
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__FIELDS:
				return getFields();
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__STRUCTURED_FIELDS:
				return getStructuredFields();
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__CONTAINER_DATA_MODULE:
				return getContainerDataModule();
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
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__STRUCTURE_NAME:
				setStructureName((String)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends DdsDataField>)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__STRUCTURED_FIELDS:
				getStructuredFields().clear();
				getStructuredFields().addAll((Collection<? extends DdsStructuredField>)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__CONTAINER_DATA_MODULE:
				setContainerDataModule((DdsDataModule)newValue);
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
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__STRUCTURE_NAME:
				setStructureName(STRUCTURE_NAME_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__FIELDS:
				getFields().clear();
				return;
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__STRUCTURED_FIELDS:
				getStructuredFields().clear();
				return;
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__CONTAINER_DATA_MODULE:
				setContainerDataModule((DdsDataModule)null);
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
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__STRUCTURE_NAME:
				return STRUCTURE_NAME_EDEFAULT == null ? structureName != null : !STRUCTURE_NAME_EDEFAULT.equals(structureName);
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__FIELDS:
				return fields != null && !fields.isEmpty();
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__STRUCTURED_FIELDS:
				return structuredFields != null && !structuredFields.isEmpty();
			case DdsMetamodelPackage.DDS_DATA_STRUCTURE__CONTAINER_DATA_MODULE:
				return getContainerDataModule() != null;
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
		result.append(" (structureName: ");
		result.append(structureName);
		result.append(')');
		return result.toString();
	}

} //DdsDataStructureImpl
