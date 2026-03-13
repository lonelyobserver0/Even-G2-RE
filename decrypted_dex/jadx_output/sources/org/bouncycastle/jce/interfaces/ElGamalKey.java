package org.bouncycastle.jce.interfaces;

import javax.crypto.interfaces.DHKey;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface ElGamalKey extends DHKey {
    ElGamalParameterSpec getParameters();
}
