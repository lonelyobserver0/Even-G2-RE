package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface PicnicKey extends Key {
    PicnicParameterSpec getParameterSpec();
}
