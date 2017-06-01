/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceenvironmentcloudPackage
 * @generated
 */
public interface ResourceenvironmentcloudFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourceenvironmentcloudFactory eINSTANCE = org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.impl.ResourceenvironmentcloudFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource Container Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Container Cloud</em>'.
	 * @generated
	 */
	ResourceContainerCloud createResourceContainerCloud();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourceenvironmentcloudPackage getResourceenvironmentcloudPackage();

} //ResourceenvironmentcloudFactory
