package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.HQCParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface HQCKey extends Key {
    HQCParameterSpec getParameterSpec();
}
