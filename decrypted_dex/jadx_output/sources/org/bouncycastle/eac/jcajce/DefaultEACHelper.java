package org.bouncycastle.eac.jcajce;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DefaultEACHelper implements EACHelper {
    @Override // org.bouncycastle.eac.jcajce.EACHelper
    public KeyFactory createKeyFactory(String str) throws NoSuchAlgorithmException {
        return KeyFactory.getInstance(str);
    }
}
