package org.bouncycastle.crypto.signers;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.math.ec.rfc8032.Ed448;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Ed448Signer implements Signer {
    private final Buffer buffer = new Buffer(null);
    private final byte[] context;
    private boolean forSigning;
    private Ed448PrivateKeyParameters privateKey;
    private Ed448PublicKeyParameters publicKey;

    /* renamed from: org.bouncycastle.crypto.signers.Ed448Signer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Buffer extends ByteArrayOutputStream {
        private Buffer() {
        }

        public synchronized byte[] generateSignature(Ed448PrivateKeyParameters ed448PrivateKeyParameters, byte[] bArr) {
            byte[] bArr2;
            bArr2 = new byte[114];
            ed448PrivateKeyParameters.sign(0, bArr, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, bArr2, 0);
            reset();
            return bArr2;
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized void reset() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
            ((ByteArrayOutputStream) this).count = 0;
        }

        public synchronized boolean verifySignature(Ed448PublicKeyParameters ed448PublicKeyParameters, byte[] bArr, byte[] bArr2) {
            if (114 != bArr2.length) {
                reset();
                return false;
            }
            boolean verify = Ed448.verify(bArr2, 0, ed448PublicKeyParameters.getEncoded(), 0, bArr, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            reset();
            return verify;
        }

        public /* synthetic */ Buffer(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public Ed448Signer(byte[] bArr) {
        this.context = Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        Ed448PrivateKeyParameters ed448PrivateKeyParameters;
        if (!this.forSigning || (ed448PrivateKeyParameters = this.privateKey) == null) {
            throw new IllegalStateException(StubApp.getString2(29307));
        }
        return this.buffer.generateSignature(ed448PrivateKeyParameters, this.context);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z2, CipherParameters cipherParameters) {
        this.forSigning = z2;
        Ed448PublicKeyParameters ed448PublicKeyParameters = null;
        if (z2) {
            this.privateKey = (Ed448PrivateKeyParameters) cipherParameters;
        } else {
            this.privateKey = null;
            ed448PublicKeyParameters = (Ed448PublicKeyParameters) cipherParameters;
        }
        this.publicKey = ed448PublicKeyParameters;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(28197), BERTags.FLAGS, cipherParameters, z2));
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
        Ed448PublicKeyParameters ed448PublicKeyParameters;
        if (this.forSigning || (ed448PublicKeyParameters = this.publicKey) == null) {
            throw new IllegalStateException(StubApp.getString2(29308));
        }
        return this.buffer.verifySignature(ed448PublicKeyParameters, this.context, bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i3, int i10) {
        this.buffer.write(bArr, i3, i10);
    }
}
