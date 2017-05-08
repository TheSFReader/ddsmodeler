/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDataReaderLifecycleQos;
import ddsMetamodel.DdsDuration;
import ddsMetamodel.DdsMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Data Reader Lifecycle Qos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderLifecycleQosImpl#getAutopurge_nowriters_samples_delay <em>Autopurge nowriters samples delay</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderLifecycleQosImpl#getAutopurge_disposed_samples_delay <em>Autopurge disposed samples delay</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderLifecycleQosImpl#isAutopurge_dispose_all <em>Autopurge dispose all</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataReaderLifecycleQosImpl#isEnable_invalid_samples <em>Enable invalid samples</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsDataReaderLifecycleQosImpl extends MinimalEObjectImpl.Container implements DdsDataReaderLifecycleQos {
	/**
	 * The cached value of the '{@link #getAutopurge_nowriters_samples_delay() <em>Autopurge nowriters samples delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutopurge_nowriters_samples_delay()
	 * @generated
	 * @ordered
	 */
	protected DdsDuration autopurge_nowriters_samples_delay;

	/**
	 * The cached value of the '{@link #getAutopurge_disposed_samples_delay() <em>Autopurge disposed samples delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutopurge_disposed_samples_delay()
	 * @generated
	 * @ordered
	 */
	protected DdsDuration autopurge_disposed_samples_delay;

	/**
	 * The default value of the '{@link #isAutopurge_dispose_all() <em>Autopurge dispose all</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutopurge_dispose_all()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOPURGE_DISPOSE_ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutopurge_dispose_all() <em>Autopurge dispose all</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutopurge_dispose_all()
	 * @generated
	 * @ordered
	 */
	protected boolean autopurge_dispose_all = AUTOPURGE_DISPOSE_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnable_invalid_samples() <em>Enable invalid samples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnable_invalid_samples()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_INVALID_SAMPLES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnable_invalid_samples() <em>Enable invalid samples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnable_invalid_samples()
	 * @generated
	 * @ordered
	 */
	protected boolean enable_invalid_samples = ENABLE_INVALID_SAMPLES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsDataReaderLifecycleQosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_DATA_READER_LIFECYCLE_QOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDuration getAutopurge_nowriters_samples_delay() {
		return autopurge_nowriters_samples_delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutopurge_nowriters_samples_delay(DdsDuration newAutopurge_nowriters_samples_delay, NotificationChain msgs) {
		DdsDuration oldAutopurge_nowriters_samples_delay = autopurge_nowriters_samples_delay;
		autopurge_nowriters_samples_delay = newAutopurge_nowriters_samples_delay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_NOWRITERS_SAMPLES_DELAY, oldAutopurge_nowriters_samples_delay, newAutopurge_nowriters_samples_delay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutopurge_nowriters_samples_delay(DdsDuration newAutopurge_nowriters_samples_delay) {
		if (newAutopurge_nowriters_samples_delay != autopurge_nowriters_samples_delay) {
			NotificationChain msgs = null;
			if (autopurge_nowriters_samples_delay != null)
				msgs = ((InternalEObject)autopurge_nowriters_samples_delay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_NOWRITERS_SAMPLES_DELAY, null, msgs);
			if (newAutopurge_nowriters_samples_delay != null)
				msgs = ((InternalEObject)newAutopurge_nowriters_samples_delay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_NOWRITERS_SAMPLES_DELAY, null, msgs);
			msgs = basicSetAutopurge_nowriters_samples_delay(newAutopurge_nowriters_samples_delay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_NOWRITERS_SAMPLES_DELAY, newAutopurge_nowriters_samples_delay, newAutopurge_nowriters_samples_delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDuration getAutopurge_disposed_samples_delay() {
		return autopurge_disposed_samples_delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutopurge_disposed_samples_delay(DdsDuration newAutopurge_disposed_samples_delay, NotificationChain msgs) {
		DdsDuration oldAutopurge_disposed_samples_delay = autopurge_disposed_samples_delay;
		autopurge_disposed_samples_delay = newAutopurge_disposed_samples_delay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSED_SAMPLES_DELAY, oldAutopurge_disposed_samples_delay, newAutopurge_disposed_samples_delay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutopurge_disposed_samples_delay(DdsDuration newAutopurge_disposed_samples_delay) {
		if (newAutopurge_disposed_samples_delay != autopurge_disposed_samples_delay) {
			NotificationChain msgs = null;
			if (autopurge_disposed_samples_delay != null)
				msgs = ((InternalEObject)autopurge_disposed_samples_delay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSED_SAMPLES_DELAY, null, msgs);
			if (newAutopurge_disposed_samples_delay != null)
				msgs = ((InternalEObject)newAutopurge_disposed_samples_delay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSED_SAMPLES_DELAY, null, msgs);
			msgs = basicSetAutopurge_disposed_samples_delay(newAutopurge_disposed_samples_delay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSED_SAMPLES_DELAY, newAutopurge_disposed_samples_delay, newAutopurge_disposed_samples_delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutopurge_dispose_all() {
		return autopurge_dispose_all;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutopurge_dispose_all(boolean newAutopurge_dispose_all) {
		boolean oldAutopurge_dispose_all = autopurge_dispose_all;
		autopurge_dispose_all = newAutopurge_dispose_all;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSE_ALL, oldAutopurge_dispose_all, autopurge_dispose_all));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnable_invalid_samples() {
		return enable_invalid_samples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnable_invalid_samples(boolean newEnable_invalid_samples) {
		boolean oldEnable_invalid_samples = enable_invalid_samples;
		enable_invalid_samples = newEnable_invalid_samples;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__ENABLE_INVALID_SAMPLES, oldEnable_invalid_samples, enable_invalid_samples));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_NOWRITERS_SAMPLES_DELAY:
				return basicSetAutopurge_nowriters_samples_delay(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSED_SAMPLES_DELAY:
				return basicSetAutopurge_disposed_samples_delay(null, msgs);
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
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_NOWRITERS_SAMPLES_DELAY:
				return getAutopurge_nowriters_samples_delay();
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSED_SAMPLES_DELAY:
				return getAutopurge_disposed_samples_delay();
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSE_ALL:
				return isAutopurge_dispose_all();
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__ENABLE_INVALID_SAMPLES:
				return isEnable_invalid_samples();
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
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_NOWRITERS_SAMPLES_DELAY:
				setAutopurge_nowriters_samples_delay((DdsDuration)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSED_SAMPLES_DELAY:
				setAutopurge_disposed_samples_delay((DdsDuration)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSE_ALL:
				setAutopurge_dispose_all((Boolean)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__ENABLE_INVALID_SAMPLES:
				setEnable_invalid_samples((Boolean)newValue);
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
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_NOWRITERS_SAMPLES_DELAY:
				setAutopurge_nowriters_samples_delay((DdsDuration)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSED_SAMPLES_DELAY:
				setAutopurge_disposed_samples_delay((DdsDuration)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSE_ALL:
				setAutopurge_dispose_all(AUTOPURGE_DISPOSE_ALL_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__ENABLE_INVALID_SAMPLES:
				setEnable_invalid_samples(ENABLE_INVALID_SAMPLES_EDEFAULT);
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
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_NOWRITERS_SAMPLES_DELAY:
				return autopurge_nowriters_samples_delay != null;
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSED_SAMPLES_DELAY:
				return autopurge_disposed_samples_delay != null;
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__AUTOPURGE_DISPOSE_ALL:
				return autopurge_dispose_all != AUTOPURGE_DISPOSE_ALL_EDEFAULT;
			case DdsMetamodelPackage.DDS_DATA_READER_LIFECYCLE_QOS__ENABLE_INVALID_SAMPLES:
				return enable_invalid_samples != ENABLE_INVALID_SAMPLES_EDEFAULT;
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
		result.append(" (autopurge_dispose_all: ");
		result.append(autopurge_dispose_all);
		result.append(", enable_invalid_samples: ");
		result.append(enable_invalid_samples);
		result.append(')');
		return result.toString();
	}

} //DdsDataReaderLifecycleQosImpl
