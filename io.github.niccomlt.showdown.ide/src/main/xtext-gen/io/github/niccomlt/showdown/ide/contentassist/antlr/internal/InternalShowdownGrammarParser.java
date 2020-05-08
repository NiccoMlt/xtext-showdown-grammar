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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Yes'", "'HP'", "'Atk'", "'Def'", "'SpA'", "'SpD'", "'Spe'", "'@'", "'Ability'", "':'", "'('", "')'", "'Level'", "'Shiny'", "'Happiness'", "'EVs'", "'/'", "'Nature'", "'IVs'", "'-'"
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
    // InternalShowdownGrammar.g:112:1: ruleMove : ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:116:2: ( ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) )
            // InternalShowdownGrammar.g:117:2: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            {
            // InternalShowdownGrammar.g:117:2: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            // InternalShowdownGrammar.g:118:3: ( ( RULE_ID ) ) ( ( RULE_ID )* )
            {
            // InternalShowdownGrammar.g:118:3: ( ( RULE_ID ) )
            // InternalShowdownGrammar.g:119:4: ( RULE_ID )
            {
             before(grammarAccess.getMoveAccess().getIDTerminalRuleCall()); 
            // InternalShowdownGrammar.g:120:4: ( RULE_ID )
            // InternalShowdownGrammar.g:120:5: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_3); 

            }

             after(grammarAccess.getMoveAccess().getIDTerminalRuleCall()); 

            }

            // InternalShowdownGrammar.g:123:3: ( ( RULE_ID )* )
            // InternalShowdownGrammar.g:124:4: ( RULE_ID )*
            {
             before(grammarAccess.getMoveAccess().getIDTerminalRuleCall()); 
            // InternalShowdownGrammar.g:125:4: ( RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==EOF||LA2_2==RULE_ID||LA2_2==30) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalShowdownGrammar.g:125:5: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_3); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getMoveAccess().getIDTerminalRuleCall()); 

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

                    if ( (LA3_2==EOF||LA3_2==RULE_ID||(LA3_2>=23 && LA3_2<=26)||(LA3_2>=29 && LA3_2<=30)) ) {
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

                if ( (LA4_1==21) ) {
                    alt4=1;
                }
                else if ( (LA4_1==18) ) {
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


    // $ANTLR start "rule__Stat__Alternatives_1"
    // InternalShowdownGrammar.g:287:1: rule__Stat__Alternatives_1 : ( ( 'HP' ) | ( 'Atk' ) | ( 'Def' ) | ( 'SpA' ) | ( 'SpD' ) | ( 'Spe' ) );
    public final void rule__Stat__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:291:1: ( ( 'HP' ) | ( 'Atk' ) | ( 'Def' ) | ( 'SpA' ) | ( 'SpD' ) | ( 'Spe' ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            case 16:
                {
                alt5=5;
                }
                break;
            case 17:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalShowdownGrammar.g:292:2: ( 'HP' )
                    {
                    // InternalShowdownGrammar.g:292:2: ( 'HP' )
                    // InternalShowdownGrammar.g:293:3: 'HP'
                    {
                     before(grammarAccess.getStatAccess().getHPKeyword_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getStatAccess().getHPKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShowdownGrammar.g:298:2: ( 'Atk' )
                    {
                    // InternalShowdownGrammar.g:298:2: ( 'Atk' )
                    // InternalShowdownGrammar.g:299:3: 'Atk'
                    {
                     before(grammarAccess.getStatAccess().getAtkKeyword_1_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getStatAccess().getAtkKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShowdownGrammar.g:304:2: ( 'Def' )
                    {
                    // InternalShowdownGrammar.g:304:2: ( 'Def' )
                    // InternalShowdownGrammar.g:305:3: 'Def'
                    {
                     before(grammarAccess.getStatAccess().getDefKeyword_1_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getStatAccess().getDefKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalShowdownGrammar.g:310:2: ( 'SpA' )
                    {
                    // InternalShowdownGrammar.g:310:2: ( 'SpA' )
                    // InternalShowdownGrammar.g:311:3: 'SpA'
                    {
                     before(grammarAccess.getStatAccess().getSpAKeyword_1_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getStatAccess().getSpAKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalShowdownGrammar.g:316:2: ( 'SpD' )
                    {
                    // InternalShowdownGrammar.g:316:2: ( 'SpD' )
                    // InternalShowdownGrammar.g:317:3: 'SpD'
                    {
                     before(grammarAccess.getStatAccess().getSpDKeyword_1_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getStatAccess().getSpDKeyword_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalShowdownGrammar.g:322:2: ( 'Spe' )
                    {
                    // InternalShowdownGrammar.g:322:2: ( 'Spe' )
                    // InternalShowdownGrammar.g:323:3: 'Spe'
                    {
                     before(grammarAccess.getStatAccess().getSpeKeyword_1_5()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalShowdownGrammar.g:332:1: rule__Pokemon__Group__0 : rule__Pokemon__Group__0__Impl rule__Pokemon__Group__1 ;
    public final void rule__Pokemon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:336:1: ( rule__Pokemon__Group__0__Impl rule__Pokemon__Group__1 )
            // InternalShowdownGrammar.g:337:2: rule__Pokemon__Group__0__Impl rule__Pokemon__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalShowdownGrammar.g:344:1: rule__Pokemon__Group__0__Impl : ( ( rule__Pokemon__Alternatives_0 ) ) ;
    public final void rule__Pokemon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:348:1: ( ( ( rule__Pokemon__Alternatives_0 ) ) )
            // InternalShowdownGrammar.g:349:1: ( ( rule__Pokemon__Alternatives_0 ) )
            {
            // InternalShowdownGrammar.g:349:1: ( ( rule__Pokemon__Alternatives_0 ) )
            // InternalShowdownGrammar.g:350:2: ( rule__Pokemon__Alternatives_0 )
            {
             before(grammarAccess.getPokemonAccess().getAlternatives_0()); 
            // InternalShowdownGrammar.g:351:2: ( rule__Pokemon__Alternatives_0 )
            // InternalShowdownGrammar.g:351:3: rule__Pokemon__Alternatives_0
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
    // InternalShowdownGrammar.g:359:1: rule__Pokemon__Group__1 : rule__Pokemon__Group__1__Impl rule__Pokemon__Group__2 ;
    public final void rule__Pokemon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:363:1: ( rule__Pokemon__Group__1__Impl rule__Pokemon__Group__2 )
            // InternalShowdownGrammar.g:364:2: rule__Pokemon__Group__1__Impl rule__Pokemon__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalShowdownGrammar.g:371:1: rule__Pokemon__Group__1__Impl : ( '@' ) ;
    public final void rule__Pokemon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:375:1: ( ( '@' ) )
            // InternalShowdownGrammar.g:376:1: ( '@' )
            {
            // InternalShowdownGrammar.g:376:1: ( '@' )
            // InternalShowdownGrammar.g:377:2: '@'
            {
             before(grammarAccess.getPokemonAccess().getCommercialAtKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalShowdownGrammar.g:386:1: rule__Pokemon__Group__2 : rule__Pokemon__Group__2__Impl rule__Pokemon__Group__3 ;
    public final void rule__Pokemon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:390:1: ( rule__Pokemon__Group__2__Impl rule__Pokemon__Group__3 )
            // InternalShowdownGrammar.g:391:2: rule__Pokemon__Group__2__Impl rule__Pokemon__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalShowdownGrammar.g:398:1: rule__Pokemon__Group__2__Impl : ( ( rule__Pokemon__ItemAssignment_2 ) ) ;
    public final void rule__Pokemon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:402:1: ( ( ( rule__Pokemon__ItemAssignment_2 ) ) )
            // InternalShowdownGrammar.g:403:1: ( ( rule__Pokemon__ItemAssignment_2 ) )
            {
            // InternalShowdownGrammar.g:403:1: ( ( rule__Pokemon__ItemAssignment_2 ) )
            // InternalShowdownGrammar.g:404:2: ( rule__Pokemon__ItemAssignment_2 )
            {
             before(grammarAccess.getPokemonAccess().getItemAssignment_2()); 
            // InternalShowdownGrammar.g:405:2: ( rule__Pokemon__ItemAssignment_2 )
            // InternalShowdownGrammar.g:405:3: rule__Pokemon__ItemAssignment_2
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
    // InternalShowdownGrammar.g:413:1: rule__Pokemon__Group__3 : rule__Pokemon__Group__3__Impl rule__Pokemon__Group__4 ;
    public final void rule__Pokemon__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:417:1: ( rule__Pokemon__Group__3__Impl rule__Pokemon__Group__4 )
            // InternalShowdownGrammar.g:418:2: rule__Pokemon__Group__3__Impl rule__Pokemon__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalShowdownGrammar.g:425:1: rule__Pokemon__Group__3__Impl : ( 'Ability' ) ;
    public final void rule__Pokemon__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:429:1: ( ( 'Ability' ) )
            // InternalShowdownGrammar.g:430:1: ( 'Ability' )
            {
            // InternalShowdownGrammar.g:430:1: ( 'Ability' )
            // InternalShowdownGrammar.g:431:2: 'Ability'
            {
             before(grammarAccess.getPokemonAccess().getAbilityKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalShowdownGrammar.g:440:1: rule__Pokemon__Group__4 : rule__Pokemon__Group__4__Impl rule__Pokemon__Group__5 ;
    public final void rule__Pokemon__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:444:1: ( rule__Pokemon__Group__4__Impl rule__Pokemon__Group__5 )
            // InternalShowdownGrammar.g:445:2: rule__Pokemon__Group__4__Impl rule__Pokemon__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalShowdownGrammar.g:452:1: rule__Pokemon__Group__4__Impl : ( ':' ) ;
    public final void rule__Pokemon__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:456:1: ( ( ':' ) )
            // InternalShowdownGrammar.g:457:1: ( ':' )
            {
            // InternalShowdownGrammar.g:457:1: ( ':' )
            // InternalShowdownGrammar.g:458:2: ':'
            {
             before(grammarAccess.getPokemonAccess().getColonKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalShowdownGrammar.g:467:1: rule__Pokemon__Group__5 : rule__Pokemon__Group__5__Impl rule__Pokemon__Group__6 ;
    public final void rule__Pokemon__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:471:1: ( rule__Pokemon__Group__5__Impl rule__Pokemon__Group__6 )
            // InternalShowdownGrammar.g:472:2: rule__Pokemon__Group__5__Impl rule__Pokemon__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalShowdownGrammar.g:479:1: rule__Pokemon__Group__5__Impl : ( ( rule__Pokemon__AbilityAssignment_5 ) ) ;
    public final void rule__Pokemon__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:483:1: ( ( ( rule__Pokemon__AbilityAssignment_5 ) ) )
            // InternalShowdownGrammar.g:484:1: ( ( rule__Pokemon__AbilityAssignment_5 ) )
            {
            // InternalShowdownGrammar.g:484:1: ( ( rule__Pokemon__AbilityAssignment_5 ) )
            // InternalShowdownGrammar.g:485:2: ( rule__Pokemon__AbilityAssignment_5 )
            {
             before(grammarAccess.getPokemonAccess().getAbilityAssignment_5()); 
            // InternalShowdownGrammar.g:486:2: ( rule__Pokemon__AbilityAssignment_5 )
            // InternalShowdownGrammar.g:486:3: rule__Pokemon__AbilityAssignment_5
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
    // InternalShowdownGrammar.g:494:1: rule__Pokemon__Group__6 : rule__Pokemon__Group__6__Impl rule__Pokemon__Group__7 ;
    public final void rule__Pokemon__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:498:1: ( rule__Pokemon__Group__6__Impl rule__Pokemon__Group__7 )
            // InternalShowdownGrammar.g:499:2: rule__Pokemon__Group__6__Impl rule__Pokemon__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalShowdownGrammar.g:506:1: rule__Pokemon__Group__6__Impl : ( ( rule__Pokemon__Group_6__0 )? ) ;
    public final void rule__Pokemon__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:510:1: ( ( ( rule__Pokemon__Group_6__0 )? ) )
            // InternalShowdownGrammar.g:511:1: ( ( rule__Pokemon__Group_6__0 )? )
            {
            // InternalShowdownGrammar.g:511:1: ( ( rule__Pokemon__Group_6__0 )? )
            // InternalShowdownGrammar.g:512:2: ( rule__Pokemon__Group_6__0 )?
            {
             before(grammarAccess.getPokemonAccess().getGroup_6()); 
            // InternalShowdownGrammar.g:513:2: ( rule__Pokemon__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalShowdownGrammar.g:513:3: rule__Pokemon__Group_6__0
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
    // InternalShowdownGrammar.g:521:1: rule__Pokemon__Group__7 : rule__Pokemon__Group__7__Impl rule__Pokemon__Group__8 ;
    public final void rule__Pokemon__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:525:1: ( rule__Pokemon__Group__7__Impl rule__Pokemon__Group__8 )
            // InternalShowdownGrammar.g:526:2: rule__Pokemon__Group__7__Impl rule__Pokemon__Group__8
            {
            pushFollow(FOLLOW_8);
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
    // InternalShowdownGrammar.g:533:1: rule__Pokemon__Group__7__Impl : ( ( rule__Pokemon__Group_7__0 )? ) ;
    public final void rule__Pokemon__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:537:1: ( ( ( rule__Pokemon__Group_7__0 )? ) )
            // InternalShowdownGrammar.g:538:1: ( ( rule__Pokemon__Group_7__0 )? )
            {
            // InternalShowdownGrammar.g:538:1: ( ( rule__Pokemon__Group_7__0 )? )
            // InternalShowdownGrammar.g:539:2: ( rule__Pokemon__Group_7__0 )?
            {
             before(grammarAccess.getPokemonAccess().getGroup_7()); 
            // InternalShowdownGrammar.g:540:2: ( rule__Pokemon__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalShowdownGrammar.g:540:3: rule__Pokemon__Group_7__0
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
    // InternalShowdownGrammar.g:548:1: rule__Pokemon__Group__8 : rule__Pokemon__Group__8__Impl rule__Pokemon__Group__9 ;
    public final void rule__Pokemon__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:552:1: ( rule__Pokemon__Group__8__Impl rule__Pokemon__Group__9 )
            // InternalShowdownGrammar.g:553:2: rule__Pokemon__Group__8__Impl rule__Pokemon__Group__9
            {
            pushFollow(FOLLOW_8);
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
    // InternalShowdownGrammar.g:560:1: rule__Pokemon__Group__8__Impl : ( ( rule__Pokemon__Group_8__0 )? ) ;
    public final void rule__Pokemon__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:564:1: ( ( ( rule__Pokemon__Group_8__0 )? ) )
            // InternalShowdownGrammar.g:565:1: ( ( rule__Pokemon__Group_8__0 )? )
            {
            // InternalShowdownGrammar.g:565:1: ( ( rule__Pokemon__Group_8__0 )? )
            // InternalShowdownGrammar.g:566:2: ( rule__Pokemon__Group_8__0 )?
            {
             before(grammarAccess.getPokemonAccess().getGroup_8()); 
            // InternalShowdownGrammar.g:567:2: ( rule__Pokemon__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalShowdownGrammar.g:567:3: rule__Pokemon__Group_8__0
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
    // InternalShowdownGrammar.g:575:1: rule__Pokemon__Group__9 : rule__Pokemon__Group__9__Impl rule__Pokemon__Group__10 ;
    public final void rule__Pokemon__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:579:1: ( rule__Pokemon__Group__9__Impl rule__Pokemon__Group__10 )
            // InternalShowdownGrammar.g:580:2: rule__Pokemon__Group__9__Impl rule__Pokemon__Group__10
            {
            pushFollow(FOLLOW_8);
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
    // InternalShowdownGrammar.g:587:1: rule__Pokemon__Group__9__Impl : ( ( rule__Pokemon__Group_9__0 )? ) ;
    public final void rule__Pokemon__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:591:1: ( ( ( rule__Pokemon__Group_9__0 )? ) )
            // InternalShowdownGrammar.g:592:1: ( ( rule__Pokemon__Group_9__0 )? )
            {
            // InternalShowdownGrammar.g:592:1: ( ( rule__Pokemon__Group_9__0 )? )
            // InternalShowdownGrammar.g:593:2: ( rule__Pokemon__Group_9__0 )?
            {
             before(grammarAccess.getPokemonAccess().getGroup_9()); 
            // InternalShowdownGrammar.g:594:2: ( rule__Pokemon__Group_9__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalShowdownGrammar.g:594:3: rule__Pokemon__Group_9__0
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
    // InternalShowdownGrammar.g:602:1: rule__Pokemon__Group__10 : rule__Pokemon__Group__10__Impl rule__Pokemon__Group__11 ;
    public final void rule__Pokemon__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:606:1: ( rule__Pokemon__Group__10__Impl rule__Pokemon__Group__11 )
            // InternalShowdownGrammar.g:607:2: rule__Pokemon__Group__10__Impl rule__Pokemon__Group__11
            {
            pushFollow(FOLLOW_8);
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
    // InternalShowdownGrammar.g:614:1: rule__Pokemon__Group__10__Impl : ( ( rule__Pokemon__Group_10__0 )? ) ;
    public final void rule__Pokemon__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:618:1: ( ( ( rule__Pokemon__Group_10__0 )? ) )
            // InternalShowdownGrammar.g:619:1: ( ( rule__Pokemon__Group_10__0 )? )
            {
            // InternalShowdownGrammar.g:619:1: ( ( rule__Pokemon__Group_10__0 )? )
            // InternalShowdownGrammar.g:620:2: ( rule__Pokemon__Group_10__0 )?
            {
             before(grammarAccess.getPokemonAccess().getGroup_10()); 
            // InternalShowdownGrammar.g:621:2: ( rule__Pokemon__Group_10__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalShowdownGrammar.g:621:3: rule__Pokemon__Group_10__0
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
    // InternalShowdownGrammar.g:629:1: rule__Pokemon__Group__11 : rule__Pokemon__Group__11__Impl rule__Pokemon__Group__12 ;
    public final void rule__Pokemon__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:633:1: ( rule__Pokemon__Group__11__Impl rule__Pokemon__Group__12 )
            // InternalShowdownGrammar.g:634:2: rule__Pokemon__Group__11__Impl rule__Pokemon__Group__12
            {
            pushFollow(FOLLOW_8);
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
    // InternalShowdownGrammar.g:641:1: rule__Pokemon__Group__11__Impl : ( ( rule__Pokemon__Group_11__0 )? ) ;
    public final void rule__Pokemon__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:645:1: ( ( ( rule__Pokemon__Group_11__0 )? ) )
            // InternalShowdownGrammar.g:646:1: ( ( rule__Pokemon__Group_11__0 )? )
            {
            // InternalShowdownGrammar.g:646:1: ( ( rule__Pokemon__Group_11__0 )? )
            // InternalShowdownGrammar.g:647:2: ( rule__Pokemon__Group_11__0 )?
            {
             before(grammarAccess.getPokemonAccess().getGroup_11()); 
            // InternalShowdownGrammar.g:648:2: ( rule__Pokemon__Group_11__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalShowdownGrammar.g:648:3: rule__Pokemon__Group_11__0
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
    // InternalShowdownGrammar.g:656:1: rule__Pokemon__Group__12 : rule__Pokemon__Group__12__Impl ;
    public final void rule__Pokemon__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:660:1: ( rule__Pokemon__Group__12__Impl )
            // InternalShowdownGrammar.g:661:2: rule__Pokemon__Group__12__Impl
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
    // InternalShowdownGrammar.g:667:1: rule__Pokemon__Group__12__Impl : ( ( ( rule__Pokemon__Group_12__0 ) ) ( ( rule__Pokemon__Group_12__0 )* ) ) ;
    public final void rule__Pokemon__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:671:1: ( ( ( ( rule__Pokemon__Group_12__0 ) ) ( ( rule__Pokemon__Group_12__0 )* ) ) )
            // InternalShowdownGrammar.g:672:1: ( ( ( rule__Pokemon__Group_12__0 ) ) ( ( rule__Pokemon__Group_12__0 )* ) )
            {
            // InternalShowdownGrammar.g:672:1: ( ( ( rule__Pokemon__Group_12__0 ) ) ( ( rule__Pokemon__Group_12__0 )* ) )
            // InternalShowdownGrammar.g:673:2: ( ( rule__Pokemon__Group_12__0 ) ) ( ( rule__Pokemon__Group_12__0 )* )
            {
            // InternalShowdownGrammar.g:673:2: ( ( rule__Pokemon__Group_12__0 ) )
            // InternalShowdownGrammar.g:674:3: ( rule__Pokemon__Group_12__0 )
            {
             before(grammarAccess.getPokemonAccess().getGroup_12()); 
            // InternalShowdownGrammar.g:675:3: ( rule__Pokemon__Group_12__0 )
            // InternalShowdownGrammar.g:675:4: rule__Pokemon__Group_12__0
            {
            pushFollow(FOLLOW_9);
            rule__Pokemon__Group_12__0();

            state._fsp--;


            }

             after(grammarAccess.getPokemonAccess().getGroup_12()); 

            }

            // InternalShowdownGrammar.g:678:2: ( ( rule__Pokemon__Group_12__0 )* )
            // InternalShowdownGrammar.g:679:3: ( rule__Pokemon__Group_12__0 )*
            {
             before(grammarAccess.getPokemonAccess().getGroup_12()); 
            // InternalShowdownGrammar.g:680:3: ( rule__Pokemon__Group_12__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalShowdownGrammar.g:680:4: rule__Pokemon__Group_12__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Pokemon__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalShowdownGrammar.g:690:1: rule__Pokemon__Group_0_0__0 : rule__Pokemon__Group_0_0__0__Impl rule__Pokemon__Group_0_0__1 ;
    public final void rule__Pokemon__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:694:1: ( rule__Pokemon__Group_0_0__0__Impl rule__Pokemon__Group_0_0__1 )
            // InternalShowdownGrammar.g:695:2: rule__Pokemon__Group_0_0__0__Impl rule__Pokemon__Group_0_0__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalShowdownGrammar.g:702:1: rule__Pokemon__Group_0_0__0__Impl : ( ( rule__Pokemon__NickAssignment_0_0_0 ) ) ;
    public final void rule__Pokemon__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:706:1: ( ( ( rule__Pokemon__NickAssignment_0_0_0 ) ) )
            // InternalShowdownGrammar.g:707:1: ( ( rule__Pokemon__NickAssignment_0_0_0 ) )
            {
            // InternalShowdownGrammar.g:707:1: ( ( rule__Pokemon__NickAssignment_0_0_0 ) )
            // InternalShowdownGrammar.g:708:2: ( rule__Pokemon__NickAssignment_0_0_0 )
            {
             before(grammarAccess.getPokemonAccess().getNickAssignment_0_0_0()); 
            // InternalShowdownGrammar.g:709:2: ( rule__Pokemon__NickAssignment_0_0_0 )
            // InternalShowdownGrammar.g:709:3: rule__Pokemon__NickAssignment_0_0_0
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
    // InternalShowdownGrammar.g:717:1: rule__Pokemon__Group_0_0__1 : rule__Pokemon__Group_0_0__1__Impl rule__Pokemon__Group_0_0__2 ;
    public final void rule__Pokemon__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:721:1: ( rule__Pokemon__Group_0_0__1__Impl rule__Pokemon__Group_0_0__2 )
            // InternalShowdownGrammar.g:722:2: rule__Pokemon__Group_0_0__1__Impl rule__Pokemon__Group_0_0__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalShowdownGrammar.g:729:1: rule__Pokemon__Group_0_0__1__Impl : ( '(' ) ;
    public final void rule__Pokemon__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:733:1: ( ( '(' ) )
            // InternalShowdownGrammar.g:734:1: ( '(' )
            {
            // InternalShowdownGrammar.g:734:1: ( '(' )
            // InternalShowdownGrammar.g:735:2: '('
            {
             before(grammarAccess.getPokemonAccess().getLeftParenthesisKeyword_0_0_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalShowdownGrammar.g:744:1: rule__Pokemon__Group_0_0__2 : rule__Pokemon__Group_0_0__2__Impl rule__Pokemon__Group_0_0__3 ;
    public final void rule__Pokemon__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:748:1: ( rule__Pokemon__Group_0_0__2__Impl rule__Pokemon__Group_0_0__3 )
            // InternalShowdownGrammar.g:749:2: rule__Pokemon__Group_0_0__2__Impl rule__Pokemon__Group_0_0__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalShowdownGrammar.g:756:1: rule__Pokemon__Group_0_0__2__Impl : ( ( rule__Pokemon__SpecieAssignment_0_0_2 ) ) ;
    public final void rule__Pokemon__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:760:1: ( ( ( rule__Pokemon__SpecieAssignment_0_0_2 ) ) )
            // InternalShowdownGrammar.g:761:1: ( ( rule__Pokemon__SpecieAssignment_0_0_2 ) )
            {
            // InternalShowdownGrammar.g:761:1: ( ( rule__Pokemon__SpecieAssignment_0_0_2 ) )
            // InternalShowdownGrammar.g:762:2: ( rule__Pokemon__SpecieAssignment_0_0_2 )
            {
             before(grammarAccess.getPokemonAccess().getSpecieAssignment_0_0_2()); 
            // InternalShowdownGrammar.g:763:2: ( rule__Pokemon__SpecieAssignment_0_0_2 )
            // InternalShowdownGrammar.g:763:3: rule__Pokemon__SpecieAssignment_0_0_2
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
    // InternalShowdownGrammar.g:771:1: rule__Pokemon__Group_0_0__3 : rule__Pokemon__Group_0_0__3__Impl ;
    public final void rule__Pokemon__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:775:1: ( rule__Pokemon__Group_0_0__3__Impl )
            // InternalShowdownGrammar.g:776:2: rule__Pokemon__Group_0_0__3__Impl
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
    // InternalShowdownGrammar.g:782:1: rule__Pokemon__Group_0_0__3__Impl : ( ')' ) ;
    public final void rule__Pokemon__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:786:1: ( ( ')' ) )
            // InternalShowdownGrammar.g:787:1: ( ')' )
            {
            // InternalShowdownGrammar.g:787:1: ( ')' )
            // InternalShowdownGrammar.g:788:2: ')'
            {
             before(grammarAccess.getPokemonAccess().getRightParenthesisKeyword_0_0_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalShowdownGrammar.g:798:1: rule__Pokemon__Group_6__0 : rule__Pokemon__Group_6__0__Impl rule__Pokemon__Group_6__1 ;
    public final void rule__Pokemon__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:802:1: ( rule__Pokemon__Group_6__0__Impl rule__Pokemon__Group_6__1 )
            // InternalShowdownGrammar.g:803:2: rule__Pokemon__Group_6__0__Impl rule__Pokemon__Group_6__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalShowdownGrammar.g:810:1: rule__Pokemon__Group_6__0__Impl : ( 'Level' ) ;
    public final void rule__Pokemon__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:814:1: ( ( 'Level' ) )
            // InternalShowdownGrammar.g:815:1: ( 'Level' )
            {
            // InternalShowdownGrammar.g:815:1: ( 'Level' )
            // InternalShowdownGrammar.g:816:2: 'Level'
            {
             before(grammarAccess.getPokemonAccess().getLevelKeyword_6_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalShowdownGrammar.g:825:1: rule__Pokemon__Group_6__1 : rule__Pokemon__Group_6__1__Impl rule__Pokemon__Group_6__2 ;
    public final void rule__Pokemon__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:829:1: ( rule__Pokemon__Group_6__1__Impl rule__Pokemon__Group_6__2 )
            // InternalShowdownGrammar.g:830:2: rule__Pokemon__Group_6__1__Impl rule__Pokemon__Group_6__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalShowdownGrammar.g:837:1: rule__Pokemon__Group_6__1__Impl : ( ':' ) ;
    public final void rule__Pokemon__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:841:1: ( ( ':' ) )
            // InternalShowdownGrammar.g:842:1: ( ':' )
            {
            // InternalShowdownGrammar.g:842:1: ( ':' )
            // InternalShowdownGrammar.g:843:2: ':'
            {
             before(grammarAccess.getPokemonAccess().getColonKeyword_6_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalShowdownGrammar.g:852:1: rule__Pokemon__Group_6__2 : rule__Pokemon__Group_6__2__Impl ;
    public final void rule__Pokemon__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:856:1: ( rule__Pokemon__Group_6__2__Impl )
            // InternalShowdownGrammar.g:857:2: rule__Pokemon__Group_6__2__Impl
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
    // InternalShowdownGrammar.g:863:1: rule__Pokemon__Group_6__2__Impl : ( ( rule__Pokemon__LevelAssignment_6_2 ) ) ;
    public final void rule__Pokemon__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:867:1: ( ( ( rule__Pokemon__LevelAssignment_6_2 ) ) )
            // InternalShowdownGrammar.g:868:1: ( ( rule__Pokemon__LevelAssignment_6_2 ) )
            {
            // InternalShowdownGrammar.g:868:1: ( ( rule__Pokemon__LevelAssignment_6_2 ) )
            // InternalShowdownGrammar.g:869:2: ( rule__Pokemon__LevelAssignment_6_2 )
            {
             before(grammarAccess.getPokemonAccess().getLevelAssignment_6_2()); 
            // InternalShowdownGrammar.g:870:2: ( rule__Pokemon__LevelAssignment_6_2 )
            // InternalShowdownGrammar.g:870:3: rule__Pokemon__LevelAssignment_6_2
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
    // InternalShowdownGrammar.g:879:1: rule__Pokemon__Group_7__0 : rule__Pokemon__Group_7__0__Impl rule__Pokemon__Group_7__1 ;
    public final void rule__Pokemon__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:883:1: ( rule__Pokemon__Group_7__0__Impl rule__Pokemon__Group_7__1 )
            // InternalShowdownGrammar.g:884:2: rule__Pokemon__Group_7__0__Impl rule__Pokemon__Group_7__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalShowdownGrammar.g:891:1: rule__Pokemon__Group_7__0__Impl : ( 'Shiny' ) ;
    public final void rule__Pokemon__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:895:1: ( ( 'Shiny' ) )
            // InternalShowdownGrammar.g:896:1: ( 'Shiny' )
            {
            // InternalShowdownGrammar.g:896:1: ( 'Shiny' )
            // InternalShowdownGrammar.g:897:2: 'Shiny'
            {
             before(grammarAccess.getPokemonAccess().getShinyKeyword_7_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalShowdownGrammar.g:906:1: rule__Pokemon__Group_7__1 : rule__Pokemon__Group_7__1__Impl rule__Pokemon__Group_7__2 ;
    public final void rule__Pokemon__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:910:1: ( rule__Pokemon__Group_7__1__Impl rule__Pokemon__Group_7__2 )
            // InternalShowdownGrammar.g:911:2: rule__Pokemon__Group_7__1__Impl rule__Pokemon__Group_7__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalShowdownGrammar.g:918:1: rule__Pokemon__Group_7__1__Impl : ( ':' ) ;
    public final void rule__Pokemon__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:922:1: ( ( ':' ) )
            // InternalShowdownGrammar.g:923:1: ( ':' )
            {
            // InternalShowdownGrammar.g:923:1: ( ':' )
            // InternalShowdownGrammar.g:924:2: ':'
            {
             before(grammarAccess.getPokemonAccess().getColonKeyword_7_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalShowdownGrammar.g:933:1: rule__Pokemon__Group_7__2 : rule__Pokemon__Group_7__2__Impl ;
    public final void rule__Pokemon__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:937:1: ( rule__Pokemon__Group_7__2__Impl )
            // InternalShowdownGrammar.g:938:2: rule__Pokemon__Group_7__2__Impl
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
    // InternalShowdownGrammar.g:944:1: rule__Pokemon__Group_7__2__Impl : ( ( rule__Pokemon__ShinyAssignment_7_2 ) ) ;
    public final void rule__Pokemon__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:948:1: ( ( ( rule__Pokemon__ShinyAssignment_7_2 ) ) )
            // InternalShowdownGrammar.g:949:1: ( ( rule__Pokemon__ShinyAssignment_7_2 ) )
            {
            // InternalShowdownGrammar.g:949:1: ( ( rule__Pokemon__ShinyAssignment_7_2 ) )
            // InternalShowdownGrammar.g:950:2: ( rule__Pokemon__ShinyAssignment_7_2 )
            {
             before(grammarAccess.getPokemonAccess().getShinyAssignment_7_2()); 
            // InternalShowdownGrammar.g:951:2: ( rule__Pokemon__ShinyAssignment_7_2 )
            // InternalShowdownGrammar.g:951:3: rule__Pokemon__ShinyAssignment_7_2
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
    // InternalShowdownGrammar.g:960:1: rule__Pokemon__Group_8__0 : rule__Pokemon__Group_8__0__Impl rule__Pokemon__Group_8__1 ;
    public final void rule__Pokemon__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:964:1: ( rule__Pokemon__Group_8__0__Impl rule__Pokemon__Group_8__1 )
            // InternalShowdownGrammar.g:965:2: rule__Pokemon__Group_8__0__Impl rule__Pokemon__Group_8__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalShowdownGrammar.g:972:1: rule__Pokemon__Group_8__0__Impl : ( 'Happiness' ) ;
    public final void rule__Pokemon__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:976:1: ( ( 'Happiness' ) )
            // InternalShowdownGrammar.g:977:1: ( 'Happiness' )
            {
            // InternalShowdownGrammar.g:977:1: ( 'Happiness' )
            // InternalShowdownGrammar.g:978:2: 'Happiness'
            {
             before(grammarAccess.getPokemonAccess().getHappinessKeyword_8_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalShowdownGrammar.g:987:1: rule__Pokemon__Group_8__1 : rule__Pokemon__Group_8__1__Impl rule__Pokemon__Group_8__2 ;
    public final void rule__Pokemon__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:991:1: ( rule__Pokemon__Group_8__1__Impl rule__Pokemon__Group_8__2 )
            // InternalShowdownGrammar.g:992:2: rule__Pokemon__Group_8__1__Impl rule__Pokemon__Group_8__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalShowdownGrammar.g:999:1: rule__Pokemon__Group_8__1__Impl : ( ':' ) ;
    public final void rule__Pokemon__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1003:1: ( ( ':' ) )
            // InternalShowdownGrammar.g:1004:1: ( ':' )
            {
            // InternalShowdownGrammar.g:1004:1: ( ':' )
            // InternalShowdownGrammar.g:1005:2: ':'
            {
             before(grammarAccess.getPokemonAccess().getColonKeyword_8_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalShowdownGrammar.g:1014:1: rule__Pokemon__Group_8__2 : rule__Pokemon__Group_8__2__Impl ;
    public final void rule__Pokemon__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1018:1: ( rule__Pokemon__Group_8__2__Impl )
            // InternalShowdownGrammar.g:1019:2: rule__Pokemon__Group_8__2__Impl
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
    // InternalShowdownGrammar.g:1025:1: rule__Pokemon__Group_8__2__Impl : ( ( rule__Pokemon__HappinessAssignment_8_2 ) ) ;
    public final void rule__Pokemon__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1029:1: ( ( ( rule__Pokemon__HappinessAssignment_8_2 ) ) )
            // InternalShowdownGrammar.g:1030:1: ( ( rule__Pokemon__HappinessAssignment_8_2 ) )
            {
            // InternalShowdownGrammar.g:1030:1: ( ( rule__Pokemon__HappinessAssignment_8_2 ) )
            // InternalShowdownGrammar.g:1031:2: ( rule__Pokemon__HappinessAssignment_8_2 )
            {
             before(grammarAccess.getPokemonAccess().getHappinessAssignment_8_2()); 
            // InternalShowdownGrammar.g:1032:2: ( rule__Pokemon__HappinessAssignment_8_2 )
            // InternalShowdownGrammar.g:1032:3: rule__Pokemon__HappinessAssignment_8_2
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
    // InternalShowdownGrammar.g:1041:1: rule__Pokemon__Group_9__0 : rule__Pokemon__Group_9__0__Impl rule__Pokemon__Group_9__1 ;
    public final void rule__Pokemon__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1045:1: ( rule__Pokemon__Group_9__0__Impl rule__Pokemon__Group_9__1 )
            // InternalShowdownGrammar.g:1046:2: rule__Pokemon__Group_9__0__Impl rule__Pokemon__Group_9__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalShowdownGrammar.g:1053:1: rule__Pokemon__Group_9__0__Impl : ( 'EVs' ) ;
    public final void rule__Pokemon__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1057:1: ( ( 'EVs' ) )
            // InternalShowdownGrammar.g:1058:1: ( 'EVs' )
            {
            // InternalShowdownGrammar.g:1058:1: ( 'EVs' )
            // InternalShowdownGrammar.g:1059:2: 'EVs'
            {
             before(grammarAccess.getPokemonAccess().getEVsKeyword_9_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalShowdownGrammar.g:1068:1: rule__Pokemon__Group_9__1 : rule__Pokemon__Group_9__1__Impl rule__Pokemon__Group_9__2 ;
    public final void rule__Pokemon__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1072:1: ( rule__Pokemon__Group_9__1__Impl rule__Pokemon__Group_9__2 )
            // InternalShowdownGrammar.g:1073:2: rule__Pokemon__Group_9__1__Impl rule__Pokemon__Group_9__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalShowdownGrammar.g:1080:1: rule__Pokemon__Group_9__1__Impl : ( ':' ) ;
    public final void rule__Pokemon__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1084:1: ( ( ':' ) )
            // InternalShowdownGrammar.g:1085:1: ( ':' )
            {
            // InternalShowdownGrammar.g:1085:1: ( ':' )
            // InternalShowdownGrammar.g:1086:2: ':'
            {
             before(grammarAccess.getPokemonAccess().getColonKeyword_9_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalShowdownGrammar.g:1095:1: rule__Pokemon__Group_9__2 : rule__Pokemon__Group_9__2__Impl ;
    public final void rule__Pokemon__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1099:1: ( rule__Pokemon__Group_9__2__Impl )
            // InternalShowdownGrammar.g:1100:2: rule__Pokemon__Group_9__2__Impl
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
    // InternalShowdownGrammar.g:1106:1: rule__Pokemon__Group_9__2__Impl : ( ( rule__Pokemon__Group_9_2__0 )* ) ;
    public final void rule__Pokemon__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1110:1: ( ( ( rule__Pokemon__Group_9_2__0 )* ) )
            // InternalShowdownGrammar.g:1111:1: ( ( rule__Pokemon__Group_9_2__0 )* )
            {
            // InternalShowdownGrammar.g:1111:1: ( ( rule__Pokemon__Group_9_2__0 )* )
            // InternalShowdownGrammar.g:1112:2: ( rule__Pokemon__Group_9_2__0 )*
            {
             before(grammarAccess.getPokemonAccess().getGroup_9_2()); 
            // InternalShowdownGrammar.g:1113:2: ( rule__Pokemon__Group_9_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_INT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalShowdownGrammar.g:1113:3: rule__Pokemon__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Pokemon__Group_9_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalShowdownGrammar.g:1122:1: rule__Pokemon__Group_9_2__0 : rule__Pokemon__Group_9_2__0__Impl rule__Pokemon__Group_9_2__1 ;
    public final void rule__Pokemon__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1126:1: ( rule__Pokemon__Group_9_2__0__Impl rule__Pokemon__Group_9_2__1 )
            // InternalShowdownGrammar.g:1127:2: rule__Pokemon__Group_9_2__0__Impl rule__Pokemon__Group_9_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalShowdownGrammar.g:1134:1: rule__Pokemon__Group_9_2__0__Impl : ( ( rule__Pokemon__EvsAssignment_9_2_0 ) ) ;
    public final void rule__Pokemon__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1138:1: ( ( ( rule__Pokemon__EvsAssignment_9_2_0 ) ) )
            // InternalShowdownGrammar.g:1139:1: ( ( rule__Pokemon__EvsAssignment_9_2_0 ) )
            {
            // InternalShowdownGrammar.g:1139:1: ( ( rule__Pokemon__EvsAssignment_9_2_0 ) )
            // InternalShowdownGrammar.g:1140:2: ( rule__Pokemon__EvsAssignment_9_2_0 )
            {
             before(grammarAccess.getPokemonAccess().getEvsAssignment_9_2_0()); 
            // InternalShowdownGrammar.g:1141:2: ( rule__Pokemon__EvsAssignment_9_2_0 )
            // InternalShowdownGrammar.g:1141:3: rule__Pokemon__EvsAssignment_9_2_0
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
    // InternalShowdownGrammar.g:1149:1: rule__Pokemon__Group_9_2__1 : rule__Pokemon__Group_9_2__1__Impl ;
    public final void rule__Pokemon__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1153:1: ( rule__Pokemon__Group_9_2__1__Impl )
            // InternalShowdownGrammar.g:1154:2: rule__Pokemon__Group_9_2__1__Impl
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
    // InternalShowdownGrammar.g:1160:1: rule__Pokemon__Group_9_2__1__Impl : ( ( '/' )? ) ;
    public final void rule__Pokemon__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1164:1: ( ( ( '/' )? ) )
            // InternalShowdownGrammar.g:1165:1: ( ( '/' )? )
            {
            // InternalShowdownGrammar.g:1165:1: ( ( '/' )? )
            // InternalShowdownGrammar.g:1166:2: ( '/' )?
            {
             before(grammarAccess.getPokemonAccess().getSolidusKeyword_9_2_1()); 
            // InternalShowdownGrammar.g:1167:2: ( '/' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalShowdownGrammar.g:1167:3: '/'
                    {
                    match(input,27,FOLLOW_2); 

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
    // InternalShowdownGrammar.g:1176:1: rule__Pokemon__Group_10__0 : rule__Pokemon__Group_10__0__Impl rule__Pokemon__Group_10__1 ;
    public final void rule__Pokemon__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1180:1: ( rule__Pokemon__Group_10__0__Impl rule__Pokemon__Group_10__1 )
            // InternalShowdownGrammar.g:1181:2: rule__Pokemon__Group_10__0__Impl rule__Pokemon__Group_10__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalShowdownGrammar.g:1188:1: rule__Pokemon__Group_10__0__Impl : ( ( rule__Pokemon__NatureAssignment_10_0 ) ) ;
    public final void rule__Pokemon__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1192:1: ( ( ( rule__Pokemon__NatureAssignment_10_0 ) ) )
            // InternalShowdownGrammar.g:1193:1: ( ( rule__Pokemon__NatureAssignment_10_0 ) )
            {
            // InternalShowdownGrammar.g:1193:1: ( ( rule__Pokemon__NatureAssignment_10_0 ) )
            // InternalShowdownGrammar.g:1194:2: ( rule__Pokemon__NatureAssignment_10_0 )
            {
             before(grammarAccess.getPokemonAccess().getNatureAssignment_10_0()); 
            // InternalShowdownGrammar.g:1195:2: ( rule__Pokemon__NatureAssignment_10_0 )
            // InternalShowdownGrammar.g:1195:3: rule__Pokemon__NatureAssignment_10_0
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
    // InternalShowdownGrammar.g:1203:1: rule__Pokemon__Group_10__1 : rule__Pokemon__Group_10__1__Impl ;
    public final void rule__Pokemon__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1207:1: ( rule__Pokemon__Group_10__1__Impl )
            // InternalShowdownGrammar.g:1208:2: rule__Pokemon__Group_10__1__Impl
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
    // InternalShowdownGrammar.g:1214:1: rule__Pokemon__Group_10__1__Impl : ( 'Nature' ) ;
    public final void rule__Pokemon__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1218:1: ( ( 'Nature' ) )
            // InternalShowdownGrammar.g:1219:1: ( 'Nature' )
            {
            // InternalShowdownGrammar.g:1219:1: ( 'Nature' )
            // InternalShowdownGrammar.g:1220:2: 'Nature'
            {
             before(grammarAccess.getPokemonAccess().getNatureKeyword_10_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalShowdownGrammar.g:1230:1: rule__Pokemon__Group_11__0 : rule__Pokemon__Group_11__0__Impl rule__Pokemon__Group_11__1 ;
    public final void rule__Pokemon__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1234:1: ( rule__Pokemon__Group_11__0__Impl rule__Pokemon__Group_11__1 )
            // InternalShowdownGrammar.g:1235:2: rule__Pokemon__Group_11__0__Impl rule__Pokemon__Group_11__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalShowdownGrammar.g:1242:1: rule__Pokemon__Group_11__0__Impl : ( 'IVs' ) ;
    public final void rule__Pokemon__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1246:1: ( ( 'IVs' ) )
            // InternalShowdownGrammar.g:1247:1: ( 'IVs' )
            {
            // InternalShowdownGrammar.g:1247:1: ( 'IVs' )
            // InternalShowdownGrammar.g:1248:2: 'IVs'
            {
             before(grammarAccess.getPokemonAccess().getIVsKeyword_11_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalShowdownGrammar.g:1257:1: rule__Pokemon__Group_11__1 : rule__Pokemon__Group_11__1__Impl rule__Pokemon__Group_11__2 ;
    public final void rule__Pokemon__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1261:1: ( rule__Pokemon__Group_11__1__Impl rule__Pokemon__Group_11__2 )
            // InternalShowdownGrammar.g:1262:2: rule__Pokemon__Group_11__1__Impl rule__Pokemon__Group_11__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalShowdownGrammar.g:1269:1: rule__Pokemon__Group_11__1__Impl : ( ':' ) ;
    public final void rule__Pokemon__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1273:1: ( ( ':' ) )
            // InternalShowdownGrammar.g:1274:1: ( ':' )
            {
            // InternalShowdownGrammar.g:1274:1: ( ':' )
            // InternalShowdownGrammar.g:1275:2: ':'
            {
             before(grammarAccess.getPokemonAccess().getColonKeyword_11_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalShowdownGrammar.g:1284:1: rule__Pokemon__Group_11__2 : rule__Pokemon__Group_11__2__Impl ;
    public final void rule__Pokemon__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1288:1: ( rule__Pokemon__Group_11__2__Impl )
            // InternalShowdownGrammar.g:1289:2: rule__Pokemon__Group_11__2__Impl
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
    // InternalShowdownGrammar.g:1295:1: rule__Pokemon__Group_11__2__Impl : ( ( rule__Pokemon__Group_11_2__0 )* ) ;
    public final void rule__Pokemon__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1299:1: ( ( ( rule__Pokemon__Group_11_2__0 )* ) )
            // InternalShowdownGrammar.g:1300:1: ( ( rule__Pokemon__Group_11_2__0 )* )
            {
            // InternalShowdownGrammar.g:1300:1: ( ( rule__Pokemon__Group_11_2__0 )* )
            // InternalShowdownGrammar.g:1301:2: ( rule__Pokemon__Group_11_2__0 )*
            {
             before(grammarAccess.getPokemonAccess().getGroup_11_2()); 
            // InternalShowdownGrammar.g:1302:2: ( rule__Pokemon__Group_11_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_INT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalShowdownGrammar.g:1302:3: rule__Pokemon__Group_11_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Pokemon__Group_11_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalShowdownGrammar.g:1311:1: rule__Pokemon__Group_11_2__0 : rule__Pokemon__Group_11_2__0__Impl rule__Pokemon__Group_11_2__1 ;
    public final void rule__Pokemon__Group_11_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1315:1: ( rule__Pokemon__Group_11_2__0__Impl rule__Pokemon__Group_11_2__1 )
            // InternalShowdownGrammar.g:1316:2: rule__Pokemon__Group_11_2__0__Impl rule__Pokemon__Group_11_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalShowdownGrammar.g:1323:1: rule__Pokemon__Group_11_2__0__Impl : ( ( rule__Pokemon__IvsAssignment_11_2_0 ) ) ;
    public final void rule__Pokemon__Group_11_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1327:1: ( ( ( rule__Pokemon__IvsAssignment_11_2_0 ) ) )
            // InternalShowdownGrammar.g:1328:1: ( ( rule__Pokemon__IvsAssignment_11_2_0 ) )
            {
            // InternalShowdownGrammar.g:1328:1: ( ( rule__Pokemon__IvsAssignment_11_2_0 ) )
            // InternalShowdownGrammar.g:1329:2: ( rule__Pokemon__IvsAssignment_11_2_0 )
            {
             before(grammarAccess.getPokemonAccess().getIvsAssignment_11_2_0()); 
            // InternalShowdownGrammar.g:1330:2: ( rule__Pokemon__IvsAssignment_11_2_0 )
            // InternalShowdownGrammar.g:1330:3: rule__Pokemon__IvsAssignment_11_2_0
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
    // InternalShowdownGrammar.g:1338:1: rule__Pokemon__Group_11_2__1 : rule__Pokemon__Group_11_2__1__Impl ;
    public final void rule__Pokemon__Group_11_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1342:1: ( rule__Pokemon__Group_11_2__1__Impl )
            // InternalShowdownGrammar.g:1343:2: rule__Pokemon__Group_11_2__1__Impl
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
    // InternalShowdownGrammar.g:1349:1: rule__Pokemon__Group_11_2__1__Impl : ( ( '/' )? ) ;
    public final void rule__Pokemon__Group_11_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1353:1: ( ( ( '/' )? ) )
            // InternalShowdownGrammar.g:1354:1: ( ( '/' )? )
            {
            // InternalShowdownGrammar.g:1354:1: ( ( '/' )? )
            // InternalShowdownGrammar.g:1355:2: ( '/' )?
            {
             before(grammarAccess.getPokemonAccess().getSolidusKeyword_11_2_1()); 
            // InternalShowdownGrammar.g:1356:2: ( '/' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalShowdownGrammar.g:1356:3: '/'
                    {
                    match(input,27,FOLLOW_2); 

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
    // InternalShowdownGrammar.g:1365:1: rule__Pokemon__Group_12__0 : rule__Pokemon__Group_12__0__Impl rule__Pokemon__Group_12__1 ;
    public final void rule__Pokemon__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1369:1: ( rule__Pokemon__Group_12__0__Impl rule__Pokemon__Group_12__1 )
            // InternalShowdownGrammar.g:1370:2: rule__Pokemon__Group_12__0__Impl rule__Pokemon__Group_12__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalShowdownGrammar.g:1377:1: rule__Pokemon__Group_12__0__Impl : ( '-' ) ;
    public final void rule__Pokemon__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1381:1: ( ( '-' ) )
            // InternalShowdownGrammar.g:1382:1: ( '-' )
            {
            // InternalShowdownGrammar.g:1382:1: ( '-' )
            // InternalShowdownGrammar.g:1383:2: '-'
            {
             before(grammarAccess.getPokemonAccess().getHyphenMinusKeyword_12_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalShowdownGrammar.g:1392:1: rule__Pokemon__Group_12__1 : rule__Pokemon__Group_12__1__Impl ;
    public final void rule__Pokemon__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1396:1: ( rule__Pokemon__Group_12__1__Impl )
            // InternalShowdownGrammar.g:1397:2: rule__Pokemon__Group_12__1__Impl
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
    // InternalShowdownGrammar.g:1403:1: rule__Pokemon__Group_12__1__Impl : ( ( rule__Pokemon__MovesAssignment_12_1 ) ) ;
    public final void rule__Pokemon__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1407:1: ( ( ( rule__Pokemon__MovesAssignment_12_1 ) ) )
            // InternalShowdownGrammar.g:1408:1: ( ( rule__Pokemon__MovesAssignment_12_1 ) )
            {
            // InternalShowdownGrammar.g:1408:1: ( ( rule__Pokemon__MovesAssignment_12_1 ) )
            // InternalShowdownGrammar.g:1409:2: ( rule__Pokemon__MovesAssignment_12_1 )
            {
             before(grammarAccess.getPokemonAccess().getMovesAssignment_12_1()); 
            // InternalShowdownGrammar.g:1410:2: ( rule__Pokemon__MovesAssignment_12_1 )
            // InternalShowdownGrammar.g:1410:3: rule__Pokemon__MovesAssignment_12_1
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
    // InternalShowdownGrammar.g:1419:1: rule__Stat__Group__0 : rule__Stat__Group__0__Impl rule__Stat__Group__1 ;
    public final void rule__Stat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1423:1: ( rule__Stat__Group__0__Impl rule__Stat__Group__1 )
            // InternalShowdownGrammar.g:1424:2: rule__Stat__Group__0__Impl rule__Stat__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalShowdownGrammar.g:1431:1: rule__Stat__Group__0__Impl : ( ( rule__Stat__ValueAssignment_0 ) ) ;
    public final void rule__Stat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1435:1: ( ( ( rule__Stat__ValueAssignment_0 ) ) )
            // InternalShowdownGrammar.g:1436:1: ( ( rule__Stat__ValueAssignment_0 ) )
            {
            // InternalShowdownGrammar.g:1436:1: ( ( rule__Stat__ValueAssignment_0 ) )
            // InternalShowdownGrammar.g:1437:2: ( rule__Stat__ValueAssignment_0 )
            {
             before(grammarAccess.getStatAccess().getValueAssignment_0()); 
            // InternalShowdownGrammar.g:1438:2: ( rule__Stat__ValueAssignment_0 )
            // InternalShowdownGrammar.g:1438:3: rule__Stat__ValueAssignment_0
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
    // InternalShowdownGrammar.g:1446:1: rule__Stat__Group__1 : rule__Stat__Group__1__Impl ;
    public final void rule__Stat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1450:1: ( rule__Stat__Group__1__Impl )
            // InternalShowdownGrammar.g:1451:2: rule__Stat__Group__1__Impl
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
    // InternalShowdownGrammar.g:1457:1: rule__Stat__Group__1__Impl : ( ( rule__Stat__Alternatives_1 ) ) ;
    public final void rule__Stat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1461:1: ( ( ( rule__Stat__Alternatives_1 ) ) )
            // InternalShowdownGrammar.g:1462:1: ( ( rule__Stat__Alternatives_1 ) )
            {
            // InternalShowdownGrammar.g:1462:1: ( ( rule__Stat__Alternatives_1 ) )
            // InternalShowdownGrammar.g:1463:2: ( rule__Stat__Alternatives_1 )
            {
             before(grammarAccess.getStatAccess().getAlternatives_1()); 
            // InternalShowdownGrammar.g:1464:2: ( rule__Stat__Alternatives_1 )
            // InternalShowdownGrammar.g:1464:3: rule__Stat__Alternatives_1
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
    // InternalShowdownGrammar.g:1473:1: rule__Team__ElementsAssignment : ( rulePokemon ) ;
    public final void rule__Team__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1477:1: ( ( rulePokemon ) )
            // InternalShowdownGrammar.g:1478:2: ( rulePokemon )
            {
            // InternalShowdownGrammar.g:1478:2: ( rulePokemon )
            // InternalShowdownGrammar.g:1479:3: rulePokemon
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
    // InternalShowdownGrammar.g:1488:1: rule__Pokemon__NickAssignment_0_0_0 : ( ruleNickname ) ;
    public final void rule__Pokemon__NickAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1492:1: ( ( ruleNickname ) )
            // InternalShowdownGrammar.g:1493:2: ( ruleNickname )
            {
            // InternalShowdownGrammar.g:1493:2: ( ruleNickname )
            // InternalShowdownGrammar.g:1494:3: ruleNickname
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
    // InternalShowdownGrammar.g:1503:1: rule__Pokemon__SpecieAssignment_0_0_2 : ( ruleSpecie ) ;
    public final void rule__Pokemon__SpecieAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1507:1: ( ( ruleSpecie ) )
            // InternalShowdownGrammar.g:1508:2: ( ruleSpecie )
            {
            // InternalShowdownGrammar.g:1508:2: ( ruleSpecie )
            // InternalShowdownGrammar.g:1509:3: ruleSpecie
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
    // InternalShowdownGrammar.g:1518:1: rule__Pokemon__SpecieAssignment_0_1 : ( ruleSpecie ) ;
    public final void rule__Pokemon__SpecieAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1522:1: ( ( ruleSpecie ) )
            // InternalShowdownGrammar.g:1523:2: ( ruleSpecie )
            {
            // InternalShowdownGrammar.g:1523:2: ( ruleSpecie )
            // InternalShowdownGrammar.g:1524:3: ruleSpecie
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
    // InternalShowdownGrammar.g:1533:1: rule__Pokemon__ItemAssignment_2 : ( RULE_ID ) ;
    public final void rule__Pokemon__ItemAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1537:1: ( ( RULE_ID ) )
            // InternalShowdownGrammar.g:1538:2: ( RULE_ID )
            {
            // InternalShowdownGrammar.g:1538:2: ( RULE_ID )
            // InternalShowdownGrammar.g:1539:3: RULE_ID
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
    // InternalShowdownGrammar.g:1548:1: rule__Pokemon__AbilityAssignment_5 : ( ruleAbility ) ;
    public final void rule__Pokemon__AbilityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1552:1: ( ( ruleAbility ) )
            // InternalShowdownGrammar.g:1553:2: ( ruleAbility )
            {
            // InternalShowdownGrammar.g:1553:2: ( ruleAbility )
            // InternalShowdownGrammar.g:1554:3: ruleAbility
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
    // InternalShowdownGrammar.g:1563:1: rule__Pokemon__LevelAssignment_6_2 : ( RULE_INT ) ;
    public final void rule__Pokemon__LevelAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1567:1: ( ( RULE_INT ) )
            // InternalShowdownGrammar.g:1568:2: ( RULE_INT )
            {
            // InternalShowdownGrammar.g:1568:2: ( RULE_INT )
            // InternalShowdownGrammar.g:1569:3: RULE_INT
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
    // InternalShowdownGrammar.g:1578:1: rule__Pokemon__ShinyAssignment_7_2 : ( ruleShiny ) ;
    public final void rule__Pokemon__ShinyAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1582:1: ( ( ruleShiny ) )
            // InternalShowdownGrammar.g:1583:2: ( ruleShiny )
            {
            // InternalShowdownGrammar.g:1583:2: ( ruleShiny )
            // InternalShowdownGrammar.g:1584:3: ruleShiny
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
    // InternalShowdownGrammar.g:1593:1: rule__Pokemon__HappinessAssignment_8_2 : ( RULE_INT ) ;
    public final void rule__Pokemon__HappinessAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1597:1: ( ( RULE_INT ) )
            // InternalShowdownGrammar.g:1598:2: ( RULE_INT )
            {
            // InternalShowdownGrammar.g:1598:2: ( RULE_INT )
            // InternalShowdownGrammar.g:1599:3: RULE_INT
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
    // InternalShowdownGrammar.g:1608:1: rule__Pokemon__EvsAssignment_9_2_0 : ( ruleStat ) ;
    public final void rule__Pokemon__EvsAssignment_9_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1612:1: ( ( ruleStat ) )
            // InternalShowdownGrammar.g:1613:2: ( ruleStat )
            {
            // InternalShowdownGrammar.g:1613:2: ( ruleStat )
            // InternalShowdownGrammar.g:1614:3: ruleStat
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
    // InternalShowdownGrammar.g:1623:1: rule__Pokemon__NatureAssignment_10_0 : ( RULE_ID ) ;
    public final void rule__Pokemon__NatureAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1627:1: ( ( RULE_ID ) )
            // InternalShowdownGrammar.g:1628:2: ( RULE_ID )
            {
            // InternalShowdownGrammar.g:1628:2: ( RULE_ID )
            // InternalShowdownGrammar.g:1629:3: RULE_ID
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
    // InternalShowdownGrammar.g:1638:1: rule__Pokemon__IvsAssignment_11_2_0 : ( ruleStat ) ;
    public final void rule__Pokemon__IvsAssignment_11_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1642:1: ( ( ruleStat ) )
            // InternalShowdownGrammar.g:1643:2: ( ruleStat )
            {
            // InternalShowdownGrammar.g:1643:2: ( ruleStat )
            // InternalShowdownGrammar.g:1644:3: ruleStat
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
    // InternalShowdownGrammar.g:1653:1: rule__Pokemon__MovesAssignment_12_1 : ( ruleMove ) ;
    public final void rule__Pokemon__MovesAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1657:1: ( ( ruleMove ) )
            // InternalShowdownGrammar.g:1658:2: ( ruleMove )
            {
            // InternalShowdownGrammar.g:1658:2: ( ruleMove )
            // InternalShowdownGrammar.g:1659:3: ruleMove
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
    // InternalShowdownGrammar.g:1668:1: rule__Stat__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__Stat__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShowdownGrammar.g:1672:1: ( ( RULE_INT ) )
            // InternalShowdownGrammar.g:1673:2: ( RULE_INT )
            {
            // InternalShowdownGrammar.g:1673:2: ( RULE_INT )
            // InternalShowdownGrammar.g:1674:3: RULE_INT
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000067800010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000067800012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000003F000L});

}