package org.xtext.example.dibujos1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.dibujos1.services.Dibujos1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDibujos1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_HEXCOLOR", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'C'", "'R'", "'L'", "'T'", "'P'", "'SC'", "'FC'", "'BG'", "'SW'", "'FS'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_HEXCOLOR=6;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDibujos1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDibujos1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDibujos1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalDibujos1.g"; }



     	private Dibujos1GrammarAccess grammarAccess;

        public InternalDibujos1Parser(TokenStream input, Dibujos1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Modelo";
       	}

       	@Override
       	protected Dibujos1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModelo"
    // InternalDibujos1.g:64:1: entryRuleModelo returns [EObject current=null] : iv_ruleModelo= ruleModelo EOF ;
    public final EObject entryRuleModelo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelo = null;


        try {
            // InternalDibujos1.g:64:47: (iv_ruleModelo= ruleModelo EOF )
            // InternalDibujos1.g:65:2: iv_ruleModelo= ruleModelo EOF
            {
             newCompositeNode(grammarAccess.getModeloRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelo=ruleModelo();

            state._fsp--;

             current =iv_ruleModelo; 
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
    // $ANTLR end "entryRuleModelo"


    // $ANTLR start "ruleModelo"
    // InternalDibujos1.g:71:1: ruleModelo returns [EObject current=null] : ( (lv_instrucciones_0_0= ruleInstruccion ) )* ;
    public final EObject ruleModelo() throws RecognitionException {
        EObject current = null;

        EObject lv_instrucciones_0_0 = null;



        	enterRule();

        try {
            // InternalDibujos1.g:77:2: ( ( (lv_instrucciones_0_0= ruleInstruccion ) )* )
            // InternalDibujos1.g:78:2: ( (lv_instrucciones_0_0= ruleInstruccion ) )*
            {
            // InternalDibujos1.g:78:2: ( (lv_instrucciones_0_0= ruleInstruccion ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDibujos1.g:79:3: (lv_instrucciones_0_0= ruleInstruccion )
            	    {
            	    // InternalDibujos1.g:79:3: (lv_instrucciones_0_0= ruleInstruccion )
            	    // InternalDibujos1.g:80:4: lv_instrucciones_0_0= ruleInstruccion
            	    {

            	    				newCompositeNode(grammarAccess.getModeloAccess().getInstruccionesInstruccionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_instrucciones_0_0=ruleInstruccion();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModeloRule());
            	    				}
            	    				add(
            	    					current,
            	    					"instrucciones",
            	    					lv_instrucciones_0_0,
            	    					"org.xtext.example.dibujos1.Dibujos1.Instruccion");
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
    // $ANTLR end "ruleModelo"


    // $ANTLR start "entryRuleInstruccion"
    // InternalDibujos1.g:100:1: entryRuleInstruccion returns [EObject current=null] : iv_ruleInstruccion= ruleInstruccion EOF ;
    public final EObject entryRuleInstruccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruccion = null;


        try {
            // InternalDibujos1.g:100:52: (iv_ruleInstruccion= ruleInstruccion EOF )
            // InternalDibujos1.g:101:2: iv_ruleInstruccion= ruleInstruccion EOF
            {
             newCompositeNode(grammarAccess.getInstruccionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruccion=ruleInstruccion();

            state._fsp--;

             current =iv_ruleInstruccion; 
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
    // $ANTLR end "entryRuleInstruccion"


    // $ANTLR start "ruleInstruccion"
    // InternalDibujos1.g:107:1: ruleInstruccion returns [EObject current=null] : (this_Circulo_0= ruleCirculo | this_Rectangulo_1= ruleRectangulo | this_Linea_2= ruleLinea | this_Texto_3= ruleTexto | this_Punto_4= rulePunto | this_Color_5= ruleColor | this_Estilo_6= ruleEstilo | this_Fuente_7= ruleFuente ) ;
    public final EObject ruleInstruccion() throws RecognitionException {
        EObject current = null;

        EObject this_Circulo_0 = null;

        EObject this_Rectangulo_1 = null;

        EObject this_Linea_2 = null;

        EObject this_Texto_3 = null;

        EObject this_Punto_4 = null;

        EObject this_Color_5 = null;

        EObject this_Estilo_6 = null;

        EObject this_Fuente_7 = null;



        	enterRule();

        try {
            // InternalDibujos1.g:113:2: ( (this_Circulo_0= ruleCirculo | this_Rectangulo_1= ruleRectangulo | this_Linea_2= ruleLinea | this_Texto_3= ruleTexto | this_Punto_4= rulePunto | this_Color_5= ruleColor | this_Estilo_6= ruleEstilo | this_Fuente_7= ruleFuente ) )
            // InternalDibujos1.g:114:2: (this_Circulo_0= ruleCirculo | this_Rectangulo_1= ruleRectangulo | this_Linea_2= ruleLinea | this_Texto_3= ruleTexto | this_Punto_4= rulePunto | this_Color_5= ruleColor | this_Estilo_6= ruleEstilo | this_Fuente_7= ruleFuente )
            {
            // InternalDibujos1.g:114:2: (this_Circulo_0= ruleCirculo | this_Rectangulo_1= ruleRectangulo | this_Linea_2= ruleLinea | this_Texto_3= ruleTexto | this_Punto_4= rulePunto | this_Color_5= ruleColor | this_Estilo_6= ruleEstilo | this_Fuente_7= ruleFuente )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            case 17:
            case 18:
            case 19:
                {
                alt2=6;
                }
                break;
            case 20:
                {
                alt2=7;
                }
                break;
            case 21:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDibujos1.g:115:3: this_Circulo_0= ruleCirculo
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getCirculoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Circulo_0=ruleCirculo();

                    state._fsp--;


                    			current = this_Circulo_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDibujos1.g:124:3: this_Rectangulo_1= ruleRectangulo
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getRectanguloParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rectangulo_1=ruleRectangulo();

                    state._fsp--;


                    			current = this_Rectangulo_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDibujos1.g:133:3: this_Linea_2= ruleLinea
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getLineaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Linea_2=ruleLinea();

                    state._fsp--;


                    			current = this_Linea_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDibujos1.g:142:3: this_Texto_3= ruleTexto
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getTextoParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Texto_3=ruleTexto();

                    state._fsp--;


                    			current = this_Texto_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDibujos1.g:151:3: this_Punto_4= rulePunto
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getPuntoParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Punto_4=rulePunto();

                    state._fsp--;


                    			current = this_Punto_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDibujos1.g:160:3: this_Color_5= ruleColor
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getColorParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Color_5=ruleColor();

                    state._fsp--;


                    			current = this_Color_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDibujos1.g:169:3: this_Estilo_6= ruleEstilo
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getEstiloParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Estilo_6=ruleEstilo();

                    state._fsp--;


                    			current = this_Estilo_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDibujos1.g:178:3: this_Fuente_7= ruleFuente
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getFuenteParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fuente_7=ruleFuente();

                    state._fsp--;


                    			current = this_Fuente_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleInstruccion"


    // $ANTLR start "entryRuleCirculo"
    // InternalDibujos1.g:190:1: entryRuleCirculo returns [EObject current=null] : iv_ruleCirculo= ruleCirculo EOF ;
    public final EObject entryRuleCirculo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCirculo = null;


        try {
            // InternalDibujos1.g:190:48: (iv_ruleCirculo= ruleCirculo EOF )
            // InternalDibujos1.g:191:2: iv_ruleCirculo= ruleCirculo EOF
            {
             newCompositeNode(grammarAccess.getCirculoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCirculo=ruleCirculo();

            state._fsp--;

             current =iv_ruleCirculo; 
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
    // $ANTLR end "entryRuleCirculo"


    // $ANTLR start "ruleCirculo"
    // InternalDibujos1.g:197:1: ruleCirculo returns [EObject current=null] : (otherlv_0= 'C' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_r_3_0= RULE_INT ) ) ) ;
    public final EObject ruleCirculo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token lv_y_2_0=null;
        Token lv_r_3_0=null;


        	enterRule();

        try {
            // InternalDibujos1.g:203:2: ( (otherlv_0= 'C' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_r_3_0= RULE_INT ) ) ) )
            // InternalDibujos1.g:204:2: (otherlv_0= 'C' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_r_3_0= RULE_INT ) ) )
            {
            // InternalDibujos1.g:204:2: (otherlv_0= 'C' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_r_3_0= RULE_INT ) ) )
            // InternalDibujos1.g:205:3: otherlv_0= 'C' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_r_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCirculoAccess().getCKeyword_0());
            		
            // InternalDibujos1.g:209:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalDibujos1.g:210:4: (lv_x_1_0= RULE_INT )
            {
            // InternalDibujos1.g:210:4: (lv_x_1_0= RULE_INT )
            // InternalDibujos1.g:211:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_x_1_0, grammarAccess.getCirculoAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCirculoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDibujos1.g:227:3: ( (lv_y_2_0= RULE_INT ) )
            // InternalDibujos1.g:228:4: (lv_y_2_0= RULE_INT )
            {
            // InternalDibujos1.g:228:4: (lv_y_2_0= RULE_INT )
            // InternalDibujos1.g:229:5: lv_y_2_0= RULE_INT
            {
            lv_y_2_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_y_2_0, grammarAccess.getCirculoAccess().getYINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCirculoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDibujos1.g:245:3: ( (lv_r_3_0= RULE_INT ) )
            // InternalDibujos1.g:246:4: (lv_r_3_0= RULE_INT )
            {
            // InternalDibujos1.g:246:4: (lv_r_3_0= RULE_INT )
            // InternalDibujos1.g:247:5: lv_r_3_0= RULE_INT
            {
            lv_r_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_r_3_0, grammarAccess.getCirculoAccess().getRINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCirculoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"r",
            						lv_r_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleCirculo"


    // $ANTLR start "entryRuleRectangulo"
    // InternalDibujos1.g:267:1: entryRuleRectangulo returns [EObject current=null] : iv_ruleRectangulo= ruleRectangulo EOF ;
    public final EObject entryRuleRectangulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangulo = null;


        try {
            // InternalDibujos1.g:267:51: (iv_ruleRectangulo= ruleRectangulo EOF )
            // InternalDibujos1.g:268:2: iv_ruleRectangulo= ruleRectangulo EOF
            {
             newCompositeNode(grammarAccess.getRectanguloRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRectangulo=ruleRectangulo();

            state._fsp--;

             current =iv_ruleRectangulo; 
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
    // $ANTLR end "entryRuleRectangulo"


    // $ANTLR start "ruleRectangulo"
    // InternalDibujos1.g:274:1: ruleRectangulo returns [EObject current=null] : (otherlv_0= 'R' ( (lv_x1_1_0= RULE_INT ) ) ( (lv_y1_2_0= RULE_INT ) ) ( (lv_x2_3_0= RULE_INT ) ) ( (lv_y2_4_0= RULE_INT ) ) ( (lv_x3_5_0= RULE_INT ) ) ( (lv_y3_6_0= RULE_INT ) ) ( (lv_x4_7_0= RULE_INT ) ) ( (lv_y4_8_0= RULE_INT ) ) ) ;
    public final EObject ruleRectangulo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x1_1_0=null;
        Token lv_y1_2_0=null;
        Token lv_x2_3_0=null;
        Token lv_y2_4_0=null;
        Token lv_x3_5_0=null;
        Token lv_y3_6_0=null;
        Token lv_x4_7_0=null;
        Token lv_y4_8_0=null;


        	enterRule();

        try {
            // InternalDibujos1.g:280:2: ( (otherlv_0= 'R' ( (lv_x1_1_0= RULE_INT ) ) ( (lv_y1_2_0= RULE_INT ) ) ( (lv_x2_3_0= RULE_INT ) ) ( (lv_y2_4_0= RULE_INT ) ) ( (lv_x3_5_0= RULE_INT ) ) ( (lv_y3_6_0= RULE_INT ) ) ( (lv_x4_7_0= RULE_INT ) ) ( (lv_y4_8_0= RULE_INT ) ) ) )
            // InternalDibujos1.g:281:2: (otherlv_0= 'R' ( (lv_x1_1_0= RULE_INT ) ) ( (lv_y1_2_0= RULE_INT ) ) ( (lv_x2_3_0= RULE_INT ) ) ( (lv_y2_4_0= RULE_INT ) ) ( (lv_x3_5_0= RULE_INT ) ) ( (lv_y3_6_0= RULE_INT ) ) ( (lv_x4_7_0= RULE_INT ) ) ( (lv_y4_8_0= RULE_INT ) ) )
            {
            // InternalDibujos1.g:281:2: (otherlv_0= 'R' ( (lv_x1_1_0= RULE_INT ) ) ( (lv_y1_2_0= RULE_INT ) ) ( (lv_x2_3_0= RULE_INT ) ) ( (lv_y2_4_0= RULE_INT ) ) ( (lv_x3_5_0= RULE_INT ) ) ( (lv_y3_6_0= RULE_INT ) ) ( (lv_x4_7_0= RULE_INT ) ) ( (lv_y4_8_0= RULE_INT ) ) )
            // InternalDibujos1.g:282:3: otherlv_0= 'R' ( (lv_x1_1_0= RULE_INT ) ) ( (lv_y1_2_0= RULE_INT ) ) ( (lv_x2_3_0= RULE_INT ) ) ( (lv_y2_4_0= RULE_INT ) ) ( (lv_x3_5_0= RULE_INT ) ) ( (lv_y3_6_0= RULE_INT ) ) ( (lv_x4_7_0= RULE_INT ) ) ( (lv_y4_8_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRectanguloAccess().getRKeyword_0());
            		
            // InternalDibujos1.g:286:3: ( (lv_x1_1_0= RULE_INT ) )
            // InternalDibujos1.g:287:4: (lv_x1_1_0= RULE_INT )
            {
            // InternalDibujos1.g:287:4: (lv_x1_1_0= RULE_INT )
            // InternalDibujos1.g:288:5: lv_x1_1_0= RULE_INT
            {
            lv_x1_1_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_x1_1_0, grammarAccess.getRectanguloAccess().getX1INTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRectanguloRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x1",
            						lv_x1_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDibujos1.g:304:3: ( (lv_y1_2_0= RULE_INT ) )
            // InternalDibujos1.g:305:4: (lv_y1_2_0= RULE_INT )
            {
            // InternalDibujos1.g:305:4: (lv_y1_2_0= RULE_INT )
            // InternalDibujos1.g:306:5: lv_y1_2_0= RULE_INT
            {
            lv_y1_2_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_y1_2_0, grammarAccess.getRectanguloAccess().getY1INTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRectanguloRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y1",
            						lv_y1_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDibujos1.g:322:3: ( (lv_x2_3_0= RULE_INT ) )
            // InternalDibujos1.g:323:4: (lv_x2_3_0= RULE_INT )
            {
            // InternalDibujos1.g:323:4: (lv_x2_3_0= RULE_INT )
            // InternalDibujos1.g:324:5: lv_x2_3_0= RULE_INT
            {
            lv_x2_3_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_x2_3_0, grammarAccess.getRectanguloAccess().getX2INTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRectanguloRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x2",
            						lv_x2_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDibujos1.g:340:3: ( (lv_y2_4_0= RULE_INT ) )
            // InternalDibujos1.g:341:4: (lv_y2_4_0= RULE_INT )
            {
            // InternalDibujos1.g:341:4: (lv_y2_4_0= RULE_INT )
            // InternalDibujos1.g:342:5: lv_y2_4_0= RULE_INT
            {
            lv_y2_4_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_y2_4_0, grammarAccess.getRectanguloAccess().getY2INTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRectanguloRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y2",
            						lv_y2_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDibujos1.g:358:3: ( (lv_x3_5_0= RULE_INT ) )
            // InternalDibujos1.g:359:4: (lv_x3_5_0= RULE_INT )
            {
            // InternalDibujos1.g:359:4: (lv_x3_5_0= RULE_INT )
            // InternalDibujos1.g:360:5: lv_x3_5_0= RULE_INT
            {
            lv_x3_5_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_x3_5_0, grammarAccess.getRectanguloAccess().getX3INTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRectanguloRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x3",
            						lv_x3_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDibujos1.g:376:3: ( (lv_y3_6_0= RULE_INT ) )
            // InternalDibujos1.g:377:4: (lv_y3_6_0= RULE_INT )
            {
            // InternalDibujos1.g:377:4: (lv_y3_6_0= RULE_INT )
            // InternalDibujos1.g:378:5: lv_y3_6_0= RULE_INT
            {
            lv_y3_6_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_y3_6_0, grammarAccess.getRectanguloAccess().getY3INTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRectanguloRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y3",
            						lv_y3_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDibujos1.g:394:3: ( (lv_x4_7_0= RULE_INT ) )
            // InternalDibujos1.g:395:4: (lv_x4_7_0= RULE_INT )
            {
            // InternalDibujos1.g:395:4: (lv_x4_7_0= RULE_INT )
            // InternalDibujos1.g:396:5: lv_x4_7_0= RULE_INT
            {
            lv_x4_7_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_x4_7_0, grammarAccess.getRectanguloAccess().getX4INTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRectanguloRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x4",
            						lv_x4_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDibujos1.g:412:3: ( (lv_y4_8_0= RULE_INT ) )
            // InternalDibujos1.g:413:4: (lv_y4_8_0= RULE_INT )
            {
            // InternalDibujos1.g:413:4: (lv_y4_8_0= RULE_INT )
            // InternalDibujos1.g:414:5: lv_y4_8_0= RULE_INT
            {
            lv_y4_8_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_y4_8_0, grammarAccess.getRectanguloAccess().getY4INTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRectanguloRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y4",
            						lv_y4_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleRectangulo"


    // $ANTLR start "entryRuleLinea"
    // InternalDibujos1.g:434:1: entryRuleLinea returns [EObject current=null] : iv_ruleLinea= ruleLinea EOF ;
    public final EObject entryRuleLinea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinea = null;


        try {
            // InternalDibujos1.g:434:46: (iv_ruleLinea= ruleLinea EOF )
            // InternalDibujos1.g:435:2: iv_ruleLinea= ruleLinea EOF
            {
             newCompositeNode(grammarAccess.getLineaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinea=ruleLinea();

            state._fsp--;

             current =iv_ruleLinea; 
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
    // $ANTLR end "entryRuleLinea"


    // $ANTLR start "ruleLinea"
    // InternalDibujos1.g:441:1: ruleLinea returns [EObject current=null] : (otherlv_0= 'L' ( (lv_x1_1_0= RULE_INT ) ) ( (lv_y1_2_0= RULE_INT ) ) ( (lv_x2_3_0= RULE_INT ) ) ( (lv_y2_4_0= RULE_INT ) ) ) ;
    public final EObject ruleLinea() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x1_1_0=null;
        Token lv_y1_2_0=null;
        Token lv_x2_3_0=null;
        Token lv_y2_4_0=null;


        	enterRule();

        try {
            // InternalDibujos1.g:447:2: ( (otherlv_0= 'L' ( (lv_x1_1_0= RULE_INT ) ) ( (lv_y1_2_0= RULE_INT ) ) ( (lv_x2_3_0= RULE_INT ) ) ( (lv_y2_4_0= RULE_INT ) ) ) )
            // InternalDibujos1.g:448:2: (otherlv_0= 'L' ( (lv_x1_1_0= RULE_INT ) ) ( (lv_y1_2_0= RULE_INT ) ) ( (lv_x2_3_0= RULE_INT ) ) ( (lv_y2_4_0= RULE_INT ) ) )
            {
            // InternalDibujos1.g:448:2: (otherlv_0= 'L' ( (lv_x1_1_0= RULE_INT ) ) ( (lv_y1_2_0= RULE_INT ) ) ( (lv_x2_3_0= RULE_INT ) ) ( (lv_y2_4_0= RULE_INT ) ) )
            // InternalDibujos1.g:449:3: otherlv_0= 'L' ( (lv_x1_1_0= RULE_INT ) ) ( (lv_y1_2_0= RULE_INT ) ) ( (lv_x2_3_0= RULE_INT ) ) ( (lv_y2_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLineaAccess().getLKeyword_0());
            		
            // InternalDibujos1.g:453:3: ( (lv_x1_1_0= RULE_INT ) )
            // InternalDibujos1.g:454:4: (lv_x1_1_0= RULE_INT )
            {
            // InternalDibujos1.g:454:4: (lv_x1_1_0= RULE_INT )
            // InternalDibujos1.g:455:5: lv_x1_1_0= RULE_INT
            {
            lv_x1_1_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_x1_1_0, grammarAccess.getLineaAccess().getX1INTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x1",
            						lv_x1_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDibujos1.g:471:3: ( (lv_y1_2_0= RULE_INT ) )
            // InternalDibujos1.g:472:4: (lv_y1_2_0= RULE_INT )
            {
            // InternalDibujos1.g:472:4: (lv_y1_2_0= RULE_INT )
            // InternalDibujos1.g:473:5: lv_y1_2_0= RULE_INT
            {
            lv_y1_2_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_y1_2_0, grammarAccess.getLineaAccess().getY1INTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y1",
            						lv_y1_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDibujos1.g:489:3: ( (lv_x2_3_0= RULE_INT ) )
            // InternalDibujos1.g:490:4: (lv_x2_3_0= RULE_INT )
            {
            // InternalDibujos1.g:490:4: (lv_x2_3_0= RULE_INT )
            // InternalDibujos1.g:491:5: lv_x2_3_0= RULE_INT
            {
            lv_x2_3_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_x2_3_0, grammarAccess.getLineaAccess().getX2INTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x2",
            						lv_x2_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDibujos1.g:507:3: ( (lv_y2_4_0= RULE_INT ) )
            // InternalDibujos1.g:508:4: (lv_y2_4_0= RULE_INT )
            {
            // InternalDibujos1.g:508:4: (lv_y2_4_0= RULE_INT )
            // InternalDibujos1.g:509:5: lv_y2_4_0= RULE_INT
            {
            lv_y2_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_y2_4_0, grammarAccess.getLineaAccess().getY2INTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y2",
            						lv_y2_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleLinea"


    // $ANTLR start "entryRuleTexto"
    // InternalDibujos1.g:529:1: entryRuleTexto returns [EObject current=null] : iv_ruleTexto= ruleTexto EOF ;
    public final EObject entryRuleTexto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTexto = null;


        try {
            // InternalDibujos1.g:529:46: (iv_ruleTexto= ruleTexto EOF )
            // InternalDibujos1.g:530:2: iv_ruleTexto= ruleTexto EOF
            {
             newCompositeNode(grammarAccess.getTextoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTexto=ruleTexto();

            state._fsp--;

             current =iv_ruleTexto; 
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
    // $ANTLR end "entryRuleTexto"


    // $ANTLR start "ruleTexto"
    // InternalDibujos1.g:536:1: ruleTexto returns [EObject current=null] : (otherlv_0= 'T' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_texto_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleTexto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token lv_y_2_0=null;
        Token lv_texto_3_0=null;


        	enterRule();

        try {
            // InternalDibujos1.g:542:2: ( (otherlv_0= 'T' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_texto_3_0= RULE_STRING ) ) ) )
            // InternalDibujos1.g:543:2: (otherlv_0= 'T' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_texto_3_0= RULE_STRING ) ) )
            {
            // InternalDibujos1.g:543:2: (otherlv_0= 'T' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_texto_3_0= RULE_STRING ) ) )
            // InternalDibujos1.g:544:3: otherlv_0= 'T' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_texto_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTextoAccess().getTKeyword_0());
            		
            // InternalDibujos1.g:548:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalDibujos1.g:549:4: (lv_x_1_0= RULE_INT )
            {
            // InternalDibujos1.g:549:4: (lv_x_1_0= RULE_INT )
            // InternalDibujos1.g:550:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_x_1_0, grammarAccess.getTextoAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDibujos1.g:566:3: ( (lv_y_2_0= RULE_INT ) )
            // InternalDibujos1.g:567:4: (lv_y_2_0= RULE_INT )
            {
            // InternalDibujos1.g:567:4: (lv_y_2_0= RULE_INT )
            // InternalDibujos1.g:568:5: lv_y_2_0= RULE_INT
            {
            lv_y_2_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            					newLeafNode(lv_y_2_0, grammarAccess.getTextoAccess().getYINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDibujos1.g:584:3: ( (lv_texto_3_0= RULE_STRING ) )
            // InternalDibujos1.g:585:4: (lv_texto_3_0= RULE_STRING )
            {
            // InternalDibujos1.g:585:4: (lv_texto_3_0= RULE_STRING )
            // InternalDibujos1.g:586:5: lv_texto_3_0= RULE_STRING
            {
            lv_texto_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_texto_3_0, grammarAccess.getTextoAccess().getTextoSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texto",
            						lv_texto_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


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
    // $ANTLR end "ruleTexto"


    // $ANTLR start "entryRulePunto"
    // InternalDibujos1.g:606:1: entryRulePunto returns [EObject current=null] : iv_rulePunto= rulePunto EOF ;
    public final EObject entryRulePunto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePunto = null;


        try {
            // InternalDibujos1.g:606:46: (iv_rulePunto= rulePunto EOF )
            // InternalDibujos1.g:607:2: iv_rulePunto= rulePunto EOF
            {
             newCompositeNode(grammarAccess.getPuntoRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePunto=rulePunto();

            state._fsp--;

             current =iv_rulePunto; 
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
    // $ANTLR end "entryRulePunto"


    // $ANTLR start "rulePunto"
    // InternalDibujos1.g:613:1: rulePunto returns [EObject current=null] : (otherlv_0= 'P' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ) ;
    public final EObject rulePunto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token lv_y_2_0=null;


        	enterRule();

        try {
            // InternalDibujos1.g:619:2: ( (otherlv_0= 'P' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ) )
            // InternalDibujos1.g:620:2: (otherlv_0= 'P' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) )
            {
            // InternalDibujos1.g:620:2: (otherlv_0= 'P' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) )
            // InternalDibujos1.g:621:3: otherlv_0= 'P' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPuntoAccess().getPKeyword_0());
            		
            // InternalDibujos1.g:625:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalDibujos1.g:626:4: (lv_x_1_0= RULE_INT )
            {
            // InternalDibujos1.g:626:4: (lv_x_1_0= RULE_INT )
            // InternalDibujos1.g:627:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_x_1_0, grammarAccess.getPuntoAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPuntoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDibujos1.g:643:3: ( (lv_y_2_0= RULE_INT ) )
            // InternalDibujos1.g:644:4: (lv_y_2_0= RULE_INT )
            {
            // InternalDibujos1.g:644:4: (lv_y_2_0= RULE_INT )
            // InternalDibujos1.g:645:5: lv_y_2_0= RULE_INT
            {
            lv_y_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_y_2_0, grammarAccess.getPuntoAccess().getYINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPuntoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "rulePunto"


    // $ANTLR start "entryRuleColor"
    // InternalDibujos1.g:665:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalDibujos1.g:665:46: (iv_ruleColor= ruleColor EOF )
            // InternalDibujos1.g:666:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalDibujos1.g:672:1: ruleColor returns [EObject current=null] : ( (otherlv_0= 'SC' | otherlv_1= 'FC' | otherlv_2= 'BG' ) ( (lv_color_3_0= RULE_HEXCOLOR ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_color_3_0=null;


        	enterRule();

        try {
            // InternalDibujos1.g:678:2: ( ( (otherlv_0= 'SC' | otherlv_1= 'FC' | otherlv_2= 'BG' ) ( (lv_color_3_0= RULE_HEXCOLOR ) ) ) )
            // InternalDibujos1.g:679:2: ( (otherlv_0= 'SC' | otherlv_1= 'FC' | otherlv_2= 'BG' ) ( (lv_color_3_0= RULE_HEXCOLOR ) ) )
            {
            // InternalDibujos1.g:679:2: ( (otherlv_0= 'SC' | otherlv_1= 'FC' | otherlv_2= 'BG' ) ( (lv_color_3_0= RULE_HEXCOLOR ) ) )
            // InternalDibujos1.g:680:3: (otherlv_0= 'SC' | otherlv_1= 'FC' | otherlv_2= 'BG' ) ( (lv_color_3_0= RULE_HEXCOLOR ) )
            {
            // InternalDibujos1.g:680:3: (otherlv_0= 'SC' | otherlv_1= 'FC' | otherlv_2= 'BG' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDibujos1.g:681:4: otherlv_0= 'SC'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getColorAccess().getSCKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDibujos1.g:686:4: otherlv_1= 'FC'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getColorAccess().getFCKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDibujos1.g:691:4: otherlv_2= 'BG'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getColorAccess().getBGKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalDibujos1.g:696:3: ( (lv_color_3_0= RULE_HEXCOLOR ) )
            // InternalDibujos1.g:697:4: (lv_color_3_0= RULE_HEXCOLOR )
            {
            // InternalDibujos1.g:697:4: (lv_color_3_0= RULE_HEXCOLOR )
            // InternalDibujos1.g:698:5: lv_color_3_0= RULE_HEXCOLOR
            {
            lv_color_3_0=(Token)match(input,RULE_HEXCOLOR,FOLLOW_2); 

            					newLeafNode(lv_color_3_0, grammarAccess.getColorAccess().getColorHEXCOLORTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"color",
            						lv_color_3_0,
            						"org.xtext.example.dibujos1.Dibujos1.HEXCOLOR");
            				

            }


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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleEstilo"
    // InternalDibujos1.g:718:1: entryRuleEstilo returns [EObject current=null] : iv_ruleEstilo= ruleEstilo EOF ;
    public final EObject entryRuleEstilo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEstilo = null;


        try {
            // InternalDibujos1.g:718:47: (iv_ruleEstilo= ruleEstilo EOF )
            // InternalDibujos1.g:719:2: iv_ruleEstilo= ruleEstilo EOF
            {
             newCompositeNode(grammarAccess.getEstiloRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEstilo=ruleEstilo();

            state._fsp--;

             current =iv_ruleEstilo; 
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
    // $ANTLR end "entryRuleEstilo"


    // $ANTLR start "ruleEstilo"
    // InternalDibujos1.g:725:1: ruleEstilo returns [EObject current=null] : (otherlv_0= 'SW' ( (lv_valor_1_0= RULE_INT ) ) ) ;
    public final EObject ruleEstilo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_valor_1_0=null;


        	enterRule();

        try {
            // InternalDibujos1.g:731:2: ( (otherlv_0= 'SW' ( (lv_valor_1_0= RULE_INT ) ) ) )
            // InternalDibujos1.g:732:2: (otherlv_0= 'SW' ( (lv_valor_1_0= RULE_INT ) ) )
            {
            // InternalDibujos1.g:732:2: (otherlv_0= 'SW' ( (lv_valor_1_0= RULE_INT ) ) )
            // InternalDibujos1.g:733:3: otherlv_0= 'SW' ( (lv_valor_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEstiloAccess().getSWKeyword_0());
            		
            // InternalDibujos1.g:737:3: ( (lv_valor_1_0= RULE_INT ) )
            // InternalDibujos1.g:738:4: (lv_valor_1_0= RULE_INT )
            {
            // InternalDibujos1.g:738:4: (lv_valor_1_0= RULE_INT )
            // InternalDibujos1.g:739:5: lv_valor_1_0= RULE_INT
            {
            lv_valor_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_valor_1_0, grammarAccess.getEstiloAccess().getValorINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEstiloRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valor",
            						lv_valor_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleEstilo"


    // $ANTLR start "entryRuleFuente"
    // InternalDibujos1.g:759:1: entryRuleFuente returns [EObject current=null] : iv_ruleFuente= ruleFuente EOF ;
    public final EObject entryRuleFuente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuente = null;


        try {
            // InternalDibujos1.g:759:47: (iv_ruleFuente= ruleFuente EOF )
            // InternalDibujos1.g:760:2: iv_ruleFuente= ruleFuente EOF
            {
             newCompositeNode(grammarAccess.getFuenteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuente=ruleFuente();

            state._fsp--;

             current =iv_ruleFuente; 
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
    // $ANTLR end "entryRuleFuente"


    // $ANTLR start "ruleFuente"
    // InternalDibujos1.g:766:1: ruleFuente returns [EObject current=null] : (otherlv_0= 'FS' ( (lv_valor_1_0= RULE_INT ) ) ) ;
    public final EObject ruleFuente() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_valor_1_0=null;


        	enterRule();

        try {
            // InternalDibujos1.g:772:2: ( (otherlv_0= 'FS' ( (lv_valor_1_0= RULE_INT ) ) ) )
            // InternalDibujos1.g:773:2: (otherlv_0= 'FS' ( (lv_valor_1_0= RULE_INT ) ) )
            {
            // InternalDibujos1.g:773:2: (otherlv_0= 'FS' ( (lv_valor_1_0= RULE_INT ) ) )
            // InternalDibujos1.g:774:3: otherlv_0= 'FS' ( (lv_valor_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFuenteAccess().getFSKeyword_0());
            		
            // InternalDibujos1.g:778:3: ( (lv_valor_1_0= RULE_INT ) )
            // InternalDibujos1.g:779:4: (lv_valor_1_0= RULE_INT )
            {
            // InternalDibujos1.g:779:4: (lv_valor_1_0= RULE_INT )
            // InternalDibujos1.g:780:5: lv_valor_1_0= RULE_INT
            {
            lv_valor_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_valor_1_0, grammarAccess.getFuenteAccess().getValorINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuenteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valor",
            						lv_valor_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleFuente"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000003FF002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});

}