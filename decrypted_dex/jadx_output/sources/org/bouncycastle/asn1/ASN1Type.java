package org.bouncycastle.asn1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
abstract class ASN1Type {
    final Class javaClass;

    public ASN1Type(Class cls) {
        this.javaClass = cls;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final Class getJavaClass() {
        return this.javaClass;
    }

    public final int hashCode() {
        return super.hashCode();
    }
}
