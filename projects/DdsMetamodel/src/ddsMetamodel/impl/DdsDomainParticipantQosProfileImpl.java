/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDomainParticipantQosProfile;
import ddsMetamodel.DdsEntityFactoryQos;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsUserDataQos;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Domain Participant Qos Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsDomainParticipantQosProfileImpl#getUserDataQos <em>User Data Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDomainParticipantQosProfileImpl#getEntityFactoryQos <em>Entity Factory Qos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsDomainParticipantQosProfileImpl extends DdsQosProfileImpl implements DdsDomainParticipantQosProfile {
	/**
	 * The cached value of the '{@link #getUserDataQos() <em>User Data Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataQos()
	 * @generated
	 * @ordered
	 */
	protected DdsUserDataQos userDataQos;

	/**
	 * The cached value of the '{@link #getEntityFactoryQos() <em>Entity Factory Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityFactoryQos()
	 * @generated
	 * @ordered
	 */
	protected DdsEntityFactoryQos entityFactoryQos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsDomainParticipantQosProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsUserDataQos getUserDataQos() {
		return userDataQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDataQos(DdsUserDataQos newUserDataQos, NotificationChain msgs) {
		DdsUserDataQos oldUserDataQos = userDataQos;
		userDataQos = newUserDataQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__USER_DATA_QOS, oldUserDataQos, newUserDataQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDataQos(DdsUserDataQos newUserDataQos) {
		if (newUserDataQos != userDataQos) {
			NotificationChain msgs = null;
			if (userDataQos != null)
				msgs = ((InternalEObject)userDataQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__USER_DATA_QOS, null, msgs);
			if (newUserDataQos != null)
				msgs = ((InternalEObject)newUserDataQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__USER_DATA_QOS, null, msgs);
			msgs = basicSetUserDataQos(newUserDataQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__USER_DATA_QOS, newUserDataQos, newUserDataQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsEntityFactoryQos getEntityFactoryQos() {
		return entityFactoryQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntityFactoryQos(DdsEntityFactoryQos newEntityFactoryQos, NotificationChain msgs) {
		DdsEntityFactoryQos oldEntityFactoryQos = entityFactoryQos;
		entityFactoryQos = newEntityFactoryQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__ENTITY_FACTORY_QOS, oldEntityFactoryQos, newEntityFactoryQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityFactoryQos(DdsEntityFactoryQos newEntityFactoryQos) {
		if (newEntityFactoryQos != entityFactoryQos) {
			NotificationChain msgs = null;
			if (entityFactoryQos != null)
				msgs = ((InternalEObject)entityFactoryQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__ENTITY_FACTORY_QOS, null, msgs);
			if (newEntityFactoryQos != null)
				msgs = ((InternalEObject)newEntityFactoryQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__ENTITY_FACTORY_QOS, null, msgs);
			msgs = basicSetEntityFactoryQos(newEntityFactoryQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__ENTITY_FACTORY_QOS, newEntityFactoryQos, newEntityFactoryQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__USER_DATA_QOS:
				return basicSetUserDataQos(null, msgs);
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__ENTITY_FACTORY_QOS:
				return basicSetEntityFactoryQos(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__USER_DATA_QOS:
				return getUserDataQos();
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__ENTITY_FACTORY_QOS:
				return getEntityFactoryQos();
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
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__USER_DATA_QOS:
				setUserDataQos((DdsUserDataQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__ENTITY_FACTORY_QOS:
				setEntityFactoryQos((DdsEntityFactoryQos)newValue);
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
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__USER_DATA_QOS:
				setUserDataQos((DdsUserDataQos)null);
				return;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__ENTITY_FACTORY_QOS:
				setEntityFactoryQos((DdsEntityFactoryQos)null);
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
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__USER_DATA_QOS:
				return userDataQos != null;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT_QOS_PROFILE__ENTITY_FACTORY_QOS:
				return entityFactoryQos != null;
		}
		return super.eIsSet(featureID);
	}

} //DdsDomainParticipantQosProfileImpl
