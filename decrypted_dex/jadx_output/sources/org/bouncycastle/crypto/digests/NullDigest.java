package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NullDigest implements Digest {
    private OpenByteArrayOutputStream bOut = new OpenByteArrayOutputStream(null);

    /* renamed from: org.bouncycastle.crypto.digests.NullDigest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class OpenByteArrayOutputStream extends ByteArrayOutputStream {
        private OpenByteArrayOutputStream() {
        }

        public void copy(byte[] bArr, int i3) {
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArr, i3, size());
        }

        @Override // java.io.ByteArrayOutputStream
        public void reset() {
            super.reset();
            Arrays.clear(((ByteArrayOutputStream) this).buf);
        }

        public /* synthetic */ OpenByteArrayOutputStream(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        int size = this.bOut.size();
        this.bOut.copy(bArr, i3);
        reset();
        return size;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(3796);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.bOut.size();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.bOut.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b2) {
        this.bOut.write(b2);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i3, int i10) {
        this.bOut.write(bArr, i3, i10);
    }
}
