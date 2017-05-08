/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsTopic;
import ddsMetamodel.DdsTopicStatusCondition;
import ddsMetamodel.TopicStatus;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Topic Status Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsTopicStatusConditionImpl#getEnabled_status <em>Enabled status</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsTopicStatusConditionImpl#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsTopicStatusConditionImpl extends DdsStatusConditionImpl implements DdsTopicStatusCondition {
	/**
	 * The cached value of the '{@link #getEnabled_status() <em>Enabled status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled_status()
	 * @generated
	 * @ordered
	 */
	protected EList<TopicStatus> enabled_status;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected DdsTopic topic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsTopicStatusConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_TOPIC_STATUS_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TopicStatus> getEnabled_status() {
		if (enabled_status == null) {
			enabled_status = new EDataTypeUniqueEList<TopicStatus>(TopicStatus.class, this, DdsMetamodelPackage.DDS_TOPIC_STATUS_CONDITION__ENABLED_STATUS);
		}
		return enabled_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTopic getTopic() {
		if (topic != null && topic.eIsProxy()) {
			InternalEObject oldTopic = (InternalEObject)topic;
			topic = (DdsTopic)eResolveProxy(oldTopic);
			if (topic != oldTopic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsMetamodelPackage.DDS_TOPIC_STATUS_CONDITION__TOPIC, oldTopic, topic));
			}
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTopic basicGetTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic(DdsTopic newTopic) {
		DdsTopic oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC_STATUS_CONDITION__TOPIC, oldTopic, topic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_TOPIC_STATUS_CONDITION__ENABLED_STATUS:
				return getEnabled_status();
			case DdsMetamodelPackage.DDS_TOPIC_STATUS_CONDITION__TOPIC:
				if (resolve) return getTopic();
				return basicGetTopic();
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
			case DdsMetamodelPackage.DDS_TOPIC_STATUS_CONDITION__ENABLED_STATUS:
				getEnabled_status().clear();
				getEnabled_status().addAll((Collection<? extends TopicStatus>)newValue);
				return;
			case DdsMetamodelPackage.DDS_TOPIC_STATUS_CONDITION__TOPIC:
				setTopic((DdsTopic)newValue);
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
			case DdsMetamodelPackage.DDS_TOPIC_STATUS_CONDITION__ENABLED_STATUS:
				getEnabled_status().clear();
				return;
			case DdsMetamodelPackage.DDS_TOPIC_STATUS_CONDITION__TOPIC:
				setTopic((DdsTopic)null);
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
			case DdsMetamodelPackage.DDS_TOPIC_STATUS_CONDITION__ENABLED_STATUS:
				return enabled_status != null && !enabled_status.isEmpty();
			case DdsMetamodelPackage.DDS_TOPIC_STATUS_CONDITION__TOPIC:
				return topic != null;
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

} //DdsTopicStatusConditionImpl
