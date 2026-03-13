package org.bouncycastle.jce.interfaces;

import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface IESKey extends Key {
    PrivateKey getPrivate();

    PublicKey getPublic();
}
