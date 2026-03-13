package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XMSSKeyParameters extends AsymmetricKeyParameter {
    public static final String SHAKE128 = StubApp.getString2(28183);
    public static final String SHAKE256 = StubApp.getString2(28184);
    public static final String SHA_256 = StubApp.getString2(1488);
    public static final String SHA_512 = StubApp.getString2(23705);
    private final String treeDigest;

    public XMSSKeyParameters(boolean z2, String str) {
        super(z2);
        this.treeDigest = str;
    }

    public String getTreeDigest() {
        return this.treeDigest;
    }
}
