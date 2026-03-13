package org.bouncycastle.jce.spec;

import com.stub.StubApp;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import org.bouncycastle.jce.interfaces.IESKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class IEKeySpec implements KeySpec, IESKey {
    private PrivateKey privKey;
    private PublicKey pubKey;

    public IEKeySpec(PrivateKey privateKey, PublicKey publicKey) {
        this.privKey = privateKey;
        this.pubKey = publicKey;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return StubApp.getString2(30502);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return null;
    }

    @Override // org.bouncycastle.jce.interfaces.IESKey
    public PrivateKey getPrivate() {
        return this.privKey;
    }

    @Override // org.bouncycastle.jce.interfaces.IESKey
    public PublicKey getPublic() {
        return this.pubKey;
    }
}
