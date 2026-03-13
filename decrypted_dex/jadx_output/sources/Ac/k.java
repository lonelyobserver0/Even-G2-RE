package Ac;

import java.net.Proxy;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract /* synthetic */ class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f351a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        iArr[Proxy.Type.HTTP.ordinal()] = 2;
        f351a = iArr;
    }
}
