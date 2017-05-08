/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDataReader;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsReadCondition;
import ddsMetamodel.InstanceStateKind;
import ddsMetamodel.SampleStateKind;
import ddsMetamodel.ViewStateKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Read Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsReadConditionImpl#getView_state_mask <em>View state mask</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsReadConditionImpl#getInstance_state_mask <em>Instance state mask</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsReadConditionImpl#getSample_state_mask <em>Sample state mask</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsReadConditionImpl#getDataReader <em>Data Reader</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsReadConditionImpl extends MinimalEObjectImpl.Container implements DdsReadCondition {
	/**
	 * The default value of the '{@link #getView_state_mask() <em>View state mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView_state_mask()
	 * @generated
	 * @ordered
	 */
	protected static final ViewStateKind VIEW_STATE_MASK_EDEFAULT = ViewStateKind.NEW_VIEW_STATE;

	/**
	 * The cached value of the '{@link #getView_state_mask() <em>View state mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView_state_mask()
	 * @generated
	 * @ordered
	 */
	protected ViewStateKind view_state_mask = VIEW_STATE_MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstance_state_mask() <em>Instance state mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance_state_mask()
	 * @generated
	 * @ordered
	 */
	protected static final InstanceStateKind INSTANCE_STATE_MASK_EDEFAULT = InstanceStateKind.ALIVE_INSTANCE_STATE;

	/**
	 * The cached value of the '{@link #getInstance_state_mask() <em>Instance state mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance_state_mask()
	 * @generated
	 * @ordered
	 */
	protected InstanceStateKind instance_state_mask = INSTANCE_STATE_MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSample_state_mask() <em>Sample state mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSample_state_mask()
	 * @generated
	 * @ordered
	 */
	protected static final SampleStateKind SAMPLE_STATE_MASK_EDEFAULT = SampleStateKind.READ_SAMPLE_STATE;

	/**
	 * The cached value of the '{@link #getSample_state_mask() <em>Sample state mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSample_state_mask()
	 * @generated
	 * @ordered
	 */
	protected SampleStateKind sample_state_mask = SAMPLE_STATE_MASK_EDEFAULT;

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
	protected DdsReadConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_READ_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewStateKind getView_state_mask() {
		return view_state_mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView_state_mask(ViewStateKind newView_state_mask) {
		ViewStateKind oldView_state_mask = view_state_mask;
		view_state_mask = newView_state_mask == null ? VIEW_STATE_MASK_EDEFAULT : newView_state_mask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_READ_CONDITION__VIEW_STATE_MASK, oldView_state_mask, view_state_mask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceStateKind getInstance_state_mask() {
		return instance_state_mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance_state_mask(InstanceStateKind newInstance_state_mask) {
		InstanceStateKind oldInstance_state_mask = instance_state_mask;
		instance_state_mask = newInstance_state_mask == null ? INSTANCE_STATE_MASK_EDEFAULT : newInstance_state_mask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_READ_CONDITION__INSTANCE_STATE_MASK, oldInstance_state_mask, instance_state_mask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleStateKind getSample_state_mask() {
		return sample_state_mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSample_state_mask(SampleStateKind newSample_state_mask) {
		SampleStateKind oldSample_state_mask = sample_state_mask;
		sample_state_mask = newSample_state_mask == null ? SAMPLE_STATE_MASK_EDEFAULT : newSample_state_mask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_READ_CONDITION__SAMPLE_STATE_MASK, oldSample_state_mask, sample_state_mask));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsMetamodelPackage.DDS_READ_CONDITION__DATA_READER, oldDataReader, dataReader));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_READ_CONDITION__DATA_READER, oldDataReader, dataReader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_READ_CONDITION__VIEW_STATE_MASK:
				return getView_state_mask();
			case DdsMetamodelPackage.DDS_READ_CONDITION__INSTANCE_STATE_MASK:
				return getInstance_state_mask();
			case DdsMetamodelPackage.DDS_READ_CONDITION__SAMPLE_STATE_MASK:
				return getSample_state_mask();
			case DdsMetamodelPackage.DDS_READ_CONDITION__DATA_READER:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_READ_CONDITION__VIEW_STATE_MASK:
				setView_state_mask((ViewStateKind)newValue);
				return;
			case DdsMetamodelPackage.DDS_READ_CONDITION__INSTANCE_STATE_MASK:
				setInstance_state_mask((InstanceStateKind)newValue);
				return;
			case DdsMetamodelPackage.DDS_READ_CONDITION__SAMPLE_STATE_MASK:
				setSample_state_mask((SampleStateKind)newValue);
				return;
			case DdsMetamodelPackage.DDS_READ_CONDITION__DATA_READER:
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
			case DdsMetamodelPackage.DDS_READ_CONDITION__VIEW_STATE_MASK:
				setView_state_mask(VIEW_STATE_MASK_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_READ_CONDITION__INSTANCE_STATE_MASK:
				setInstance_state_mask(INSTANCE_STATE_MASK_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_READ_CONDITION__SAMPLE_STATE_MASK:
				setSample_state_mask(SAMPLE_STATE_MASK_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_READ_CONDITION__DATA_READER:
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
			case DdsMetamodelPackage.DDS_READ_CONDITION__VIEW_STATE_MASK:
				return view_state_mask != VIEW_STATE_MASK_EDEFAULT;
			case DdsMetamodelPackage.DDS_READ_CONDITION__INSTANCE_STATE_MASK:
				return instance_state_mask != INSTANCE_STATE_MASK_EDEFAULT;
			case DdsMetamodelPackage.DDS_READ_CONDITION__SAMPLE_STATE_MASK:
				return sample_state_mask != SAMPLE_STATE_MASK_EDEFAULT;
			case DdsMetamodelPackage.DDS_READ_CONDITION__DATA_READER:
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
		result.append(" (view_state_mask: ");
		result.append(view_state_mask);
		result.append(", instance_state_mask: ");
		result.append(instance_state_mask);
		result.append(", sample_state_mask: ");
		result.append(sample_state_mask);
		result.append(')');
		return result.toString();
	}

} //DdsReadConditionImpl
