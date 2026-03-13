package org.bouncycastle.util.encoders;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface Translator {
    int decode(byte[] bArr, int i3, int i10, byte[] bArr2, int i11);

    int encode(byte[] bArr, int i3, int i10, byte[] bArr2, int i11);

    int getDecodedBlockSize();

    int getEncodedBlockSize();
}
