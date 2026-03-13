package org.bouncycastle.pqc.jcajce.spec;

import com.stub.StubApp;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SPHINCS256KeyGenParameterSpec implements AlgorithmParameterSpec {
    public static final String SHA3_256 = StubApp.getString2(28175);
    public static final String SHA512_256 = StubApp.getString2(33761);
    private final String treeHash;

    public SPHINCS256KeyGenParameterSpec() {
        this(StubApp.getString2(33761));
    }

    public String getTreeDigest() {
        return this.treeHash;
    }

    public SPHINCS256KeyGenParameterSpec(String str) {
        this.treeHash = str;
    }
}
