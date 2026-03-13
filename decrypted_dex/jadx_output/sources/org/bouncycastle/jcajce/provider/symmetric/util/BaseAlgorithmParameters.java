package org.bouncycastle.jcajce.provider.symmetric.util;

import com.stub.StubApp;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class BaseAlgorithmParameters extends AlgorithmParametersSpi {
    @Override // java.security.AlgorithmParametersSpi
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls != null) {
            return localEngineGetParameterSpec(cls);
        }
        throw new NullPointerException(StubApp.getString2(30484));
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals(StubApp.getString2(30489));
    }

    public abstract AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException;
}
