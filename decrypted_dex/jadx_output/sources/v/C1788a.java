package v;

import java.util.concurrent.CancellationException;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1788a {

    /* renamed from: c, reason: collision with root package name */
    public static final C1788a f21489c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1788a f21490d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21491a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f21492b;

    static {
        if (AbstractC1794g.f21506d) {
            f21490d = null;
            f21489c = null;
        } else {
            f21490d = new C1788a(false, null);
            f21489c = new C1788a(true, null);
        }
    }

    public C1788a(boolean z2, CancellationException cancellationException) {
        this.f21491a = z2;
        this.f21492b = cancellationException;
    }
}
