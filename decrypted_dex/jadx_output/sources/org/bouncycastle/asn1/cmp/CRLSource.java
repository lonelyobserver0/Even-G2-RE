package org.bouncycastle.asn1.cmp;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.GeneralNames;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CRLSource extends ASN1Object implements ASN1Choice {
    private final DistributionPointName dpn;
    private final GeneralNames issuer;

    private CRLSource(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            this.dpn = DistributionPointName.getInstance(aSN1TaggedObject, true);
            this.issuer = null;
        } else {
            if (tagNo != 1) {
                throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(26756))));
            }
            this.dpn = null;
            this.issuer = GeneralNames.getInstance(aSN1TaggedObject, true);
        }
    }

    public static CRLSource getInstance(Object obj) {
        if (obj instanceof CRLSource) {
            return (CRLSource) obj;
        }
        if (obj != null) {
            return new CRLSource(ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    public DistributionPointName getDpn() {
        return this.dpn;
    }

    public GeneralNames getIssuer() {
        return this.issuer;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        DistributionPointName distributionPointName = this.dpn;
        return distributionPointName != null ? new DERTaggedObject(true, 0, (ASN1Encodable) distributionPointName) : new DERTaggedObject(true, 1, (ASN1Encodable) this.issuer);
    }

    public CRLSource(DistributionPointName distributionPointName, GeneralNames generalNames) {
        if ((distributionPointName == null) == (generalNames == null)) {
            throw new IllegalArgumentException(StubApp.getString2(26881));
        }
        this.dpn = distributionPointName;
        this.issuer = generalNames;
    }
}
