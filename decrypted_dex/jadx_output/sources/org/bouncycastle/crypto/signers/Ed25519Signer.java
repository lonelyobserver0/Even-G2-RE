package org.bouncycastle.crypto.signers;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Ed25519Signer implements Signer {
    private final Buffer buffer = new Buffer(null);
    private boolean forSigning;
    private Ed25519PrivateKeyParameters privateKey;
    private Ed25519PublicKeyParameters publicKey;

    /* renamed from: org.bouncycastle.crypto.signers.Ed25519Signer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Buffer extends ByteArrayOutputStream {
        private Buffer() {
        }

        public synchronized byte[] generateSignature(Ed25519PrivateKeyParameters ed25519PrivateKeyParameters) {
            byte[] bArr;
            bArr = new byte[64];
            ed25519PrivateKeyParameters.sign(0, null, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, bArr, 0);
            reset();
            return bArr;
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized void reset() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
            ((ByteArrayOutputStream) this).count = 0;
        }

        public synchronized boolean verifySignature(Ed25519PublicKeyParameters ed25519PublicKeyParameters, byte[] bArr) {
            if (64 != bArr.length) {
                reset();
                return false;
            }
            boolean verify = Ed25519.verify(bArr, 0, ed25519PublicKeyParameters.getEncoded(), 0, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            reset();
            return verify;
        }

        public /* synthetic */ Buffer(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        Ed25519PrivateKeyParameters ed25519PrivateKeyParameters;
        if (!this.forSigning || (ed25519PrivateKeyParameters = this.privateKey) == null) {
            throw new IllegalStateException(StubApp.getString2(29300));
        }
        return this.buffer.generateSignature(ed25519PrivateKeyParameters);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z2, CipherParameters cipherParameters) {
        this.forSigning = z2;
        Ed25519PublicKeyParameters ed25519PublicKeyParameters = null;
        if (z2) {
            this.privateKey = (Ed25519PrivateKeyParameters) cipherParameters;
        } else {
            this.privateKey = null;
            ed25519PublicKeyParameters = (Ed25519PublicKeyParameters) cipherParameters;
        }
        this.publicKey = ed25519PublicKeyParameters;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(28196), 128, cipherParameters, z2));
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.buffer.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b2) {
        this.buffer.write(b2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        Ed25519PublicKeyParameters ed25519PublicKeyParameters;
        if (this.forSigning || (ed25519PublicKeyParameters = this.publicKey) == null) {
            throw new IllegalStateException(StubApp.getString2(29301));
        }
        return this.buffer.verifySignature(ed25519PublicKeyParameters, bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i3, int i10) {
        this.buffer.write(bArr, i3, i10);
    }
}
