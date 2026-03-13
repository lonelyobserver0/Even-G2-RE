package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EciesP256EncryptedKey extends ASN1Object {

    /* renamed from: c, reason: collision with root package name */
    private final ASN1OctetString f19317c;

    /* renamed from: t, reason: collision with root package name */
    private final ASN1OctetString f19318t;

    /* renamed from: v, reason: collision with root package name */
    private final EccP256CurvePoint f19319v;

    public static class Builder {

        /* renamed from: c, reason: collision with root package name */
        private ASN1OctetString f19320c;

        /* renamed from: t, reason: collision with root package name */
        private ASN1OctetString f19321t;

        /* renamed from: v, reason: collision with root package name */
        private EccP256CurvePoint f19322v;

        public EciesP256EncryptedKey createEciesP256EncryptedKey() {
            return new EciesP256EncryptedKey(this.f19322v, this.f19320c, this.f19321t);
        }

        public Builder setC(ASN1OctetString aSN1OctetString) {
            this.f19320c = aSN1OctetString;
            return this;
        }

        public Builder setT(ASN1OctetString aSN1OctetString) {
            this.f19321t = aSN1OctetString;
            return this;
        }

        public Builder setV(EccP256CurvePoint eccP256CurvePoint) {
            this.f19322v = eccP256CurvePoint;
            return this;
        }

        public Builder setC(byte[] bArr) {
            this.f19320c = new DEROctetString(Arrays.clone(bArr));
            return this;
        }

        public Builder setT(byte[] bArr) {
            this.f19321t = new DEROctetString(Arrays.clone(bArr));
            return this;
        }
    }

    private EciesP256EncryptedKey(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException(StubApp.getString2(33170));
        }
        this.f19319v = EccP256CurvePoint.getInstance(aSN1Sequence.getObjectAt(0));
        this.f19317c = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
        this.f19318t = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EciesP256EncryptedKey getInstance(Object obj) {
        if (obj instanceof EciesP256EncryptedKey) {
            return (EciesP256EncryptedKey) obj;
        }
        if (obj != null) {
            return new EciesP256EncryptedKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1OctetString getC() {
        return this.f19317c;
    }

    public ASN1OctetString getT() {
        return this.f19318t;
    }

    public EccP256CurvePoint getV() {
        return this.f19319v;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.f19319v, this.f19317c, this.f19318t});
    }

    public EciesP256EncryptedKey(EccP256CurvePoint eccP256CurvePoint, ASN1OctetString aSN1OctetString, ASN1OctetString aSN1OctetString2) {
        this.f19319v = eccP256CurvePoint;
        this.f19317c = aSN1OctetString;
        this.f19318t = aSN1OctetString2;
    }
}
