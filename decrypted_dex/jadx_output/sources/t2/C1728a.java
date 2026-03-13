package t2;

import java.util.concurrent.CancellationException;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1728a {

    /* renamed from: c, reason: collision with root package name */
    public static final C1728a f21136c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1728a f21137d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21138a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f21139b;

    static {
        if (h.f21155d) {
            f21137d = null;
            f21136c = null;
        } else {
            f21137d = new C1728a(false, null);
            f21136c = new C1728a(true, null);
        }
    }

    public C1728a(boolean z2, CancellationException cancellationException) {
        this.f21138a = z2;
        this.f21139b = cancellationException;
    }
}
