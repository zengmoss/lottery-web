package com.mama100.lotteryweb.config;

import com.mama100.lotteryweb.util.SeqNoHolder;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.pattern.ConverterKeys;
import org.apache.logging.log4j.core.pattern.LogEventPatternConverter;

/**
 * *
 * *@author   Moss
 * *2022/1/12
 **/
@Plugin(
        name = "SEQPatternConverter",
        category = "Converter"
)
@ConverterKeys({"sx", "seqx"})
public class SEQPatternConverter extends LogEventPatternConverter {
    private String prefix;

    private SEQPatternConverter(String prefix) {
        super("seq", "seq");
        this.prefix = prefix;
    }

    public static SEQPatternConverter newInstance(String[] options) {
        return null != options && options.length > 0 ? new SEQPatternConverter(options[0]) : new SEQPatternConverter("");
    }

    @Override
    public void format(LogEvent event, StringBuilder toAppendTo) {
        String seqNo = SeqNoHolder.holdSeqNo();
        toAppendTo.append(this.prefix).append(seqNo);
    }
}
