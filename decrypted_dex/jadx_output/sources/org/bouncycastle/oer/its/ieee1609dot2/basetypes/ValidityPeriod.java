package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ValidityPeriod extends ASN1Object {
    private final Duration duration;
    private final Time32 start;

    public static class Builder {
        private Duration duration;
        private Time32 start;

        public ValidityPeriod createValidityPeriod() {
            return new ValidityPeriod(this.start, this.duration);
        }

        public Builder setDuration(Duration duration) {
            this.duration = duration;
            return this;
        }

        public Builder setStart(Time32 time32) {
            this.start = time32;
            return this;
        }
    }

    private ValidityPeriod(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(StubApp.getString2(26892));
        }
        this.start = Time32.getInstance((Object) aSN1Sequence.getObjectAt(0));
        this.duration = Duration.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidityPeriod getInstance(Object obj) {
        if (obj instanceof ValidityPeriod) {
            return (ValidityPeriod) obj;
        }
        if (obj != null) {
            return new ValidityPeriod(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Duration getDuration() {
        return this.duration;
    }

    public Time32 getStart() {
        return this.start;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.start, this.duration});
    }

    public String toString() {
        return StubApp.getString2(33234) + this.start + StubApp.getString2(397) + this.duration + StubApp.getString2(511);
    }

    public ValidityPeriod(Time32 time32, Duration duration) {
        this.start = time32;
        this.duration = duration;
    }
}
