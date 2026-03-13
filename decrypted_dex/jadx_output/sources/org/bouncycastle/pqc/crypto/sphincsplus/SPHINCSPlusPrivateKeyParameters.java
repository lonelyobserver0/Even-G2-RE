package org.bouncycastle.pqc.crypto.sphincsplus;

import com.stub.StubApp;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SPHINCSPlusPrivateKeyParameters extends SPHINCSPlusKeyParameters {
    final PK pk;
    final SK sk;

    public SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, SK sk, PK pk) {
        super(true, sPHINCSPlusParameters);
        this.sk = sk;
        this.pk = pk;
    }

    public byte[] getEncoded() {
        byte[] intToBigEndian = Pack.intToBigEndian(SPHINCSPlusParameters.getID(getParameters()).intValue());
        SK sk = this.sk;
        byte[] bArr = sk.seed;
        byte[] bArr2 = sk.prf;
        PK pk = this.pk;
        return Arrays.concatenate(intToBigEndian, Arrays.concatenate(bArr, bArr2, pk.seed, pk.root));
    }

    public byte[] getEncodedPublicKey() {
        byte[] intToBigEndian = Pack.intToBigEndian(SPHINCSPlusParameters.getID(getParameters()).intValue());
        PK pk = this.pk;
        return Arrays.concatenate(intToBigEndian, pk.seed, pk.root);
    }

    public byte[] getPrf() {
        return Arrays.clone(this.sk.prf);
    }

    public byte[] getPublicKey() {
        PK pk = this.pk;
        return Arrays.concatenate(pk.seed, pk.root);
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.pk.seed);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.sk.seed);
    }

    public SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr) {
        super(true, sPHINCSPlusParameters);
        int n10 = sPHINCSPlusParameters.getN();
        int i3 = n10 * 4;
        if (bArr.length != i3) {
            throw new IllegalArgumentException(StubApp.getString2(34228));
        }
        int i10 = n10 * 2;
        this.sk = new SK(Arrays.copyOfRange(bArr, 0, n10), Arrays.copyOfRange(bArr, n10, i10));
        int i11 = n10 * 3;
        this.pk = new PK(Arrays.copyOfRange(bArr, i10, i11), Arrays.copyOfRange(bArr, i11, i3));
    }
}
