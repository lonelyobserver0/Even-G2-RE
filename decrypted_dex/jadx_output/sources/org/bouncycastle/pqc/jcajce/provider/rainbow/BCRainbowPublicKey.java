package org.bouncycastle.pqc.jcajce.provider.rainbow;

import com.stub.StubApp;
import java.security.PublicKey;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.RainbowPublicKey;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.pqc.jcajce.spec.RainbowPublicKeySpec;
import org.bouncycastle.pqc.legacy.crypto.rainbow.RainbowParameters;
import org.bouncycastle.pqc.legacy.crypto.rainbow.RainbowPublicKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.rainbow.util.RainbowUtil;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCRainbowPublicKey implements PublicKey {
    private static final long serialVersionUID = 1;
    private short[][] coeffquadratic;
    private short[] coeffscalar;
    private short[][] coeffsingular;
    private int docLength;
    private RainbowParameters rainbowParams;

    public BCRainbowPublicKey(int i3, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.docLength = i3;
        this.coeffquadratic = sArr;
        this.coeffsingular = sArr2;
        this.coeffscalar = sArr3;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof BCRainbowPublicKey)) {
            BCRainbowPublicKey bCRainbowPublicKey = (BCRainbowPublicKey) obj;
            if (this.docLength == bCRainbowPublicKey.getDocLength() && RainbowUtil.equals(this.coeffquadratic, bCRainbowPublicKey.getCoeffQuadratic()) && RainbowUtil.equals(this.coeffsingular, bCRainbowPublicKey.getCoeffSingular()) && RainbowUtil.equals(this.coeffscalar, bCRainbowPublicKey.getCoeffScalar())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return StubApp.getString2(34552);
    }

    public short[][] getCoeffQuadratic() {
        return this.coeffquadratic;
    }

    public short[] getCoeffScalar() {
        return Arrays.clone(this.coeffscalar);
    }

    public short[][] getCoeffSingular() {
        short[][] sArr = new short[this.coeffsingular.length][];
        int i3 = 0;
        while (true) {
            short[][] sArr2 = this.coeffsingular;
            if (i3 == sArr2.length) {
                return sArr;
            }
            sArr[i3] = Arrays.clone(sArr2[i3]);
            i3++;
        }
    }

    public int getDocLength() {
        return this.docLength;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.rainbow, DERNull.INSTANCE), new RainbowPublicKey(this.docLength, this.coeffquadratic, this.coeffsingular, this.coeffscalar));
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(19963);
    }

    public int hashCode() {
        return Arrays.hashCode(this.coeffscalar) + ((Arrays.hashCode(this.coeffsingular) + ((Arrays.hashCode(this.coeffquadratic) + (this.docLength * 37)) * 37)) * 37);
    }

    public BCRainbowPublicKey(RainbowPublicKeySpec rainbowPublicKeySpec) {
        this(rainbowPublicKeySpec.getDocLength(), rainbowPublicKeySpec.getCoeffQuadratic(), rainbowPublicKeySpec.getCoeffSingular(), rainbowPublicKeySpec.getCoeffScalar());
    }

    public BCRainbowPublicKey(RainbowPublicKeyParameters rainbowPublicKeyParameters) {
        this(rainbowPublicKeyParameters.getDocLength(), rainbowPublicKeyParameters.getCoeffQuadratic(), rainbowPublicKeyParameters.getCoeffSingular(), rainbowPublicKeyParameters.getCoeffScalar());
    }
}
