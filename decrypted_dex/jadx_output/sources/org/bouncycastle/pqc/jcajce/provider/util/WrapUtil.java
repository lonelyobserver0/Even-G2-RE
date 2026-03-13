package org.bouncycastle.pqc.jcajce.provider.util;

import com.stub.StubApp;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.ARIAEngine;
import org.bouncycastle.crypto.engines.CamelliaEngine;
import org.bouncycastle.crypto.engines.RFC3394WrapEngine;
import org.bouncycastle.crypto.engines.RFC5649WrapEngine;
import org.bouncycastle.crypto.engines.SEEDEngine;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class WrapUtil {
    public static Wrapper getWrapper(String str) {
        if (str.equalsIgnoreCase(StubApp.getString2(461))) {
            return new RFC3394WrapEngine(new AESEngine());
        }
        if (str.equalsIgnoreCase(StubApp.getString2(28558))) {
            return new RFC3394WrapEngine(new ARIAEngine());
        }
        if (str.equalsIgnoreCase(StubApp.getString2(28258))) {
            return new RFC3394WrapEngine(new CamelliaEngine());
        }
        if (str.equalsIgnoreCase(StubApp.getString2(28259))) {
            return new RFC3394WrapEngine(new SEEDEngine());
        }
        if (str.equalsIgnoreCase(StubApp.getString2(34621))) {
            return new RFC5649WrapEngine(new AESEngine());
        }
        if (str.equalsIgnoreCase(StubApp.getString2(34722))) {
            return new RFC5649WrapEngine(new CamelliaEngine());
        }
        if (str.equalsIgnoreCase(StubApp.getString2(34723))) {
            return new RFC5649WrapEngine(new ARIAEngine());
        }
        throw new UnsupportedOperationException(StubApp.getString2(34724).concat(str));
    }
}
