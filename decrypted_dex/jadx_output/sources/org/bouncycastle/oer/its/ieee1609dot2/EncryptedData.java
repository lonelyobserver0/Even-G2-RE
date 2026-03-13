package org.bouncycastle.oer.its.ieee1609dot2;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EncryptedData extends ASN1Object {
    private final SymmetricCiphertext ciphertext;
    private final SequenceOfRecipientInfo recipients;

    public static class Builder {
        private SymmetricCiphertext ciphertext;
        private SequenceOfRecipientInfo recipients;

        public EncryptedData createEncryptedData() {
            return new EncryptedData(this.recipients, this.ciphertext);
        }

        public Builder setCiphertext(SymmetricCiphertext symmetricCiphertext) {
            this.ciphertext = symmetricCiphertext;
            return this;
        }

        public Builder setRecipients(SequenceOfRecipientInfo sequenceOfRecipientInfo) {
            this.recipients = sequenceOfRecipientInfo;
            return this;
        }
    }

    private EncryptedData(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(StubApp.getString2(26892));
        }
        this.recipients = SequenceOfRecipientInfo.getInstance(aSN1Sequence.getObjectAt(0));
        this.ciphertext = SymmetricCiphertext.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EncryptedData getInstance(Object obj) {
        if (obj instanceof EncryptedData) {
            return (EncryptedData) obj;
        }
        if (obj != null) {
            return new EncryptedData(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public SymmetricCiphertext getCiphertext() {
        return this.ciphertext;
    }

    public SequenceOfRecipientInfo getRecipients() {
        return this.recipients;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return ItsUtils.toSequence(this.recipients, this.ciphertext);
    }

    public EncryptedData(SequenceOfRecipientInfo sequenceOfRecipientInfo, SymmetricCiphertext symmetricCiphertext) {
        this.recipients = sequenceOfRecipientInfo;
        this.ciphertext = symmetricCiphertext;
    }
}
