/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDataWriterLifecycleQos;
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
 * An implementation of the model object '<em><b>Dds Data Writer Lifecycle Qos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterLifecycleQosImpl#isAutodispose_unregistered_instances <em>Autodispose unregistered instances</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterLifecycleQosImpl#getAutopurge_suspended_samples_delay <em>Autopurge suspended samples delay</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDataWriterLifecycleQosImpl#getAutounregister_instance_delay <em>Autounregister instance delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsDataWriterLifecycleQosImpl extends MinimalEObjectImpl.Container implements DdsDataWriterLifecycleQos {
	/**
	 * The default value of the '{@link #isAutodispose_unregistered_instances() <em>Autodispose unregistered instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutodispose_unregistered_instances()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTODISPOSE_UNREGISTERED_INSTANCES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAutodispose_unregistered_instances() <em>Autodispose unregistered instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutodispose_unregistered_instances()
	 * @generated
	 * @ordered
	 */
	protected boolean autodispose_unregistered_instances = AUTODISPOSE_UNREGISTERED_INSTANCES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAutopurge_suspended_samples_delay() <em>Autopurge suspended samples delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutopurge_suspended_samples_delay()
	 * @generated
	 * @ordered
	 */
	protected DdsDuration autopurge_suspended_samples_delay;

	/**
	 * The cached value of the '{@link #getAutounregister_instance_delay() <em>Autounregister instance delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutounregister_instance_delay()
	 * @generated
	 * @ordered
	 */
	protected DdsDuration autounregister_instance_delay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsDataWriterLifecycleQosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_DATA_WRITER_LIFECYCLE_QOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutodispose_unregistered_instances() {
		return autodispose_unregistered_instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutodispose_unregistered_instances(boolean newAutodispose_unregistered_instances) {
		boolean oldAutodispose_unregistered_instances = autodispose_unregistered_instances;
		autodispose_unregistered_instances = newAutodispose_unregistered_instances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTODISPOSE_UNREGISTERED_INSTANCES, oldAutodispose_unregistered_instances, autodispose_unregistered_instances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDuration getAutopurge_suspended_samples_delay() {
		return autopurge_suspended_samples_delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutopurge_suspended_samples_delay(DdsDuration newAutopurge_suspended_samples_delay, NotificationChain msgs) {
		DdsDuration oldAutopurge_suspended_samples_delay = autopurge_suspended_samples_delay;
		autopurge_suspended_samples_delay = newAutopurge_suspended_samples_delay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOPURGE_SUSPENDED_SAMPLES_DELAY, oldAutopurge_suspended_samples_delay, newAutopurge_suspended_samples_delay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutopurge_suspended_samples_delay(DdsDuration newAutopurge_suspended_samples_delay) {
		if (newAutopurge_suspended_samples_delay != autopurge_suspended_samples_delay) {
			NotificationChain msgs = null;
			if (autopurge_suspended_samples_delay != null)
				msgs = ((InternalEObject)autopurge_suspended_samples_delay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOPURGE_SUSPENDED_SAMPLES_DELAY, null, msgs);
			if (newAutopurge_suspended_samples_delay != null)
				msgs = ((InternalEObject)newAutopurge_suspended_samples_delay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOPURGE_SUSPENDED_SAMPLES_DELAY, null, msgs);
			msgs = basicSetAutopurge_suspended_samples_delay(newAutopurge_suspended_samples_delay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOPURGE_SUSPENDED_SAMPLES_DELAY, newAutopurge_suspended_samples_delay, newAutopurge_suspended_samples_delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDuration getAutounregister_instance_delay() {
		return autounregister_instance_delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutounregister_instance_delay(DdsDuration newAutounregister_instance_delay, NotificationChain msgs) {
		DdsDuration oldAutounregister_instance_delay = autounregister_instance_delay;
		autounregister_instance_delay = newAutounregister_instance_delay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOUNREGISTER_INSTANCE_DELAY, oldAutounregister_instance_delay, newAutounregister_instance_delay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutounregister_instance_delay(DdsDuration newAutounregister_instance_delay) {
		if (newAutounregister_instance_delay != autounregister_instance_delay) {
			NotificationChain msgs = null;
			if (autounregister_instance_delay != null)
				msgs = ((InternalEObject)autounregister_instance_delay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOUNREGISTER_INSTANCE_DELAY, null, msgs);
			if (newAutounregister_instance_delay != null)
				msgs = ((InternalEObject)newAutounregister_instance_delay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOUNREGISTER_INSTANCE_DELAY, null, msgs);
			msgs = basicSetAutounregister_instance_delay(newAutounregister_instance_delay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOUNREGISTER_INSTANCE_DELAY, newAutounregister_instance_delay, newAutounregister_instance_delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOPURGE_SUSPENDED_SAMPLES_DELAY:
				return basicSetAutopurge_suspended_samples_delay(null, msgs);
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOUNREGISTER_INSTANCE_DELAY:
				return basicSetAutounregister_instance_delay(null, msgs);
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
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTODISPOSE_UNREGISTERED_INSTANCES:
				return isAutodispose_unregistered_instances();
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOPURGE_SUSPENDED_SAMPLES_DELAY:
				return getAutopurge_suspended_samples_delay();
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOUNREGISTER_INSTANCE_DELAY:
				return getAutounregister_instance_delay();
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
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTODISPOSE_UNREGISTERED_INSTANCES:
				setAutodispose_unregistered_instances((Boolean)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOPURGE_SUSPENDED_SAMPLES_DELAY:
				setAutopurge_suspended_samples_delay((DdsDuration)newValue);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOUNREGISTER_INSTANCE_DELAY:
				setAutounregister_instance_delay((DdsDuration)newValue);
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
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTODISPOSE_UNREGISTERED_INSTANCES:
				setAutodispose_unregistered_instances(AUTODISPOSE_UNREGISTERED_INSTANCES_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOPURGE_SUSPENDED_SAMPLES_DELAY:
				setAutopurge_suspended_samples_delay((DdsDuration)null);
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOUNREGISTER_INSTANCE_DELAY:
				setAutounregister_instance_delay((DdsDuration)null);
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
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTODISPOSE_UNREGISTERED_INSTANCES:
				return autodispose_unregistered_instances != AUTODISPOSE_UNREGISTERED_INSTANCES_EDEFAULT;
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOPURGE_SUSPENDED_SAMPLES_DELAY:
				return autopurge_suspended_samples_delay != null;
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOUNREGISTER_INSTANCE_DELAY:
				return autounregister_instance_delay != null;
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
		result.append(" (autodispose_unregistered_instances: ");
		result.append(autodispose_unregistered_instances);
		result.append(')');
		return result.toString();
	}

} //DdsDataWriterLifecycleQosImpl
