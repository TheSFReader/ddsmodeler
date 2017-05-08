/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDataWriter;
import ddsMetamodel.DdsDataWriterListener;
import ddsMetamodel.DdsDataWriterQosProfile;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsTopic;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Data Writer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterImpl#getDataWriterName <em>Data Writer Name</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterImpl#getPubliableTopic <em>Publiable Topic</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterImpl#getDataWriterListener <em>Data Writer Listener</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterImpl#getDataWriterQosProfile <em>Data Writer Qos Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsDataWriterImpl extends MinimalEObjectImpl.Container implements DdsDataWriter {
	/**
	 * The default value of the '{@link #getDataWriterName() <em>Data Writer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataWriterName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_WRITER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataWriterName() <em>Data Writer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataWriterName()
	 * @generated
	 * @ordered
	 */
	protected String dataWriterName = DATA_WRITER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPubliableTopic() <em>Publiable Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubliableTopic()
	 * @generated
	 * @ordered
	 */
	protected DdsTopic publiableTopic;

	/**
	 * The cached value of the '{@link #getDataWriterListener() <em>Data Writer Listener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataWriterListener()
	 * @generated
	 * @ordered
	 */
	protected DdsDataWriterListener dataWriterListener;

	/**
	 * The cached value of the '{@link #getDataWriterQosProfile() <em>Data Writer Qos Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataWriterQosProfile()
	 * @generated
	 * @ordered
	 */
	protected DdsDataWriterQosProfile dataWriterQosProfile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsDataWriterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_DATA_WRITER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataWriterName() {
		return dataWriterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataWriterName(String newDataWriterName) {
		String oldDataWriterName = dataWriterName;
		dataWriterName = newDataWriterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_NAME, oldDataWriterName, dataWriterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTopic getPubliableTopic() {
		if (publiableTopic != null && publiableTopic.eIsProxy()) {
			InternalEObject oldPubliableTopic = (InternalEObject)publiableTopic;
			publiableTopic = (DdsTopic)eResolveProxy(oldPubliableTopic);
			if (publiableTopic != oldPubliableTopic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsMetamodelPackage.DDS_DATA_WRITER__PUBLIABLE_TOPIC, oldPubliableTopic, publiableTopic));
			}
		}
		return publiableTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTopic basicGetPubliableTopic() {
		return publiableTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPubliableTopic(DdsTopic newPubliableTopic) {
		DdsTopic oldPubliableTopic = publiableTopic;
		publiableTopic = newPubliableTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER__PUBLIABLE_TOPIC, oldPubliableTopic, publiableTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataWriterListener getDataWriterListener() {
		return dataWriterListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataWriterListener(DdsDataWriterListener newDataWriterListener, NotificationChain msgs) {
		DdsDataWriterListener oldDataWriterListener = dataWriterListener;
		dataWriterListener = newDataWriterListener;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_LISTENER, oldDataWriterListener, newDataWriterListener);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataWriterListener(DdsDataWriterListener newDataWriterListener) {
		if (newDataWriterListener != dataWriterListener) {
			NotificationChain msgs = null;
			if (dataWriterListener != null)
				msgs = ((InternalEObject)dataWriterListener).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_LISTENER, null, msgs);
			if (newDataWriterListener != null)
				msgs = ((InternalEObject)newDataWriterListener).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_LISTENER, null, msgs);
			msgs = basicSetDataWriterListener(newDataWriterListener, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_LISTENER, newDataWriterListener, newDataWriterListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataWriterQosProfile getDataWriterQosProfile() {
		if (dataWriterQosProfile != null && dataWriterQosProfile.eIsProxy()) {
			InternalEObject oldDataWriterQosProfile = (InternalEObject)dataWriterQosProfile;
			dataWriterQosProfile = (DdsDataWriterQosProfile)eResolveProxy(oldDataWriterQosProfile);
			if (dataWriterQosProfile != oldDataWriterQosProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_QOS_PROFILE, oldDataWriterQosProfile, dataWriterQosProfile));
			}
		}
		return dataWriterQosProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataWriterQosProfile basicGetDataWriterQosProfile() {
		return dataWriterQosProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataWriterQosProfile(DdsDataWriterQosProfile newDataWriterQosProfile) {
		DdsDataWriterQosProfile oldDataWriterQosProfile = dataWriterQosProfile;
		dataWriterQosProfile = newDataWriterQosProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_QOS_PROFILE, oldDataWriterQosProfile, dataWriterQosProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_LISTENER:
				return basicSetDataWriterListener(null, msgs);
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
			case DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_NAME:
				return getDataWriterName();
			case DdsMetamodelPackage.DDS_DATA_WRITER__PUBLIABLE_TOPIC:
				if (resolve) return getPubliableTopic();
				return basicGetPubliableTopic();
			case DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_LISTENER:
				return getDataWriterListener();
			case DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_QOS_PROFILE:
				if (resolve) return getDataWriterQosProfile();
				return basicGetDataWriterQosProfile();
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
			case DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_NAME:
				setDataWriterName((String)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER__PUBLIABLE_TOPIC:
				setPubliableTopic((DdsTopic)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_LISTENER:
				setDataWriterListener((DdsDataWriterListener)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_QOS_PROFILE:
				setDataWriterQosProfile((DdsDataWriterQosProfile)newValue);
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
			case DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_NAME:
				setDataWriterName(DATA_WRITER_NAME_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER__PUBLIABLE_TOPIC:
				setPubliableTopic((DdsTopic)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_LISTENER:
				setDataWriterListener((DdsDataWriterListener)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_QOS_PROFILE:
				setDataWriterQosProfile((DdsDataWriterQosProfile)null);
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
			case DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_NAME:
				return DATA_WRITER_NAME_EDEFAULT == null ? dataWriterName != null : !DATA_WRITER_NAME_EDEFAULT.equals(dataWriterName);
			case DdsMetamodelPackage.DDS_DATA_WRITER__PUBLIABLE_TOPIC:
				return publiableTopic != null;
			case DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_LISTENER:
				return dataWriterListener != null;
			case DdsMetamodelPackage.DDS_DATA_WRITER__DATA_WRITER_QOS_PROFILE:
				return dataWriterQosProfile != null;
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
		result.append(" (dataWriterName: ");
		result.append(dataWriterName);
		result.append(')');
		return result.toString();
	}

} //DdsDataWriterImpl
