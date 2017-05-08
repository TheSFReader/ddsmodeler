/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDataStructure;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsTopic;
import ddsMetamodel.DdsTopicListener;
import ddsMetamodel.DdsTopicQosProfile;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Topic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsTopicImpl#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsTopicImpl#getTopicListener <em>Topic Listener</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsTopicImpl#getTopicQosProfile <em>Topic Qos Profile</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsTopicImpl#getDdsdatastructure <em>Ddsdatastructure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsTopicImpl extends MinimalEObjectImpl.Container implements DdsTopic {
	/**
	 * The default value of the '{@link #getTopicName() <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicName()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopicName() <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicName()
	 * @generated
	 * @ordered
	 */
	protected String topicName = TOPIC_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTopicListener() <em>Topic Listener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicListener()
	 * @generated
	 * @ordered
	 */
	protected DdsTopicListener topicListener;

	/**
	 * The cached value of the '{@link #getTopicQosProfile() <em>Topic Qos Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicQosProfile()
	 * @generated
	 * @ordered
	 */
	protected DdsTopicQosProfile topicQosProfile;

	/**
	 * The cached value of the '{@link #getDdsdatastructure() <em>Ddsdatastructure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdsdatastructure()
	 * @generated
	 * @ordered
	 */
	protected DdsDataStructure ddsdatastructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsTopicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_TOPIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopicName() {
		return topicName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicName(String newTopicName) {
		String oldTopicName = topicName;
		topicName = newTopicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC__TOPIC_NAME, oldTopicName, topicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTopicListener getTopicListener() {
		return topicListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopicListener(DdsTopicListener newTopicListener, NotificationChain msgs) {
		DdsTopicListener oldTopicListener = topicListener;
		topicListener = newTopicListener;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC__TOPIC_LISTENER, oldTopicListener, newTopicListener);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicListener(DdsTopicListener newTopicListener) {
		if (newTopicListener != topicListener) {
			NotificationChain msgs = null;
			if (topicListener != null)
				msgs = ((InternalEObject)topicListener).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC__TOPIC_LISTENER, null, msgs);
			if (newTopicListener != null)
				msgs = ((InternalEObject)newTopicListener).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_TOPIC__TOPIC_LISTENER, null, msgs);
			msgs = basicSetTopicListener(newTopicListener, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC__TOPIC_LISTENER, newTopicListener, newTopicListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTopicQosProfile getTopicQosProfile() {
		if (topicQosProfile != null && topicQosProfile.eIsProxy()) {
			InternalEObject oldTopicQosProfile = (InternalEObject)topicQosProfile;
			topicQosProfile = (DdsTopicQosProfile)eResolveProxy(oldTopicQosProfile);
			if (topicQosProfile != oldTopicQosProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsMetamodelPackage.DDS_TOPIC__TOPIC_QOS_PROFILE, oldTopicQosProfile, topicQosProfile));
			}
		}
		return topicQosProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTopicQosProfile basicGetTopicQosProfile() {
		return topicQosProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicQosProfile(DdsTopicQosProfile newTopicQosProfile) {
		DdsTopicQosProfile oldTopicQosProfile = topicQosProfile;
		topicQosProfile = newTopicQosProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC__TOPIC_QOS_PROFILE, oldTopicQosProfile, topicQosProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataStructure getDdsdatastructure() {
		if (ddsdatastructure != null && ddsdatastructure.eIsProxy()) {
			InternalEObject oldDdsdatastructure = (InternalEObject)ddsdatastructure;
			ddsdatastructure = (DdsDataStructure)eResolveProxy(oldDdsdatastructure);
			if (ddsdatastructure != oldDdsdatastructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsMetamodelPackage.DDS_TOPIC__DDSDATASTRUCTURE, oldDdsdatastructure, ddsdatastructure));
			}
		}
		return ddsdatastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataStructure basicGetDdsdatastructure() {
		return ddsdatastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdsdatastructure(DdsDataStructure newDdsdatastructure) {
		DdsDataStructure oldDdsdatastructure = ddsdatastructure;
		ddsdatastructure = newDdsdatastructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_TOPIC__DDSDATASTRUCTURE, oldDdsdatastructure, ddsdatastructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_TOPIC__TOPIC_LISTENER:
				return basicSetTopicListener(null, msgs);
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
			case DdsMetamodelPackage.DDS_TOPIC__TOPIC_NAME:
				return getTopicName();
			case DdsMetamodelPackage.DDS_TOPIC__TOPIC_LISTENER:
				return getTopicListener();
			case DdsMetamodelPackage.DDS_TOPIC__TOPIC_QOS_PROFILE:
				if (resolve) return getTopicQosProfile();
				return basicGetTopicQosProfile();
			case DdsMetamodelPackage.DDS_TOPIC__DDSDATASTRUCTURE:
				if (resolve) return getDdsdatastructure();
				return basicGetDdsdatastructure();
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
			case DdsMetamodelPackage.DDS_TOPIC__TOPIC_NAME:
				setTopicName((String)newValue);
				return;
			case DdsMetamodelPackage.DDS_TOPIC__TOPIC_LISTENER:
				setTopicListener((DdsTopicListener)newValue);
				return;
			case DdsMetamodelPackage.DDS_TOPIC__TOPIC_QOS_PROFILE:
				setTopicQosProfile((DdsTopicQosProfile)newValue);
				return;
			case DdsMetamodelPackage.DDS_TOPIC__DDSDATASTRUCTURE:
				setDdsdatastructure((DdsDataStructure)newValue);
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
			case DdsMetamodelPackage.DDS_TOPIC__TOPIC_NAME:
				setTopicName(TOPIC_NAME_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_TOPIC__TOPIC_LISTENER:
				setTopicListener((DdsTopicListener)null);
				return;
			case DdsMetamodelPackage.DDS_TOPIC__TOPIC_QOS_PROFILE:
				setTopicQosProfile((DdsTopicQosProfile)null);
				return;
			case DdsMetamodelPackage.DDS_TOPIC__DDSDATASTRUCTURE:
				setDdsdatastructure((DdsDataStructure)null);
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
			case DdsMetamodelPackage.DDS_TOPIC__TOPIC_NAME:
				return TOPIC_NAME_EDEFAULT == null ? topicName != null : !TOPIC_NAME_EDEFAULT.equals(topicName);
			case DdsMetamodelPackage.DDS_TOPIC__TOPIC_LISTENER:
				return topicListener != null;
			case DdsMetamodelPackage.DDS_TOPIC__TOPIC_QOS_PROFILE:
				return topicQosProfile != null;
			case DdsMetamodelPackage.DDS_TOPIC__DDSDATASTRUCTURE:
				return ddsdatastructure != null;
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
		result.append(" (topicName: ");
		result.append(topicName);
		result.append(')');
		return result.toString();
	}

} //DdsTopicImpl
