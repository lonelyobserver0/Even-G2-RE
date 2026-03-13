package org.bouncycastle.est;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CTEChunkedInputStream extends InputStream {
    int chunkLen = 0;
    private InputStream src;

    public CTEChunkedInputStream(InputStream inputStream) {
        this.src = inputStream;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        return r0.toString().trim();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String readEOL() throws java.io.IOException {
        /*
            r3 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
        L5:
            java.io.InputStream r1 = r3.src
            int r1 = r1.read()
            r2 = -1
            if (r1 != r2) goto L1f
            int r1 = r0.size()
            if (r1 != 0) goto L16
            r0 = 0
            return r0
        L16:
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            return r0
        L1f:
            r2 = r1 & 255(0xff, float:3.57E-43)
            r0.write(r2)
            r2 = 10
            if (r1 != r2) goto L5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.est.CTEChunkedInputStream.readEOL():java.lang.String");
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        String readEOL;
        int i3 = this.chunkLen;
        if (i3 == Integer.MIN_VALUE) {
            return -1;
        }
        if (i3 == 0) {
            do {
                readEOL = readEOL();
                if (readEOL == null) {
                    break;
                }
            } while (readEOL.length() == 0);
            if (readEOL == null) {
                return -1;
            }
            int parseInt = Integer.parseInt(readEOL.trim(), 16);
            this.chunkLen = parseInt;
            if (parseInt == 0) {
                readEOL();
                this.chunkLen = Integer.MIN_VALUE;
                return -1;
            }
        }
        this.chunkLen--;
        return this.src.read();
    }
}
