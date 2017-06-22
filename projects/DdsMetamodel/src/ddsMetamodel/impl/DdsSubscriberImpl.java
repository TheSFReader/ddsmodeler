/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDataReader;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsSubscriber;
import ddsMetamodel.DdsSubscriberListener;
import ddsMetamodel.DdsSubscriberQosProfile;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Subscriber</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsSubscriberImpl#getSubscriberName <em>Subscriber Name</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsSubscriberImpl#getDdsdatareader <em>Ddsdatareader</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsSubscriberImpl#getSubscriberListener <em>Subscriber Listener</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsSubscriberImpl#getSubscriberQosProfile <em>Subscriber Qos Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsSubscriberImpl extends MinimalEObjectImpl.Container implements DdsSubscriber {
	/**
	 * The default value of the '{@link #getSubscriberName() <em>Subscriber Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriberName() <em>Subscriber Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberName()
	 * @generated
	 * @ordered
	 */
	protected String subscriberName = SUBSCRIBER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDdsdatareader() <em>Ddsdatareader</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdsdatareader()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsDataReader> ddsdatareader;

	/**
	 * The cached value of the '{@link #getSubscriberListener() <em>Subscriber Listener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberListener()
	 * @generated
	 * @ordered
	 */
	protected DdsSubscriberListener subscriberListener;

	/**
	 * The cached value of the '{@link #getSubscriberQosProfile() <em>Subscriber Qos Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberQosProfile()
	 * @generated
	 * @ordered
	 */
	protected DdsSubscriberQosProfile subscriberQosProfile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsSubscriberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_SUBSCRIBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscriberName() {
		return subscriberName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriberName(String newSubscriberName) {
		String oldSubscriberName = subscriberName;
		subscriberName = newSubscriberName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_NAME, oldSubscriberName, subscriberName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsDataReader> getDdsdatareader() {
		if (ddsdatareader == null) {
			ddsdatareader = new EObjectContainmentWithInverseEList<DdsDataReader>(DdsDataReader.class, this, DdsMetamodelPackage.DDS_SUBSCRIBER__DDSDATAREADER, DdsMetamodelPackage.DDS_DATA_READER__CONTAINING_SUBSCRIBER);
		}
		return ddsdatareader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsSubscriberListener getSubscriberListener() {
		return subscriberListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriberListener(DdsSubscriberListener newSubscriberListener, NotificationChain msgs) {
		DdsSubscriberListener oldSubscriberListener = subscriberListener;
		subscriberListener = newSubscriberListener;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_LISTENER, oldSubscriberListener, newSubscriberListener);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriberListener(DdsSubscriberListener newSubscriberListener) {
		if (newSubscriberListener != subscriberListener) {
			NotificationChain msgs = null;
			if (subscriberListener != null)
				msgs = ((InternalEObject)subscriberListener).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_LISTENER, null, msgs);
			if (newSubscriberListener != null)
				msgs = ((InternalEObject)newSubscriberListener).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_LISTENER, null, msgs);
			msgs = basicSetSubscriberListener(newSubscriberListener, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_LISTENER, newSubscriberListener, newSubscriberListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsSubscriberQosProfile getSubscriberQosProfile() {
		if (subscriberQosProfile != null && subscriberQosProfile.eIsProxy()) {
			InternalEObject oldSubscriberQosProfile = (InternalEObject)subscriberQosProfile;
			subscriberQosProfile = (DdsSubscriberQosProfile)eResolveProxy(oldSubscriberQosProfile);
			if (subscriberQosProfile != oldSubscriberQosProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_QOS_PROFILE, oldSubscriberQosProfile, subscriberQosProfile));
			}
		}
		return subscriberQosProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsSubscriberQosProfile basicGetSubscriberQosProfile() {
		return subscriberQosProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriberQosProfile(DdsSubscriberQosProfile newSubscriberQosProfile) {
		DdsSubscriberQosProfile oldSubscriberQosProfile = subscriberQosProfile;
		subscriberQosProfile = newSubscriberQosProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_QOS_PROFILE, oldSubscriberQosProfile, subscriberQosProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_SUBSCRIBER__DDSDATAREADER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDdsdatareader()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_SUBSCRIBER__DDSDATAREADER:
				return ((InternalEList<?>)getDdsdatareader()).basicRemove(otherEnd, msgs);
			case DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_LISTENER:
				return basicSetSubscriberListener(null, msgs);
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
			case DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_NAME:
				return getSubscriberName();
			case DdsMetamodelPackage.DDS_SUBSCRIBER__DDSDATAREADER:
				return getDdsdatareader();
			case DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_LISTENER:
				return getSubscriberListener();
			case DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_QOS_PROFILE:
				if (resolve) return getSubscriberQosProfile();
				return basicGetSubscriberQosProfile();
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
			case DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_NAME:
				setSubscriberName((String)newValue);
				return;
			case DdsMetamodelPackage.DDS_SUBSCRIBER__DDSDATAREADER:
				getDdsdatareader().clear();
				getDdsdatareader().addAll((Collection<? extends DdsDataReader>)newValue);
				return;
			case DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_LISTENER:
				setSubscriberListener((DdsSubscriberListener)newValue);
				return;
			case DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_QOS_PROFILE:
				setSubscriberQosProfile((DdsSubscriberQosProfile)newValue);
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
			case DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_NAME:
				setSubscriberName(SUBSCRIBER_NAME_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_SUBSCRIBER__DDSDATAREADER:
				getDdsdatareader().clear();
				return;
			case DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_LISTENER:
				setSubscriberListener((DdsSubscriberListener)null);
				return;
			case DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_QOS_PROFILE:
				setSubscriberQosProfile((DdsSubscriberQosProfile)null);
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
			case DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_NAME:
				return SUBSCRIBER_NAME_EDEFAULT == null ? subscriberName != null : !SUBSCRIBER_NAME_EDEFAULT.equals(subscriberName);
			case DdsMetamodelPackage.DDS_SUBSCRIBER__DDSDATAREADER:
				return ddsdatareader != null && !ddsdatareader.isEmpty();
			case DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_LISTENER:
				return subscriberListener != null;
			case DdsMetamodelPackage.DDS_SUBSCRIBER__SUBSCRIBER_QOS_PROFILE:
				return subscriberQosProfile != null;
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
		result.append(" (subscriberName: ");
		result.append(subscriberName);
		result.append(')');
		return result.toString();
	}

} //DdsSubscriberImpl
