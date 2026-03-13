package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class VMPCKSA3Engine extends VMPCEngine {
    @Override // org.bouncycastle.crypto.engines.VMPCEngine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28795);
    }

    @Override // org.bouncycastle.crypto.engines.VMPCEngine
    public void initKey(byte[] bArr, byte[] bArr2) {
        this.f18968s = (byte) 0;
        this.f18966P = new byte[256];
        for (int i3 = 0; i3 < 256; i3++) {
            this.f18966P[i3] = (byte) i3;
        }
        for (int i10 = 0; i10 < 768; i10++) {
            byte[] bArr3 = this.f18966P;
            byte b2 = this.f18968s;
            int i11 = i10 & 255;
            byte b10 = bArr3[i11];
            byte b11 = bArr3[(b2 + b10 + bArr[i10 % bArr.length]) & 255];
            this.f18968s = b11;
            bArr3[i11] = bArr3[b11 & UByte.MAX_VALUE];
            bArr3[b11 & UByte.MAX_VALUE] = b10;
        }
        for (int i12 = 0; i12 < 768; i12++) {
            byte[] bArr4 = this.f18966P;
            byte b12 = this.f18968s;
            int i13 = i12 & 255;
            byte b13 = bArr4[i13];
            byte b14 = bArr4[(b12 + b13 + bArr2[i12 % bArr2.length]) & 255];
            this.f18968s = b14;
            bArr4[i13] = bArr4[b14 & UByte.MAX_VALUE];
            bArr4[b14 & UByte.MAX_VALUE] = b13;
        }
        for (int i14 = 0; i14 < 768; i14++) {
            byte[] bArr5 = this.f18966P;
            byte b15 = this.f18968s;
            int i15 = i14 & 255;
            byte b16 = bArr5[i15];
            byte b17 = bArr5[(b15 + b16 + bArr[i14 % bArr.length]) & 255];
            this.f18968s = b17;
            bArr5[i15] = bArr5[b17 & UByte.MAX_VALUE];
            bArr5[b17 & UByte.MAX_VALUE] = b16;
        }
        this.f18967n = (byte) 0;
    }
}
