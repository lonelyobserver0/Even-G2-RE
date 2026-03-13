package org.bouncycastle.pqc.jcajce.provider.util;

import com.stub.StubApp;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SpecUtil {
    private static Class[] NO_PARAMS = new Class[0];
    private static Object[] NO_ARGS = new Object[0];

    public static String getNameFrom(final AlgorithmParameterSpec algorithmParameterSpec) {
        return (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.pqc.jcajce.provider.util.SpecUtil.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                try {
                    return algorithmParameterSpec.getClass().getMethod(StubApp.getString2("10848"), SpecUtil.NO_PARAMS).invoke(algorithmParameterSpec, SpecUtil.NO_ARGS);
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }
}
