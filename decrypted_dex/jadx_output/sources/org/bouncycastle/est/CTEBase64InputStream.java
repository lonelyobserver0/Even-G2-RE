package org.bouncycastle.est;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class CTEBase64InputStream extends InputStream {
    protected boolean end;
    protected final Long max;
    protected long read;
    protected int rp;
    protected final InputStream src;
    protected int wp;
    protected final byte[] rawBuf = new byte[1024];
    protected final byte[] data = new byte[768];
    protected final OutputStream dataOutputStream = new OutputStream() { // from class: org.bouncycastle.est.CTEBase64InputStream.1
        @Override // java.io.OutputStream
        public void write(int i3) throws IOException {
            CTEBase64InputStream cTEBase64InputStream = CTEBase64InputStream.this;
            byte[] bArr = cTEBase64InputStream.data;
            int i10 = cTEBase64InputStream.wp;
            cTEBase64InputStream.wp = i10 + 1;
            bArr[i10] = (byte) i3;
        }
    };

    public CTEBase64InputStream(InputStream inputStream, Long l9) {
        this.src = inputStream;
        this.max = l9;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.src.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        org.bouncycastle.util.encoders.Base64.decode(r11.rawBuf, 0, r2, r11.dataOutputStream);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        throw new java.io.IOException(E1.a.i(com.stub.StubApp.getString2(29442), r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int pullFromSrc() throws java.io.IOException {
        /*
            r11 = this;
            long r0 = r11.read
            java.lang.Long r2 = r11.max
            long r2 = r2.longValue()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = -1
            if (r0 < 0) goto Le
            return r1
        Le:
            r0 = 0
            r2 = r0
        L10:
            java.io.InputStream r3 = r11.src
            int r3 = r3.read()
            r4 = 33
            r5 = 1
            r7 = 10
            if (r3 >= r4) goto L2d
            r4 = 13
            if (r3 == r4) goto L2d
            if (r3 != r7) goto L25
            goto L2d
        L25:
            if (r3 < 0) goto L3d
            long r8 = r11.read
            long r8 = r8 + r5
            r11.read = r8
            goto L3d
        L2d:
            byte[] r4 = r11.rawBuf
            int r8 = r4.length
            if (r2 >= r8) goto L74
            int r8 = r2 + 1
            byte r9 = (byte) r3
            r4[r2] = r9
            long r9 = r11.read
            long r9 = r9 + r5
            r11.read = r9
            r2 = r8
        L3d:
            if (r3 <= r1) goto L52
            byte[] r4 = r11.rawBuf
            int r4 = r4.length
            if (r2 >= r4) goto L52
            if (r3 == r7) goto L52
            long r4 = r11.read
            java.lang.Long r6 = r11.max
            long r6 = r6.longValue()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L10
        L52:
            if (r2 <= 0) goto L6e
            byte[] r1 = r11.rawBuf     // Catch: java.lang.Exception -> L5c
            java.io.OutputStream r3 = r11.dataOutputStream     // Catch: java.lang.Exception -> L5c
            org.bouncycastle.util.encoders.Base64.decode(r1, r0, r2, r3)     // Catch: java.lang.Exception -> L5c
            goto L71
        L5c:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r2 = 29442(0x7302, float:4.1257E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            java.lang.String r0 = E1.a.i(r2, r0)
            r1.<init>(r0)
            throw r1
        L6e:
            if (r3 != r1) goto L71
            return r1
        L71:
            int r0 = r11.wp
            return r0
        L74:
            java.io.IOException r0 = new java.io.IOException
            r1 = 29443(0x7303, float:4.1258E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.est.CTEBase64InputStream.pullFromSrc():int");
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.rp == this.wp) {
            this.rp = 0;
            this.wp = 0;
            int pullFromSrc = pullFromSrc();
            if (pullFromSrc == -1) {
                return pullFromSrc;
            }
        }
        byte[] bArr = this.data;
        int i3 = this.rp;
        this.rp = i3 + 1;
        return bArr[i3] & UByte.MAX_VALUE;
    }
}
