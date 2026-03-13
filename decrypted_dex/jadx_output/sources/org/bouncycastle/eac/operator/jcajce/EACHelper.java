package org.bouncycastle.eac.operator.jcajce;

import com.stub.StubApp;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
abstract class EACHelper {
    private static final Hashtable sigNames;

    static {
        Hashtable hashtable = new Hashtable();
        sigNames = hashtable;
        hashtable.put(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1, StubApp.getString2(29424));
        hashtable.put(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256, StubApp.getString2(29425));
        hashtable.put(EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1, StubApp.getString2(29426));
        hashtable.put(EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256, StubApp.getString2(29427));
        hashtable.put(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_512, StubApp.getString2(29428));
        hashtable.put(EACObjectIdentifiers.id_TA_RSA_PSS_SHA_512, StubApp.getString2(29429));
        hashtable.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_1, StubApp.getString2(29430));
        hashtable.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_224, StubApp.getString2(29431));
        hashtable.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_256, StubApp.getString2(29432));
        hashtable.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_384, StubApp.getString2(29433));
        hashtable.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_512, StubApp.getString2(29434));
    }

    public abstract Signature createSignature(String str) throws NoSuchProviderException, NoSuchAlgorithmException;

    public Signature getSignature(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws NoSuchProviderException, NoSuchAlgorithmException {
        return createSignature((String) sigNames.get(aSN1ObjectIdentifier));
    }
}
