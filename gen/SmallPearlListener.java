// Generated from /Users/thomas/IdeaProjects/SmallPearlTest/src/SmallPearl.g4 by ANTLR 4.9.1

import org.smallpearl.compiler.SmallPearlLexer;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SmallPearlParser}.
 */
public interface SmallPearlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SmallPearlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SmallPearlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(SmallPearlParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(SmallPearlParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#system_part}.
	 * @param ctx the parse tree
	 */
	void enterSystem_part(SmallPearlParser.System_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#system_part}.
	 * @param ctx the parse tree
	 */
	void exitSystem_part(SmallPearlParser.System_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#systemElementDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSystemElementDefinition(SmallPearlParser.SystemElementDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#systemElementDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSystemElementDefinition(SmallPearlParser.SystemElementDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#systemPartName}.
	 * @param ctx the parse tree
	 */
	void enterSystemPartName(SmallPearlParser.SystemPartNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#systemPartName}.
	 * @param ctx the parse tree
	 */
	void exitSystemPartName(SmallPearlParser.SystemPartNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#configurationElement}.
	 * @param ctx the parse tree
	 */
	void enterConfigurationElement(SmallPearlParser.ConfigurationElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#configurationElement}.
	 * @param ctx the parse tree
	 */
	void exitConfigurationElement(SmallPearlParser.ConfigurationElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#systemDescription}.
	 * @param ctx the parse tree
	 */
	void enterSystemDescription(SmallPearlParser.SystemDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#systemDescription}.
	 * @param ctx the parse tree
	 */
	void exitSystemDescription(SmallPearlParser.SystemDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#association}.
	 * @param ctx the parse tree
	 */
	void enterAssociation(SmallPearlParser.AssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#association}.
	 * @param ctx the parse tree
	 */
	void exitAssociation(SmallPearlParser.AssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#systemElementParameters}.
	 * @param ctx the parse tree
	 */
	void enterSystemElementParameters(SmallPearlParser.SystemElementParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#systemElementParameters}.
	 * @param ctx the parse tree
	 */
	void exitSystemElementParameters(SmallPearlParser.SystemElementParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#problem_part}.
	 * @param ctx the parse tree
	 */
	void enterProblem_part(SmallPearlParser.Problem_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#problem_part}.
	 * @param ctx the parse tree
	 */
	void exitProblem_part(SmallPearlParser.Problem_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#identification}.
	 * @param ctx the parse tree
	 */
	void enterIdentification(SmallPearlParser.IdentificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#identification}.
	 * @param ctx the parse tree
	 */
	void exitIdentification(SmallPearlParser.IdentificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#identificationDenotation}.
	 * @param ctx the parse tree
	 */
	void enterIdentificationDenotation(SmallPearlParser.IdentificationDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#identificationDenotation}.
	 * @param ctx the parse tree
	 */
	void exitIdentificationDenotation(SmallPearlParser.IdentificationDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeForIdentification}.
	 * @param ctx the parse tree
	 */
	void enterTypeForIdentification(SmallPearlParser.TypeForIdentificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeForIdentification}.
	 * @param ctx the parse tree
	 */
	void exitTypeForIdentification(SmallPearlParser.TypeForIdentificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeAttributeForIdentification}.
	 * @param ctx the parse tree
	 */
	void enterTypeAttributeForIdentification(SmallPearlParser.TypeAttributeForIdentificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeAttributeForIdentification}.
	 * @param ctx the parse tree
	 */
	void exitTypeAttributeForIdentification(SmallPearlParser.TypeAttributeForIdentificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#identificationAttribute}.
	 * @param ctx the parse tree
	 */
	void enterIdentificationAttribute(SmallPearlParser.IdentificationAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#identificationAttribute}.
	 * @param ctx the parse tree
	 */
	void exitIdentificationAttribute(SmallPearlParser.IdentificationAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(SmallPearlParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(SmallPearlParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SmallPearlParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SmallPearlParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#variableDenotation}.
	 * @param ctx the parse tree
	 */
	void enterVariableDenotation(SmallPearlParser.VariableDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#variableDenotation}.
	 * @param ctx the parse tree
	 */
	void exitVariableDenotation(SmallPearlParser.VariableDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#problemPartDataAttribute}.
	 * @param ctx the parse tree
	 */
	void enterProblemPartDataAttribute(SmallPearlParser.ProblemPartDataAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#problemPartDataAttribute}.
	 * @param ctx the parse tree
	 */
	void exitProblemPartDataAttribute(SmallPearlParser.ProblemPartDataAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTypeAttribute(SmallPearlParser.TypeAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTypeAttribute(SmallPearlParser.TypeAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#allocationProtection}.
	 * @param ctx the parse tree
	 */
	void enterAllocationProtection(SmallPearlParser.AllocationProtectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#allocationProtection}.
	 * @param ctx the parse tree
	 */
	void exitAllocationProtection(SmallPearlParser.AllocationProtectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#globalAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGlobalAttribute(SmallPearlParser.GlobalAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#globalAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGlobalAttribute(SmallPearlParser.GlobalAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterSpecification(SmallPearlParser.SpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitSpecification(SmallPearlParser.SpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#specificationItem}.
	 * @param ctx the parse tree
	 */
	void enterSpecificationItem(SmallPearlParser.SpecificationItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#specificationItem}.
	 * @param ctx the parse tree
	 */
	void exitSpecificationItem(SmallPearlParser.SpecificationItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(SmallPearlParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(SmallPearlParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeInteger}.
	 * @param ctx the parse tree
	 */
	void enterTypeInteger(SmallPearlParser.TypeIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeInteger}.
	 * @param ctx the parse tree
	 */
	void exitTypeInteger(SmallPearlParser.TypeIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#mprecision}.
	 * @param ctx the parse tree
	 */
	void enterMprecision(SmallPearlParser.MprecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#mprecision}.
	 * @param ctx the parse tree
	 */
	void exitMprecision(SmallPearlParser.MprecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#integerWithoutPrecision}.
	 * @param ctx the parse tree
	 */
	void enterIntegerWithoutPrecision(SmallPearlParser.IntegerWithoutPrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#integerWithoutPrecision}.
	 * @param ctx the parse tree
	 */
	void exitIntegerWithoutPrecision(SmallPearlParser.IntegerWithoutPrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeFloatingPointNumber}.
	 * @param ctx the parse tree
	 */
	void enterTypeFloatingPointNumber(SmallPearlParser.TypeFloatingPointNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeFloatingPointNumber}.
	 * @param ctx the parse tree
	 */
	void exitTypeFloatingPointNumber(SmallPearlParser.TypeFloatingPointNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeBitString}.
	 * @param ctx the parse tree
	 */
	void enterTypeBitString(SmallPearlParser.TypeBitStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeBitString}.
	 * @param ctx the parse tree
	 */
	void exitTypeBitString(SmallPearlParser.TypeBitStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeCharacterString}.
	 * @param ctx the parse tree
	 */
	void enterTypeCharacterString(SmallPearlParser.TypeCharacterStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeCharacterString}.
	 * @param ctx the parse tree
	 */
	void exitTypeCharacterString(SmallPearlParser.TypeCharacterStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeDuration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDuration(SmallPearlParser.TypeDurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeDuration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDuration(SmallPearlParser.TypeDurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeClock}.
	 * @param ctx the parse tree
	 */
	void enterTypeClock(SmallPearlParser.TypeClockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeClock}.
	 * @param ctx the parse tree
	 */
	void exitTypeClock(SmallPearlParser.TypeClockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#identifierDenotation}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierDenotation(SmallPearlParser.IdentifierDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#identifierDenotation}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierDenotation(SmallPearlParser.IdentifierDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#initialisationAttribute}.
	 * @param ctx the parse tree
	 */
	void enterInitialisationAttribute(SmallPearlParser.InitialisationAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#initialisationAttribute}.
	 * @param ctx the parse tree
	 */
	void exitInitialisationAttribute(SmallPearlParser.InitialisationAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#initElement}.
	 * @param ctx the parse tree
	 */
	void enterInitElement(SmallPearlParser.InitElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#initElement}.
	 * @param ctx the parse tree
	 */
	void exitInitElement(SmallPearlParser.InitElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeStructure}.
	 * @param ctx the parse tree
	 */
	void enterTypeStructure(SmallPearlParser.TypeStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeStructure}.
	 * @param ctx the parse tree
	 */
	void exitTypeStructure(SmallPearlParser.TypeStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#structureComponent}.
	 * @param ctx the parse tree
	 */
	void enterStructureComponent(SmallPearlParser.StructureComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#structureComponent}.
	 * @param ctx the parse tree
	 */
	void exitStructureComponent(SmallPearlParser.StructureComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeAttributeInStructureComponent}.
	 * @param ctx the parse tree
	 */
	void enterTypeAttributeInStructureComponent(SmallPearlParser.TypeAttributeInStructureComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeAttributeInStructureComponent}.
	 * @param ctx the parse tree
	 */
	void exitTypeAttributeInStructureComponent(SmallPearlParser.TypeAttributeInStructureComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(SmallPearlParser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(SmallPearlParser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#structureSpecfication}.
	 * @param ctx the parse tree
	 */
	void enterStructureSpecfication(SmallPearlParser.StructureSpecficationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#structureSpecfication}.
	 * @param ctx the parse tree
	 */
	void exitStructureSpecfication(SmallPearlParser.StructureSpecficationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#structureDenotationS}.
	 * @param ctx the parse tree
	 */
	void enterStructureDenotationS(SmallPearlParser.StructureDenotationSContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#structureDenotationS}.
	 * @param ctx the parse tree
	 */
	void exitStructureDenotationS(SmallPearlParser.StructureDenotationSContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(SmallPearlParser.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(SmallPearlParser.TypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeRefChar}.
	 * @param ctx the parse tree
	 */
	void enterTypeRefChar(SmallPearlParser.TypeRefCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeRefChar}.
	 * @param ctx the parse tree
	 */
	void exitTypeRefChar(SmallPearlParser.TypeRefCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeReferenceStructuredType}.
	 * @param ctx the parse tree
	 */
	void enterTypeReferenceStructuredType(SmallPearlParser.TypeReferenceStructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeReferenceStructuredType}.
	 * @param ctx the parse tree
	 */
	void exitTypeReferenceStructuredType(SmallPearlParser.TypeReferenceStructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeReferenceDationType}.
	 * @param ctx the parse tree
	 */
	void enterTypeReferenceDationType(SmallPearlParser.TypeReferenceDationTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeReferenceDationType}.
	 * @param ctx the parse tree
	 */
	void exitTypeReferenceDationType(SmallPearlParser.TypeReferenceDationTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeReferenceSemaType}.
	 * @param ctx the parse tree
	 */
	void enterTypeReferenceSemaType(SmallPearlParser.TypeReferenceSemaTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeReferenceSemaType}.
	 * @param ctx the parse tree
	 */
	void exitTypeReferenceSemaType(SmallPearlParser.TypeReferenceSemaTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeReferenceBoltType}.
	 * @param ctx the parse tree
	 */
	void enterTypeReferenceBoltType(SmallPearlParser.TypeReferenceBoltTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeReferenceBoltType}.
	 * @param ctx the parse tree
	 */
	void exitTypeReferenceBoltType(SmallPearlParser.TypeReferenceBoltTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeReferenceProcedureType}.
	 * @param ctx the parse tree
	 */
	void enterTypeReferenceProcedureType(SmallPearlParser.TypeReferenceProcedureTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeReferenceProcedureType}.
	 * @param ctx the parse tree
	 */
	void exitTypeReferenceProcedureType(SmallPearlParser.TypeReferenceProcedureTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeReferenceTaskType}.
	 * @param ctx the parse tree
	 */
	void enterTypeReferenceTaskType(SmallPearlParser.TypeReferenceTaskTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeReferenceTaskType}.
	 * @param ctx the parse tree
	 */
	void exitTypeReferenceTaskType(SmallPearlParser.TypeReferenceTaskTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeReferenceInterruptType}.
	 * @param ctx the parse tree
	 */
	void enterTypeReferenceInterruptType(SmallPearlParser.TypeReferenceInterruptTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeReferenceInterruptType}.
	 * @param ctx the parse tree
	 */
	void exitTypeReferenceInterruptType(SmallPearlParser.TypeReferenceInterruptTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeReferenceSignalType}.
	 * @param ctx the parse tree
	 */
	void enterTypeReferenceSignalType(SmallPearlParser.TypeReferenceSignalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeReferenceSignalType}.
	 * @param ctx the parse tree
	 */
	void exitTypeReferenceSignalType(SmallPearlParser.TypeReferenceSignalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeReferenceCharType}.
	 * @param ctx the parse tree
	 */
	void enterTypeReferenceCharType(SmallPearlParser.TypeReferenceCharTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeReferenceCharType}.
	 * @param ctx the parse tree
	 */
	void exitTypeReferenceCharType(SmallPearlParser.TypeReferenceCharTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#semaDenotation}.
	 * @param ctx the parse tree
	 */
	void enterSemaDenotation(SmallPearlParser.SemaDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#semaDenotation}.
	 * @param ctx the parse tree
	 */
	void exitSemaDenotation(SmallPearlParser.SemaDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#preset}.
	 * @param ctx the parse tree
	 */
	void enterPreset(SmallPearlParser.PresetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#preset}.
	 * @param ctx the parse tree
	 */
	void exitPreset(SmallPearlParser.PresetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(SmallPearlParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(SmallPearlParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#procedureDenotation}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDenotation(SmallPearlParser.ProcedureDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#procedureDenotation}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDenotation(SmallPearlParser.ProcedureDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeProcedure}.
	 * @param ctx the parse tree
	 */
	void enterTypeProcedure(SmallPearlParser.TypeProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeProcedure}.
	 * @param ctx the parse tree
	 */
	void exitTypeProcedure(SmallPearlParser.TypeProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#procedureBody}.
	 * @param ctx the parse tree
	 */
	void enterProcedureBody(SmallPearlParser.ProcedureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#procedureBody}.
	 * @param ctx the parse tree
	 */
	void exitProcedureBody(SmallPearlParser.ProcedureBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#listOfFormalParameters}.
	 * @param ctx the parse tree
	 */
	void enterListOfFormalParameters(SmallPearlParser.ListOfFormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#listOfFormalParameters}.
	 * @param ctx the parse tree
	 */
	void exitListOfFormalParameters(SmallPearlParser.ListOfFormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(SmallPearlParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(SmallPearlParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SmallPearlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SmallPearlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#virtualDimensionList}.
	 * @param ctx the parse tree
	 */
	void enterVirtualDimensionList(SmallPearlParser.VirtualDimensionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#virtualDimensionList}.
	 * @param ctx the parse tree
	 */
	void exitVirtualDimensionList(SmallPearlParser.VirtualDimensionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#commas}.
	 * @param ctx the parse tree
	 */
	void enterCommas(SmallPearlParser.CommasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#commas}.
	 * @param ctx the parse tree
	 */
	void exitCommas(SmallPearlParser.CommasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#assignmentProtection}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentProtection(SmallPearlParser.AssignmentProtectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#assignmentProtection}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentProtection(SmallPearlParser.AssignmentProtectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#passIdentical}.
	 * @param ctx the parse tree
	 */
	void enterPassIdentical(SmallPearlParser.PassIdenticalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#passIdentical}.
	 * @param ctx the parse tree
	 */
	void exitPassIdentical(SmallPearlParser.PassIdenticalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#virtualDimensionList2}.
	 * @param ctx the parse tree
	 */
	void enterVirtualDimensionList2(SmallPearlParser.VirtualDimensionList2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#virtualDimensionList2}.
	 * @param ctx the parse tree
	 */
	void exitVirtualDimensionList2(SmallPearlParser.VirtualDimensionList2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(SmallPearlParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(SmallPearlParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#disableStatement}.
	 * @param ctx the parse tree
	 */
	void enterDisableStatement(SmallPearlParser.DisableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#disableStatement}.
	 * @param ctx the parse tree
	 */
	void exitDisableStatement(SmallPearlParser.DisableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#enableStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnableStatement(SmallPearlParser.EnableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#enableStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnableStatement(SmallPearlParser.EnableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#triggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterTriggerStatement(SmallPearlParser.TriggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#triggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitTriggerStatement(SmallPearlParser.TriggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#resultAttribute}.
	 * @param ctx the parse tree
	 */
	void enterResultAttribute(SmallPearlParser.ResultAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#resultAttribute}.
	 * @param ctx the parse tree
	 */
	void exitResultAttribute(SmallPearlParser.ResultAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(SmallPearlParser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(SmallPearlParser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#taskDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTaskDeclaration(SmallPearlParser.TaskDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#taskDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTaskDeclaration(SmallPearlParser.TaskDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#taskDenotation}.
	 * @param ctx the parse tree
	 */
	void enterTaskDenotation(SmallPearlParser.TaskDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#taskDenotation}.
	 * @param ctx the parse tree
	 */
	void exitTaskDenotation(SmallPearlParser.TaskDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#nameOfModuleTaskProc}.
	 * @param ctx the parse tree
	 */
	void enterNameOfModuleTaskProc(SmallPearlParser.NameOfModuleTaskProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#nameOfModuleTaskProc}.
	 * @param ctx the parse tree
	 */
	void exitNameOfModuleTaskProc(SmallPearlParser.NameOfModuleTaskProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#task_main}.
	 * @param ctx the parse tree
	 */
	void enterTask_main(SmallPearlParser.Task_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#task_main}.
	 * @param ctx the parse tree
	 */
	void exitTask_main(SmallPearlParser.Task_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#taskBody}.
	 * @param ctx the parse tree
	 */
	void enterTaskBody(SmallPearlParser.TaskBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#taskBody}.
	 * @param ctx the parse tree
	 */
	void exitTaskBody(SmallPearlParser.TaskBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SmallPearlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SmallPearlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#unlabeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnlabeled_statement(SmallPearlParser.Unlabeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#unlabeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnlabeled_statement(SmallPearlParser.Unlabeled_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_statement(SmallPearlParser.Empty_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_statement(SmallPearlParser.Empty_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#label_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabel_statement(SmallPearlParser.Label_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#label_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabel_statement(SmallPearlParser.Label_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(SmallPearlParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(SmallPearlParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#listOfActualParameters}.
	 * @param ctx the parse tree
	 */
	void enterListOfActualParameters(SmallPearlParser.ListOfActualParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#listOfActualParameters}.
	 * @param ctx the parse tree
	 */
	void exitListOfActualParameters(SmallPearlParser.ListOfActualParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SmallPearlParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SmallPearlParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(SmallPearlParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(SmallPearlParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#exitStatement}.
	 * @param ctx the parse tree
	 */
	void enterExitStatement(SmallPearlParser.ExitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#exitStatement}.
	 * @param ctx the parse tree
	 */
	void exitExitStatement(SmallPearlParser.ExitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(SmallPearlParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(SmallPearlParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#dereference}.
	 * @param ctx the parse tree
	 */
	void enterDereference(SmallPearlParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#dereference}.
	 * @param ctx the parse tree
	 */
	void exitDereference(SmallPearlParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#stringSelection}.
	 * @param ctx the parse tree
	 */
	void enterStringSelection(SmallPearlParser.StringSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#stringSelection}.
	 * @param ctx the parse tree
	 */
	void exitStringSelection(SmallPearlParser.StringSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#bitSelection}.
	 * @param ctx the parse tree
	 */
	void enterBitSelection(SmallPearlParser.BitSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#bitSelection}.
	 * @param ctx the parse tree
	 */
	void exitBitSelection(SmallPearlParser.BitSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#bitSelectionSlice}.
	 * @param ctx the parse tree
	 */
	void enterBitSelectionSlice(SmallPearlParser.BitSelectionSliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#bitSelectionSlice}.
	 * @param ctx the parse tree
	 */
	void exitBitSelectionSlice(SmallPearlParser.BitSelectionSliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#charSelection}.
	 * @param ctx the parse tree
	 */
	void enterCharSelection(SmallPearlParser.CharSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#charSelection}.
	 * @param ctx the parse tree
	 */
	void exitCharSelection(SmallPearlParser.CharSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#charSelectionSlice}.
	 * @param ctx the parse tree
	 */
	void enterCharSelectionSlice(SmallPearlParser.CharSelectionSliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#charSelectionSlice}.
	 * @param ctx the parse tree
	 */
	void exitCharSelectionSlice(SmallPearlParser.CharSelectionSliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#sequential_control_statement}.
	 * @param ctx the parse tree
	 */
	void enterSequential_control_statement(SmallPearlParser.Sequential_control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#sequential_control_statement}.
	 * @param ctx the parse tree
	 */
	void exitSequential_control_statement(SmallPearlParser.Sequential_control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(SmallPearlParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(SmallPearlParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#then_block}.
	 * @param ctx the parse tree
	 */
	void enterThen_block(SmallPearlParser.Then_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#then_block}.
	 * @param ctx the parse tree
	 */
	void exitThen_block(SmallPearlParser.Then_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(SmallPearlParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(SmallPearlParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(SmallPearlParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(SmallPearlParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#case_statement_selection1}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement_selection1(SmallPearlParser.Case_statement_selection1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#case_statement_selection1}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement_selection1(SmallPearlParser.Case_statement_selection1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#case_statement_selection1_alt}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement_selection1_alt(SmallPearlParser.Case_statement_selection1_altContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#case_statement_selection1_alt}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement_selection1_alt(SmallPearlParser.Case_statement_selection1_altContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#case_statement_selection_out}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement_selection_out(SmallPearlParser.Case_statement_selection_outContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#case_statement_selection_out}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement_selection_out(SmallPearlParser.Case_statement_selection_outContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#case_statement_selection2}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement_selection2(SmallPearlParser.Case_statement_selection2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#case_statement_selection2}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement_selection2(SmallPearlParser.Case_statement_selection2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#case_statement_selection2_alt}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement_selection2_alt(SmallPearlParser.Case_statement_selection2_altContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#case_statement_selection2_alt}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement_selection2_alt(SmallPearlParser.Case_statement_selection2_altContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#case_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_list(SmallPearlParser.Case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#case_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_list(SmallPearlParser.Case_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#index_section}.
	 * @param ctx the parse tree
	 */
	void enterIndex_section(SmallPearlParser.Index_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#index_section}.
	 * @param ctx the parse tree
	 */
	void exitIndex_section(SmallPearlParser.Index_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#constantCharacterString}.
	 * @param ctx the parse tree
	 */
	void enterConstantCharacterString(SmallPearlParser.ConstantCharacterStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#constantCharacterString}.
	 * @param ctx the parse tree
	 */
	void exitConstantCharacterString(SmallPearlParser.ConstantCharacterStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(SmallPearlParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(SmallPearlParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#blockId}.
	 * @param ctx the parse tree
	 */
	void enterBlockId(SmallPearlParser.BlockIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#blockId}.
	 * @param ctx the parse tree
	 */
	void exitBlockId(SmallPearlParser.BlockIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(SmallPearlParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(SmallPearlParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void enterLoopBody(SmallPearlParser.LoopBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void exitLoopBody(SmallPearlParser.LoopBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#loopStatement_for}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement_for(SmallPearlParser.LoopStatement_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#loopStatement_for}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement_for(SmallPearlParser.LoopStatement_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#loopStatement_from}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement_from(SmallPearlParser.LoopStatement_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#loopStatement_from}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement_from(SmallPearlParser.LoopStatement_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#loopStatement_by}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement_by(SmallPearlParser.LoopStatement_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#loopStatement_by}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement_by(SmallPearlParser.LoopStatement_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#loopStatement_to}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement_to(SmallPearlParser.LoopStatement_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#loopStatement_to}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement_to(SmallPearlParser.LoopStatement_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#loopStatement_while}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement_while(SmallPearlParser.LoopStatement_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#loopStatement_while}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement_while(SmallPearlParser.LoopStatement_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#loopStatement_end}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement_end(SmallPearlParser.LoopStatement_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#loopStatement_end}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement_end(SmallPearlParser.LoopStatement_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#realtime_statement}.
	 * @param ctx the parse tree
	 */
	void enterRealtime_statement(SmallPearlParser.Realtime_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#realtime_statement}.
	 * @param ctx the parse tree
	 */
	void exitRealtime_statement(SmallPearlParser.Realtime_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#task_control_statement}.
	 * @param ctx the parse tree
	 */
	void enterTask_control_statement(SmallPearlParser.Task_control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#task_control_statement}.
	 * @param ctx the parse tree
	 */
	void exitTask_control_statement(SmallPearlParser.Task_control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#task_terminating}.
	 * @param ctx the parse tree
	 */
	void enterTask_terminating(SmallPearlParser.Task_terminatingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#task_terminating}.
	 * @param ctx the parse tree
	 */
	void exitTask_terminating(SmallPearlParser.Task_terminatingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#task_suspending}.
	 * @param ctx the parse tree
	 */
	void enterTask_suspending(SmallPearlParser.Task_suspendingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#task_suspending}.
	 * @param ctx the parse tree
	 */
	void exitTask_suspending(SmallPearlParser.Task_suspendingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#taskContinuation}.
	 * @param ctx the parse tree
	 */
	void enterTaskContinuation(SmallPearlParser.TaskContinuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#taskContinuation}.
	 * @param ctx the parse tree
	 */
	void exitTaskContinuation(SmallPearlParser.TaskContinuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#taskResume}.
	 * @param ctx the parse tree
	 */
	void enterTaskResume(SmallPearlParser.TaskResumeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#taskResume}.
	 * @param ctx the parse tree
	 */
	void exitTaskResume(SmallPearlParser.TaskResumeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#task_preventing}.
	 * @param ctx the parse tree
	 */
	void enterTask_preventing(SmallPearlParser.Task_preventingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#task_preventing}.
	 * @param ctx the parse tree
	 */
	void exitTask_preventing(SmallPearlParser.Task_preventingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#taskStart}.
	 * @param ctx the parse tree
	 */
	void enterTaskStart(SmallPearlParser.TaskStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#taskStart}.
	 * @param ctx the parse tree
	 */
	void exitTaskStart(SmallPearlParser.TaskStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#priority}.
	 * @param ctx the parse tree
	 */
	void enterPriority(SmallPearlParser.PriorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#priority}.
	 * @param ctx the parse tree
	 */
	void exitPriority(SmallPearlParser.PriorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#frequency}.
	 * @param ctx the parse tree
	 */
	void enterFrequency(SmallPearlParser.FrequencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#frequency}.
	 * @param ctx the parse tree
	 */
	void exitFrequency(SmallPearlParser.FrequencyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#startCondition}.
	 * @param ctx the parse tree
	 */
	void enterStartCondition(SmallPearlParser.StartConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#startCondition}.
	 * @param ctx the parse tree
	 */
	void exitStartCondition(SmallPearlParser.StartConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#startConditionAFTER}.
	 * @param ctx the parse tree
	 */
	void enterStartConditionAFTER(SmallPearlParser.StartConditionAFTERContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#startConditionAFTER}.
	 * @param ctx the parse tree
	 */
	void exitStartConditionAFTER(SmallPearlParser.StartConditionAFTERContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#startConditionAT}.
	 * @param ctx the parse tree
	 */
	void enterStartConditionAT(SmallPearlParser.StartConditionATContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#startConditionAT}.
	 * @param ctx the parse tree
	 */
	void exitStartConditionAT(SmallPearlParser.StartConditionATContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#startConditionWHEN}.
	 * @param ctx the parse tree
	 */
	void enterStartConditionWHEN(SmallPearlParser.StartConditionWHENContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#startConditionWHEN}.
	 * @param ctx the parse tree
	 */
	void exitStartConditionWHEN(SmallPearlParser.StartConditionWHENContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#task_coordination_statement}.
	 * @param ctx the parse tree
	 */
	void enterTask_coordination_statement(SmallPearlParser.Task_coordination_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#task_coordination_statement}.
	 * @param ctx the parse tree
	 */
	void exitTask_coordination_statement(SmallPearlParser.Task_coordination_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#listOfNames}.
	 * @param ctx the parse tree
	 */
	void enterListOfNames(SmallPearlParser.ListOfNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#listOfNames}.
	 * @param ctx the parse tree
	 */
	void exitListOfNames(SmallPearlParser.ListOfNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#semaRequest}.
	 * @param ctx the parse tree
	 */
	void enterSemaRequest(SmallPearlParser.SemaRequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#semaRequest}.
	 * @param ctx the parse tree
	 */
	void exitSemaRequest(SmallPearlParser.SemaRequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#semaRelease}.
	 * @param ctx the parse tree
	 */
	void enterSemaRelease(SmallPearlParser.SemaReleaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#semaRelease}.
	 * @param ctx the parse tree
	 */
	void exitSemaRelease(SmallPearlParser.SemaReleaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#semaTry}.
	 * @param ctx the parse tree
	 */
	void enterSemaTry(SmallPearlParser.SemaTryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#semaTry}.
	 * @param ctx the parse tree
	 */
	void exitSemaTry(SmallPearlParser.SemaTryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#boltDenotation}.
	 * @param ctx the parse tree
	 */
	void enterBoltDenotation(SmallPearlParser.BoltDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#boltDenotation}.
	 * @param ctx the parse tree
	 */
	void exitBoltDenotation(SmallPearlParser.BoltDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#boltReserve}.
	 * @param ctx the parse tree
	 */
	void enterBoltReserve(SmallPearlParser.BoltReserveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#boltReserve}.
	 * @param ctx the parse tree
	 */
	void exitBoltReserve(SmallPearlParser.BoltReserveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#boltFree}.
	 * @param ctx the parse tree
	 */
	void enterBoltFree(SmallPearlParser.BoltFreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#boltFree}.
	 * @param ctx the parse tree
	 */
	void exitBoltFree(SmallPearlParser.BoltFreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#boltEnter}.
	 * @param ctx the parse tree
	 */
	void enterBoltEnter(SmallPearlParser.BoltEnterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#boltEnter}.
	 * @param ctx the parse tree
	 */
	void exitBoltEnter(SmallPearlParser.BoltEnterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#boltLeave}.
	 * @param ctx the parse tree
	 */
	void enterBoltLeave(SmallPearlParser.BoltLeaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#boltLeave}.
	 * @param ctx the parse tree
	 */
	void exitBoltLeave(SmallPearlParser.BoltLeaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#interrupt_statement}.
	 * @param ctx the parse tree
	 */
	void enterInterrupt_statement(SmallPearlParser.Interrupt_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#interrupt_statement}.
	 * @param ctx the parse tree
	 */
	void exitInterrupt_statement(SmallPearlParser.Interrupt_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#io_statement}.
	 * @param ctx the parse tree
	 */
	void enterIo_statement(SmallPearlParser.Io_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#io_statement}.
	 * @param ctx the parse tree
	 */
	void exitIo_statement(SmallPearlParser.Io_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_statement(SmallPearlParser.Open_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_statement(SmallPearlParser.Open_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#open_parameterlist}.
	 * @param ctx the parse tree
	 */
	void enterOpen_parameterlist(SmallPearlParser.Open_parameterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#open_parameterlist}.
	 * @param ctx the parse tree
	 */
	void exitOpen_parameterlist(SmallPearlParser.Open_parameterlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#open_parameter}.
	 * @param ctx the parse tree
	 */
	void enterOpen_parameter(SmallPearlParser.Open_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#open_parameter}.
	 * @param ctx the parse tree
	 */
	void exitOpen_parameter(SmallPearlParser.Open_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#open_parameter_idf}.
	 * @param ctx the parse tree
	 */
	void enterOpen_parameter_idf(SmallPearlParser.Open_parameter_idfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#open_parameter_idf}.
	 * @param ctx the parse tree
	 */
	void exitOpen_parameter_idf(SmallPearlParser.Open_parameter_idfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#open_parameter_old_new_any}.
	 * @param ctx the parse tree
	 */
	void enterOpen_parameter_old_new_any(SmallPearlParser.Open_parameter_old_new_anyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#open_parameter_old_new_any}.
	 * @param ctx the parse tree
	 */
	void exitOpen_parameter_old_new_any(SmallPearlParser.Open_parameter_old_new_anyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#open_close_parameter_can_prm}.
	 * @param ctx the parse tree
	 */
	void enterOpen_close_parameter_can_prm(SmallPearlParser.Open_close_parameter_can_prmContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#open_close_parameter_can_prm}.
	 * @param ctx the parse tree
	 */
	void exitOpen_close_parameter_can_prm(SmallPearlParser.Open_close_parameter_can_prmContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_statement(SmallPearlParser.Close_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_statement(SmallPearlParser.Close_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#close_parameterlist}.
	 * @param ctx the parse tree
	 */
	void enterClose_parameterlist(SmallPearlParser.Close_parameterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#close_parameterlist}.
	 * @param ctx the parse tree
	 */
	void exitClose_parameterlist(SmallPearlParser.Close_parameterlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#close_parameter}.
	 * @param ctx the parse tree
	 */
	void enterClose_parameter(SmallPearlParser.Close_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#close_parameter}.
	 * @param ctx the parse tree
	 */
	void exitClose_parameter(SmallPearlParser.Close_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#getStatement}.
	 * @param ctx the parse tree
	 */
	void enterGetStatement(SmallPearlParser.GetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#getStatement}.
	 * @param ctx the parse tree
	 */
	void exitGetStatement(SmallPearlParser.GetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#putStatement}.
	 * @param ctx the parse tree
	 */
	void enterPutStatement(SmallPearlParser.PutStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#putStatement}.
	 * @param ctx the parse tree
	 */
	void exitPutStatement(SmallPearlParser.PutStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(SmallPearlParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(SmallPearlParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(SmallPearlParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(SmallPearlParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#takeStatement}.
	 * @param ctx the parse tree
	 */
	void enterTakeStatement(SmallPearlParser.TakeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#takeStatement}.
	 * @param ctx the parse tree
	 */
	void exitTakeStatement(SmallPearlParser.TakeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#sendStatement}.
	 * @param ctx the parse tree
	 */
	void enterSendStatement(SmallPearlParser.SendStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#sendStatement}.
	 * @param ctx the parse tree
	 */
	void exitSendStatement(SmallPearlParser.SendStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#ioListElement}.
	 * @param ctx the parse tree
	 */
	void enterIoListElement(SmallPearlParser.IoListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#ioListElement}.
	 * @param ctx the parse tree
	 */
	void exitIoListElement(SmallPearlParser.IoListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#ioDataList}.
	 * @param ctx the parse tree
	 */
	void enterIoDataList(SmallPearlParser.IoDataListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#ioDataList}.
	 * @param ctx the parse tree
	 */
	void exitIoDataList(SmallPearlParser.IoDataListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#listOfFormatPositions}.
	 * @param ctx the parse tree
	 */
	void enterListOfFormatPositions(SmallPearlParser.ListOfFormatPositionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#listOfFormatPositions}.
	 * @param ctx the parse tree
	 */
	void exitListOfFormatPositions(SmallPearlParser.ListOfFormatPositionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#dationName}.
	 * @param ctx the parse tree
	 */
	void enterDationName(SmallPearlParser.DationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#dationName}.
	 * @param ctx the parse tree
	 */
	void exitDationName(SmallPearlParser.DationNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorFormat}
	 * labeled alternative in {@link SmallPearlParser#formatPosition}.
	 * @param ctx the parse tree
	 */
	void enterFactorFormat(SmallPearlParser.FactorFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorFormat}
	 * labeled alternative in {@link SmallPearlParser#formatPosition}.
	 * @param ctx the parse tree
	 */
	void exitFactorFormat(SmallPearlParser.FactorFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorPosition}
	 * labeled alternative in {@link SmallPearlParser#formatPosition}.
	 * @param ctx the parse tree
	 */
	void enterFactorPosition(SmallPearlParser.FactorPositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorPosition}
	 * labeled alternative in {@link SmallPearlParser#formatPosition}.
	 * @param ctx the parse tree
	 */
	void exitFactorPosition(SmallPearlParser.FactorPositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorFormatPosition}
	 * labeled alternative in {@link SmallPearlParser#formatPosition}.
	 * @param ctx the parse tree
	 */
	void enterFactorFormatPosition(SmallPearlParser.FactorFormatPositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorFormatPosition}
	 * labeled alternative in {@link SmallPearlParser#formatPosition}.
	 * @param ctx the parse tree
	 */
	void exitFactorFormatPosition(SmallPearlParser.FactorFormatPositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SmallPearlParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SmallPearlParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(SmallPearlParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(SmallPearlParser.FormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#absolutePosition}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePosition(SmallPearlParser.AbsolutePositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#absolutePosition}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePosition(SmallPearlParser.AbsolutePositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#positionCOL}.
	 * @param ctx the parse tree
	 */
	void enterPositionCOL(SmallPearlParser.PositionCOLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#positionCOL}.
	 * @param ctx the parse tree
	 */
	void exitPositionCOL(SmallPearlParser.PositionCOLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#positionLINE}.
	 * @param ctx the parse tree
	 */
	void enterPositionLINE(SmallPearlParser.PositionLINEContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#positionLINE}.
	 * @param ctx the parse tree
	 */
	void exitPositionLINE(SmallPearlParser.PositionLINEContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#positionPOS}.
	 * @param ctx the parse tree
	 */
	void enterPositionPOS(SmallPearlParser.PositionPOSContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#positionPOS}.
	 * @param ctx the parse tree
	 */
	void exitPositionPOS(SmallPearlParser.PositionPOSContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#positionSOP}.
	 * @param ctx the parse tree
	 */
	void enterPositionSOP(SmallPearlParser.PositionSOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#positionSOP}.
	 * @param ctx the parse tree
	 */
	void exitPositionSOP(SmallPearlParser.PositionSOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#position}.
	 * @param ctx the parse tree
	 */
	void enterPosition(SmallPearlParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#position}.
	 * @param ctx the parse tree
	 */
	void exitPosition(SmallPearlParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#relativePosition}.
	 * @param ctx the parse tree
	 */
	void enterRelativePosition(SmallPearlParser.RelativePositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#relativePosition}.
	 * @param ctx the parse tree
	 */
	void exitRelativePosition(SmallPearlParser.RelativePositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#openClosePositionRST}.
	 * @param ctx the parse tree
	 */
	void enterOpenClosePositionRST(SmallPearlParser.OpenClosePositionRSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#openClosePositionRST}.
	 * @param ctx the parse tree
	 */
	void exitOpenClosePositionRST(SmallPearlParser.OpenClosePositionRSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#positionPAGE}.
	 * @param ctx the parse tree
	 */
	void enterPositionPAGE(SmallPearlParser.PositionPAGEContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#positionPAGE}.
	 * @param ctx the parse tree
	 */
	void exitPositionPAGE(SmallPearlParser.PositionPAGEContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#positionSKIP}.
	 * @param ctx the parse tree
	 */
	void enterPositionSKIP(SmallPearlParser.PositionSKIPContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#positionSKIP}.
	 * @param ctx the parse tree
	 */
	void exitPositionSKIP(SmallPearlParser.PositionSKIPContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#positionX}.
	 * @param ctx the parse tree
	 */
	void enterPositionX(SmallPearlParser.PositionXContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#positionX}.
	 * @param ctx the parse tree
	 */
	void exitPositionX(SmallPearlParser.PositionXContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#positionADV}.
	 * @param ctx the parse tree
	 */
	void enterPositionADV(SmallPearlParser.PositionADVContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#positionADV}.
	 * @param ctx the parse tree
	 */
	void exitPositionADV(SmallPearlParser.PositionADVContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#positionEOF}.
	 * @param ctx the parse tree
	 */
	void enterPositionEOF(SmallPearlParser.PositionEOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#positionEOF}.
	 * @param ctx the parse tree
	 */
	void exitPositionEOF(SmallPearlParser.PositionEOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#fixedFormat}.
	 * @param ctx the parse tree
	 */
	void enterFixedFormat(SmallPearlParser.FixedFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#fixedFormat}.
	 * @param ctx the parse tree
	 */
	void exitFixedFormat(SmallPearlParser.FixedFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#fieldWidth}.
	 * @param ctx the parse tree
	 */
	void enterFieldWidth(SmallPearlParser.FieldWidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#fieldWidth}.
	 * @param ctx the parse tree
	 */
	void exitFieldWidth(SmallPearlParser.FieldWidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#significance}.
	 * @param ctx the parse tree
	 */
	void enterSignificance(SmallPearlParser.SignificanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#significance}.
	 * @param ctx the parse tree
	 */
	void exitSignificance(SmallPearlParser.SignificanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatFormatE}
	 * labeled alternative in {@link SmallPearlParser#floatFormat}.
	 * @param ctx the parse tree
	 */
	void enterFloatFormatE(SmallPearlParser.FloatFormatEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatFormatE}
	 * labeled alternative in {@link SmallPearlParser#floatFormat}.
	 * @param ctx the parse tree
	 */
	void exitFloatFormatE(SmallPearlParser.FloatFormatEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatFormatE3}
	 * labeled alternative in {@link SmallPearlParser#floatFormat}.
	 * @param ctx the parse tree
	 */
	void enterFloatFormatE3(SmallPearlParser.FloatFormatE3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code floatFormatE3}
	 * labeled alternative in {@link SmallPearlParser#floatFormat}.
	 * @param ctx the parse tree
	 */
	void exitFloatFormatE3(SmallPearlParser.FloatFormatE3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bitFormat1}
	 * labeled alternative in {@link SmallPearlParser#bitFormat}.
	 * @param ctx the parse tree
	 */
	void enterBitFormat1(SmallPearlParser.BitFormat1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bitFormat1}
	 * labeled alternative in {@link SmallPearlParser#bitFormat}.
	 * @param ctx the parse tree
	 */
	void exitBitFormat1(SmallPearlParser.BitFormat1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bitFormat2}
	 * labeled alternative in {@link SmallPearlParser#bitFormat}.
	 * @param ctx the parse tree
	 */
	void enterBitFormat2(SmallPearlParser.BitFormat2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bitFormat2}
	 * labeled alternative in {@link SmallPearlParser#bitFormat}.
	 * @param ctx the parse tree
	 */
	void exitBitFormat2(SmallPearlParser.BitFormat2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bitFormat3}
	 * labeled alternative in {@link SmallPearlParser#bitFormat}.
	 * @param ctx the parse tree
	 */
	void enterBitFormat3(SmallPearlParser.BitFormat3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bitFormat3}
	 * labeled alternative in {@link SmallPearlParser#bitFormat}.
	 * @param ctx the parse tree
	 */
	void exitBitFormat3(SmallPearlParser.BitFormat3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bitFormat4}
	 * labeled alternative in {@link SmallPearlParser#bitFormat}.
	 * @param ctx the parse tree
	 */
	void enterBitFormat4(SmallPearlParser.BitFormat4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bitFormat4}
	 * labeled alternative in {@link SmallPearlParser#bitFormat}.
	 * @param ctx the parse tree
	 */
	void exitBitFormat4(SmallPearlParser.BitFormat4Context ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#numberOfCharacters}.
	 * @param ctx the parse tree
	 */
	void enterNumberOfCharacters(SmallPearlParser.NumberOfCharactersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#numberOfCharacters}.
	 * @param ctx the parse tree
	 */
	void exitNumberOfCharacters(SmallPearlParser.NumberOfCharactersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#timeFormat}.
	 * @param ctx the parse tree
	 */
	void enterTimeFormat(SmallPearlParser.TimeFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#timeFormat}.
	 * @param ctx the parse tree
	 */
	void exitTimeFormat(SmallPearlParser.TimeFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#durationFormat}.
	 * @param ctx the parse tree
	 */
	void enterDurationFormat(SmallPearlParser.DurationFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#durationFormat}.
	 * @param ctx the parse tree
	 */
	void exitDurationFormat(SmallPearlParser.DurationFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#decimalPositions}.
	 * @param ctx the parse tree
	 */
	void enterDecimalPositions(SmallPearlParser.DecimalPositionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#decimalPositions}.
	 * @param ctx the parse tree
	 */
	void exitDecimalPositions(SmallPearlParser.DecimalPositionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#scaleFactor}.
	 * @param ctx the parse tree
	 */
	void enterScaleFactor(SmallPearlParser.ScaleFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#scaleFactor}.
	 * @param ctx the parse tree
	 */
	void exitScaleFactor(SmallPearlParser.ScaleFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterStringFormatA}
	 * labeled alternative in {@link SmallPearlParser#characterStringFormat}.
	 * @param ctx the parse tree
	 */
	void enterCharacterStringFormatA(SmallPearlParser.CharacterStringFormatAContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterStringFormatA}
	 * labeled alternative in {@link SmallPearlParser#characterStringFormat}.
	 * @param ctx the parse tree
	 */
	void exitCharacterStringFormatA(SmallPearlParser.CharacterStringFormatAContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterStringFormatS}
	 * labeled alternative in {@link SmallPearlParser#characterStringFormat}.
	 * @param ctx the parse tree
	 */
	void enterCharacterStringFormatS(SmallPearlParser.CharacterStringFormatSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterStringFormatS}
	 * labeled alternative in {@link SmallPearlParser#characterStringFormat}.
	 * @param ctx the parse tree
	 */
	void exitCharacterStringFormatS(SmallPearlParser.CharacterStringFormatSContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#channel}.
	 * @param ctx the parse tree
	 */
	void enterChannel(SmallPearlParser.ChannelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#channel}.
	 * @param ctx the parse tree
	 */
	void exitChannel(SmallPearlParser.ChannelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#index_array}.
	 * @param ctx the parse tree
	 */
	void enterIndex_array(SmallPearlParser.Index_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#index_array}.
	 * @param ctx the parse tree
	 */
	void exitIndex_array(SmallPearlParser.Index_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#arraySlice}.
	 * @param ctx the parse tree
	 */
	void enterArraySlice(SmallPearlParser.ArraySliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#arraySlice}.
	 * @param ctx the parse tree
	 */
	void exitArraySlice(SmallPearlParser.ArraySliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#startIndex}.
	 * @param ctx the parse tree
	 */
	void enterStartIndex(SmallPearlParser.StartIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#startIndex}.
	 * @param ctx the parse tree
	 */
	void exitStartIndex(SmallPearlParser.StartIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#endIndex}.
	 * @param ctx the parse tree
	 */
	void enterEndIndex(SmallPearlParser.EndIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#endIndex}.
	 * @param ctx the parse tree
	 */
	void exitEndIndex(SmallPearlParser.EndIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#interruptDenotation}.
	 * @param ctx the parse tree
	 */
	void enterInterruptDenotation(SmallPearlParser.InterruptDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#interruptDenotation}.
	 * @param ctx the parse tree
	 */
	void exitInterruptDenotation(SmallPearlParser.InterruptDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#dationDenotation}.
	 * @param ctx the parse tree
	 */
	void enterDationDenotation(SmallPearlParser.DationDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#dationDenotation}.
	 * @param ctx the parse tree
	 */
	void exitDationDenotation(SmallPearlParser.DationDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typeDation}.
	 * @param ctx the parse tree
	 */
	void enterTypeDation(SmallPearlParser.TypeDationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typeDation}.
	 * @param ctx the parse tree
	 */
	void exitTypeDation(SmallPearlParser.TypeDationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sourceSinkAttributeIN}
	 * labeled alternative in {@link SmallPearlParser#sourceSinkAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSourceSinkAttributeIN(SmallPearlParser.SourceSinkAttributeINContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sourceSinkAttributeIN}
	 * labeled alternative in {@link SmallPearlParser#sourceSinkAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSourceSinkAttributeIN(SmallPearlParser.SourceSinkAttributeINContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sourceSinkAttributeOUT}
	 * labeled alternative in {@link SmallPearlParser#sourceSinkAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSourceSinkAttributeOUT(SmallPearlParser.SourceSinkAttributeOUTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sourceSinkAttributeOUT}
	 * labeled alternative in {@link SmallPearlParser#sourceSinkAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSourceSinkAttributeOUT(SmallPearlParser.SourceSinkAttributeOUTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sourceSinkAttributeINOUT}
	 * labeled alternative in {@link SmallPearlParser#sourceSinkAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSourceSinkAttributeINOUT(SmallPearlParser.SourceSinkAttributeINOUTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sourceSinkAttributeINOUT}
	 * labeled alternative in {@link SmallPearlParser#sourceSinkAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSourceSinkAttributeINOUT(SmallPearlParser.SourceSinkAttributeINOUTContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#systemDation}.
	 * @param ctx the parse tree
	 */
	void enterSystemDation(SmallPearlParser.SystemDationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#systemDation}.
	 * @param ctx the parse tree
	 */
	void exitSystemDation(SmallPearlParser.SystemDationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#classAttribute}.
	 * @param ctx the parse tree
	 */
	void enterClassAttribute(SmallPearlParser.ClassAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#classAttribute}.
	 * @param ctx the parse tree
	 */
	void exitClassAttribute(SmallPearlParser.ClassAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#alphicDation}.
	 * @param ctx the parse tree
	 */
	void enterAlphicDation(SmallPearlParser.AlphicDationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#alphicDation}.
	 * @param ctx the parse tree
	 */
	void exitAlphicDation(SmallPearlParser.AlphicDationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#basicDation}.
	 * @param ctx the parse tree
	 */
	void enterBasicDation(SmallPearlParser.BasicDationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#basicDation}.
	 * @param ctx the parse tree
	 */
	void exitBasicDation(SmallPearlParser.BasicDationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeOfTransmissionDataALL}
	 * labeled alternative in {@link SmallPearlParser#typeOfTransmissionData}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfTransmissionDataALL(SmallPearlParser.TypeOfTransmissionDataALLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeOfTransmissionDataALL}
	 * labeled alternative in {@link SmallPearlParser#typeOfTransmissionData}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfTransmissionDataALL(SmallPearlParser.TypeOfTransmissionDataALLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeOfTransmissionDataSimpleType}
	 * labeled alternative in {@link SmallPearlParser#typeOfTransmissionData}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfTransmissionDataSimpleType(SmallPearlParser.TypeOfTransmissionDataSimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeOfTransmissionDataSimpleType}
	 * labeled alternative in {@link SmallPearlParser#typeOfTransmissionData}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfTransmissionDataSimpleType(SmallPearlParser.TypeOfTransmissionDataSimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeOfTransmissionDataCompoundType}
	 * labeled alternative in {@link SmallPearlParser#typeOfTransmissionData}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfTransmissionDataCompoundType(SmallPearlParser.TypeOfTransmissionDataCompoundTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeOfTransmissionDataCompoundType}
	 * labeled alternative in {@link SmallPearlParser#typeOfTransmissionData}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfTransmissionDataCompoundType(SmallPearlParser.TypeOfTransmissionDataCompoundTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#accessAttribute}.
	 * @param ctx the parse tree
	 */
	void enterAccessAttribute(SmallPearlParser.AccessAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#accessAttribute}.
	 * @param ctx the parse tree
	 */
	void exitAccessAttribute(SmallPearlParser.AccessAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#typology}.
	 * @param ctx the parse tree
	 */
	void enterTypology(SmallPearlParser.TypologyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#typology}.
	 * @param ctx the parse tree
	 */
	void exitTypology(SmallPearlParser.TypologyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dimension1Star}
	 * labeled alternative in {@link SmallPearlParser#dimension1}.
	 * @param ctx the parse tree
	 */
	void enterDimension1Star(SmallPearlParser.Dimension1StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dimension1Star}
	 * labeled alternative in {@link SmallPearlParser#dimension1}.
	 * @param ctx the parse tree
	 */
	void exitDimension1Star(SmallPearlParser.Dimension1StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dimension1Integer}
	 * labeled alternative in {@link SmallPearlParser#dimension1}.
	 * @param ctx the parse tree
	 */
	void enterDimension1Integer(SmallPearlParser.Dimension1IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dimension1Integer}
	 * labeled alternative in {@link SmallPearlParser#dimension1}.
	 * @param ctx the parse tree
	 */
	void exitDimension1Integer(SmallPearlParser.Dimension1IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dimension2Integer}
	 * labeled alternative in {@link SmallPearlParser#dimension2}.
	 * @param ctx the parse tree
	 */
	void enterDimension2Integer(SmallPearlParser.Dimension2IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dimension2Integer}
	 * labeled alternative in {@link SmallPearlParser#dimension2}.
	 * @param ctx the parse tree
	 */
	void exitDimension2Integer(SmallPearlParser.Dimension2IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dimension3Integer}
	 * labeled alternative in {@link SmallPearlParser#dimension3}.
	 * @param ctx the parse tree
	 */
	void enterDimension3Integer(SmallPearlParser.Dimension3IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dimension3Integer}
	 * labeled alternative in {@link SmallPearlParser#dimension3}.
	 * @param ctx the parse tree
	 */
	void exitDimension3Integer(SmallPearlParser.Dimension3IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#tfu}.
	 * @param ctx the parse tree
	 */
	void enterTfu(SmallPearlParser.TfuContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#tfu}.
	 * @param ctx the parse tree
	 */
	void exitTfu(SmallPearlParser.TfuContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#tfuMax}.
	 * @param ctx the parse tree
	 */
	void enterTfuMax(SmallPearlParser.TfuMaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#tfuMax}.
	 * @param ctx the parse tree
	 */
	void exitTfuMax(SmallPearlParser.TfuMaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#dimensionAttribute}.
	 * @param ctx the parse tree
	 */
	void enterDimensionAttribute(SmallPearlParser.DimensionAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#dimensionAttribute}.
	 * @param ctx the parse tree
	 */
	void exitDimensionAttribute(SmallPearlParser.DimensionAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#dimensionAttributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDimensionAttributeDeclaration(SmallPearlParser.DimensionAttributeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#dimensionAttributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDimensionAttributeDeclaration(SmallPearlParser.DimensionAttributeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#boundaryDenotation}.
	 * @param ctx the parse tree
	 */
	void enterBoundaryDenotation(SmallPearlParser.BoundaryDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#boundaryDenotation}.
	 * @param ctx the parse tree
	 */
	void exitBoundaryDenotation(SmallPearlParser.BoundaryDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#indices}.
	 * @param ctx the parse tree
	 */
	void enterIndices(SmallPearlParser.IndicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#indices}.
	 * @param ctx the parse tree
	 */
	void exitIndices(SmallPearlParser.IndicesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMultiplicativeExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMultiplicativeExpression(SmallPearlParser.UnaryMultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMultiplicativeExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMultiplicativeExpression(SmallPearlParser.UnaryMultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SmallPearlParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SmallPearlParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sizeofExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSizeofExpression(SmallPearlParser.SizeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sizeofExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSizeofExpression(SmallPearlParser.SizeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(SmallPearlParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(SmallPearlParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqRelationalExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqRelationalExpression(SmallPearlParser.EqRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqRelationalExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqRelationalExpression(SmallPearlParser.EqRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractiveExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtractiveExpression(SmallPearlParser.SubtractiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractiveExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtractiveExpression(SmallPearlParser.SubtractiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code upbDyadicExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUpbDyadicExpression(SmallPearlParser.UpbDyadicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code upbDyadicExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUpbDyadicExpression(SmallPearlParser.UpbDyadicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atanExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtanExpression(SmallPearlParser.AtanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atanExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtanExpression(SmallPearlParser.AtanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(SmallPearlParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(SmallPearlParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code taskFunction}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTaskFunction(SmallPearlParser.TaskFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code taskFunction}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTaskFunction(SmallPearlParser.TaskFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtRelationalExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGtRelationalExpression(SmallPearlParser.GtRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtRelationalExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGtRelationalExpression(SmallPearlParser.GtRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONTExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCONTExpression(SmallPearlParser.CONTExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONTExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCONTExpression(SmallPearlParser.CONTExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code absExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAbsExpression(SmallPearlParser.AbsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAbsExpression(SmallPearlParser.AbsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neRelationalExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNeRelationalExpression(SmallPearlParser.NeRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neRelationalExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNeRelationalExpression(SmallPearlParser.NeRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltRelationalExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtRelationalExpression(SmallPearlParser.LtRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltRelationalExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtRelationalExpression(SmallPearlParser.LtRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(SmallPearlParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(SmallPearlParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prioFunction}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrioFunction(SmallPearlParser.PrioFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prioFunction}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrioFunction(SmallPearlParser.PrioFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryAdditiveExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryAdditiveExpression(SmallPearlParser.UnaryAdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryAdditiveExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryAdditiveExpression(SmallPearlParser.UnaryAdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code remainderExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRemainderExpression(SmallPearlParser.RemainderExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code remainderExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRemainderExpression(SmallPearlParser.RemainderExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code baseExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBaseExpression(SmallPearlParser.BaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBaseExpression(SmallPearlParser.BaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(SmallPearlParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(SmallPearlParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lnExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLnExpression(SmallPearlParser.LnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lnExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLnExpression(SmallPearlParser.LnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cosExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCosExpression(SmallPearlParser.CosExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cosExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCosExpression(SmallPearlParser.CosExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(SmallPearlParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(SmallPearlParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpExpression(SmallPearlParser.ExpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpExpression(SmallPearlParser.ExpExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TOFIXEDExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTOFIXEDExpression(SmallPearlParser.TOFIXEDExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TOFIXEDExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTOFIXEDExpression(SmallPearlParser.TOFIXEDExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isRelationalExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsRelationalExpression(SmallPearlParser.IsRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isRelationalExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsRelationalExpression(SmallPearlParser.IsRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideIntegerExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideIntegerExpression(SmallPearlParser.DivideIntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideIntegerExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideIntegerExpression(SmallPearlParser.DivideIntegerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unarySubtractiveExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnarySubtractiveExpression(SmallPearlParser.UnarySubtractiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unarySubtractiveExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnarySubtractiveExpression(SmallPearlParser.UnarySubtractiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lwbMonadicExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLwbMonadicExpression(SmallPearlParser.LwbMonadicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lwbMonadicExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLwbMonadicExpression(SmallPearlParser.LwbMonadicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code entierExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEntierExpression(SmallPearlParser.EntierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code entierExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEntierExpression(SmallPearlParser.EntierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code upbMonadicExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUpbMonadicExpression(SmallPearlParser.UpbMonadicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code upbMonadicExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUpbMonadicExpression(SmallPearlParser.UpbMonadicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nowFunction}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNowFunction(SmallPearlParser.NowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nowFunction}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNowFunction(SmallPearlParser.NowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code geRelationalExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGeRelationalExpression(SmallPearlParser.GeRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code geRelationalExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGeRelationalExpression(SmallPearlParser.GeRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqrtExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSqrtExpression(SmallPearlParser.SqrtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqrtExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSqrtExpression(SmallPearlParser.SqrtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tanExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTanExpression(SmallPearlParser.TanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tanExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTanExpression(SmallPearlParser.TanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sinExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSinExpression(SmallPearlParser.SinExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sinExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSinExpression(SmallPearlParser.SinExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leRelationalExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLeRelationalExpression(SmallPearlParser.LeRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leRelationalExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLeRelationalExpression(SmallPearlParser.LeRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dateFunction}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDateFunction(SmallPearlParser.DateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dateFunction}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDateFunction(SmallPearlParser.DateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSignExpression(SmallPearlParser.SignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSignExpression(SmallPearlParser.SignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lwbDyadicExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLwbDyadicExpression(SmallPearlParser.LwbDyadicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lwbDyadicExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLwbDyadicExpression(SmallPearlParser.LwbDyadicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TOFLOATExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTOFLOATExpression(SmallPearlParser.TOFLOATExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TOFLOATExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTOFLOATExpression(SmallPearlParser.TOFLOATExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isntRelationalExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsntRelationalExpression(SmallPearlParser.IsntRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isntRelationalExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsntRelationalExpression(SmallPearlParser.IsntRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code catExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCatExpression(SmallPearlParser.CatExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code catExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCatExpression(SmallPearlParser.CatExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TOCHARExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTOCHARExpression(SmallPearlParser.TOCHARExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TOCHARExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTOCHARExpression(SmallPearlParser.TOCHARExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(SmallPearlParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(SmallPearlParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tanhExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTanhExpression(SmallPearlParser.TanhExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tanhExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTanhExpression(SmallPearlParser.TanhExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cshiftExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCshiftExpression(SmallPearlParser.CshiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cshiftExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCshiftExpression(SmallPearlParser.CshiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExorExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExorExpression(SmallPearlParser.ExorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExorExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExorExpression(SmallPearlParser.ExorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unarySignedLiteralExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnarySignedLiteralExpression(SmallPearlParser.UnarySignedLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unarySignedLiteralExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnarySignedLiteralExpression(SmallPearlParser.UnarySignedLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TOBITExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTOBITExpression(SmallPearlParser.TOBITExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TOBITExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTOBITExpression(SmallPearlParser.TOBITExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fitExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFitExpression(SmallPearlParser.FitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fitExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFitExpression(SmallPearlParser.FitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exponentiationExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExponentiationExpression(SmallPearlParser.ExponentiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exponentiationExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExponentiationExpression(SmallPearlParser.ExponentiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code roundExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRoundExpression(SmallPearlParser.RoundExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code roundExpression}
	 * labeled alternative in {@link SmallPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRoundExpression(SmallPearlParser.RoundExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#unaryLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryLiteralExpression(SmallPearlParser.UnaryLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#unaryLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryLiteralExpression(SmallPearlParser.UnaryLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(SmallPearlParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(SmallPearlParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(SmallPearlParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(SmallPearlParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#numericLiteralUnsigned}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteralUnsigned(SmallPearlParser.NumericLiteralUnsignedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#numericLiteralUnsigned}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteralUnsigned(SmallPearlParser.NumericLiteralUnsignedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#numericLiteralPositive}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteralPositive(SmallPearlParser.NumericLiteralPositiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#numericLiteralPositive}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteralPositive(SmallPearlParser.NumericLiteralPositiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#numericLiteralNegative}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteralNegative(SmallPearlParser.NumericLiteralNegativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#numericLiteralNegative}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteralNegative(SmallPearlParser.NumericLiteralNegativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SmallPearlParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SmallPearlParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#listOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterListOfExpression(SmallPearlParser.ListOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#listOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitListOfExpression(SmallPearlParser.ListOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(SmallPearlParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(SmallPearlParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(SmallPearlParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(SmallPearlParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(SmallPearlParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(SmallPearlParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#constantFixedExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantFixedExpression(SmallPearlParser.ConstantFixedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#constantFixedExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantFixedExpression(SmallPearlParser.ConstantFixedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#additiveConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveConstantFixedExpressionTerm(SmallPearlParser.AdditiveConstantFixedExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#additiveConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveConstantFixedExpressionTerm(SmallPearlParser.AdditiveConstantFixedExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#subtractiveConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterSubtractiveConstantFixedExpressionTerm(SmallPearlParser.SubtractiveConstantFixedExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#subtractiveConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitSubtractiveConstantFixedExpressionTerm(SmallPearlParser.SubtractiveConstantFixedExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#constantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterConstantFixedExpressionTerm(SmallPearlParser.ConstantFixedExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#constantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitConstantFixedExpressionTerm(SmallPearlParser.ConstantFixedExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#multiplicationConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationConstantFixedExpressionTerm(SmallPearlParser.MultiplicationConstantFixedExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#multiplicationConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationConstantFixedExpressionTerm(SmallPearlParser.MultiplicationConstantFixedExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#divisionConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterDivisionConstantFixedExpressionTerm(SmallPearlParser.DivisionConstantFixedExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#divisionConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitDivisionConstantFixedExpressionTerm(SmallPearlParser.DivisionConstantFixedExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#remainderConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterRemainderConstantFixedExpressionTerm(SmallPearlParser.RemainderConstantFixedExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#remainderConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitRemainderConstantFixedExpressionTerm(SmallPearlParser.RemainderConstantFixedExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signPlus}
	 * labeled alternative in {@link SmallPearlParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSignPlus(SmallPearlParser.SignPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signPlus}
	 * labeled alternative in {@link SmallPearlParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSignPlus(SmallPearlParser.SignPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signMinus}
	 * labeled alternative in {@link SmallPearlParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSignMinus(SmallPearlParser.SignMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signMinus}
	 * labeled alternative in {@link SmallPearlParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSignMinus(SmallPearlParser.SignMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#constantFixedExpressionFactor}.
	 * @param ctx the parse tree
	 */
	void enterConstantFixedExpressionFactor(SmallPearlParser.ConstantFixedExpressionFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#constantFixedExpressionFactor}.
	 * @param ctx the parse tree
	 */
	void exitConstantFixedExpressionFactor(SmallPearlParser.ConstantFixedExpressionFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#constantFixedExpressionFit}.
	 * @param ctx the parse tree
	 */
	void enterConstantFixedExpressionFit(SmallPearlParser.ConstantFixedExpressionFitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#constantFixedExpressionFit}.
	 * @param ctx the parse tree
	 */
	void exitConstantFixedExpressionFit(SmallPearlParser.ConstantFixedExpressionFitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#convertStatement}.
	 * @param ctx the parse tree
	 */
	void enterConvertStatement(SmallPearlParser.ConvertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#convertStatement}.
	 * @param ctx the parse tree
	 */
	void exitConvertStatement(SmallPearlParser.ConvertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#convertToStatement}.
	 * @param ctx the parse tree
	 */
	void enterConvertToStatement(SmallPearlParser.ConvertToStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#convertToStatement}.
	 * @param ctx the parse tree
	 */
	void exitConvertToStatement(SmallPearlParser.ConvertToStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#convertFromStatement}.
	 * @param ctx the parse tree
	 */
	void enterConvertFromStatement(SmallPearlParser.ConvertFromStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#convertFromStatement}.
	 * @param ctx the parse tree
	 */
	void exitConvertFromStatement(SmallPearlParser.ConvertFromStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#listFormat}.
	 * @param ctx the parse tree
	 */
	void enterListFormat(SmallPearlParser.ListFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#listFormat}.
	 * @param ctx the parse tree
	 */
	void exitListFormat(SmallPearlParser.ListFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#rFormat}.
	 * @param ctx the parse tree
	 */
	void enterRFormat(SmallPearlParser.RFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#rFormat}.
	 * @param ctx the parse tree
	 */
	void exitRFormat(SmallPearlParser.RFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#stringSlice}.
	 * @param ctx the parse tree
	 */
	void enterStringSlice(SmallPearlParser.StringSliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#stringSlice}.
	 * @param ctx the parse tree
	 */
	void exitStringSlice(SmallPearlParser.StringSliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case1BitSlice}
	 * labeled alternative in {@link SmallPearlParser#bitSlice}.
	 * @param ctx the parse tree
	 */
	void enterCase1BitSlice(SmallPearlParser.Case1BitSliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case1BitSlice}
	 * labeled alternative in {@link SmallPearlParser#bitSlice}.
	 * @param ctx the parse tree
	 */
	void exitCase1BitSlice(SmallPearlParser.Case1BitSliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case2BitSlice}
	 * labeled alternative in {@link SmallPearlParser#bitSlice}.
	 * @param ctx the parse tree
	 */
	void enterCase2BitSlice(SmallPearlParser.Case2BitSliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case2BitSlice}
	 * labeled alternative in {@link SmallPearlParser#bitSlice}.
	 * @param ctx the parse tree
	 */
	void exitCase2BitSlice(SmallPearlParser.Case2BitSliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case3BitSlice}
	 * labeled alternative in {@link SmallPearlParser#bitSlice}.
	 * @param ctx the parse tree
	 */
	void enterCase3BitSlice(SmallPearlParser.Case3BitSliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case3BitSlice}
	 * labeled alternative in {@link SmallPearlParser#bitSlice}.
	 * @param ctx the parse tree
	 */
	void exitCase3BitSlice(SmallPearlParser.Case3BitSliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case1CharSlice}
	 * labeled alternative in {@link SmallPearlParser#charSlice}.
	 * @param ctx the parse tree
	 */
	void enterCase1CharSlice(SmallPearlParser.Case1CharSliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case1CharSlice}
	 * labeled alternative in {@link SmallPearlParser#charSlice}.
	 * @param ctx the parse tree
	 */
	void exitCase1CharSlice(SmallPearlParser.Case1CharSliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case3CharSlice}
	 * labeled alternative in {@link SmallPearlParser#charSlice}.
	 * @param ctx the parse tree
	 */
	void enterCase3CharSlice(SmallPearlParser.Case3CharSliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case3CharSlice}
	 * labeled alternative in {@link SmallPearlParser#charSlice}.
	 * @param ctx the parse tree
	 */
	void exitCase3CharSlice(SmallPearlParser.Case3CharSliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case4CharSlice}
	 * labeled alternative in {@link SmallPearlParser#charSlice}.
	 * @param ctx the parse tree
	 */
	void enterCase4CharSlice(SmallPearlParser.Case4CharSliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case4CharSlice}
	 * labeled alternative in {@link SmallPearlParser#charSlice}.
	 * @param ctx the parse tree
	 */
	void exitCase4CharSlice(SmallPearlParser.Case4CharSliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#referenceConstant}.
	 * @param ctx the parse tree
	 */
	void enterReferenceConstant(SmallPearlParser.ReferenceConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#referenceConstant}.
	 * @param ctx the parse tree
	 */
	void exitReferenceConstant(SmallPearlParser.ReferenceConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#fixedConstant}.
	 * @param ctx the parse tree
	 */
	void enterFixedConstant(SmallPearlParser.FixedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#fixedConstant}.
	 * @param ctx the parse tree
	 */
	void exitFixedConstant(SmallPearlParser.FixedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#fixedNumberPrecision}.
	 * @param ctx the parse tree
	 */
	void enterFixedNumberPrecision(SmallPearlParser.FixedNumberPrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#fixedNumberPrecision}.
	 * @param ctx the parse tree
	 */
	void exitFixedNumberPrecision(SmallPearlParser.FixedNumberPrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SmallPearlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SmallPearlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(SmallPearlParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(SmallPearlParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#bitStringConstant}.
	 * @param ctx the parse tree
	 */
	void enterBitStringConstant(SmallPearlParser.BitStringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#bitStringConstant}.
	 * @param ctx the parse tree
	 */
	void exitBitStringConstant(SmallPearlParser.BitStringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#timeConstant}.
	 * @param ctx the parse tree
	 */
	void enterTimeConstant(SmallPearlParser.TimeConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#timeConstant}.
	 * @param ctx the parse tree
	 */
	void exitTimeConstant(SmallPearlParser.TimeConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#durationConstant}.
	 * @param ctx the parse tree
	 */
	void enterDurationConstant(SmallPearlParser.DurationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#durationConstant}.
	 * @param ctx the parse tree
	 */
	void exitDurationConstant(SmallPearlParser.DurationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#hours}.
	 * @param ctx the parse tree
	 */
	void enterHours(SmallPearlParser.HoursContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#hours}.
	 * @param ctx the parse tree
	 */
	void exitHours(SmallPearlParser.HoursContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#minutes}.
	 * @param ctx the parse tree
	 */
	void enterMinutes(SmallPearlParser.MinutesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#minutes}.
	 * @param ctx the parse tree
	 */
	void exitMinutes(SmallPearlParser.MinutesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#seconds}.
	 * @param ctx the parse tree
	 */
	void enterSeconds(SmallPearlParser.SecondsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#seconds}.
	 * @param ctx the parse tree
	 */
	void exitSeconds(SmallPearlParser.SecondsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#floatingPointConstant}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointConstant(SmallPearlParser.FloatingPointConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#floatingPointConstant}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointConstant(SmallPearlParser.FloatingPointConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#cpp_inline}.
	 * @param ctx the parse tree
	 */
	void enterCpp_inline(SmallPearlParser.Cpp_inlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#cpp_inline}.
	 * @param ctx the parse tree
	 */
	void exitCpp_inline(SmallPearlParser.Cpp_inlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#lengthDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLengthDefinition(SmallPearlParser.LengthDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#lengthDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLengthDefinition(SmallPearlParser.LengthDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lengthDefinitionFixedType}
	 * labeled alternative in {@link SmallPearlParser#lengthDefinitionType}.
	 * @param ctx the parse tree
	 */
	void enterLengthDefinitionFixedType(SmallPearlParser.LengthDefinitionFixedTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lengthDefinitionFixedType}
	 * labeled alternative in {@link SmallPearlParser#lengthDefinitionType}.
	 * @param ctx the parse tree
	 */
	void exitLengthDefinitionFixedType(SmallPearlParser.LengthDefinitionFixedTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lengthDefinitionFloatType}
	 * labeled alternative in {@link SmallPearlParser#lengthDefinitionType}.
	 * @param ctx the parse tree
	 */
	void enterLengthDefinitionFloatType(SmallPearlParser.LengthDefinitionFloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lengthDefinitionFloatType}
	 * labeled alternative in {@link SmallPearlParser#lengthDefinitionType}.
	 * @param ctx the parse tree
	 */
	void exitLengthDefinitionFloatType(SmallPearlParser.LengthDefinitionFloatTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lengthDefinitionBitType}
	 * labeled alternative in {@link SmallPearlParser#lengthDefinitionType}.
	 * @param ctx the parse tree
	 */
	void enterLengthDefinitionBitType(SmallPearlParser.LengthDefinitionBitTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lengthDefinitionBitType}
	 * labeled alternative in {@link SmallPearlParser#lengthDefinitionType}.
	 * @param ctx the parse tree
	 */
	void exitLengthDefinitionBitType(SmallPearlParser.LengthDefinitionBitTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lengthDefinitionCharacterType}
	 * labeled alternative in {@link SmallPearlParser#lengthDefinitionType}.
	 * @param ctx the parse tree
	 */
	void enterLengthDefinitionCharacterType(SmallPearlParser.LengthDefinitionCharacterTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lengthDefinitionCharacterType}
	 * labeled alternative in {@link SmallPearlParser#lengthDefinitionType}.
	 * @param ctx the parse tree
	 */
	void exitLengthDefinitionCharacterType(SmallPearlParser.LengthDefinitionCharacterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(SmallPearlParser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(SmallPearlParser.PrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallPearlParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(SmallPearlParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallPearlParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(SmallPearlParser.LengthContext ctx);
}