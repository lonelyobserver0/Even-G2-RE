package org.bouncycastle.jcajce.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Cipher;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CipherOutputStream extends FilterOutputStream {
    private final Cipher cipher;
    private final byte[] oneByte;

    public CipherOutputStream(OutputStream outputStream, Cipher cipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.cipher = cipher;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:0|(4:1|2|(1:4)|6)|7|8|(1:10)(1:12)) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws java.io.IOException {
        /*
            r3 = this;
            javax.crypto.Cipher r0 = r3.cipher     // Catch: java.lang.Exception -> Le java.security.GeneralSecurityException -> L10
            byte[] r0 = r0.doFinal()     // Catch: java.lang.Exception -> Le java.security.GeneralSecurityException -> L10
            if (r0 == 0) goto L12
            java.io.OutputStream r1 = r3.out     // Catch: java.lang.Exception -> Le java.security.GeneralSecurityException -> L10
            r1.write(r0)     // Catch: java.lang.Exception -> Le java.security.GeneralSecurityException -> L10
            goto L12
        Le:
            r0 = move-exception
            goto L14
        L10:
            r0 = move-exception
            goto L26
        L12:
            r0 = 0
            goto L33
        L14:
            java.io.IOException r1 = new java.io.IOException
            r2 = 29004(0x714c, float:4.0643E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            java.lang.String r0 = E1.a.i(r2, r0)
            r1.<init>(r0)
        L24:
            r0 = r1
            goto L33
        L26:
            org.bouncycastle.crypto.io.InvalidCipherTextIOException r1 = new org.bouncycastle.crypto.io.InvalidCipherTextIOException
            r2 = 29646(0x73ce, float:4.1543E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r1.<init>(r2, r0)
            goto L24
        L33:
            r3.flush()     // Catch: java.io.IOException -> L3c
            java.io.OutputStream r1 = r3.out     // Catch: java.io.IOException -> L3c
            r1.close()     // Catch: java.io.IOException -> L3c
            goto L40
        L3c:
            r1 = move-exception
            if (r0 != 0) goto L40
            r0 = r1
        L40:
            if (r0 != 0) goto L43
            return
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.io.CipherOutputStream.close():void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i3) throws IOException {
        byte[] bArr = this.oneByte;
        bArr[0] = (byte) i3;
        write(bArr, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) throws IOException {
        byte[] update = this.cipher.update(bArr, i3, i10);
        if (update != null) {
            ((FilterOutputStream) this).out.write(update);
        }
    }
}
