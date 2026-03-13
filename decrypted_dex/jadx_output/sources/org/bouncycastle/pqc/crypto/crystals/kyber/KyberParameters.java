package org.bouncycastle.pqc.crypto.crystals.kyber;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KyberParameters {

    /* renamed from: k, reason: collision with root package name */
    private final int f19379k;
    private final String name;
    private final int sessionKeySize;
    private final boolean usingAes;
    public static final KyberParameters kyber512 = new KyberParameters(StubApp.getString2(33991), 2, 128, false);
    public static final KyberParameters kyber768 = new KyberParameters(StubApp.getString2(33992), 3, 192, false);
    public static final KyberParameters kyber1024 = new KyberParameters(StubApp.getString2(33993), 4, 256, false);
    public static final KyberParameters kyber512_aes = new KyberParameters(StubApp.getString2(33994), 2, 128, true);
    public static final KyberParameters kyber768_aes = new KyberParameters(StubApp.getString2(33995), 3, 192, true);
    public static final KyberParameters kyber1024_aes = new KyberParameters(StubApp.getString2(33996), 4, 256, true);

    private KyberParameters(String str, int i3, int i10, boolean z2) {
        this.name = str;
        this.f19379k = i3;
        this.sessionKeySize = i10;
        this.usingAes = z2;
    }

    public KyberEngine getEngine() {
        return new KyberEngine(this.f19379k, this.usingAes);
    }

    public String getName() {
        return this.name;
    }

    public int getSessionKeySize() {
        return this.sessionKeySize;
    }
}
