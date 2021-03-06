/*
 * generated by Xtext 2.21.0
 */
package io.github.niccomlt.showdown.serializer;

import com.google.inject.Inject;
import io.github.niccomlt.showdown.services.ShowdownGrammarGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class ShowdownGrammarSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ShowdownGrammarGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Pokemon_SolidusKeyword_11_2_1_q;
	protected AbstractElementAlias match_Pokemon_SolidusKeyword_9_2_1_q;
	protected AbstractElementAlias match_Pokemon___EVsKeyword_9_0_ColonKeyword_9_1__q;
	protected AbstractElementAlias match_Pokemon___IVsKeyword_11_0_ColonKeyword_11_1__q;
	protected AbstractElementAlias match_Stat_AtkKeyword_1_1_or_DefKeyword_1_2_or_HPKeyword_1_0_or_SpAKeyword_1_3_or_SpDKeyword_1_4_or_SpeKeyword_1_5;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ShowdownGrammarGrammarAccess) access;
		match_Pokemon_SolidusKeyword_11_2_1_q = new TokenAlias(false, true, grammarAccess.getPokemonAccess().getSolidusKeyword_11_2_1());
		match_Pokemon_SolidusKeyword_9_2_1_q = new TokenAlias(false, true, grammarAccess.getPokemonAccess().getSolidusKeyword_9_2_1());
		match_Pokemon___EVsKeyword_9_0_ColonKeyword_9_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPokemonAccess().getEVsKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getPokemonAccess().getColonKeyword_9_1()));
		match_Pokemon___IVsKeyword_11_0_ColonKeyword_11_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPokemonAccess().getIVsKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getPokemonAccess().getColonKeyword_11_1()));
		match_Stat_AtkKeyword_1_1_or_DefKeyword_1_2_or_HPKeyword_1_0_or_SpAKeyword_1_3_or_SpDKeyword_1_4_or_SpeKeyword_1_5 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatAccess().getAtkKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getStatAccess().getDefKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getStatAccess().getHPKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getStatAccess().getSpAKeyword_1_3()), new TokenAlias(false, false, grammarAccess.getStatAccess().getSpDKeyword_1_4()), new TokenAlias(false, false, grammarAccess.getStatAccess().getSpeKeyword_1_5()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Pokemon_SolidusKeyword_11_2_1_q.equals(syntax))
				emit_Pokemon_SolidusKeyword_11_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pokemon_SolidusKeyword_9_2_1_q.equals(syntax))
				emit_Pokemon_SolidusKeyword_9_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pokemon___EVsKeyword_9_0_ColonKeyword_9_1__q.equals(syntax))
				emit_Pokemon___EVsKeyword_9_0_ColonKeyword_9_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pokemon___IVsKeyword_11_0_ColonKeyword_11_1__q.equals(syntax))
				emit_Pokemon___IVsKeyword_11_0_ColonKeyword_11_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Stat_AtkKeyword_1_1_or_DefKeyword_1_2_or_HPKeyword_1_0_or_SpAKeyword_1_3_or_SpDKeyword_1_4_or_SpeKeyword_1_5.equals(syntax))
				emit_Stat_AtkKeyword_1_1_or_DefKeyword_1_2_or_HPKeyword_1_0_or_SpAKeyword_1_3_or_SpDKeyword_1_4_or_SpeKeyword_1_5(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '/'?
	 *
	 * This ambiguous syntax occurs at:
	 *     ivs+=Stat (ambiguity) '-' moves+=Move
	 *     ivs+=Stat (ambiguity) ivs+=Stat
	 */
	protected void emit_Pokemon_SolidusKeyword_11_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '/'?
	 *
	 * This ambiguous syntax occurs at:
	 *     evs+=Stat (ambiguity) 'IVs' ':' ivs+=Stat
	 *     evs+=Stat (ambiguity) ('IVs' ':')? '-' moves+=Move
	 *     evs+=Stat (ambiguity) evs+=Stat
	 *     evs+=Stat (ambiguity) nature=ID
	 */
	protected void emit_Pokemon_SolidusKeyword_9_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('EVs' ':')?
	 *
	 * This ambiguous syntax occurs at:
	 *     ability=Ability (ambiguity) 'IVs' ':' ivs+=Stat
	 *     ability=Ability (ambiguity) ('IVs' ':')? '-' moves+=Move
	 *     ability=Ability (ambiguity) nature=ID
	 *     happiness=INT (ambiguity) 'IVs' ':' ivs+=Stat
	 *     happiness=INT (ambiguity) ('IVs' ':')? '-' moves+=Move
	 *     happiness=INT (ambiguity) nature=ID
	 *     level=INT (ambiguity) 'IVs' ':' ivs+=Stat
	 *     level=INT (ambiguity) ('IVs' ':')? '-' moves+=Move
	 *     level=INT (ambiguity) nature=ID
	 *     shiny=Shiny (ambiguity) 'IVs' ':' ivs+=Stat
	 *     shiny=Shiny (ambiguity) ('IVs' ':')? '-' moves+=Move
	 *     shiny=Shiny (ambiguity) nature=ID
	 */
	protected void emit_Pokemon___EVsKeyword_9_0_ColonKeyword_9_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('IVs' ':')?
	 *
	 * This ambiguous syntax occurs at:
	 *     ability=Ability ('EVs' ':')? (ambiguity) '-' moves+=Move
	 *     evs+=Stat '/'? (ambiguity) '-' moves+=Move
	 *     happiness=INT ('EVs' ':')? (ambiguity) '-' moves+=Move
	 *     level=INT ('EVs' ':')? (ambiguity) '-' moves+=Move
	 *     nature=ID 'Nature' (ambiguity) '-' moves+=Move
	 *     shiny=Shiny ('EVs' ':')? (ambiguity) '-' moves+=Move
	 */
	protected void emit_Pokemon___IVsKeyword_11_0_ColonKeyword_11_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         'HP' | 
	  *         'Atk' | 
	  *         'Def' | 
	  *         'SpA' | 
	  *         'SpD' | 
	  *         'Spe'
	  *     )
	 *
	 * This ambiguous syntax occurs at:
	 *     value=INT (ambiguity) (rule end)
	 */
	protected void emit_Stat_AtkKeyword_1_1_or_DefKeyword_1_2_or_HPKeyword_1_0_or_SpAKeyword_1_3_or_SpDKeyword_1_4_or_SpeKeyword_1_5(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
