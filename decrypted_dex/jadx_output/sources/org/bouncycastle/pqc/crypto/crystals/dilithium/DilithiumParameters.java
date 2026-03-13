package org.bouncycastle.pqc.crypto.crystals.dilithium;

import com.stub.StubApp;
import java.security.SecureRandom;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DilithiumParameters {
    public static final DilithiumParameters dilithium2 = new DilithiumParameters(StubApp.getString2(33972), 2, false);
    public static final DilithiumParameters dilithium2_aes = new DilithiumParameters(StubApp.getString2(33973), 2, true);
    public static final DilithiumParameters dilithium3 = new DilithiumParameters(StubApp.getString2(33974), 3, false);
    public static final DilithiumParameters dilithium3_aes = new DilithiumParameters(StubApp.getString2(33975), 3, true);
    public static final DilithiumParameters dilithium5 = new DilithiumParameters(StubApp.getString2(33976), 5, false);
    public static final DilithiumParameters dilithium5_aes = new DilithiumParameters(StubApp.getString2(33977), 5, true);

    /* renamed from: k, reason: collision with root package name */
    private final int f19372k;
    private final String name;
    private final boolean usingAES;

    private DilithiumParameters(String str, int i3, boolean z2) {
        this.name = str;
        this.f19372k = i3;
        this.usingAES = z2;
    }

    public DilithiumEngine getEngine(SecureRandom secureRandom) {
        return new DilithiumEngine(this.f19372k, secureRandom, this.usingAES);
    }

    public String getName() {
        return this.name;
    }
}
