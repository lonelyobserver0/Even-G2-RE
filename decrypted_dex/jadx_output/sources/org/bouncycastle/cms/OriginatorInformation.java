package org.bouncycastle.cms;

import org.bouncycastle.asn1.cms.OriginatorInfo;
import org.bouncycastle.util.Store;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OriginatorInformation {
    private OriginatorInfo originatorInfo;

    public OriginatorInformation(OriginatorInfo originatorInfo) {
        this.originatorInfo = originatorInfo;
    }

    public Store getCRLs() {
        return CMSSignedHelper.INSTANCE.getCRLs(this.originatorInfo.getCRLs());
    }

    public Store getCertificates() {
        return CMSSignedHelper.INSTANCE.getCertificates(this.originatorInfo.getCertificates());
    }

    public OriginatorInfo toASN1Structure() {
        return this.originatorInfo;
    }
}
