/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDomainParticipantListener;
import ddsMetamodel.DdsMetamodelPackage;

import ddsMetamodel.DomainParticipantStatus;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Domain Participant Listener</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsDomainParticipantListenerImpl#getName <em>Name</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDomainParticipantListenerImpl#getListenedStatus <em>Listened Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsDomainParticipantListenerImpl extends MinimalEObjectImpl.Container implements DdsDomainParticipantListener {
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
	 * The cached value of the '{@link #getListenedStatus() <em>Listened Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListenedStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainParticipantStatus> listenedStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsDomainParticipantListenerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_DOMAIN_PARTICIPANT_LISTENER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_LISTENER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainParticipantStatus> getListenedStatus() {
		if (listenedStatus == null) {
			listenedStatus = new EDataTypeUniqueEList<DomainParticipantStatus>(DomainParticipantStatus.class, this, DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_LISTENER__LISTENED_STATUS);
		}
		return listenedStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_LISTENER__NAME:
				return getName();
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_LISTENER__LISTENED_STATUS:
				return getListenedStatus();
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
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_LISTENER__NAME:
				setName((String)newValue);
				return;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_LISTENER__LISTENED_STATUS:
				getListenedStatus().clear();
				getListenedStatus().addAll((Collection<? extends DomainParticipantStatus>)newValue);
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
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_LISTENER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_LISTENER__LISTENED_STATUS:
				getListenedStatus().clear();
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
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_LISTENER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_LISTENER__LISTENED_STATUS:
				return listenedStatus != null && !listenedStatus.isEmpty();
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
		result.append(", listenedStatus: ");
		result.append(listenedStatus);
		result.append(')');
		return result.toString();
	}

} //DdsDomainParticipantListenerImpl
