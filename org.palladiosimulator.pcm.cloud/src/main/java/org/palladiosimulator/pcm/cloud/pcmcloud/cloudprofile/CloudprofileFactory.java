/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudprofilePackage
 * @generated
 */
public interface CloudprofileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudprofileFactory eINSTANCE = org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.impl.CloudprofileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cloud Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Profile</em>'.
	 * @generated
	 */
	CloudProfile createCloudProfile();

	/**
	 * Returns a new object of class '<em>Cloud Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Provider</em>'.
	 * @generated
	 */
	CloudProvider createCloudProvider();

	/**
	 * Returns a new object of class '<em>VM Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM Type</em>'.
	 * @generated
	 */
	VMType createVMType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CloudprofilePackage getCloudprofilePackage();

} //CloudprofileFactory
