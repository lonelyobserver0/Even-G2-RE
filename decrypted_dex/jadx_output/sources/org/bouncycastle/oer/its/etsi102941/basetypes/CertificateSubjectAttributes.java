package org.bouncycastle.oer.its.etsi102941.basetypes;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateId;
import org.bouncycastle.oer.its.ieee1609dot2.SequenceOfPsidGroupPermissions;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.GeographicRegion;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SequenceOfPsidSsp;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SubjectAssurance;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.ValidityPeriod;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertificateSubjectAttributes extends ASN1Object {
    private final SequenceOfPsidSsp appPermissions;
    private final SubjectAssurance assuranceLevel;
    private final SequenceOfPsidGroupPermissions certIssuePermissions;
    private final CertificateId id;
    private final GeographicRegion region;
    private final ValidityPeriod validityPeriod;

    private CertificateSubjectAttributes(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 6) {
            throw new IllegalArgumentException(StubApp.getString2(33177));
        }
        this.id = (CertificateId) OEROptional.getValue(CertificateId.class, aSN1Sequence.getObjectAt(0));
        this.validityPeriod = (ValidityPeriod) OEROptional.getValue(ValidityPeriod.class, aSN1Sequence.getObjectAt(1));
        this.region = (GeographicRegion) OEROptional.getValue(GeographicRegion.class, aSN1Sequence.getObjectAt(2));
        this.assuranceLevel = (SubjectAssurance) OEROptional.getValue(SubjectAssurance.class, aSN1Sequence.getObjectAt(3));
        this.appPermissions = (SequenceOfPsidSsp) OEROptional.getValue(SequenceOfPsidSsp.class, aSN1Sequence.getObjectAt(4));
        this.certIssuePermissions = (SequenceOfPsidGroupPermissions) OEROptional.getValue(SequenceOfPsidGroupPermissions.class, aSN1Sequence.getObjectAt(5));
    }

    public static CertificateSubjectAttributes getInstance(Object obj) {
        if (obj instanceof CertificateSubjectAttributes) {
            return (CertificateSubjectAttributes) obj;
        }
        if (obj != null) {
            return new CertificateSubjectAttributes(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public SequenceOfPsidSsp getAppPermissions() {
        return this.appPermissions;
    }

    public SubjectAssurance getAssuranceLevel() {
        return this.assuranceLevel;
    }

    public SequenceOfPsidGroupPermissions getCertIssuePermissions() {
        return this.certIssuePermissions;
    }

    public CertificateId getId() {
        return this.id;
    }

    public GeographicRegion getRegion() {
        return this.region;
    }

    public ValidityPeriod getValidityPeriod() {
        return this.validityPeriod;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{OEROptional.getInstance(this.id), OEROptional.getInstance(this.validityPeriod), OEROptional.getInstance(this.region), OEROptional.getInstance(this.assuranceLevel), OEROptional.getInstance(this.appPermissions), OEROptional.getInstance(this.certIssuePermissions)});
    }

    public CertificateSubjectAttributes(CertificateId certificateId, ValidityPeriod validityPeriod, GeographicRegion geographicRegion, SubjectAssurance subjectAssurance, SequenceOfPsidSsp sequenceOfPsidSsp, SequenceOfPsidGroupPermissions sequenceOfPsidGroupPermissions) {
        this.id = certificateId;
        this.validityPeriod = validityPeriod;
        this.region = geographicRegion;
        this.assuranceLevel = subjectAssurance;
        this.appPermissions = sequenceOfPsidSsp;
        this.certIssuePermissions = sequenceOfPsidGroupPermissions;
    }
}
