package org.bouncycastle.jcajce.provider.keystore.util;

import com.stub.StubApp;
import java.io.IOException;
import java.security.KeyStore;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ParameterUtil {
    public static char[] extractPassword(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException {
        KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            return null;
        }
        if (protectionParameter instanceof KeyStore.PasswordProtection) {
            return ((KeyStore.PasswordProtection) protectionParameter).getPassword();
        }
        if (!(protectionParameter instanceof KeyStore.CallbackHandlerProtection)) {
            throw new IllegalArgumentException(StubApp.getString2(31450).concat(protectionParameter.getClass().getName()));
        }
        CallbackHandler callbackHandler = ((KeyStore.CallbackHandlerProtection) protectionParameter).getCallbackHandler();
        PasswordCallback passwordCallback = new PasswordCallback(StubApp.getString2(31448), false);
        try {
            callbackHandler.handle(new Callback[]{passwordCallback});
            return passwordCallback.getPassword();
        } catch (UnsupportedCallbackException e10) {
            throw new IllegalArgumentException(StubApp.getString2(31449) + e10.getMessage(), e10);
        }
    }
}
