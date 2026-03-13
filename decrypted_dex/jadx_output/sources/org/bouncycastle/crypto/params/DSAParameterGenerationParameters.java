package org.bouncycastle.crypto.params;

import java.security.SecureRandom;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSAParameterGenerationParameters {
    public static final int DIGITAL_SIGNATURE_USAGE = 1;
    public static final int KEY_ESTABLISHMENT_USAGE = 2;
    private final int certainty;

    /* renamed from: l, reason: collision with root package name */
    private final int f19075l;

    /* renamed from: n, reason: collision with root package name */
    private final int f19076n;
    private final SecureRandom random;
    private final int usageIndex;

    public DSAParameterGenerationParameters(int i3, int i10, int i11, SecureRandom secureRandom) {
        this(i3, i10, i11, secureRandom, -1);
    }

    public int getCertainty() {
        return this.certainty;
    }

    public int getL() {
        return this.f19075l;
    }

    public int getN() {
        return this.f19076n;
    }

    public SecureRandom getRandom() {
        return this.random;
    }

    public int getUsageIndex() {
        return this.usageIndex;
    }

    public DSAParameterGenerationParameters(int i3, int i10, int i11, SecureRandom secureRandom, int i12) {
        this.f19075l = i3;
        this.f19076n = i10;
        this.certainty = i11;
        this.usageIndex = i12;
        this.random = secureRandom;
    }
}
