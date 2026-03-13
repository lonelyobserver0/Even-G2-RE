package L0;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import t0.C1711k;

/* renamed from: L0.t, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0123t {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLong f4129c = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final Map f4130a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4131b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0123t(C1711k c1711k) {
        this(Collections.EMPTY_MAP, 0L);
        Uri uri = c1711k.f21077a;
    }

    public C0123t(Map map, long j) {
        this.f4130a = map;
        this.f4131b = j;
    }
}
