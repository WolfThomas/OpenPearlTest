// Generated from /Users/thomas/IdeaProjects/SmallPearlTest/src/OpenPearl.g4 by ANTLR 4.9.1

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OpenPearlParser}.
 */
public interface OpenPearlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(OpenPearlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(OpenPearlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(OpenPearlParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(OpenPearlParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#system_part}.
	 * @param ctx the parse tree
	 */
	void enterSystem_part(OpenPearlParser.System_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#system_part}.
	 * @param ctx the parse tree
	 */
	void exitSystem_part(OpenPearlParser.System_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#systemElementDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSystemElementDefinition(OpenPearlParser.SystemElementDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#systemElementDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSystemElementDefinition(OpenPearlParser.SystemElementDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#systemPartName}.
	 * @param ctx the parse tree
	 */
	void enterSystemPartName(OpenPearlParser.SystemPartNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#systemPartName}.
	 * @param ctx the parse tree
	 */
	void exitSystemPartName(OpenPearlParser.SystemPartNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#configurationElement}.
	 * @param ctx the parse tree
	 */
	void enterConfigurationElement(OpenPearlParser.ConfigurationElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#configurationElement}.
	 * @param ctx the parse tree
	 */
	void exitConfigurationElement(OpenPearlParser.ConfigurationElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#systemDescription}.
	 * @param ctx the parse tree
	 */
	void enterSystemDescription(OpenPearlParser.SystemDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#systemDescription}.
	 * @param ctx the parse tree
	 */
	void exitSystemDescription(OpenPearlParser.SystemDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#association}.
	 * @param ctx the parse tree
	 */
	void enterAssociation(OpenPearlParser.AssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#association}.
	 * @param ctx the parse tree
	 */
	void exitAssociation(OpenPearlParser.AssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#systemElementParameters}.
	 * @param ctx the parse tree
	 */
	void enterSystemElementParameters(OpenPearlParser.SystemElementParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#systemElementParameters}.
	 * @param ctx the parse tree
	 */
	void exitSystemElementParameters(OpenPearlParser.SystemElementParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#problem_part}.
	 * @param ctx the parse tree
	 */
	void enterProblem_part(OpenPearlParser.Problem_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#problem_part}.
	 * @param ctx the parse tree
	 */
	void exitProblem_part(OpenPearlParser.Problem_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#identification}.
	 * @param ctx the parse tree
	 */
	void enterIdentification(OpenPearlParser.IdentificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#identification}.
	 * @param ctx the parse tree
	 */
	void exitIdentification(OpenPearlParser.IdentificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#identificationDenotation}.
	 * @param ctx the parse tree
	 */
	void enterIdentificationDenotation(OpenPearlParser.IdentificationDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#identificationDenotation}.
	 * @param ctx the parse tree
	 */
	void exitIdentificationDenotation(OpenPearlParser.IdentificationDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeForIdentification}.
	 * @param ctx the parse tree
	 */
	void enterTypeForIdentification(OpenPearlParser.TypeForIdentificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeForIdentification}.
	 * @param ctx the parse tree
	 */
	void exitTypeForIdentification(OpenPearlParser.TypeForIdentificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeAttributeForIdentification}.
	 * @param ctx the parse tree
	 */
	void enterTypeAttributeForIdentification(OpenPearlParser.TypeAttributeForIdentificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeAttributeForIdentification}.
	 * @param ctx the parse tree
	 */
	void exitTypeAttributeForIdentification(OpenPearlParser.TypeAttributeForIdentificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#identificationAttribute}.
	 * @param ctx the parse tree
	 */
	void enterIdentificationAttribute(OpenPearlParser.IdentificationAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#identificationAttribute}.
	 * @param ctx the parse tree
	 */
	void exitIdentificationAttribute(OpenPearlParser.IdentificationAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(OpenPearlParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(OpenPearlParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(OpenPearlParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(OpenPearlParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#variableDenotation}.
	 * @param ctx the parse tree
	 */
	void enterVariableDenotation(OpenPearlParser.VariableDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#variableDenotation}.
	 * @param ctx the parse tree
	 */
	void exitVariableDenotation(OpenPearlParser.VariableDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#problemPartDataAttribute}.
	 * @param ctx the parse tree
	 */
	void enterProblemPartDataAttribute(OpenPearlParser.ProblemPartDataAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#problemPartDataAttribute}.
	 * @param ctx the parse tree
	 */
	void exitProblemPartDataAttribute(OpenPearlParser.ProblemPartDataAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTypeAttribute(OpenPearlParser.TypeAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTypeAttribute(OpenPearlParser.TypeAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#allocationProtection}.
	 * @param ctx the parse tree
	 */
	void enterAllocationProtection(OpenPearlParser.AllocationProtectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#allocationProtection}.
	 * @param ctx the parse tree
	 */
	void exitAllocationProtection(OpenPearlParser.AllocationProtectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#globalAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGlobalAttribute(OpenPearlParser.GlobalAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#globalAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGlobalAttribute(OpenPearlParser.GlobalAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterSpecification(OpenPearlParser.SpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitSpecification(OpenPearlParser.SpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#specificationItem}.
	 * @param ctx the parse tree
	 */
	void enterSpecificationItem(OpenPearlParser.SpecificationItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#specificationItem}.
	 * @param ctx the parse tree
	 */
	void exitSpecificationItem(OpenPearlParser.SpecificationItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(OpenPearlParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(OpenPearlParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeInteger}.
	 * @param ctx the parse tree
	 */
	void enterTypeInteger(OpenPearlParser.TypeIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeInteger}.
	 * @param ctx the parse tree
	 */
	void exitTypeInteger(OpenPearlParser.TypeIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#mprecision}.
	 * @param ctx the parse tree
	 */
	void enterMprecision(OpenPearlParser.MprecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#mprecision}.
	 * @param ctx the parse tree
	 */
	void exitMprecision(OpenPearlParser.MprecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#integerWithoutPrecision}.
	 * @param ctx the parse tree
	 */
	void enterIntegerWithoutPrecision(OpenPearlParser.IntegerWithoutPrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#integerWithoutPrecision}.
	 * @param ctx the parse tree
	 */
	void exitIntegerWithoutPrecision(OpenPearlParser.IntegerWithoutPrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeFloatingPointNumber}.
	 * @param ctx the parse tree
	 */
	void enterTypeFloatingPointNumber(OpenPearlParser.TypeFloatingPointNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeFloatingPointNumber}.
	 * @param ctx the parse tree
	 */
	void exitTypeFloatingPointNumber(OpenPearlParser.TypeFloatingPointNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeBitString}.
	 * @param ctx the parse tree
	 */
	void enterTypeBitString(OpenPearlParser.TypeBitStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeBitString}.
	 * @param ctx the parse tree
	 */
	void exitTypeBitString(OpenPearlParser.TypeBitStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeCharacterString}.
	 * @param ctx the parse tree
	 */
	void enterTypeCharacterString(OpenPearlParser.TypeCharacterStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeCharacterString}.
	 * @param ctx the parse tree
	 */
	void exitTypeCharacterString(OpenPearlParser.TypeCharacterStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeDuration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDuration(OpenPearlParser.TypeDurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeDuration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDuration(OpenPearlParser.TypeDurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeClock}.
	 * @param ctx the parse tree
	 */
	void enterTypeClock(OpenPearlParser.TypeClockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeClock}.
	 * @param ctx the parse tree
	 */
	void exitTypeClock(OpenPearlParser.TypeClockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#identifierDenotation}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierDenotation(OpenPearlParser.IdentifierDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#identifierDenotation}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierDenotation(OpenPearlParser.IdentifierDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#initialisationAttribute}.
	 * @param ctx the parse tree
	 */
	void enterInitialisationAttribute(OpenPearlParser.InitialisationAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#initialisationAttribute}.
	 * @param ctx the parse tree
	 */
	void exitInitialisationAttribute(OpenPearlParser.InitialisationAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#initElement}.
	 * @param ctx the parse tree
	 */
	void enterInitElement(OpenPearlParser.InitElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#initElement}.
	 * @param ctx the parse tree
	 */
	void exitInitElement(OpenPearlParser.InitElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeStructure}.
	 * @param ctx the parse tree
	 */
	void enterTypeStructure(OpenPearlParser.TypeStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeStructure}.
	 * @param ctx the parse tree
	 */
	void exitTypeStructure(OpenPearlParser.TypeStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#structureComponent}.
	 * @param ctx the parse tree
	 */
	void enterStructureComponent(OpenPearlParser.StructureComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#structureComponent}.
	 * @param ctx the parse tree
	 */
	void exitStructureComponent(OpenPearlParser.StructureComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeAttributeInStructureComponent}.
	 * @param ctx the parse tree
	 */
	void enterTypeAttributeInStructureComponent(OpenPearlParser.TypeAttributeInStructureComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeAttributeInStructureComponent}.
	 * @param ctx the parse tree
	 */
	void exitTypeAttributeInStructureComponent(OpenPearlParser.TypeAttributeInStructureComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(OpenPearlParser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(OpenPearlParser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#structureSpecfication}.
	 * @param ctx the parse tree
	 */
	void enterStructureSpecfication(OpenPearlParser.StructureSpecficationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#structureSpecfication}.
	 * @param ctx the parse tree
	 */
	void exitStructureSpecfication(OpenPearlParser.StructureSpecficationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#structureDenotationS}.
	 * @param ctx the parse tree
	 */
	void enterStructureDenotationS(OpenPearlParser.StructureDenotationSContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#structureDenotationS}.
	 * @param ctx the parse tree
	 */
	void exitStructureDenotationS(OpenPearlParser.StructureDenotationSContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(OpenPearlParser.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(OpenPearlParser.TypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeRefChar}.
	 * @param ctx the parse tree
	 */
	void enterTypeRefChar(OpenPearlParser.TypeRefCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeRefChar}.
	 * @param ctx the parse tree
	 */
	void exitTypeRefChar(OpenPearlParser.TypeRefCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeSema}.
	 * @param ctx the parse tree
	 */
	void enterTypeSema(OpenPearlParser.TypeSemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeSema}.
	 * @param ctx the parse tree
	 */
	void exitTypeSema(OpenPearlParser.TypeSemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeBolt}.
	 * @param ctx the parse tree
	 */
	void enterTypeBolt(OpenPearlParser.TypeBoltContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeBolt}.
	 * @param ctx the parse tree
	 */
	void exitTypeBolt(OpenPearlParser.TypeBoltContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeTask}.
	 * @param ctx the parse tree
	 */
	void enterTypeTask(OpenPearlParser.TypeTaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeTask}.
	 * @param ctx the parse tree
	 */
	void exitTypeTask(OpenPearlParser.TypeTaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeInterrupt}.
	 * @param ctx the parse tree
	 */
	void enterTypeInterrupt(OpenPearlParser.TypeInterruptContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeInterrupt}.
	 * @param ctx the parse tree
	 */
	void exitTypeInterrupt(OpenPearlParser.TypeInterruptContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeSignal}.
	 * @param ctx the parse tree
	 */
	void enterTypeSignal(OpenPearlParser.TypeSignalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeSignal}.
	 * @param ctx the parse tree
	 */
	void exitTypeSignal(OpenPearlParser.TypeSignalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeReferenceCharType}.
	 * @param ctx the parse tree
	 */
	void enterTypeReferenceCharType(OpenPearlParser.TypeReferenceCharTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeReferenceCharType}.
	 * @param ctx the parse tree
	 */
	void exitTypeReferenceCharType(OpenPearlParser.TypeReferenceCharTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#semaDenotation}.
	 * @param ctx the parse tree
	 */
	void enterSemaDenotation(OpenPearlParser.SemaDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#semaDenotation}.
	 * @param ctx the parse tree
	 */
	void exitSemaDenotation(OpenPearlParser.SemaDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#preset}.
	 * @param ctx the parse tree
	 */
	void enterPreset(OpenPearlParser.PresetContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#preset}.
	 * @param ctx the parse tree
	 */
	void exitPreset(OpenPearlParser.PresetContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(OpenPearlParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(OpenPearlParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#procedureDenotation}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDenotation(OpenPearlParser.ProcedureDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#procedureDenotation}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDenotation(OpenPearlParser.ProcedureDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeProcedure}.
	 * @param ctx the parse tree
	 */
	void enterTypeProcedure(OpenPearlParser.TypeProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeProcedure}.
	 * @param ctx the parse tree
	 */
	void exitTypeProcedure(OpenPearlParser.TypeProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#procedureBody}.
	 * @param ctx the parse tree
	 */
	void enterProcedureBody(OpenPearlParser.ProcedureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#procedureBody}.
	 * @param ctx the parse tree
	 */
	void exitProcedureBody(OpenPearlParser.ProcedureBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#listOfFormalParameters}.
	 * @param ctx the parse tree
	 */
	void enterListOfFormalParameters(OpenPearlParser.ListOfFormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#listOfFormalParameters}.
	 * @param ctx the parse tree
	 */
	void exitListOfFormalParameters(OpenPearlParser.ListOfFormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(OpenPearlParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(OpenPearlParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(OpenPearlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(OpenPearlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#virtualDimensionList}.
	 * @param ctx the parse tree
	 */
	void enterVirtualDimensionList(OpenPearlParser.VirtualDimensionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#virtualDimensionList}.
	 * @param ctx the parse tree
	 */
	void exitVirtualDimensionList(OpenPearlParser.VirtualDimensionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#commas}.
	 * @param ctx the parse tree
	 */
	void enterCommas(OpenPearlParser.CommasContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#commas}.
	 * @param ctx the parse tree
	 */
	void exitCommas(OpenPearlParser.CommasContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#assignmentProtection}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentProtection(OpenPearlParser.AssignmentProtectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#assignmentProtection}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentProtection(OpenPearlParser.AssignmentProtectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#passIdentical}.
	 * @param ctx the parse tree
	 */
	void enterPassIdentical(OpenPearlParser.PassIdenticalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#passIdentical}.
	 * @param ctx the parse tree
	 */
	void exitPassIdentical(OpenPearlParser.PassIdenticalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#virtualDimensionList2}.
	 * @param ctx the parse tree
	 */
	void enterVirtualDimensionList2(OpenPearlParser.VirtualDimensionList2Context ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#virtualDimensionList2}.
	 * @param ctx the parse tree
	 */
	void exitVirtualDimensionList2(OpenPearlParser.VirtualDimensionList2Context ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(OpenPearlParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(OpenPearlParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeRealTimeObject}.
	 * @param ctx the parse tree
	 */
	void enterTypeRealTimeObject(OpenPearlParser.TypeRealTimeObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeRealTimeObject}.
	 * @param ctx the parse tree
	 */
	void exitTypeRealTimeObject(OpenPearlParser.TypeRealTimeObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#disableStatement}.
	 * @param ctx the parse tree
	 */
	void enterDisableStatement(OpenPearlParser.DisableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#disableStatement}.
	 * @param ctx the parse tree
	 */
	void exitDisableStatement(OpenPearlParser.DisableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#enableStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnableStatement(OpenPearlParser.EnableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#enableStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnableStatement(OpenPearlParser.EnableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#triggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterTriggerStatement(OpenPearlParser.TriggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#triggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitTriggerStatement(OpenPearlParser.TriggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#resultAttribute}.
	 * @param ctx the parse tree
	 */
	void enterResultAttribute(OpenPearlParser.ResultAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#resultAttribute}.
	 * @param ctx the parse tree
	 */
	void exitResultAttribute(OpenPearlParser.ResultAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(OpenPearlParser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(OpenPearlParser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#taskDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTaskDeclaration(OpenPearlParser.TaskDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#taskDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTaskDeclaration(OpenPearlParser.TaskDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#taskDenotation}.
	 * @param ctx the parse tree
	 */
	void enterTaskDenotation(OpenPearlParser.TaskDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#taskDenotation}.
	 * @param ctx the parse tree
	 */
	void exitTaskDenotation(OpenPearlParser.TaskDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#nameOfModuleTaskProc}.
	 * @param ctx the parse tree
	 */
	void enterNameOfModuleTaskProc(OpenPearlParser.NameOfModuleTaskProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#nameOfModuleTaskProc}.
	 * @param ctx the parse tree
	 */
	void exitNameOfModuleTaskProc(OpenPearlParser.NameOfModuleTaskProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#task_main}.
	 * @param ctx the parse tree
	 */
	void enterTask_main(OpenPearlParser.Task_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#task_main}.
	 * @param ctx the parse tree
	 */
	void exitTask_main(OpenPearlParser.Task_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#taskBody}.
	 * @param ctx the parse tree
	 */
	void enterTaskBody(OpenPearlParser.TaskBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#taskBody}.
	 * @param ctx the parse tree
	 */
	void exitTaskBody(OpenPearlParser.TaskBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(OpenPearlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(OpenPearlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#unlabeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnlabeled_statement(OpenPearlParser.Unlabeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#unlabeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnlabeled_statement(OpenPearlParser.Unlabeled_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_statement(OpenPearlParser.Empty_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_statement(OpenPearlParser.Empty_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#label_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabel_statement(OpenPearlParser.Label_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#label_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabel_statement(OpenPearlParser.Label_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(OpenPearlParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(OpenPearlParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#listOfActualParameters}.
	 * @param ctx the parse tree
	 */
	void enterListOfActualParameters(OpenPearlParser.ListOfActualParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#listOfActualParameters}.
	 * @param ctx the parse tree
	 */
	void exitListOfActualParameters(OpenPearlParser.ListOfActualParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(OpenPearlParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(OpenPearlParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(OpenPearlParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(OpenPearlParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#exitStatement}.
	 * @param ctx the parse tree
	 */
	void enterExitStatement(OpenPearlParser.ExitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#exitStatement}.
	 * @param ctx the parse tree
	 */
	void exitExitStatement(OpenPearlParser.ExitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(OpenPearlParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(OpenPearlParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#dereference}.
	 * @param ctx the parse tree
	 */
	void enterDereference(OpenPearlParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#dereference}.
	 * @param ctx the parse tree
	 */
	void exitDereference(OpenPearlParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#stringSelection}.
	 * @param ctx the parse tree
	 */
	void enterStringSelection(OpenPearlParser.StringSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#stringSelection}.
	 * @param ctx the parse tree
	 */
	void exitStringSelection(OpenPearlParser.StringSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#bitSelection}.
	 * @param ctx the parse tree
	 */
	void enterBitSelection(OpenPearlParser.BitSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#bitSelection}.
	 * @param ctx the parse tree
	 */
	void exitBitSelection(OpenPearlParser.BitSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#bitSelectionSlice}.
	 * @param ctx the parse tree
	 */
	void enterBitSelectionSlice(OpenPearlParser.BitSelectionSliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#bitSelectionSlice}.
	 * @param ctx the parse tree
	 */
	void exitBitSelectionSlice(OpenPearlParser.BitSelectionSliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#charSelection}.
	 * @param ctx the parse tree
	 */
	void enterCharSelection(OpenPearlParser.CharSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#charSelection}.
	 * @param ctx the parse tree
	 */
	void exitCharSelection(OpenPearlParser.CharSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#charSelectionSlice}.
	 * @param ctx the parse tree
	 */
	void enterCharSelectionSlice(OpenPearlParser.CharSelectionSliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#charSelectionSlice}.
	 * @param ctx the parse tree
	 */
	void exitCharSelectionSlice(OpenPearlParser.CharSelectionSliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#sequential_control_statement}.
	 * @param ctx the parse tree
	 */
	void enterSequential_control_statement(OpenPearlParser.Sequential_control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#sequential_control_statement}.
	 * @param ctx the parse tree
	 */
	void exitSequential_control_statement(OpenPearlParser.Sequential_control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(OpenPearlParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(OpenPearlParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#then_block}.
	 * @param ctx the parse tree
	 */
	void enterThen_block(OpenPearlParser.Then_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#then_block}.
	 * @param ctx the parse tree
	 */
	void exitThen_block(OpenPearlParser.Then_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(OpenPearlParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(OpenPearlParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(OpenPearlParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(OpenPearlParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#case_statement_selection1}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement_selection1(OpenPearlParser.Case_statement_selection1Context ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#case_statement_selection1}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement_selection1(OpenPearlParser.Case_statement_selection1Context ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#case_statement_selection1_alt}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement_selection1_alt(OpenPearlParser.Case_statement_selection1_altContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#case_statement_selection1_alt}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement_selection1_alt(OpenPearlParser.Case_statement_selection1_altContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#case_statement_selection_out}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement_selection_out(OpenPearlParser.Case_statement_selection_outContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#case_statement_selection_out}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement_selection_out(OpenPearlParser.Case_statement_selection_outContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#case_statement_selection2}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement_selection2(OpenPearlParser.Case_statement_selection2Context ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#case_statement_selection2}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement_selection2(OpenPearlParser.Case_statement_selection2Context ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#case_statement_selection2_alt}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement_selection2_alt(OpenPearlParser.Case_statement_selection2_altContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#case_statement_selection2_alt}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement_selection2_alt(OpenPearlParser.Case_statement_selection2_altContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#case_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_list(OpenPearlParser.Case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#case_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_list(OpenPearlParser.Case_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#index_section}.
	 * @param ctx the parse tree
	 */
	void enterIndex_section(OpenPearlParser.Index_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#index_section}.
	 * @param ctx the parse tree
	 */
	void exitIndex_section(OpenPearlParser.Index_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#constantCharacterString}.
	 * @param ctx the parse tree
	 */
	void enterConstantCharacterString(OpenPearlParser.ConstantCharacterStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#constantCharacterString}.
	 * @param ctx the parse tree
	 */
	void exitConstantCharacterString(OpenPearlParser.ConstantCharacterStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(OpenPearlParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(OpenPearlParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#blockId}.
	 * @param ctx the parse tree
	 */
	void enterBlockId(OpenPearlParser.BlockIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#blockId}.
	 * @param ctx the parse tree
	 */
	void exitBlockId(OpenPearlParser.BlockIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(OpenPearlParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(OpenPearlParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void enterLoopBody(OpenPearlParser.LoopBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void exitLoopBody(OpenPearlParser.LoopBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#loopStatement_for}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement_for(OpenPearlParser.LoopStatement_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#loopStatement_for}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement_for(OpenPearlParser.LoopStatement_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#loopStatement_from}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement_from(OpenPearlParser.LoopStatement_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#loopStatement_from}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement_from(OpenPearlParser.LoopStatement_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#loopStatement_by}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement_by(OpenPearlParser.LoopStatement_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#loopStatement_by}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement_by(OpenPearlParser.LoopStatement_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#loopStatement_to}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement_to(OpenPearlParser.LoopStatement_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#loopStatement_to}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement_to(OpenPearlParser.LoopStatement_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#loopStatement_while}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement_while(OpenPearlParser.LoopStatement_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#loopStatement_while}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement_while(OpenPearlParser.LoopStatement_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#loopStatement_end}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement_end(OpenPearlParser.LoopStatement_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#loopStatement_end}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement_end(OpenPearlParser.LoopStatement_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#realtime_statement}.
	 * @param ctx the parse tree
	 */
	void enterRealtime_statement(OpenPearlParser.Realtime_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#realtime_statement}.
	 * @param ctx the parse tree
	 */
	void exitRealtime_statement(OpenPearlParser.Realtime_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#task_control_statement}.
	 * @param ctx the parse tree
	 */
	void enterTask_control_statement(OpenPearlParser.Task_control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#task_control_statement}.
	 * @param ctx the parse tree
	 */
	void exitTask_control_statement(OpenPearlParser.Task_control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#task_terminating}.
	 * @param ctx the parse tree
	 */
	void enterTask_terminating(OpenPearlParser.Task_terminatingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#task_terminating}.
	 * @param ctx the parse tree
	 */
	void exitTask_terminating(OpenPearlParser.Task_terminatingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#task_suspending}.
	 * @param ctx the parse tree
	 */
	void enterTask_suspending(OpenPearlParser.Task_suspendingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#task_suspending}.
	 * @param ctx the parse tree
	 */
	void exitTask_suspending(OpenPearlParser.Task_suspendingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#taskContinuation}.
	 * @param ctx the parse tree
	 */
	void enterTaskContinuation(OpenPearlParser.TaskContinuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#taskContinuation}.
	 * @param ctx the parse tree
	 */
	void exitTaskContinuation(OpenPearlParser.TaskContinuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#taskResume}.
	 * @param ctx the parse tree
	 */
	void enterTaskResume(OpenPearlParser.TaskResumeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#taskResume}.
	 * @param ctx the parse tree
	 */
	void exitTaskResume(OpenPearlParser.TaskResumeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#task_preventing}.
	 * @param ctx the parse tree
	 */
	void enterTask_preventing(OpenPearlParser.Task_preventingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#task_preventing}.
	 * @param ctx the parse tree
	 */
	void exitTask_preventing(OpenPearlParser.Task_preventingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#taskStart}.
	 * @param ctx the parse tree
	 */
	void enterTaskStart(OpenPearlParser.TaskStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#taskStart}.
	 * @param ctx the parse tree
	 */
	void exitTaskStart(OpenPearlParser.TaskStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#priority}.
	 * @param ctx the parse tree
	 */
	void enterPriority(OpenPearlParser.PriorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#priority}.
	 * @param ctx the parse tree
	 */
	void exitPriority(OpenPearlParser.PriorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#frequency}.
	 * @param ctx the parse tree
	 */
	void enterFrequency(OpenPearlParser.FrequencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#frequency}.
	 * @param ctx the parse tree
	 */
	void exitFrequency(OpenPearlParser.FrequencyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#startCondition}.
	 * @param ctx the parse tree
	 */
	void enterStartCondition(OpenPearlParser.StartConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#startCondition}.
	 * @param ctx the parse tree
	 */
	void exitStartCondition(OpenPearlParser.StartConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#startConditionAFTER}.
	 * @param ctx the parse tree
	 */
	void enterStartConditionAFTER(OpenPearlParser.StartConditionAFTERContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#startConditionAFTER}.
	 * @param ctx the parse tree
	 */
	void exitStartConditionAFTER(OpenPearlParser.StartConditionAFTERContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#startConditionAT}.
	 * @param ctx the parse tree
	 */
	void enterStartConditionAT(OpenPearlParser.StartConditionATContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#startConditionAT}.
	 * @param ctx the parse tree
	 */
	void exitStartConditionAT(OpenPearlParser.StartConditionATContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#startConditionWHEN}.
	 * @param ctx the parse tree
	 */
	void enterStartConditionWHEN(OpenPearlParser.StartConditionWHENContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#startConditionWHEN}.
	 * @param ctx the parse tree
	 */
	void exitStartConditionWHEN(OpenPearlParser.StartConditionWHENContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#task_coordination_statement}.
	 * @param ctx the parse tree
	 */
	void enterTask_coordination_statement(OpenPearlParser.Task_coordination_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#task_coordination_statement}.
	 * @param ctx the parse tree
	 */
	void exitTask_coordination_statement(OpenPearlParser.Task_coordination_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#listOfNames}.
	 * @param ctx the parse tree
	 */
	void enterListOfNames(OpenPearlParser.ListOfNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#listOfNames}.
	 * @param ctx the parse tree
	 */
	void exitListOfNames(OpenPearlParser.ListOfNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#semaRequest}.
	 * @param ctx the parse tree
	 */
	void enterSemaRequest(OpenPearlParser.SemaRequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#semaRequest}.
	 * @param ctx the parse tree
	 */
	void exitSemaRequest(OpenPearlParser.SemaRequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#semaRelease}.
	 * @param ctx the parse tree
	 */
	void enterSemaRelease(OpenPearlParser.SemaReleaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#semaRelease}.
	 * @param ctx the parse tree
	 */
	void exitSemaRelease(OpenPearlParser.SemaReleaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#semaTry}.
	 * @param ctx the parse tree
	 */
	void enterSemaTry(OpenPearlParser.SemaTryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#semaTry}.
	 * @param ctx the parse tree
	 */
	void exitSemaTry(OpenPearlParser.SemaTryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#boltDenotation}.
	 * @param ctx the parse tree
	 */
	void enterBoltDenotation(OpenPearlParser.BoltDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#boltDenotation}.
	 * @param ctx the parse tree
	 */
	void exitBoltDenotation(OpenPearlParser.BoltDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#boltReserve}.
	 * @param ctx the parse tree
	 */
	void enterBoltReserve(OpenPearlParser.BoltReserveContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#boltReserve}.
	 * @param ctx the parse tree
	 */
	void exitBoltReserve(OpenPearlParser.BoltReserveContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#boltFree}.
	 * @param ctx the parse tree
	 */
	void enterBoltFree(OpenPearlParser.BoltFreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#boltFree}.
	 * @param ctx the parse tree
	 */
	void exitBoltFree(OpenPearlParser.BoltFreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#boltEnter}.
	 * @param ctx the parse tree
	 */
	void enterBoltEnter(OpenPearlParser.BoltEnterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#boltEnter}.
	 * @param ctx the parse tree
	 */
	void exitBoltEnter(OpenPearlParser.BoltEnterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#boltLeave}.
	 * @param ctx the parse tree
	 */
	void enterBoltLeave(OpenPearlParser.BoltLeaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#boltLeave}.
	 * @param ctx the parse tree
	 */
	void exitBoltLeave(OpenPearlParser.BoltLeaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#interrupt_statement}.
	 * @param ctx the parse tree
	 */
	void enterInterrupt_statement(OpenPearlParser.Interrupt_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#interrupt_statement}.
	 * @param ctx the parse tree
	 */
	void exitInterrupt_statement(OpenPearlParser.Interrupt_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#io_statement}.
	 * @param ctx the parse tree
	 */
	void enterIo_statement(OpenPearlParser.Io_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#io_statement}.
	 * @param ctx the parse tree
	 */
	void exitIo_statement(OpenPearlParser.Io_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_statement(OpenPearlParser.Open_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_statement(OpenPearlParser.Open_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#open_parameterlist}.
	 * @param ctx the parse tree
	 */
	void enterOpen_parameterlist(OpenPearlParser.Open_parameterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#open_parameterlist}.
	 * @param ctx the parse tree
	 */
	void exitOpen_parameterlist(OpenPearlParser.Open_parameterlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#open_parameter}.
	 * @param ctx the parse tree
	 */
	void enterOpen_parameter(OpenPearlParser.Open_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#open_parameter}.
	 * @param ctx the parse tree
	 */
	void exitOpen_parameter(OpenPearlParser.Open_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#open_parameter_idf}.
	 * @param ctx the parse tree
	 */
	void enterOpen_parameter_idf(OpenPearlParser.Open_parameter_idfContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#open_parameter_idf}.
	 * @param ctx the parse tree
	 */
	void exitOpen_parameter_idf(OpenPearlParser.Open_parameter_idfContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#open_parameter_old_new_any}.
	 * @param ctx the parse tree
	 */
	void enterOpen_parameter_old_new_any(OpenPearlParser.Open_parameter_old_new_anyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#open_parameter_old_new_any}.
	 * @param ctx the parse tree
	 */
	void exitOpen_parameter_old_new_any(OpenPearlParser.Open_parameter_old_new_anyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#open_close_parameter_can_prm}.
	 * @param ctx the parse tree
	 */
	void enterOpen_close_parameter_can_prm(OpenPearlParser.Open_close_parameter_can_prmContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#open_close_parameter_can_prm}.
	 * @param ctx the parse tree
	 */
	void exitOpen_close_parameter_can_prm(OpenPearlParser.Open_close_parameter_can_prmContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_statement(OpenPearlParser.Close_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_statement(OpenPearlParser.Close_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#close_parameterlist}.
	 * @param ctx the parse tree
	 */
	void enterClose_parameterlist(OpenPearlParser.Close_parameterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#close_parameterlist}.
	 * @param ctx the parse tree
	 */
	void exitClose_parameterlist(OpenPearlParser.Close_parameterlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#close_parameter}.
	 * @param ctx the parse tree
	 */
	void enterClose_parameter(OpenPearlParser.Close_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#close_parameter}.
	 * @param ctx the parse tree
	 */
	void exitClose_parameter(OpenPearlParser.Close_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#getStatement}.
	 * @param ctx the parse tree
	 */
	void enterGetStatement(OpenPearlParser.GetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#getStatement}.
	 * @param ctx the parse tree
	 */
	void exitGetStatement(OpenPearlParser.GetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#putStatement}.
	 * @param ctx the parse tree
	 */
	void enterPutStatement(OpenPearlParser.PutStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#putStatement}.
	 * @param ctx the parse tree
	 */
	void exitPutStatement(OpenPearlParser.PutStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(OpenPearlParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(OpenPearlParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(OpenPearlParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(OpenPearlParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#takeStatement}.
	 * @param ctx the parse tree
	 */
	void enterTakeStatement(OpenPearlParser.TakeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#takeStatement}.
	 * @param ctx the parse tree
	 */
	void exitTakeStatement(OpenPearlParser.TakeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#sendStatement}.
	 * @param ctx the parse tree
	 */
	void enterSendStatement(OpenPearlParser.SendStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#sendStatement}.
	 * @param ctx the parse tree
	 */
	void exitSendStatement(OpenPearlParser.SendStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#ioListElement}.
	 * @param ctx the parse tree
	 */
	void enterIoListElement(OpenPearlParser.IoListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#ioListElement}.
	 * @param ctx the parse tree
	 */
	void exitIoListElement(OpenPearlParser.IoListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#ioDataList}.
	 * @param ctx the parse tree
	 */
	void enterIoDataList(OpenPearlParser.IoDataListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#ioDataList}.
	 * @param ctx the parse tree
	 */
	void exitIoDataList(OpenPearlParser.IoDataListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#listOfFormatPositions}.
	 * @param ctx the parse tree
	 */
	void enterListOfFormatPositions(OpenPearlParser.ListOfFormatPositionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#listOfFormatPositions}.
	 * @param ctx the parse tree
	 */
	void exitListOfFormatPositions(OpenPearlParser.ListOfFormatPositionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#dationName}.
	 * @param ctx the parse tree
	 */
	void enterDationName(OpenPearlParser.DationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#dationName}.
	 * @param ctx the parse tree
	 */
	void exitDationName(OpenPearlParser.DationNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorFormat}
	 * labeled alternative in {@link OpenPearlParser#formatPosition}.
	 * @param ctx the parse tree
	 */
	void enterFactorFormat(OpenPearlParser.FactorFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorFormat}
	 * labeled alternative in {@link OpenPearlParser#formatPosition}.
	 * @param ctx the parse tree
	 */
	void exitFactorFormat(OpenPearlParser.FactorFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorPosition}
	 * labeled alternative in {@link OpenPearlParser#formatPosition}.
	 * @param ctx the parse tree
	 */
	void enterFactorPosition(OpenPearlParser.FactorPositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorPosition}
	 * labeled alternative in {@link OpenPearlParser#formatPosition}.
	 * @param ctx the parse tree
	 */
	void exitFactorPosition(OpenPearlParser.FactorPositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorFormatPosition}
	 * labeled alternative in {@link OpenPearlParser#formatPosition}.
	 * @param ctx the parse tree
	 */
	void enterFactorFormatPosition(OpenPearlParser.FactorFormatPositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorFormatPosition}
	 * labeled alternative in {@link OpenPearlParser#formatPosition}.
	 * @param ctx the parse tree
	 */
	void exitFactorFormatPosition(OpenPearlParser.FactorFormatPositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(OpenPearlParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(OpenPearlParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(OpenPearlParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(OpenPearlParser.FormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#absolutePosition}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePosition(OpenPearlParser.AbsolutePositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#absolutePosition}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePosition(OpenPearlParser.AbsolutePositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#positionCOL}.
	 * @param ctx the parse tree
	 */
	void enterPositionCOL(OpenPearlParser.PositionCOLContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#positionCOL}.
	 * @param ctx the parse tree
	 */
	void exitPositionCOL(OpenPearlParser.PositionCOLContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#positionLINE}.
	 * @param ctx the parse tree
	 */
	void enterPositionLINE(OpenPearlParser.PositionLINEContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#positionLINE}.
	 * @param ctx the parse tree
	 */
	void exitPositionLINE(OpenPearlParser.PositionLINEContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#positionPOS}.
	 * @param ctx the parse tree
	 */
	void enterPositionPOS(OpenPearlParser.PositionPOSContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#positionPOS}.
	 * @param ctx the parse tree
	 */
	void exitPositionPOS(OpenPearlParser.PositionPOSContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#positionSOP}.
	 * @param ctx the parse tree
	 */
	void enterPositionSOP(OpenPearlParser.PositionSOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#positionSOP}.
	 * @param ctx the parse tree
	 */
	void exitPositionSOP(OpenPearlParser.PositionSOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#position}.
	 * @param ctx the parse tree
	 */
	void enterPosition(OpenPearlParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#position}.
	 * @param ctx the parse tree
	 */
	void exitPosition(OpenPearlParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#relativePosition}.
	 * @param ctx the parse tree
	 */
	void enterRelativePosition(OpenPearlParser.RelativePositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#relativePosition}.
	 * @param ctx the parse tree
	 */
	void exitRelativePosition(OpenPearlParser.RelativePositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#openClosePositionRST}.
	 * @param ctx the parse tree
	 */
	void enterOpenClosePositionRST(OpenPearlParser.OpenClosePositionRSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#openClosePositionRST}.
	 * @param ctx the parse tree
	 */
	void exitOpenClosePositionRST(OpenPearlParser.OpenClosePositionRSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#positionPAGE}.
	 * @param ctx the parse tree
	 */
	void enterPositionPAGE(OpenPearlParser.PositionPAGEContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#positionPAGE}.
	 * @param ctx the parse tree
	 */
	void exitPositionPAGE(OpenPearlParser.PositionPAGEContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#positionSKIP}.
	 * @param ctx the parse tree
	 */
	void enterPositionSKIP(OpenPearlParser.PositionSKIPContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#positionSKIP}.
	 * @param ctx the parse tree
	 */
	void exitPositionSKIP(OpenPearlParser.PositionSKIPContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#positionX}.
	 * @param ctx the parse tree
	 */
	void enterPositionX(OpenPearlParser.PositionXContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#positionX}.
	 * @param ctx the parse tree
	 */
	void exitPositionX(OpenPearlParser.PositionXContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#positionADV}.
	 * @param ctx the parse tree
	 */
	void enterPositionADV(OpenPearlParser.PositionADVContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#positionADV}.
	 * @param ctx the parse tree
	 */
	void exitPositionADV(OpenPearlParser.PositionADVContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#positionEOF}.
	 * @param ctx the parse tree
	 */
	void enterPositionEOF(OpenPearlParser.PositionEOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#positionEOF}.
	 * @param ctx the parse tree
	 */
	void exitPositionEOF(OpenPearlParser.PositionEOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#fixedFormat}.
	 * @param ctx the parse tree
	 */
	void enterFixedFormat(OpenPearlParser.FixedFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#fixedFormat}.
	 * @param ctx the parse tree
	 */
	void exitFixedFormat(OpenPearlParser.FixedFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#fieldWidth}.
	 * @param ctx the parse tree
	 */
	void enterFieldWidth(OpenPearlParser.FieldWidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#fieldWidth}.
	 * @param ctx the parse tree
	 */
	void exitFieldWidth(OpenPearlParser.FieldWidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#significance}.
	 * @param ctx the parse tree
	 */
	void enterSignificance(OpenPearlParser.SignificanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#significance}.
	 * @param ctx the parse tree
	 */
	void exitSignificance(OpenPearlParser.SignificanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatFormatE}
	 * labeled alternative in {@link OpenPearlParser#floatFormat}.
	 * @param ctx the parse tree
	 */
	void enterFloatFormatE(OpenPearlParser.FloatFormatEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatFormatE}
	 * labeled alternative in {@link OpenPearlParser#floatFormat}.
	 * @param ctx the parse tree
	 */
	void exitFloatFormatE(OpenPearlParser.FloatFormatEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatFormatE3}
	 * labeled alternative in {@link OpenPearlParser#floatFormat}.
	 * @param ctx the parse tree
	 */
	void enterFloatFormatE3(OpenPearlParser.FloatFormatE3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code floatFormatE3}
	 * labeled alternative in {@link OpenPearlParser#floatFormat}.
	 * @param ctx the parse tree
	 */
	void exitFloatFormatE3(OpenPearlParser.FloatFormatE3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bitFormat1}
	 * labeled alternative in {@link OpenPearlParser#bitFormat}.
	 * @param ctx the parse tree
	 */
	void enterBitFormat1(OpenPearlParser.BitFormat1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bitFormat1}
	 * labeled alternative in {@link OpenPearlParser#bitFormat}.
	 * @param ctx the parse tree
	 */
	void exitBitFormat1(OpenPearlParser.BitFormat1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bitFormat2}
	 * labeled alternative in {@link OpenPearlParser#bitFormat}.
	 * @param ctx the parse tree
	 */
	void enterBitFormat2(OpenPearlParser.BitFormat2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bitFormat2}
	 * labeled alternative in {@link OpenPearlParser#bitFormat}.
	 * @param ctx the parse tree
	 */
	void exitBitFormat2(OpenPearlParser.BitFormat2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bitFormat3}
	 * labeled alternative in {@link OpenPearlParser#bitFormat}.
	 * @param ctx the parse tree
	 */
	void enterBitFormat3(OpenPearlParser.BitFormat3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bitFormat3}
	 * labeled alternative in {@link OpenPearlParser#bitFormat}.
	 * @param ctx the parse tree
	 */
	void exitBitFormat3(OpenPearlParser.BitFormat3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bitFormat4}
	 * labeled alternative in {@link OpenPearlParser#bitFormat}.
	 * @param ctx the parse tree
	 */
	void enterBitFormat4(OpenPearlParser.BitFormat4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bitFormat4}
	 * labeled alternative in {@link OpenPearlParser#bitFormat}.
	 * @param ctx the parse tree
	 */
	void exitBitFormat4(OpenPearlParser.BitFormat4Context ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#numberOfCharacters}.
	 * @param ctx the parse tree
	 */
	void enterNumberOfCharacters(OpenPearlParser.NumberOfCharactersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#numberOfCharacters}.
	 * @param ctx the parse tree
	 */
	void exitNumberOfCharacters(OpenPearlParser.NumberOfCharactersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#timeFormat}.
	 * @param ctx the parse tree
	 */
	void enterTimeFormat(OpenPearlParser.TimeFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#timeFormat}.
	 * @param ctx the parse tree
	 */
	void exitTimeFormat(OpenPearlParser.TimeFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#durationFormat}.
	 * @param ctx the parse tree
	 */
	void enterDurationFormat(OpenPearlParser.DurationFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#durationFormat}.
	 * @param ctx the parse tree
	 */
	void exitDurationFormat(OpenPearlParser.DurationFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#decimalPositions}.
	 * @param ctx the parse tree
	 */
	void enterDecimalPositions(OpenPearlParser.DecimalPositionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#decimalPositions}.
	 * @param ctx the parse tree
	 */
	void exitDecimalPositions(OpenPearlParser.DecimalPositionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#scaleFactor}.
	 * @param ctx the parse tree
	 */
	void enterScaleFactor(OpenPearlParser.ScaleFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#scaleFactor}.
	 * @param ctx the parse tree
	 */
	void exitScaleFactor(OpenPearlParser.ScaleFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterStringFormatA}
	 * labeled alternative in {@link OpenPearlParser#characterStringFormat}.
	 * @param ctx the parse tree
	 */
	void enterCharacterStringFormatA(OpenPearlParser.CharacterStringFormatAContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterStringFormatA}
	 * labeled alternative in {@link OpenPearlParser#characterStringFormat}.
	 * @param ctx the parse tree
	 */
	void exitCharacterStringFormatA(OpenPearlParser.CharacterStringFormatAContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterStringFormatS}
	 * labeled alternative in {@link OpenPearlParser#characterStringFormat}.
	 * @param ctx the parse tree
	 */
	void enterCharacterStringFormatS(OpenPearlParser.CharacterStringFormatSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterStringFormatS}
	 * labeled alternative in {@link OpenPearlParser#characterStringFormat}.
	 * @param ctx the parse tree
	 */
	void exitCharacterStringFormatS(OpenPearlParser.CharacterStringFormatSContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#channel}.
	 * @param ctx the parse tree
	 */
	void enterChannel(OpenPearlParser.ChannelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#channel}.
	 * @param ctx the parse tree
	 */
	void exitChannel(OpenPearlParser.ChannelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#index_array}.
	 * @param ctx the parse tree
	 */
	void enterIndex_array(OpenPearlParser.Index_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#index_array}.
	 * @param ctx the parse tree
	 */
	void exitIndex_array(OpenPearlParser.Index_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#arraySlice}.
	 * @param ctx the parse tree
	 */
	void enterArraySlice(OpenPearlParser.ArraySliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#arraySlice}.
	 * @param ctx the parse tree
	 */
	void exitArraySlice(OpenPearlParser.ArraySliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#startIndex}.
	 * @param ctx the parse tree
	 */
	void enterStartIndex(OpenPearlParser.StartIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#startIndex}.
	 * @param ctx the parse tree
	 */
	void exitStartIndex(OpenPearlParser.StartIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#endIndex}.
	 * @param ctx the parse tree
	 */
	void enterEndIndex(OpenPearlParser.EndIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#endIndex}.
	 * @param ctx the parse tree
	 */
	void exitEndIndex(OpenPearlParser.EndIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#interruptDenotation}.
	 * @param ctx the parse tree
	 */
	void enterInterruptDenotation(OpenPearlParser.InterruptDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#interruptDenotation}.
	 * @param ctx the parse tree
	 */
	void exitInterruptDenotation(OpenPearlParser.InterruptDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#dationDenotation}.
	 * @param ctx the parse tree
	 */
	void enterDationDenotation(OpenPearlParser.DationDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#dationDenotation}.
	 * @param ctx the parse tree
	 */
	void exitDationDenotation(OpenPearlParser.DationDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typeDation}.
	 * @param ctx the parse tree
	 */
	void enterTypeDation(OpenPearlParser.TypeDationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typeDation}.
	 * @param ctx the parse tree
	 */
	void exitTypeDation(OpenPearlParser.TypeDationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sourceSinkAttributeIN}
	 * labeled alternative in {@link OpenPearlParser#sourceSinkAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSourceSinkAttributeIN(OpenPearlParser.SourceSinkAttributeINContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sourceSinkAttributeIN}
	 * labeled alternative in {@link OpenPearlParser#sourceSinkAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSourceSinkAttributeIN(OpenPearlParser.SourceSinkAttributeINContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sourceSinkAttributeOUT}
	 * labeled alternative in {@link OpenPearlParser#sourceSinkAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSourceSinkAttributeOUT(OpenPearlParser.SourceSinkAttributeOUTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sourceSinkAttributeOUT}
	 * labeled alternative in {@link OpenPearlParser#sourceSinkAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSourceSinkAttributeOUT(OpenPearlParser.SourceSinkAttributeOUTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sourceSinkAttributeINOUT}
	 * labeled alternative in {@link OpenPearlParser#sourceSinkAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSourceSinkAttributeINOUT(OpenPearlParser.SourceSinkAttributeINOUTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sourceSinkAttributeINOUT}
	 * labeled alternative in {@link OpenPearlParser#sourceSinkAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSourceSinkAttributeINOUT(OpenPearlParser.SourceSinkAttributeINOUTContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#systemDation}.
	 * @param ctx the parse tree
	 */
	void enterSystemDation(OpenPearlParser.SystemDationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#systemDation}.
	 * @param ctx the parse tree
	 */
	void exitSystemDation(OpenPearlParser.SystemDationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#classAttribute}.
	 * @param ctx the parse tree
	 */
	void enterClassAttribute(OpenPearlParser.ClassAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#classAttribute}.
	 * @param ctx the parse tree
	 */
	void exitClassAttribute(OpenPearlParser.ClassAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#alphicDation}.
	 * @param ctx the parse tree
	 */
	void enterAlphicDation(OpenPearlParser.AlphicDationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#alphicDation}.
	 * @param ctx the parse tree
	 */
	void exitAlphicDation(OpenPearlParser.AlphicDationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#basicDation}.
	 * @param ctx the parse tree
	 */
	void enterBasicDation(OpenPearlParser.BasicDationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#basicDation}.
	 * @param ctx the parse tree
	 */
	void exitBasicDation(OpenPearlParser.BasicDationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeOfTransmissionDataALL}
	 * labeled alternative in {@link OpenPearlParser#typeOfTransmissionData}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfTransmissionDataALL(OpenPearlParser.TypeOfTransmissionDataALLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeOfTransmissionDataALL}
	 * labeled alternative in {@link OpenPearlParser#typeOfTransmissionData}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfTransmissionDataALL(OpenPearlParser.TypeOfTransmissionDataALLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeOfTransmissionDataSimpleType}
	 * labeled alternative in {@link OpenPearlParser#typeOfTransmissionData}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfTransmissionDataSimpleType(OpenPearlParser.TypeOfTransmissionDataSimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeOfTransmissionDataSimpleType}
	 * labeled alternative in {@link OpenPearlParser#typeOfTransmissionData}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfTransmissionDataSimpleType(OpenPearlParser.TypeOfTransmissionDataSimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeOfTransmissionDataCompoundType}
	 * labeled alternative in {@link OpenPearlParser#typeOfTransmissionData}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfTransmissionDataCompoundType(OpenPearlParser.TypeOfTransmissionDataCompoundTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeOfTransmissionDataCompoundType}
	 * labeled alternative in {@link OpenPearlParser#typeOfTransmissionData}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfTransmissionDataCompoundType(OpenPearlParser.TypeOfTransmissionDataCompoundTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#accessAttribute}.
	 * @param ctx the parse tree
	 */
	void enterAccessAttribute(OpenPearlParser.AccessAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#accessAttribute}.
	 * @param ctx the parse tree
	 */
	void exitAccessAttribute(OpenPearlParser.AccessAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#typology}.
	 * @param ctx the parse tree
	 */
	void enterTypology(OpenPearlParser.TypologyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#typology}.
	 * @param ctx the parse tree
	 */
	void exitTypology(OpenPearlParser.TypologyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dimension1Star}
	 * labeled alternative in {@link OpenPearlParser#dimension1}.
	 * @param ctx the parse tree
	 */
	void enterDimension1Star(OpenPearlParser.Dimension1StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dimension1Star}
	 * labeled alternative in {@link OpenPearlParser#dimension1}.
	 * @param ctx the parse tree
	 */
	void exitDimension1Star(OpenPearlParser.Dimension1StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dimension1Integer}
	 * labeled alternative in {@link OpenPearlParser#dimension1}.
	 * @param ctx the parse tree
	 */
	void enterDimension1Integer(OpenPearlParser.Dimension1IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dimension1Integer}
	 * labeled alternative in {@link OpenPearlParser#dimension1}.
	 * @param ctx the parse tree
	 */
	void exitDimension1Integer(OpenPearlParser.Dimension1IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dimension2Integer}
	 * labeled alternative in {@link OpenPearlParser#dimension2}.
	 * @param ctx the parse tree
	 */
	void enterDimension2Integer(OpenPearlParser.Dimension2IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dimension2Integer}
	 * labeled alternative in {@link OpenPearlParser#dimension2}.
	 * @param ctx the parse tree
	 */
	void exitDimension2Integer(OpenPearlParser.Dimension2IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dimension3Integer}
	 * labeled alternative in {@link OpenPearlParser#dimension3}.
	 * @param ctx the parse tree
	 */
	void enterDimension3Integer(OpenPearlParser.Dimension3IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dimension3Integer}
	 * labeled alternative in {@link OpenPearlParser#dimension3}.
	 * @param ctx the parse tree
	 */
	void exitDimension3Integer(OpenPearlParser.Dimension3IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#tfu}.
	 * @param ctx the parse tree
	 */
	void enterTfu(OpenPearlParser.TfuContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#tfu}.
	 * @param ctx the parse tree
	 */
	void exitTfu(OpenPearlParser.TfuContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#tfuMax}.
	 * @param ctx the parse tree
	 */
	void enterTfuMax(OpenPearlParser.TfuMaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#tfuMax}.
	 * @param ctx the parse tree
	 */
	void exitTfuMax(OpenPearlParser.TfuMaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#dimensionAttribute}.
	 * @param ctx the parse tree
	 */
	void enterDimensionAttribute(OpenPearlParser.DimensionAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#dimensionAttribute}.
	 * @param ctx the parse tree
	 */
	void exitDimensionAttribute(OpenPearlParser.DimensionAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#dimensionAttributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDimensionAttributeDeclaration(OpenPearlParser.DimensionAttributeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#dimensionAttributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDimensionAttributeDeclaration(OpenPearlParser.DimensionAttributeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#boundaryDenotation}.
	 * @param ctx the parse tree
	 */
	void enterBoundaryDenotation(OpenPearlParser.BoundaryDenotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#boundaryDenotation}.
	 * @param ctx the parse tree
	 */
	void exitBoundaryDenotation(OpenPearlParser.BoundaryDenotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#indices}.
	 * @param ctx the parse tree
	 */
	void enterIndices(OpenPearlParser.IndicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#indices}.
	 * @param ctx the parse tree
	 */
	void exitIndices(OpenPearlParser.IndicesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMultiplicativeExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMultiplicativeExpression(OpenPearlParser.UnaryMultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMultiplicativeExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMultiplicativeExpression(OpenPearlParser.UnaryMultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(OpenPearlParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(OpenPearlParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sizeofExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSizeofExpression(OpenPearlParser.SizeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sizeofExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSizeofExpression(OpenPearlParser.SizeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(OpenPearlParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(OpenPearlParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqRelationalExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqRelationalExpression(OpenPearlParser.EqRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqRelationalExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqRelationalExpression(OpenPearlParser.EqRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractiveExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtractiveExpression(OpenPearlParser.SubtractiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractiveExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtractiveExpression(OpenPearlParser.SubtractiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code upbDyadicExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUpbDyadicExpression(OpenPearlParser.UpbDyadicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code upbDyadicExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUpbDyadicExpression(OpenPearlParser.UpbDyadicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atanExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtanExpression(OpenPearlParser.AtanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atanExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtanExpression(OpenPearlParser.AtanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(OpenPearlParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(OpenPearlParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code taskFunction}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTaskFunction(OpenPearlParser.TaskFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code taskFunction}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTaskFunction(OpenPearlParser.TaskFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtRelationalExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGtRelationalExpression(OpenPearlParser.GtRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtRelationalExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGtRelationalExpression(OpenPearlParser.GtRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONTExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCONTExpression(OpenPearlParser.CONTExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONTExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCONTExpression(OpenPearlParser.CONTExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code absExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAbsExpression(OpenPearlParser.AbsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAbsExpression(OpenPearlParser.AbsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neRelationalExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNeRelationalExpression(OpenPearlParser.NeRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neRelationalExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNeRelationalExpression(OpenPearlParser.NeRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltRelationalExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtRelationalExpression(OpenPearlParser.LtRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltRelationalExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtRelationalExpression(OpenPearlParser.LtRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(OpenPearlParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(OpenPearlParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prioFunction}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrioFunction(OpenPearlParser.PrioFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prioFunction}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrioFunction(OpenPearlParser.PrioFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryAdditiveExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryAdditiveExpression(OpenPearlParser.UnaryAdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryAdditiveExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryAdditiveExpression(OpenPearlParser.UnaryAdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code remainderExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRemainderExpression(OpenPearlParser.RemainderExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code remainderExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRemainderExpression(OpenPearlParser.RemainderExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code baseExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBaseExpression(OpenPearlParser.BaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBaseExpression(OpenPearlParser.BaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(OpenPearlParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(OpenPearlParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lnExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLnExpression(OpenPearlParser.LnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lnExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLnExpression(OpenPearlParser.LnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cosExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCosExpression(OpenPearlParser.CosExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cosExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCosExpression(OpenPearlParser.CosExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(OpenPearlParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(OpenPearlParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpExpression(OpenPearlParser.ExpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpExpression(OpenPearlParser.ExpExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TOFIXEDExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTOFIXEDExpression(OpenPearlParser.TOFIXEDExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TOFIXEDExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTOFIXEDExpression(OpenPearlParser.TOFIXEDExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isRelationalExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsRelationalExpression(OpenPearlParser.IsRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isRelationalExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsRelationalExpression(OpenPearlParser.IsRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideIntegerExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideIntegerExpression(OpenPearlParser.DivideIntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideIntegerExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideIntegerExpression(OpenPearlParser.DivideIntegerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unarySubtractiveExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnarySubtractiveExpression(OpenPearlParser.UnarySubtractiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unarySubtractiveExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnarySubtractiveExpression(OpenPearlParser.UnarySubtractiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lwbMonadicExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLwbMonadicExpression(OpenPearlParser.LwbMonadicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lwbMonadicExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLwbMonadicExpression(OpenPearlParser.LwbMonadicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code entierExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEntierExpression(OpenPearlParser.EntierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code entierExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEntierExpression(OpenPearlParser.EntierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code upbMonadicExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUpbMonadicExpression(OpenPearlParser.UpbMonadicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code upbMonadicExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUpbMonadicExpression(OpenPearlParser.UpbMonadicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nowFunction}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNowFunction(OpenPearlParser.NowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nowFunction}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNowFunction(OpenPearlParser.NowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code geRelationalExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGeRelationalExpression(OpenPearlParser.GeRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code geRelationalExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGeRelationalExpression(OpenPearlParser.GeRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqrtExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSqrtExpression(OpenPearlParser.SqrtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqrtExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSqrtExpression(OpenPearlParser.SqrtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tanExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTanExpression(OpenPearlParser.TanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tanExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTanExpression(OpenPearlParser.TanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sinExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSinExpression(OpenPearlParser.SinExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sinExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSinExpression(OpenPearlParser.SinExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leRelationalExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLeRelationalExpression(OpenPearlParser.LeRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leRelationalExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLeRelationalExpression(OpenPearlParser.LeRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dateFunction}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDateFunction(OpenPearlParser.DateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dateFunction}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDateFunction(OpenPearlParser.DateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSignExpression(OpenPearlParser.SignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSignExpression(OpenPearlParser.SignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lwbDyadicExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLwbDyadicExpression(OpenPearlParser.LwbDyadicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lwbDyadicExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLwbDyadicExpression(OpenPearlParser.LwbDyadicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TOFLOATExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTOFLOATExpression(OpenPearlParser.TOFLOATExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TOFLOATExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTOFLOATExpression(OpenPearlParser.TOFLOATExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isntRelationalExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsntRelationalExpression(OpenPearlParser.IsntRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isntRelationalExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsntRelationalExpression(OpenPearlParser.IsntRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code catExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCatExpression(OpenPearlParser.CatExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code catExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCatExpression(OpenPearlParser.CatExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TOCHARExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTOCHARExpression(OpenPearlParser.TOCHARExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TOCHARExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTOCHARExpression(OpenPearlParser.TOCHARExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(OpenPearlParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(OpenPearlParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tanhExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTanhExpression(OpenPearlParser.TanhExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tanhExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTanhExpression(OpenPearlParser.TanhExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cshiftExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCshiftExpression(OpenPearlParser.CshiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cshiftExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCshiftExpression(OpenPearlParser.CshiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExorExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExorExpression(OpenPearlParser.ExorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExorExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExorExpression(OpenPearlParser.ExorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unarySignedLiteralExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnarySignedLiteralExpression(OpenPearlParser.UnarySignedLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unarySignedLiteralExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnarySignedLiteralExpression(OpenPearlParser.UnarySignedLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TOBITExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTOBITExpression(OpenPearlParser.TOBITExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TOBITExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTOBITExpression(OpenPearlParser.TOBITExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fitExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFitExpression(OpenPearlParser.FitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fitExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFitExpression(OpenPearlParser.FitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exponentiationExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExponentiationExpression(OpenPearlParser.ExponentiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exponentiationExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExponentiationExpression(OpenPearlParser.ExponentiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code roundExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRoundExpression(OpenPearlParser.RoundExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code roundExpression}
	 * labeled alternative in {@link OpenPearlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRoundExpression(OpenPearlParser.RoundExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#unaryLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryLiteralExpression(OpenPearlParser.UnaryLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#unaryLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryLiteralExpression(OpenPearlParser.UnaryLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(OpenPearlParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(OpenPearlParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(OpenPearlParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(OpenPearlParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#numericLiteralUnsigned}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteralUnsigned(OpenPearlParser.NumericLiteralUnsignedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#numericLiteralUnsigned}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteralUnsigned(OpenPearlParser.NumericLiteralUnsignedContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#numericLiteralPositive}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteralPositive(OpenPearlParser.NumericLiteralPositiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#numericLiteralPositive}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteralPositive(OpenPearlParser.NumericLiteralPositiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#numericLiteralNegative}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteralNegative(OpenPearlParser.NumericLiteralNegativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#numericLiteralNegative}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteralNegative(OpenPearlParser.NumericLiteralNegativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(OpenPearlParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(OpenPearlParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#listOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterListOfExpression(OpenPearlParser.ListOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#listOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitListOfExpression(OpenPearlParser.ListOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(OpenPearlParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(OpenPearlParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(OpenPearlParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(OpenPearlParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(OpenPearlParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(OpenPearlParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#constantFixedExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantFixedExpression(OpenPearlParser.ConstantFixedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#constantFixedExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantFixedExpression(OpenPearlParser.ConstantFixedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#additiveConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveConstantFixedExpressionTerm(OpenPearlParser.AdditiveConstantFixedExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#additiveConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveConstantFixedExpressionTerm(OpenPearlParser.AdditiveConstantFixedExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#subtractiveConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterSubtractiveConstantFixedExpressionTerm(OpenPearlParser.SubtractiveConstantFixedExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#subtractiveConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitSubtractiveConstantFixedExpressionTerm(OpenPearlParser.SubtractiveConstantFixedExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#constantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterConstantFixedExpressionTerm(OpenPearlParser.ConstantFixedExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#constantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitConstantFixedExpressionTerm(OpenPearlParser.ConstantFixedExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#multiplicationConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationConstantFixedExpressionTerm(OpenPearlParser.MultiplicationConstantFixedExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#multiplicationConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationConstantFixedExpressionTerm(OpenPearlParser.MultiplicationConstantFixedExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#divisionConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterDivisionConstantFixedExpressionTerm(OpenPearlParser.DivisionConstantFixedExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#divisionConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitDivisionConstantFixedExpressionTerm(OpenPearlParser.DivisionConstantFixedExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#remainderConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterRemainderConstantFixedExpressionTerm(OpenPearlParser.RemainderConstantFixedExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#remainderConstantFixedExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitRemainderConstantFixedExpressionTerm(OpenPearlParser.RemainderConstantFixedExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signPlus}
	 * labeled alternative in {@link OpenPearlParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSignPlus(OpenPearlParser.SignPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signPlus}
	 * labeled alternative in {@link OpenPearlParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSignPlus(OpenPearlParser.SignPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signMinus}
	 * labeled alternative in {@link OpenPearlParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSignMinus(OpenPearlParser.SignMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signMinus}
	 * labeled alternative in {@link OpenPearlParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSignMinus(OpenPearlParser.SignMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#constantFixedExpressionFactor}.
	 * @param ctx the parse tree
	 */
	void enterConstantFixedExpressionFactor(OpenPearlParser.ConstantFixedExpressionFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#constantFixedExpressionFactor}.
	 * @param ctx the parse tree
	 */
	void exitConstantFixedExpressionFactor(OpenPearlParser.ConstantFixedExpressionFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#constantFixedExpressionFit}.
	 * @param ctx the parse tree
	 */
	void enterConstantFixedExpressionFit(OpenPearlParser.ConstantFixedExpressionFitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#constantFixedExpressionFit}.
	 * @param ctx the parse tree
	 */
	void exitConstantFixedExpressionFit(OpenPearlParser.ConstantFixedExpressionFitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#convertStatement}.
	 * @param ctx the parse tree
	 */
	void enterConvertStatement(OpenPearlParser.ConvertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#convertStatement}.
	 * @param ctx the parse tree
	 */
	void exitConvertStatement(OpenPearlParser.ConvertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#convertToStatement}.
	 * @param ctx the parse tree
	 */
	void enterConvertToStatement(OpenPearlParser.ConvertToStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#convertToStatement}.
	 * @param ctx the parse tree
	 */
	void exitConvertToStatement(OpenPearlParser.ConvertToStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#convertFromStatement}.
	 * @param ctx the parse tree
	 */
	void enterConvertFromStatement(OpenPearlParser.ConvertFromStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#convertFromStatement}.
	 * @param ctx the parse tree
	 */
	void exitConvertFromStatement(OpenPearlParser.ConvertFromStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#listFormat}.
	 * @param ctx the parse tree
	 */
	void enterListFormat(OpenPearlParser.ListFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#listFormat}.
	 * @param ctx the parse tree
	 */
	void exitListFormat(OpenPearlParser.ListFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#rFormat}.
	 * @param ctx the parse tree
	 */
	void enterRFormat(OpenPearlParser.RFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#rFormat}.
	 * @param ctx the parse tree
	 */
	void exitRFormat(OpenPearlParser.RFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#stringSlice}.
	 * @param ctx the parse tree
	 */
	void enterStringSlice(OpenPearlParser.StringSliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#stringSlice}.
	 * @param ctx the parse tree
	 */
	void exitStringSlice(OpenPearlParser.StringSliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case1BitSlice}
	 * labeled alternative in {@link OpenPearlParser#bitSlice}.
	 * @param ctx the parse tree
	 */
	void enterCase1BitSlice(OpenPearlParser.Case1BitSliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case1BitSlice}
	 * labeled alternative in {@link OpenPearlParser#bitSlice}.
	 * @param ctx the parse tree
	 */
	void exitCase1BitSlice(OpenPearlParser.Case1BitSliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case2BitSlice}
	 * labeled alternative in {@link OpenPearlParser#bitSlice}.
	 * @param ctx the parse tree
	 */
	void enterCase2BitSlice(OpenPearlParser.Case2BitSliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case2BitSlice}
	 * labeled alternative in {@link OpenPearlParser#bitSlice}.
	 * @param ctx the parse tree
	 */
	void exitCase2BitSlice(OpenPearlParser.Case2BitSliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case3BitSlice}
	 * labeled alternative in {@link OpenPearlParser#bitSlice}.
	 * @param ctx the parse tree
	 */
	void enterCase3BitSlice(OpenPearlParser.Case3BitSliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case3BitSlice}
	 * labeled alternative in {@link OpenPearlParser#bitSlice}.
	 * @param ctx the parse tree
	 */
	void exitCase3BitSlice(OpenPearlParser.Case3BitSliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case1CharSlice}
	 * labeled alternative in {@link OpenPearlParser#charSlice}.
	 * @param ctx the parse tree
	 */
	void enterCase1CharSlice(OpenPearlParser.Case1CharSliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case1CharSlice}
	 * labeled alternative in {@link OpenPearlParser#charSlice}.
	 * @param ctx the parse tree
	 */
	void exitCase1CharSlice(OpenPearlParser.Case1CharSliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case3CharSlice}
	 * labeled alternative in {@link OpenPearlParser#charSlice}.
	 * @param ctx the parse tree
	 */
	void enterCase3CharSlice(OpenPearlParser.Case3CharSliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case3CharSlice}
	 * labeled alternative in {@link OpenPearlParser#charSlice}.
	 * @param ctx the parse tree
	 */
	void exitCase3CharSlice(OpenPearlParser.Case3CharSliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case4CharSlice}
	 * labeled alternative in {@link OpenPearlParser#charSlice}.
	 * @param ctx the parse tree
	 */
	void enterCase4CharSlice(OpenPearlParser.Case4CharSliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case4CharSlice}
	 * labeled alternative in {@link OpenPearlParser#charSlice}.
	 * @param ctx the parse tree
	 */
	void exitCase4CharSlice(OpenPearlParser.Case4CharSliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#referenceConstant}.
	 * @param ctx the parse tree
	 */
	void enterReferenceConstant(OpenPearlParser.ReferenceConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#referenceConstant}.
	 * @param ctx the parse tree
	 */
	void exitReferenceConstant(OpenPearlParser.ReferenceConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#fixedConstant}.
	 * @param ctx the parse tree
	 */
	void enterFixedConstant(OpenPearlParser.FixedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#fixedConstant}.
	 * @param ctx the parse tree
	 */
	void exitFixedConstant(OpenPearlParser.FixedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#fixedNumberPrecision}.
	 * @param ctx the parse tree
	 */
	void enterFixedNumberPrecision(OpenPearlParser.FixedNumberPrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#fixedNumberPrecision}.
	 * @param ctx the parse tree
	 */
	void exitFixedNumberPrecision(OpenPearlParser.FixedNumberPrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(OpenPearlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(OpenPearlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(OpenPearlParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(OpenPearlParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#bitStringConstant}.
	 * @param ctx the parse tree
	 */
	void enterBitStringConstant(OpenPearlParser.BitStringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#bitStringConstant}.
	 * @param ctx the parse tree
	 */
	void exitBitStringConstant(OpenPearlParser.BitStringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#timeConstant}.
	 * @param ctx the parse tree
	 */
	void enterTimeConstant(OpenPearlParser.TimeConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#timeConstant}.
	 * @param ctx the parse tree
	 */
	void exitTimeConstant(OpenPearlParser.TimeConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#durationConstant}.
	 * @param ctx the parse tree
	 */
	void enterDurationConstant(OpenPearlParser.DurationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#durationConstant}.
	 * @param ctx the parse tree
	 */
	void exitDurationConstant(OpenPearlParser.DurationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#hours}.
	 * @param ctx the parse tree
	 */
	void enterHours(OpenPearlParser.HoursContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#hours}.
	 * @param ctx the parse tree
	 */
	void exitHours(OpenPearlParser.HoursContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#minutes}.
	 * @param ctx the parse tree
	 */
	void enterMinutes(OpenPearlParser.MinutesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#minutes}.
	 * @param ctx the parse tree
	 */
	void exitMinutes(OpenPearlParser.MinutesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#seconds}.
	 * @param ctx the parse tree
	 */
	void enterSeconds(OpenPearlParser.SecondsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#seconds}.
	 * @param ctx the parse tree
	 */
	void exitSeconds(OpenPearlParser.SecondsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#floatingPointConstant}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointConstant(OpenPearlParser.FloatingPointConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#floatingPointConstant}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointConstant(OpenPearlParser.FloatingPointConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#cpp_inline}.
	 * @param ctx the parse tree
	 */
	void enterCpp_inline(OpenPearlParser.Cpp_inlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#cpp_inline}.
	 * @param ctx the parse tree
	 */
	void exitCpp_inline(OpenPearlParser.Cpp_inlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#lengthDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLengthDefinition(OpenPearlParser.LengthDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#lengthDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLengthDefinition(OpenPearlParser.LengthDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lengthDefinitionFixedType}
	 * labeled alternative in {@link OpenPearlParser#lengthDefinitionType}.
	 * @param ctx the parse tree
	 */
	void enterLengthDefinitionFixedType(OpenPearlParser.LengthDefinitionFixedTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lengthDefinitionFixedType}
	 * labeled alternative in {@link OpenPearlParser#lengthDefinitionType}.
	 * @param ctx the parse tree
	 */
	void exitLengthDefinitionFixedType(OpenPearlParser.LengthDefinitionFixedTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lengthDefinitionFloatType}
	 * labeled alternative in {@link OpenPearlParser#lengthDefinitionType}.
	 * @param ctx the parse tree
	 */
	void enterLengthDefinitionFloatType(OpenPearlParser.LengthDefinitionFloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lengthDefinitionFloatType}
	 * labeled alternative in {@link OpenPearlParser#lengthDefinitionType}.
	 * @param ctx the parse tree
	 */
	void exitLengthDefinitionFloatType(OpenPearlParser.LengthDefinitionFloatTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lengthDefinitionBitType}
	 * labeled alternative in {@link OpenPearlParser#lengthDefinitionType}.
	 * @param ctx the parse tree
	 */
	void enterLengthDefinitionBitType(OpenPearlParser.LengthDefinitionBitTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lengthDefinitionBitType}
	 * labeled alternative in {@link OpenPearlParser#lengthDefinitionType}.
	 * @param ctx the parse tree
	 */
	void exitLengthDefinitionBitType(OpenPearlParser.LengthDefinitionBitTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lengthDefinitionCharacterType}
	 * labeled alternative in {@link OpenPearlParser#lengthDefinitionType}.
	 * @param ctx the parse tree
	 */
	void enterLengthDefinitionCharacterType(OpenPearlParser.LengthDefinitionCharacterTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lengthDefinitionCharacterType}
	 * labeled alternative in {@link OpenPearlParser#lengthDefinitionType}.
	 * @param ctx the parse tree
	 */
	void exitLengthDefinitionCharacterType(OpenPearlParser.LengthDefinitionCharacterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(OpenPearlParser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(OpenPearlParser.PrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenPearlParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(OpenPearlParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenPearlParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(OpenPearlParser.LengthContext ctx);
}