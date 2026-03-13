package org.bouncycastle.asn1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DERFactory {
    static final DERSequence EMPTY_SEQUENCE = new DERSequence();
    static final DERSet EMPTY_SET = new DERSet();

    public static DERSequence createSequence(ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.size() < 1 ? EMPTY_SEQUENCE : new DERSequence(aSN1EncodableVector);
    }

    public static DERSet createSet(ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.size() < 1 ? EMPTY_SET : new DERSet(aSN1EncodableVector);
    }
}
