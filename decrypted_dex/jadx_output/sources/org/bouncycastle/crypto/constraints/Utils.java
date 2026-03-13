package org.bouncycastle.crypto.constraints;

import com.stub.StubApp;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Utils {
    public static void addAliases(Set<String> set) {
        String string2 = StubApp.getString2(28260);
        boolean contains = set.contains(string2);
        String string22 = StubApp.getString2(28456);
        if (contains) {
            set.add(string22);
        } else if (set.contains(string22)) {
            set.add(string2);
        }
    }
}
