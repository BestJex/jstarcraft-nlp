package com.jstarcraft.nlp.tokenization.mynlp;

import com.jstarcraft.nlp.tokenization.NlpTokenizer;
import com.mayabot.nlp.segment.Lexer;
import com.mayabot.nlp.segment.Sentence;

/**
 * MYNLP分词器
 * 
 * @author Birdy
 *
 */
public class MynlpTokenizer implements NlpTokenizer<MynlpToken> {

    private Lexer lexer;

    public MynlpTokenizer(Lexer lexer) {
        this.lexer = lexer;
    }

    @Override
    public Iterable<MynlpToken> tokenize(CharSequence text) {
        Sentence sentence = lexer.scan(text.toString());
        MynlpToken iterable = new MynlpToken(sentence.iterator());
        return iterable;
    }

}
