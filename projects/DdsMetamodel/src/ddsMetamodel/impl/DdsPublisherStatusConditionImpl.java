/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsPublisher;
import ddsMetamodel.DdsPublisherStatusCondition;
import ddsMetamodel.PublisherStatus;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Publisher Status Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsPublisherStatusConditionImpl#getEnabled_status <em>Enabled status</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsPublisherStatusConditionImpl#getPublisher <em>Publisher</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsPublisherStatusConditionImpl extends DdsStatusConditionImpl implements DdsPublisherStatusCondition {
	/**
	 * The cached value of the '{@link #getEnabled_status() <em>Enabled status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled_status()
	 * @generated
	 * @ordered
	 */
	protected EList<PublisherStatus> enabled_status;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected DdsPublisher publisher;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsPublisherStatusConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_PUBLISHER_STATUS_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PublisherStatus> getEnabled_status() {
		if (enabled_status == null) {
			enabled_status = new EDataTypeUniqueEList<PublisherStatus>(PublisherStatus.class, this, DdsMetamodelPackage.DDS_PUBLISHER_STATUS_CONDITION__ENABLED_STATUS);
		}
		return enabled_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsPublisher getPublisher() {
		if (publisher != null && publisher.eIsProxy()) {
			InternalEObject oldPublisher = (InternalEObject)publisher;
			publisher = (DdsPublisher)eResolveProxy(oldPublisher);
			if (publisher != oldPublisher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsMetamodelPackage.DDS_PUBLISHER_STATUS_CONDITION__PUBLISHER, oldPublisher, publisher));
			}
		}
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsPublisher basicGetPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(DdsPublisher newPublisher) {
		DdsPublisher oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_PUBLISHER_STATUS_CONDITION__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_PUBLISHER_STATUS_CONDITION__ENABLED_STATUS:
				return getEnabled_status();
			case DdsMetamodelPackage.DDS_PUBLISHER_STATUS_CONDITION__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
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
			case DdsMetamodelPackage.DDS_PUBLISHER_STATUS_CONDITION__ENABLED_STATUS:
				getEnabled_status().clear();
				getEnabled_status().addAll((Collection<? extends PublisherStatus>)newValue);
				return;
			case DdsMetamodelPackage.DDS_PUBLISHER_STATUS_CONDITION__PUBLISHER:
				setPublisher((DdsPublisher)newValue);
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
			case DdsMetamodelPackage.DDS_PUBLISHER_STATUS_CONDITION__ENABLED_STATUS:
				getEnabled_status().clear();
				return;
			case DdsMetamodelPackage.DDS_PUBLISHER_STATUS_CONDITION__PUBLISHER:
				setPublisher((DdsPublisher)null);
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
			case DdsMetamodelPackage.DDS_PUBLISHER_STATUS_CONDITION__ENABLED_STATUS:
				return enabled_status != null && !enabled_status.isEmpty();
			case DdsMetamodelPackage.DDS_PUBLISHER_STATUS_CONDITION__PUBLISHER:
				return publisher != null;
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

} //DdsPublisherStatusConditionImpl
