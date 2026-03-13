package org.bouncycastle.pqc.crypto.picnic;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PicnicParameters implements CipherParameters {
    private final String name;
    private final int param;
    public static final PicnicParameters picnicl1fs = new PicnicParameters(StubApp.getString2(34113), 1);
    public static final PicnicParameters picnicl1ur = new PicnicParameters(StubApp.getString2(34114), 2);
    public static final PicnicParameters picnicl3fs = new PicnicParameters(StubApp.getString2(34115), 3);
    public static final PicnicParameters picnicl3ur = new PicnicParameters(StubApp.getString2(34116), 4);
    public static final PicnicParameters picnicl5fs = new PicnicParameters(StubApp.getString2(34117), 5);
    public static final PicnicParameters picnicl5ur = new PicnicParameters(StubApp.getString2(34118), 6);
    public static final PicnicParameters picnic3l1 = new PicnicParameters(StubApp.getString2(34119), 7);
    public static final PicnicParameters picnic3l3 = new PicnicParameters(StubApp.getString2(34120), 8);
    public static final PicnicParameters picnic3l5 = new PicnicParameters(StubApp.getString2(34121), 9);
    public static final PicnicParameters picnicl1full = new PicnicParameters(StubApp.getString2(34122), 10);
    public static final PicnicParameters picnicl3full = new PicnicParameters(StubApp.getString2(34123), 11);
    public static final PicnicParameters picnicl5full = new PicnicParameters(StubApp.getString2(34124), 12);

    private PicnicParameters(String str, int i3) {
        this.name = str;
        this.param = i3;
    }

    public PicnicEngine getEngine() {
        return new PicnicEngine(this.param);
    }

    public String getName() {
        return this.name;
    }
}
