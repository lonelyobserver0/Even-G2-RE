package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XMSSMTKeyParameters extends AsymmetricKeyParameter {
    private final String treeDigest;

    public XMSSMTKeyParameters(boolean z2, String str) {
        super(z2);
        this.treeDigest = str;
    }

    public String getTreeDigest() {
        return this.treeDigest;
    }
}
