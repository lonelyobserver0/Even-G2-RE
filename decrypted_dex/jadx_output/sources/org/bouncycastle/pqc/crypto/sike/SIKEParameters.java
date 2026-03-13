package org.bouncycastle.pqc.crypto.sike;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SIKEParameters {
    private final SIKEEngine engine;
    private final String name;
    public static final SIKEParameters sikep434 = new SIKEParameters(434, false, StubApp.getString2(34174));
    public static final SIKEParameters sikep503 = new SIKEParameters(503, false, StubApp.getString2(34175));
    public static final SIKEParameters sikep610 = new SIKEParameters(610, false, StubApp.getString2(34176));
    public static final SIKEParameters sikep751 = new SIKEParameters(751, false, StubApp.getString2(34177));
    public static final SIKEParameters sikep434_compressed = new SIKEParameters(434, true, StubApp.getString2(34178));
    public static final SIKEParameters sikep503_compressed = new SIKEParameters(503, true, StubApp.getString2(34179));
    public static final SIKEParameters sikep610_compressed = new SIKEParameters(610, true, StubApp.getString2(34180));
    public static final SIKEParameters sikep751_compressed = new SIKEParameters(751, true, StubApp.getString2(34181));

    private SIKEParameters(int i3, boolean z2, String str) {
        this.name = str;
        this.engine = new SIKEEngine(i3, z2);
    }

    public SIKEEngine getEngine() {
        return this.engine;
    }

    public String getName() {
        return this.name;
    }

    public int getSessionKeySize() {
        return this.engine.getDefaultSessionKeySize();
    }
}
