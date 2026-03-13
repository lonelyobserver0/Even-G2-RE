package org.bouncycastle.pqc.jcajce.spec;

import com.stub.StubApp;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.ntru.NTRUParameters;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NTRUParameterSpec implements AlgorithmParameterSpec {
    public static final NTRUParameterSpec ntruhps2048509;
    public static final NTRUParameterSpec ntruhps2048677;
    public static final NTRUParameterSpec ntruhps4096821;
    public static final NTRUParameterSpec ntruhrss701;
    private static Map parameters;
    private final String name;

    static {
        NTRUParameterSpec nTRUParameterSpec = new NTRUParameterSpec(NTRUParameters.ntruhps2048509);
        ntruhps2048509 = nTRUParameterSpec;
        NTRUParameterSpec nTRUParameterSpec2 = new NTRUParameterSpec(NTRUParameters.ntruhps2048677);
        ntruhps2048677 = nTRUParameterSpec2;
        NTRUParameterSpec nTRUParameterSpec3 = new NTRUParameterSpec(NTRUParameters.ntruhps4096821);
        ntruhps4096821 = nTRUParameterSpec3;
        NTRUParameterSpec nTRUParameterSpec4 = new NTRUParameterSpec(NTRUParameters.ntruhrss701);
        ntruhrss701 = nTRUParameterSpec4;
        HashMap hashMap = new HashMap();
        parameters = hashMap;
        hashMap.put(StubApp.getString2(34049), nTRUParameterSpec);
        parameters.put(StubApp.getString2(34050), nTRUParameterSpec2);
        parameters.put(StubApp.getString2(34051), nTRUParameterSpec3);
        parameters.put(StubApp.getString2(34052), nTRUParameterSpec4);
    }

    private NTRUParameterSpec(NTRUParameters nTRUParameters) {
        this.name = nTRUParameters.getName();
    }

    public static NTRUParameterSpec fromName(String str) {
        return (NTRUParameterSpec) parameters.get(Strings.toLowerCase(str));
    }

    public String getName() {
        return this.name;
    }
}
