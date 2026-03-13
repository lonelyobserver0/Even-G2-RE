package org.bouncycastle.cert.ocsp;

import com.stub.StubApp;
import java.util.Date;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ocsp.RevokedInfo;
import org.bouncycastle.asn1.x509.CRLReason;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RevokedStatus implements CertificateStatus {
    RevokedInfo info;

    public RevokedStatus(Date date, int i3) {
        this.info = new RevokedInfo(new ASN1GeneralizedTime(date), CRLReason.lookup(i3));
    }

    public int getRevocationReason() {
        if (this.info.getRevocationReason() != null) {
            return this.info.getRevocationReason().getValue().intValue();
        }
        throw new IllegalStateException(StubApp.getString2(28115));
    }

    public Date getRevocationTime() {
        return OCSPUtils.extractDate(this.info.getRevocationTime());
    }

    public boolean hasRevocationReason() {
        return this.info.getRevocationReason() != null;
    }

    public RevokedStatus(RevokedInfo revokedInfo) {
        this.info = revokedInfo;
    }
}
