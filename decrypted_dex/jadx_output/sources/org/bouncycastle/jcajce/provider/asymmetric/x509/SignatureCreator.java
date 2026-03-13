package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
interface SignatureCreator {
    Signature createSignature(String str) throws NoSuchAlgorithmException, NoSuchProviderException;
}
