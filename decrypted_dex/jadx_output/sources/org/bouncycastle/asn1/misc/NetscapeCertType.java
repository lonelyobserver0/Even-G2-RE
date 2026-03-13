package org.bouncycastle.asn1.misc;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.DERBitString;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NetscapeCertType extends DERBitString {
    public static final int objectSigning = 16;
    public static final int objectSigningCA = 1;
    public static final int reserved = 8;
    public static final int smime = 32;
    public static final int smimeCA = 2;
    public static final int sslCA = 4;
    public static final int sslClient = 128;
    public static final int sslServer = 64;

    public NetscapeCertType(int i3) {
        super(ASN1BitString.getBytes(i3), ASN1BitString.getPadBits(i3));
    }

    public boolean hasUsages(int i3) {
        return (intValue() & i3) == i3;
    }

    @Override // org.bouncycastle.asn1.ASN1BitString
    public String toString() {
        return StubApp.getString2(27144) + Integer.toHexString(intValue());
    }

    public NetscapeCertType(ASN1BitString aSN1BitString) {
        super(aSN1BitString.getBytes(), aSN1BitString.getPadBits());
    }
}
