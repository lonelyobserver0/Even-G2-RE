package va;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.KeyTransRecipientId;

/* renamed from: va.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1843d extends e {
    public C1843d() {
    }

    public static void i(StringBuilder sb2, KeyTransRecipientId keyTransRecipientId, X509Certificate x509Certificate, X509CertificateHolder x509CertificateHolder) {
        BigInteger serialNumber = keyTransRecipientId.getSerialNumber();
        if (serialNumber != null) {
            BigInteger serialNumber2 = x509Certificate.getSerialNumber();
            String bigInteger = serialNumber2 != null ? serialNumber2.toString(16) : StubApp.getString2(351);
            sb2.append(StubApp.getString2(23682));
            sb2.append(serialNumber.toString(16));
            sb2.append(StubApp.getString2(23683));
            sb2.append(bigInteger);
            sb2.append(StubApp.getString2(23684));
            sb2.append(keyTransRecipientId.getIssuer());
            sb2.append(StubApp.getString2(23685));
            sb2.append(x509CertificateHolder == null ? StubApp.getString2(1116) : x509CertificateHolder.getIssuer());
            sb2.append(StubApp.getString2(22827));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0220 A[Catch: CertificateEncodingException -> 0x0065, KeyStoreException -> 0x0068, CMSException -> 0x006b, TryCatch #5 {KeyStoreException -> 0x0068, CertificateEncodingException -> 0x0065, CMSException -> 0x006b, blocks: (B:13:0x0055, B:15:0x005b, B:16:0x006f, B:19:0x007d, B:22:0x0087, B:23:0x0099, B:25:0x009f, B:26:0x00ba, B:28:0x00c0, B:30:0x00ce, B:33:0x00d4, B:36:0x00e9, B:38:0x00ed, B:40:0x0104, B:35:0x0113, B:50:0x0124, B:52:0x0129, B:54:0x0148, B:56:0x0154, B:59:0x015e, B:63:0x0166, B:64:0x016a, B:65:0x01cf, B:70:0x0170, B:71:0x0175, B:72:0x0176, B:74:0x017a, B:75:0x018c, B:79:0x0193, B:80:0x0197, B:82:0x01af, B:84:0x01c1, B:88:0x01cd, B:95:0x01a3, B:96:0x01a9, B:92:0x019d, B:93:0x01a2, B:99:0x01df, B:100:0x01e4, B:101:0x01e5, B:102:0x01f0, B:103:0x01f1, B:104:0x021f, B:105:0x0220, B:106:0x022b), top: B:12:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[Catch: CertificateEncodingException -> 0x0065, KeyStoreException -> 0x0068, CMSException -> 0x006b, TryCatch #5 {KeyStoreException -> 0x0068, CertificateEncodingException -> 0x0065, CMSException -> 0x006b, blocks: (B:13:0x0055, B:15:0x005b, B:16:0x006f, B:19:0x007d, B:22:0x0087, B:23:0x0099, B:25:0x009f, B:26:0x00ba, B:28:0x00c0, B:30:0x00ce, B:33:0x00d4, B:36:0x00e9, B:38:0x00ed, B:40:0x0104, B:35:0x0113, B:50:0x0124, B:52:0x0129, B:54:0x0148, B:56:0x0154, B:59:0x015e, B:63:0x0166, B:64:0x016a, B:65:0x01cf, B:70:0x0170, B:71:0x0175, B:72:0x0176, B:74:0x017a, B:75:0x018c, B:79:0x0193, B:80:0x0197, B:82:0x01af, B:84:0x01c1, B:88:0x01cd, B:95:0x01a3, B:96:0x01a9, B:92:0x019d, B:93:0x01a2, B:99:0x01df, B:100:0x01e4, B:101:0x01e5, B:102:0x01f0, B:103:0x01f1, B:104:0x021f, B:105:0x0220, B:106:0x022b), top: B:12:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    @Override // va.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(sa.C1610c r21, oa.C1468a r22, com.google.android.gms.internal.measurement.L1 r23) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: va.C1843d.h(sa.c, oa.a, com.google.android.gms.internal.measurement.L1):void");
    }

    public C1843d(AbstractC1842c abstractC1842c) {
        throw null;
    }
}
