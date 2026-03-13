package org.bouncycastle.crypto.util;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JournalingSecureRandom extends SecureRandom {
    private static byte[] EMPTY_TRANSCRIPT = new byte[0];
    private final SecureRandom base;
    private int index;
    private TranscriptStream tOut;
    private byte[] transcript;

    /* renamed from: org.bouncycastle.crypto.util.JournalingSecureRandom$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class TranscriptStream extends ByteArrayOutputStream {
        private TranscriptStream() {
        }

        public void clear() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, (byte) 0);
        }

        public /* synthetic */ TranscriptStream(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public JournalingSecureRandom() {
        this(CryptoServicesRegistrar.getSecureRandom());
    }

    public void clear() {
        Arrays.fill(this.transcript, (byte) 0);
        this.tOut.clear();
    }

    public byte[] getFullTranscript() {
        int i3 = this.index;
        byte[] bArr = this.transcript;
        return i3 == bArr.length ? this.tOut.toByteArray() : Arrays.clone(bArr);
    }

    public byte[] getTranscript() {
        return this.tOut.toByteArray();
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        if (this.index >= this.transcript.length) {
            this.base.nextBytes(bArr);
        } else {
            int i3 = 0;
            while (i3 != bArr.length) {
                int i10 = this.index;
                byte[] bArr2 = this.transcript;
                if (i10 >= bArr2.length) {
                    break;
                }
                this.index = i10 + 1;
                bArr[i3] = bArr2[i10];
                i3++;
            }
            if (i3 != bArr.length) {
                int length = bArr.length - i3;
                byte[] bArr3 = new byte[length];
                this.base.nextBytes(bArr3);
                System.arraycopy(bArr3, 0, bArr, i3, length);
            }
        }
        try {
            this.tOut.write(bArr);
        } catch (IOException e10) {
            throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(29350))));
        }
    }

    public void reset() {
        this.index = 0;
        if (this.transcript.length == 0) {
            this.transcript = this.tOut.toByteArray();
        }
        this.tOut.reset();
    }

    public JournalingSecureRandom(SecureRandom secureRandom) {
        this.tOut = new TranscriptStream(null);
        this.index = 0;
        this.base = secureRandom;
        this.transcript = EMPTY_TRANSCRIPT;
    }

    public JournalingSecureRandom(byte[] bArr, SecureRandom secureRandom) {
        this.tOut = new TranscriptStream(null);
        this.index = 0;
        this.base = secureRandom;
        this.transcript = Arrays.clone(bArr);
    }
}
