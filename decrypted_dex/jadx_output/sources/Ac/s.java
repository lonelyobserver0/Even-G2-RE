package Ac;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f387a;

    /* renamed from: b, reason: collision with root package name */
    public int f388b;

    public s() {
        this.f387a = new ArrayList();
        this.f388b = 128;
    }

    public boolean a() {
        return this.f388b < this.f387a.size();
    }

    public s(ArrayList routes) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        this.f387a = routes;
    }
}
