package org.bouncycastle.its;

import org.bouncycastle.oer.its.ieee1609dot2.PsidGroupPermissions;
import org.bouncycastle.oer.its.ieee1609dot2.SequenceOfPsidGroupPermissions;
import org.bouncycastle.oer.its.ieee1609dot2.ToBeSignedCertificate;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.CrlSeries;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId3;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PsidSsp;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SequenceOfPsidSsp;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ITSCertificateBuilder {
    protected HashedId3 cracaId;
    protected CrlSeries crlSeries;
    protected final ITSCertificate issuer;
    protected final ToBeSignedCertificate.Builder tbsCertificateBuilder;
    protected UINT8 version;

    public ITSCertificateBuilder(ITSCertificate iTSCertificate, ToBeSignedCertificate.Builder builder) {
        this.version = new UINT8(3);
        this.cracaId = new HashedId3(new byte[3]);
        this.crlSeries = new CrlSeries(0);
        this.issuer = iTSCertificate;
        this.tbsCertificateBuilder = builder;
        builder.setCracaId(this.cracaId);
        builder.setCrlSeries(this.crlSeries);
    }

    public ITSCertificate getIssuer() {
        return this.issuer;
    }

    public ITSCertificateBuilder setAppPermissions(PsidSsp... psidSspArr) {
        SequenceOfPsidSsp.Builder builder = SequenceOfPsidSsp.builder();
        for (int i3 = 0; i3 != psidSspArr.length; i3++) {
            builder.setItem(psidSspArr[i3]);
        }
        this.tbsCertificateBuilder.setAppPermissions(builder.createSequenceOfPsidSsp());
        return this;
    }

    public ITSCertificateBuilder setCertIssuePermissions(PsidGroupPermissions... psidGroupPermissionsArr) {
        this.tbsCertificateBuilder.setCertIssuePermissions(SequenceOfPsidGroupPermissions.builder().addGroupPermission(psidGroupPermissionsArr).createSequenceOfPsidGroupPermissions());
        return this;
    }

    public ITSCertificateBuilder setCracaId(byte[] bArr) {
        HashedId3 hashedId3 = new HashedId3(bArr);
        this.cracaId = hashedId3;
        this.tbsCertificateBuilder.setCracaId(hashedId3);
        return this;
    }

    public ITSCertificateBuilder setCrlSeries(int i3) {
        CrlSeries crlSeries = new CrlSeries(i3);
        this.crlSeries = crlSeries;
        this.tbsCertificateBuilder.setCrlSeries(crlSeries);
        return this;
    }

    public ITSCertificateBuilder setValidityPeriod(ITSValidityPeriod iTSValidityPeriod) {
        this.tbsCertificateBuilder.setValidityPeriod(iTSValidityPeriod.toASN1Structure());
        return this;
    }

    public ITSCertificateBuilder setVersion(int i3) {
        this.version = new UINT8(i3);
        return this;
    }

    public ITSCertificateBuilder(ToBeSignedCertificate.Builder builder) {
        this(null, builder);
    }
}
