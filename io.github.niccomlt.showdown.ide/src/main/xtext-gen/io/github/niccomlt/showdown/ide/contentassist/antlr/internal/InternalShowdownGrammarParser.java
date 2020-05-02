package io.github.niccomlt.showdown.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import io.github.niccomlt.showdown.services.ShowdownGrammarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShowdownGrammarParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Yes'", "'-'", "'HP'", "'Atk'", "'Def'", "'SpA'", "'SpD'", "'Spe'", "'@'", "'Ability'", "':'", "'('", "')'", "'Level'", "'Shiny'", "'Happiness'", "'EVs'", "'/'", "'Nature'", "'IVs'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalShowdownGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalShowdownGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalShowdownGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "InternalShowdownGrammar.g"; }


    	private ShowdownGrammarGrammarAccess grammarAccess;

    	public void setGrammarAccess(ShowdownGrammarGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTeam"
    // InternalShowdownGrammar.g:53:1: entryRuleTeam : ruleTeam EOF ;
    public final void entryRuleTeam() throws RecognitionException {
        try {
            // InternalShowdownGrammar.g:54:1: ( ruleTeam EOF )
            // InternalShowdownGrammar.g:55:1: ruleTeam EOF
            {
             before(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_1);
            ruleTeam();

            state._fsp--;

             after(grammarAccess.getTeamRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTeam"


    // $ANTLR start "ruleTeam"
    // InternalShowdownGrammar.g:62:1: ruleTeam : ( ( rule__Team__ElementsAssignment )* ) ;
    public final void ruleTeam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:66:2: ( ( ( rule__Team__ElementsAssignment )* ) )
            // InternalShowdownGrammar.g:67:2: ( ( rule__Team__ElementsAssignment )* )
            {
            // InternalShowdownGrammar.g:67:2: ( ( rule__Team__ElementsAssignment )* )
            // InternalShowdownGrammar.g:68:3: ( rule__Team__ElementsAssignment )*
            {
             before(grammarAccess.getTeamAccess().getElementsAssignment()); 
            // InternalShowdownGrammar.g:69:3: ( rule__Team__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalShowdownGrammar.g:69:4: rule__Team__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Team__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTeamAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRulePokemon"
    // InternalShowdownGrammar.g:78:1: entryRulePokemon : rulePokemon EOF ;
    public final void entryRulePokemon() throws RecognitionException {
        try {
            // InternalShowdownGrammar.g:79:1: ( rulePokemon EOF )
            // InternalShowdownGrammar.g:80:1: rulePokemon EOF
            {
             before(grammarAccess.getPokemonRule()); 
            pushFollow(FOLLOW_1);
            rulePokemon();

            state._fsp--;

             after(grammarAccess.getPokemonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePokemon"


    // $ANTLR start "rulePokemon"
    // InternalShowdownGrammar.g:87:1: rulePokemon : ( ( rule__Pokemon__Group__0 ) ) ;
    public final void rulePokemon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:91:2: ( ( ( rule__Pokemon__Group__0 ) ) )
            // InternalShowdownGrammar.g:92:2: ( ( rule__Pokemon__Group__0 ) )
            {
            // InternalShowdownGrammar.g:92:2: ( ( rule__Pokemon__Group__0 ) )
            // InternalShowdownGrammar.g:93:3: ( rule__Pokemon__Group__0 )
            {
             before(grammarAccess.getPokemonAccess().getGroup()); 
            // InternalShowdownGrammar.g:94:3: ( rule__Pokemon__Group__0 )
            // InternalShowdownGrammar.g:94:4: rule__Pokemon__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPokemonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePokemon"


    // $ANTLR start "entryRuleMove"
    // InternalShowdownGrammar.g:103:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalShowdownGrammar.g:104:1: ( ruleMove EOF )
            // InternalShowdownGrammar.g:105:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalShowdownGrammar.g:112:1: ruleMove : ( ( ( rule__Move__Alternatives ) ) ( ( rule__Move__Alternatives )* ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:116:2: ( ( ( ( rule__Move__Alternatives ) ) ( ( rule__Move__Alternatives )* ) ) )
            // InternalShowdownGrammar.g:117:2: ( ( ( rule__Move__Alternatives ) ) ( ( rule__Move__Alternatives )* ) )
            {
            // InternalShowdownGrammar.g:117:2: ( ( ( rule__Move__Alternatives ) ) ( ( rule__Move__Alternatives )* ) )
            // InternalShowdownGrammar.g:118:3: ( ( rule__Move__Alternatives ) ) ( ( rule__Move__Alternatives )* )
            {
            // InternalShowdownGrammar.g:118:3: ( ( rule__Move__Alternatives ) )
            // InternalShowdownGrammar.g:119:4: ( rule__Move__Alternatives )
            {
             before(grammarAccess.getMoveAccess().getAlternatives()); 
            // InternalShowdownGrammar.g:120:4: ( rule__Move__Alternatives )
            // InternalShowdownGrammar.g:120:5: rule__Move__Alternatives
            {
            pushFollow(FOLLOW_4);
            rule__Move__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getAlternatives()); 

            }

            // InternalShowdownGrammar.g:123:3: ( ( rule__Move__Alternatives )* )
            // InternalShowdownGrammar.g:124:4: ( rule__Move__Alternatives )*
            {
             before(grammarAccess.getMoveAccess().getAlternatives()); 
            // InternalShowdownGrammar.g:125:4: ( rule__Move__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    switch ( input.LA(2) ) {
                    case EOF:
                        {
                        alt2=1;
                        }
                        break;
                    case 12:
                        {
                        alt2=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt2=1;
                        }
                        break;

                    }

                }
                else if ( (LA2_0==RULE_ID) ) {
                    int LA2_3 = input.LA(2);

                    if ( (LA2_3==EOF) ) {
                        alt2=1;
                    }
                    else if ( (LA2_3==RULE_ID||LA2_3==12) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalShowdownGrammar.g:125:5: rule__Move__Alternatives
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Move__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getMoveAccess().getAlternatives()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleStat"
    // InternalShowdownGrammar.g:135:1: entryRuleStat : ruleStat EOF ;
    public final void entryRuleStat() throws RecognitionException {
        try {
            // InternalShowdownGrammar.g:136:1: ( ruleStat EOF )
            // InternalShowdownGrammar.g:137:1: ruleStat EOF
            {
             before(grammarAccess.getStatRule()); 
            pushFollow(FOLLOW_1);
            ruleStat();

            state._fsp--;

             after(grammarAccess.getStatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStat"


    // $ANTLR start "ruleStat"
    // InternalShowdownGrammar.g:144:1: ruleStat : ( ( rule__Stat__Group__0 ) ) ;
    public final void ruleStat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:148:2: ( ( ( rule__Stat__Group__0 ) ) )
            // InternalShowdownGrammar.g:149:2: ( ( rule__Stat__Group__0 ) )
            {
            // InternalShowdownGrammar.g:149:2: ( ( rule__Stat__Group__0 ) )
            // InternalShowdownGrammar.g:150:3: ( rule__Stat__Group__0 )
            {
             before(grammarAccess.getStatAccess().getGroup()); 
            // InternalShowdownGrammar.g:151:3: ( rule__Stat__Group__0 )
            // InternalShowdownGrammar.g:151:4: rule__Stat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Stat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStat"


    // $ANTLR start "entryRuleShiny"
    // InternalShowdownGrammar.g:160:1: entryRuleShiny : ruleShiny EOF ;
    public final void entryRuleShiny() throws RecognitionException {
        try {
            // InternalShowdownGrammar.g:161:1: ( ruleShiny EOF )
            // InternalShowdownGrammar.g:162:1: ruleShiny EOF
            {
             before(grammarAccess.getShinyRule()); 
            pushFollow(FOLLOW_1);
            ruleShiny();

            state._fsp--;

             after(grammarAccess.getShinyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShiny"


    // $ANTLR start "ruleShiny"
    // InternalShowdownGrammar.g:169:1: ruleShiny : ( 'Yes' ) ;
    public final void ruleShiny() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:173:2: ( ( 'Yes' ) )
            // InternalShowdownGrammar.g:174:2: ( 'Yes' )
            {
            // InternalShowdownGrammar.g:174:2: ( 'Yes' )
            // InternalShowdownGrammar.g:175:3: 'Yes'
            {
             before(grammarAccess.getShinyAccess().getYesKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getShinyAccess().getYesKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShiny"


    // $ANTLR start "entryRuleSpecie"
    // InternalShowdownGrammar.g:185:1: entryRuleSpecie : ruleSpecie EOF ;
    public final void entryRuleSpecie() throws RecognitionException {
        try {
            // InternalShowdownGrammar.g:186:1: ( ruleSpecie EOF )
            // InternalShowdownGrammar.g:187:1: ruleSpecie EOF
            {
             before(grammarAccess.getSpecieRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecie();

            state._fsp--;

             after(grammarAccess.getSpecieRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpecie"


    // $ANTLR start "ruleSpecie"
    // InternalShowdownGrammar.g:194:1: ruleSpecie : ( RULE_ID ) ;
    public final void ruleSpecie() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:198:2: ( ( RULE_ID ) )
            // InternalShowdownGrammar.g:199:2: ( RULE_ID )
            {
            // InternalShowdownGrammar.g:199:2: ( RULE_ID )
            // InternalShowdownGrammar.g:200:3: RULE_ID
            {
             before(grammarAccess.getSpecieAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecieAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecie"


    // $ANTLR start "entryRuleNickname"
    // InternalShowdownGrammar.g:210:1: entryRuleNickname : ruleNickname EOF ;
    public final void entryRuleNickname() throws RecognitionException {
        try {
            // InternalShowdownGrammar.g:211:1: ( ruleNickname EOF )
            // InternalShowdownGrammar.g:212:1: ruleNickname EOF
            {
             before(grammarAccess.getNicknameRule()); 
            pushFollow(FOLLOW_1);
            ruleNickname();

            state._fsp--;

             after(grammarAccess.getNicknameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNickname"


    // $ANTLR start "ruleNickname"
    // InternalShowdownGrammar.g:219:1: ruleNickname : ( RULE_ID ) ;
    public final void ruleNickname() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:223:2: ( ( RULE_ID ) )
            // InternalShowdownGrammar.g:224:2: ( RULE_ID )
            {
            // InternalShowdownGrammar.g:224:2: ( RULE_ID )
            // InternalShowdownGrammar.g:225:3: RULE_ID
            {
             before(grammarAccess.getNicknameAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNicknameAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNickname"


    // $ANTLR start "entryRuleAbility"
    // InternalShowdownGrammar.g:235:1: entryRuleAbility : ruleAbility EOF ;
    public final void entryRuleAbility() throws RecognitionException {
        try {
            // InternalShowdownGrammar.g:236:1: ( ruleAbility EOF )
            // InternalShowdownGrammar.g:237:1: ruleAbility EOF
            {
             before(grammarAccess.getAbilityRule()); 
            pushFollow(FOLLOW_1);
            ruleAbility();

            state._fsp--;

             after(grammarAccess.getAbilityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbility"


    // $ANTLR start "ruleAbility"
    // InternalShowdownGrammar.g:244:1: ruleAbility : ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) ;
    public final void ruleAbility() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:248:2: ( ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) )
            // InternalShowdownGrammar.g:249:2: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            {
            // InternalShowdownGrammar.g:249:2: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            // InternalShowdownGrammar.g:250:3: ( ( RULE_ID ) ) ( ( RULE_ID )* )
            {
            // InternalShowdownGrammar.g:250:3: ( ( RULE_ID ) )
            // InternalShowdownGrammar.g:251:4: ( RULE_ID )
            {
             before(grammarAccess.getAbilityAccess().getIDTerminalRuleCall()); 
            // InternalShowdownGrammar.g:252:4: ( RULE_ID )
            // InternalShowdownGrammar.g:252:5: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_3); 

            }

             after(grammarAccess.getAbilityAccess().getIDTerminalRuleCall()); 

            }

            // InternalShowdownGrammar.g:255:3: ( ( RULE_ID )* )
            // InternalShowdownGrammar.g:256:4: ( RULE_ID )*
            {
             before(grammarAccess.getAbilityAccess().getIDTerminalRuleCall()); 
            // InternalShowdownGrammar.g:257:4: ( RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==EOF||LA3_2==RULE_ID||LA3_2==12||(LA3_2>=24 && LA3_2<=27)||LA3_2==30) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalShowdownGrammar.g:257:5: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_3); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAbilityAccess().getIDTerminalRuleCall()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbility"


    // $ANTLR start "rule__Pokemon__Alternatives_0"
    // InternalShowdownGrammar.g:266:1: rule__Pokemon__Alternatives_0 : ( ( ( rule__Pokemon__Group_0_0__0 ) ) | ( ( rule__Pokemon__SpecieAssignment_0_1 ) ) );
    public final void rule__Pokemon__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:270:1: ( ( ( rule__Pokemon__Group_0_0__0 ) ) | ( ( rule__Pokemon__SpecieAssignment_0_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==22) ) {
                    alt4=1;
                }
                else if ( (LA4_1==19) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalShowdownGrammar.g:271:2: ( ( rule__Pokemon__Group_0_0__0 ) )
                    {
                    // InternalShowdownGrammar.g:271:2: ( ( rule__Pokemon__Group_0_0__0 ) )
                    // InternalShowdownGrammar.g:272:3: ( rule__Pokemon__Group_0_0__0 )
                    {
                     before(grammarAccess.getPokemonAccess().getGroup_0_0()); 
                    // InternalShowdownGrammar.g:273:3: ( rule__Pokemon__Group_0_0__0 )
                    // InternalShowdownGrammar.g:273:4: rule__Pokemon__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pokemon__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPokemonAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShowdownGrammar.g:277:2: ( ( rule__Pokemon__SpecieAssignment_0_1 ) )
                    {
                    // InternalShowdownGrammar.g:277:2: ( ( rule__Pokemon__SpecieAssignment_0_1 ) )
                    // InternalShowdownGrammar.g:278:3: ( rule__Pokemon__SpecieAssignment_0_1 )
                    {
                     before(grammarAccess.getPokemonAccess().getSpecieAssignment_0_1()); 
                    // InternalShowdownGrammar.g:279:3: ( rule__Pokemon__SpecieAssignment_0_1 )
                    // InternalShowdownGrammar.g:279:4: rule__Pokemon__SpecieAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pokemon__SpecieAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPokemonAccess().getSpecieAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Alternatives_0"


    // $ANTLR start "rule__Move__Alternatives"
    // InternalShowdownGrammar.g:287:1: rule__Move__Alternatives : ( ( RULE_ID ) | ( '-' ) );
    public final void rule__Move__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:291:1: ( ( RULE_ID ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalShowdownGrammar.g:292:2: ( RULE_ID )
                    {
                    // InternalShowdownGrammar.g:292:2: ( RULE_ID )
                    // InternalShowdownGrammar.g:293:3: RULE_ID
                    {
                     before(grammarAccess.getMoveAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShowdownGrammar.g:298:2: ( '-' )
                    {
                    // InternalShowdownGrammar.g:298:2: ( '-' )
                    // InternalShowdownGrammar.g:299:3: '-'
                    {
                     before(grammarAccess.getMoveAccess().getHyphenMinusKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Alternatives"


    // $ANTLR start "rule__Stat__Alternatives_1"
    // InternalShowdownGrammar.g:308:1: rule__Stat__Alternatives_1 : ( ( 'HP' ) | ( 'Atk' ) | ( 'Def' ) | ( 'SpA' ) | ( 'SpD' ) | ( 'Spe' ) );
    public final void rule__Stat__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:312:1: ( ( 'HP' ) | ( 'Atk' ) | ( 'Def' ) | ( 'SpA' ) | ( 'SpD' ) | ( 'Spe' ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            case 17:
                {
                alt6=5;
                }
                break;
            case 18:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalShowdownGrammar.g:313:2: ( 'HP' )
                    {
                    // InternalShowdownGrammar.g:313:2: ( 'HP' )
                    // InternalShowdownGrammar.g:314:3: 'HP'
                    {
                     before(grammarAccess.getStatAccess().getHPKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getStatAccess().getHPKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShowdownGrammar.g:319:2: ( 'Atk' )
                    {
                    // InternalShowdownGrammar.g:319:2: ( 'Atk' )
                    // InternalShowdownGrammar.g:320:3: 'Atk'
                    {
                     before(grammarAccess.getStatAccess().getAtkKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getStatAccess().getAtkKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShowdownGrammar.g:325:2: ( 'Def' )
                    {
                    // InternalShowdownGrammar.g:325:2: ( 'Def' )
                    // InternalShowdownGrammar.g:326:3: 'Def'
                    {
                     before(grammarAccess.getStatAccess().getDefKeyword_1_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getStatAccess().getDefKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalShowdownGrammar.g:331:2: ( 'SpA' )
                    {
                    // InternalShowdownGrammar.g:331:2: ( 'SpA' )
                    // InternalShowdownGrammar.g:332:3: 'SpA'
                    {
                     before(grammarAccess.getStatAccess().getSpAKeyword_1_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getStatAccess().getSpAKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalShowdownGrammar.g:337:2: ( 'SpD' )
                    {
                    // InternalShowdownGrammar.g:337:2: ( 'SpD' )
                    // InternalShowdownGrammar.g:338:3: 'SpD'
                    {
                     before(grammarAccess.getStatAccess().getSpDKeyword_1_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getStatAccess().getSpDKeyword_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalShowdownGrammar.g:343:2: ( 'Spe' )
                    {
                    // InternalShowdownGrammar.g:343:2: ( 'Spe' )
                    // InternalShowdownGrammar.g:344:3: 'Spe'
                    {
                     before(grammarAccess.getStatAccess().getSpeKeyword_1_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getStatAccess().getSpeKeyword_1_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stat__Alternatives_1"


    // $ANTLR start "rule__Pokemon__Group__0"
    // InternalShowdownGrammar.g:353:1: rule__Pokemon__Group__0 : rule__Pokemon__Group__0__Impl rule__Pokemon__Group__1 ;
    public final void rule__Pokemon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:357:1: ( rule__Pokemon__Group__0__Impl rule__Pokemon__Group__1 )
            // InternalShowdownGrammar.g:358:2: rule__Pokemon__Group__0__Impl rule__Pokemon__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Pokemon__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__0"


    // $ANTLR start "rule__Pokemon__Group__0__Impl"
    // InternalShowdownGrammar.g:365:1: rule__Pokemon__Group__0__Impl : ( ( rule__Pokemon__Alternatives_0 ) ) ;
    public final void rule__Pokemon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:369:1: ( ( ( rule__Pokemon__Alternatives_0 ) ) )
            // InternalShowdownGrammar.g:370:1: ( ( rule__Pokemon__Alternatives_0 ) )
            {
            // InternalShowdownGrammar.g:370:1: ( ( rule__Pokemon__Alternatives_0 ) )
            // InternalShowdownGrammar.g:371:2: ( rule__Pokemon__Alternatives_0 )
            {
             before(grammarAccess.getPokemonAccess().getAlternatives_0()); 
            // InternalShowdownGrammar.g:372:2: ( rule__Pokemon__Alternatives_0 )
            // InternalShowdownGrammar.g:372:3: rule__Pokemon__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPokemonAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__0__Impl"


    // $ANTLR start "rule__Pokemon__Group__1"
    // InternalShowdownGrammar.g:380:1: rule__Pokemon__Group__1 : rule__Pokemon__Group__1__Impl rule__Pokemon__Group__2 ;
    public final void rule__Pokemon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:384:1: ( rule__Pokemon__Group__1__Impl rule__Pokemon__Group__2 )
            // InternalShowdownGrammar.g:385:2: rule__Pokemon__Group__1__Impl rule__Pokemon__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Pokemon__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__1"


    // $ANTLR start "rule__Pokemon__Group__1__Impl"
    // InternalShowdownGrammar.g:392:1: rule__Pokemon__Group__1__Impl : ( '@' ) ;
    public final void rule__Pokemon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:396:1: ( ( '@' ) )
            // InternalShowdownGrammar.g:397:1: ( '@' )
            {
            // InternalShowdownGrammar.g:397:1: ( '@' )
            // InternalShowdownGrammar.g:398:2: '@'
            {
             before(grammarAccess.getPokemonAccess().getCommercialAtKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getCommercialAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__1__Impl"


    // $ANTLR start "rule__Pokemon__Group__2"
    // InternalShowdownGrammar.g:407:1: rule__Pokemon__Group__2 : rule__Pokemon__Group__2__Impl rule__Pokemon__Group__3 ;
    public final void rule__Pokemon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:411:1: ( rule__Pokemon__Group__2__Impl rule__Pokemon__Group__3 )
            // InternalShowdownGrammar.g:412:2: rule__Pokemon__Group__2__Impl rule__Pokemon__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Pokemon__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__2"


    // $ANTLR start "rule__Pokemon__Group__2__Impl"
    // InternalShowdownGrammar.g:419:1: rule__Pokemon__Group__2__Impl : ( ( rule__Pokemon__ItemAssignment_2 ) ) ;
    public final void rule__Pokemon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:423:1: ( ( ( rule__Pokemon__ItemAssignment_2 ) ) )
            // InternalShowdownGrammar.g:424:1: ( ( rule__Pokemon__ItemAssignment_2 ) )
            {
            // InternalShowdownGrammar.g:424:1: ( ( rule__Pokemon__ItemAssignment_2 ) )
            // InternalShowdownGrammar.g:425:2: ( rule__Pokemon__ItemAssignment_2 )
            {
             before(grammarAccess.getPokemonAccess().getItemAssignment_2()); 
            // InternalShowdownGrammar.g:426:2: ( rule__Pokemon__ItemAssignment_2 )
            // InternalShowdownGrammar.g:426:3: rule__Pokemon__ItemAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__ItemAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPokemonAccess().getItemAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__2__Impl"


    // $ANTLR start "rule__Pokemon__Group__3"
    // InternalShowdownGrammar.g:434:1: rule__Pokemon__Group__3 : rule__Pokemon__Group__3__Impl rule__Pokemon__Group__4 ;
    public final void rule__Pokemon__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:438:1: ( rule__Pokemon__Group__3__Impl rule__Pokemon__Group__4 )
            // InternalShowdownGrammar.g:439:2: rule__Pokemon__Group__3__Impl rule__Pokemon__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Pokemon__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__3"


    // $ANTLR start "rule__Pokemon__Group__3__Impl"
    // InternalShowdownGrammar.g:446:1: rule__Pokemon__Group__3__Impl : ( 'Ability' ) ;
    public final void rule__Pokemon__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:450:1: ( ( 'Ability' ) )
            // InternalShowdownGrammar.g:451:1: ( 'Ability' )
            {
            // InternalShowdownGrammar.g:451:1: ( 'Ability' )
            // InternalShowdownGrammar.g:452:2: 'Ability'
            {
             before(grammarAccess.getPokemonAccess().getAbilityKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getAbilityKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__3__Impl"


    // $ANTLR start "rule__Pokemon__Group__4"
    // InternalShowdownGrammar.g:461:1: rule__Pokemon__Group__4 : rule__Pokemon__Group__4__Impl rule__Pokemon__Group__5 ;
    public final void rule__Pokemon__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:465:1: ( rule__Pokemon__Group__4__Impl rule__Pokemon__Group__5 )
            // InternalShowdownGrammar.g:466:2: rule__Pokemon__Group__4__Impl rule__Pokemon__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Pokemon__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__4"


    // $ANTLR start "rule__Pokemon__Group__4__Impl"
    // InternalShowdownGrammar.g:473:1: rule__Pokemon__Group__4__Impl : ( ':' ) ;
    public final void rule__Pokemon__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:477:1: ( ( ':' ) )
            // InternalShowdownGrammar.g:478:1: ( ':' )
            {
            // InternalShowdownGrammar.g:478:1: ( ':' )
            // InternalShowdownGrammar.g:479:2: ':'
            {
             before(grammarAccess.getPokemonAccess().getColonKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__4__Impl"


    // $ANTLR start "rule__Pokemon__Group__5"
    // InternalShowdownGrammar.g:488:1: rule__Pokemon__Group__5 : rule__Pokemon__Group__5__Impl rule__Pokemon__Group__6 ;
    public final void rule__Pokemon__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:492:1: ( rule__Pokemon__Group__5__Impl rule__Pokemon__Group__6 )
            // InternalShowdownGrammar.g:493:2: rule__Pokemon__Group__5__Impl rule__Pokemon__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Pokemon__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__5"


    // $ANTLR start "rule__Pokemon__Group__5__Impl"
    // InternalShowdownGrammar.g:500:1: rule__Pokemon__Group__5__Impl : ( ( rule__Pokemon__AbilityAssignment_5 ) ) ;
    public final void rule__Pokemon__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:504:1: ( ( ( rule__Pokemon__AbilityAssignment_5 ) ) )
            // InternalShowdownGrammar.g:505:1: ( ( rule__Pokemon__AbilityAssignment_5 ) )
            {
            // InternalShowdownGrammar.g:505:1: ( ( rule__Pokemon__AbilityAssignment_5 ) )
            // InternalShowdownGrammar.g:506:2: ( rule__Pokemon__AbilityAssignment_5 )
            {
             before(grammarAccess.getPokemonAccess().getAbilityAssignment_5()); 
            // InternalShowdownGrammar.g:507:2: ( rule__Pokemon__AbilityAssignment_5 )
            // InternalShowdownGrammar.g:507:3: rule__Pokemon__AbilityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__AbilityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPokemonAccess().getAbilityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__5__Impl"


    // $ANTLR start "rule__Pokemon__Group__6"
    // InternalShowdownGrammar.g:515:1: rule__Pokemon__Group__6 : rule__Pokemon__Group__6__Impl rule__Pokemon__Group__7 ;
    public final void rule__Pokemon__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:519:1: ( rule__Pokemon__Group__6__Impl rule__Pokemon__Group__7 )
            // InternalShowdownGrammar.g:520:2: rule__Pokemon__Group__6__Impl rule__Pokemon__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Pokemon__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__6"


    // $ANTLR start "rule__Pokemon__Group__6__Impl"
    // InternalShowdownGrammar.g:527:1: rule__Pokemon__Group__6__Impl : ( ( rule__Pokemon__Group_6__0 )? ) ;
    public final void rule__Pokemon__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:531:1: ( ( ( rule__Pokemon__Group_6__0 )? ) )
            // InternalShowdownGrammar.g:532:1: ( ( rule__Pokemon__Group_6__0 )? )
            {
            // InternalShowdownGrammar.g:532:1: ( ( rule__Pokemon__Group_6__0 )? )
            // InternalShowdownGrammar.g:533:2: ( rule__Pokemon__Group_6__0 )?
            {
             before(grammarAccess.getPokemonAccess().getGroup_6()); 
            // InternalShowdownGrammar.g:534:2: ( rule__Pokemon__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalShowdownGrammar.g:534:3: rule__Pokemon__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pokemon__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPokemonAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__6__Impl"


    // $ANTLR start "rule__Pokemon__Group__7"
    // InternalShowdownGrammar.g:542:1: rule__Pokemon__Group__7 : rule__Pokemon__Group__7__Impl rule__Pokemon__Group__8 ;
    public final void rule__Pokemon__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:546:1: ( rule__Pokemon__Group__7__Impl rule__Pokemon__Group__8 )
            // InternalShowdownGrammar.g:547:2: rule__Pokemon__Group__7__Impl rule__Pokemon__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Pokemon__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__7"


    // $ANTLR start "rule__Pokemon__Group__7__Impl"
    // InternalShowdownGrammar.g:554:1: rule__Pokemon__Group__7__Impl : ( ( rule__Pokemon__Group_7__0 )? ) ;
    public final void rule__Pokemon__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:558:1: ( ( ( rule__Pokemon__Group_7__0 )? ) )
            // InternalShowdownGrammar.g:559:1: ( ( rule__Pokemon__Group_7__0 )? )
            {
            // InternalShowdownGrammar.g:559:1: ( ( rule__Pokemon__Group_7__0 )? )
            // InternalShowdownGrammar.g:560:2: ( rule__Pokemon__Group_7__0 )?
            {
             before(grammarAccess.getPokemonAccess().getGroup_7()); 
            // InternalShowdownGrammar.g:561:2: ( rule__Pokemon__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalShowdownGrammar.g:561:3: rule__Pokemon__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pokemon__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPokemonAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__7__Impl"


    // $ANTLR start "rule__Pokemon__Group__8"
    // InternalShowdownGrammar.g:569:1: rule__Pokemon__Group__8 : rule__Pokemon__Group__8__Impl rule__Pokemon__Group__9 ;
    public final void rule__Pokemon__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:573:1: ( rule__Pokemon__Group__8__Impl rule__Pokemon__Group__9 )
            // InternalShowdownGrammar.g:574:2: rule__Pokemon__Group__8__Impl rule__Pokemon__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Pokemon__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__8"


    // $ANTLR start "rule__Pokemon__Group__8__Impl"
    // InternalShowdownGrammar.g:581:1: rule__Pokemon__Group__8__Impl : ( ( rule__Pokemon__Group_8__0 )? ) ;
    public final void rule__Pokemon__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:585:1: ( ( ( rule__Pokemon__Group_8__0 )? ) )
            // InternalShowdownGrammar.g:586:1: ( ( rule__Pokemon__Group_8__0 )? )
            {
            // InternalShowdownGrammar.g:586:1: ( ( rule__Pokemon__Group_8__0 )? )
            // InternalShowdownGrammar.g:587:2: ( rule__Pokemon__Group_8__0 )?
            {
             before(grammarAccess.getPokemonAccess().getGroup_8()); 
            // InternalShowdownGrammar.g:588:2: ( rule__Pokemon__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalShowdownGrammar.g:588:3: rule__Pokemon__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pokemon__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPokemonAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__8__Impl"


    // $ANTLR start "rule__Pokemon__Group__9"
    // InternalShowdownGrammar.g:596:1: rule__Pokemon__Group__9 : rule__Pokemon__Group__9__Impl rule__Pokemon__Group__10 ;
    public final void rule__Pokemon__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:600:1: ( rule__Pokemon__Group__9__Impl rule__Pokemon__Group__10 )
            // InternalShowdownGrammar.g:601:2: rule__Pokemon__Group__9__Impl rule__Pokemon__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Pokemon__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__9"


    // $ANTLR start "rule__Pokemon__Group__9__Impl"
    // InternalShowdownGrammar.g:608:1: rule__Pokemon__Group__9__Impl : ( ( rule__Pokemon__Group_9__0 )? ) ;
    public final void rule__Pokemon__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:612:1: ( ( ( rule__Pokemon__Group_9__0 )? ) )
            // InternalShowdownGrammar.g:613:1: ( ( rule__Pokemon__Group_9__0 )? )
            {
            // InternalShowdownGrammar.g:613:1: ( ( rule__Pokemon__Group_9__0 )? )
            // InternalShowdownGrammar.g:614:2: ( rule__Pokemon__Group_9__0 )?
            {
             before(grammarAccess.getPokemonAccess().getGroup_9()); 
            // InternalShowdownGrammar.g:615:2: ( rule__Pokemon__Group_9__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalShowdownGrammar.g:615:3: rule__Pokemon__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pokemon__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPokemonAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__9__Impl"


    // $ANTLR start "rule__Pokemon__Group__10"
    // InternalShowdownGrammar.g:623:1: rule__Pokemon__Group__10 : rule__Pokemon__Group__10__Impl rule__Pokemon__Group__11 ;
    public final void rule__Pokemon__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:627:1: ( rule__Pokemon__Group__10__Impl rule__Pokemon__Group__11 )
            // InternalShowdownGrammar.g:628:2: rule__Pokemon__Group__10__Impl rule__Pokemon__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Pokemon__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__10"


    // $ANTLR start "rule__Pokemon__Group__10__Impl"
    // InternalShowdownGrammar.g:635:1: rule__Pokemon__Group__10__Impl : ( ( rule__Pokemon__Group_10__0 )? ) ;
    public final void rule__Pokemon__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:639:1: ( ( ( rule__Pokemon__Group_10__0 )? ) )
            // InternalShowdownGrammar.g:640:1: ( ( rule__Pokemon__Group_10__0 )? )
            {
            // InternalShowdownGrammar.g:640:1: ( ( rule__Pokemon__Group_10__0 )? )
            // InternalShowdownGrammar.g:641:2: ( rule__Pokemon__Group_10__0 )?
            {
             before(grammarAccess.getPokemonAccess().getGroup_10()); 
            // InternalShowdownGrammar.g:642:2: ( rule__Pokemon__Group_10__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalShowdownGrammar.g:642:3: rule__Pokemon__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pokemon__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPokemonAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__10__Impl"


    // $ANTLR start "rule__Pokemon__Group__11"
    // InternalShowdownGrammar.g:650:1: rule__Pokemon__Group__11 : rule__Pokemon__Group__11__Impl rule__Pokemon__Group__12 ;
    public final void rule__Pokemon__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:654:1: ( rule__Pokemon__Group__11__Impl rule__Pokemon__Group__12 )
            // InternalShowdownGrammar.g:655:2: rule__Pokemon__Group__11__Impl rule__Pokemon__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Pokemon__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__11"


    // $ANTLR start "rule__Pokemon__Group__11__Impl"
    // InternalShowdownGrammar.g:662:1: rule__Pokemon__Group__11__Impl : ( ( rule__Pokemon__Group_11__0 )? ) ;
    public final void rule__Pokemon__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:666:1: ( ( ( rule__Pokemon__Group_11__0 )? ) )
            // InternalShowdownGrammar.g:667:1: ( ( rule__Pokemon__Group_11__0 )? )
            {
            // InternalShowdownGrammar.g:667:1: ( ( rule__Pokemon__Group_11__0 )? )
            // InternalShowdownGrammar.g:668:2: ( rule__Pokemon__Group_11__0 )?
            {
             before(grammarAccess.getPokemonAccess().getGroup_11()); 
            // InternalShowdownGrammar.g:669:2: ( rule__Pokemon__Group_11__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalShowdownGrammar.g:669:3: rule__Pokemon__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pokemon__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPokemonAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__11__Impl"


    // $ANTLR start "rule__Pokemon__Group__12"
    // InternalShowdownGrammar.g:677:1: rule__Pokemon__Group__12 : rule__Pokemon__Group__12__Impl ;
    public final void rule__Pokemon__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:681:1: ( rule__Pokemon__Group__12__Impl )
            // InternalShowdownGrammar.g:682:2: rule__Pokemon__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__12"


    // $ANTLR start "rule__Pokemon__Group__12__Impl"
    // InternalShowdownGrammar.g:688:1: rule__Pokemon__Group__12__Impl : ( ( ( rule__Pokemon__Group_12__0 ) ) ( ( rule__Pokemon__Group_12__0 )* ) ) ;
    public final void rule__Pokemon__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:692:1: ( ( ( ( rule__Pokemon__Group_12__0 ) ) ( ( rule__Pokemon__Group_12__0 )* ) ) )
            // InternalShowdownGrammar.g:693:1: ( ( ( rule__Pokemon__Group_12__0 ) ) ( ( rule__Pokemon__Group_12__0 )* ) )
            {
            // InternalShowdownGrammar.g:693:1: ( ( ( rule__Pokemon__Group_12__0 ) ) ( ( rule__Pokemon__Group_12__0 )* ) )
            // InternalShowdownGrammar.g:694:2: ( ( rule__Pokemon__Group_12__0 ) ) ( ( rule__Pokemon__Group_12__0 )* )
            {
            // InternalShowdownGrammar.g:694:2: ( ( rule__Pokemon__Group_12__0 ) )
            // InternalShowdownGrammar.g:695:3: ( rule__Pokemon__Group_12__0 )
            {
             before(grammarAccess.getPokemonAccess().getGroup_12()); 
            // InternalShowdownGrammar.g:696:3: ( rule__Pokemon__Group_12__0 )
            // InternalShowdownGrammar.g:696:4: rule__Pokemon__Group_12__0
            {
            pushFollow(FOLLOW_10);
            rule__Pokemon__Group_12__0();

            state._fsp--;


            }

             after(grammarAccess.getPokemonAccess().getGroup_12()); 

            }

            // InternalShowdownGrammar.g:699:2: ( ( rule__Pokemon__Group_12__0 )* )
            // InternalShowdownGrammar.g:700:3: ( rule__Pokemon__Group_12__0 )*
            {
             before(grammarAccess.getPokemonAccess().getGroup_12()); 
            // InternalShowdownGrammar.g:701:3: ( rule__Pokemon__Group_12__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalShowdownGrammar.g:701:4: rule__Pokemon__Group_12__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Pokemon__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getPokemonAccess().getGroup_12()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group__12__Impl"


    // $ANTLR start "rule__Pokemon__Group_0_0__0"
    // InternalShowdownGrammar.g:711:1: rule__Pokemon__Group_0_0__0 : rule__Pokemon__Group_0_0__0__Impl rule__Pokemon__Group_0_0__1 ;
    public final void rule__Pokemon__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:715:1: ( rule__Pokemon__Group_0_0__0__Impl rule__Pokemon__Group_0_0__1 )
            // InternalShowdownGrammar.g:716:2: rule__Pokemon__Group_0_0__0__Impl rule__Pokemon__Group_0_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Pokemon__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_0_0__0"


    // $ANTLR start "rule__Pokemon__Group_0_0__0__Impl"
    // InternalShowdownGrammar.g:723:1: rule__Pokemon__Group_0_0__0__Impl : ( ( rule__Pokemon__NickAssignment_0_0_0 ) ) ;
    public final void rule__Pokemon__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:727:1: ( ( ( rule__Pokemon__NickAssignment_0_0_0 ) ) )
            // InternalShowdownGrammar.g:728:1: ( ( rule__Pokemon__NickAssignment_0_0_0 ) )
            {
            // InternalShowdownGrammar.g:728:1: ( ( rule__Pokemon__NickAssignment_0_0_0 ) )
            // InternalShowdownGrammar.g:729:2: ( rule__Pokemon__NickAssignment_0_0_0 )
            {
             before(grammarAccess.getPokemonAccess().getNickAssignment_0_0_0()); 
            // InternalShowdownGrammar.g:730:2: ( rule__Pokemon__NickAssignment_0_0_0 )
            // InternalShowdownGrammar.g:730:3: rule__Pokemon__NickAssignment_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__NickAssignment_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPokemonAccess().getNickAssignment_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_0_0__0__Impl"


    // $ANTLR start "rule__Pokemon__Group_0_0__1"
    // InternalShowdownGrammar.g:738:1: rule__Pokemon__Group_0_0__1 : rule__Pokemon__Group_0_0__1__Impl rule__Pokemon__Group_0_0__2 ;
    public final void rule__Pokemon__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:742:1: ( rule__Pokemon__Group_0_0__1__Impl rule__Pokemon__Group_0_0__2 )
            // InternalShowdownGrammar.g:743:2: rule__Pokemon__Group_0_0__1__Impl rule__Pokemon__Group_0_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Pokemon__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_0_0__1"


    // $ANTLR start "rule__Pokemon__Group_0_0__1__Impl"
    // InternalShowdownGrammar.g:750:1: rule__Pokemon__Group_0_0__1__Impl : ( '(' ) ;
    public final void rule__Pokemon__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:754:1: ( ( '(' ) )
            // InternalShowdownGrammar.g:755:1: ( '(' )
            {
            // InternalShowdownGrammar.g:755:1: ( '(' )
            // InternalShowdownGrammar.g:756:2: '('
            {
             before(grammarAccess.getPokemonAccess().getLeftParenthesisKeyword_0_0_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getLeftParenthesisKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_0_0__1__Impl"


    // $ANTLR start "rule__Pokemon__Group_0_0__2"
    // InternalShowdownGrammar.g:765:1: rule__Pokemon__Group_0_0__2 : rule__Pokemon__Group_0_0__2__Impl rule__Pokemon__Group_0_0__3 ;
    public final void rule__Pokemon__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:769:1: ( rule__Pokemon__Group_0_0__2__Impl rule__Pokemon__Group_0_0__3 )
            // InternalShowdownGrammar.g:770:2: rule__Pokemon__Group_0_0__2__Impl rule__Pokemon__Group_0_0__3
            {
            pushFollow(FOLLOW_12);
            rule__Pokemon__Group_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_0_0__2"


    // $ANTLR start "rule__Pokemon__Group_0_0__2__Impl"
    // InternalShowdownGrammar.g:777:1: rule__Pokemon__Group_0_0__2__Impl : ( ( rule__Pokemon__SpecieAssignment_0_0_2 ) ) ;
    public final void rule__Pokemon__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:781:1: ( ( ( rule__Pokemon__SpecieAssignment_0_0_2 ) ) )
            // InternalShowdownGrammar.g:782:1: ( ( rule__Pokemon__SpecieAssignment_0_0_2 ) )
            {
            // InternalShowdownGrammar.g:782:1: ( ( rule__Pokemon__SpecieAssignment_0_0_2 ) )
            // InternalShowdownGrammar.g:783:2: ( rule__Pokemon__SpecieAssignment_0_0_2 )
            {
             before(grammarAccess.getPokemonAccess().getSpecieAssignment_0_0_2()); 
            // InternalShowdownGrammar.g:784:2: ( rule__Pokemon__SpecieAssignment_0_0_2 )
            // InternalShowdownGrammar.g:784:3: rule__Pokemon__SpecieAssignment_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__SpecieAssignment_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPokemonAccess().getSpecieAssignment_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_0_0__2__Impl"


    // $ANTLR start "rule__Pokemon__Group_0_0__3"
    // InternalShowdownGrammar.g:792:1: rule__Pokemon__Group_0_0__3 : rule__Pokemon__Group_0_0__3__Impl ;
    public final void rule__Pokemon__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:796:1: ( rule__Pokemon__Group_0_0__3__Impl )
            // InternalShowdownGrammar.g:797:2: rule__Pokemon__Group_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_0_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_0_0__3"


    // $ANTLR start "rule__Pokemon__Group_0_0__3__Impl"
    // InternalShowdownGrammar.g:803:1: rule__Pokemon__Group_0_0__3__Impl : ( ')' ) ;
    public final void rule__Pokemon__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:807:1: ( ( ')' ) )
            // InternalShowdownGrammar.g:808:1: ( ')' )
            {
            // InternalShowdownGrammar.g:808:1: ( ')' )
            // InternalShowdownGrammar.g:809:2: ')'
            {
             before(grammarAccess.getPokemonAccess().getRightParenthesisKeyword_0_0_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getRightParenthesisKeyword_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_0_0__3__Impl"


    // $ANTLR start "rule__Pokemon__Group_6__0"
    // InternalShowdownGrammar.g:819:1: rule__Pokemon__Group_6__0 : rule__Pokemon__Group_6__0__Impl rule__Pokemon__Group_6__1 ;
    public final void rule__Pokemon__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:823:1: ( rule__Pokemon__Group_6__0__Impl rule__Pokemon__Group_6__1 )
            // InternalShowdownGrammar.g:824:2: rule__Pokemon__Group_6__0__Impl rule__Pokemon__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__Pokemon__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_6__0"


    // $ANTLR start "rule__Pokemon__Group_6__0__Impl"
    // InternalShowdownGrammar.g:831:1: rule__Pokemon__Group_6__0__Impl : ( 'Level' ) ;
    public final void rule__Pokemon__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:835:1: ( ( 'Level' ) )
            // InternalShowdownGrammar.g:836:1: ( 'Level' )
            {
            // InternalShowdownGrammar.g:836:1: ( 'Level' )
            // InternalShowdownGrammar.g:837:2: 'Level'
            {
             before(grammarAccess.getPokemonAccess().getLevelKeyword_6_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getLevelKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_6__0__Impl"


    // $ANTLR start "rule__Pokemon__Group_6__1"
    // InternalShowdownGrammar.g:846:1: rule__Pokemon__Group_6__1 : rule__Pokemon__Group_6__1__Impl rule__Pokemon__Group_6__2 ;
    public final void rule__Pokemon__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:850:1: ( rule__Pokemon__Group_6__1__Impl rule__Pokemon__Group_6__2 )
            // InternalShowdownGrammar.g:851:2: rule__Pokemon__Group_6__1__Impl rule__Pokemon__Group_6__2
            {
            pushFollow(FOLLOW_13);
            rule__Pokemon__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_6__1"


    // $ANTLR start "rule__Pokemon__Group_6__1__Impl"
    // InternalShowdownGrammar.g:858:1: rule__Pokemon__Group_6__1__Impl : ( ':' ) ;
    public final void rule__Pokemon__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:862:1: ( ( ':' ) )
            // InternalShowdownGrammar.g:863:1: ( ':' )
            {
            // InternalShowdownGrammar.g:863:1: ( ':' )
            // InternalShowdownGrammar.g:864:2: ':'
            {
             before(grammarAccess.getPokemonAccess().getColonKeyword_6_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getColonKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_6__1__Impl"


    // $ANTLR start "rule__Pokemon__Group_6__2"
    // InternalShowdownGrammar.g:873:1: rule__Pokemon__Group_6__2 : rule__Pokemon__Group_6__2__Impl ;
    public final void rule__Pokemon__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:877:1: ( rule__Pokemon__Group_6__2__Impl )
            // InternalShowdownGrammar.g:878:2: rule__Pokemon__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_6__2"


    // $ANTLR start "rule__Pokemon__Group_6__2__Impl"
    // InternalShowdownGrammar.g:884:1: rule__Pokemon__Group_6__2__Impl : ( ( rule__Pokemon__LevelAssignment_6_2 ) ) ;
    public final void rule__Pokemon__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:888:1: ( ( ( rule__Pokemon__LevelAssignment_6_2 ) ) )
            // InternalShowdownGrammar.g:889:1: ( ( rule__Pokemon__LevelAssignment_6_2 ) )
            {
            // InternalShowdownGrammar.g:889:1: ( ( rule__Pokemon__LevelAssignment_6_2 ) )
            // InternalShowdownGrammar.g:890:2: ( rule__Pokemon__LevelAssignment_6_2 )
            {
             before(grammarAccess.getPokemonAccess().getLevelAssignment_6_2()); 
            // InternalShowdownGrammar.g:891:2: ( rule__Pokemon__LevelAssignment_6_2 )
            // InternalShowdownGrammar.g:891:3: rule__Pokemon__LevelAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__LevelAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getPokemonAccess().getLevelAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_6__2__Impl"


    // $ANTLR start "rule__Pokemon__Group_7__0"
    // InternalShowdownGrammar.g:900:1: rule__Pokemon__Group_7__0 : rule__Pokemon__Group_7__0__Impl rule__Pokemon__Group_7__1 ;
    public final void rule__Pokemon__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:904:1: ( rule__Pokemon__Group_7__0__Impl rule__Pokemon__Group_7__1 )
            // InternalShowdownGrammar.g:905:2: rule__Pokemon__Group_7__0__Impl rule__Pokemon__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__Pokemon__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_7__0"


    // $ANTLR start "rule__Pokemon__Group_7__0__Impl"
    // InternalShowdownGrammar.g:912:1: rule__Pokemon__Group_7__0__Impl : ( 'Shiny' ) ;
    public final void rule__Pokemon__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:916:1: ( ( 'Shiny' ) )
            // InternalShowdownGrammar.g:917:1: ( 'Shiny' )
            {
            // InternalShowdownGrammar.g:917:1: ( 'Shiny' )
            // InternalShowdownGrammar.g:918:2: 'Shiny'
            {
             before(grammarAccess.getPokemonAccess().getShinyKeyword_7_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getShinyKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_7__0__Impl"


    // $ANTLR start "rule__Pokemon__Group_7__1"
    // InternalShowdownGrammar.g:927:1: rule__Pokemon__Group_7__1 : rule__Pokemon__Group_7__1__Impl rule__Pokemon__Group_7__2 ;
    public final void rule__Pokemon__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:931:1: ( rule__Pokemon__Group_7__1__Impl rule__Pokemon__Group_7__2 )
            // InternalShowdownGrammar.g:932:2: rule__Pokemon__Group_7__1__Impl rule__Pokemon__Group_7__2
            {
            pushFollow(FOLLOW_14);
            rule__Pokemon__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_7__1"


    // $ANTLR start "rule__Pokemon__Group_7__1__Impl"
    // InternalShowdownGrammar.g:939:1: rule__Pokemon__Group_7__1__Impl : ( ':' ) ;
    public final void rule__Pokemon__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:943:1: ( ( ':' ) )
            // InternalShowdownGrammar.g:944:1: ( ':' )
            {
            // InternalShowdownGrammar.g:944:1: ( ':' )
            // InternalShowdownGrammar.g:945:2: ':'
            {
             before(grammarAccess.getPokemonAccess().getColonKeyword_7_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getColonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_7__1__Impl"


    // $ANTLR start "rule__Pokemon__Group_7__2"
    // InternalShowdownGrammar.g:954:1: rule__Pokemon__Group_7__2 : rule__Pokemon__Group_7__2__Impl ;
    public final void rule__Pokemon__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:958:1: ( rule__Pokemon__Group_7__2__Impl )
            // InternalShowdownGrammar.g:959:2: rule__Pokemon__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_7__2"


    // $ANTLR start "rule__Pokemon__Group_7__2__Impl"
    // InternalShowdownGrammar.g:965:1: rule__Pokemon__Group_7__2__Impl : ( ( rule__Pokemon__ShinyAssignment_7_2 ) ) ;
    public final void rule__Pokemon__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:969:1: ( ( ( rule__Pokemon__ShinyAssignment_7_2 ) ) )
            // InternalShowdownGrammar.g:970:1: ( ( rule__Pokemon__ShinyAssignment_7_2 ) )
            {
            // InternalShowdownGrammar.g:970:1: ( ( rule__Pokemon__ShinyAssignment_7_2 ) )
            // InternalShowdownGrammar.g:971:2: ( rule__Pokemon__ShinyAssignment_7_2 )
            {
             before(grammarAccess.getPokemonAccess().getShinyAssignment_7_2()); 
            // InternalShowdownGrammar.g:972:2: ( rule__Pokemon__ShinyAssignment_7_2 )
            // InternalShowdownGrammar.g:972:3: rule__Pokemon__ShinyAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__ShinyAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getPokemonAccess().getShinyAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_7__2__Impl"


    // $ANTLR start "rule__Pokemon__Group_8__0"
    // InternalShowdownGrammar.g:981:1: rule__Pokemon__Group_8__0 : rule__Pokemon__Group_8__0__Impl rule__Pokemon__Group_8__1 ;
    public final void rule__Pokemon__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:985:1: ( rule__Pokemon__Group_8__0__Impl rule__Pokemon__Group_8__1 )
            // InternalShowdownGrammar.g:986:2: rule__Pokemon__Group_8__0__Impl rule__Pokemon__Group_8__1
            {
            pushFollow(FOLLOW_8);
            rule__Pokemon__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_8__0"


    // $ANTLR start "rule__Pokemon__Group_8__0__Impl"
    // InternalShowdownGrammar.g:993:1: rule__Pokemon__Group_8__0__Impl : ( 'Happiness' ) ;
    public final void rule__Pokemon__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:997:1: ( ( 'Happiness' ) )
            // InternalShowdownGrammar.g:998:1: ( 'Happiness' )
            {
            // InternalShowdownGrammar.g:998:1: ( 'Happiness' )
            // InternalShowdownGrammar.g:999:2: 'Happiness'
            {
             before(grammarAccess.getPokemonAccess().getHappinessKeyword_8_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getHappinessKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_8__0__Impl"


    // $ANTLR start "rule__Pokemon__Group_8__1"
    // InternalShowdownGrammar.g:1008:1: rule__Pokemon__Group_8__1 : rule__Pokemon__Group_8__1__Impl rule__Pokemon__Group_8__2 ;
    public final void rule__Pokemon__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1012:1: ( rule__Pokemon__Group_8__1__Impl rule__Pokemon__Group_8__2 )
            // InternalShowdownGrammar.g:1013:2: rule__Pokemon__Group_8__1__Impl rule__Pokemon__Group_8__2
            {
            pushFollow(FOLLOW_13);
            rule__Pokemon__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_8__1"


    // $ANTLR start "rule__Pokemon__Group_8__1__Impl"
    // InternalShowdownGrammar.g:1020:1: rule__Pokemon__Group_8__1__Impl : ( ':' ) ;
    public final void rule__Pokemon__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1024:1: ( ( ':' ) )
            // InternalShowdownGrammar.g:1025:1: ( ':' )
            {
            // InternalShowdownGrammar.g:1025:1: ( ':' )
            // InternalShowdownGrammar.g:1026:2: ':'
            {
             before(grammarAccess.getPokemonAccess().getColonKeyword_8_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getColonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_8__1__Impl"


    // $ANTLR start "rule__Pokemon__Group_8__2"
    // InternalShowdownGrammar.g:1035:1: rule__Pokemon__Group_8__2 : rule__Pokemon__Group_8__2__Impl ;
    public final void rule__Pokemon__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1039:1: ( rule__Pokemon__Group_8__2__Impl )
            // InternalShowdownGrammar.g:1040:2: rule__Pokemon__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_8__2"


    // $ANTLR start "rule__Pokemon__Group_8__2__Impl"
    // InternalShowdownGrammar.g:1046:1: rule__Pokemon__Group_8__2__Impl : ( ( rule__Pokemon__HappinessAssignment_8_2 ) ) ;
    public final void rule__Pokemon__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1050:1: ( ( ( rule__Pokemon__HappinessAssignment_8_2 ) ) )
            // InternalShowdownGrammar.g:1051:1: ( ( rule__Pokemon__HappinessAssignment_8_2 ) )
            {
            // InternalShowdownGrammar.g:1051:1: ( ( rule__Pokemon__HappinessAssignment_8_2 ) )
            // InternalShowdownGrammar.g:1052:2: ( rule__Pokemon__HappinessAssignment_8_2 )
            {
             before(grammarAccess.getPokemonAccess().getHappinessAssignment_8_2()); 
            // InternalShowdownGrammar.g:1053:2: ( rule__Pokemon__HappinessAssignment_8_2 )
            // InternalShowdownGrammar.g:1053:3: rule__Pokemon__HappinessAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__HappinessAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getPokemonAccess().getHappinessAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_8__2__Impl"


    // $ANTLR start "rule__Pokemon__Group_9__0"
    // InternalShowdownGrammar.g:1062:1: rule__Pokemon__Group_9__0 : rule__Pokemon__Group_9__0__Impl rule__Pokemon__Group_9__1 ;
    public final void rule__Pokemon__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1066:1: ( rule__Pokemon__Group_9__0__Impl rule__Pokemon__Group_9__1 )
            // InternalShowdownGrammar.g:1067:2: rule__Pokemon__Group_9__0__Impl rule__Pokemon__Group_9__1
            {
            pushFollow(FOLLOW_8);
            rule__Pokemon__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_9__0"


    // $ANTLR start "rule__Pokemon__Group_9__0__Impl"
    // InternalShowdownGrammar.g:1074:1: rule__Pokemon__Group_9__0__Impl : ( 'EVs' ) ;
    public final void rule__Pokemon__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1078:1: ( ( 'EVs' ) )
            // InternalShowdownGrammar.g:1079:1: ( 'EVs' )
            {
            // InternalShowdownGrammar.g:1079:1: ( 'EVs' )
            // InternalShowdownGrammar.g:1080:2: 'EVs'
            {
             before(grammarAccess.getPokemonAccess().getEVsKeyword_9_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getEVsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_9__0__Impl"


    // $ANTLR start "rule__Pokemon__Group_9__1"
    // InternalShowdownGrammar.g:1089:1: rule__Pokemon__Group_9__1 : rule__Pokemon__Group_9__1__Impl rule__Pokemon__Group_9__2 ;
    public final void rule__Pokemon__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1093:1: ( rule__Pokemon__Group_9__1__Impl rule__Pokemon__Group_9__2 )
            // InternalShowdownGrammar.g:1094:2: rule__Pokemon__Group_9__1__Impl rule__Pokemon__Group_9__2
            {
            pushFollow(FOLLOW_13);
            rule__Pokemon__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_9__1"


    // $ANTLR start "rule__Pokemon__Group_9__1__Impl"
    // InternalShowdownGrammar.g:1101:1: rule__Pokemon__Group_9__1__Impl : ( ':' ) ;
    public final void rule__Pokemon__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1105:1: ( ( ':' ) )
            // InternalShowdownGrammar.g:1106:1: ( ':' )
            {
            // InternalShowdownGrammar.g:1106:1: ( ':' )
            // InternalShowdownGrammar.g:1107:2: ':'
            {
             before(grammarAccess.getPokemonAccess().getColonKeyword_9_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getColonKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_9__1__Impl"


    // $ANTLR start "rule__Pokemon__Group_9__2"
    // InternalShowdownGrammar.g:1116:1: rule__Pokemon__Group_9__2 : rule__Pokemon__Group_9__2__Impl ;
    public final void rule__Pokemon__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1120:1: ( rule__Pokemon__Group_9__2__Impl )
            // InternalShowdownGrammar.g:1121:2: rule__Pokemon__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_9__2"


    // $ANTLR start "rule__Pokemon__Group_9__2__Impl"
    // InternalShowdownGrammar.g:1127:1: rule__Pokemon__Group_9__2__Impl : ( ( rule__Pokemon__Group_9_2__0 )* ) ;
    public final void rule__Pokemon__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1131:1: ( ( ( rule__Pokemon__Group_9_2__0 )* ) )
            // InternalShowdownGrammar.g:1132:1: ( ( rule__Pokemon__Group_9_2__0 )* )
            {
            // InternalShowdownGrammar.g:1132:1: ( ( rule__Pokemon__Group_9_2__0 )* )
            // InternalShowdownGrammar.g:1133:2: ( rule__Pokemon__Group_9_2__0 )*
            {
             before(grammarAccess.getPokemonAccess().getGroup_9_2()); 
            // InternalShowdownGrammar.g:1134:2: ( rule__Pokemon__Group_9_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_INT) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalShowdownGrammar.g:1134:3: rule__Pokemon__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Pokemon__Group_9_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPokemonAccess().getGroup_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_9__2__Impl"


    // $ANTLR start "rule__Pokemon__Group_9_2__0"
    // InternalShowdownGrammar.g:1143:1: rule__Pokemon__Group_9_2__0 : rule__Pokemon__Group_9_2__0__Impl rule__Pokemon__Group_9_2__1 ;
    public final void rule__Pokemon__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1147:1: ( rule__Pokemon__Group_9_2__0__Impl rule__Pokemon__Group_9_2__1 )
            // InternalShowdownGrammar.g:1148:2: rule__Pokemon__Group_9_2__0__Impl rule__Pokemon__Group_9_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Pokemon__Group_9_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_9_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_9_2__0"


    // $ANTLR start "rule__Pokemon__Group_9_2__0__Impl"
    // InternalShowdownGrammar.g:1155:1: rule__Pokemon__Group_9_2__0__Impl : ( ( rule__Pokemon__EvsAssignment_9_2_0 ) ) ;
    public final void rule__Pokemon__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1159:1: ( ( ( rule__Pokemon__EvsAssignment_9_2_0 ) ) )
            // InternalShowdownGrammar.g:1160:1: ( ( rule__Pokemon__EvsAssignment_9_2_0 ) )
            {
            // InternalShowdownGrammar.g:1160:1: ( ( rule__Pokemon__EvsAssignment_9_2_0 ) )
            // InternalShowdownGrammar.g:1161:2: ( rule__Pokemon__EvsAssignment_9_2_0 )
            {
             before(grammarAccess.getPokemonAccess().getEvsAssignment_9_2_0()); 
            // InternalShowdownGrammar.g:1162:2: ( rule__Pokemon__EvsAssignment_9_2_0 )
            // InternalShowdownGrammar.g:1162:3: rule__Pokemon__EvsAssignment_9_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__EvsAssignment_9_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPokemonAccess().getEvsAssignment_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_9_2__0__Impl"


    // $ANTLR start "rule__Pokemon__Group_9_2__1"
    // InternalShowdownGrammar.g:1170:1: rule__Pokemon__Group_9_2__1 : rule__Pokemon__Group_9_2__1__Impl ;
    public final void rule__Pokemon__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1174:1: ( rule__Pokemon__Group_9_2__1__Impl )
            // InternalShowdownGrammar.g:1175:2: rule__Pokemon__Group_9_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_9_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_9_2__1"


    // $ANTLR start "rule__Pokemon__Group_9_2__1__Impl"
    // InternalShowdownGrammar.g:1181:1: rule__Pokemon__Group_9_2__1__Impl : ( ( '/' )? ) ;
    public final void rule__Pokemon__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1185:1: ( ( ( '/' )? ) )
            // InternalShowdownGrammar.g:1186:1: ( ( '/' )? )
            {
            // InternalShowdownGrammar.g:1186:1: ( ( '/' )? )
            // InternalShowdownGrammar.g:1187:2: ( '/' )?
            {
             before(grammarAccess.getPokemonAccess().getSolidusKeyword_9_2_1()); 
            // InternalShowdownGrammar.g:1188:2: ( '/' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalShowdownGrammar.g:1188:3: '/'
                    {
                    match(input,28,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPokemonAccess().getSolidusKeyword_9_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_9_2__1__Impl"


    // $ANTLR start "rule__Pokemon__Group_10__0"
    // InternalShowdownGrammar.g:1197:1: rule__Pokemon__Group_10__0 : rule__Pokemon__Group_10__0__Impl rule__Pokemon__Group_10__1 ;
    public final void rule__Pokemon__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1201:1: ( rule__Pokemon__Group_10__0__Impl rule__Pokemon__Group_10__1 )
            // InternalShowdownGrammar.g:1202:2: rule__Pokemon__Group_10__0__Impl rule__Pokemon__Group_10__1
            {
            pushFollow(FOLLOW_17);
            rule__Pokemon__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_10__0"


    // $ANTLR start "rule__Pokemon__Group_10__0__Impl"
    // InternalShowdownGrammar.g:1209:1: rule__Pokemon__Group_10__0__Impl : ( ( rule__Pokemon__NatureAssignment_10_0 ) ) ;
    public final void rule__Pokemon__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1213:1: ( ( ( rule__Pokemon__NatureAssignment_10_0 ) ) )
            // InternalShowdownGrammar.g:1214:1: ( ( rule__Pokemon__NatureAssignment_10_0 ) )
            {
            // InternalShowdownGrammar.g:1214:1: ( ( rule__Pokemon__NatureAssignment_10_0 ) )
            // InternalShowdownGrammar.g:1215:2: ( rule__Pokemon__NatureAssignment_10_0 )
            {
             before(grammarAccess.getPokemonAccess().getNatureAssignment_10_0()); 
            // InternalShowdownGrammar.g:1216:2: ( rule__Pokemon__NatureAssignment_10_0 )
            // InternalShowdownGrammar.g:1216:3: rule__Pokemon__NatureAssignment_10_0
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__NatureAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getPokemonAccess().getNatureAssignment_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_10__0__Impl"


    // $ANTLR start "rule__Pokemon__Group_10__1"
    // InternalShowdownGrammar.g:1224:1: rule__Pokemon__Group_10__1 : rule__Pokemon__Group_10__1__Impl ;
    public final void rule__Pokemon__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1228:1: ( rule__Pokemon__Group_10__1__Impl )
            // InternalShowdownGrammar.g:1229:2: rule__Pokemon__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_10__1"


    // $ANTLR start "rule__Pokemon__Group_10__1__Impl"
    // InternalShowdownGrammar.g:1235:1: rule__Pokemon__Group_10__1__Impl : ( 'Nature' ) ;
    public final void rule__Pokemon__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1239:1: ( ( 'Nature' ) )
            // InternalShowdownGrammar.g:1240:1: ( 'Nature' )
            {
            // InternalShowdownGrammar.g:1240:1: ( 'Nature' )
            // InternalShowdownGrammar.g:1241:2: 'Nature'
            {
             before(grammarAccess.getPokemonAccess().getNatureKeyword_10_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getNatureKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_10__1__Impl"


    // $ANTLR start "rule__Pokemon__Group_11__0"
    // InternalShowdownGrammar.g:1251:1: rule__Pokemon__Group_11__0 : rule__Pokemon__Group_11__0__Impl rule__Pokemon__Group_11__1 ;
    public final void rule__Pokemon__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1255:1: ( rule__Pokemon__Group_11__0__Impl rule__Pokemon__Group_11__1 )
            // InternalShowdownGrammar.g:1256:2: rule__Pokemon__Group_11__0__Impl rule__Pokemon__Group_11__1
            {
            pushFollow(FOLLOW_8);
            rule__Pokemon__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_11__0"


    // $ANTLR start "rule__Pokemon__Group_11__0__Impl"
    // InternalShowdownGrammar.g:1263:1: rule__Pokemon__Group_11__0__Impl : ( 'IVs' ) ;
    public final void rule__Pokemon__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1267:1: ( ( 'IVs' ) )
            // InternalShowdownGrammar.g:1268:1: ( 'IVs' )
            {
            // InternalShowdownGrammar.g:1268:1: ( 'IVs' )
            // InternalShowdownGrammar.g:1269:2: 'IVs'
            {
             before(grammarAccess.getPokemonAccess().getIVsKeyword_11_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getIVsKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_11__0__Impl"


    // $ANTLR start "rule__Pokemon__Group_11__1"
    // InternalShowdownGrammar.g:1278:1: rule__Pokemon__Group_11__1 : rule__Pokemon__Group_11__1__Impl rule__Pokemon__Group_11__2 ;
    public final void rule__Pokemon__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1282:1: ( rule__Pokemon__Group_11__1__Impl rule__Pokemon__Group_11__2 )
            // InternalShowdownGrammar.g:1283:2: rule__Pokemon__Group_11__1__Impl rule__Pokemon__Group_11__2
            {
            pushFollow(FOLLOW_13);
            rule__Pokemon__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_11__1"


    // $ANTLR start "rule__Pokemon__Group_11__1__Impl"
    // InternalShowdownGrammar.g:1290:1: rule__Pokemon__Group_11__1__Impl : ( ':' ) ;
    public final void rule__Pokemon__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1294:1: ( ( ':' ) )
            // InternalShowdownGrammar.g:1295:1: ( ':' )
            {
            // InternalShowdownGrammar.g:1295:1: ( ':' )
            // InternalShowdownGrammar.g:1296:2: ':'
            {
             before(grammarAccess.getPokemonAccess().getColonKeyword_11_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getColonKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_11__1__Impl"


    // $ANTLR start "rule__Pokemon__Group_11__2"
    // InternalShowdownGrammar.g:1305:1: rule__Pokemon__Group_11__2 : rule__Pokemon__Group_11__2__Impl ;
    public final void rule__Pokemon__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1309:1: ( rule__Pokemon__Group_11__2__Impl )
            // InternalShowdownGrammar.g:1310:2: rule__Pokemon__Group_11__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_11__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_11__2"


    // $ANTLR start "rule__Pokemon__Group_11__2__Impl"
    // InternalShowdownGrammar.g:1316:1: rule__Pokemon__Group_11__2__Impl : ( ( rule__Pokemon__Group_11_2__0 )* ) ;
    public final void rule__Pokemon__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1320:1: ( ( ( rule__Pokemon__Group_11_2__0 )* ) )
            // InternalShowdownGrammar.g:1321:1: ( ( rule__Pokemon__Group_11_2__0 )* )
            {
            // InternalShowdownGrammar.g:1321:1: ( ( rule__Pokemon__Group_11_2__0 )* )
            // InternalShowdownGrammar.g:1322:2: ( rule__Pokemon__Group_11_2__0 )*
            {
             before(grammarAccess.getPokemonAccess().getGroup_11_2()); 
            // InternalShowdownGrammar.g:1323:2: ( rule__Pokemon__Group_11_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_INT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalShowdownGrammar.g:1323:3: rule__Pokemon__Group_11_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Pokemon__Group_11_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPokemonAccess().getGroup_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_11__2__Impl"


    // $ANTLR start "rule__Pokemon__Group_11_2__0"
    // InternalShowdownGrammar.g:1332:1: rule__Pokemon__Group_11_2__0 : rule__Pokemon__Group_11_2__0__Impl rule__Pokemon__Group_11_2__1 ;
    public final void rule__Pokemon__Group_11_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1336:1: ( rule__Pokemon__Group_11_2__0__Impl rule__Pokemon__Group_11_2__1 )
            // InternalShowdownGrammar.g:1337:2: rule__Pokemon__Group_11_2__0__Impl rule__Pokemon__Group_11_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Pokemon__Group_11_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_11_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_11_2__0"


    // $ANTLR start "rule__Pokemon__Group_11_2__0__Impl"
    // InternalShowdownGrammar.g:1344:1: rule__Pokemon__Group_11_2__0__Impl : ( ( rule__Pokemon__IvsAssignment_11_2_0 ) ) ;
    public final void rule__Pokemon__Group_11_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1348:1: ( ( ( rule__Pokemon__IvsAssignment_11_2_0 ) ) )
            // InternalShowdownGrammar.g:1349:1: ( ( rule__Pokemon__IvsAssignment_11_2_0 ) )
            {
            // InternalShowdownGrammar.g:1349:1: ( ( rule__Pokemon__IvsAssignment_11_2_0 ) )
            // InternalShowdownGrammar.g:1350:2: ( rule__Pokemon__IvsAssignment_11_2_0 )
            {
             before(grammarAccess.getPokemonAccess().getIvsAssignment_11_2_0()); 
            // InternalShowdownGrammar.g:1351:2: ( rule__Pokemon__IvsAssignment_11_2_0 )
            // InternalShowdownGrammar.g:1351:3: rule__Pokemon__IvsAssignment_11_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__IvsAssignment_11_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPokemonAccess().getIvsAssignment_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_11_2__0__Impl"


    // $ANTLR start "rule__Pokemon__Group_11_2__1"
    // InternalShowdownGrammar.g:1359:1: rule__Pokemon__Group_11_2__1 : rule__Pokemon__Group_11_2__1__Impl ;
    public final void rule__Pokemon__Group_11_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1363:1: ( rule__Pokemon__Group_11_2__1__Impl )
            // InternalShowdownGrammar.g:1364:2: rule__Pokemon__Group_11_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_11_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_11_2__1"


    // $ANTLR start "rule__Pokemon__Group_11_2__1__Impl"
    // InternalShowdownGrammar.g:1370:1: rule__Pokemon__Group_11_2__1__Impl : ( ( '/' )? ) ;
    public final void rule__Pokemon__Group_11_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1374:1: ( ( ( '/' )? ) )
            // InternalShowdownGrammar.g:1375:1: ( ( '/' )? )
            {
            // InternalShowdownGrammar.g:1375:1: ( ( '/' )? )
            // InternalShowdownGrammar.g:1376:2: ( '/' )?
            {
             before(grammarAccess.getPokemonAccess().getSolidusKeyword_11_2_1()); 
            // InternalShowdownGrammar.g:1377:2: ( '/' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalShowdownGrammar.g:1377:3: '/'
                    {
                    match(input,28,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPokemonAccess().getSolidusKeyword_11_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_11_2__1__Impl"


    // $ANTLR start "rule__Pokemon__Group_12__0"
    // InternalShowdownGrammar.g:1386:1: rule__Pokemon__Group_12__0 : rule__Pokemon__Group_12__0__Impl rule__Pokemon__Group_12__1 ;
    public final void rule__Pokemon__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1390:1: ( rule__Pokemon__Group_12__0__Impl rule__Pokemon__Group_12__1 )
            // InternalShowdownGrammar.g:1391:2: rule__Pokemon__Group_12__0__Impl rule__Pokemon__Group_12__1
            {
            pushFollow(FOLLOW_18);
            rule__Pokemon__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_12__0"


    // $ANTLR start "rule__Pokemon__Group_12__0__Impl"
    // InternalShowdownGrammar.g:1398:1: rule__Pokemon__Group_12__0__Impl : ( '-' ) ;
    public final void rule__Pokemon__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1402:1: ( ( '-' ) )
            // InternalShowdownGrammar.g:1403:1: ( '-' )
            {
            // InternalShowdownGrammar.g:1403:1: ( '-' )
            // InternalShowdownGrammar.g:1404:2: '-'
            {
             before(grammarAccess.getPokemonAccess().getHyphenMinusKeyword_12_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getHyphenMinusKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_12__0__Impl"


    // $ANTLR start "rule__Pokemon__Group_12__1"
    // InternalShowdownGrammar.g:1413:1: rule__Pokemon__Group_12__1 : rule__Pokemon__Group_12__1__Impl ;
    public final void rule__Pokemon__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1417:1: ( rule__Pokemon__Group_12__1__Impl )
            // InternalShowdownGrammar.g:1418:2: rule__Pokemon__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_12__1"


    // $ANTLR start "rule__Pokemon__Group_12__1__Impl"
    // InternalShowdownGrammar.g:1424:1: rule__Pokemon__Group_12__1__Impl : ( ( rule__Pokemon__MovesAssignment_12_1 ) ) ;
    public final void rule__Pokemon__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1428:1: ( ( ( rule__Pokemon__MovesAssignment_12_1 ) ) )
            // InternalShowdownGrammar.g:1429:1: ( ( rule__Pokemon__MovesAssignment_12_1 ) )
            {
            // InternalShowdownGrammar.g:1429:1: ( ( rule__Pokemon__MovesAssignment_12_1 ) )
            // InternalShowdownGrammar.g:1430:2: ( rule__Pokemon__MovesAssignment_12_1 )
            {
             before(grammarAccess.getPokemonAccess().getMovesAssignment_12_1()); 
            // InternalShowdownGrammar.g:1431:2: ( rule__Pokemon__MovesAssignment_12_1 )
            // InternalShowdownGrammar.g:1431:3: rule__Pokemon__MovesAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Pokemon__MovesAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getPokemonAccess().getMovesAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__Group_12__1__Impl"


    // $ANTLR start "rule__Stat__Group__0"
    // InternalShowdownGrammar.g:1440:1: rule__Stat__Group__0 : rule__Stat__Group__0__Impl rule__Stat__Group__1 ;
    public final void rule__Stat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1444:1: ( rule__Stat__Group__0__Impl rule__Stat__Group__1 )
            // InternalShowdownGrammar.g:1445:2: rule__Stat__Group__0__Impl rule__Stat__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Stat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stat__Group__0"


    // $ANTLR start "rule__Stat__Group__0__Impl"
    // InternalShowdownGrammar.g:1452:1: rule__Stat__Group__0__Impl : ( ( rule__Stat__ValueAssignment_0 ) ) ;
    public final void rule__Stat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1456:1: ( ( ( rule__Stat__ValueAssignment_0 ) ) )
            // InternalShowdownGrammar.g:1457:1: ( ( rule__Stat__ValueAssignment_0 ) )
            {
            // InternalShowdownGrammar.g:1457:1: ( ( rule__Stat__ValueAssignment_0 ) )
            // InternalShowdownGrammar.g:1458:2: ( rule__Stat__ValueAssignment_0 )
            {
             before(grammarAccess.getStatAccess().getValueAssignment_0()); 
            // InternalShowdownGrammar.g:1459:2: ( rule__Stat__ValueAssignment_0 )
            // InternalShowdownGrammar.g:1459:3: rule__Stat__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Stat__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStatAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stat__Group__0__Impl"


    // $ANTLR start "rule__Stat__Group__1"
    // InternalShowdownGrammar.g:1467:1: rule__Stat__Group__1 : rule__Stat__Group__1__Impl ;
    public final void rule__Stat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1471:1: ( rule__Stat__Group__1__Impl )
            // InternalShowdownGrammar.g:1472:2: rule__Stat__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stat__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stat__Group__1"


    // $ANTLR start "rule__Stat__Group__1__Impl"
    // InternalShowdownGrammar.g:1478:1: rule__Stat__Group__1__Impl : ( ( rule__Stat__Alternatives_1 ) ) ;
    public final void rule__Stat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1482:1: ( ( ( rule__Stat__Alternatives_1 ) ) )
            // InternalShowdownGrammar.g:1483:1: ( ( rule__Stat__Alternatives_1 ) )
            {
            // InternalShowdownGrammar.g:1483:1: ( ( rule__Stat__Alternatives_1 ) )
            // InternalShowdownGrammar.g:1484:2: ( rule__Stat__Alternatives_1 )
            {
             before(grammarAccess.getStatAccess().getAlternatives_1()); 
            // InternalShowdownGrammar.g:1485:2: ( rule__Stat__Alternatives_1 )
            // InternalShowdownGrammar.g:1485:3: rule__Stat__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Stat__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getStatAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stat__Group__1__Impl"


    // $ANTLR start "rule__Team__ElementsAssignment"
    // InternalShowdownGrammar.g:1494:1: rule__Team__ElementsAssignment : ( rulePokemon ) ;
    public final void rule__Team__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1498:1: ( ( rulePokemon ) )
            // InternalShowdownGrammar.g:1499:2: ( rulePokemon )
            {
            // InternalShowdownGrammar.g:1499:2: ( rulePokemon )
            // InternalShowdownGrammar.g:1500:3: rulePokemon
            {
             before(grammarAccess.getTeamAccess().getElementsPokemonParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePokemon();

            state._fsp--;

             after(grammarAccess.getTeamAccess().getElementsPokemonParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__ElementsAssignment"


    // $ANTLR start "rule__Pokemon__NickAssignment_0_0_0"
    // InternalShowdownGrammar.g:1509:1: rule__Pokemon__NickAssignment_0_0_0 : ( ruleNickname ) ;
    public final void rule__Pokemon__NickAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1513:1: ( ( ruleNickname ) )
            // InternalShowdownGrammar.g:1514:2: ( ruleNickname )
            {
            // InternalShowdownGrammar.g:1514:2: ( ruleNickname )
            // InternalShowdownGrammar.g:1515:3: ruleNickname
            {
             before(grammarAccess.getPokemonAccess().getNickNicknameParserRuleCall_0_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNickname();

            state._fsp--;

             after(grammarAccess.getPokemonAccess().getNickNicknameParserRuleCall_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__NickAssignment_0_0_0"


    // $ANTLR start "rule__Pokemon__SpecieAssignment_0_0_2"
    // InternalShowdownGrammar.g:1524:1: rule__Pokemon__SpecieAssignment_0_0_2 : ( ruleSpecie ) ;
    public final void rule__Pokemon__SpecieAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1528:1: ( ( ruleSpecie ) )
            // InternalShowdownGrammar.g:1529:2: ( ruleSpecie )
            {
            // InternalShowdownGrammar.g:1529:2: ( ruleSpecie )
            // InternalShowdownGrammar.g:1530:3: ruleSpecie
            {
             before(grammarAccess.getPokemonAccess().getSpecieSpecieParserRuleCall_0_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecie();

            state._fsp--;

             after(grammarAccess.getPokemonAccess().getSpecieSpecieParserRuleCall_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__SpecieAssignment_0_0_2"


    // $ANTLR start "rule__Pokemon__SpecieAssignment_0_1"
    // InternalShowdownGrammar.g:1539:1: rule__Pokemon__SpecieAssignment_0_1 : ( ruleSpecie ) ;
    public final void rule__Pokemon__SpecieAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1543:1: ( ( ruleSpecie ) )
            // InternalShowdownGrammar.g:1544:2: ( ruleSpecie )
            {
            // InternalShowdownGrammar.g:1544:2: ( ruleSpecie )
            // InternalShowdownGrammar.g:1545:3: ruleSpecie
            {
             before(grammarAccess.getPokemonAccess().getSpecieSpecieParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecie();

            state._fsp--;

             after(grammarAccess.getPokemonAccess().getSpecieSpecieParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__SpecieAssignment_0_1"


    // $ANTLR start "rule__Pokemon__ItemAssignment_2"
    // InternalShowdownGrammar.g:1554:1: rule__Pokemon__ItemAssignment_2 : ( RULE_ID ) ;
    public final void rule__Pokemon__ItemAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1558:1: ( ( RULE_ID ) )
            // InternalShowdownGrammar.g:1559:2: ( RULE_ID )
            {
            // InternalShowdownGrammar.g:1559:2: ( RULE_ID )
            // InternalShowdownGrammar.g:1560:3: RULE_ID
            {
             before(grammarAccess.getPokemonAccess().getItemIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getItemIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__ItemAssignment_2"


    // $ANTLR start "rule__Pokemon__AbilityAssignment_5"
    // InternalShowdownGrammar.g:1569:1: rule__Pokemon__AbilityAssignment_5 : ( ruleAbility ) ;
    public final void rule__Pokemon__AbilityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1573:1: ( ( ruleAbility ) )
            // InternalShowdownGrammar.g:1574:2: ( ruleAbility )
            {
            // InternalShowdownGrammar.g:1574:2: ( ruleAbility )
            // InternalShowdownGrammar.g:1575:3: ruleAbility
            {
             before(grammarAccess.getPokemonAccess().getAbilityAbilityParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAbility();

            state._fsp--;

             after(grammarAccess.getPokemonAccess().getAbilityAbilityParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__AbilityAssignment_5"


    // $ANTLR start "rule__Pokemon__LevelAssignment_6_2"
    // InternalShowdownGrammar.g:1584:1: rule__Pokemon__LevelAssignment_6_2 : ( RULE_INT ) ;
    public final void rule__Pokemon__LevelAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1588:1: ( ( RULE_INT ) )
            // InternalShowdownGrammar.g:1589:2: ( RULE_INT )
            {
            // InternalShowdownGrammar.g:1589:2: ( RULE_INT )
            // InternalShowdownGrammar.g:1590:3: RULE_INT
            {
             before(grammarAccess.getPokemonAccess().getLevelINTTerminalRuleCall_6_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getLevelINTTerminalRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__LevelAssignment_6_2"


    // $ANTLR start "rule__Pokemon__ShinyAssignment_7_2"
    // InternalShowdownGrammar.g:1599:1: rule__Pokemon__ShinyAssignment_7_2 : ( ruleShiny ) ;
    public final void rule__Pokemon__ShinyAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1603:1: ( ( ruleShiny ) )
            // InternalShowdownGrammar.g:1604:2: ( ruleShiny )
            {
            // InternalShowdownGrammar.g:1604:2: ( ruleShiny )
            // InternalShowdownGrammar.g:1605:3: ruleShiny
            {
             before(grammarAccess.getPokemonAccess().getShinyShinyParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleShiny();

            state._fsp--;

             after(grammarAccess.getPokemonAccess().getShinyShinyParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__ShinyAssignment_7_2"


    // $ANTLR start "rule__Pokemon__HappinessAssignment_8_2"
    // InternalShowdownGrammar.g:1614:1: rule__Pokemon__HappinessAssignment_8_2 : ( RULE_INT ) ;
    public final void rule__Pokemon__HappinessAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1618:1: ( ( RULE_INT ) )
            // InternalShowdownGrammar.g:1619:2: ( RULE_INT )
            {
            // InternalShowdownGrammar.g:1619:2: ( RULE_INT )
            // InternalShowdownGrammar.g:1620:3: RULE_INT
            {
             before(grammarAccess.getPokemonAccess().getHappinessINTTerminalRuleCall_8_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getHappinessINTTerminalRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__HappinessAssignment_8_2"


    // $ANTLR start "rule__Pokemon__EvsAssignment_9_2_0"
    // InternalShowdownGrammar.g:1629:1: rule__Pokemon__EvsAssignment_9_2_0 : ( ruleStat ) ;
    public final void rule__Pokemon__EvsAssignment_9_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1633:1: ( ( ruleStat ) )
            // InternalShowdownGrammar.g:1634:2: ( ruleStat )
            {
            // InternalShowdownGrammar.g:1634:2: ( ruleStat )
            // InternalShowdownGrammar.g:1635:3: ruleStat
            {
             before(grammarAccess.getPokemonAccess().getEvsStatParserRuleCall_9_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStat();

            state._fsp--;

             after(grammarAccess.getPokemonAccess().getEvsStatParserRuleCall_9_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__EvsAssignment_9_2_0"


    // $ANTLR start "rule__Pokemon__NatureAssignment_10_0"
    // InternalShowdownGrammar.g:1644:1: rule__Pokemon__NatureAssignment_10_0 : ( RULE_ID ) ;
    public final void rule__Pokemon__NatureAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1648:1: ( ( RULE_ID ) )
            // InternalShowdownGrammar.g:1649:2: ( RULE_ID )
            {
            // InternalShowdownGrammar.g:1649:2: ( RULE_ID )
            // InternalShowdownGrammar.g:1650:3: RULE_ID
            {
             before(grammarAccess.getPokemonAccess().getNatureIDTerminalRuleCall_10_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPokemonAccess().getNatureIDTerminalRuleCall_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__NatureAssignment_10_0"


    // $ANTLR start "rule__Pokemon__IvsAssignment_11_2_0"
    // InternalShowdownGrammar.g:1659:1: rule__Pokemon__IvsAssignment_11_2_0 : ( ruleStat ) ;
    public final void rule__Pokemon__IvsAssignment_11_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1663:1: ( ( ruleStat ) )
            // InternalShowdownGrammar.g:1664:2: ( ruleStat )
            {
            // InternalShowdownGrammar.g:1664:2: ( ruleStat )
            // InternalShowdownGrammar.g:1665:3: ruleStat
            {
             before(grammarAccess.getPokemonAccess().getIvsStatParserRuleCall_11_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStat();

            state._fsp--;

             after(grammarAccess.getPokemonAccess().getIvsStatParserRuleCall_11_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__IvsAssignment_11_2_0"


    // $ANTLR start "rule__Pokemon__MovesAssignment_12_1"
    // InternalShowdownGrammar.g:1674:1: rule__Pokemon__MovesAssignment_12_1 : ( ruleMove ) ;
    public final void rule__Pokemon__MovesAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1678:1: ( ( ruleMove ) )
            // InternalShowdownGrammar.g:1679:2: ( ruleMove )
            {
            // InternalShowdownGrammar.g:1679:2: ( ruleMove )
            // InternalShowdownGrammar.g:1680:3: ruleMove
            {
             before(grammarAccess.getPokemonAccess().getMovesMoveParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getPokemonAccess().getMovesMoveParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pokemon__MovesAssignment_12_1"


    // $ANTLR start "rule__Stat__ValueAssignment_0"
    // InternalShowdownGrammar.g:1689:1: rule__Stat__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__Stat__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1693:1: ( ( RULE_INT ) )
            // InternalShowdownGrammar.g:1694:2: ( RULE_INT )
            {
            // InternalShowdownGrammar.g:1694:2: ( RULE_INT )
            // InternalShowdownGrammar.g:1695:3: RULE_INT
            {
             before(grammarAccess.getStatAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStatAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stat__ValueAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000004F001010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000004F001012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000007E000L});

}