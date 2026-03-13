package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface AEADBlockCipher extends AEADCipher {
    BlockCipher getUnderlyingCipher();
}
