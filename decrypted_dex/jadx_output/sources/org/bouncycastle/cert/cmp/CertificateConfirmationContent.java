package org.bouncycastle.cert.cmp;

import org.bouncycastle.asn1.cmp.CertConfirmContent;
import org.bouncycastle.asn1.cmp.CertStatus;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertificateConfirmationContent {
    private CertConfirmContent content;
    private DigestAlgorithmIdentifierFinder digestAlgFinder;

    public CertificateConfirmationContent(CertConfirmContent certConfirmContent) {
        this(certConfirmContent, new DefaultDigestAlgorithmIdentifierFinder());
    }

    public CertificateStatus[] getStatusMessages() {
        CertStatus[] certStatusArray = this.content.toCertStatusArray();
        int length = certStatusArray.length;
        CertificateStatus[] certificateStatusArr = new CertificateStatus[length];
        for (int i3 = 0; i3 != length; i3++) {
            certificateStatusArr[i3] = new CertificateStatus(this.digestAlgFinder, certStatusArray[i3]);
        }
        return certificateStatusArr;
    }

    public CertConfirmContent toASN1Structure() {
        return this.content;
    }

    public CertificateConfirmationContent(CertConfirmContent certConfirmContent, DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        this.digestAlgFinder = digestAlgorithmIdentifierFinder;
        this.content = certConfirmContent;
    }
}
