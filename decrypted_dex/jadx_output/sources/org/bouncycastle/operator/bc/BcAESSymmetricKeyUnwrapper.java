package org.bouncycastle.operator.bc;

import org.bouncycastle.crypto.engines.AESWrapEngine;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BcAESSymmetricKeyUnwrapper extends BcSymmetricKeyUnwrapper {
    public BcAESSymmetricKeyUnwrapper(KeyParameter keyParameter) {
        super(AESUtil.determineKeyEncAlg(keyParameter), new AESWrapEngine(), keyParameter);
    }
}
