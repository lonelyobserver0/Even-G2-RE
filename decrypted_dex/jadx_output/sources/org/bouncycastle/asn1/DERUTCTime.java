package org.bouncycastle.asn1;

import java.util.Date;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DERUTCTime extends ASN1UTCTime {
    public DERUTCTime(String str) {
        super(str);
    }

    public DERUTCTime(Date date) {
        super(date);
    }

    public DERUTCTime(byte[] bArr) {
        super(bArr);
    }
}
