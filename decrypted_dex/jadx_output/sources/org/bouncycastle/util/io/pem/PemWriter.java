package org.bouncycastle.util.io.pem;

import com.stub.StubApp;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Base64;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PemWriter extends BufferedWriter {
    private static final int LINE_LENGTH = 64;
    private char[] buf;
    private final int nlLength;

    public PemWriter(Writer writer) {
        super(writer);
        this.buf = new char[64];
        String lineSeparator = Strings.lineSeparator();
        this.nlLength = lineSeparator != null ? lineSeparator.length() : 2;
    }

    private void writeEncoded(byte[] bArr) throws IOException {
        char[] cArr;
        int i3;
        byte[] encode = Base64.encode(bArr);
        int i10 = 0;
        while (i10 < encode.length) {
            int i11 = 0;
            while (true) {
                cArr = this.buf;
                if (i11 != cArr.length && (i3 = i10 + i11) < encode.length) {
                    cArr[i11] = (char) encode[i3];
                    i11++;
                }
            }
            write(cArr, 0, i11);
            newLine();
            i10 += this.buf.length;
        }
    }

    private void writePostEncapsulationBoundary(String str) throws IOException {
        write(StubApp.getString2(30874) + str + StubApp.getString2(30873));
        newLine();
    }

    private void writePreEncapsulationBoundary(String str) throws IOException {
        write(StubApp.getString2(30872) + str + StubApp.getString2(30873));
        newLine();
    }

    public int getOutputSize(PemObject pemObject) {
        int length = ((pemObject.getType().length() + 10 + this.nlLength) * 2) + 10;
        if (!pemObject.getHeaders().isEmpty()) {
            for (PemHeader pemHeader : pemObject.getHeaders()) {
                length += pemHeader.getValue().length() + pemHeader.getName().length() + 2 + this.nlLength;
            }
            length += this.nlLength;
        }
        int length2 = ((pemObject.getContent().length + 2) / 3) * 4;
        return AbstractC1482f.c((length2 + 63) / 64, this.nlLength, length2, length);
    }

    public void writeObject(PemObjectGenerator pemObjectGenerator) throws IOException {
        PemObject generate = pemObjectGenerator.generate();
        writePreEncapsulationBoundary(generate.getType());
        if (!generate.getHeaders().isEmpty()) {
            for (PemHeader pemHeader : generate.getHeaders()) {
                write(pemHeader.getName());
                write(StubApp.getString2(994));
                write(pemHeader.getValue());
                newLine();
            }
            newLine();
        }
        writeEncoded(generate.getContent());
        writePostEncapsulationBoundary(generate.getType());
    }
}
