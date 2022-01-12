package com.mama100.lotteryweb.util;

/**
 * *
 * *@author   Moss
 * *2022/1/12
 **/
public final class SeqNoHolder {
    private static ThreadLocal<String> seqNoHolder = new ThreadLocal<>();

    public static String holdSeqNo() {
        String seq_no = (String)seqNoHolder.get();
        if (null == seq_no || "".equals(seq_no)) {
            seq_no = NumberUtil.genSeqNo();
            holdSeqNo(seq_no);
        }

        return seq_no;
    }

    public static String holdSeqNo(String seqNo) {
        seqNoHolder.set(seqNo);
        return seqNo;
    }

    public static void clearSeqNo() {
        seqNoHolder.remove();
    }

    private SeqNoHolder() {
    }
}
