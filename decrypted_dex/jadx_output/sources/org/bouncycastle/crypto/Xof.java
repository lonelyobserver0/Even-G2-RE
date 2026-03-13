package org.bouncycastle.crypto;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface Xof extends ExtendedDigest {
    int doFinal(byte[] bArr, int i3, int i10);

    int doOutput(byte[] bArr, int i3, int i10);
}
