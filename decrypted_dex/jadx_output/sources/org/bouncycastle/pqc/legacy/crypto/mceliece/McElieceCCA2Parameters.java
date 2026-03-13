package org.bouncycastle.pqc.legacy.crypto.mceliece;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McElieceCCA2Parameters extends McElieceParameters {
    private final String digest;

    public McElieceCCA2Parameters() {
        this(11, 50, StubApp.getString2(1488));
    }

    public String getDigest() {
        return this.digest;
    }

    public McElieceCCA2Parameters(int i3) {
        this(i3, StubApp.getString2(1488));
    }

    public McElieceCCA2Parameters(int i3, int i10) {
        this(i3, i10, StubApp.getString2(1488));
    }

    public McElieceCCA2Parameters(int i3, int i10, int i11) {
        this(i3, i10, i11, StubApp.getString2(1488));
    }

    public McElieceCCA2Parameters(int i3, int i10, int i11, String str) {
        super(i3, i10, i11);
        this.digest = str;
    }

    public McElieceCCA2Parameters(int i3, int i10, String str) {
        super(i3, i10);
        this.digest = str;
    }

    public McElieceCCA2Parameters(int i3, String str) {
        super(i3);
        this.digest = str;
    }

    public McElieceCCA2Parameters(String str) {
        this(11, 50, str);
    }
}
