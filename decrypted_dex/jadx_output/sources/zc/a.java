package zc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f24137a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24138b;

    /* renamed from: c, reason: collision with root package name */
    public b f24139c;

    /* renamed from: d, reason: collision with root package name */
    public long f24140d;

    public a(String name, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f24137a = name;
        this.f24138b = z2;
        this.f24140d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f24137a;
    }
}
