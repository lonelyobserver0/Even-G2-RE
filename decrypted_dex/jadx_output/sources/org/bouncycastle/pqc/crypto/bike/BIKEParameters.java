package org.bouncycastle.pqc.crypto.bike;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BIKEParameters implements CipherParameters {
    public static final BIKEParameters bike128 = new BIKEParameters(StubApp.getString2(33956), 12323, 142, 134, 256, 5, 3, 128);
    public static final BIKEParameters bike192 = new BIKEParameters(StubApp.getString2(33957), 24659, 206, 199, 256, 5, 3, 192);
    public static final BIKEParameters bike256 = new BIKEParameters(StubApp.getString2(33958), 40973, 274, 264, 256, 5, 3, 256);
    private BIKEEngine bikeEngine;
    private final int defaultKeySize;

    /* renamed from: l, reason: collision with root package name */
    private int f19361l;
    private String name;
    private int nbIter;

    /* renamed from: r, reason: collision with root package name */
    private int f19362r;

    /* renamed from: t, reason: collision with root package name */
    private int f19363t;
    private int tau;

    /* renamed from: w, reason: collision with root package name */
    private int f19364w;

    private BIKEParameters(String str, int i3, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.name = str;
        this.f19362r = i3;
        this.f19364w = i10;
        this.f19363t = i11;
        this.f19361l = i12;
        this.nbIter = i13;
        this.tau = i14;
        this.defaultKeySize = i15;
        this.bikeEngine = new BIKEEngine(i3, i10, i11, i12, i13, i14);
    }

    public BIKEEngine getEngine() {
        return this.bikeEngine;
    }

    public int getL() {
        return this.f19361l;
    }

    public int getLByte() {
        return this.f19361l / 8;
    }

    public String getName() {
        return this.name;
    }

    public int getNbIter() {
        return this.nbIter;
    }

    public int getR() {
        return this.f19362r;
    }

    public int getRByte() {
        return (this.f19362r + 7) / 8;
    }

    public int getSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getT() {
        return this.f19363t;
    }

    public int getTau() {
        return this.tau;
    }

    public int getW() {
        return this.f19364w;
    }
}
