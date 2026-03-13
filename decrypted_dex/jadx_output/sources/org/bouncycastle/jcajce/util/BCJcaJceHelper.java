package org.bouncycastle.jcajce.util;

import com.stub.StubApp;
import java.security.Provider;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCJcaJceHelper extends ProviderJcaJceHelper {
    private static volatile Provider bcProvider;

    public BCJcaJceHelper() {
        super(getBouncyCastleProvider());
    }

    private static synchronized Provider getBouncyCastleProvider() {
        synchronized (BCJcaJceHelper.class) {
            Provider provider = Security.getProvider(StubApp.getString2("21668"));
            if (provider instanceof BouncyCastleProvider) {
                return provider;
            }
            if (bcProvider != null) {
                return bcProvider;
            }
            bcProvider = new BouncyCastleProvider();
            return bcProvider;
        }
    }
}
