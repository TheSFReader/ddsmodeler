/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDataReader;
import ddsMetamodel.DdsDataReaderListener;
import ddsMetamodel.DdsDataReaderQosProfile;
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
 * An implementation of the model object '<em><b>Dds Data Reader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderImpl#getDataReaderName <em>Data Reader Name</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderImpl#getReadableTopic <em>Readable Topic</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderImpl#getDataReaderListener <em>Data Reader Listener</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderImpl#getDataReaderQosProfile <em>Data Reader Qos Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsDataReaderImpl extends MinimalEObjectImpl.Container implements DdsDataReader {
	/**
	 * The default value of the '{@link #getDataReaderName() <em>Data Reader Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataReaderName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_READER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataReaderName() <em>Data Reader Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataReaderName()
	 * @generated
	 * @ordered
	 */
	protected String dataReaderName = DATA_READER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReadableTopic() <em>Readable Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadableTopic()
	 * @generated
	 * @ordered
	 */
	protected DdsTopic readableTopic;

	/**
	 * The cached value of the '{@link #getDataReaderListener() <em>Data Reader Listener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataReaderListener()
	 * @generated
	 * @ordered
	 */
	protected DdsDataReaderListener dataReaderListener;

	/**
	 * The cached value of the '{@link #getDataReaderQosProfile() <em>Data Reader Qos Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataReaderQosProfile()
	 * @generated
	 * @ordered
	 */
	protected DdsDataReaderQosProfile dataReaderQosProfile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsDataReaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_DATA_READER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataReaderName() {
		return dataReaderName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataReaderName(String newDataReaderName) {
		String oldDataReaderName = dataReaderName;
		dataReaderName = newDataReaderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_NAME, oldDataReaderName, dataReaderName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTopic getReadableTopic() {
		if (readableTopic != null && readableTopic.eIsProxy()) {
			InternalEObject oldReadableTopic = (InternalEObject)readableTopic;
			readableTopic = (DdsTopic)eResolveProxy(oldReadableTopic);
			if (readableTopic != oldReadableTopic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsMetamodelPackage.DDS_DATA_READER__READABLE_TOPIC, oldReadableTopic, readableTopic));
			}
		}
		return readableTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsTopic basicGetReadableTopic() {
		return readableTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadableTopic(DdsTopic newReadableTopic) {
		DdsTopic oldReadableTopic = readableTopic;
		readableTopic = newReadableTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER__READABLE_TOPIC, oldReadableTopic, readableTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataReaderListener getDataReaderListener() {
		return dataReaderListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataReaderListener(DdsDataReaderListener newDataReaderListener, NotificationChain msgs) {
		DdsDataReaderListener oldDataReaderListener = dataReaderListener;
		dataReaderListener = newDataReaderListener;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_LISTENER, oldDataReaderListener, newDataReaderListener);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataReaderListener(DdsDataReaderListener newDataReaderListener) {
		if (newDataReaderListener != dataReaderListener) {
			NotificationChain msgs = null;
			if (dataReaderListener != null)
				msgs = ((InternalEObject)dataReaderListener).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_LISTENER, null, msgs);
			if (newDataReaderListener != null)
				msgs = ((InternalEObject)newDataReaderListener).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_LISTENER, null, msgs);
			msgs = basicSetDataReaderListener(newDataReaderListener, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_LISTENER, newDataReaderListener, newDataReaderListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataReaderQosProfile getDataReaderQosProfile() {
		if (dataReaderQosProfile != null && dataReaderQosProfile.eIsProxy()) {
			InternalEObject oldDataReaderQosProfile = (InternalEObject)dataReaderQosProfile;
			dataReaderQosProfile = (DdsDataReaderQosProfile)eResolveProxy(oldDataReaderQosProfile);
			if (dataReaderQosProfile != oldDataReaderQosProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_QOS_PROFILE, oldDataReaderQosProfile, dataReaderQosProfile));
			}
		}
		return dataReaderQosProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataReaderQosProfile basicGetDataReaderQosProfile() {
		return dataReaderQosProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataReaderQosProfile(DdsDataReaderQosProfile newDataReaderQosProfile) {
		DdsDataReaderQosProfile oldDataReaderQosProfile = dataReaderQosProfile;
		dataReaderQosProfile = newDataReaderQosProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_QOS_PROFILE, oldDataReaderQosProfile, dataReaderQosProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_LISTENER:
				return basicSetDataReaderListener(null, msgs);
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
			case DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_NAME:
				return getDataReaderName();
			case DdsMetamodelPackage.DDS_DATA_READER__READABLE_TOPIC:
				if (resolve) return getReadableTopic();
				return basicGetReadableTopic();
			case DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_LISTENER:
				return getDataReaderListener();
			case DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_QOS_PROFILE:
				if (resolve) return getDataReaderQosProfile();
				return basicGetDataReaderQosProfile();
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
			case DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_NAME:
				setDataReaderName((String)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER__READABLE_TOPIC:
				setReadableTopic((DdsTopic)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_LISTENER:
				setDataReaderListener((DdsDataReaderListener)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_QOS_PROFILE:
				setDataReaderQosProfile((DdsDataReaderQosProfile)newValue);
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
			case DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_NAME:
				setDataReaderName(DATA_READER_NAME_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER__READABLE_TOPIC:
				setReadableTopic((DdsTopic)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_LISTENER:
				setDataReaderListener((DdsDataReaderListener)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_QOS_PROFILE:
				setDataReaderQosProfile((DdsDataReaderQosProfile)null);
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
			case DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_NAME:
				return DATA_READER_NAME_EDEFAULT == null ? dataReaderName != null : !DATA_READER_NAME_EDEFAULT.equals(dataReaderName);
			case DdsMetamodelPackage.DDS_DATA_READER__READABLE_TOPIC:
				return readableTopic != null;
			case DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_LISTENER:
				return dataReaderListener != null;
			case DdsMetamodelPackage.DDS_DATA_READER__DATA_READER_QOS_PROFILE:
				return dataReaderQosProfile != null;
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
		result.append(" (dataReaderName: ");
		result.append(dataReaderName);
		result.append(')');
		return result.toString();
	}

} //DdsDataReaderImpl
