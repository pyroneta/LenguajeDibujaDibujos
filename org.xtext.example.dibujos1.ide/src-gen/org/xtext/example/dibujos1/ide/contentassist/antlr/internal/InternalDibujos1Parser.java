package org.xtext.example.dibujos1.ide.contentassist.antlr.internal;

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
import org.xtext.example.dibujos1.services.Dibujos1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDibujos1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_HEXCOLOR", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SC'", "'FC'", "'BG'", "'C'", "'R'", "'L'", "'T'", "'P'", "'SW'", "'FS'"
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

    	public void setGrammarAccess(Dibujos1GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModelo"
    // InternalDibujos1.g:53:1: entryRuleModelo : ruleModelo EOF ;
    public final void entryRuleModelo() throws RecognitionException {
        try {
            // InternalDibujos1.g:54:1: ( ruleModelo EOF )
            // InternalDibujos1.g:55:1: ruleModelo EOF
            {
             before(grammarAccess.getModeloRule()); 
            pushFollow(FOLLOW_1);
            ruleModelo();

            state._fsp--;

             after(grammarAccess.getModeloRule()); 
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
    // $ANTLR end "entryRuleModelo"


    // $ANTLR start "ruleModelo"
    // InternalDibujos1.g:62:1: ruleModelo : ( ( rule__Modelo__InstruccionesAssignment )* ) ;
    public final void ruleModelo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:66:2: ( ( ( rule__Modelo__InstruccionesAssignment )* ) )
            // InternalDibujos1.g:67:2: ( ( rule__Modelo__InstruccionesAssignment )* )
            {
            // InternalDibujos1.g:67:2: ( ( rule__Modelo__InstruccionesAssignment )* )
            // InternalDibujos1.g:68:3: ( rule__Modelo__InstruccionesAssignment )*
            {
             before(grammarAccess.getModeloAccess().getInstruccionesAssignment()); 
            // InternalDibujos1.g:69:3: ( rule__Modelo__InstruccionesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDibujos1.g:69:4: rule__Modelo__InstruccionesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Modelo__InstruccionesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModeloAccess().getInstruccionesAssignment()); 

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
    // $ANTLR end "ruleModelo"


    // $ANTLR start "entryRuleInstruccion"
    // InternalDibujos1.g:78:1: entryRuleInstruccion : ruleInstruccion EOF ;
    public final void entryRuleInstruccion() throws RecognitionException {
        try {
            // InternalDibujos1.g:79:1: ( ruleInstruccion EOF )
            // InternalDibujos1.g:80:1: ruleInstruccion EOF
            {
             before(grammarAccess.getInstruccionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruccion();

            state._fsp--;

             after(grammarAccess.getInstruccionRule()); 
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
    // $ANTLR end "entryRuleInstruccion"


    // $ANTLR start "ruleInstruccion"
    // InternalDibujos1.g:87:1: ruleInstruccion : ( ( rule__Instruccion__Alternatives ) ) ;
    public final void ruleInstruccion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:91:2: ( ( ( rule__Instruccion__Alternatives ) ) )
            // InternalDibujos1.g:92:2: ( ( rule__Instruccion__Alternatives ) )
            {
            // InternalDibujos1.g:92:2: ( ( rule__Instruccion__Alternatives ) )
            // InternalDibujos1.g:93:3: ( rule__Instruccion__Alternatives )
            {
             before(grammarAccess.getInstruccionAccess().getAlternatives()); 
            // InternalDibujos1.g:94:3: ( rule__Instruccion__Alternatives )
            // InternalDibujos1.g:94:4: rule__Instruccion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstruccionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInstruccion"


    // $ANTLR start "entryRuleCirculo"
    // InternalDibujos1.g:103:1: entryRuleCirculo : ruleCirculo EOF ;
    public final void entryRuleCirculo() throws RecognitionException {
        try {
            // InternalDibujos1.g:104:1: ( ruleCirculo EOF )
            // InternalDibujos1.g:105:1: ruleCirculo EOF
            {
             before(grammarAccess.getCirculoRule()); 
            pushFollow(FOLLOW_1);
            ruleCirculo();

            state._fsp--;

             after(grammarAccess.getCirculoRule()); 
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
    // $ANTLR end "entryRuleCirculo"


    // $ANTLR start "ruleCirculo"
    // InternalDibujos1.g:112:1: ruleCirculo : ( ( rule__Circulo__Group__0 ) ) ;
    public final void ruleCirculo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:116:2: ( ( ( rule__Circulo__Group__0 ) ) )
            // InternalDibujos1.g:117:2: ( ( rule__Circulo__Group__0 ) )
            {
            // InternalDibujos1.g:117:2: ( ( rule__Circulo__Group__0 ) )
            // InternalDibujos1.g:118:3: ( rule__Circulo__Group__0 )
            {
             before(grammarAccess.getCirculoAccess().getGroup()); 
            // InternalDibujos1.g:119:3: ( rule__Circulo__Group__0 )
            // InternalDibujos1.g:119:4: rule__Circulo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Circulo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCirculoAccess().getGroup()); 

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
    // $ANTLR end "ruleCirculo"


    // $ANTLR start "entryRuleRectangulo"
    // InternalDibujos1.g:128:1: entryRuleRectangulo : ruleRectangulo EOF ;
    public final void entryRuleRectangulo() throws RecognitionException {
        try {
            // InternalDibujos1.g:129:1: ( ruleRectangulo EOF )
            // InternalDibujos1.g:130:1: ruleRectangulo EOF
            {
             before(grammarAccess.getRectanguloRule()); 
            pushFollow(FOLLOW_1);
            ruleRectangulo();

            state._fsp--;

             after(grammarAccess.getRectanguloRule()); 
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
    // $ANTLR end "entryRuleRectangulo"


    // $ANTLR start "ruleRectangulo"
    // InternalDibujos1.g:137:1: ruleRectangulo : ( ( rule__Rectangulo__Group__0 ) ) ;
    public final void ruleRectangulo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:141:2: ( ( ( rule__Rectangulo__Group__0 ) ) )
            // InternalDibujos1.g:142:2: ( ( rule__Rectangulo__Group__0 ) )
            {
            // InternalDibujos1.g:142:2: ( ( rule__Rectangulo__Group__0 ) )
            // InternalDibujos1.g:143:3: ( rule__Rectangulo__Group__0 )
            {
             before(grammarAccess.getRectanguloAccess().getGroup()); 
            // InternalDibujos1.g:144:3: ( rule__Rectangulo__Group__0 )
            // InternalDibujos1.g:144:4: rule__Rectangulo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rectangulo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRectanguloAccess().getGroup()); 

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
    // $ANTLR end "ruleRectangulo"


    // $ANTLR start "entryRuleLinea"
    // InternalDibujos1.g:153:1: entryRuleLinea : ruleLinea EOF ;
    public final void entryRuleLinea() throws RecognitionException {
        try {
            // InternalDibujos1.g:154:1: ( ruleLinea EOF )
            // InternalDibujos1.g:155:1: ruleLinea EOF
            {
             before(grammarAccess.getLineaRule()); 
            pushFollow(FOLLOW_1);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getLineaRule()); 
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
    // $ANTLR end "entryRuleLinea"


    // $ANTLR start "ruleLinea"
    // InternalDibujos1.g:162:1: ruleLinea : ( ( rule__Linea__Group__0 ) ) ;
    public final void ruleLinea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:166:2: ( ( ( rule__Linea__Group__0 ) ) )
            // InternalDibujos1.g:167:2: ( ( rule__Linea__Group__0 ) )
            {
            // InternalDibujos1.g:167:2: ( ( rule__Linea__Group__0 ) )
            // InternalDibujos1.g:168:3: ( rule__Linea__Group__0 )
            {
             before(grammarAccess.getLineaAccess().getGroup()); 
            // InternalDibujos1.g:169:3: ( rule__Linea__Group__0 )
            // InternalDibujos1.g:169:4: rule__Linea__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Linea__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineaAccess().getGroup()); 

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
    // $ANTLR end "ruleLinea"


    // $ANTLR start "entryRuleTexto"
    // InternalDibujos1.g:178:1: entryRuleTexto : ruleTexto EOF ;
    public final void entryRuleTexto() throws RecognitionException {
        try {
            // InternalDibujos1.g:179:1: ( ruleTexto EOF )
            // InternalDibujos1.g:180:1: ruleTexto EOF
            {
             before(grammarAccess.getTextoRule()); 
            pushFollow(FOLLOW_1);
            ruleTexto();

            state._fsp--;

             after(grammarAccess.getTextoRule()); 
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
    // $ANTLR end "entryRuleTexto"


    // $ANTLR start "ruleTexto"
    // InternalDibujos1.g:187:1: ruleTexto : ( ( rule__Texto__Group__0 ) ) ;
    public final void ruleTexto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:191:2: ( ( ( rule__Texto__Group__0 ) ) )
            // InternalDibujos1.g:192:2: ( ( rule__Texto__Group__0 ) )
            {
            // InternalDibujos1.g:192:2: ( ( rule__Texto__Group__0 ) )
            // InternalDibujos1.g:193:3: ( rule__Texto__Group__0 )
            {
             before(grammarAccess.getTextoAccess().getGroup()); 
            // InternalDibujos1.g:194:3: ( rule__Texto__Group__0 )
            // InternalDibujos1.g:194:4: rule__Texto__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Texto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextoAccess().getGroup()); 

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
    // $ANTLR end "ruleTexto"


    // $ANTLR start "entryRulePunto"
    // InternalDibujos1.g:203:1: entryRulePunto : rulePunto EOF ;
    public final void entryRulePunto() throws RecognitionException {
        try {
            // InternalDibujos1.g:204:1: ( rulePunto EOF )
            // InternalDibujos1.g:205:1: rulePunto EOF
            {
             before(grammarAccess.getPuntoRule()); 
            pushFollow(FOLLOW_1);
            rulePunto();

            state._fsp--;

             after(grammarAccess.getPuntoRule()); 
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
    // $ANTLR end "entryRulePunto"


    // $ANTLR start "rulePunto"
    // InternalDibujos1.g:212:1: rulePunto : ( ( rule__Punto__Group__0 ) ) ;
    public final void rulePunto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:216:2: ( ( ( rule__Punto__Group__0 ) ) )
            // InternalDibujos1.g:217:2: ( ( rule__Punto__Group__0 ) )
            {
            // InternalDibujos1.g:217:2: ( ( rule__Punto__Group__0 ) )
            // InternalDibujos1.g:218:3: ( rule__Punto__Group__0 )
            {
             before(grammarAccess.getPuntoAccess().getGroup()); 
            // InternalDibujos1.g:219:3: ( rule__Punto__Group__0 )
            // InternalDibujos1.g:219:4: rule__Punto__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Punto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPuntoAccess().getGroup()); 

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
    // $ANTLR end "rulePunto"


    // $ANTLR start "entryRuleColor"
    // InternalDibujos1.g:228:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalDibujos1.g:229:1: ( ruleColor EOF )
            // InternalDibujos1.g:230:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalDibujos1.g:237:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:241:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalDibujos1.g:242:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalDibujos1.g:242:2: ( ( rule__Color__Group__0 ) )
            // InternalDibujos1.g:243:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalDibujos1.g:244:3: ( rule__Color__Group__0 )
            // InternalDibujos1.g:244:4: rule__Color__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleEstilo"
    // InternalDibujos1.g:253:1: entryRuleEstilo : ruleEstilo EOF ;
    public final void entryRuleEstilo() throws RecognitionException {
        try {
            // InternalDibujos1.g:254:1: ( ruleEstilo EOF )
            // InternalDibujos1.g:255:1: ruleEstilo EOF
            {
             before(grammarAccess.getEstiloRule()); 
            pushFollow(FOLLOW_1);
            ruleEstilo();

            state._fsp--;

             after(grammarAccess.getEstiloRule()); 
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
    // $ANTLR end "entryRuleEstilo"


    // $ANTLR start "ruleEstilo"
    // InternalDibujos1.g:262:1: ruleEstilo : ( ( rule__Estilo__Group__0 ) ) ;
    public final void ruleEstilo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:266:2: ( ( ( rule__Estilo__Group__0 ) ) )
            // InternalDibujos1.g:267:2: ( ( rule__Estilo__Group__0 ) )
            {
            // InternalDibujos1.g:267:2: ( ( rule__Estilo__Group__0 ) )
            // InternalDibujos1.g:268:3: ( rule__Estilo__Group__0 )
            {
             before(grammarAccess.getEstiloAccess().getGroup()); 
            // InternalDibujos1.g:269:3: ( rule__Estilo__Group__0 )
            // InternalDibujos1.g:269:4: rule__Estilo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Estilo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEstiloAccess().getGroup()); 

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
    // $ANTLR end "ruleEstilo"


    // $ANTLR start "entryRuleFuente"
    // InternalDibujos1.g:278:1: entryRuleFuente : ruleFuente EOF ;
    public final void entryRuleFuente() throws RecognitionException {
        try {
            // InternalDibujos1.g:279:1: ( ruleFuente EOF )
            // InternalDibujos1.g:280:1: ruleFuente EOF
            {
             before(grammarAccess.getFuenteRule()); 
            pushFollow(FOLLOW_1);
            ruleFuente();

            state._fsp--;

             after(grammarAccess.getFuenteRule()); 
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
    // $ANTLR end "entryRuleFuente"


    // $ANTLR start "ruleFuente"
    // InternalDibujos1.g:287:1: ruleFuente : ( ( rule__Fuente__Group__0 ) ) ;
    public final void ruleFuente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:291:2: ( ( ( rule__Fuente__Group__0 ) ) )
            // InternalDibujos1.g:292:2: ( ( rule__Fuente__Group__0 ) )
            {
            // InternalDibujos1.g:292:2: ( ( rule__Fuente__Group__0 ) )
            // InternalDibujos1.g:293:3: ( rule__Fuente__Group__0 )
            {
             before(grammarAccess.getFuenteAccess().getGroup()); 
            // InternalDibujos1.g:294:3: ( rule__Fuente__Group__0 )
            // InternalDibujos1.g:294:4: rule__Fuente__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fuente__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuenteAccess().getGroup()); 

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
    // $ANTLR end "ruleFuente"


    // $ANTLR start "rule__Instruccion__Alternatives"
    // InternalDibujos1.g:302:1: rule__Instruccion__Alternatives : ( ( ruleCirculo ) | ( ruleRectangulo ) | ( ruleLinea ) | ( ruleTexto ) | ( rulePunto ) | ( ruleColor ) | ( ruleEstilo ) | ( ruleFuente ) );
    public final void rule__Instruccion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:306:1: ( ( ruleCirculo ) | ( ruleRectangulo ) | ( ruleLinea ) | ( ruleTexto ) | ( rulePunto ) | ( ruleColor ) | ( ruleEstilo ) | ( ruleFuente ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            case 19:
                {
                alt2=5;
                }
                break;
            case 12:
            case 13:
            case 14:
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
                    // InternalDibujos1.g:307:2: ( ruleCirculo )
                    {
                    // InternalDibujos1.g:307:2: ( ruleCirculo )
                    // InternalDibujos1.g:308:3: ruleCirculo
                    {
                     before(grammarAccess.getInstruccionAccess().getCirculoParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCirculo();

                    state._fsp--;

                     after(grammarAccess.getInstruccionAccess().getCirculoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDibujos1.g:313:2: ( ruleRectangulo )
                    {
                    // InternalDibujos1.g:313:2: ( ruleRectangulo )
                    // InternalDibujos1.g:314:3: ruleRectangulo
                    {
                     before(grammarAccess.getInstruccionAccess().getRectanguloParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRectangulo();

                    state._fsp--;

                     after(grammarAccess.getInstruccionAccess().getRectanguloParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDibujos1.g:319:2: ( ruleLinea )
                    {
                    // InternalDibujos1.g:319:2: ( ruleLinea )
                    // InternalDibujos1.g:320:3: ruleLinea
                    {
                     before(grammarAccess.getInstruccionAccess().getLineaParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLinea();

                    state._fsp--;

                     after(grammarAccess.getInstruccionAccess().getLineaParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDibujos1.g:325:2: ( ruleTexto )
                    {
                    // InternalDibujos1.g:325:2: ( ruleTexto )
                    // InternalDibujos1.g:326:3: ruleTexto
                    {
                     before(grammarAccess.getInstruccionAccess().getTextoParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTexto();

                    state._fsp--;

                     after(grammarAccess.getInstruccionAccess().getTextoParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDibujos1.g:331:2: ( rulePunto )
                    {
                    // InternalDibujos1.g:331:2: ( rulePunto )
                    // InternalDibujos1.g:332:3: rulePunto
                    {
                     before(grammarAccess.getInstruccionAccess().getPuntoParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePunto();

                    state._fsp--;

                     after(grammarAccess.getInstruccionAccess().getPuntoParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDibujos1.g:337:2: ( ruleColor )
                    {
                    // InternalDibujos1.g:337:2: ( ruleColor )
                    // InternalDibujos1.g:338:3: ruleColor
                    {
                     before(grammarAccess.getInstruccionAccess().getColorParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleColor();

                    state._fsp--;

                     after(grammarAccess.getInstruccionAccess().getColorParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDibujos1.g:343:2: ( ruleEstilo )
                    {
                    // InternalDibujos1.g:343:2: ( ruleEstilo )
                    // InternalDibujos1.g:344:3: ruleEstilo
                    {
                     before(grammarAccess.getInstruccionAccess().getEstiloParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleEstilo();

                    state._fsp--;

                     after(grammarAccess.getInstruccionAccess().getEstiloParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDibujos1.g:349:2: ( ruleFuente )
                    {
                    // InternalDibujos1.g:349:2: ( ruleFuente )
                    // InternalDibujos1.g:350:3: ruleFuente
                    {
                     before(grammarAccess.getInstruccionAccess().getFuenteParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleFuente();

                    state._fsp--;

                     after(grammarAccess.getInstruccionAccess().getFuenteParserRuleCall_7()); 

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
    // $ANTLR end "rule__Instruccion__Alternatives"


    // $ANTLR start "rule__Color__Alternatives_0"
    // InternalDibujos1.g:359:1: rule__Color__Alternatives_0 : ( ( 'SC' ) | ( 'FC' ) | ( 'BG' ) );
    public final void rule__Color__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:363:1: ( ( 'SC' ) | ( 'FC' ) | ( 'BG' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
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
                    // InternalDibujos1.g:364:2: ( 'SC' )
                    {
                    // InternalDibujos1.g:364:2: ( 'SC' )
                    // InternalDibujos1.g:365:3: 'SC'
                    {
                     before(grammarAccess.getColorAccess().getSCKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getSCKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDibujos1.g:370:2: ( 'FC' )
                    {
                    // InternalDibujos1.g:370:2: ( 'FC' )
                    // InternalDibujos1.g:371:3: 'FC'
                    {
                     before(grammarAccess.getColorAccess().getFCKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getFCKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDibujos1.g:376:2: ( 'BG' )
                    {
                    // InternalDibujos1.g:376:2: ( 'BG' )
                    // InternalDibujos1.g:377:3: 'BG'
                    {
                     before(grammarAccess.getColorAccess().getBGKeyword_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getBGKeyword_0_2()); 

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
    // $ANTLR end "rule__Color__Alternatives_0"


    // $ANTLR start "rule__Circulo__Group__0"
    // InternalDibujos1.g:386:1: rule__Circulo__Group__0 : rule__Circulo__Group__0__Impl rule__Circulo__Group__1 ;
    public final void rule__Circulo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:390:1: ( rule__Circulo__Group__0__Impl rule__Circulo__Group__1 )
            // InternalDibujos1.g:391:2: rule__Circulo__Group__0__Impl rule__Circulo__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Circulo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Circulo__Group__1();

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
    // $ANTLR end "rule__Circulo__Group__0"


    // $ANTLR start "rule__Circulo__Group__0__Impl"
    // InternalDibujos1.g:398:1: rule__Circulo__Group__0__Impl : ( 'C' ) ;
    public final void rule__Circulo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:402:1: ( ( 'C' ) )
            // InternalDibujos1.g:403:1: ( 'C' )
            {
            // InternalDibujos1.g:403:1: ( 'C' )
            // InternalDibujos1.g:404:2: 'C'
            {
             before(grammarAccess.getCirculoAccess().getCKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCirculoAccess().getCKeyword_0()); 

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
    // $ANTLR end "rule__Circulo__Group__0__Impl"


    // $ANTLR start "rule__Circulo__Group__1"
    // InternalDibujos1.g:413:1: rule__Circulo__Group__1 : rule__Circulo__Group__1__Impl rule__Circulo__Group__2 ;
    public final void rule__Circulo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:417:1: ( rule__Circulo__Group__1__Impl rule__Circulo__Group__2 )
            // InternalDibujos1.g:418:2: rule__Circulo__Group__1__Impl rule__Circulo__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Circulo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Circulo__Group__2();

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
    // $ANTLR end "rule__Circulo__Group__1"


    // $ANTLR start "rule__Circulo__Group__1__Impl"
    // InternalDibujos1.g:425:1: rule__Circulo__Group__1__Impl : ( ( rule__Circulo__XAssignment_1 ) ) ;
    public final void rule__Circulo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:429:1: ( ( ( rule__Circulo__XAssignment_1 ) ) )
            // InternalDibujos1.g:430:1: ( ( rule__Circulo__XAssignment_1 ) )
            {
            // InternalDibujos1.g:430:1: ( ( rule__Circulo__XAssignment_1 ) )
            // InternalDibujos1.g:431:2: ( rule__Circulo__XAssignment_1 )
            {
             before(grammarAccess.getCirculoAccess().getXAssignment_1()); 
            // InternalDibujos1.g:432:2: ( rule__Circulo__XAssignment_1 )
            // InternalDibujos1.g:432:3: rule__Circulo__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Circulo__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCirculoAccess().getXAssignment_1()); 

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
    // $ANTLR end "rule__Circulo__Group__1__Impl"


    // $ANTLR start "rule__Circulo__Group__2"
    // InternalDibujos1.g:440:1: rule__Circulo__Group__2 : rule__Circulo__Group__2__Impl rule__Circulo__Group__3 ;
    public final void rule__Circulo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:444:1: ( rule__Circulo__Group__2__Impl rule__Circulo__Group__3 )
            // InternalDibujos1.g:445:2: rule__Circulo__Group__2__Impl rule__Circulo__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Circulo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Circulo__Group__3();

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
    // $ANTLR end "rule__Circulo__Group__2"


    // $ANTLR start "rule__Circulo__Group__2__Impl"
    // InternalDibujos1.g:452:1: rule__Circulo__Group__2__Impl : ( ( rule__Circulo__YAssignment_2 ) ) ;
    public final void rule__Circulo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:456:1: ( ( ( rule__Circulo__YAssignment_2 ) ) )
            // InternalDibujos1.g:457:1: ( ( rule__Circulo__YAssignment_2 ) )
            {
            // InternalDibujos1.g:457:1: ( ( rule__Circulo__YAssignment_2 ) )
            // InternalDibujos1.g:458:2: ( rule__Circulo__YAssignment_2 )
            {
             before(grammarAccess.getCirculoAccess().getYAssignment_2()); 
            // InternalDibujos1.g:459:2: ( rule__Circulo__YAssignment_2 )
            // InternalDibujos1.g:459:3: rule__Circulo__YAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Circulo__YAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCirculoAccess().getYAssignment_2()); 

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
    // $ANTLR end "rule__Circulo__Group__2__Impl"


    // $ANTLR start "rule__Circulo__Group__3"
    // InternalDibujos1.g:467:1: rule__Circulo__Group__3 : rule__Circulo__Group__3__Impl ;
    public final void rule__Circulo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:471:1: ( rule__Circulo__Group__3__Impl )
            // InternalDibujos1.g:472:2: rule__Circulo__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Circulo__Group__3__Impl();

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
    // $ANTLR end "rule__Circulo__Group__3"


    // $ANTLR start "rule__Circulo__Group__3__Impl"
    // InternalDibujos1.g:478:1: rule__Circulo__Group__3__Impl : ( ( rule__Circulo__RAssignment_3 ) ) ;
    public final void rule__Circulo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:482:1: ( ( ( rule__Circulo__RAssignment_3 ) ) )
            // InternalDibujos1.g:483:1: ( ( rule__Circulo__RAssignment_3 ) )
            {
            // InternalDibujos1.g:483:1: ( ( rule__Circulo__RAssignment_3 ) )
            // InternalDibujos1.g:484:2: ( rule__Circulo__RAssignment_3 )
            {
             before(grammarAccess.getCirculoAccess().getRAssignment_3()); 
            // InternalDibujos1.g:485:2: ( rule__Circulo__RAssignment_3 )
            // InternalDibujos1.g:485:3: rule__Circulo__RAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Circulo__RAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCirculoAccess().getRAssignment_3()); 

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
    // $ANTLR end "rule__Circulo__Group__3__Impl"


    // $ANTLR start "rule__Rectangulo__Group__0"
    // InternalDibujos1.g:494:1: rule__Rectangulo__Group__0 : rule__Rectangulo__Group__0__Impl rule__Rectangulo__Group__1 ;
    public final void rule__Rectangulo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:498:1: ( rule__Rectangulo__Group__0__Impl rule__Rectangulo__Group__1 )
            // InternalDibujos1.g:499:2: rule__Rectangulo__Group__0__Impl rule__Rectangulo__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Rectangulo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangulo__Group__1();

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
    // $ANTLR end "rule__Rectangulo__Group__0"


    // $ANTLR start "rule__Rectangulo__Group__0__Impl"
    // InternalDibujos1.g:506:1: rule__Rectangulo__Group__0__Impl : ( 'R' ) ;
    public final void rule__Rectangulo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:510:1: ( ( 'R' ) )
            // InternalDibujos1.g:511:1: ( 'R' )
            {
            // InternalDibujos1.g:511:1: ( 'R' )
            // InternalDibujos1.g:512:2: 'R'
            {
             before(grammarAccess.getRectanguloAccess().getRKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRectanguloAccess().getRKeyword_0()); 

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
    // $ANTLR end "rule__Rectangulo__Group__0__Impl"


    // $ANTLR start "rule__Rectangulo__Group__1"
    // InternalDibujos1.g:521:1: rule__Rectangulo__Group__1 : rule__Rectangulo__Group__1__Impl rule__Rectangulo__Group__2 ;
    public final void rule__Rectangulo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:525:1: ( rule__Rectangulo__Group__1__Impl rule__Rectangulo__Group__2 )
            // InternalDibujos1.g:526:2: rule__Rectangulo__Group__1__Impl rule__Rectangulo__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Rectangulo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangulo__Group__2();

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
    // $ANTLR end "rule__Rectangulo__Group__1"


    // $ANTLR start "rule__Rectangulo__Group__1__Impl"
    // InternalDibujos1.g:533:1: rule__Rectangulo__Group__1__Impl : ( ( rule__Rectangulo__X1Assignment_1 ) ) ;
    public final void rule__Rectangulo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:537:1: ( ( ( rule__Rectangulo__X1Assignment_1 ) ) )
            // InternalDibujos1.g:538:1: ( ( rule__Rectangulo__X1Assignment_1 ) )
            {
            // InternalDibujos1.g:538:1: ( ( rule__Rectangulo__X1Assignment_1 ) )
            // InternalDibujos1.g:539:2: ( rule__Rectangulo__X1Assignment_1 )
            {
             before(grammarAccess.getRectanguloAccess().getX1Assignment_1()); 
            // InternalDibujos1.g:540:2: ( rule__Rectangulo__X1Assignment_1 )
            // InternalDibujos1.g:540:3: rule__Rectangulo__X1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rectangulo__X1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRectanguloAccess().getX1Assignment_1()); 

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
    // $ANTLR end "rule__Rectangulo__Group__1__Impl"


    // $ANTLR start "rule__Rectangulo__Group__2"
    // InternalDibujos1.g:548:1: rule__Rectangulo__Group__2 : rule__Rectangulo__Group__2__Impl rule__Rectangulo__Group__3 ;
    public final void rule__Rectangulo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:552:1: ( rule__Rectangulo__Group__2__Impl rule__Rectangulo__Group__3 )
            // InternalDibujos1.g:553:2: rule__Rectangulo__Group__2__Impl rule__Rectangulo__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Rectangulo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangulo__Group__3();

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
    // $ANTLR end "rule__Rectangulo__Group__2"


    // $ANTLR start "rule__Rectangulo__Group__2__Impl"
    // InternalDibujos1.g:560:1: rule__Rectangulo__Group__2__Impl : ( ( rule__Rectangulo__Y1Assignment_2 ) ) ;
    public final void rule__Rectangulo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:564:1: ( ( ( rule__Rectangulo__Y1Assignment_2 ) ) )
            // InternalDibujos1.g:565:1: ( ( rule__Rectangulo__Y1Assignment_2 ) )
            {
            // InternalDibujos1.g:565:1: ( ( rule__Rectangulo__Y1Assignment_2 ) )
            // InternalDibujos1.g:566:2: ( rule__Rectangulo__Y1Assignment_2 )
            {
             before(grammarAccess.getRectanguloAccess().getY1Assignment_2()); 
            // InternalDibujos1.g:567:2: ( rule__Rectangulo__Y1Assignment_2 )
            // InternalDibujos1.g:567:3: rule__Rectangulo__Y1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rectangulo__Y1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRectanguloAccess().getY1Assignment_2()); 

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
    // $ANTLR end "rule__Rectangulo__Group__2__Impl"


    // $ANTLR start "rule__Rectangulo__Group__3"
    // InternalDibujos1.g:575:1: rule__Rectangulo__Group__3 : rule__Rectangulo__Group__3__Impl rule__Rectangulo__Group__4 ;
    public final void rule__Rectangulo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:579:1: ( rule__Rectangulo__Group__3__Impl rule__Rectangulo__Group__4 )
            // InternalDibujos1.g:580:2: rule__Rectangulo__Group__3__Impl rule__Rectangulo__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Rectangulo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangulo__Group__4();

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
    // $ANTLR end "rule__Rectangulo__Group__3"


    // $ANTLR start "rule__Rectangulo__Group__3__Impl"
    // InternalDibujos1.g:587:1: rule__Rectangulo__Group__3__Impl : ( ( rule__Rectangulo__X2Assignment_3 ) ) ;
    public final void rule__Rectangulo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:591:1: ( ( ( rule__Rectangulo__X2Assignment_3 ) ) )
            // InternalDibujos1.g:592:1: ( ( rule__Rectangulo__X2Assignment_3 ) )
            {
            // InternalDibujos1.g:592:1: ( ( rule__Rectangulo__X2Assignment_3 ) )
            // InternalDibujos1.g:593:2: ( rule__Rectangulo__X2Assignment_3 )
            {
             before(grammarAccess.getRectanguloAccess().getX2Assignment_3()); 
            // InternalDibujos1.g:594:2: ( rule__Rectangulo__X2Assignment_3 )
            // InternalDibujos1.g:594:3: rule__Rectangulo__X2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rectangulo__X2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRectanguloAccess().getX2Assignment_3()); 

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
    // $ANTLR end "rule__Rectangulo__Group__3__Impl"


    // $ANTLR start "rule__Rectangulo__Group__4"
    // InternalDibujos1.g:602:1: rule__Rectangulo__Group__4 : rule__Rectangulo__Group__4__Impl rule__Rectangulo__Group__5 ;
    public final void rule__Rectangulo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:606:1: ( rule__Rectangulo__Group__4__Impl rule__Rectangulo__Group__5 )
            // InternalDibujos1.g:607:2: rule__Rectangulo__Group__4__Impl rule__Rectangulo__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Rectangulo__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangulo__Group__5();

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
    // $ANTLR end "rule__Rectangulo__Group__4"


    // $ANTLR start "rule__Rectangulo__Group__4__Impl"
    // InternalDibujos1.g:614:1: rule__Rectangulo__Group__4__Impl : ( ( rule__Rectangulo__Y2Assignment_4 ) ) ;
    public final void rule__Rectangulo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:618:1: ( ( ( rule__Rectangulo__Y2Assignment_4 ) ) )
            // InternalDibujos1.g:619:1: ( ( rule__Rectangulo__Y2Assignment_4 ) )
            {
            // InternalDibujos1.g:619:1: ( ( rule__Rectangulo__Y2Assignment_4 ) )
            // InternalDibujos1.g:620:2: ( rule__Rectangulo__Y2Assignment_4 )
            {
             before(grammarAccess.getRectanguloAccess().getY2Assignment_4()); 
            // InternalDibujos1.g:621:2: ( rule__Rectangulo__Y2Assignment_4 )
            // InternalDibujos1.g:621:3: rule__Rectangulo__Y2Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rectangulo__Y2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRectanguloAccess().getY2Assignment_4()); 

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
    // $ANTLR end "rule__Rectangulo__Group__4__Impl"


    // $ANTLR start "rule__Rectangulo__Group__5"
    // InternalDibujos1.g:629:1: rule__Rectangulo__Group__5 : rule__Rectangulo__Group__5__Impl rule__Rectangulo__Group__6 ;
    public final void rule__Rectangulo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:633:1: ( rule__Rectangulo__Group__5__Impl rule__Rectangulo__Group__6 )
            // InternalDibujos1.g:634:2: rule__Rectangulo__Group__5__Impl rule__Rectangulo__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Rectangulo__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangulo__Group__6();

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
    // $ANTLR end "rule__Rectangulo__Group__5"


    // $ANTLR start "rule__Rectangulo__Group__5__Impl"
    // InternalDibujos1.g:641:1: rule__Rectangulo__Group__5__Impl : ( ( rule__Rectangulo__X3Assignment_5 ) ) ;
    public final void rule__Rectangulo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:645:1: ( ( ( rule__Rectangulo__X3Assignment_5 ) ) )
            // InternalDibujos1.g:646:1: ( ( rule__Rectangulo__X3Assignment_5 ) )
            {
            // InternalDibujos1.g:646:1: ( ( rule__Rectangulo__X3Assignment_5 ) )
            // InternalDibujos1.g:647:2: ( rule__Rectangulo__X3Assignment_5 )
            {
             before(grammarAccess.getRectanguloAccess().getX3Assignment_5()); 
            // InternalDibujos1.g:648:2: ( rule__Rectangulo__X3Assignment_5 )
            // InternalDibujos1.g:648:3: rule__Rectangulo__X3Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Rectangulo__X3Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRectanguloAccess().getX3Assignment_5()); 

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
    // $ANTLR end "rule__Rectangulo__Group__5__Impl"


    // $ANTLR start "rule__Rectangulo__Group__6"
    // InternalDibujos1.g:656:1: rule__Rectangulo__Group__6 : rule__Rectangulo__Group__6__Impl rule__Rectangulo__Group__7 ;
    public final void rule__Rectangulo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:660:1: ( rule__Rectangulo__Group__6__Impl rule__Rectangulo__Group__7 )
            // InternalDibujos1.g:661:2: rule__Rectangulo__Group__6__Impl rule__Rectangulo__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Rectangulo__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangulo__Group__7();

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
    // $ANTLR end "rule__Rectangulo__Group__6"


    // $ANTLR start "rule__Rectangulo__Group__6__Impl"
    // InternalDibujos1.g:668:1: rule__Rectangulo__Group__6__Impl : ( ( rule__Rectangulo__Y3Assignment_6 ) ) ;
    public final void rule__Rectangulo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:672:1: ( ( ( rule__Rectangulo__Y3Assignment_6 ) ) )
            // InternalDibujos1.g:673:1: ( ( rule__Rectangulo__Y3Assignment_6 ) )
            {
            // InternalDibujos1.g:673:1: ( ( rule__Rectangulo__Y3Assignment_6 ) )
            // InternalDibujos1.g:674:2: ( rule__Rectangulo__Y3Assignment_6 )
            {
             before(grammarAccess.getRectanguloAccess().getY3Assignment_6()); 
            // InternalDibujos1.g:675:2: ( rule__Rectangulo__Y3Assignment_6 )
            // InternalDibujos1.g:675:3: rule__Rectangulo__Y3Assignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Rectangulo__Y3Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRectanguloAccess().getY3Assignment_6()); 

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
    // $ANTLR end "rule__Rectangulo__Group__6__Impl"


    // $ANTLR start "rule__Rectangulo__Group__7"
    // InternalDibujos1.g:683:1: rule__Rectangulo__Group__7 : rule__Rectangulo__Group__7__Impl rule__Rectangulo__Group__8 ;
    public final void rule__Rectangulo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:687:1: ( rule__Rectangulo__Group__7__Impl rule__Rectangulo__Group__8 )
            // InternalDibujos1.g:688:2: rule__Rectangulo__Group__7__Impl rule__Rectangulo__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Rectangulo__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangulo__Group__8();

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
    // $ANTLR end "rule__Rectangulo__Group__7"


    // $ANTLR start "rule__Rectangulo__Group__7__Impl"
    // InternalDibujos1.g:695:1: rule__Rectangulo__Group__7__Impl : ( ( rule__Rectangulo__X4Assignment_7 ) ) ;
    public final void rule__Rectangulo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:699:1: ( ( ( rule__Rectangulo__X4Assignment_7 ) ) )
            // InternalDibujos1.g:700:1: ( ( rule__Rectangulo__X4Assignment_7 ) )
            {
            // InternalDibujos1.g:700:1: ( ( rule__Rectangulo__X4Assignment_7 ) )
            // InternalDibujos1.g:701:2: ( rule__Rectangulo__X4Assignment_7 )
            {
             before(grammarAccess.getRectanguloAccess().getX4Assignment_7()); 
            // InternalDibujos1.g:702:2: ( rule__Rectangulo__X4Assignment_7 )
            // InternalDibujos1.g:702:3: rule__Rectangulo__X4Assignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Rectangulo__X4Assignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRectanguloAccess().getX4Assignment_7()); 

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
    // $ANTLR end "rule__Rectangulo__Group__7__Impl"


    // $ANTLR start "rule__Rectangulo__Group__8"
    // InternalDibujos1.g:710:1: rule__Rectangulo__Group__8 : rule__Rectangulo__Group__8__Impl ;
    public final void rule__Rectangulo__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:714:1: ( rule__Rectangulo__Group__8__Impl )
            // InternalDibujos1.g:715:2: rule__Rectangulo__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rectangulo__Group__8__Impl();

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
    // $ANTLR end "rule__Rectangulo__Group__8"


    // $ANTLR start "rule__Rectangulo__Group__8__Impl"
    // InternalDibujos1.g:721:1: rule__Rectangulo__Group__8__Impl : ( ( rule__Rectangulo__Y4Assignment_8 ) ) ;
    public final void rule__Rectangulo__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:725:1: ( ( ( rule__Rectangulo__Y4Assignment_8 ) ) )
            // InternalDibujos1.g:726:1: ( ( rule__Rectangulo__Y4Assignment_8 ) )
            {
            // InternalDibujos1.g:726:1: ( ( rule__Rectangulo__Y4Assignment_8 ) )
            // InternalDibujos1.g:727:2: ( rule__Rectangulo__Y4Assignment_8 )
            {
             before(grammarAccess.getRectanguloAccess().getY4Assignment_8()); 
            // InternalDibujos1.g:728:2: ( rule__Rectangulo__Y4Assignment_8 )
            // InternalDibujos1.g:728:3: rule__Rectangulo__Y4Assignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Rectangulo__Y4Assignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRectanguloAccess().getY4Assignment_8()); 

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
    // $ANTLR end "rule__Rectangulo__Group__8__Impl"


    // $ANTLR start "rule__Linea__Group__0"
    // InternalDibujos1.g:737:1: rule__Linea__Group__0 : rule__Linea__Group__0__Impl rule__Linea__Group__1 ;
    public final void rule__Linea__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:741:1: ( rule__Linea__Group__0__Impl rule__Linea__Group__1 )
            // InternalDibujos1.g:742:2: rule__Linea__Group__0__Impl rule__Linea__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Linea__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Linea__Group__1();

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
    // $ANTLR end "rule__Linea__Group__0"


    // $ANTLR start "rule__Linea__Group__0__Impl"
    // InternalDibujos1.g:749:1: rule__Linea__Group__0__Impl : ( 'L' ) ;
    public final void rule__Linea__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:753:1: ( ( 'L' ) )
            // InternalDibujos1.g:754:1: ( 'L' )
            {
            // InternalDibujos1.g:754:1: ( 'L' )
            // InternalDibujos1.g:755:2: 'L'
            {
             before(grammarAccess.getLineaAccess().getLKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLineaAccess().getLKeyword_0()); 

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
    // $ANTLR end "rule__Linea__Group__0__Impl"


    // $ANTLR start "rule__Linea__Group__1"
    // InternalDibujos1.g:764:1: rule__Linea__Group__1 : rule__Linea__Group__1__Impl rule__Linea__Group__2 ;
    public final void rule__Linea__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:768:1: ( rule__Linea__Group__1__Impl rule__Linea__Group__2 )
            // InternalDibujos1.g:769:2: rule__Linea__Group__1__Impl rule__Linea__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Linea__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Linea__Group__2();

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
    // $ANTLR end "rule__Linea__Group__1"


    // $ANTLR start "rule__Linea__Group__1__Impl"
    // InternalDibujos1.g:776:1: rule__Linea__Group__1__Impl : ( ( rule__Linea__X1Assignment_1 ) ) ;
    public final void rule__Linea__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:780:1: ( ( ( rule__Linea__X1Assignment_1 ) ) )
            // InternalDibujos1.g:781:1: ( ( rule__Linea__X1Assignment_1 ) )
            {
            // InternalDibujos1.g:781:1: ( ( rule__Linea__X1Assignment_1 ) )
            // InternalDibujos1.g:782:2: ( rule__Linea__X1Assignment_1 )
            {
             before(grammarAccess.getLineaAccess().getX1Assignment_1()); 
            // InternalDibujos1.g:783:2: ( rule__Linea__X1Assignment_1 )
            // InternalDibujos1.g:783:3: rule__Linea__X1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Linea__X1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLineaAccess().getX1Assignment_1()); 

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
    // $ANTLR end "rule__Linea__Group__1__Impl"


    // $ANTLR start "rule__Linea__Group__2"
    // InternalDibujos1.g:791:1: rule__Linea__Group__2 : rule__Linea__Group__2__Impl rule__Linea__Group__3 ;
    public final void rule__Linea__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:795:1: ( rule__Linea__Group__2__Impl rule__Linea__Group__3 )
            // InternalDibujos1.g:796:2: rule__Linea__Group__2__Impl rule__Linea__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Linea__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Linea__Group__3();

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
    // $ANTLR end "rule__Linea__Group__2"


    // $ANTLR start "rule__Linea__Group__2__Impl"
    // InternalDibujos1.g:803:1: rule__Linea__Group__2__Impl : ( ( rule__Linea__Y1Assignment_2 ) ) ;
    public final void rule__Linea__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:807:1: ( ( ( rule__Linea__Y1Assignment_2 ) ) )
            // InternalDibujos1.g:808:1: ( ( rule__Linea__Y1Assignment_2 ) )
            {
            // InternalDibujos1.g:808:1: ( ( rule__Linea__Y1Assignment_2 ) )
            // InternalDibujos1.g:809:2: ( rule__Linea__Y1Assignment_2 )
            {
             before(grammarAccess.getLineaAccess().getY1Assignment_2()); 
            // InternalDibujos1.g:810:2: ( rule__Linea__Y1Assignment_2 )
            // InternalDibujos1.g:810:3: rule__Linea__Y1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Linea__Y1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLineaAccess().getY1Assignment_2()); 

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
    // $ANTLR end "rule__Linea__Group__2__Impl"


    // $ANTLR start "rule__Linea__Group__3"
    // InternalDibujos1.g:818:1: rule__Linea__Group__3 : rule__Linea__Group__3__Impl rule__Linea__Group__4 ;
    public final void rule__Linea__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:822:1: ( rule__Linea__Group__3__Impl rule__Linea__Group__4 )
            // InternalDibujos1.g:823:2: rule__Linea__Group__3__Impl rule__Linea__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Linea__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Linea__Group__4();

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
    // $ANTLR end "rule__Linea__Group__3"


    // $ANTLR start "rule__Linea__Group__3__Impl"
    // InternalDibujos1.g:830:1: rule__Linea__Group__3__Impl : ( ( rule__Linea__X2Assignment_3 ) ) ;
    public final void rule__Linea__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:834:1: ( ( ( rule__Linea__X2Assignment_3 ) ) )
            // InternalDibujos1.g:835:1: ( ( rule__Linea__X2Assignment_3 ) )
            {
            // InternalDibujos1.g:835:1: ( ( rule__Linea__X2Assignment_3 ) )
            // InternalDibujos1.g:836:2: ( rule__Linea__X2Assignment_3 )
            {
             before(grammarAccess.getLineaAccess().getX2Assignment_3()); 
            // InternalDibujos1.g:837:2: ( rule__Linea__X2Assignment_3 )
            // InternalDibujos1.g:837:3: rule__Linea__X2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Linea__X2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLineaAccess().getX2Assignment_3()); 

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
    // $ANTLR end "rule__Linea__Group__3__Impl"


    // $ANTLR start "rule__Linea__Group__4"
    // InternalDibujos1.g:845:1: rule__Linea__Group__4 : rule__Linea__Group__4__Impl ;
    public final void rule__Linea__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:849:1: ( rule__Linea__Group__4__Impl )
            // InternalDibujos1.g:850:2: rule__Linea__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Linea__Group__4__Impl();

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
    // $ANTLR end "rule__Linea__Group__4"


    // $ANTLR start "rule__Linea__Group__4__Impl"
    // InternalDibujos1.g:856:1: rule__Linea__Group__4__Impl : ( ( rule__Linea__Y2Assignment_4 ) ) ;
    public final void rule__Linea__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:860:1: ( ( ( rule__Linea__Y2Assignment_4 ) ) )
            // InternalDibujos1.g:861:1: ( ( rule__Linea__Y2Assignment_4 ) )
            {
            // InternalDibujos1.g:861:1: ( ( rule__Linea__Y2Assignment_4 ) )
            // InternalDibujos1.g:862:2: ( rule__Linea__Y2Assignment_4 )
            {
             before(grammarAccess.getLineaAccess().getY2Assignment_4()); 
            // InternalDibujos1.g:863:2: ( rule__Linea__Y2Assignment_4 )
            // InternalDibujos1.g:863:3: rule__Linea__Y2Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Linea__Y2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLineaAccess().getY2Assignment_4()); 

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
    // $ANTLR end "rule__Linea__Group__4__Impl"


    // $ANTLR start "rule__Texto__Group__0"
    // InternalDibujos1.g:872:1: rule__Texto__Group__0 : rule__Texto__Group__0__Impl rule__Texto__Group__1 ;
    public final void rule__Texto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:876:1: ( rule__Texto__Group__0__Impl rule__Texto__Group__1 )
            // InternalDibujos1.g:877:2: rule__Texto__Group__0__Impl rule__Texto__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Texto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texto__Group__1();

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
    // $ANTLR end "rule__Texto__Group__0"


    // $ANTLR start "rule__Texto__Group__0__Impl"
    // InternalDibujos1.g:884:1: rule__Texto__Group__0__Impl : ( 'T' ) ;
    public final void rule__Texto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:888:1: ( ( 'T' ) )
            // InternalDibujos1.g:889:1: ( 'T' )
            {
            // InternalDibujos1.g:889:1: ( 'T' )
            // InternalDibujos1.g:890:2: 'T'
            {
             before(grammarAccess.getTextoAccess().getTKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTextoAccess().getTKeyword_0()); 

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
    // $ANTLR end "rule__Texto__Group__0__Impl"


    // $ANTLR start "rule__Texto__Group__1"
    // InternalDibujos1.g:899:1: rule__Texto__Group__1 : rule__Texto__Group__1__Impl rule__Texto__Group__2 ;
    public final void rule__Texto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:903:1: ( rule__Texto__Group__1__Impl rule__Texto__Group__2 )
            // InternalDibujos1.g:904:2: rule__Texto__Group__1__Impl rule__Texto__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Texto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texto__Group__2();

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
    // $ANTLR end "rule__Texto__Group__1"


    // $ANTLR start "rule__Texto__Group__1__Impl"
    // InternalDibujos1.g:911:1: rule__Texto__Group__1__Impl : ( ( rule__Texto__XAssignment_1 ) ) ;
    public final void rule__Texto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:915:1: ( ( ( rule__Texto__XAssignment_1 ) ) )
            // InternalDibujos1.g:916:1: ( ( rule__Texto__XAssignment_1 ) )
            {
            // InternalDibujos1.g:916:1: ( ( rule__Texto__XAssignment_1 ) )
            // InternalDibujos1.g:917:2: ( rule__Texto__XAssignment_1 )
            {
             before(grammarAccess.getTextoAccess().getXAssignment_1()); 
            // InternalDibujos1.g:918:2: ( rule__Texto__XAssignment_1 )
            // InternalDibujos1.g:918:3: rule__Texto__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Texto__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextoAccess().getXAssignment_1()); 

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
    // $ANTLR end "rule__Texto__Group__1__Impl"


    // $ANTLR start "rule__Texto__Group__2"
    // InternalDibujos1.g:926:1: rule__Texto__Group__2 : rule__Texto__Group__2__Impl rule__Texto__Group__3 ;
    public final void rule__Texto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:930:1: ( rule__Texto__Group__2__Impl rule__Texto__Group__3 )
            // InternalDibujos1.g:931:2: rule__Texto__Group__2__Impl rule__Texto__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Texto__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texto__Group__3();

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
    // $ANTLR end "rule__Texto__Group__2"


    // $ANTLR start "rule__Texto__Group__2__Impl"
    // InternalDibujos1.g:938:1: rule__Texto__Group__2__Impl : ( ( rule__Texto__YAssignment_2 ) ) ;
    public final void rule__Texto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:942:1: ( ( ( rule__Texto__YAssignment_2 ) ) )
            // InternalDibujos1.g:943:1: ( ( rule__Texto__YAssignment_2 ) )
            {
            // InternalDibujos1.g:943:1: ( ( rule__Texto__YAssignment_2 ) )
            // InternalDibujos1.g:944:2: ( rule__Texto__YAssignment_2 )
            {
             before(grammarAccess.getTextoAccess().getYAssignment_2()); 
            // InternalDibujos1.g:945:2: ( rule__Texto__YAssignment_2 )
            // InternalDibujos1.g:945:3: rule__Texto__YAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Texto__YAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextoAccess().getYAssignment_2()); 

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
    // $ANTLR end "rule__Texto__Group__2__Impl"


    // $ANTLR start "rule__Texto__Group__3"
    // InternalDibujos1.g:953:1: rule__Texto__Group__3 : rule__Texto__Group__3__Impl ;
    public final void rule__Texto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:957:1: ( rule__Texto__Group__3__Impl )
            // InternalDibujos1.g:958:2: rule__Texto__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Texto__Group__3__Impl();

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
    // $ANTLR end "rule__Texto__Group__3"


    // $ANTLR start "rule__Texto__Group__3__Impl"
    // InternalDibujos1.g:964:1: rule__Texto__Group__3__Impl : ( ( rule__Texto__TextoAssignment_3 ) ) ;
    public final void rule__Texto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:968:1: ( ( ( rule__Texto__TextoAssignment_3 ) ) )
            // InternalDibujos1.g:969:1: ( ( rule__Texto__TextoAssignment_3 ) )
            {
            // InternalDibujos1.g:969:1: ( ( rule__Texto__TextoAssignment_3 ) )
            // InternalDibujos1.g:970:2: ( rule__Texto__TextoAssignment_3 )
            {
             before(grammarAccess.getTextoAccess().getTextoAssignment_3()); 
            // InternalDibujos1.g:971:2: ( rule__Texto__TextoAssignment_3 )
            // InternalDibujos1.g:971:3: rule__Texto__TextoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Texto__TextoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTextoAccess().getTextoAssignment_3()); 

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
    // $ANTLR end "rule__Texto__Group__3__Impl"


    // $ANTLR start "rule__Punto__Group__0"
    // InternalDibujos1.g:980:1: rule__Punto__Group__0 : rule__Punto__Group__0__Impl rule__Punto__Group__1 ;
    public final void rule__Punto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:984:1: ( rule__Punto__Group__0__Impl rule__Punto__Group__1 )
            // InternalDibujos1.g:985:2: rule__Punto__Group__0__Impl rule__Punto__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Punto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Punto__Group__1();

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
    // $ANTLR end "rule__Punto__Group__0"


    // $ANTLR start "rule__Punto__Group__0__Impl"
    // InternalDibujos1.g:992:1: rule__Punto__Group__0__Impl : ( 'P' ) ;
    public final void rule__Punto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:996:1: ( ( 'P' ) )
            // InternalDibujos1.g:997:1: ( 'P' )
            {
            // InternalDibujos1.g:997:1: ( 'P' )
            // InternalDibujos1.g:998:2: 'P'
            {
             before(grammarAccess.getPuntoAccess().getPKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPuntoAccess().getPKeyword_0()); 

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
    // $ANTLR end "rule__Punto__Group__0__Impl"


    // $ANTLR start "rule__Punto__Group__1"
    // InternalDibujos1.g:1007:1: rule__Punto__Group__1 : rule__Punto__Group__1__Impl rule__Punto__Group__2 ;
    public final void rule__Punto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1011:1: ( rule__Punto__Group__1__Impl rule__Punto__Group__2 )
            // InternalDibujos1.g:1012:2: rule__Punto__Group__1__Impl rule__Punto__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Punto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Punto__Group__2();

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
    // $ANTLR end "rule__Punto__Group__1"


    // $ANTLR start "rule__Punto__Group__1__Impl"
    // InternalDibujos1.g:1019:1: rule__Punto__Group__1__Impl : ( ( rule__Punto__XAssignment_1 ) ) ;
    public final void rule__Punto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1023:1: ( ( ( rule__Punto__XAssignment_1 ) ) )
            // InternalDibujos1.g:1024:1: ( ( rule__Punto__XAssignment_1 ) )
            {
            // InternalDibujos1.g:1024:1: ( ( rule__Punto__XAssignment_1 ) )
            // InternalDibujos1.g:1025:2: ( rule__Punto__XAssignment_1 )
            {
             before(grammarAccess.getPuntoAccess().getXAssignment_1()); 
            // InternalDibujos1.g:1026:2: ( rule__Punto__XAssignment_1 )
            // InternalDibujos1.g:1026:3: rule__Punto__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Punto__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPuntoAccess().getXAssignment_1()); 

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
    // $ANTLR end "rule__Punto__Group__1__Impl"


    // $ANTLR start "rule__Punto__Group__2"
    // InternalDibujos1.g:1034:1: rule__Punto__Group__2 : rule__Punto__Group__2__Impl ;
    public final void rule__Punto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1038:1: ( rule__Punto__Group__2__Impl )
            // InternalDibujos1.g:1039:2: rule__Punto__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Punto__Group__2__Impl();

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
    // $ANTLR end "rule__Punto__Group__2"


    // $ANTLR start "rule__Punto__Group__2__Impl"
    // InternalDibujos1.g:1045:1: rule__Punto__Group__2__Impl : ( ( rule__Punto__YAssignment_2 ) ) ;
    public final void rule__Punto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1049:1: ( ( ( rule__Punto__YAssignment_2 ) ) )
            // InternalDibujos1.g:1050:1: ( ( rule__Punto__YAssignment_2 ) )
            {
            // InternalDibujos1.g:1050:1: ( ( rule__Punto__YAssignment_2 ) )
            // InternalDibujos1.g:1051:2: ( rule__Punto__YAssignment_2 )
            {
             before(grammarAccess.getPuntoAccess().getYAssignment_2()); 
            // InternalDibujos1.g:1052:2: ( rule__Punto__YAssignment_2 )
            // InternalDibujos1.g:1052:3: rule__Punto__YAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Punto__YAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPuntoAccess().getYAssignment_2()); 

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
    // $ANTLR end "rule__Punto__Group__2__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // InternalDibujos1.g:1061:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1065:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalDibujos1.g:1066:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__1();

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
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // InternalDibujos1.g:1073:1: rule__Color__Group__0__Impl : ( ( rule__Color__Alternatives_0 ) ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1077:1: ( ( ( rule__Color__Alternatives_0 ) ) )
            // InternalDibujos1.g:1078:1: ( ( rule__Color__Alternatives_0 ) )
            {
            // InternalDibujos1.g:1078:1: ( ( rule__Color__Alternatives_0 ) )
            // InternalDibujos1.g:1079:2: ( rule__Color__Alternatives_0 )
            {
             before(grammarAccess.getColorAccess().getAlternatives_0()); 
            // InternalDibujos1.g:1080:2: ( rule__Color__Alternatives_0 )
            // InternalDibujos1.g:1080:3: rule__Color__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Color__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // InternalDibujos1.g:1088:1: rule__Color__Group__1 : rule__Color__Group__1__Impl ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1092:1: ( rule__Color__Group__1__Impl )
            // InternalDibujos1.g:1093:2: rule__Color__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__1__Impl();

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
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // InternalDibujos1.g:1099:1: rule__Color__Group__1__Impl : ( ( rule__Color__ColorAssignment_1 ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1103:1: ( ( ( rule__Color__ColorAssignment_1 ) ) )
            // InternalDibujos1.g:1104:1: ( ( rule__Color__ColorAssignment_1 ) )
            {
            // InternalDibujos1.g:1104:1: ( ( rule__Color__ColorAssignment_1 ) )
            // InternalDibujos1.g:1105:2: ( rule__Color__ColorAssignment_1 )
            {
             before(grammarAccess.getColorAccess().getColorAssignment_1()); 
            // InternalDibujos1.g:1106:2: ( rule__Color__ColorAssignment_1 )
            // InternalDibujos1.g:1106:3: rule__Color__ColorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Color__ColorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getColorAssignment_1()); 

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
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Estilo__Group__0"
    // InternalDibujos1.g:1115:1: rule__Estilo__Group__0 : rule__Estilo__Group__0__Impl rule__Estilo__Group__1 ;
    public final void rule__Estilo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1119:1: ( rule__Estilo__Group__0__Impl rule__Estilo__Group__1 )
            // InternalDibujos1.g:1120:2: rule__Estilo__Group__0__Impl rule__Estilo__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Estilo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estilo__Group__1();

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
    // $ANTLR end "rule__Estilo__Group__0"


    // $ANTLR start "rule__Estilo__Group__0__Impl"
    // InternalDibujos1.g:1127:1: rule__Estilo__Group__0__Impl : ( 'SW' ) ;
    public final void rule__Estilo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1131:1: ( ( 'SW' ) )
            // InternalDibujos1.g:1132:1: ( 'SW' )
            {
            // InternalDibujos1.g:1132:1: ( 'SW' )
            // InternalDibujos1.g:1133:2: 'SW'
            {
             before(grammarAccess.getEstiloAccess().getSWKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEstiloAccess().getSWKeyword_0()); 

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
    // $ANTLR end "rule__Estilo__Group__0__Impl"


    // $ANTLR start "rule__Estilo__Group__1"
    // InternalDibujos1.g:1142:1: rule__Estilo__Group__1 : rule__Estilo__Group__1__Impl ;
    public final void rule__Estilo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1146:1: ( rule__Estilo__Group__1__Impl )
            // InternalDibujos1.g:1147:2: rule__Estilo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Estilo__Group__1__Impl();

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
    // $ANTLR end "rule__Estilo__Group__1"


    // $ANTLR start "rule__Estilo__Group__1__Impl"
    // InternalDibujos1.g:1153:1: rule__Estilo__Group__1__Impl : ( ( rule__Estilo__ValorAssignment_1 ) ) ;
    public final void rule__Estilo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1157:1: ( ( ( rule__Estilo__ValorAssignment_1 ) ) )
            // InternalDibujos1.g:1158:1: ( ( rule__Estilo__ValorAssignment_1 ) )
            {
            // InternalDibujos1.g:1158:1: ( ( rule__Estilo__ValorAssignment_1 ) )
            // InternalDibujos1.g:1159:2: ( rule__Estilo__ValorAssignment_1 )
            {
             before(grammarAccess.getEstiloAccess().getValorAssignment_1()); 
            // InternalDibujos1.g:1160:2: ( rule__Estilo__ValorAssignment_1 )
            // InternalDibujos1.g:1160:3: rule__Estilo__ValorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Estilo__ValorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEstiloAccess().getValorAssignment_1()); 

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
    // $ANTLR end "rule__Estilo__Group__1__Impl"


    // $ANTLR start "rule__Fuente__Group__0"
    // InternalDibujos1.g:1169:1: rule__Fuente__Group__0 : rule__Fuente__Group__0__Impl rule__Fuente__Group__1 ;
    public final void rule__Fuente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1173:1: ( rule__Fuente__Group__0__Impl rule__Fuente__Group__1 )
            // InternalDibujos1.g:1174:2: rule__Fuente__Group__0__Impl rule__Fuente__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Fuente__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fuente__Group__1();

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
    // $ANTLR end "rule__Fuente__Group__0"


    // $ANTLR start "rule__Fuente__Group__0__Impl"
    // InternalDibujos1.g:1181:1: rule__Fuente__Group__0__Impl : ( 'FS' ) ;
    public final void rule__Fuente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1185:1: ( ( 'FS' ) )
            // InternalDibujos1.g:1186:1: ( 'FS' )
            {
            // InternalDibujos1.g:1186:1: ( 'FS' )
            // InternalDibujos1.g:1187:2: 'FS'
            {
             before(grammarAccess.getFuenteAccess().getFSKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFuenteAccess().getFSKeyword_0()); 

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
    // $ANTLR end "rule__Fuente__Group__0__Impl"


    // $ANTLR start "rule__Fuente__Group__1"
    // InternalDibujos1.g:1196:1: rule__Fuente__Group__1 : rule__Fuente__Group__1__Impl ;
    public final void rule__Fuente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1200:1: ( rule__Fuente__Group__1__Impl )
            // InternalDibujos1.g:1201:2: rule__Fuente__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fuente__Group__1__Impl();

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
    // $ANTLR end "rule__Fuente__Group__1"


    // $ANTLR start "rule__Fuente__Group__1__Impl"
    // InternalDibujos1.g:1207:1: rule__Fuente__Group__1__Impl : ( ( rule__Fuente__ValorAssignment_1 ) ) ;
    public final void rule__Fuente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1211:1: ( ( ( rule__Fuente__ValorAssignment_1 ) ) )
            // InternalDibujos1.g:1212:1: ( ( rule__Fuente__ValorAssignment_1 ) )
            {
            // InternalDibujos1.g:1212:1: ( ( rule__Fuente__ValorAssignment_1 ) )
            // InternalDibujos1.g:1213:2: ( rule__Fuente__ValorAssignment_1 )
            {
             before(grammarAccess.getFuenteAccess().getValorAssignment_1()); 
            // InternalDibujos1.g:1214:2: ( rule__Fuente__ValorAssignment_1 )
            // InternalDibujos1.g:1214:3: rule__Fuente__ValorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fuente__ValorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFuenteAccess().getValorAssignment_1()); 

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
    // $ANTLR end "rule__Fuente__Group__1__Impl"


    // $ANTLR start "rule__Modelo__InstruccionesAssignment"
    // InternalDibujos1.g:1223:1: rule__Modelo__InstruccionesAssignment : ( ruleInstruccion ) ;
    public final void rule__Modelo__InstruccionesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1227:1: ( ( ruleInstruccion ) )
            // InternalDibujos1.g:1228:2: ( ruleInstruccion )
            {
            // InternalDibujos1.g:1228:2: ( ruleInstruccion )
            // InternalDibujos1.g:1229:3: ruleInstruccion
            {
             before(grammarAccess.getModeloAccess().getInstruccionesInstruccionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruccion();

            state._fsp--;

             after(grammarAccess.getModeloAccess().getInstruccionesInstruccionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Modelo__InstruccionesAssignment"


    // $ANTLR start "rule__Circulo__XAssignment_1"
    // InternalDibujos1.g:1238:1: rule__Circulo__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Circulo__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1242:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1243:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1243:2: ( RULE_INT )
            // InternalDibujos1.g:1244:3: RULE_INT
            {
             before(grammarAccess.getCirculoAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCirculoAccess().getXINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Circulo__XAssignment_1"


    // $ANTLR start "rule__Circulo__YAssignment_2"
    // InternalDibujos1.g:1253:1: rule__Circulo__YAssignment_2 : ( RULE_INT ) ;
    public final void rule__Circulo__YAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1257:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1258:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1258:2: ( RULE_INT )
            // InternalDibujos1.g:1259:3: RULE_INT
            {
             before(grammarAccess.getCirculoAccess().getYINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCirculoAccess().getYINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Circulo__YAssignment_2"


    // $ANTLR start "rule__Circulo__RAssignment_3"
    // InternalDibujos1.g:1268:1: rule__Circulo__RAssignment_3 : ( RULE_INT ) ;
    public final void rule__Circulo__RAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1272:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1273:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1273:2: ( RULE_INT )
            // InternalDibujos1.g:1274:3: RULE_INT
            {
             before(grammarAccess.getCirculoAccess().getRINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCirculoAccess().getRINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Circulo__RAssignment_3"


    // $ANTLR start "rule__Rectangulo__X1Assignment_1"
    // InternalDibujos1.g:1283:1: rule__Rectangulo__X1Assignment_1 : ( RULE_INT ) ;
    public final void rule__Rectangulo__X1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1287:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1288:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1288:2: ( RULE_INT )
            // InternalDibujos1.g:1289:3: RULE_INT
            {
             before(grammarAccess.getRectanguloAccess().getX1INTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRectanguloAccess().getX1INTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rectangulo__X1Assignment_1"


    // $ANTLR start "rule__Rectangulo__Y1Assignment_2"
    // InternalDibujos1.g:1298:1: rule__Rectangulo__Y1Assignment_2 : ( RULE_INT ) ;
    public final void rule__Rectangulo__Y1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1302:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1303:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1303:2: ( RULE_INT )
            // InternalDibujos1.g:1304:3: RULE_INT
            {
             before(grammarAccess.getRectanguloAccess().getY1INTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRectanguloAccess().getY1INTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Rectangulo__Y1Assignment_2"


    // $ANTLR start "rule__Rectangulo__X2Assignment_3"
    // InternalDibujos1.g:1313:1: rule__Rectangulo__X2Assignment_3 : ( RULE_INT ) ;
    public final void rule__Rectangulo__X2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1317:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1318:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1318:2: ( RULE_INT )
            // InternalDibujos1.g:1319:3: RULE_INT
            {
             before(grammarAccess.getRectanguloAccess().getX2INTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRectanguloAccess().getX2INTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Rectangulo__X2Assignment_3"


    // $ANTLR start "rule__Rectangulo__Y2Assignment_4"
    // InternalDibujos1.g:1328:1: rule__Rectangulo__Y2Assignment_4 : ( RULE_INT ) ;
    public final void rule__Rectangulo__Y2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1332:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1333:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1333:2: ( RULE_INT )
            // InternalDibujos1.g:1334:3: RULE_INT
            {
             before(grammarAccess.getRectanguloAccess().getY2INTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRectanguloAccess().getY2INTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Rectangulo__Y2Assignment_4"


    // $ANTLR start "rule__Rectangulo__X3Assignment_5"
    // InternalDibujos1.g:1343:1: rule__Rectangulo__X3Assignment_5 : ( RULE_INT ) ;
    public final void rule__Rectangulo__X3Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1347:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1348:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1348:2: ( RULE_INT )
            // InternalDibujos1.g:1349:3: RULE_INT
            {
             before(grammarAccess.getRectanguloAccess().getX3INTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRectanguloAccess().getX3INTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Rectangulo__X3Assignment_5"


    // $ANTLR start "rule__Rectangulo__Y3Assignment_6"
    // InternalDibujos1.g:1358:1: rule__Rectangulo__Y3Assignment_6 : ( RULE_INT ) ;
    public final void rule__Rectangulo__Y3Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1362:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1363:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1363:2: ( RULE_INT )
            // InternalDibujos1.g:1364:3: RULE_INT
            {
             before(grammarAccess.getRectanguloAccess().getY3INTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRectanguloAccess().getY3INTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Rectangulo__Y3Assignment_6"


    // $ANTLR start "rule__Rectangulo__X4Assignment_7"
    // InternalDibujos1.g:1373:1: rule__Rectangulo__X4Assignment_7 : ( RULE_INT ) ;
    public final void rule__Rectangulo__X4Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1377:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1378:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1378:2: ( RULE_INT )
            // InternalDibujos1.g:1379:3: RULE_INT
            {
             before(grammarAccess.getRectanguloAccess().getX4INTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRectanguloAccess().getX4INTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Rectangulo__X4Assignment_7"


    // $ANTLR start "rule__Rectangulo__Y4Assignment_8"
    // InternalDibujos1.g:1388:1: rule__Rectangulo__Y4Assignment_8 : ( RULE_INT ) ;
    public final void rule__Rectangulo__Y4Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1392:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1393:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1393:2: ( RULE_INT )
            // InternalDibujos1.g:1394:3: RULE_INT
            {
             before(grammarAccess.getRectanguloAccess().getY4INTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRectanguloAccess().getY4INTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Rectangulo__Y4Assignment_8"


    // $ANTLR start "rule__Linea__X1Assignment_1"
    // InternalDibujos1.g:1403:1: rule__Linea__X1Assignment_1 : ( RULE_INT ) ;
    public final void rule__Linea__X1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1407:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1408:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1408:2: ( RULE_INT )
            // InternalDibujos1.g:1409:3: RULE_INT
            {
             before(grammarAccess.getLineaAccess().getX1INTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLineaAccess().getX1INTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Linea__X1Assignment_1"


    // $ANTLR start "rule__Linea__Y1Assignment_2"
    // InternalDibujos1.g:1418:1: rule__Linea__Y1Assignment_2 : ( RULE_INT ) ;
    public final void rule__Linea__Y1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1422:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1423:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1423:2: ( RULE_INT )
            // InternalDibujos1.g:1424:3: RULE_INT
            {
             before(grammarAccess.getLineaAccess().getY1INTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLineaAccess().getY1INTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Linea__Y1Assignment_2"


    // $ANTLR start "rule__Linea__X2Assignment_3"
    // InternalDibujos1.g:1433:1: rule__Linea__X2Assignment_3 : ( RULE_INT ) ;
    public final void rule__Linea__X2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1437:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1438:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1438:2: ( RULE_INT )
            // InternalDibujos1.g:1439:3: RULE_INT
            {
             before(grammarAccess.getLineaAccess().getX2INTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLineaAccess().getX2INTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Linea__X2Assignment_3"


    // $ANTLR start "rule__Linea__Y2Assignment_4"
    // InternalDibujos1.g:1448:1: rule__Linea__Y2Assignment_4 : ( RULE_INT ) ;
    public final void rule__Linea__Y2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1452:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1453:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1453:2: ( RULE_INT )
            // InternalDibujos1.g:1454:3: RULE_INT
            {
             before(grammarAccess.getLineaAccess().getY2INTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLineaAccess().getY2INTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Linea__Y2Assignment_4"


    // $ANTLR start "rule__Texto__XAssignment_1"
    // InternalDibujos1.g:1463:1: rule__Texto__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Texto__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1467:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1468:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1468:2: ( RULE_INT )
            // InternalDibujos1.g:1469:3: RULE_INT
            {
             before(grammarAccess.getTextoAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTextoAccess().getXINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Texto__XAssignment_1"


    // $ANTLR start "rule__Texto__YAssignment_2"
    // InternalDibujos1.g:1478:1: rule__Texto__YAssignment_2 : ( RULE_INT ) ;
    public final void rule__Texto__YAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1482:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1483:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1483:2: ( RULE_INT )
            // InternalDibujos1.g:1484:3: RULE_INT
            {
             before(grammarAccess.getTextoAccess().getYINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTextoAccess().getYINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Texto__YAssignment_2"


    // $ANTLR start "rule__Texto__TextoAssignment_3"
    // InternalDibujos1.g:1493:1: rule__Texto__TextoAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Texto__TextoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1497:1: ( ( RULE_STRING ) )
            // InternalDibujos1.g:1498:2: ( RULE_STRING )
            {
            // InternalDibujos1.g:1498:2: ( RULE_STRING )
            // InternalDibujos1.g:1499:3: RULE_STRING
            {
             before(grammarAccess.getTextoAccess().getTextoSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextoAccess().getTextoSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Texto__TextoAssignment_3"


    // $ANTLR start "rule__Punto__XAssignment_1"
    // InternalDibujos1.g:1508:1: rule__Punto__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Punto__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1512:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1513:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1513:2: ( RULE_INT )
            // InternalDibujos1.g:1514:3: RULE_INT
            {
             before(grammarAccess.getPuntoAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPuntoAccess().getXINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Punto__XAssignment_1"


    // $ANTLR start "rule__Punto__YAssignment_2"
    // InternalDibujos1.g:1523:1: rule__Punto__YAssignment_2 : ( RULE_INT ) ;
    public final void rule__Punto__YAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1527:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1528:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1528:2: ( RULE_INT )
            // InternalDibujos1.g:1529:3: RULE_INT
            {
             before(grammarAccess.getPuntoAccess().getYINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPuntoAccess().getYINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Punto__YAssignment_2"


    // $ANTLR start "rule__Color__ColorAssignment_1"
    // InternalDibujos1.g:1538:1: rule__Color__ColorAssignment_1 : ( RULE_HEXCOLOR ) ;
    public final void rule__Color__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1542:1: ( ( RULE_HEXCOLOR ) )
            // InternalDibujos1.g:1543:2: ( RULE_HEXCOLOR )
            {
            // InternalDibujos1.g:1543:2: ( RULE_HEXCOLOR )
            // InternalDibujos1.g:1544:3: RULE_HEXCOLOR
            {
             before(grammarAccess.getColorAccess().getColorHEXCOLORTerminalRuleCall_1_0()); 
            match(input,RULE_HEXCOLOR,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColorHEXCOLORTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Color__ColorAssignment_1"


    // $ANTLR start "rule__Estilo__ValorAssignment_1"
    // InternalDibujos1.g:1553:1: rule__Estilo__ValorAssignment_1 : ( RULE_INT ) ;
    public final void rule__Estilo__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1557:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1558:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1558:2: ( RULE_INT )
            // InternalDibujos1.g:1559:3: RULE_INT
            {
             before(grammarAccess.getEstiloAccess().getValorINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEstiloAccess().getValorINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Estilo__ValorAssignment_1"


    // $ANTLR start "rule__Fuente__ValorAssignment_1"
    // InternalDibujos1.g:1568:1: rule__Fuente__ValorAssignment_1 : ( RULE_INT ) ;
    public final void rule__Fuente__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDibujos1.g:1572:1: ( ( RULE_INT ) )
            // InternalDibujos1.g:1573:2: ( RULE_INT )
            {
            // InternalDibujos1.g:1573:2: ( RULE_INT )
            // InternalDibujos1.g:1574:3: RULE_INT
            {
             before(grammarAccess.getFuenteAccess().getValorINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFuenteAccess().getValorINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Fuente__ValorAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000003FF002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});

}