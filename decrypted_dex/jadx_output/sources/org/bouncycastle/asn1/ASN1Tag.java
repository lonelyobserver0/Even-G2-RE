package org.bouncycastle.asn1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class ASN1Tag {
    private final int tagClass;
    private final int tagNumber;

    private ASN1Tag(int i3, int i10) {
        this.tagClass = i3;
        this.tagNumber = i10;
    }

    public static ASN1Tag create(int i3, int i10) {
        return new ASN1Tag(i3, i10);
    }

    public int getTagClass() {
        return this.tagClass;
    }

    public int getTagNumber() {
        return this.tagNumber;
    }
}
