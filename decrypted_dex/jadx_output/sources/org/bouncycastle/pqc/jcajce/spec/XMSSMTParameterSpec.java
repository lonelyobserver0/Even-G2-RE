package org.bouncycastle.pqc.jcajce.spec;

import com.stub.StubApp;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XMSSMTParameterSpec implements AlgorithmParameterSpec {
    public static final String SHA256 = StubApp.getString2(21749);
    public static final String SHA512 = StubApp.getString2(21751);
    public static final String SHAKE128 = StubApp.getString2(28183);
    public static final String SHAKE256 = StubApp.getString2(28184);
    public static final XMSSMTParameterSpec XMSSMT_SHA2_20d2_256;
    public static final XMSSMTParameterSpec XMSSMT_SHA2_20d2_512;
    public static final XMSSMTParameterSpec XMSSMT_SHA2_20d4_256;
    public static final XMSSMTParameterSpec XMSSMT_SHA2_20d4_512;
    public static final XMSSMTParameterSpec XMSSMT_SHA2_40d2_256;
    public static final XMSSMTParameterSpec XMSSMT_SHA2_40d2_512;
    public static final XMSSMTParameterSpec XMSSMT_SHA2_40d4_256;
    public static final XMSSMTParameterSpec XMSSMT_SHA2_40d4_512;
    public static final XMSSMTParameterSpec XMSSMT_SHA2_40d8_256;
    public static final XMSSMTParameterSpec XMSSMT_SHA2_40d8_512;
    public static final XMSSMTParameterSpec XMSSMT_SHA2_60d12_256;
    public static final XMSSMTParameterSpec XMSSMT_SHA2_60d12_512;
    public static final XMSSMTParameterSpec XMSSMT_SHA2_60d3_256;
    public static final XMSSMTParameterSpec XMSSMT_SHA2_60d3_512;
    public static final XMSSMTParameterSpec XMSSMT_SHA2_60d6_256;
    public static final XMSSMTParameterSpec XMSSMT_SHA2_60d6_512;
    public static final XMSSMTParameterSpec XMSSMT_SHAKE_20d2_256;
    public static final XMSSMTParameterSpec XMSSMT_SHAKE_20d2_512;
    public static final XMSSMTParameterSpec XMSSMT_SHAKE_20d4_256;
    public static final XMSSMTParameterSpec XMSSMT_SHAKE_20d4_512;
    public static final XMSSMTParameterSpec XMSSMT_SHAKE_40d2_256;
    public static final XMSSMTParameterSpec XMSSMT_SHAKE_40d2_512;
    public static final XMSSMTParameterSpec XMSSMT_SHAKE_40d4_256;
    public static final XMSSMTParameterSpec XMSSMT_SHAKE_40d4_512;
    public static final XMSSMTParameterSpec XMSSMT_SHAKE_40d8_256;
    public static final XMSSMTParameterSpec XMSSMT_SHAKE_40d8_512;
    public static final XMSSMTParameterSpec XMSSMT_SHAKE_60d12_256;
    public static final XMSSMTParameterSpec XMSSMT_SHAKE_60d12_512;
    public static final XMSSMTParameterSpec XMSSMT_SHAKE_60d3_256;
    public static final XMSSMTParameterSpec XMSSMT_SHAKE_60d3_512;
    public static final XMSSMTParameterSpec XMSSMT_SHAKE_60d6_256;
    public static final XMSSMTParameterSpec XMSSMT_SHAKE_60d6_512;
    private final int height;
    private final int layers;
    private final String treeDigest;

    static {
        String string2 = StubApp.getString2(21749);
        XMSSMT_SHA2_20d2_256 = new XMSSMTParameterSpec(20, 2, string2);
        XMSSMT_SHA2_20d4_256 = new XMSSMTParameterSpec(20, 4, string2);
        XMSSMT_SHA2_40d2_256 = new XMSSMTParameterSpec(40, 2, string2);
        XMSSMT_SHA2_40d4_256 = new XMSSMTParameterSpec(40, 4, string2);
        XMSSMT_SHA2_40d8_256 = new XMSSMTParameterSpec(40, 8, string2);
        XMSSMT_SHA2_60d3_256 = new XMSSMTParameterSpec(60, 3, string2);
        XMSSMT_SHA2_60d6_256 = new XMSSMTParameterSpec(60, 6, string2);
        XMSSMT_SHA2_60d12_256 = new XMSSMTParameterSpec(60, 12, string2);
        String string22 = StubApp.getString2(21751);
        XMSSMT_SHA2_20d2_512 = new XMSSMTParameterSpec(20, 2, string22);
        XMSSMT_SHA2_20d4_512 = new XMSSMTParameterSpec(20, 4, string22);
        XMSSMT_SHA2_40d2_512 = new XMSSMTParameterSpec(40, 2, string22);
        XMSSMT_SHA2_40d4_512 = new XMSSMTParameterSpec(40, 4, string22);
        XMSSMT_SHA2_40d8_512 = new XMSSMTParameterSpec(40, 8, string22);
        XMSSMT_SHA2_60d3_512 = new XMSSMTParameterSpec(60, 3, string22);
        XMSSMT_SHA2_60d6_512 = new XMSSMTParameterSpec(60, 6, string22);
        XMSSMT_SHA2_60d12_512 = new XMSSMTParameterSpec(60, 12, string22);
        String string23 = StubApp.getString2(28183);
        XMSSMT_SHAKE_20d2_256 = new XMSSMTParameterSpec(20, 2, string23);
        XMSSMT_SHAKE_20d4_256 = new XMSSMTParameterSpec(20, 4, string23);
        XMSSMT_SHAKE_40d2_256 = new XMSSMTParameterSpec(40, 2, string23);
        XMSSMT_SHAKE_40d4_256 = new XMSSMTParameterSpec(40, 4, string23);
        XMSSMT_SHAKE_40d8_256 = new XMSSMTParameterSpec(40, 8, string23);
        XMSSMT_SHAKE_60d3_256 = new XMSSMTParameterSpec(60, 3, string23);
        XMSSMT_SHAKE_60d6_256 = new XMSSMTParameterSpec(60, 6, string23);
        XMSSMT_SHAKE_60d12_256 = new XMSSMTParameterSpec(60, 12, string23);
        String string24 = StubApp.getString2(28184);
        XMSSMT_SHAKE_20d2_512 = new XMSSMTParameterSpec(20, 2, string24);
        XMSSMT_SHAKE_20d4_512 = new XMSSMTParameterSpec(20, 4, string24);
        XMSSMT_SHAKE_40d2_512 = new XMSSMTParameterSpec(40, 2, string24);
        XMSSMT_SHAKE_40d4_512 = new XMSSMTParameterSpec(40, 4, string24);
        XMSSMT_SHAKE_40d8_512 = new XMSSMTParameterSpec(40, 8, string24);
        XMSSMT_SHAKE_60d3_512 = new XMSSMTParameterSpec(60, 3, string24);
        XMSSMT_SHAKE_60d6_512 = new XMSSMTParameterSpec(60, 6, string24);
        XMSSMT_SHAKE_60d12_512 = new XMSSMTParameterSpec(60, 12, string24);
    }

    public XMSSMTParameterSpec(int i3, int i10, String str) {
        this.height = i3;
        this.layers = i10;
        this.treeDigest = str;
    }

    public int getHeight() {
        return this.height;
    }

    public int getLayers() {
        return this.layers;
    }

    public String getTreeDigest() {
        return this.treeDigest;
    }
}
