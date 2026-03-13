package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.ItsUtils;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PsidSsp extends ASN1Object {
    private final Psid psid;
    private final ServiceSpecificPermissions ssp;

    public static class Builder {
        private Psid psid;
        private ServiceSpecificPermissions ssp;

        public PsidSsp createPsidSsp() {
            return new PsidSsp(this.psid, this.ssp);
        }

        public Builder setPsid(Psid psid) {
            this.psid = psid;
            return this;
        }

        public Builder setSsp(ServiceSpecificPermissions serviceSpecificPermissions) {
            this.ssp = serviceSpecificPermissions;
            return this;
        }
    }

    private PsidSsp(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(StubApp.getString2(26892));
        }
        this.psid = Psid.getInstance(aSN1Sequence.getObjectAt(0));
        this.ssp = (ServiceSpecificPermissions) OEROptional.getValue(ServiceSpecificPermissions.class, aSN1Sequence.getObjectAt(1));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PsidSsp getInstance(Object obj) {
        if (obj instanceof PsidSsp) {
            return (PsidSsp) obj;
        }
        if (obj != null) {
            return new PsidSsp(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Psid getPsid() {
        return this.psid;
    }

    public ServiceSpecificPermissions getSsp() {
        return this.ssp;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return ItsUtils.toSequence(this.psid, OEROptional.getInstance(this.ssp));
    }

    public PsidSsp(Psid psid, ServiceSpecificPermissions serviceSpecificPermissions) {
        this.psid = psid;
        this.ssp = serviceSpecificPermissions;
    }
}
