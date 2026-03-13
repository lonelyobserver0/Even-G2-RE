package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.BIKEParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface BIKEKey extends Key {
    BIKEParameterSpec getParameterSpec();
}
