package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PolicyQualifierId extends ASN1ObjectIdentifier {
    private static final String id_qt = StubApp.getString2(27839);
    public static final PolicyQualifierId id_qt_cps = new PolicyQualifierId(StubApp.getString2(27837));
    public static final PolicyQualifierId id_qt_unotice = new PolicyQualifierId(StubApp.getString2(27838));

    private PolicyQualifierId(String str) {
        super(str);
    }
}
