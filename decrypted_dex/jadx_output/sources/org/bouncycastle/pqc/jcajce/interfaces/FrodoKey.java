package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.FrodoParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface FrodoKey extends Key {
    FrodoParameterSpec getParameterSpec();
}
