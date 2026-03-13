package org.bouncycastle.cms.bc;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.operator.GenericKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class CMSUtils {
    public static CipherParameters getBcKey(GenericKey genericKey) {
        if (genericKey.getRepresentation() instanceof CipherParameters) {
            return (CipherParameters) genericKey.getRepresentation();
        }
        if (genericKey.getRepresentation() instanceof byte[]) {
            return new KeyParameter((byte[]) genericKey.getRepresentation());
        }
        throw new IllegalArgumentException(StubApp.getString2(28249));
    }
}
