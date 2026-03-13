package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PublicEncryptionKey extends ASN1Object {
    private final BasePublicEncryptionKey publicKey;
    private final SymmAlgorithm supportedSymmAlg;

    public static class Builder {
        private BasePublicEncryptionKey publicKey;
        private SymmAlgorithm supportedSymmAlg;

        public PublicEncryptionKey createPublicEncryptionKey() {
            return new PublicEncryptionKey(this.supportedSymmAlg, this.publicKey);
        }

        public Builder setPublicKey(BasePublicEncryptionKey basePublicEncryptionKey) {
            this.publicKey = basePublicEncryptionKey;
            return this;
        }

        public Builder setSupportedSymmAlg(SymmAlgorithm symmAlgorithm) {
            this.supportedSymmAlg = symmAlgorithm;
            return this;
        }
    }

    private PublicEncryptionKey(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(StubApp.getString2(26892));
        }
        this.supportedSymmAlg = SymmAlgorithm.getInstance((Object) aSN1Sequence.getObjectAt(0));
        this.publicKey = BasePublicEncryptionKey.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicEncryptionKey getInstance(Object obj) {
        if (obj instanceof PublicEncryptionKey) {
            return (PublicEncryptionKey) obj;
        }
        if (obj != null) {
            return new PublicEncryptionKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BasePublicEncryptionKey getPublicKey() {
        return this.publicKey;
    }

    public SymmAlgorithm getSupportedSymmAlg() {
        return this.supportedSymmAlg;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return ItsUtils.toSequence(this.supportedSymmAlg, this.publicKey);
    }

    public PublicEncryptionKey(SymmAlgorithm symmAlgorithm, BasePublicEncryptionKey basePublicEncryptionKey) {
        this.supportedSymmAlg = symmAlgorithm;
        this.publicKey = basePublicEncryptionKey;
    }
}
