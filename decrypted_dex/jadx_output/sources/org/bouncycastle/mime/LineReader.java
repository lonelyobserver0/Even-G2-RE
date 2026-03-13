package org.bouncycastle.mime;

import java.io.InputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class LineReader {
    private int lastC = -1;
    private final InputStream src;

    public LineReader(InputStream inputStream) {
        this.src = inputStream;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        r2 = r4.src.read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (r2 == 10) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r2 < 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        r4.lastC = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x001a, code lost:
    
        r1 = r4.src.read();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String readLine() throws java.io.IOException {
        /*
            r4 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            int r1 = r4.lastC
            r2 = 13
            r3 = -1
            if (r1 == r3) goto L14
            if (r1 != r2) goto L11
            java.lang.String r0 = ""
            return r0
        L11:
            r4.lastC = r3
            goto L1a
        L14:
            java.io.InputStream r1 = r4.src
            int r1 = r1.read()
        L1a:
            r3 = 10
            if (r1 < 0) goto L26
            if (r1 == r2) goto L26
            if (r1 == r3) goto L26
            r0.write(r1)
            goto L14
        L26:
            if (r1 != r2) goto L34
            java.io.InputStream r2 = r4.src
            int r2 = r2.read()
            if (r2 == r3) goto L34
            if (r2 < 0) goto L34
            r4.lastC = r2
        L34:
            if (r1 >= 0) goto L38
            r0 = 0
            return r0
        L38:
            byte[] r0 = r0.toByteArray()
            java.lang.String r0 = org.bouncycastle.util.Strings.fromUTF8ByteArray(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.mime.LineReader.readLine():java.lang.String");
    }
}
