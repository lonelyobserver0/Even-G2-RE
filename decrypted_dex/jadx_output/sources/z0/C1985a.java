package z0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1985a {

    /* renamed from: a, reason: collision with root package name */
    public final long f23636a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23637b;

    /* renamed from: c, reason: collision with root package name */
    public final List f23638c;

    /* renamed from: d, reason: collision with root package name */
    public final List f23639d;

    /* renamed from: e, reason: collision with root package name */
    public final List f23640e;

    /* renamed from: f, reason: collision with root package name */
    public final List f23641f;

    public C1985a(long j, int i3, ArrayList arrayList, List list, List list2, List list3) {
        this.f23636a = j;
        this.f23637b = i3;
        this.f23638c = Collections.unmodifiableList(arrayList);
        this.f23639d = Collections.unmodifiableList(list);
        this.f23640e = Collections.unmodifiableList(list2);
        this.f23641f = Collections.unmodifiableList(list3);
    }
}
