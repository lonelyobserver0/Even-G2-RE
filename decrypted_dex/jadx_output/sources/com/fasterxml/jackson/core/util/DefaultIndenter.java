package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class DefaultIndenter extends DefaultPrettyPrinter.NopIndenter {
    public static final DefaultIndenter SYSTEM_LINEFEED_INSTANCE;
    public static final String SYS_LF;
    private final int charsPerLevel;
    private final String eol;
    private final char[] indents;

    static {
        String string2;
        try {
            string2 = System.getProperty(StubApp.getString2("2731"));
        } catch (Throwable unused) {
            string2 = StubApp.getString2(3692);
        }
        SYS_LF = string2;
        SYSTEM_LINEFEED_INSTANCE = new DefaultIndenter(StubApp.getString2(6127), string2);
    }

    public DefaultIndenter(String str, String str2) {
        this.charsPerLevel = str.length();
        this.indents = new char[str.length() * 16];
        int i3 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            str.getChars(0, str.length(), this.indents, i3);
            i3 += str.length();
        }
        this.eol = str2;
    }

    @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
    public boolean isInline() {
        return false;
    }

    @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
    public void writeIndentation(JsonGenerator jsonGenerator, int i3) throws IOException {
        jsonGenerator.writeRaw(this.eol);
        if (i3 <= 0) {
            return;
        }
        int i10 = i3 * this.charsPerLevel;
        while (true) {
            char[] cArr = this.indents;
            if (i10 <= cArr.length) {
                jsonGenerator.writeRaw(cArr, 0, i10);
                return;
            } else {
                jsonGenerator.writeRaw(cArr, 0, cArr.length);
                i10 -= this.indents.length;
            }
        }
    }
}
