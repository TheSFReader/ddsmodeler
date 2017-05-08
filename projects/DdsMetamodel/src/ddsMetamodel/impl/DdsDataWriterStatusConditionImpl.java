/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DataWriterStatus;
import ddsMetamodel.DdsDataWriter;
import ddsMetamodel.DdsDataWriterStatusCondition;
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
 * An implementation of the model object '<em><b>Dds Data Writer Status Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterStatusConditionImpl#getEnabled_status <em>Enabled status</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterStatusConditionImpl#getDataWriter <em>Data Writer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsDataWriterStatusConditionImpl extends DdsStatusConditionImpl implements DdsDataWriterStatusCondition {
	/**
	 * The cached value of the '{@link #getEnabled_status() <em>Enabled status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled_status()
	 * @generated
	 * @ordered
	 */
	protected EList<DataWriterStatus> enabled_status;

	/**
	 * The cached value of the '{@link #getDataWriter() <em>Data Writer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataWriter()
	 * @generated
	 * @ordered
	 */
	protected DdsDataWriter dataWriter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsDataWriterStatusConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_DATA_WRITER_STATUS_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataWriterStatus> getEnabled_status() {
		if (enabled_status == null) {
			enabled_status = new EDataTypeUniqueEList<DataWriterStatus>(DataWriterStatus.class, this, DdsMetamodelPackage.DDS_DATA_WRITER_STATUS_CONDITION__ENABLED_STATUS);
		}
		return enabled_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataWriter getDataWriter() {
		if (dataWriter != null && dataWriter.eIsProxy()) {
			InternalEObject oldDataWriter = (InternalEObject)dataWriter;
			dataWriter = (DdsDataWriter)eResolveProxy(oldDataWriter);
			if (dataWriter != oldDataWriter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsMetamodelPackage.DDS_DATA_WRITER_STATUS_CONDITION__DATA_WRITER, oldDataWriter, dataWriter));
			}
		}
		return dataWriter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataWriter basicGetDataWriter() {
		return dataWriter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataWriter(DdsDataWriter newDataWriter) {
		DdsDataWriter oldDataWriter = dataWriter;
		dataWriter = newDataWriter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_STATUS_CONDITION__DATA_WRITER, oldDataWriter, dataWriter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_DATA_WRITER_STATUS_CONDITION__ENABLED_STATUS:
				return getEnabled_status();
			case DdsMetamodelPackage.DDS_DATA_WRITER_STATUS_CONDITION__DATA_WRITER:
				if (resolve) return getDataWriter();
				return basicGetDataWriter();
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
			case DdsMetamodelPackage.DDS_DATA_WRITER_STATUS_CONDITION__ENABLED_STATUS:
				getEnabled_status().clear();
				getEnabled_status().addAll((Collection<? extends DataWriterStatus>)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_STATUS_CONDITION__DATA_WRITER:
				setDataWriter((DdsDataWriter)newValue);
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
			case DdsMetamodelPackage.DDS_DATA_WRITER_STATUS_CONDITION__ENABLED_STATUS:
				getEnabled_status().clear();
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_STATUS_CONDITION__DATA_WRITER:
				setDataWriter((DdsDataWriter)null);
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
			case DdsMetamodelPackage.DDS_DATA_WRITER_STATUS_CONDITION__ENABLED_STATUS:
				return enabled_status != null && !enabled_status.isEmpty();
			case DdsMetamodelPackage.DDS_DATA_WRITER_STATUS_CONDITION__DATA_WRITER:
				return dataWriter != null;
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

} //DdsDataWriterStatusConditionImpl
