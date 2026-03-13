package org.bouncycastle.asn1.cmc;

import E1.a;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OtherStatusInfo extends ASN1Object implements ASN1Choice {
    private final ExtendedFailInfo extendedFailInfo;
    private final CMCFailInfo failInfo;
    private final PendInfo pendInfo;

    public OtherStatusInfo(CMCFailInfo cMCFailInfo) {
        this(cMCFailInfo, null, null);
    }

    public static OtherStatusInfo getInstance(Object obj) {
        if (obj instanceof OtherStatusInfo) {
            return (OtherStatusInfo) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1Integer) {
                return new OtherStatusInfo(CMCFailInfo.getInstance(aSN1Primitive));
            }
            if (aSN1Primitive instanceof ASN1Sequence) {
                return ((ASN1Sequence) aSN1Primitive).getObjectAt(0) instanceof ASN1ObjectIdentifier ? new OtherStatusInfo(ExtendedFailInfo.getInstance(aSN1Primitive)) : new OtherStatusInfo(PendInfo.getInstance(aSN1Primitive));
            }
        } else if (obj instanceof byte[]) {
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException e10) {
                throw new IllegalArgumentException(u.q(e10, new StringBuilder(StubApp.getString2(26874))));
            }
        }
        throw new IllegalArgumentException(a.h(obj, StubApp.getString2(26868)));
    }

    public boolean isExtendedFailInfo() {
        return this.extendedFailInfo != null;
    }

    public boolean isFailInfo() {
        return this.failInfo != null;
    }

    public boolean isPendingInfo() {
        return this.pendInfo != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        PendInfo pendInfo = this.pendInfo;
        if (pendInfo != null) {
            return pendInfo.toASN1Primitive();
        }
        CMCFailInfo cMCFailInfo = this.failInfo;
        return cMCFailInfo != null ? cMCFailInfo.toASN1Primitive() : this.extendedFailInfo.toASN1Primitive();
    }

    private OtherStatusInfo(CMCFailInfo cMCFailInfo, PendInfo pendInfo, ExtendedFailInfo extendedFailInfo) {
        this.failInfo = cMCFailInfo;
        this.pendInfo = pendInfo;
        this.extendedFailInfo = extendedFailInfo;
    }

    public OtherStatusInfo(ExtendedFailInfo extendedFailInfo) {
        this(null, null, extendedFailInfo);
    }

    public OtherStatusInfo(PendInfo pendInfo) {
        this(null, pendInfo, null);
    }
}
