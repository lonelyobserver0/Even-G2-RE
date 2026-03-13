package org.bouncycastle.pqc.jcajce.provider.mceliece;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.util.DigestFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Utils {
    public static Digest getDigest(AlgorithmIdentifier algorithmIdentifier) {
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) OIWObjectIdentifiers.idSHA1)) {
            return DigestFactory.createSHA1();
        }
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_sha224)) {
            return DigestFactory.createSHA224();
        }
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return DigestFactory.createSHA256();
        }
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_sha384)) {
            return DigestFactory.createSHA384();
        }
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return DigestFactory.createSHA512();
        }
        throw new IllegalArgumentException(StubApp.getString2(34692) + algorithmIdentifier.getAlgorithm());
    }
}
