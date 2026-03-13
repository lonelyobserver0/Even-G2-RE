package org.bouncycastle.pqc.crypto.sphincsplus;

import com.stub.StubApp;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SPHINCSPlusPublicKeyParameters extends SPHINCSPlusKeyParameters {
    private final PK pk;

    public SPHINCSPlusPublicKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, PK pk) {
        super(false, sPHINCSPlusParameters);
        this.pk = pk;
    }

    public byte[] getEncoded() {
        byte[] intToBigEndian = Pack.intToBigEndian(SPHINCSPlusParameters.getID(getParameters()).intValue());
        PK pk = this.pk;
        return Arrays.concatenate(intToBigEndian, pk.seed, pk.root);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.pk.seed);
    }

    public SPHINCSPlusPublicKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr) {
        super(false, sPHINCSPlusParameters);
        int n10 = sPHINCSPlusParameters.getN();
        int i3 = n10 * 2;
        if (bArr.length != i3) {
            throw new IllegalArgumentException(StubApp.getString2(34229));
        }
        this.pk = new PK(Arrays.copyOfRange(bArr, 0, n10), Arrays.copyOfRange(bArr, n10, i3));
    }
}
