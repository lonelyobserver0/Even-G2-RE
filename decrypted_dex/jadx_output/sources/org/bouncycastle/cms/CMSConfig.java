package org.bouncycastle.cms;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSConfig {
    public static void setSigningDigestAlgorithmMapping(String str, String str2) {
        new ASN1ObjectIdentifier(str);
    }

    public static void setSigningEncryptionAlgorithmMapping(String str, String str2) {
        CMSSignedHelper.INSTANCE.setSigningEncryptionAlgorithmMapping(new ASN1ObjectIdentifier(str), str2);
    }
}
