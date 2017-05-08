/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsEntityFactoryQos;
import ddsMetamodel.DdsGroupDataQos;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsPartitionQos;
import ddsMetamodel.DdsPresentationQos;
import ddsMetamodel.DdsPublisherQosProfile;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Publisher Qos Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsPublisherQosProfileImpl#getGroupDataQos <em>Group Data Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsPublisherQosProfileImpl#getEntityFactoryQos <em>Entity Factory Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsPublisherQosProfileImpl#getPresentationQos <em>Presentation Qos</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsPublisherQosProfileImpl#getPartitionQos <em>Partition Qos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsPublisherQosProfileImpl extends DdsQosProfileImpl implements DdsPublisherQosProfile {
	/**
	 * The cached value of the '{@link #getGroupDataQos() <em>Group Data Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupDataQos()
	 * @generated
	 * @ordered
	 */
	protected DdsGroupDataQos groupDataQos;

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
	 * The cached value of the '{@link #getPresentationQos() <em>Presentation Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationQos()
	 * @generated
	 * @ordered
	 */
	protected DdsPresentationQos presentationQos;

	/**
	 * The cached value of the '{@link #getPartitionQos() <em>Partition Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionQos()
	 * @generated
	 * @ordered
	 */
	protected DdsPartitionQos partitionQos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsPublisherQosProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_PUBLISHER_QOS_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsGroupDataQos getGroupDataQos() {
		return groupDataQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupDataQos(DdsGroupDataQos newGroupDataQos, NotificationChain msgs) {
		DdsGroupDataQos oldGroupDataQos = groupDataQos;
		groupDataQos = newGroupDataQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__GROUP_DATA_QOS, oldGroupDataQos, newGroupDataQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupDataQos(DdsGroupDataQos newGroupDataQos) {
		if (newGroupDataQos != groupDataQos) {
			NotificationChain msgs = null;
			if (groupDataQos != null)
				msgs = ((InternalEObject)groupDataQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__GROUP_DATA_QOS, null, msgs);
			if (newGroupDataQos != null)
				msgs = ((InternalEObject)newGroupDataQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__GROUP_DATA_QOS, null, msgs);
			msgs = basicSetGroupDataQos(newGroupDataQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__GROUP_DATA_QOS, newGroupDataQos, newGroupDataQos));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__ENTITY_FACTORY_QOS, oldEntityFactoryQos, newEntityFactoryQos);
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
				msgs = ((InternalEObject)entityFactoryQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__ENTITY_FACTORY_QOS, null, msgs);
			if (newEntityFactoryQos != null)
				msgs = ((InternalEObject)newEntityFactoryQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__ENTITY_FACTORY_QOS, null, msgs);
			msgs = basicSetEntityFactoryQos(newEntityFactoryQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__ENTITY_FACTORY_QOS, newEntityFactoryQos, newEntityFactoryQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsPresentationQos getPresentationQos() {
		return presentationQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentationQos(DdsPresentationQos newPresentationQos, NotificationChain msgs) {
		DdsPresentationQos oldPresentationQos = presentationQos;
		presentationQos = newPresentationQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__PRESENTATION_QOS, oldPresentationQos, newPresentationQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationQos(DdsPresentationQos newPresentationQos) {
		if (newPresentationQos != presentationQos) {
			NotificationChain msgs = null;
			if (presentationQos != null)
				msgs = ((InternalEObject)presentationQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__PRESENTATION_QOS, null, msgs);
			if (newPresentationQos != null)
				msgs = ((InternalEObject)newPresentationQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__PRESENTATION_QOS, null, msgs);
			msgs = basicSetPresentationQos(newPresentationQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__PRESENTATION_QOS, newPresentationQos, newPresentationQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsPartitionQos getPartitionQos() {
		return partitionQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartitionQos(DdsPartitionQos newPartitionQos, NotificationChain msgs) {
		DdsPartitionQos oldPartitionQos = partitionQos;
		partitionQos = newPartitionQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__PARTITION_QOS, oldPartitionQos, newPartitionQos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionQos(DdsPartitionQos newPartitionQos) {
		if (newPartitionQos != partitionQos) {
			NotificationChain msgs = null;
			if (partitionQos != null)
				msgs = ((InternalEObject)partitionQos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__PARTITION_QOS, null, msgs);
			if (newPartitionQos != null)
				msgs = ((InternalEObject)newPartitionQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__PARTITION_QOS, null, msgs);
			msgs = basicSetPartitionQos(newPartitionQos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__PARTITION_QOS, newPartitionQos, newPartitionQos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__GROUP_DATA_QOS:
				return basicSetGroupDataQos(null, msgs);
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__ENTITY_FACTORY_QOS:
				return basicSetEntityFactoryQos(null, msgs);
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__PRESENTATION_QOS:
				return basicSetPresentationQos(null, msgs);
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__PARTITION_QOS:
				return basicSetPartitionQos(null, msgs);
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
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__GROUP_DATA_QOS:
				return getGroupDataQos();
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__ENTITY_FACTORY_QOS:
				return getEntityFactoryQos();
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__PRESENTATION_QOS:
				return getPresentationQos();
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__PARTITION_QOS:
				return getPartitionQos();
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
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__GROUP_DATA_QOS:
				setGroupDataQos((DdsGroupDataQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__ENTITY_FACTORY_QOS:
				setEntityFactoryQos((DdsEntityFactoryQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__PRESENTATION_QOS:
				setPresentationQos((DdsPresentationQos)newValue);
				return;
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__PARTITION_QOS:
				setPartitionQos((DdsPartitionQos)newValue);
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
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__GROUP_DATA_QOS:
				setGroupDataQos((DdsGroupDataQos)null);
				return;
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__ENTITY_FACTORY_QOS:
				setEntityFactoryQos((DdsEntityFactoryQos)null);
				return;
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__PRESENTATION_QOS:
				setPresentationQos((DdsPresentationQos)null);
				return;
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__PARTITION_QOS:
				setPartitionQos((DdsPartitionQos)null);
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
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__GROUP_DATA_QOS:
				return groupDataQos != null;
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__ENTITY_FACTORY_QOS:
				return entityFactoryQos != null;
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__PRESENTATION_QOS:
				return presentationQos != null;
			case DdsMetamodelPackage.DDS_PUBLISHER_QOS_PROFILE__PARTITION_QOS:
				return partitionQos != null;
		}
		return super.eIsSet(featureID);
	}

} //DdsPublisherQosProfileImpl
