/**
 */
package emf.category;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emf.category.Category#getArrow <em>Arrow</em>}</li>
 *   <li>{@link emf.category.Category#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see emf.category.CategoryPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends emf.category.Object {
	/**
	 * Returns the value of the '<em><b>Arrow</b></em>' containment reference list.
	 * The list contents are of type {@link emf.category.Arrow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrow</em>' containment reference list.
	 * @see emf.category.CategoryPackage#getCategory_Arrow()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arrow> getArrow();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link emf.category.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see emf.category.CategoryPackage#getCategory_Object()
	 * @model containment="true"
	 * @generated
	 */
	EList<emf.category.Object> getObject();

} // Category
