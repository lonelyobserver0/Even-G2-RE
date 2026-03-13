package org.bouncycastle.jce;

import java.util.Enumeration;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECNamedCurveTable {
    public static Enumeration getNames() {
        return org.bouncycastle.asn1.x9.ECNamedCurveTable.getNames();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0011, code lost:
    
        r0 = org.bouncycastle.asn1.x9.ECNamedCurveTable.getByName(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.bouncycastle.jce.spec.ECNamedCurveParameterSpec getParameterSpec(java.lang.String r7) {
        /*
            org.bouncycastle.asn1.x9.X9ECParameters r0 = org.bouncycastle.crypto.ec.CustomNamedCurves.getByName(r7)
            if (r0 != 0) goto L20
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = new org.bouncycastle.asn1.ASN1ObjectIdentifier     // Catch: java.lang.IllegalArgumentException -> Lf
            r1.<init>(r7)     // Catch: java.lang.IllegalArgumentException -> Lf
            org.bouncycastle.asn1.x9.X9ECParameters r0 = org.bouncycastle.crypto.ec.CustomNamedCurves.getByOID(r1)     // Catch: java.lang.IllegalArgumentException -> Lf
        Lf:
            if (r0 != 0) goto L20
            org.bouncycastle.asn1.x9.X9ECParameters r0 = org.bouncycastle.asn1.x9.ECNamedCurveTable.getByName(r7)
            if (r0 != 0) goto L20
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = new org.bouncycastle.asn1.ASN1ObjectIdentifier     // Catch: java.lang.IllegalArgumentException -> L20
            r1.<init>(r7)     // Catch: java.lang.IllegalArgumentException -> L20
            org.bouncycastle.asn1.x9.X9ECParameters r0 = org.bouncycastle.asn1.x9.ECNamedCurveTable.getByOID(r1)     // Catch: java.lang.IllegalArgumentException -> L20
        L20:
            if (r0 != 0) goto L24
            r7 = 0
            return r7
        L24:
            r1 = r0
            org.bouncycastle.jce.spec.ECNamedCurveParameterSpec r0 = new org.bouncycastle.jce.spec.ECNamedCurveParameterSpec
            org.bouncycastle.math.ec.ECCurve r2 = r1.getCurve()
            org.bouncycastle.math.ec.ECPoint r3 = r1.getG()
            java.math.BigInteger r4 = r1.getN()
            java.math.BigInteger r5 = r1.getH()
            byte[] r6 = r1.getSeed()
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.ECNamedCurveTable.getParameterSpec(java.lang.String):org.bouncycastle.jce.spec.ECNamedCurveParameterSpec");
    }
}
