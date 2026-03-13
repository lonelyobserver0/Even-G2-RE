package org.bouncycastle.pqc.jcajce.provider.rainbow;

import com.stub.StubApp;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.RainbowPrivateKey;
import org.bouncycastle.pqc.jcajce.spec.RainbowPrivateKeySpec;
import org.bouncycastle.pqc.legacy.crypto.rainbow.Layer;
import org.bouncycastle.pqc.legacy.crypto.rainbow.RainbowPrivateKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.rainbow.util.RainbowUtil;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCRainbowPrivateKey implements PrivateKey {
    private static final long serialVersionUID = 1;
    private short[][] A1inv;
    private short[][] A2inv;

    /* renamed from: b1, reason: collision with root package name */
    private short[] f19497b1;
    private short[] b2;
    private Layer[] layers;
    private int[] vi;

    public BCRainbowPrivateKey(RainbowPrivateKeySpec rainbowPrivateKeySpec) {
        this(rainbowPrivateKeySpec.getInvA1(), rainbowPrivateKeySpec.getB1(), rainbowPrivateKeySpec.getInvA2(), rainbowPrivateKeySpec.getB2(), rainbowPrivateKeySpec.getVi(), rainbowPrivateKeySpec.getLayers());
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCRainbowPrivateKey)) {
            return false;
        }
        BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey) obj;
        boolean z2 = RainbowUtil.equals(this.A1inv, bCRainbowPrivateKey.getInvA1()) && RainbowUtil.equals(this.A2inv, bCRainbowPrivateKey.getInvA2()) && RainbowUtil.equals(this.f19497b1, bCRainbowPrivateKey.getB1()) && RainbowUtil.equals(this.b2, bCRainbowPrivateKey.getB2()) && Arrays.equals(this.vi, bCRainbowPrivateKey.getVi());
        if (this.layers.length != bCRainbowPrivateKey.getLayers().length) {
            return false;
        }
        for (int length = this.layers.length - 1; length >= 0; length--) {
            z2 &= this.layers[length].equals(bCRainbowPrivateKey.getLayers()[length]);
        }
        return z2;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return StubApp.getString2(34552);
    }

    public short[] getB1() {
        return this.f19497b1;
    }

    public short[] getB2() {
        return this.b2;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new PrivateKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.rainbow, DERNull.INSTANCE), new RainbowPrivateKey(this.A1inv, this.f19497b1, this.A2inv, this.b2, this.vi, this.layers)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(29640);
    }

    public short[][] getInvA1() {
        return this.A1inv;
    }

    public short[][] getInvA2() {
        return this.A2inv;
    }

    public Layer[] getLayers() {
        return this.layers;
    }

    public int[] getVi() {
        return this.vi;
    }

    public int hashCode() {
        int hashCode = org.bouncycastle.util.Arrays.hashCode(this.vi) + ((org.bouncycastle.util.Arrays.hashCode(this.b2) + ((org.bouncycastle.util.Arrays.hashCode(this.A2inv) + ((org.bouncycastle.util.Arrays.hashCode(this.f19497b1) + ((org.bouncycastle.util.Arrays.hashCode(this.A1inv) + (this.layers.length * 37)) * 37)) * 37)) * 37)) * 37);
        for (int length = this.layers.length - 1; length >= 0; length--) {
            hashCode = (hashCode * 37) + this.layers[length].hashCode();
        }
        return hashCode;
    }

    public BCRainbowPrivateKey(RainbowPrivateKeyParameters rainbowPrivateKeyParameters) {
        this(rainbowPrivateKeyParameters.getInvA1(), rainbowPrivateKeyParameters.getB1(), rainbowPrivateKeyParameters.getInvA2(), rainbowPrivateKeyParameters.getB2(), rainbowPrivateKeyParameters.getVi(), rainbowPrivateKeyParameters.getLayers());
    }

    public BCRainbowPrivateKey(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, Layer[] layerArr) {
        this.A1inv = sArr;
        this.f19497b1 = sArr2;
        this.A2inv = sArr3;
        this.b2 = sArr4;
        this.vi = iArr;
        this.layers = layerArr;
    }
}
