package org.bouncycastle.pkix.jcajce;

import java.util.Date;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class CertStatus {
    public static final int UNDETERMINED = 12;
    public static final int UNREVOKED = 11;
    int certStatus = 11;
    Date revocationDate = null;

    public int getCertStatus() {
        return this.certStatus;
    }

    public Date getRevocationDate() {
        return this.revocationDate;
    }

    public void setCertStatus(int i3) {
        this.certStatus = i3;
    }

    public void setRevocationDate(Date date) {
        this.revocationDate = date;
    }
}
