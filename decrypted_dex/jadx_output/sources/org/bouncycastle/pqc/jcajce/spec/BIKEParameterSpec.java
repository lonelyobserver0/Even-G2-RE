package org.bouncycastle.pqc.jcajce.spec;

import com.stub.StubApp;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.bike.BIKEParameters;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BIKEParameterSpec implements AlgorithmParameterSpec {
    public static final BIKEParameterSpec bike128;
    public static final BIKEParameterSpec bike192;
    public static final BIKEParameterSpec bike256;
    private static Map parameters;
    private final String name;

    static {
        BIKEParameterSpec bIKEParameterSpec = new BIKEParameterSpec(BIKEParameters.bike128);
        bike128 = bIKEParameterSpec;
        BIKEParameterSpec bIKEParameterSpec2 = new BIKEParameterSpec(BIKEParameters.bike192);
        bike192 = bIKEParameterSpec2;
        BIKEParameterSpec bIKEParameterSpec3 = new BIKEParameterSpec(BIKEParameters.bike256);
        bike256 = bIKEParameterSpec3;
        HashMap hashMap = new HashMap();
        parameters = hashMap;
        hashMap.put(StubApp.getString2(33956), bIKEParameterSpec);
        parameters.put(StubApp.getString2(33957), bIKEParameterSpec2);
        parameters.put(StubApp.getString2(33958), bIKEParameterSpec3);
    }

    private BIKEParameterSpec(BIKEParameters bIKEParameters) {
        this.name = bIKEParameters.getName();
    }

    public static BIKEParameterSpec fromName(String str) {
        return (BIKEParameterSpec) parameters.get(Strings.toLowerCase(str));
    }

    public String getName() {
        return this.name;
    }
}
