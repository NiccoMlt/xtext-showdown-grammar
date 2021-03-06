/**
 * generated by Xtext 2.21.0
 */
package io.github.niccomlt.showdown.showdownGrammar.impl;

import io.github.niccomlt.showdown.showdownGrammar.Pokemon;
import io.github.niccomlt.showdown.showdownGrammar.ShowdownGrammarFactory;
import io.github.niccomlt.showdown.showdownGrammar.ShowdownGrammarPackage;
import io.github.niccomlt.showdown.showdownGrammar.Stat;
import io.github.niccomlt.showdown.showdownGrammar.Team;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShowdownGrammarPackageImpl extends EPackageImpl implements ShowdownGrammarPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass teamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pokemonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statEClass = null;

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
   * @see io.github.niccomlt.showdown.showdownGrammar.ShowdownGrammarPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ShowdownGrammarPackageImpl()
  {
    super(eNS_URI, ShowdownGrammarFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ShowdownGrammarPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ShowdownGrammarPackage init()
  {
    if (isInited) return (ShowdownGrammarPackage)EPackage.Registry.INSTANCE.getEPackage(ShowdownGrammarPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredShowdownGrammarPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    ShowdownGrammarPackageImpl theShowdownGrammarPackage = registeredShowdownGrammarPackage instanceof ShowdownGrammarPackageImpl ? (ShowdownGrammarPackageImpl)registeredShowdownGrammarPackage : new ShowdownGrammarPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theShowdownGrammarPackage.createPackageContents();

    // Initialize created meta-data
    theShowdownGrammarPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theShowdownGrammarPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ShowdownGrammarPackage.eNS_URI, theShowdownGrammarPackage);
    return theShowdownGrammarPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTeam()
  {
    return teamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTeam_Elements()
  {
    return (EReference)teamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPokemon()
  {
    return pokemonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPokemon_Nick()
  {
    return (EAttribute)pokemonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPokemon_Specie()
  {
    return (EAttribute)pokemonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPokemon_Item()
  {
    return (EAttribute)pokemonEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPokemon_Ability()
  {
    return (EAttribute)pokemonEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPokemon_Level()
  {
    return (EAttribute)pokemonEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPokemon_Shiny()
  {
    return (EAttribute)pokemonEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPokemon_Happiness()
  {
    return (EAttribute)pokemonEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPokemon_Evs()
  {
    return (EReference)pokemonEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPokemon_Nature()
  {
    return (EAttribute)pokemonEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPokemon_Ivs()
  {
    return (EReference)pokemonEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPokemon_Moves()
  {
    return (EAttribute)pokemonEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStat()
  {
    return statEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getStat_Value()
  {
    return (EAttribute)statEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ShowdownGrammarFactory getShowdownGrammarFactory()
  {
    return (ShowdownGrammarFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    teamEClass = createEClass(TEAM);
    createEReference(teamEClass, TEAM__ELEMENTS);

    pokemonEClass = createEClass(POKEMON);
    createEAttribute(pokemonEClass, POKEMON__NICK);
    createEAttribute(pokemonEClass, POKEMON__SPECIE);
    createEAttribute(pokemonEClass, POKEMON__ITEM);
    createEAttribute(pokemonEClass, POKEMON__ABILITY);
    createEAttribute(pokemonEClass, POKEMON__LEVEL);
    createEAttribute(pokemonEClass, POKEMON__SHINY);
    createEAttribute(pokemonEClass, POKEMON__HAPPINESS);
    createEReference(pokemonEClass, POKEMON__EVS);
    createEAttribute(pokemonEClass, POKEMON__NATURE);
    createEReference(pokemonEClass, POKEMON__IVS);
    createEAttribute(pokemonEClass, POKEMON__MOVES);

    statEClass = createEClass(STAT);
    createEAttribute(statEClass, STAT__VALUE);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(teamEClass, Team.class, "Team", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTeam_Elements(), this.getPokemon(), null, "elements", null, 0, -1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pokemonEClass, Pokemon.class, "Pokemon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPokemon_Nick(), ecorePackage.getEString(), "nick", null, 0, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPokemon_Specie(), ecorePackage.getEString(), "specie", null, 0, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPokemon_Item(), ecorePackage.getEString(), "item", null, 0, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPokemon_Ability(), ecorePackage.getEString(), "ability", null, 0, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPokemon_Level(), ecorePackage.getEInt(), "level", null, 0, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPokemon_Shiny(), ecorePackage.getEString(), "shiny", null, 0, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPokemon_Happiness(), ecorePackage.getEInt(), "happiness", null, 0, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPokemon_Evs(), this.getStat(), null, "evs", null, 0, -1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPokemon_Nature(), ecorePackage.getEString(), "nature", null, 0, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPokemon_Ivs(), this.getStat(), null, "ivs", null, 0, -1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPokemon_Moves(), ecorePackage.getEString(), "moves", null, 0, -1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statEClass, Stat.class, "Stat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStat_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Stat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ShowdownGrammarPackageImpl
