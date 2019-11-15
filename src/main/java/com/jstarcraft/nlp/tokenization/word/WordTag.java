package com.jstarcraft.nlp.tokenization.word;

import com.jstarcraft.nlp.tokenization.NlpTag;

/**
 * word词性(核心)
 * 
 * @author Birdy
 *
 */
public enum WordTag {

    /** 形容词-实词 */
    A(NlpTag.A),
    /** 区别词-形容词 */
    B(NlpTag.A),
    /** 连词-虚词 */
    C(NlpTag.C),
    /** 副词-虚词 */
    D(NlpTag.D),
    /** 叹词-虚词 */
    E(NlpTag.E),
    /** 方位词-名词 */
    F(NlpTag.N),
    /** 前缀 */
    H(NlpTag.X),
    /** 未知 */
    I(NlpTag.X),
    /** 简称 */
    J(NlpTag.N),
    /** 后缀 */
    K(NlpTag.X),
    /** 习惯用语 */
    L(NlpTag.X),
    /** 数词-实词 */
    M(NlpTag.M),
    /** 名词-实词 */
    N(NlpTag.N),
    /** 拟声词-虚词 */
    O(NlpTag.O),
    /** 介词-虚词 */
    P(NlpTag.P),
    /** 量词-实词 */
    Q(NlpTag.Q),
    /** 代词-实词 */
    R(NlpTag.R),
    /** 处所词-名词 */
    S(NlpTag.N),
    /** 时间词-名词 */
    T(NlpTag.N),
    /** 助词-虚词 */
    U(NlpTag.U),
    /** 动词-实词 */
    V(NlpTag.V),
    /** 英语 */
    W(NlpTag.W),
    /** 语气词-助词 */
    Y(NlpTag.U),
    /** 状态词-形容词 */
    Z(NlpTag.A);

    private final NlpTag tag;

    WordTag(NlpTag tag) {
        this.tag = tag;
    }

}