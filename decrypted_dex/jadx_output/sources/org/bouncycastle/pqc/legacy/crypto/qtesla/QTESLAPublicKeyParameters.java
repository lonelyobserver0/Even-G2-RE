package org.bouncycastle.pqc.legacy.crypto.qtesla;

import com.stub.StubApp;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class QTESLAPublicKeyParameters extends AsymmetricKeyParameter {
    private byte[] publicKey;
    private int securityCategory;

    public QTESLAPublicKeyParameters(int i3, byte[] bArr) {
        super(false);
        if (bArr.length != QTESLASecurityCategory.getPublicSize(i3)) {
            throw new IllegalArgumentException(StubApp.getString2(34788));
        }
        this.securityCategory = i3;
        this.publicKey = Arrays.clone(bArr);
    }

    public byte[] getPublicData() {
        return Arrays.clone(this.publicKey);
    }

    public int getSecurityCategory() {
        return this.securityCategory;
    }
}
