/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDataWriter;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsPublisher;
import ddsMetamodel.DdsPublisherListener;
import ddsMetamodel.DdsPublisherQosProfile;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsPublisherImpl#getPublisherName <em>Publisher Name</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsPublisherImpl#getDdsdatawriter <em>Ddsdatawriter</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsPublisherImpl#getPublisherListener <em>Publisher Listener</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsPublisherImpl#getPublisherQosProfile <em>Publisher Qos Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsPublisherImpl extends MinimalEObjectImpl.Container implements DdsPublisher {
	/**
	 * The default value of the '{@link #getPublisherName() <em>Publisher Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherName()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisherName() <em>Publisher Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherName()
	 * @generated
	 * @ordered
	 */
	protected String publisherName = PUBLISHER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDdsdatawriter() <em>Ddsdatawriter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdsdatawriter()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsDataWriter> ddsdatawriter;

	/**
	 * The cached value of the '{@link #getPublisherListener() <em>Publisher Listener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherListener()
	 * @generated
	 * @ordered
	 */
	protected DdsPublisherListener publisherListener;

	/**
	 * The cached value of the '{@link #getPublisherQosProfile() <em>Publisher Qos Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherQosProfile()
	 * @generated
	 * @ordered
	 */
	protected DdsPublisherQosProfile publisherQosProfile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsPublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_PUBLISHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublisherName() {
		return publisherName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherName(String newPublisherName) {
		String oldPublisherName = publisherName;
		publisherName = newPublisherName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_NAME, oldPublisherName, publisherName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsDataWriter> getDdsdatawriter() {
		if (ddsdatawriter == null) {
			ddsdatawriter = new EObjectContainmentEList<DdsDataWriter>(DdsDataWriter.class, this, DdsMetamodelPackage.DDS_PUBLISHER__DDSDATAWRITER);
		}
		return ddsdatawriter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsPublisherListener getPublisherListener() {
		return publisherListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisherListener(DdsPublisherListener newPublisherListener, NotificationChain msgs) {
		DdsPublisherListener oldPublisherListener = publisherListener;
		publisherListener = newPublisherListener;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_LISTENER, oldPublisherListener, newPublisherListener);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherListener(DdsPublisherListener newPublisherListener) {
		if (newPublisherListener != publisherListener) {
			NotificationChain msgs = null;
			if (publisherListener != null)
				msgs = ((InternalEObject)publisherListener).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_LISTENER, null, msgs);
			if (newPublisherListener != null)
				msgs = ((InternalEObject)newPublisherListener).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_LISTENER, null, msgs);
			msgs = basicSetPublisherListener(newPublisherListener, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_LISTENER, newPublisherListener, newPublisherListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsPublisherQosProfile getPublisherQosProfile() {
		if (publisherQosProfile != null && publisherQosProfile.eIsProxy()) {
			InternalEObject oldPublisherQosProfile = (InternalEObject)publisherQosProfile;
			publisherQosProfile = (DdsPublisherQosProfile)eResolveProxy(oldPublisherQosProfile);
			if (publisherQosProfile != oldPublisherQosProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_QOS_PROFILE, oldPublisherQosProfile, publisherQosProfile));
			}
		}
		return publisherQosProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsPublisherQosProfile basicGetPublisherQosProfile() {
		return publisherQosProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherQosProfile(DdsPublisherQosProfile newPublisherQosProfile) {
		DdsPublisherQosProfile oldPublisherQosProfile = publisherQosProfile;
		publisherQosProfile = newPublisherQosProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_QOS_PROFILE, oldPublisherQosProfile, publisherQosProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_PUBLISHER__DDSDATAWRITER:
				return ((InternalEList<?>)getDdsdatawriter()).basicRemove(otherEnd, msgs);
			case DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_LISTENER:
				return basicSetPublisherListener(null, msgs);
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
			case DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_NAME:
				return getPublisherName();
			case DdsMetamodelPackage.DDS_PUBLISHER__DDSDATAWRITER:
				return getDdsdatawriter();
			case DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_LISTENER:
				return getPublisherListener();
			case DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_QOS_PROFILE:
				if (resolve) return getPublisherQosProfile();
				return basicGetPublisherQosProfile();
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
			case DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_NAME:
				setPublisherName((String)newValue);
				return;
			case DdsMetamodelPackage.DDS_PUBLISHER__DDSDATAWRITER:
				getDdsdatawriter().clear();
				getDdsdatawriter().addAll((Collection<? extends DdsDataWriter>)newValue);
				return;
			case DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_LISTENER:
				setPublisherListener((DdsPublisherListener)newValue);
				return;
			case DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_QOS_PROFILE:
				setPublisherQosProfile((DdsPublisherQosProfile)newValue);
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
			case DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_NAME:
				setPublisherName(PUBLISHER_NAME_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_PUBLISHER__DDSDATAWRITER:
				getDdsdatawriter().clear();
				return;
			case DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_LISTENER:
				setPublisherListener((DdsPublisherListener)null);
				return;
			case DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_QOS_PROFILE:
				setPublisherQosProfile((DdsPublisherQosProfile)null);
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
			case DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_NAME:
				return PUBLISHER_NAME_EDEFAULT == null ? publisherName != null : !PUBLISHER_NAME_EDEFAULT.equals(publisherName);
			case DdsMetamodelPackage.DDS_PUBLISHER__DDSDATAWRITER:
				return ddsdatawriter != null && !ddsdatawriter.isEmpty();
			case DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_LISTENER:
				return publisherListener != null;
			case DdsMetamodelPackage.DDS_PUBLISHER__PUBLISHER_QOS_PROFILE:
				return publisherQosProfile != null;
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
		result.append(" (publisherName: ");
		result.append(publisherName);
		result.append(')');
		return result.toString();
	}

} //DdsPublisherImpl
