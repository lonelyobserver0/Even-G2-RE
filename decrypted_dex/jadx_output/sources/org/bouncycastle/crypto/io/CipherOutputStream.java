package org.bouncycastle.crypto.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.modes.AEADBlockCipher;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CipherOutputStream extends FilterOutputStream {
    private AEADBlockCipher aeadBlockCipher;
    private byte[] buf;
    private BufferedBlockCipher bufferedBlockCipher;
    private final byte[] oneByte;
    private StreamCipher streamCipher;

    public CipherOutputStream(OutputStream outputStream, BufferedBlockCipher bufferedBlockCipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.bufferedBlockCipher = bufferedBlockCipher;
    }

    private void ensureCapacity(int i3, boolean z2) {
        if (z2) {
            BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
            if (bufferedBlockCipher != null) {
                i3 = bufferedBlockCipher.getOutputSize(i3);
            } else {
                AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
                if (aEADBlockCipher != null) {
                    i3 = aEADBlockCipher.getOutputSize(i3);
                }
            }
        } else {
            BufferedBlockCipher bufferedBlockCipher2 = this.bufferedBlockCipher;
            if (bufferedBlockCipher2 != null) {
                i3 = bufferedBlockCipher2.getUpdateOutputSize(i3);
            } else {
                AEADBlockCipher aEADBlockCipher2 = this.aeadBlockCipher;
                if (aEADBlockCipher2 != null) {
                    i3 = aEADBlockCipher2.getUpdateOutputSize(i3);
                }
            }
        }
        byte[] bArr = this.buf;
        if (bArr == null || bArr.length < i3) {
            this.buf = new byte[i3];
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:0|1|(4:2|3|(2:5|(1:7))(2:19|(2:21|(1:23))(2:24|(1:26)))|8)|9|10|(1:12)(1:14)) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws java.io.IOException {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            r4.ensureCapacity(r1, r0)
            org.bouncycastle.crypto.BufferedBlockCipher r0 = r4.bufferedBlockCipher     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            if (r0 == 0) goto L1d
            byte[] r2 = r4.buf     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            int r0 = r0.doFinal(r2, r1)     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            if (r0 == 0) goto L38
            java.io.OutputStream r2 = r4.out     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            byte[] r3 = r4.buf     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            r2.write(r3, r1, r0)     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            goto L38
        L19:
            r0 = move-exception
            goto L3a
        L1b:
            r0 = move-exception
            goto L48
        L1d:
            org.bouncycastle.crypto.modes.AEADBlockCipher r0 = r4.aeadBlockCipher     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            if (r0 == 0) goto L31
            byte[] r2 = r4.buf     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            int r0 = r0.doFinal(r2, r1)     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            if (r0 == 0) goto L38
            java.io.OutputStream r2 = r4.out     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            byte[] r3 = r4.buf     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            r2.write(r3, r1, r0)     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            goto L38
        L31:
            org.bouncycastle.crypto.StreamCipher r0 = r4.streamCipher     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            if (r0 == 0) goto L38
            r0.reset()     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
        L38:
            r0 = 0
            goto L55
        L3a:
            org.bouncycastle.crypto.io.CipherIOException r1 = new org.bouncycastle.crypto.io.CipherIOException
            r2 = 29004(0x714c, float:4.0643E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r1.<init>(r2, r0)
        L46:
            r0 = r1
            goto L55
        L48:
            org.bouncycastle.crypto.io.InvalidCipherTextIOException r1 = new org.bouncycastle.crypto.io.InvalidCipherTextIOException
            r2 = 29005(0x714d, float:4.0645E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r1.<init>(r2, r0)
            goto L46
        L55:
            r4.flush()     // Catch: java.io.IOException -> L5e
            java.io.OutputStream r1 = r4.out     // Catch: java.io.IOException -> L5e
            r1.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r1 = move-exception
            if (r0 != 0) goto L62
            r0 = r1
        L62:
            if (r0 != 0) goto L65
            return
        L65:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.io.CipherOutputStream.close():void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i3) throws IOException {
        byte[] bArr = this.oneByte;
        byte b2 = (byte) i3;
        bArr[0] = b2;
        StreamCipher streamCipher = this.streamCipher;
        if (streamCipher != null) {
            ((FilterOutputStream) this).out.write(streamCipher.returnByte(b2));
        } else {
            write(bArr, 0, 1);
        }
    }

    public CipherOutputStream(OutputStream outputStream, StreamCipher streamCipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.streamCipher = streamCipher;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public CipherOutputStream(OutputStream outputStream, AEADBlockCipher aEADBlockCipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.aeadBlockCipher = aEADBlockCipher;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) throws IOException {
        ensureCapacity(i10, false);
        BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
        if (bufferedBlockCipher != null) {
            int processBytes = bufferedBlockCipher.processBytes(bArr, i3, i10, this.buf, 0);
            if (processBytes != 0) {
                ((FilterOutputStream) this).out.write(this.buf, 0, processBytes);
                return;
            }
            return;
        }
        AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
        if (aEADBlockCipher == null) {
            this.streamCipher.processBytes(bArr, i3, i10, this.buf, 0);
            ((FilterOutputStream) this).out.write(this.buf, 0, i10);
        } else {
            int processBytes2 = aEADBlockCipher.processBytes(bArr, i3, i10, this.buf, 0);
            if (processBytes2 != 0) {
                ((FilterOutputStream) this).out.write(this.buf, 0, processBytes2);
            }
        }
    }
}
