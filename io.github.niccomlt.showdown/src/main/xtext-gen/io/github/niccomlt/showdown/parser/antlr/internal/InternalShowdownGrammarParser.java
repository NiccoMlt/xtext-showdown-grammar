package io.github.niccomlt.showdown.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import io.github.niccomlt.showdown.services.ShowdownGrammarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShowdownGrammarParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'@'", "'Ability'", "':'", "'Level'", "'Shiny'", "'Happiness'", "'EVs'", "'/'", "'Nature'", "'IVs'", "'-'", "'HP'", "'Atk'", "'Def'", "'SpA'", "'SpD'", "'Spe'", "'Yes'"
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

        public InternalShowdownGrammarParser(TokenStream input, ShowdownGrammarGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Team";
       	}

       	@Override
       	protected ShowdownGrammarGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTeam"
    // InternalShowdownGrammar.g:64:1: entryRuleTeam returns [EObject current=null] : iv_ruleTeam= ruleTeam EOF ;
    public final EObject entryRuleTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeam = null;


        try {
            // InternalShowdownGrammar.g:64:45: (iv_ruleTeam= ruleTeam EOF )
            // InternalShowdownGrammar.g:65:2: iv_ruleTeam= ruleTeam EOF
            {
             newCompositeNode(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeam=ruleTeam();

            state._fsp--;

             current =iv_ruleTeam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTeam"


    // $ANTLR start "ruleTeam"
    // InternalShowdownGrammar.g:71:1: ruleTeam returns [EObject current=null] : ( (lv_elements_0_0= rulePokemon ) )* ;
    public final EObject ruleTeam() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalShowdownGrammar.g:77:2: ( ( (lv_elements_0_0= rulePokemon ) )* )
            // InternalShowdownGrammar.g:78:2: ( (lv_elements_0_0= rulePokemon ) )*
            {
            // InternalShowdownGrammar.g:78:2: ( (lv_elements_0_0= rulePokemon ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalShowdownGrammar.g:79:3: (lv_elements_0_0= rulePokemon )
            	    {
            	    // InternalShowdownGrammar.g:79:3: (lv_elements_0_0= rulePokemon )
            	    // InternalShowdownGrammar.g:80:4: lv_elements_0_0= rulePokemon
            	    {

            	    				newCompositeNode(grammarAccess.getTeamAccess().getElementsPokemonParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=rulePokemon();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getTeamRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"io.github.niccomlt.showdown.ShowdownGrammar.Pokemon");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRulePokemon"
    // InternalShowdownGrammar.g:100:1: entryRulePokemon returns [EObject current=null] : iv_rulePokemon= rulePokemon EOF ;
    public final EObject entryRulePokemon() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePokemon = null;


        try {
            // InternalShowdownGrammar.g:100:48: (iv_rulePokemon= rulePokemon EOF )
            // InternalShowdownGrammar.g:101:2: iv_rulePokemon= rulePokemon EOF
            {
             newCompositeNode(grammarAccess.getPokemonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePokemon=rulePokemon();

            state._fsp--;

             current =iv_rulePokemon; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePokemon"


    // $ANTLR start "rulePokemon"
    // InternalShowdownGrammar.g:107:1: rulePokemon returns [EObject current=null] : ( ( ( ( (lv_nick_0_0= ruleNickname ) ) otherlv_1= '(' ( (lv_specie_2_0= ruleSpecie ) ) otherlv_3= ')' ) | ( (lv_specie_4_0= ruleSpecie ) ) ) otherlv_5= '@' ( (lv_item_6_0= RULE_ID ) ) otherlv_7= 'Ability' otherlv_8= ':' ( (lv_ability_9_0= ruleAbility ) ) (otherlv_10= 'Level' otherlv_11= ':' ( (lv_level_12_0= RULE_INT ) ) )? (otherlv_13= 'Shiny' otherlv_14= ':' ( (lv_shiny_15_0= ruleShiny ) ) )? (otherlv_16= 'Happiness' otherlv_17= ':' ( (lv_happiness_18_0= RULE_INT ) ) )? (otherlv_19= 'EVs' otherlv_20= ':' ( ( (lv_evs_21_0= ruleStat ) ) (otherlv_22= '/' )? )* )? ( ( (lv_nature_23_0= RULE_ID ) ) otherlv_24= 'Nature' )? (otherlv_25= 'IVs' otherlv_26= ':' ( ( (lv_ivs_27_0= ruleStat ) ) (otherlv_28= '/' )? )* )? (otherlv_29= '-' ( (lv_moves_30_0= ruleMove ) ) )+ ) ;
    public final EObject rulePokemon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_item_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_level_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_happiness_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token lv_nature_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_nick_0_0 = null;

        AntlrDatatypeRuleToken lv_specie_2_0 = null;

        AntlrDatatypeRuleToken lv_specie_4_0 = null;

        AntlrDatatypeRuleToken lv_ability_9_0 = null;

        AntlrDatatypeRuleToken lv_shiny_15_0 = null;

        EObject lv_evs_21_0 = null;

        EObject lv_ivs_27_0 = null;

        AntlrDatatypeRuleToken lv_moves_30_0 = null;



        	enterRule();

        try {
            // InternalShowdownGrammar.g:113:2: ( ( ( ( ( (lv_nick_0_0= ruleNickname ) ) otherlv_1= '(' ( (lv_specie_2_0= ruleSpecie ) ) otherlv_3= ')' ) | ( (lv_specie_4_0= ruleSpecie ) ) ) otherlv_5= '@' ( (lv_item_6_0= RULE_ID ) ) otherlv_7= 'Ability' otherlv_8= ':' ( (lv_ability_9_0= ruleAbility ) ) (otherlv_10= 'Level' otherlv_11= ':' ( (lv_level_12_0= RULE_INT ) ) )? (otherlv_13= 'Shiny' otherlv_14= ':' ( (lv_shiny_15_0= ruleShiny ) ) )? (otherlv_16= 'Happiness' otherlv_17= ':' ( (lv_happiness_18_0= RULE_INT ) ) )? (otherlv_19= 'EVs' otherlv_20= ':' ( ( (lv_evs_21_0= ruleStat ) ) (otherlv_22= '/' )? )* )? ( ( (lv_nature_23_0= RULE_ID ) ) otherlv_24= 'Nature' )? (otherlv_25= 'IVs' otherlv_26= ':' ( ( (lv_ivs_27_0= ruleStat ) ) (otherlv_28= '/' )? )* )? (otherlv_29= '-' ( (lv_moves_30_0= ruleMove ) ) )+ ) )
            // InternalShowdownGrammar.g:114:2: ( ( ( ( (lv_nick_0_0= ruleNickname ) ) otherlv_1= '(' ( (lv_specie_2_0= ruleSpecie ) ) otherlv_3= ')' ) | ( (lv_specie_4_0= ruleSpecie ) ) ) otherlv_5= '@' ( (lv_item_6_0= RULE_ID ) ) otherlv_7= 'Ability' otherlv_8= ':' ( (lv_ability_9_0= ruleAbility ) ) (otherlv_10= 'Level' otherlv_11= ':' ( (lv_level_12_0= RULE_INT ) ) )? (otherlv_13= 'Shiny' otherlv_14= ':' ( (lv_shiny_15_0= ruleShiny ) ) )? (otherlv_16= 'Happiness' otherlv_17= ':' ( (lv_happiness_18_0= RULE_INT ) ) )? (otherlv_19= 'EVs' otherlv_20= ':' ( ( (lv_evs_21_0= ruleStat ) ) (otherlv_22= '/' )? )* )? ( ( (lv_nature_23_0= RULE_ID ) ) otherlv_24= 'Nature' )? (otherlv_25= 'IVs' otherlv_26= ':' ( ( (lv_ivs_27_0= ruleStat ) ) (otherlv_28= '/' )? )* )? (otherlv_29= '-' ( (lv_moves_30_0= ruleMove ) ) )+ )
            {
            // InternalShowdownGrammar.g:114:2: ( ( ( ( (lv_nick_0_0= ruleNickname ) ) otherlv_1= '(' ( (lv_specie_2_0= ruleSpecie ) ) otherlv_3= ')' ) | ( (lv_specie_4_0= ruleSpecie ) ) ) otherlv_5= '@' ( (lv_item_6_0= RULE_ID ) ) otherlv_7= 'Ability' otherlv_8= ':' ( (lv_ability_9_0= ruleAbility ) ) (otherlv_10= 'Level' otherlv_11= ':' ( (lv_level_12_0= RULE_INT ) ) )? (otherlv_13= 'Shiny' otherlv_14= ':' ( (lv_shiny_15_0= ruleShiny ) ) )? (otherlv_16= 'Happiness' otherlv_17= ':' ( (lv_happiness_18_0= RULE_INT ) ) )? (otherlv_19= 'EVs' otherlv_20= ':' ( ( (lv_evs_21_0= ruleStat ) ) (otherlv_22= '/' )? )* )? ( ( (lv_nature_23_0= RULE_ID ) ) otherlv_24= 'Nature' )? (otherlv_25= 'IVs' otherlv_26= ':' ( ( (lv_ivs_27_0= ruleStat ) ) (otherlv_28= '/' )? )* )? (otherlv_29= '-' ( (lv_moves_30_0= ruleMove ) ) )+ )
            // InternalShowdownGrammar.g:115:3: ( ( ( (lv_nick_0_0= ruleNickname ) ) otherlv_1= '(' ( (lv_specie_2_0= ruleSpecie ) ) otherlv_3= ')' ) | ( (lv_specie_4_0= ruleSpecie ) ) ) otherlv_5= '@' ( (lv_item_6_0= RULE_ID ) ) otherlv_7= 'Ability' otherlv_8= ':' ( (lv_ability_9_0= ruleAbility ) ) (otherlv_10= 'Level' otherlv_11= ':' ( (lv_level_12_0= RULE_INT ) ) )? (otherlv_13= 'Shiny' otherlv_14= ':' ( (lv_shiny_15_0= ruleShiny ) ) )? (otherlv_16= 'Happiness' otherlv_17= ':' ( (lv_happiness_18_0= RULE_INT ) ) )? (otherlv_19= 'EVs' otherlv_20= ':' ( ( (lv_evs_21_0= ruleStat ) ) (otherlv_22= '/' )? )* )? ( ( (lv_nature_23_0= RULE_ID ) ) otherlv_24= 'Nature' )? (otherlv_25= 'IVs' otherlv_26= ':' ( ( (lv_ivs_27_0= ruleStat ) ) (otherlv_28= '/' )? )* )? (otherlv_29= '-' ( (lv_moves_30_0= ruleMove ) ) )+
            {
            // InternalShowdownGrammar.g:115:3: ( ( ( (lv_nick_0_0= ruleNickname ) ) otherlv_1= '(' ( (lv_specie_2_0= ruleSpecie ) ) otherlv_3= ')' ) | ( (lv_specie_4_0= ruleSpecie ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==13) ) {
                    alt2=2;
                }
                else if ( (LA2_1==11) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalShowdownGrammar.g:116:4: ( ( (lv_nick_0_0= ruleNickname ) ) otherlv_1= '(' ( (lv_specie_2_0= ruleSpecie ) ) otherlv_3= ')' )
                    {
                    // InternalShowdownGrammar.g:116:4: ( ( (lv_nick_0_0= ruleNickname ) ) otherlv_1= '(' ( (lv_specie_2_0= ruleSpecie ) ) otherlv_3= ')' )
                    // InternalShowdownGrammar.g:117:5: ( (lv_nick_0_0= ruleNickname ) ) otherlv_1= '(' ( (lv_specie_2_0= ruleSpecie ) ) otherlv_3= ')'
                    {
                    // InternalShowdownGrammar.g:117:5: ( (lv_nick_0_0= ruleNickname ) )
                    // InternalShowdownGrammar.g:118:6: (lv_nick_0_0= ruleNickname )
                    {
                    // InternalShowdownGrammar.g:118:6: (lv_nick_0_0= ruleNickname )
                    // InternalShowdownGrammar.g:119:7: lv_nick_0_0= ruleNickname
                    {

                    							newCompositeNode(grammarAccess.getPokemonAccess().getNickNicknameParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_4);
                    lv_nick_0_0=ruleNickname();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPokemonRule());
                    							}
                    							set(
                    								current,
                    								"nick",
                    								lv_nick_0_0,
                    								"io.github.niccomlt.showdown.ShowdownGrammar.Nickname");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getPokemonAccess().getLeftParenthesisKeyword_0_0_1());
                    				
                    // InternalShowdownGrammar.g:140:5: ( (lv_specie_2_0= ruleSpecie ) )
                    // InternalShowdownGrammar.g:141:6: (lv_specie_2_0= ruleSpecie )
                    {
                    // InternalShowdownGrammar.g:141:6: (lv_specie_2_0= ruleSpecie )
                    // InternalShowdownGrammar.g:142:7: lv_specie_2_0= ruleSpecie
                    {

                    							newCompositeNode(grammarAccess.getPokemonAccess().getSpecieSpecieParserRuleCall_0_0_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_specie_2_0=ruleSpecie();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPokemonRule());
                    							}
                    							set(
                    								current,
                    								"specie",
                    								lv_specie_2_0,
                    								"io.github.niccomlt.showdown.ShowdownGrammar.Specie");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,12,FOLLOW_7); 

                    					newLeafNode(otherlv_3, grammarAccess.getPokemonAccess().getRightParenthesisKeyword_0_0_3());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalShowdownGrammar.g:165:4: ( (lv_specie_4_0= ruleSpecie ) )
                    {
                    // InternalShowdownGrammar.g:165:4: ( (lv_specie_4_0= ruleSpecie ) )
                    // InternalShowdownGrammar.g:166:5: (lv_specie_4_0= ruleSpecie )
                    {
                    // InternalShowdownGrammar.g:166:5: (lv_specie_4_0= ruleSpecie )
                    // InternalShowdownGrammar.g:167:6: lv_specie_4_0= ruleSpecie
                    {

                    						newCompositeNode(grammarAccess.getPokemonAccess().getSpecieSpecieParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_specie_4_0=ruleSpecie();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPokemonRule());
                    						}
                    						set(
                    							current,
                    							"specie",
                    							lv_specie_4_0,
                    							"io.github.niccomlt.showdown.ShowdownGrammar.Specie");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getPokemonAccess().getCommercialAtKeyword_1());
            		
            // InternalShowdownGrammar.g:189:3: ( (lv_item_6_0= RULE_ID ) )
            // InternalShowdownGrammar.g:190:4: (lv_item_6_0= RULE_ID )
            {
            // InternalShowdownGrammar.g:190:4: (lv_item_6_0= RULE_ID )
            // InternalShowdownGrammar.g:191:5: lv_item_6_0= RULE_ID
            {
            lv_item_6_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_item_6_0, grammarAccess.getPokemonAccess().getItemIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPokemonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"item",
            						lv_item_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getPokemonAccess().getAbilityKeyword_3());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getPokemonAccess().getColonKeyword_4());
            		
            // InternalShowdownGrammar.g:215:3: ( (lv_ability_9_0= ruleAbility ) )
            // InternalShowdownGrammar.g:216:4: (lv_ability_9_0= ruleAbility )
            {
            // InternalShowdownGrammar.g:216:4: (lv_ability_9_0= ruleAbility )
            // InternalShowdownGrammar.g:217:5: lv_ability_9_0= ruleAbility
            {

            					newCompositeNode(grammarAccess.getPokemonAccess().getAbilityAbilityParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_ability_9_0=ruleAbility();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPokemonRule());
            					}
            					set(
            						current,
            						"ability",
            						lv_ability_9_0,
            						"io.github.niccomlt.showdown.ShowdownGrammar.Ability");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShowdownGrammar.g:234:3: (otherlv_10= 'Level' otherlv_11= ':' ( (lv_level_12_0= RULE_INT ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalShowdownGrammar.g:235:4: otherlv_10= 'Level' otherlv_11= ':' ( (lv_level_12_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getPokemonAccess().getLevelKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getPokemonAccess().getColonKeyword_6_1());
                    			
                    // InternalShowdownGrammar.g:243:4: ( (lv_level_12_0= RULE_INT ) )
                    // InternalShowdownGrammar.g:244:5: (lv_level_12_0= RULE_INT )
                    {
                    // InternalShowdownGrammar.g:244:5: (lv_level_12_0= RULE_INT )
                    // InternalShowdownGrammar.g:245:6: lv_level_12_0= RULE_INT
                    {
                    lv_level_12_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    						newLeafNode(lv_level_12_0, grammarAccess.getPokemonAccess().getLevelINTTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPokemonRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"level",
                    							lv_level_12_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalShowdownGrammar.g:262:3: (otherlv_13= 'Shiny' otherlv_14= ':' ( (lv_shiny_15_0= ruleShiny ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalShowdownGrammar.g:263:4: otherlv_13= 'Shiny' otherlv_14= ':' ( (lv_shiny_15_0= ruleShiny ) )
                    {
                    otherlv_13=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getPokemonAccess().getShinyKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_14, grammarAccess.getPokemonAccess().getColonKeyword_7_1());
                    			
                    // InternalShowdownGrammar.g:271:4: ( (lv_shiny_15_0= ruleShiny ) )
                    // InternalShowdownGrammar.g:272:5: (lv_shiny_15_0= ruleShiny )
                    {
                    // InternalShowdownGrammar.g:272:5: (lv_shiny_15_0= ruleShiny )
                    // InternalShowdownGrammar.g:273:6: lv_shiny_15_0= ruleShiny
                    {

                    						newCompositeNode(grammarAccess.getPokemonAccess().getShinyShinyParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_shiny_15_0=ruleShiny();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPokemonRule());
                    						}
                    						set(
                    							current,
                    							"shiny",
                    							lv_shiny_15_0,
                    							"io.github.niccomlt.showdown.ShowdownGrammar.Shiny");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalShowdownGrammar.g:291:3: (otherlv_16= 'Happiness' otherlv_17= ':' ( (lv_happiness_18_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalShowdownGrammar.g:292:4: otherlv_16= 'Happiness' otherlv_17= ':' ( (lv_happiness_18_0= RULE_INT ) )
                    {
                    otherlv_16=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getPokemonAccess().getHappinessKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getPokemonAccess().getColonKeyword_8_1());
                    			
                    // InternalShowdownGrammar.g:300:4: ( (lv_happiness_18_0= RULE_INT ) )
                    // InternalShowdownGrammar.g:301:5: (lv_happiness_18_0= RULE_INT )
                    {
                    // InternalShowdownGrammar.g:301:5: (lv_happiness_18_0= RULE_INT )
                    // InternalShowdownGrammar.g:302:6: lv_happiness_18_0= RULE_INT
                    {
                    lv_happiness_18_0=(Token)match(input,RULE_INT,FOLLOW_16); 

                    						newLeafNode(lv_happiness_18_0, grammarAccess.getPokemonAccess().getHappinessINTTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPokemonRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"happiness",
                    							lv_happiness_18_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalShowdownGrammar.g:319:3: (otherlv_19= 'EVs' otherlv_20= ':' ( ( (lv_evs_21_0= ruleStat ) ) (otherlv_22= '/' )? )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalShowdownGrammar.g:320:4: otherlv_19= 'EVs' otherlv_20= ':' ( ( (lv_evs_21_0= ruleStat ) ) (otherlv_22= '/' )? )*
                    {
                    otherlv_19=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_19, grammarAccess.getPokemonAccess().getEVsKeyword_9_0());
                    			
                    otherlv_20=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_20, grammarAccess.getPokemonAccess().getColonKeyword_9_1());
                    			
                    // InternalShowdownGrammar.g:328:4: ( ( (lv_evs_21_0= ruleStat ) ) (otherlv_22= '/' )? )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_INT) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalShowdownGrammar.g:329:5: ( (lv_evs_21_0= ruleStat ) ) (otherlv_22= '/' )?
                    	    {
                    	    // InternalShowdownGrammar.g:329:5: ( (lv_evs_21_0= ruleStat ) )
                    	    // InternalShowdownGrammar.g:330:6: (lv_evs_21_0= ruleStat )
                    	    {
                    	    // InternalShowdownGrammar.g:330:6: (lv_evs_21_0= ruleStat )
                    	    // InternalShowdownGrammar.g:331:7: lv_evs_21_0= ruleStat
                    	    {

                    	    							newCompositeNode(grammarAccess.getPokemonAccess().getEvsStatParserRuleCall_9_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_evs_21_0=ruleStat();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPokemonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"evs",
                    	    								lv_evs_21_0,
                    	    								"io.github.niccomlt.showdown.ShowdownGrammar.Stat");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalShowdownGrammar.g:348:5: (otherlv_22= '/' )?
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==20) ) {
                    	        alt6=1;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // InternalShowdownGrammar.g:349:6: otherlv_22= '/'
                    	            {
                    	            otherlv_22=(Token)match(input,20,FOLLOW_17); 

                    	            						newLeafNode(otherlv_22, grammarAccess.getPokemonAccess().getSolidusKeyword_9_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalShowdownGrammar.g:356:3: ( ( (lv_nature_23_0= RULE_ID ) ) otherlv_24= 'Nature' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalShowdownGrammar.g:357:4: ( (lv_nature_23_0= RULE_ID ) ) otherlv_24= 'Nature'
                    {
                    // InternalShowdownGrammar.g:357:4: ( (lv_nature_23_0= RULE_ID ) )
                    // InternalShowdownGrammar.g:358:5: (lv_nature_23_0= RULE_ID )
                    {
                    // InternalShowdownGrammar.g:358:5: (lv_nature_23_0= RULE_ID )
                    // InternalShowdownGrammar.g:359:6: lv_nature_23_0= RULE_ID
                    {
                    lv_nature_23_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_nature_23_0, grammarAccess.getPokemonAccess().getNatureIDTerminalRuleCall_10_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPokemonRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"nature",
                    							lv_nature_23_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_24=(Token)match(input,21,FOLLOW_20); 

                    				newLeafNode(otherlv_24, grammarAccess.getPokemonAccess().getNatureKeyword_10_1());
                    			

                    }
                    break;

            }

            // InternalShowdownGrammar.g:380:3: (otherlv_25= 'IVs' otherlv_26= ':' ( ( (lv_ivs_27_0= ruleStat ) ) (otherlv_28= '/' )? )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalShowdownGrammar.g:381:4: otherlv_25= 'IVs' otherlv_26= ':' ( ( (lv_ivs_27_0= ruleStat ) ) (otherlv_28= '/' )? )*
                    {
                    otherlv_25=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_25, grammarAccess.getPokemonAccess().getIVsKeyword_11_0());
                    			
                    otherlv_26=(Token)match(input,15,FOLLOW_21); 

                    				newLeafNode(otherlv_26, grammarAccess.getPokemonAccess().getColonKeyword_11_1());
                    			
                    // InternalShowdownGrammar.g:389:4: ( ( (lv_ivs_27_0= ruleStat ) ) (otherlv_28= '/' )? )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_INT) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalShowdownGrammar.g:390:5: ( (lv_ivs_27_0= ruleStat ) ) (otherlv_28= '/' )?
                    	    {
                    	    // InternalShowdownGrammar.g:390:5: ( (lv_ivs_27_0= ruleStat ) )
                    	    // InternalShowdownGrammar.g:391:6: (lv_ivs_27_0= ruleStat )
                    	    {
                    	    // InternalShowdownGrammar.g:391:6: (lv_ivs_27_0= ruleStat )
                    	    // InternalShowdownGrammar.g:392:7: lv_ivs_27_0= ruleStat
                    	    {

                    	    							newCompositeNode(grammarAccess.getPokemonAccess().getIvsStatParserRuleCall_11_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_ivs_27_0=ruleStat();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPokemonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ivs",
                    	    								lv_ivs_27_0,
                    	    								"io.github.niccomlt.showdown.ShowdownGrammar.Stat");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalShowdownGrammar.g:409:5: (otherlv_28= '/' )?
                    	    int alt10=2;
                    	    int LA10_0 = input.LA(1);

                    	    if ( (LA10_0==20) ) {
                    	        alt10=1;
                    	    }
                    	    switch (alt10) {
                    	        case 1 :
                    	            // InternalShowdownGrammar.g:410:6: otherlv_28= '/'
                    	            {
                    	            otherlv_28=(Token)match(input,20,FOLLOW_21); 

                    	            						newLeafNode(otherlv_28, grammarAccess.getPokemonAccess().getSolidusKeyword_11_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalShowdownGrammar.g:417:3: (otherlv_29= '-' ( (lv_moves_30_0= ruleMove ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalShowdownGrammar.g:418:4: otherlv_29= '-' ( (lv_moves_30_0= ruleMove ) )
            	    {
            	    otherlv_29=(Token)match(input,23,FOLLOW_8); 

            	    				newLeafNode(otherlv_29, grammarAccess.getPokemonAccess().getHyphenMinusKeyword_12_0());
            	    			
            	    // InternalShowdownGrammar.g:422:4: ( (lv_moves_30_0= ruleMove ) )
            	    // InternalShowdownGrammar.g:423:5: (lv_moves_30_0= ruleMove )
            	    {
            	    // InternalShowdownGrammar.g:423:5: (lv_moves_30_0= ruleMove )
            	    // InternalShowdownGrammar.g:424:6: lv_moves_30_0= ruleMove
            	    {

            	    						newCompositeNode(grammarAccess.getPokemonAccess().getMovesMoveParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_moves_30_0=ruleMove();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPokemonRule());
            	    						}
            	    						add(
            	    							current,
            	    							"moves",
            	    							lv_moves_30_0,
            	    							"io.github.niccomlt.showdown.ShowdownGrammar.Move");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePokemon"


    // $ANTLR start "entryRuleMove"
    // InternalShowdownGrammar.g:446:1: entryRuleMove returns [String current=null] : iv_ruleMove= ruleMove EOF ;
    public final String entryRuleMove() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMove = null;


        try {
            // InternalShowdownGrammar.g:446:44: (iv_ruleMove= ruleMove EOF )
            // InternalShowdownGrammar.g:447:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalShowdownGrammar.g:453:1: ruleMove returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID )+ ;
    public final AntlrDatatypeRuleToken ruleMove() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalShowdownGrammar.g:459:2: ( (this_ID_0= RULE_ID )+ )
            // InternalShowdownGrammar.g:460:2: (this_ID_0= RULE_ID )+
            {
            // InternalShowdownGrammar.g:460:2: (this_ID_0= RULE_ID )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==EOF||LA14_2==RULE_ID||LA14_2==23) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalShowdownGrammar.g:461:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getMoveAccess().getIDTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleStat"
    // InternalShowdownGrammar.g:472:1: entryRuleStat returns [EObject current=null] : iv_ruleStat= ruleStat EOF ;
    public final EObject entryRuleStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStat = null;


        try {
            // InternalShowdownGrammar.g:472:45: (iv_ruleStat= ruleStat EOF )
            // InternalShowdownGrammar.g:473:2: iv_ruleStat= ruleStat EOF
            {
             newCompositeNode(grammarAccess.getStatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStat=ruleStat();

            state._fsp--;

             current =iv_ruleStat; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStat"


    // $ANTLR start "ruleStat"
    // InternalShowdownGrammar.g:479:1: ruleStat returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'HP' | otherlv_2= 'Atk' | otherlv_3= 'Def' | otherlv_4= 'SpA' | otherlv_5= 'SpD' | otherlv_6= 'Spe' ) ) ;
    public final EObject ruleStat() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalShowdownGrammar.g:485:2: ( ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'HP' | otherlv_2= 'Atk' | otherlv_3= 'Def' | otherlv_4= 'SpA' | otherlv_5= 'SpD' | otherlv_6= 'Spe' ) ) )
            // InternalShowdownGrammar.g:486:2: ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'HP' | otherlv_2= 'Atk' | otherlv_3= 'Def' | otherlv_4= 'SpA' | otherlv_5= 'SpD' | otherlv_6= 'Spe' ) )
            {
            // InternalShowdownGrammar.g:486:2: ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'HP' | otherlv_2= 'Atk' | otherlv_3= 'Def' | otherlv_4= 'SpA' | otherlv_5= 'SpD' | otherlv_6= 'Spe' ) )
            // InternalShowdownGrammar.g:487:3: ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'HP' | otherlv_2= 'Atk' | otherlv_3= 'Def' | otherlv_4= 'SpA' | otherlv_5= 'SpD' | otherlv_6= 'Spe' )
            {
            // InternalShowdownGrammar.g:487:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalShowdownGrammar.g:488:4: (lv_value_0_0= RULE_INT )
            {
            // InternalShowdownGrammar.g:488:4: (lv_value_0_0= RULE_INT )
            // InternalShowdownGrammar.g:489:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_value_0_0, grammarAccess.getStatAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalShowdownGrammar.g:505:3: (otherlv_1= 'HP' | otherlv_2= 'Atk' | otherlv_3= 'Def' | otherlv_4= 'SpA' | otherlv_5= 'SpD' | otherlv_6= 'Spe' )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt15=1;
                }
                break;
            case 25:
                {
                alt15=2;
                }
                break;
            case 26:
                {
                alt15=3;
                }
                break;
            case 27:
                {
                alt15=4;
                }
                break;
            case 28:
                {
                alt15=5;
                }
                break;
            case 29:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalShowdownGrammar.g:506:4: otherlv_1= 'HP'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatAccess().getHPKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalShowdownGrammar.g:511:4: otherlv_2= 'Atk'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getStatAccess().getAtkKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalShowdownGrammar.g:516:4: otherlv_3= 'Def'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getStatAccess().getDefKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalShowdownGrammar.g:521:4: otherlv_4= 'SpA'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getStatAccess().getSpAKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalShowdownGrammar.g:526:4: otherlv_5= 'SpD'
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getStatAccess().getSpDKeyword_1_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalShowdownGrammar.g:531:4: otherlv_6= 'Spe'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getStatAccess().getSpeKeyword_1_5());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStat"


    // $ANTLR start "entryRuleShiny"
    // InternalShowdownGrammar.g:540:1: entryRuleShiny returns [String current=null] : iv_ruleShiny= ruleShiny EOF ;
    public final String entryRuleShiny() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleShiny = null;


        try {
            // InternalShowdownGrammar.g:540:45: (iv_ruleShiny= ruleShiny EOF )
            // InternalShowdownGrammar.g:541:2: iv_ruleShiny= ruleShiny EOF
            {
             newCompositeNode(grammarAccess.getShinyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShiny=ruleShiny();

            state._fsp--;

             current =iv_ruleShiny.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShiny"


    // $ANTLR start "ruleShiny"
    // InternalShowdownGrammar.g:547:1: ruleShiny returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Yes' ;
    public final AntlrDatatypeRuleToken ruleShiny() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalShowdownGrammar.g:553:2: (kw= 'Yes' )
            // InternalShowdownGrammar.g:554:2: kw= 'Yes'
            {
            kw=(Token)match(input,30,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getShinyAccess().getYesKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShiny"


    // $ANTLR start "entryRuleSpecie"
    // InternalShowdownGrammar.g:562:1: entryRuleSpecie returns [String current=null] : iv_ruleSpecie= ruleSpecie EOF ;
    public final String entryRuleSpecie() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpecie = null;


        try {
            // InternalShowdownGrammar.g:562:46: (iv_ruleSpecie= ruleSpecie EOF )
            // InternalShowdownGrammar.g:563:2: iv_ruleSpecie= ruleSpecie EOF
            {
             newCompositeNode(grammarAccess.getSpecieRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecie=ruleSpecie();

            state._fsp--;

             current =iv_ruleSpecie.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecie"


    // $ANTLR start "ruleSpecie"
    // InternalShowdownGrammar.g:569:1: ruleSpecie returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSpecie() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalShowdownGrammar.g:575:2: (this_ID_0= RULE_ID )
            // InternalShowdownGrammar.g:576:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getSpecieAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecie"


    // $ANTLR start "entryRuleNickname"
    // InternalShowdownGrammar.g:586:1: entryRuleNickname returns [String current=null] : iv_ruleNickname= ruleNickname EOF ;
    public final String entryRuleNickname() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNickname = null;


        try {
            // InternalShowdownGrammar.g:586:48: (iv_ruleNickname= ruleNickname EOF )
            // InternalShowdownGrammar.g:587:2: iv_ruleNickname= ruleNickname EOF
            {
             newCompositeNode(grammarAccess.getNicknameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNickname=ruleNickname();

            state._fsp--;

             current =iv_ruleNickname.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNickname"


    // $ANTLR start "ruleNickname"
    // InternalShowdownGrammar.g:593:1: ruleNickname returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleNickname() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalShowdownGrammar.g:599:2: (this_ID_0= RULE_ID )
            // InternalShowdownGrammar.g:600:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getNicknameAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNickname"


    // $ANTLR start "entryRuleAbility"
    // InternalShowdownGrammar.g:610:1: entryRuleAbility returns [String current=null] : iv_ruleAbility= ruleAbility EOF ;
    public final String entryRuleAbility() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAbility = null;


        try {
            // InternalShowdownGrammar.g:610:47: (iv_ruleAbility= ruleAbility EOF )
            // InternalShowdownGrammar.g:611:2: iv_ruleAbility= ruleAbility EOF
            {
             newCompositeNode(grammarAccess.getAbilityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbility=ruleAbility();

            state._fsp--;

             current =iv_ruleAbility.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbility"


    // $ANTLR start "ruleAbility"
    // InternalShowdownGrammar.g:617:1: ruleAbility returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID )+ ;
    public final AntlrDatatypeRuleToken ruleAbility() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalShowdownGrammar.g:623:2: ( (this_ID_0= RULE_ID )+ )
            // InternalShowdownGrammar.g:624:2: (this_ID_0= RULE_ID )+
            {
            // InternalShowdownGrammar.g:624:2: (this_ID_0= RULE_ID )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==EOF||LA16_2==RULE_ID||(LA16_2>=16 && LA16_2<=19)||(LA16_2>=22 && LA16_2<=23)) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalShowdownGrammar.g:625:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getAbilityAccess().getIDTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbility"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000CF0010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000CE0010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000CC0010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C80010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000D00030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000900020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000003F000000L});

}