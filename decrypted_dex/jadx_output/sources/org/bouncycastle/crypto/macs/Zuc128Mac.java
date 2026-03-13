package org.bouncycastle.crypto.macs;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.Zuc128CoreEngine;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Zuc128Mac implements Mac {
    private static final int TOPBIT = 128;
    private int theByteIndex;
    private final InternalZuc128Engine theEngine = new InternalZuc128Engine(null);
    private final int[] theKeyStream = new int[2];
    private int theMac;
    private Zuc128CoreEngine theState;
    private int theWordIndex;

    /* renamed from: org.bouncycastle.crypto.macs.Zuc128Mac$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class InternalZuc128Engine extends Zuc128CoreEngine {
        private InternalZuc128Engine() {
        }

        public int createKeyStreamWord() {
            return super.makeKeyStreamWord();
        }

        public /* synthetic */ InternalZuc128Engine(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private int getFinalWord() {
        if (this.theByteIndex != 0) {
            return this.theEngine.createKeyStreamWord();
        }
        int i3 = this.theWordIndex + 1;
        int[] iArr = this.theKeyStream;
        int length = i3 % iArr.length;
        this.theWordIndex = length;
        return iArr[length];
    }

    private int getKeyStreamWord(int i3) {
        int[] iArr = this.theKeyStream;
        int i10 = this.theWordIndex;
        int i11 = iArr[i10];
        if (i3 == 0) {
            return i11;
        }
        int i12 = iArr[(i10 + 1) % iArr.length];
        return (i12 >>> (32 - i3)) | (i11 << i3);
    }

    private void initKeyStream() {
        int i3 = 0;
        this.theMac = 0;
        while (true) {
            int[] iArr = this.theKeyStream;
            if (i3 >= iArr.length - 1) {
                this.theWordIndex = iArr.length - 1;
                this.theByteIndex = 3;
                return;
            } else {
                iArr[i3] = this.theEngine.createKeyStreamWord();
                i3++;
            }
        }
    }

    private void shift4NextByte() {
        int i3 = (this.theByteIndex + 1) % 4;
        this.theByteIndex = i3;
        if (i3 == 0) {
            this.theKeyStream[this.theWordIndex] = this.theEngine.createKeyStreamWord();
            this.theWordIndex = (this.theWordIndex + 1) % this.theKeyStream.length;
        }
    }

    private void updateMac(int i3) {
        this.theMac = getKeyStreamWord(i3) ^ this.theMac;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i3) {
        shift4NextByte();
        int keyStreamWord = this.theMac ^ getKeyStreamWord(this.theByteIndex * 8);
        this.theMac = keyStreamWord;
        int finalWord = keyStreamWord ^ getFinalWord();
        this.theMac = finalWord;
        Zuc128CoreEngine.encode32be(finalWord, bArr, i3);
        reset();
        return getMacSize();
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return StubApp.getString2(29062);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 4;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        this.theEngine.init(true, cipherParameters);
        this.theState = (Zuc128CoreEngine) this.theEngine.copy();
        initKeyStream();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        Zuc128CoreEngine zuc128CoreEngine = this.theState;
        if (zuc128CoreEngine != null) {
            this.theEngine.reset(zuc128CoreEngine);
        }
        initKeyStream();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b2) {
        shift4NextByte();
        int i3 = this.theByteIndex * 8;
        int i10 = 128;
        int i11 = 0;
        while (i10 > 0) {
            if ((b2 & i10) != 0) {
                updateMac(i3 + i11);
            }
            i10 >>= 1;
            i11++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i3, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            update(bArr[i3 + i11]);
        }
    }
}
