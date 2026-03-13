package org.bouncycastle.pqc.legacy.crypto.qtesla;

import com.stub.StubApp;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class QTESLAPrivateKeyParameters extends AsymmetricKeyParameter {
    private byte[] privateKey;
    private int securityCategory;

    public QTESLAPrivateKeyParameters(int i3, byte[] bArr) {
        super(true);
        if (bArr.length != QTESLASecurityCategory.getPrivateSize(i3)) {
            throw new IllegalArgumentException(StubApp.getString2(34788));
        }
        this.securityCategory = i3;
        this.privateKey = Arrays.clone(bArr);
    }

    public byte[] getSecret() {
        return Arrays.clone(this.privateKey);
    }

    public int getSecurityCategory() {
        return this.securityCategory;
    }
}
