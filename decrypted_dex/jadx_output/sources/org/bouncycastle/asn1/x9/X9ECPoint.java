package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X9ECPoint extends ASN1Object {

    /* renamed from: c, reason: collision with root package name */
    private ECCurve f18720c;
    private final ASN1OctetString encoding;

    /* renamed from: p, reason: collision with root package name */
    private ECPoint f18721p;

    public X9ECPoint(ECCurve eCCurve, ASN1OctetString aSN1OctetString) {
        this(eCCurve, aSN1OctetString.getOctets());
    }

    public synchronized ECPoint getPoint() {
        try {
            if (this.f18721p == null) {
                this.f18721p = this.f18720c.decodePoint(this.encoding.getOctets()).normalize();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f18721p;
    }

    public byte[] getPointEncoding() {
        return Arrays.clone(this.encoding.getOctets());
    }

    public boolean isPointCompressed() {
        byte b2;
        byte[] octets = this.encoding.getOctets();
        return octets != null && octets.length > 0 && ((b2 = octets[0]) == 2 || b2 == 3);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.encoding;
    }

    public X9ECPoint(ECCurve eCCurve, byte[] bArr) {
        this.f18720c = eCCurve;
        this.encoding = new DEROctetString(Arrays.clone(bArr));
    }

    public X9ECPoint(ECPoint eCPoint, boolean z2) {
        this.f18721p = eCPoint.normalize();
        this.encoding = new DEROctetString(eCPoint.getEncoded(z2));
    }
}
