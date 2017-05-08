/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DataReaderStatus;
import ddsMetamodel.DdsDataReader;
import ddsMetamodel.DdsDataReaderStatusCondition;
import ddsMetamodel.DdsMetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Data Reader Status Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderStatusConditionImpl#getEnabled_status <em>Enabled status</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderStatusConditionImpl#getDataReader <em>Data Reader</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsDataReaderStatusConditionImpl extends DdsStatusConditionImpl implements DdsDataReaderStatusCondition {
	/**
	 * The cached value of the '{@link #getEnabled_status() <em>Enabled status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled_status()
	 * @generated
	 * @ordered
	 */
	protected EList<DataReaderStatus> enabled_status;

	/**
	 * The cached value of the '{@link #getDataReader() <em>Data Reader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataReader()
	 * @generated
	 * @ordered
	 */
	protected DdsDataReader dataReader;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsDataReaderStatusConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_DATA_READER_STATUS_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataReaderStatus> getEnabled_status() {
		if (enabled_status == null) {
			enabled_status = new EDataTypeUniqueEList<DataReaderStatus>(DataReaderStatus.class, this, DdsMetamodelPackage.DDS_DATA_READER_STATUS_CONDITION__ENABLED_STATUS);
		}
		return enabled_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataReader getDataReader() {
		if (dataReader != null && dataReader.eIsProxy()) {
			InternalEObject oldDataReader = (InternalEObject)dataReader;
			dataReader = (DdsDataReader)eResolveProxy(oldDataReader);
			if (dataReader != oldDataReader) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsMetamodelPackage.DDS_DATA_READER_STATUS_CONDITION__DATA_READER, oldDataReader, dataReader));
			}
		}
		return dataReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataReader basicGetDataReader() {
		return dataReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataReader(DdsDataReader newDataReader) {
		DdsDataReader oldDataReader = dataReader;
		dataReader = newDataReader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_STATUS_CONDITION__DATA_READER, oldDataReader, dataReader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_DATA_READER_STATUS_CONDITION__ENABLED_STATUS:
				return getEnabled_status();
			case DdsMetamodelPackage.DDS_DATA_READER_STATUS_CONDITION__DATA_READER:
				if (resolve) return getDataReader();
				return basicGetDataReader();
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
			case DdsMetamodelPackage.DDS_DATA_READER_STATUS_CONDITION__ENABLED_STATUS:
				getEnabled_status().clear();
				getEnabled_status().addAll((Collection<? extends DataReaderStatus>)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_STATUS_CONDITION__DATA_READER:
				setDataReader((DdsDataReader)newValue);
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
			case DdsMetamodelPackage.DDS_DATA_READER_STATUS_CONDITION__ENABLED_STATUS:
				getEnabled_status().clear();
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_STATUS_CONDITION__DATA_READER:
				setDataReader((DdsDataReader)null);
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
			case DdsMetamodelPackage.DDS_DATA_READER_STATUS_CONDITION__ENABLED_STATUS:
				return enabled_status != null && !enabled_status.isEmpty();
			case DdsMetamodelPackage.DDS_DATA_READER_STATUS_CONDITION__DATA_READER:
				return dataReader != null;
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
		result.append(" (enabled_status: ");
		result.append(enabled_status);
		result.append(')');
		return result.toString();
	}

} //DdsDataReaderStatusConditionImpl
