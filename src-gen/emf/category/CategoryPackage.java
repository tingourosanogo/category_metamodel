/**
 */
package emf.category;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see emf.category.CategoryFactory
 * @model kind="package"
 * @generated
 */
public interface CategoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "category";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.editorCT.org/category";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "category";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CategoryPackage eINSTANCE = emf.category.impl.CategoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link emf.category.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.CategoryImpl
	 * @see emf.category.impl.CategoryPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.ArrowImpl <em>Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.ArrowImpl
	 * @see emf.category.impl.CategoryPackageImpl#getArrow()
	 * @generated
	 */
	int ARROW = 1;

	/**
	 * The meta object id for the '{@link emf.category.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.ObjectImpl
	 * @see emf.category.impl.CategoryPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Arrow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ARROW = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__OBJECT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Codomain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__CODOMAIN = 2;

	/**
	 * The number of structural features of the '<em>Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.MorphismImpl <em>Morphism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.MorphismImpl
	 * @see emf.category.impl.CategoryPackageImpl#getMorphism()
	 * @generated
	 */
	int MORPHISM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__NAME = ARROW__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__DOMAIN = ARROW__DOMAIN;

	/**
	 * The feature id for the '<em><b>Codomain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM__CODOMAIN = ARROW__CODOMAIN;

	/**
	 * The number of structural features of the '<em>Morphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_FEATURE_COUNT = ARROW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Morphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_OPERATION_COUNT = ARROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.IDImpl <em>ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.IDImpl
	 * @see emf.category.impl.CategoryPackageImpl#getID()
	 * @generated
	 */
	int ID = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__NAME = ARROW__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__DOMAIN = ARROW__DOMAIN;

	/**
	 * The feature id for the '<em><b>Codomain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__CODOMAIN = ARROW__CODOMAIN;

	/**
	 * The number of structural features of the '<em>ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = ARROW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OPERATION_COUNT = ARROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.FunctorImpl <em>Functor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.FunctorImpl
	 * @see emf.category.impl.CategoryPackageImpl#getFunctor()
	 * @generated
	 */
	int FUNCTOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR__NAME = ARROW__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR__DOMAIN = ARROW__DOMAIN;

	/**
	 * The feature id for the '<em><b>Codomain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR__CODOMAIN = ARROW__CODOMAIN;

	/**
	 * The number of structural features of the '<em>Functor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR_FEATURE_COUNT = ARROW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Functor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR_OPERATION_COUNT = ARROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.CompositionImpl
	 * @see emf.category.impl.CategoryPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__NAME = ARROW__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__DOMAIN = ARROW__DOMAIN;

	/**
	 * The feature id for the '<em><b>Codomain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__CODOMAIN = ARROW__CODOMAIN;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = ARROW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = ARROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.NaturaltranformationImpl <em>Naturaltranformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.NaturaltranformationImpl
	 * @see emf.category.impl.CategoryPackageImpl#getNaturaltranformation()
	 * @generated
	 */
	int NATURALTRANFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURALTRANFORMATION__NAME = ARROW__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURALTRANFORMATION__DOMAIN = ARROW__DOMAIN;

	/**
	 * The feature id for the '<em><b>Codomain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURALTRANFORMATION__CODOMAIN = ARROW__CODOMAIN;

	/**
	 * The number of structural features of the '<em>Naturaltranformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURALTRANFORMATION_FEATURE_COUNT = ARROW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Naturaltranformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURALTRANFORMATION_OPERATION_COUNT = ARROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.CommutearrowImpl <em>Commutearrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.CommutearrowImpl
	 * @see emf.category.impl.CategoryPackageImpl#getCommutearrow()
	 * @generated
	 */
	int COMMUTEARROW = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUTEARROW__NAME = ARROW__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUTEARROW__DOMAIN = ARROW__DOMAIN;

	/**
	 * The feature id for the '<em><b>Codomain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUTEARROW__CODOMAIN = ARROW__CODOMAIN;

	/**
	 * The number of structural features of the '<em>Commutearrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUTEARROW_FEATURE_COUNT = ARROW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Commutearrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUTEARROW_OPERATION_COUNT = ARROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.MonomorphismImpl <em>Monomorphism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.MonomorphismImpl
	 * @see emf.category.impl.CategoryPackageImpl#getMonomorphism()
	 * @generated
	 */
	int MONOMORPHISM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOMORPHISM__NAME = MORPHISM__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOMORPHISM__DOMAIN = MORPHISM__DOMAIN;

	/**
	 * The feature id for the '<em><b>Codomain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOMORPHISM__CODOMAIN = MORPHISM__CODOMAIN;

	/**
	 * The number of structural features of the '<em>Monomorphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOMORPHISM_FEATURE_COUNT = MORPHISM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Monomorphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOMORPHISM_OPERATION_COUNT = MORPHISM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.EpimorphismImpl <em>Epimorphism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.EpimorphismImpl
	 * @see emf.category.impl.CategoryPackageImpl#getEpimorphism()
	 * @generated
	 */
	int EPIMORPHISM = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIMORPHISM__NAME = MORPHISM__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIMORPHISM__DOMAIN = MORPHISM__DOMAIN;

	/**
	 * The feature id for the '<em><b>Codomain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIMORPHISM__CODOMAIN = MORPHISM__CODOMAIN;

	/**
	 * The number of structural features of the '<em>Epimorphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIMORPHISM_FEATURE_COUNT = MORPHISM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Epimorphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIMORPHISM_OPERATION_COUNT = MORPHISM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.IsomorphismImpl <em>Isomorphism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.IsomorphismImpl
	 * @see emf.category.impl.CategoryPackageImpl#getIsomorphism()
	 * @generated
	 */
	int ISOMORPHISM = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOMORPHISM__NAME = MORPHISM__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOMORPHISM__DOMAIN = MORPHISM__DOMAIN;

	/**
	 * The feature id for the '<em><b>Codomain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOMORPHISM__CODOMAIN = MORPHISM__CODOMAIN;

	/**
	 * The number of structural features of the '<em>Isomorphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOMORPHISM_FEATURE_COUNT = MORPHISM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Isomorphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOMORPHISM_OPERATION_COUNT = MORPHISM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.EndomorphismImpl <em>Endomorphism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.EndomorphismImpl
	 * @see emf.category.impl.CategoryPackageImpl#getEndomorphism()
	 * @generated
	 */
	int ENDOMORPHISM = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOMORPHISM__NAME = MORPHISM__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOMORPHISM__DOMAIN = MORPHISM__DOMAIN;

	/**
	 * The feature id for the '<em><b>Codomain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOMORPHISM__CODOMAIN = MORPHISM__CODOMAIN;

	/**
	 * The number of structural features of the '<em>Endomorphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOMORPHISM_FEATURE_COUNT = MORPHISM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Endomorphism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOMORPHISM_OPERATION_COUNT = MORPHISM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.EndofunctorImpl <em>Endofunctor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.EndofunctorImpl
	 * @see emf.category.impl.CategoryPackageImpl#getEndofunctor()
	 * @generated
	 */
	int ENDOFUNCTOR = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOFUNCTOR__NAME = FUNCTOR__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOFUNCTOR__DOMAIN = FUNCTOR__DOMAIN;

	/**
	 * The feature id for the '<em><b>Codomain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOFUNCTOR__CODOMAIN = FUNCTOR__CODOMAIN;

	/**
	 * The number of structural features of the '<em>Endofunctor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOFUNCTOR_FEATURE_COUNT = FUNCTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Endofunctor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOFUNCTOR_OPERATION_COUNT = FUNCTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.SimpleImpl <em>Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.SimpleImpl
	 * @see emf.category.impl.CategoryPackageImpl#getSimple()
	 * @generated
	 */
	int SIMPLE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__NAME = OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.SetImpl
	 * @see emf.category.impl.CategoryPackageImpl#getSet()
	 * @generated
	 */
	int SET = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__NAME = OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.LimitImpl <em>Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.LimitImpl
	 * @see emf.category.impl.CategoryPackageImpl#getLimit()
	 * @generated
	 */
	int LIMIT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__NAME = OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.ColimitImpl <em>Colimit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.ColimitImpl
	 * @see emf.category.impl.CategoryPackageImpl#getColimit()
	 * @generated
	 */
	int COLIMIT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLIMIT__NAME = OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Colimit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLIMIT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Colimit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLIMIT_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.ProductImpl
	 * @see emf.category.impl.CategoryPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = LIMIT__NAME;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.CoproductImpl <em>Coproduct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.CoproductImpl
	 * @see emf.category.impl.CategoryPackageImpl#getCoproduct()
	 * @generated
	 */
	int COPRODUCT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPRODUCT__NAME = COLIMIT__NAME;

	/**
	 * The number of structural features of the '<em>Coproduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPRODUCT_FEATURE_COUNT = COLIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coproduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPRODUCT_OPERATION_COUNT = COLIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.TerminalImpl
	 * @see emf.category.impl.CategoryPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__NAME = LIMIT__NAME;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.InitialImpl <em>Initial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.InitialImpl
	 * @see emf.category.impl.CategoryPackageImpl#getInitial()
	 * @generated
	 */
	int INITIAL = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL__NAME = COLIMIT__NAME;

	/**
	 * The number of structural features of the '<em>Initial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FEATURE_COUNT = COLIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_OPERATION_COUNT = COLIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.EqualizerImpl <em>Equalizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.EqualizerImpl
	 * @see emf.category.impl.CategoryPackageImpl#getEqualizer()
	 * @generated
	 */
	int EQUALIZER = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALIZER__NAME = LIMIT__NAME;

	/**
	 * The number of structural features of the '<em>Equalizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALIZER_FEATURE_COUNT = LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equalizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALIZER_OPERATION_COUNT = LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.CoequalizerImpl <em>Coequalizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.CoequalizerImpl
	 * @see emf.category.impl.CategoryPackageImpl#getCoequalizer()
	 * @generated
	 */
	int COEQUALIZER = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEQUALIZER__NAME = COLIMIT__NAME;

	/**
	 * The number of structural features of the '<em>Coequalizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEQUALIZER_FEATURE_COUNT = COLIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coequalizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEQUALIZER_OPERATION_COUNT = COLIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.PullbackImpl <em>Pullback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.PullbackImpl
	 * @see emf.category.impl.CategoryPackageImpl#getPullback()
	 * @generated
	 */
	int PULLBACK = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULLBACK__NAME = LIMIT__NAME;

	/**
	 * The number of structural features of the '<em>Pullback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULLBACK_FEATURE_COUNT = LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pullback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULLBACK_OPERATION_COUNT = LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.PushoutImpl <em>Pushout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.PushoutImpl
	 * @see emf.category.impl.CategoryPackageImpl#getPushout()
	 * @generated
	 */
	int PUSHOUT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHOUT__NAME = COLIMIT__NAME;

	/**
	 * The number of structural features of the '<em>Pushout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHOUT_FEATURE_COUNT = COLIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pushout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHOUT_OPERATION_COUNT = COLIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.GenerallimitImpl <em>Generallimit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.GenerallimitImpl
	 * @see emf.category.impl.CategoryPackageImpl#getGenerallimit()
	 * @generated
	 */
	int GENERALLIMIT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALLIMIT__NAME = LIMIT__NAME;

	/**
	 * The number of structural features of the '<em>Generallimit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALLIMIT_FEATURE_COUNT = LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generallimit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALLIMIT_OPERATION_COUNT = LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.category.impl.GeneralcolimitImpl <em>Generalcolimit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.category.impl.GeneralcolimitImpl
	 * @see emf.category.impl.CategoryPackageImpl#getGeneralcolimit()
	 * @generated
	 */
	int GENERALCOLIMIT = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALCOLIMIT__NAME = COLIMIT__NAME;

	/**
	 * The number of structural features of the '<em>Generalcolimit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALCOLIMIT_FEATURE_COUNT = COLIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generalcolimit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALCOLIMIT_OPERATION_COUNT = COLIMIT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link emf.category.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see emf.category.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.category.Category#getArrow <em>Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arrow</em>'.
	 * @see emf.category.Category#getArrow()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Arrow();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.category.Category#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see emf.category.Category#getObject()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Object();

	/**
	 * Returns the meta object for class '{@link emf.category.Arrow <em>Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrow</em>'.
	 * @see emf.category.Arrow
	 * @generated
	 */
	EClass getArrow();

	/**
	 * Returns the meta object for the attribute '{@link emf.category.Arrow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see emf.category.Arrow#getName()
	 * @see #getArrow()
	 * @generated
	 */
	EAttribute getArrow_Name();

	/**
	 * Returns the meta object for the reference '{@link emf.category.Arrow#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see emf.category.Arrow#getDomain()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_Domain();

	/**
	 * Returns the meta object for the reference '{@link emf.category.Arrow#getCodomain <em>Codomain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Codomain</em>'.
	 * @see emf.category.Arrow#getCodomain()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_Codomain();

	/**
	 * Returns the meta object for class '{@link emf.category.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see emf.category.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link emf.category.Object#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see emf.category.Object#getName()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Name();

	/**
	 * Returns the meta object for class '{@link emf.category.Morphism <em>Morphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Morphism</em>'.
	 * @see emf.category.Morphism
	 * @generated
	 */
	EClass getMorphism();

	/**
	 * Returns the meta object for class '{@link emf.category.ID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID</em>'.
	 * @see emf.category.ID
	 * @generated
	 */
	EClass getID();

	/**
	 * Returns the meta object for class '{@link emf.category.Functor <em>Functor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functor</em>'.
	 * @see emf.category.Functor
	 * @generated
	 */
	EClass getFunctor();

	/**
	 * Returns the meta object for class '{@link emf.category.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see emf.category.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for class '{@link emf.category.Naturaltranformation <em>Naturaltranformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Naturaltranformation</em>'.
	 * @see emf.category.Naturaltranformation
	 * @generated
	 */
	EClass getNaturaltranformation();

	/**
	 * Returns the meta object for class '{@link emf.category.Commutearrow <em>Commutearrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commutearrow</em>'.
	 * @see emf.category.Commutearrow
	 * @generated
	 */
	EClass getCommutearrow();

	/**
	 * Returns the meta object for class '{@link emf.category.Monomorphism <em>Monomorphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monomorphism</em>'.
	 * @see emf.category.Monomorphism
	 * @generated
	 */
	EClass getMonomorphism();

	/**
	 * Returns the meta object for class '{@link emf.category.Epimorphism <em>Epimorphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Epimorphism</em>'.
	 * @see emf.category.Epimorphism
	 * @generated
	 */
	EClass getEpimorphism();

	/**
	 * Returns the meta object for class '{@link emf.category.Isomorphism <em>Isomorphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Isomorphism</em>'.
	 * @see emf.category.Isomorphism
	 * @generated
	 */
	EClass getIsomorphism();

	/**
	 * Returns the meta object for class '{@link emf.category.Endomorphism <em>Endomorphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endomorphism</em>'.
	 * @see emf.category.Endomorphism
	 * @generated
	 */
	EClass getEndomorphism();

	/**
	 * Returns the meta object for class '{@link emf.category.Endofunctor <em>Endofunctor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endofunctor</em>'.
	 * @see emf.category.Endofunctor
	 * @generated
	 */
	EClass getEndofunctor();

	/**
	 * Returns the meta object for class '{@link emf.category.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple</em>'.
	 * @see emf.category.Simple
	 * @generated
	 */
	EClass getSimple();

	/**
	 * Returns the meta object for class '{@link emf.category.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see emf.category.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for class '{@link emf.category.Limit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limit</em>'.
	 * @see emf.category.Limit
	 * @generated
	 */
	EClass getLimit();

	/**
	 * Returns the meta object for class '{@link emf.category.Colimit <em>Colimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colimit</em>'.
	 * @see emf.category.Colimit
	 * @generated
	 */
	EClass getColimit();

	/**
	 * Returns the meta object for class '{@link emf.category.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see emf.category.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for class '{@link emf.category.Coproduct <em>Coproduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coproduct</em>'.
	 * @see emf.category.Coproduct
	 * @generated
	 */
	EClass getCoproduct();

	/**
	 * Returns the meta object for class '{@link emf.category.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see emf.category.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for class '{@link emf.category.Initial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial</em>'.
	 * @see emf.category.Initial
	 * @generated
	 */
	EClass getInitial();

	/**
	 * Returns the meta object for class '{@link emf.category.Equalizer <em>Equalizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equalizer</em>'.
	 * @see emf.category.Equalizer
	 * @generated
	 */
	EClass getEqualizer();

	/**
	 * Returns the meta object for class '{@link emf.category.Coequalizer <em>Coequalizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coequalizer</em>'.
	 * @see emf.category.Coequalizer
	 * @generated
	 */
	EClass getCoequalizer();

	/**
	 * Returns the meta object for class '{@link emf.category.Pullback <em>Pullback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pullback</em>'.
	 * @see emf.category.Pullback
	 * @generated
	 */
	EClass getPullback();

	/**
	 * Returns the meta object for class '{@link emf.category.Pushout <em>Pushout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pushout</em>'.
	 * @see emf.category.Pushout
	 * @generated
	 */
	EClass getPushout();

	/**
	 * Returns the meta object for class '{@link emf.category.Generallimit <em>Generallimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generallimit</em>'.
	 * @see emf.category.Generallimit
	 * @generated
	 */
	EClass getGenerallimit();

	/**
	 * Returns the meta object for class '{@link emf.category.Generalcolimit <em>Generalcolimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalcolimit</em>'.
	 * @see emf.category.Generalcolimit
	 * @generated
	 */
	EClass getGeneralcolimit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CategoryFactory getCategoryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link emf.category.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.CategoryImpl
		 * @see emf.category.impl.CategoryPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Arrow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__ARROW = eINSTANCE.getCategory_Arrow();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__OBJECT = eINSTANCE.getCategory_Object();

		/**
		 * The meta object literal for the '{@link emf.category.impl.ArrowImpl <em>Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.ArrowImpl
		 * @see emf.category.impl.CategoryPackageImpl#getArrow()
		 * @generated
		 */
		EClass ARROW = eINSTANCE.getArrow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROW__NAME = eINSTANCE.getArrow_Name();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__DOMAIN = eINSTANCE.getArrow_Domain();

		/**
		 * The meta object literal for the '<em><b>Codomain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__CODOMAIN = eINSTANCE.getArrow_Codomain();

		/**
		 * The meta object literal for the '{@link emf.category.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.ObjectImpl
		 * @see emf.category.impl.CategoryPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__NAME = eINSTANCE.getObject_Name();

		/**
		 * The meta object literal for the '{@link emf.category.impl.MorphismImpl <em>Morphism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.MorphismImpl
		 * @see emf.category.impl.CategoryPackageImpl#getMorphism()
		 * @generated
		 */
		EClass MORPHISM = eINSTANCE.getMorphism();

		/**
		 * The meta object literal for the '{@link emf.category.impl.IDImpl <em>ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.IDImpl
		 * @see emf.category.impl.CategoryPackageImpl#getID()
		 * @generated
		 */
		EClass ID = eINSTANCE.getID();

		/**
		 * The meta object literal for the '{@link emf.category.impl.FunctorImpl <em>Functor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.FunctorImpl
		 * @see emf.category.impl.CategoryPackageImpl#getFunctor()
		 * @generated
		 */
		EClass FUNCTOR = eINSTANCE.getFunctor();

		/**
		 * The meta object literal for the '{@link emf.category.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.CompositionImpl
		 * @see emf.category.impl.CategoryPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '{@link emf.category.impl.NaturaltranformationImpl <em>Naturaltranformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.NaturaltranformationImpl
		 * @see emf.category.impl.CategoryPackageImpl#getNaturaltranformation()
		 * @generated
		 */
		EClass NATURALTRANFORMATION = eINSTANCE.getNaturaltranformation();

		/**
		 * The meta object literal for the '{@link emf.category.impl.CommutearrowImpl <em>Commutearrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.CommutearrowImpl
		 * @see emf.category.impl.CategoryPackageImpl#getCommutearrow()
		 * @generated
		 */
		EClass COMMUTEARROW = eINSTANCE.getCommutearrow();

		/**
		 * The meta object literal for the '{@link emf.category.impl.MonomorphismImpl <em>Monomorphism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.MonomorphismImpl
		 * @see emf.category.impl.CategoryPackageImpl#getMonomorphism()
		 * @generated
		 */
		EClass MONOMORPHISM = eINSTANCE.getMonomorphism();

		/**
		 * The meta object literal for the '{@link emf.category.impl.EpimorphismImpl <em>Epimorphism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.EpimorphismImpl
		 * @see emf.category.impl.CategoryPackageImpl#getEpimorphism()
		 * @generated
		 */
		EClass EPIMORPHISM = eINSTANCE.getEpimorphism();

		/**
		 * The meta object literal for the '{@link emf.category.impl.IsomorphismImpl <em>Isomorphism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.IsomorphismImpl
		 * @see emf.category.impl.CategoryPackageImpl#getIsomorphism()
		 * @generated
		 */
		EClass ISOMORPHISM = eINSTANCE.getIsomorphism();

		/**
		 * The meta object literal for the '{@link emf.category.impl.EndomorphismImpl <em>Endomorphism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.EndomorphismImpl
		 * @see emf.category.impl.CategoryPackageImpl#getEndomorphism()
		 * @generated
		 */
		EClass ENDOMORPHISM = eINSTANCE.getEndomorphism();

		/**
		 * The meta object literal for the '{@link emf.category.impl.EndofunctorImpl <em>Endofunctor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.EndofunctorImpl
		 * @see emf.category.impl.CategoryPackageImpl#getEndofunctor()
		 * @generated
		 */
		EClass ENDOFUNCTOR = eINSTANCE.getEndofunctor();

		/**
		 * The meta object literal for the '{@link emf.category.impl.SimpleImpl <em>Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.SimpleImpl
		 * @see emf.category.impl.CategoryPackageImpl#getSimple()
		 * @generated
		 */
		EClass SIMPLE = eINSTANCE.getSimple();

		/**
		 * The meta object literal for the '{@link emf.category.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.SetImpl
		 * @see emf.category.impl.CategoryPackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '{@link emf.category.impl.LimitImpl <em>Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.LimitImpl
		 * @see emf.category.impl.CategoryPackageImpl#getLimit()
		 * @generated
		 */
		EClass LIMIT = eINSTANCE.getLimit();

		/**
		 * The meta object literal for the '{@link emf.category.impl.ColimitImpl <em>Colimit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.ColimitImpl
		 * @see emf.category.impl.CategoryPackageImpl#getColimit()
		 * @generated
		 */
		EClass COLIMIT = eINSTANCE.getColimit();

		/**
		 * The meta object literal for the '{@link emf.category.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.ProductImpl
		 * @see emf.category.impl.CategoryPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '{@link emf.category.impl.CoproductImpl <em>Coproduct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.CoproductImpl
		 * @see emf.category.impl.CategoryPackageImpl#getCoproduct()
		 * @generated
		 */
		EClass COPRODUCT = eINSTANCE.getCoproduct();

		/**
		 * The meta object literal for the '{@link emf.category.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.TerminalImpl
		 * @see emf.category.impl.CategoryPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '{@link emf.category.impl.InitialImpl <em>Initial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.InitialImpl
		 * @see emf.category.impl.CategoryPackageImpl#getInitial()
		 * @generated
		 */
		EClass INITIAL = eINSTANCE.getInitial();

		/**
		 * The meta object literal for the '{@link emf.category.impl.EqualizerImpl <em>Equalizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.EqualizerImpl
		 * @see emf.category.impl.CategoryPackageImpl#getEqualizer()
		 * @generated
		 */
		EClass EQUALIZER = eINSTANCE.getEqualizer();

		/**
		 * The meta object literal for the '{@link emf.category.impl.CoequalizerImpl <em>Coequalizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.CoequalizerImpl
		 * @see emf.category.impl.CategoryPackageImpl#getCoequalizer()
		 * @generated
		 */
		EClass COEQUALIZER = eINSTANCE.getCoequalizer();

		/**
		 * The meta object literal for the '{@link emf.category.impl.PullbackImpl <em>Pullback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.PullbackImpl
		 * @see emf.category.impl.CategoryPackageImpl#getPullback()
		 * @generated
		 */
		EClass PULLBACK = eINSTANCE.getPullback();

		/**
		 * The meta object literal for the '{@link emf.category.impl.PushoutImpl <em>Pushout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.PushoutImpl
		 * @see emf.category.impl.CategoryPackageImpl#getPushout()
		 * @generated
		 */
		EClass PUSHOUT = eINSTANCE.getPushout();

		/**
		 * The meta object literal for the '{@link emf.category.impl.GenerallimitImpl <em>Generallimit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.GenerallimitImpl
		 * @see emf.category.impl.CategoryPackageImpl#getGenerallimit()
		 * @generated
		 */
		EClass GENERALLIMIT = eINSTANCE.getGenerallimit();

		/**
		 * The meta object literal for the '{@link emf.category.impl.GeneralcolimitImpl <em>Generalcolimit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.category.impl.GeneralcolimitImpl
		 * @see emf.category.impl.CategoryPackageImpl#getGeneralcolimit()
		 * @generated
		 */
		EClass GENERALCOLIMIT = eINSTANCE.getGeneralcolimit();

	}

} //CategoryPackage
