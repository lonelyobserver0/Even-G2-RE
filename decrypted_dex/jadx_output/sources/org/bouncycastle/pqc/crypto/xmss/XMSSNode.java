package org.bouncycastle.pqc.crypto.xmss;

import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class XMSSNode implements Serializable {
    private static final long serialVersionUID = 1;
    private final int height;
    private final byte[] value;

    public XMSSNode(int i3, byte[] bArr) {
        this.height = i3;
        this.value = bArr;
    }

    public int getHeight() {
        return this.height;
    }

    public byte[] getValue() {
        return XMSSUtil.cloneArray(this.value);
    }
}
