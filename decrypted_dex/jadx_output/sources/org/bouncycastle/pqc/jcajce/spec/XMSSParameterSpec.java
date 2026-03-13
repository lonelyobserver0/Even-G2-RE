package org.bouncycastle.pqc.jcajce.spec;

import com.stub.StubApp;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XMSSParameterSpec implements AlgorithmParameterSpec {
    public static final XMSSParameterSpec SHA2_10_256;
    public static final XMSSParameterSpec SHA2_10_512;
    public static final XMSSParameterSpec SHA2_16_256;
    public static final XMSSParameterSpec SHA2_16_512;
    public static final XMSSParameterSpec SHA2_20_256;
    public static final XMSSParameterSpec SHA2_20_512;
    public static final XMSSParameterSpec SHAKE_10_256;
    public static final XMSSParameterSpec SHAKE_10_512;
    public static final XMSSParameterSpec SHAKE_16_256;
    public static final XMSSParameterSpec SHAKE_16_512;
    public static final XMSSParameterSpec SHAKE_20_256;
    public static final XMSSParameterSpec SHAKE_20_512;
    private final int height;
    private final String treeDigest;
    public static final String SHA256 = StubApp.getString2(21749);
    public static final String SHA512 = StubApp.getString2(21751);
    public static final String SHAKE128 = StubApp.getString2(28183);
    public static final String SHAKE256 = StubApp.getString2(28184);

    static {
        String string2 = StubApp.getString2(21749);
        SHA2_10_256 = new XMSSParameterSpec(10, string2);
        SHA2_16_256 = new XMSSParameterSpec(16, string2);
        SHA2_20_256 = new XMSSParameterSpec(20, string2);
        String string22 = StubApp.getString2(28183);
        SHAKE_10_256 = new XMSSParameterSpec(10, string22);
        SHAKE_16_256 = new XMSSParameterSpec(16, string22);
        SHAKE_20_256 = new XMSSParameterSpec(20, string22);
        String string23 = StubApp.getString2(21751);
        SHA2_10_512 = new XMSSParameterSpec(10, string23);
        SHA2_16_512 = new XMSSParameterSpec(16, string23);
        SHA2_20_512 = new XMSSParameterSpec(20, string23);
        String string24 = StubApp.getString2(28184);
        SHAKE_10_512 = new XMSSParameterSpec(10, string24);
        SHAKE_16_512 = new XMSSParameterSpec(16, string24);
        SHAKE_20_512 = new XMSSParameterSpec(20, string24);
    }

    public XMSSParameterSpec(int i3, String str) {
        this.height = i3;
        this.treeDigest = str;
    }

    public int getHeight() {
        return this.height;
    }

    public String getTreeDigest() {
        return this.treeDigest;
    }
}
