package org.bouncycastle.pqc.crypto.sphincs;

import com.stub.StubApp;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SPHINCSKeyParameters extends AsymmetricKeyParameter {
    public static final String SHA3_256 = StubApp.getString2(28175);
    public static final String SHA512_256 = StubApp.getString2(29285);
    private final String treeDigest;

    public SPHINCSKeyParameters(boolean z2, String str) {
        super(z2);
        this.treeDigest = str;
    }

    public String getTreeDigest() {
        return this.treeDigest;
    }
}
