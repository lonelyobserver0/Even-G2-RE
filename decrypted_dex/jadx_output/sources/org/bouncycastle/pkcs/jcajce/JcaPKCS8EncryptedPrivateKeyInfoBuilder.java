package org.bouncycastle.pkcs.jcajce;

import java.security.PrivateKey;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfoBuilder;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaPKCS8EncryptedPrivateKeyInfoBuilder extends PKCS8EncryptedPrivateKeyInfoBuilder {
    public JcaPKCS8EncryptedPrivateKeyInfoBuilder(PrivateKey privateKey) {
        super(PrivateKeyInfo.getInstance(privateKey.getEncoded()));
    }
}
