package Lc;

import Kc.y;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final y f4411a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4412b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4413c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f4414d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4415e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4416f;

    public /* synthetic */ h(y yVar) {
        this(yVar, true, "", -1L, -1L, -1, null, -1L);
    }

    public h(y canonicalPath, boolean z2, String comment, long j, long j3, int i3, Long l9, long j10) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f4411a = canonicalPath;
        this.f4412b = z2;
        this.f4413c = j3;
        this.f4414d = l9;
        this.f4415e = j10;
        this.f4416f = new ArrayList();
    }
}
