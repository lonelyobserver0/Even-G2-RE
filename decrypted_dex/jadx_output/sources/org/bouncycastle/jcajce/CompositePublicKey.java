package org.bouncycastle.jcajce;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CompositePublicKey implements PublicKey {
    private final List<PublicKey> keys;

    public CompositePublicKey(PublicKey... publicKeyArr) {
        if (publicKeyArr == null || publicKeyArr.length == 0) {
            throw new IllegalArgumentException(StubApp.getString2(29637));
        }
        ArrayList arrayList = new ArrayList(publicKeyArr.length);
        for (int i3 = 0; i3 != publicKeyArr.length; i3++) {
            arrayList.add(publicKeyArr[i3]);
        }
        this.keys = Collections.unmodifiableList(arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompositePublicKey) {
            return this.keys.equals(((CompositePublicKey) obj).keys);
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
            aSN1EncodableVector.add(SubjectPublicKeyInfo.getInstance(this.keys.get(i3).getEncoded()));
        }
        try {
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(MiscObjectIdentifiers.id_composite_key), new DERSequence(aSN1EncodableVector)).getEncoded(StubApp.getString2("26791"));
        } catch (IOException e10) {
            throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(29639))));
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(19963);
    }

    public List<PublicKey> getPublicKeys() {
        return this.keys;
    }

    public int hashCode() {
        return this.keys.hashCode();
    }
}
