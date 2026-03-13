package org.bouncycastle.oer.its.ieee1609dot2;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HeaderInfoContributorId extends ASN1Object {
    private static final BigInteger MAX = BigInteger.valueOf(255);
    private final BigInteger contributorId;

    public HeaderInfoContributorId(long j) {
        this(BigInteger.valueOf(j));
    }

    public static HeaderInfoContributorId getInstance(Object obj) {
        if (obj instanceof HeaderInfoContributorId) {
            return (HeaderInfoContributorId) obj;
        }
        if (obj != null) {
            return new HeaderInfoContributorId(ASN1Integer.getInstance(obj));
        }
        return null;
    }

    public BigInteger getContributorId() {
        return this.contributorId;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new ASN1Integer(this.contributorId);
    }

    public HeaderInfoContributorId(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 || bigInteger.compareTo(MAX) <= 0) {
            this.contributorId = bigInteger;
            return;
        }
        throw new IllegalArgumentException(StubApp.getString2(33183) + bigInteger + StubApp.getString2(33184));
    }

    private HeaderInfoContributorId(ASN1Integer aSN1Integer) {
        this(aSN1Integer.getValue());
    }
}
