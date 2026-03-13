package org.bouncycastle.pqc.crypto.saber;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SABERParameters implements CipherParameters {
    private final int defaultKeySize;
    private final SABEREngine engine;

    /* renamed from: l, reason: collision with root package name */
    private final int f19463l;
    private final String name;
    public static final SABERParameters lightsaberkem128r3 = new SABERParameters(StubApp.getString2(34127), 2, 128);
    public static final SABERParameters saberkem128r3 = new SABERParameters(StubApp.getString2(34128), 3, 128);
    public static final SABERParameters firesaberkem128r3 = new SABERParameters(StubApp.getString2(34129), 4, 128);
    public static final SABERParameters lightsaberkem192r3 = new SABERParameters(StubApp.getString2(34130), 2, 192);
    public static final SABERParameters saberkem192r3 = new SABERParameters(StubApp.getString2(34131), 3, 192);
    public static final SABERParameters firesaberkem192r3 = new SABERParameters(StubApp.getString2(34132), 4, 192);
    public static final SABERParameters lightsaberkem256r3 = new SABERParameters(StubApp.getString2(34133), 2, 256);
    public static final SABERParameters saberkem256r3 = new SABERParameters(StubApp.getString2(34134), 3, 256);
    public static final SABERParameters firesaberkem256r3 = new SABERParameters(StubApp.getString2(34135), 4, 256);

    public SABERParameters(String str, int i3, int i10) {
        this.name = str;
        this.f19463l = i3;
        this.defaultKeySize = i10;
        this.engine = new SABEREngine(i3, i10);
    }

    public SABEREngine getEngine() {
        return this.engine;
    }

    public int getL() {
        return this.f19463l;
    }

    public String getName() {
        return this.name;
    }

    public int getSessionKeySize() {
        return this.defaultKeySize;
    }
}
