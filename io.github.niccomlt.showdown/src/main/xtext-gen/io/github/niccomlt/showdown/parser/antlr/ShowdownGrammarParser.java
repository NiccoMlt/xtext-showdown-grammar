/*
 * generated by Xtext 2.21.0
 */
package io.github.niccomlt.showdown.parser.antlr;

import com.google.inject.Inject;
import io.github.niccomlt.showdown.parser.antlr.internal.InternalShowdownGrammarParser;
import io.github.niccomlt.showdown.services.ShowdownGrammarGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ShowdownGrammarParser extends AbstractAntlrParser {

	@Inject
	private ShowdownGrammarGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalShowdownGrammarParser createParser(XtextTokenStream stream) {
		return new InternalShowdownGrammarParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Team";
	}

	public ShowdownGrammarGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ShowdownGrammarGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
