package t0;

import java.io.IOException;

/* renamed from: t0.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1709i extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21069b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f21070a;

    public C1709i(int i3) {
        this.f21070a = i3;
    }

    public C1709i(int i3, Exception exc) {
        super(exc);
        this.f21070a = i3;
    }

    public C1709i(String str, int i3) {
        super(str);
        this.f21070a = i3;
    }

    public C1709i(String str, Exception exc, int i3) {
        super(str, exc);
        this.f21070a = i3;
    }
}
