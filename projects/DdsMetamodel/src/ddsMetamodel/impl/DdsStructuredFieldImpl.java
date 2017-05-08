/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDataStructure;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsStructuredField;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Structured Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsStructuredFieldImpl#isIsKey <em>Is Key</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsStructuredFieldImpl#getReferencedType <em>Referenced Type</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsStructuredFieldImpl#getDataStructure <em>Data Structure</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsStructuredFieldImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsStructuredFieldImpl#getMaxMultiplicity <em>Max Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsStructuredFieldImpl extends MinimalEObjectImpl.Container implements DdsStructuredField {
	/**
	 * The default value of the '{@link #isIsKey() <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsKey() <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsKey()
	 * @generated
	 * @ordered
	 */
	protected boolean isKey = IS_KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencedType() <em>Referenced Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedType()
	 * @generated
	 * @ordered
	 */
	protected DdsDataStructure referencedType;

	/**
	 * The default value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldName()
	 * @generated
	 * @ordered
	 */
	protected String fieldName = FIELD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxMultiplicity() <em>Max Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_MULTIPLICITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxMultiplicity() <em>Max Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected int maxMultiplicity = MAX_MULTIPLICITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsStructuredFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_STRUCTURED_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsKey() {
		return isKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsKey(boolean newIsKey) {
		boolean oldIsKey = isKey;
		isKey = newIsKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_STRUCTURED_FIELD__IS_KEY, oldIsKey, isKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataStructure getReferencedType() {
		if (referencedType != null && referencedType.eIsProxy()) {
			InternalEObject oldReferencedType = (InternalEObject)referencedType;
			referencedType = (DdsDataStructure)eResolveProxy(oldReferencedType);
			if (referencedType != oldReferencedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsMetamodelPackage.DDS_STRUCTURED_FIELD__REFERENCED_TYPE, oldReferencedType, referencedType));
			}
		}
		return referencedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataStructure basicGetReferencedType() {
		return referencedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedType(DdsDataStructure newReferencedType) {
		DdsDataStructure oldReferencedType = referencedType;
		referencedType = newReferencedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_STRUCTURED_FIELD__REFERENCED_TYPE, oldReferencedType, referencedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataStructure getDataStructure() {
		if (eContainerFeatureID() != DdsMetamodelPackage.DDS_STRUCTURED_FIELD__DATA_STRUCTURE) return null;
		return (DdsDataStructure)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataStructure(DdsDataStructure newDataStructure, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDataStructure, DdsMetamodelPackage.DDS_STRUCTURED_FIELD__DATA_STRUCTURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataStructure(DdsDataStructure newDataStructure) {
		if (newDataStructure != eInternalContainer() || (eContainerFeatureID() != DdsMetamodelPackage.DDS_STRUCTURED_FIELD__DATA_STRUCTURE && newDataStructure != null)) {
			if (EcoreUtil.isAncestor(this, newDataStructure))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataStructure != null)
				msgs = ((InternalEObject)newDataStructure).eInverseAdd(this, DdsMetamodelPackage.DDS_DATA_STRUCTURE__STRUCTURED_FIELDS, DdsDataStructure.class, msgs);
			msgs = basicSetDataStructure(newDataStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_STRUCTURED_FIELD__DATA_STRUCTURE, newDataStructure, newDataStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldName(String newFieldName) {
		String oldFieldName = fieldName;
		fieldName = newFieldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_STRUCTURED_FIELD__FIELD_NAME, oldFieldName, fieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxMultiplicity() {
		return maxMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxMultiplicity(int newMaxMultiplicity) {
		int oldMaxMultiplicity = maxMultiplicity;
		maxMultiplicity = newMaxMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_STRUCTURED_FIELD__MAX_MULTIPLICITY, oldMaxMultiplicity, maxMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__DATA_STRUCTURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataStructure((DdsDataStructure)otherEnd, msgs);
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
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__DATA_STRUCTURE:
				return basicSetDataStructure(null, msgs);
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
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__DATA_STRUCTURE:
				return eInternalContainer().eInverseRemove(this, DdsMetamodelPackage.DDS_DATA_STRUCTURE__STRUCTURED_FIELDS, DdsDataStructure.class, msgs);
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
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__IS_KEY:
				return isIsKey();
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__REFERENCED_TYPE:
				if (resolve) return getReferencedType();
				return basicGetReferencedType();
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__DATA_STRUCTURE:
				return getDataStructure();
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__FIELD_NAME:
				return getFieldName();
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__MAX_MULTIPLICITY:
				return getMaxMultiplicity();
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
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__IS_KEY:
				setIsKey((Boolean)newValue);
				return;
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__REFERENCED_TYPE:
				setReferencedType((DdsDataStructure)newValue);
				return;
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__DATA_STRUCTURE:
				setDataStructure((DdsDataStructure)newValue);
				return;
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__FIELD_NAME:
				setFieldName((String)newValue);
				return;
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__MAX_MULTIPLICITY:
				setMaxMultiplicity((Integer)newValue);
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
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__IS_KEY:
				setIsKey(IS_KEY_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__REFERENCED_TYPE:
				setReferencedType((DdsDataStructure)null);
				return;
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__DATA_STRUCTURE:
				setDataStructure((DdsDataStructure)null);
				return;
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__FIELD_NAME:
				setFieldName(FIELD_NAME_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__MAX_MULTIPLICITY:
				setMaxMultiplicity(MAX_MULTIPLICITY_EDEFAULT);
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
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__IS_KEY:
				return isKey != IS_KEY_EDEFAULT;
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__REFERENCED_TYPE:
				return referencedType != null;
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__DATA_STRUCTURE:
				return getDataStructure() != null;
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__FIELD_NAME:
				return FIELD_NAME_EDEFAULT == null ? fieldName != null : !FIELD_NAME_EDEFAULT.equals(fieldName);
			case DdsMetamodelPackage.DDS_STRUCTURED_FIELD__MAX_MULTIPLICITY:
				return maxMultiplicity != MAX_MULTIPLICITY_EDEFAULT;
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
		result.append(" (isKey: ");
		result.append(isKey);
		result.append(", fieldName: ");
		result.append(fieldName);
		result.append(", maxMultiplicity: ");
		result.append(maxMultiplicity);
		result.append(')');
		return result.toString();
	}

} //DdsStructuredFieldImpl
