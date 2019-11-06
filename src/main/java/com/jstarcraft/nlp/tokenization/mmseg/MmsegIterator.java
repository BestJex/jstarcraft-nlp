package com.jstarcraft.nlp.tokenization.mmseg;

import java.io.StringReader;
import java.util.LinkedList;

import com.chenlb.mmseg4j.MMSeg;
import com.chenlb.mmseg4j.Word;
import com.jstarcraft.nlp.tokenization.NlpIterator;

/**
 * MMSEG分词器
 * 
 * @author Birdy
 *
 */
public class MmsegIterator implements NlpIterator<MmsegToken> {

    private MMSeg mmSeg;

    public MmsegIterator(MMSeg mmSeg) {
        this.mmSeg = mmSeg;
    }

    @Override
    public Iterable<MmsegToken> tokenize(CharSequence text) {
        try {
            mmSeg.reset(new StringReader(text.toString()));
            LinkedList<Word> iterator = new LinkedList<>();
            while (true) {
                Word word = mmSeg.next();
                if (word != null) {
                    iterator.add(word);
                } else {
                    break;
                }
            }
            MmsegToken iterable = new MmsegToken(iterator.iterator());
            return iterable;
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

}