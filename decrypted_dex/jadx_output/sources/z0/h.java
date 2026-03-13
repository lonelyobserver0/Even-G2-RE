package z0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f23678a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23679b;

    /* renamed from: c, reason: collision with root package name */
    public final List f23680c;

    /* renamed from: d, reason: collision with root package name */
    public final List f23681d;

    public h(String str, long j, ArrayList arrayList, List list) {
        this.f23678a = str;
        this.f23679b = j;
        this.f23680c = Collections.unmodifiableList(arrayList);
        this.f23681d = Collections.unmodifiableList(list);
    }
}
