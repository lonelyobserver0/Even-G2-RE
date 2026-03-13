package org.bouncycastle.cms;

import org.bouncycastle.util.Selector;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class RecipientId implements Selector {
    public static final int kek = 1;
    public static final int keyAgree = 2;
    public static final int keyTrans = 0;
    public static final int password = 3;
    private final int type;

    public RecipientId(int i3) {
        this.type = i3;
    }

    @Override // org.bouncycastle.util.Selector
    public abstract Object clone();

    public int getType() {
        return this.type;
    }
}
