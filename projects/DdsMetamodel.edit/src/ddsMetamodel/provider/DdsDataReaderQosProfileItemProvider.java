/**
 */
package ddsMetamodel.provider;


import ddsMetamodel.DdsDataReaderQosProfile;
import ddsMetamodel.DdsMetamodelFactory;
import ddsMetamodel.DdsMetamodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ddsMetamodel.DdsDataReaderQosProfile} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DdsDataReaderQosProfileItemProvider extends DdsQosProfileItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataReaderQosProfileItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__USER_DATA_QOS);
			childrenFeatures.add(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__DURABILITY_QOS);
			childrenFeatures.add(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__DEADLINE_QOS);
			childrenFeatures.add(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__LATENCY_BUDGET_QOS);
			childrenFeatures.add(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__LIVELINESS_QOS);
			childrenFeatures.add(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__OWNERSHIP_QOS);
			childrenFeatures.add(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__TIME_BASED_FILTER_QOS);
			childrenFeatures.add(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__RELIABILITY_QOS);
			childrenFeatures.add(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__DESTINATION_ORDER_QOS);
			childrenFeatures.add(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__HISTORY_QOS);
			childrenFeatures.add(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__RESOURCE_LIMITS_QOS);
			childrenFeatures.add(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__DATA_READER_LIFECYCLE_QOS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DdsDataReaderQosProfile.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DdsDataReaderQosProfile"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DdsDataReaderQosProfile)object).getProfileName();
		return label == null || label.length() == 0 ?
			getString("_UI_DdsDataReaderQosProfile_type") :
			getString("_UI_DdsDataReaderQosProfile_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DdsDataReaderQosProfile.class)) {
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__USER_DATA_QOS:
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DURABILITY_QOS:
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DEADLINE_QOS:
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LATENCY_BUDGET_QOS:
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__LIVELINESS_QOS:
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__OWNERSHIP_QOS:
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__TIME_BASED_FILTER_QOS:
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RELIABILITY_QOS:
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DESTINATION_ORDER_QOS:
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__HISTORY_QOS:
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__RESOURCE_LIMITS_QOS:
			case DdsMetamodelPackage.DDS_DATA_READER_QOS_PROFILE__DATA_READER_LIFECYCLE_QOS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__USER_DATA_QOS,
				 DdsMetamodelFactory.eINSTANCE.createDdsUserDataQos()));

		newChildDescriptors.add
			(createChildParameter
				(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__DURABILITY_QOS,
				 DdsMetamodelFactory.eINSTANCE.createDdsDurabilityQos()));

		newChildDescriptors.add
			(createChildParameter
				(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__DEADLINE_QOS,
				 DdsMetamodelFactory.eINSTANCE.createDdsDeadlineQos()));

		newChildDescriptors.add
			(createChildParameter
				(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__LATENCY_BUDGET_QOS,
				 DdsMetamodelFactory.eINSTANCE.createDdsLatencyBudgetQos()));

		newChildDescriptors.add
			(createChildParameter
				(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__LIVELINESS_QOS,
				 DdsMetamodelFactory.eINSTANCE.createDdsLivelinessQos()));

		newChildDescriptors.add
			(createChildParameter
				(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__OWNERSHIP_QOS,
				 DdsMetamodelFactory.eINSTANCE.createDdsOwnershipQos()));

		newChildDescriptors.add
			(createChildParameter
				(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__TIME_BASED_FILTER_QOS,
				 DdsMetamodelFactory.eINSTANCE.createDdsTimeBasedFilterQos()));

		newChildDescriptors.add
			(createChildParameter
				(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__RELIABILITY_QOS,
				 DdsMetamodelFactory.eINSTANCE.createDdsReliabilityQos()));

		newChildDescriptors.add
			(createChildParameter
				(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__DESTINATION_ORDER_QOS,
				 DdsMetamodelFactory.eINSTANCE.createDdsDestinationOrderQos()));

		newChildDescriptors.add
			(createChildParameter
				(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__HISTORY_QOS,
				 DdsMetamodelFactory.eINSTANCE.createDdsHistoryQos()));

		newChildDescriptors.add
			(createChildParameter
				(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__RESOURCE_LIMITS_QOS,
				 DdsMetamodelFactory.eINSTANCE.createDdsResourceLimits()));

		newChildDescriptors.add
			(createChildParameter
				(DdsMetamodelPackage.Literals.DDS_DATA_READER_QOS_PROFILE__DATA_READER_LIFECYCLE_QOS,
				 DdsMetamodelFactory.eINSTANCE.createDdsDataReaderLifecycleQos()));
	}

}
