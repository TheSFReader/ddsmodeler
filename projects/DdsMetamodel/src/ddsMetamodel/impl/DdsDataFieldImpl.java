/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDataField;
import ddsMetamodel.DdsMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Data Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsDataFieldImpl#getFieldType <em>Field Type</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataFieldImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataFieldImpl#isIsKey <em>Is Key</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataFieldImpl#getMaxMultiplicity <em>Max Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsDataFieldImpl extends MinimalEObjectImpl.Container implements DdsDataField {
	/**
	 * The default value of the '{@link #getFieldType() <em>Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldType()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldType() <em>Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldType()
	 * @generated
	 * @ordered
	 */
	protected String fieldType = FIELD_TYPE_EDEFAULT;

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
	protected DdsDataFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_DATA_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldType() {
		return fieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldType(String newFieldType) {
		String oldFieldType = fieldType;
		fieldType = newFieldType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_FIELD__FIELD_TYPE, oldFieldType, fieldType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_FIELD__FIELD_NAME, oldFieldName, fieldName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_FIELD__IS_KEY, oldIsKey, isKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_FIELD__MAX_MULTIPLICITY, oldMaxMultiplicity, maxMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_DATA_FIELD__FIELD_TYPE:
				return getFieldType();
			case DdsMetamodelPackage.DDS_DATA_FIELD__FIELD_NAME:
				return getFieldName();
			case DdsMetamodelPackage.DDS_DATA_FIELD__IS_KEY:
				return isIsKey();
			case DdsMetamodelPackage.DDS_DATA_FIELD__MAX_MULTIPLICITY:
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
			case DdsMetamodelPackage.DDS_DATA_FIELD__FIELD_TYPE:
				setFieldType((String)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_FIELD__FIELD_NAME:
				setFieldName((String)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_FIELD__IS_KEY:
				setIsKey((Boolean)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_FIELD__MAX_MULTIPLICITY:
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
			case DdsMetamodelPackage.DDS_DATA_FIELD__FIELD_TYPE:
				setFieldType(FIELD_TYPE_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_DATA_FIELD__FIELD_NAME:
				setFieldName(FIELD_NAME_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_DATA_FIELD__IS_KEY:
				setIsKey(IS_KEY_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_DATA_FIELD__MAX_MULTIPLICITY:
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
			case DdsMetamodelPackage.DDS_DATA_FIELD__FIELD_TYPE:
				return FIELD_TYPE_EDEFAULT == null ? fieldType != null : !FIELD_TYPE_EDEFAULT.equals(fieldType);
			case DdsMetamodelPackage.DDS_DATA_FIELD__FIELD_NAME:
				return FIELD_NAME_EDEFAULT == null ? fieldName != null : !FIELD_NAME_EDEFAULT.equals(fieldName);
			case DdsMetamodelPackage.DDS_DATA_FIELD__IS_KEY:
				return isKey != IS_KEY_EDEFAULT;
			case DdsMetamodelPackage.DDS_DATA_FIELD__MAX_MULTIPLICITY:
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
		result.append(" (fieldType: ");
		result.append(fieldType);
		result.append(", fieldName: ");
		result.append(fieldName);
		result.append(", isKey: ");
		result.append(isKey);
		result.append(", maxMultiplicity: ");
		result.append(maxMultiplicity);
		result.append(')');
		return result.toString();
	}

} //DdsDataFieldImpl
