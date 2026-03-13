package org.bouncycastle.jcajce.spec;

import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PBKDF2KeySpec extends PBEKeySpec {
    private static final AlgorithmIdentifier defaultPRF = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA1, DERNull.INSTANCE);
    private AlgorithmIdentifier prf;

    public PBKDF2KeySpec(char[] cArr, byte[] bArr, int i3, int i10, AlgorithmIdentifier algorithmIdentifier) {
        super(cArr, bArr, i3, i10);
        this.prf = algorithmIdentifier;
    }

    public AlgorithmIdentifier getPrf() {
        return this.prf;
    }

    public boolean isDefaultPrf() {
        return defaultPRF.equals(this.prf);
    }
}
