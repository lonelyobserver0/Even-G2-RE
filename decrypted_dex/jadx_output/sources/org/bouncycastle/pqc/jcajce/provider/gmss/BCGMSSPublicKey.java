package org.bouncycastle.pqc.jcajce.provider.gmss;

import com.stub.StubApp;
import java.security.PublicKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.asn1.GMSSPublicKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.ParSet;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSParameters;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSPublicKeyParameters;
import org.bouncycastle.util.encoders.Hex;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCGMSSPublicKey implements CipherParameters, PublicKey {
    private static final long serialVersionUID = 1;
    private GMSSParameters gmssParameterSet;
    private GMSSParameters gmssParams;
    private byte[] publicKeyBytes;

    public BCGMSSPublicKey(GMSSPublicKeyParameters gMSSPublicKeyParameters) {
        this(gMSSPublicKeyParameters.getPublicKey(), gMSSPublicKeyParameters.getParameters());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return StubApp.getString2(34652);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.gmss, new ParSet(this.gmssParameterSet.getNumOfLayers(), this.gmssParameterSet.getHeightOfTrees(), this.gmssParameterSet.getWinternitzParameter(), this.gmssParameterSet.getK()).toASN1Primitive()), new GMSSPublicKey(this.publicKeyBytes));
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(19963);
    }

    public GMSSParameters getParameterSet() {
        return this.gmssParameterSet;
    }

    public byte[] getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public String toString() {
        String k3 = AbstractC1482f.k(new StringBuilder(StubApp.getString2(34653)), new String(Hex.encode(this.publicKeyBytes)), StubApp.getString2(34654));
        for (int i3 = 0; i3 < this.gmssParameterSet.getHeightOfTrees().length; i3++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(k3);
            sb2.append(StubApp.getString2(34655));
            sb2.append(i3);
            sb2.append(StubApp.getString2(8801));
            sb2.append(this.gmssParameterSet.getHeightOfTrees()[i3]);
            sb2.append(StubApp.getString2(34656));
            sb2.append(this.gmssParameterSet.getWinternitzParameter()[i3]);
            sb2.append(StubApp.getString2(34657));
            k3 = AbstractC1482f.f(this.gmssParameterSet.getK()[i3], StubApp.getString2(3692), sb2);
        }
        return k3;
    }

    public BCGMSSPublicKey(byte[] bArr, GMSSParameters gMSSParameters) {
        this.gmssParameterSet = gMSSParameters;
        this.publicKeyBytes = bArr;
    }
}
