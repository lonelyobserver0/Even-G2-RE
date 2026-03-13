package org.bouncycastle.eac.jcajce;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
interface EACHelper {
    KeyFactory createKeyFactory(String str) throws NoSuchProviderException, NoSuchAlgorithmException;
}
