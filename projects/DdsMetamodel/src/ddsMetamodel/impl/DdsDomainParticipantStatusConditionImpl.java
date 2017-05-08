/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDomainParticipant;
import ddsMetamodel.DdsDomainParticipantStatusCondition;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DomainParticipantStatus;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Domain Participant Status Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsDomainParticipantStatusConditionImpl#getEnabled_status <em>Enabled status</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDomainParticipantStatusConditionImpl#getDomainParticipant <em>Domain Participant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsDomainParticipantStatusConditionImpl extends DdsStatusConditionImpl implements DdsDomainParticipantStatusCondition {
	/**
	 * The cached value of the '{@link #getEnabled_status() <em>Enabled status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled_status()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainParticipantStatus> enabled_status;

	/**
	 * The cached value of the '{@link #getDomainParticipant() <em>Domain Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainParticipant()
	 * @generated
	 * @ordered
	 */
	protected DdsDomainParticipant domainParticipant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsDomainParticipantStatusConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainParticipantStatus> getEnabled_status() {
		if (enabled_status == null) {
			enabled_status = new EDataTypeUniqueEList<DomainParticipantStatus>(DomainParticipantStatus.class, this, DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION__ENABLED_STATUS);
		}
		return enabled_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDomainParticipant getDomainParticipant() {
		if (domainParticipant != null && domainParticipant.eIsProxy()) {
			InternalEObject oldDomainParticipant = (InternalEObject)domainParticipant;
			domainParticipant = (DdsDomainParticipant)eResolveProxy(oldDomainParticipant);
			if (domainParticipant != oldDomainParticipant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION__DOMAIN_PARTICIPANT, oldDomainParticipant, domainParticipant));
			}
		}
		return domainParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDomainParticipant basicGetDomainParticipant() {
		return domainParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainParticipant(DdsDomainParticipant newDomainParticipant) {
		DdsDomainParticipant oldDomainParticipant = domainParticipant;
		domainParticipant = newDomainParticipant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION__DOMAIN_PARTICIPANT, oldDomainParticipant, domainParticipant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION__ENABLED_STATUS:
				return getEnabled_status();
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION__DOMAIN_PARTICIPANT:
				if (resolve) return getDomainParticipant();
				return basicGetDomainParticipant();
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
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION__ENABLED_STATUS:
				getEnabled_status().clear();
				getEnabled_status().addAll((Collection<? extends DomainParticipantStatus>)newValue);
				return;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION__DOMAIN_PARTICIPANT:
				setDomainParticipant((DdsDomainParticipant)newValue);
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
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION__ENABLED_STATUS:
				getEnabled_status().clear();
				return;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION__DOMAIN_PARTICIPANT:
				setDomainParticipant((DdsDomainParticipant)null);
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
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION__ENABLED_STATUS:
				return enabled_status != null && !enabled_status.isEmpty();
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_STATUS_CONDITION__DOMAIN_PARTICIPANT:
				return domainParticipant != null;
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

} //DdsDomainParticipantStatusConditionImpl
