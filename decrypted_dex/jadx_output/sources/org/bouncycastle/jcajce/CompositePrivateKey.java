package org.bouncycastle.jcajce;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CompositePrivateKey implements PrivateKey {
    private final List<PrivateKey> keys;

    public CompositePrivateKey(PrivateKey... privateKeyArr) {
        if (privateKeyArr == null || privateKeyArr.length == 0) {
            throw new IllegalArgumentException(StubApp.getString2(29637));
        }
        ArrayList arrayList = new ArrayList(privateKeyArr.length);
        for (int i3 = 0; i3 != privateKeyArr.length; i3++) {
            arrayList.add(privateKeyArr[i3]);
        }
        this.keys = Collections.unmodifiableList(arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompositePrivateKey) {
            return this.keys.equals(((CompositePrivateKey) obj).keys);
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return StubApp.getString2(29638);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (int i3 = 0; i3 != this.keys.size(); i3++) {
            aSN1EncodableVector.add(PrivateKeyInfo.getInstance(this.keys.get(i3).getEncoded()));
        }
        try {
            return new PrivateKeyInfo(new AlgorithmIdentifier(MiscObjectIdentifiers.id_composite_key), new DERSequence(aSN1EncodableVector)).getEncoded(StubApp.getString2("26791"));
        } catch (IOException e10) {
            throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(29639))));
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(29640);
    }

    public List<PrivateKey> getPrivateKeys() {
        return this.keys;
    }

    public int hashCode() {
        return this.keys.hashCode();
    }
}
