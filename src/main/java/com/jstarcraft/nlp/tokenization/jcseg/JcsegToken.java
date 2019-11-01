package com.jstarcraft.nlp.tokenization.jcseg;

import java.util.Iterator;

import org.lionsoul.jcseg.tokenizer.core.IWord;

import com.jstarcraft.nlp.tokenization.NlpToken;

public class JcsegToken implements Iterable<JcsegToken>, Iterator<JcsegToken>, NlpToken {

    private Iterator<IWord> iterator;

    private IWord word;

    public JcsegToken(Iterator<IWord> iterator) {
        this.iterator = iterator;
    }

    @Override
    public Iterator<JcsegToken> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public JcsegToken next() {
        word = iterator.next();
        return this;
    }

    @Override
    public String getTerm() {
        return word.getValue();
    }

    @Override
    public int getBegin() {
        return word.getPosition();
    }

    @Override
    public int getEnd() {
        return getBegin() + getTerm().length();
    }

}
