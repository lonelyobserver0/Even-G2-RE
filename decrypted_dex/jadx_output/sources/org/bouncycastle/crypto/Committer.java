package org.bouncycastle.crypto;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface Committer {
    Commitment commit(byte[] bArr);

    boolean isRevealed(Commitment commitment, byte[] bArr);
}
