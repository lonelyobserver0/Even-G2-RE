package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.sike.SIKEParameters;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SIKEParameterSpec implements AlgorithmParameterSpec {
    private final String name;
    public static final SIKEParameterSpec sikep434 = new SIKEParameterSpec(SIKEParameters.sikep434);
    public static final SIKEParameterSpec sikep503 = new SIKEParameterSpec(SIKEParameters.sikep503);
    public static final SIKEParameterSpec sikep610 = new SIKEParameterSpec(SIKEParameters.sikep610);
    public static final SIKEParameterSpec sikep751 = new SIKEParameterSpec(SIKEParameters.sikep751);
    public static final SIKEParameterSpec sikep434_compressed = new SIKEParameterSpec(SIKEParameters.sikep434_compressed);
    public static final SIKEParameterSpec sikep503_compressed = new SIKEParameterSpec(SIKEParameters.sikep503_compressed);
    public static final SIKEParameterSpec sikep610_compressed = new SIKEParameterSpec(SIKEParameters.sikep610_compressed);
    public static final SIKEParameterSpec sikep751_compressed = new SIKEParameterSpec(SIKEParameters.sikep751_compressed);
    private static Map parameters = new HashMap();

    private SIKEParameterSpec(SIKEParameters sIKEParameters) {
        this.name = sIKEParameters.getName();
    }

    public static SIKEParameterSpec fromName(String str) {
        return (SIKEParameterSpec) parameters.get(Strings.toLowerCase(str));
    }

    public String getName() {
        return this.name;
    }
}
