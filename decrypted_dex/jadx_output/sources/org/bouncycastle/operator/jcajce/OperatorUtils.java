package org.bouncycastle.operator.jcajce;

import com.stub.StubApp;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.operator.GenericKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class OperatorUtils {
    public static Key getJceKey(GenericKey genericKey) {
        if (genericKey.getRepresentation() instanceof Key) {
            return (Key) genericKey.getRepresentation();
        }
        if (genericKey.getRepresentation() instanceof byte[]) {
            return new SecretKeySpec((byte[]) genericKey.getRepresentation(), StubApp.getString2(28280));
        }
        throw new IllegalArgumentException(StubApp.getString2(28249));
    }
}
