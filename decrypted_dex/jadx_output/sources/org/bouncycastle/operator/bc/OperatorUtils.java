package org.bouncycastle.operator.bc;

import com.stub.StubApp;
import java.security.Key;
import org.bouncycastle.operator.GenericKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class OperatorUtils {
    public static byte[] getKeyBytes(GenericKey genericKey) {
        if (genericKey.getRepresentation() instanceof Key) {
            return ((Key) genericKey.getRepresentation()).getEncoded();
        }
        if (genericKey.getRepresentation() instanceof byte[]) {
            return (byte[]) genericKey.getRepresentation();
        }
        throw new IllegalArgumentException(StubApp.getString2(28249));
    }
}
