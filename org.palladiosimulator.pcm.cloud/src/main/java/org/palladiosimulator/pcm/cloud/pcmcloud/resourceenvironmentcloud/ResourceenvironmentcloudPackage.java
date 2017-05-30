/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.palladiosimulator.pcm.resourceenvironmentprivacy.ResourceenvironmentPrivacyPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Package of entities representing the execution environment of a component based software system. 
 * Enhanced by special properties relevant for cloud computing environments.
 * <!-- end-model-doc -->
 * @see org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceenvironmentcloudFactory
 * @model kind="package"
 * @generated
 */
public interface ResourceenvironmentcloudPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resourceenvironmentcloud";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/PalladioComponentModel/5.2/Cloud/ResourceEnvironment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.palladiosimulator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourceenvironmentcloudPackage eINSTANCE = org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.impl.ResourceenvironmentcloudPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.impl.ResourceContainerCloudImpl <em>Resource Container Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.impl.ResourceContainerCloudImpl
	 * @see org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.impl.ResourceenvironmentcloudPackageImpl#getResourceContainerCloud()
	 * @generated
	 */
	int RESOURCE_CONTAINER_CLOUD = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_CLOUD__ID = ResourceenvironmentPrivacyPackage.RESOURCE_CONTAINER_PRIVACY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_CLOUD__ENTITY_NAME = ResourceenvironmentPrivacyPackage.RESOURCE_CONTAINER_PRIVACY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Active Resource Specifications Resource Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_CLOUD__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER = ResourceenvironmentPrivacyPackage.RESOURCE_CONTAINER_PRIVACY__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Resource Environment Resource Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_CLOUD__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER = ResourceenvironmentPrivacyPackage.RESOURCE_CONTAINER_PRIVACY__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Nested Resource Containers Resource Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_CLOUD__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER = ResourceenvironmentPrivacyPackage.RESOURCE_CONTAINER_PRIVACY__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Parent Resource Container Resource Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_CLOUD__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER = ResourceenvironmentPrivacyPackage.RESOURCE_CONTAINER_PRIVACY__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Hdd Resource Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_CLOUD__HDD_RESOURCE_SPECIFICATIONS = ResourceenvironmentPrivacyPackage.RESOURCE_CONTAINER_PRIVACY__HDD_RESOURCE_SPECIFICATIONS;

	/**
	 * The feature id for the '<em><b>Geolocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_CLOUD__GEOLOCATION = ResourceenvironmentPrivacyPackage.RESOURCE_CONTAINER_PRIVACY__GEOLOCATION;

	/**
	 * The feature id for the '<em><b>Cloud Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_CLOUD__CLOUD_PROVIDER_NAME = ResourceenvironmentPrivacyPackage.RESOURCE_CONTAINER_PRIVACY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_CLOUD__LOCATION = ResourceenvironmentPrivacyPackage.RESOURCE_CONTAINER_PRIVACY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_CLOUD__EXTERNAL_ADDRESS = ResourceenvironmentPrivacyPackage.RESOURCE_CONTAINER_PRIVACY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_CLOUD__USERNAME = ResourceenvironmentPrivacyPackage.RESOURCE_CONTAINER_PRIVACY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_CLOUD__PASSWORD = ResourceenvironmentPrivacyPackage.RESOURCE_CONTAINER_PRIVACY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_CLOUD__INSTANCE_TYPE = ResourceenvironmentPrivacyPackage.RESOURCE_CONTAINER_PRIVACY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Management Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_CLOUD__MANAGEMENT_ADDRESS = ResourceenvironmentPrivacyPackage.RESOURCE_CONTAINER_PRIVACY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_CLOUD__GROUP_NAME = ResourceenvironmentPrivacyPackage.RESOURCE_CONTAINER_PRIVACY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Resource Container Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_CLOUD_FEATURE_COUNT = ResourceenvironmentPrivacyPackage.RESOURCE_CONTAINER_PRIVACY_FEATURE_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud <em>Resource Container Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Container Cloud</em>'.
	 * @see org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud
	 * @generated
	 */
	EClass getResourceContainerCloud();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud#getCloudProviderName <em>Cloud Provider Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Provider Name</em>'.
	 * @see org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud#getCloudProviderName()
	 * @see #getResourceContainerCloud()
	 * @generated
	 */
	EAttribute getResourceContainerCloud_CloudProviderName();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud#getLocation()
	 * @see #getResourceContainerCloud()
	 * @generated
	 */
	EAttribute getResourceContainerCloud_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud#getExternalAddress <em>External Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Address</em>'.
	 * @see org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud#getExternalAddress()
	 * @see #getResourceContainerCloud()
	 * @generated
	 */
	EAttribute getResourceContainerCloud_ExternalAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud#getUsername()
	 * @see #getResourceContainerCloud()
	 * @generated
	 */
	EAttribute getResourceContainerCloud_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud#getPassword()
	 * @see #getResourceContainerCloud()
	 * @generated
	 */
	EAttribute getResourceContainerCloud_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud#getInstanceType()
	 * @see #getResourceContainerCloud()
	 * @generated
	 */
	EAttribute getResourceContainerCloud_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud#getManagementAddress <em>Management Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Management Address</em>'.
	 * @see org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud#getManagementAddress()
	 * @see #getResourceContainerCloud()
	 * @generated
	 */
	EAttribute getResourceContainerCloud_ManagementAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud#getGroupName()
	 * @see #getResourceContainerCloud()
	 * @generated
	 */
	EAttribute getResourceContainerCloud_GroupName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourceenvironmentcloudFactory getResourceenvironmentcloudFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.impl.ResourceContainerCloudImpl <em>Resource Container Cloud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.impl.ResourceContainerCloudImpl
		 * @see org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.impl.ResourceenvironmentcloudPackageImpl#getResourceContainerCloud()
		 * @generated
		 */
		EClass RESOURCE_CONTAINER_CLOUD = eINSTANCE.getResourceContainerCloud();

		/**
		 * The meta object literal for the '<em><b>Cloud Provider Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTAINER_CLOUD__CLOUD_PROVIDER_NAME = eINSTANCE.getResourceContainerCloud_CloudProviderName();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTAINER_CLOUD__LOCATION = eINSTANCE.getResourceContainerCloud_Location();

		/**
		 * The meta object literal for the '<em><b>External Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTAINER_CLOUD__EXTERNAL_ADDRESS = eINSTANCE.getResourceContainerCloud_ExternalAddress();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTAINER_CLOUD__USERNAME = eINSTANCE.getResourceContainerCloud_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTAINER_CLOUD__PASSWORD = eINSTANCE.getResourceContainerCloud_Password();

		/**
		 * The meta object literal for the '<em><b>Instance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTAINER_CLOUD__INSTANCE_TYPE = eINSTANCE.getResourceContainerCloud_InstanceType();

		/**
		 * The meta object literal for the '<em><b>Management Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTAINER_CLOUD__MANAGEMENT_ADDRESS = eINSTANCE.getResourceContainerCloud_ManagementAddress();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTAINER_CLOUD__GROUP_NAME = eINSTANCE.getResourceContainerCloud_GroupName();

	}

} //ResourceenvironmentcloudPackage
