/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudprofilePackage;

import org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.impl.CloudprofilePackageImpl;

import org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud;
import org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceenvironmentcloudFactory;
import org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceenvironmentcloudPackage;

import org.palladiosimulator.pcm.compositionprivacy.CompositionPrivacyPackage;

import org.palladiosimulator.pcm.resourceenvironmentprivacy.ResourceenvironmentPrivacyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceenvironmentcloudPackageImpl extends EPackageImpl implements ResourceenvironmentcloudPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceContainerCloudEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceenvironmentcloudPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResourceenvironmentcloudPackageImpl() {
		super(eNS_URI, ResourceenvironmentcloudFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ResourceenvironmentcloudPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResourceenvironmentcloudPackage init() {
		if (isInited) return (ResourceenvironmentcloudPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentcloudPackage.eNS_URI);

		// Obtain or create and register package
		ResourceenvironmentcloudPackageImpl theResourceenvironmentcloudPackage = (ResourceenvironmentcloudPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResourceenvironmentcloudPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ResourceenvironmentcloudPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ResourceenvironmentPrivacyPackage.eINSTANCE.eClass();
		CompositionPrivacyPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CloudprofilePackageImpl theCloudprofilePackage = (CloudprofilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CloudprofilePackage.eNS_URI) instanceof CloudprofilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CloudprofilePackage.eNS_URI) : CloudprofilePackage.eINSTANCE);

		// Create package meta-data objects
		theResourceenvironmentcloudPackage.createPackageContents();
		theCloudprofilePackage.createPackageContents();

		// Initialize created meta-data
		theResourceenvironmentcloudPackage.initializePackageContents();
		theCloudprofilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResourceenvironmentcloudPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResourceenvironmentcloudPackage.eNS_URI, theResourceenvironmentcloudPackage);
		return theResourceenvironmentcloudPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceContainerCloud() {
		return resourceContainerCloudEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceContainerCloud_ExternalAddress() {
		return (EAttribute)resourceContainerCloudEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceContainerCloud_Username() {
		return (EAttribute)resourceContainerCloudEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceContainerCloud_Password() {
		return (EAttribute)resourceContainerCloudEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceContainerCloud_ManagementAddress() {
		return (EAttribute)resourceContainerCloudEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceContainerCloud_GroupName() {
		return (EAttribute)resourceContainerCloudEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainerCloud_InstanceType() {
		return (EReference)resourceContainerCloudEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceenvironmentcloudFactory getResourceenvironmentcloudFactory() {
		return (ResourceenvironmentcloudFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resourceContainerCloudEClass = createEClass(RESOURCE_CONTAINER_CLOUD);
		createEAttribute(resourceContainerCloudEClass, RESOURCE_CONTAINER_CLOUD__EXTERNAL_ADDRESS);
		createEAttribute(resourceContainerCloudEClass, RESOURCE_CONTAINER_CLOUD__USERNAME);
		createEAttribute(resourceContainerCloudEClass, RESOURCE_CONTAINER_CLOUD__PASSWORD);
		createEAttribute(resourceContainerCloudEClass, RESOURCE_CONTAINER_CLOUD__MANAGEMENT_ADDRESS);
		createEAttribute(resourceContainerCloudEClass, RESOURCE_CONTAINER_CLOUD__GROUP_NAME);
		createEReference(resourceContainerCloudEClass, RESOURCE_CONTAINER_CLOUD__INSTANCE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ResourceenvironmentPrivacyPackage theResourceenvironmentPrivacyPackage = (ResourceenvironmentPrivacyPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPrivacyPackage.eNS_URI);
		CloudprofilePackage theCloudprofilePackage = (CloudprofilePackage)EPackage.Registry.INSTANCE.getEPackage(CloudprofilePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		resourceContainerCloudEClass.getESuperTypes().add(theResourceenvironmentPrivacyPackage.getResourceContainerPrivacy());

		// Initialize classes and features; add operations and parameters
		initEClass(resourceContainerCloudEClass, ResourceContainerCloud.class, "ResourceContainerCloud", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceContainerCloud_ExternalAddress(), ecorePackage.getEString(), "externalAddress", null, 0, 1, ResourceContainerCloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceContainerCloud_Username(), ecorePackage.getEString(), "username", null, 0, 1, ResourceContainerCloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceContainerCloud_Password(), ecorePackage.getEString(), "password", null, 0, 1, ResourceContainerCloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceContainerCloud_ManagementAddress(), ecorePackage.getEString(), "managementAddress", null, 0, 1, ResourceContainerCloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceContainerCloud_GroupName(), ecorePackage.getEString(), "groupName", null, 0, 1, ResourceContainerCloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceContainerCloud_InstanceType(), theCloudprofilePackage.getVMType(), null, "instanceType", null, 0, 1, ResourceContainerCloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ResourceenvironmentcloudPackageImpl
