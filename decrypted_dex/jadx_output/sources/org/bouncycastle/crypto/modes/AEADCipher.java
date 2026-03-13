package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface AEADCipher {
    int doFinal(byte[] bArr, int i3) throws IllegalStateException, InvalidCipherTextException;

    String getAlgorithmName();

    byte[] getMac();

    int getOutputSize(int i3);

    int getUpdateOutputSize(int i3);

    void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException;

    void processAADByte(byte b2);

    void processAADBytes(byte[] bArr, int i3, int i10);

    int processByte(byte b2, byte[] bArr, int i3) throws DataLengthException;

    int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws DataLengthException;

    void reset();
}
