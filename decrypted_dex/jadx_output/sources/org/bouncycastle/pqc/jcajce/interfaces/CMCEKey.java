package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface CMCEKey extends Key {
    CMCEParameterSpec getParameterSpec();
}
