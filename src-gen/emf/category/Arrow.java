/**
 */
package emf.category;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emf.category.Arrow#getName <em>Name</em>}</li>
 *   <li>{@link emf.category.Arrow#getDomain <em>Domain</em>}</li>
 *   <li>{@link emf.category.Arrow#getCodomain <em>Codomain</em>}</li>
 * </ul>
 *
 * @see emf.category.CategoryPackage#getArrow()
 * @model abstract="true"
 * @generated
 */
public interface Arrow extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see emf.category.CategoryPackage#getArrow_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link emf.category.Arrow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(emf.category.Object)
	 * @see emf.category.CategoryPackage#getArrow_Domain()
	 * @model required="true"
	 * @generated
	 */
	emf.category.Object getDomain();

	/**
	 * Sets the value of the '{@link emf.category.Arrow#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(emf.category.Object value);

	/**
	 * Returns the value of the '<em><b>Codomain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codomain</em>' reference.
	 * @see #setCodomain(emf.category.Object)
	 * @see emf.category.CategoryPackage#getArrow_Codomain()
	 * @model required="true"
	 * @generated
	 */
	emf.category.Object getCodomain();

	/**
	 * Sets the value of the '{@link emf.category.Arrow#getCodomain <em>Codomain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codomain</em>' reference.
	 * @see #getCodomain()
	 * @generated
	 */
	void setCodomain(emf.category.Object value);

} // Arrow
