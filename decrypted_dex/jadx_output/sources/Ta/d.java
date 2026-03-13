package Ta;

import B0.o;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import dev.steenbakker.nordicdfu.DfuService;
import dev.steenbakker.nordicdfu.DfuService2;
import dev.steenbakker.nordicdfu.DfuService3;
import dev.steenbakker.nordicdfu.DfuService4;
import dev.steenbakker.nordicdfu.DfuService5;
import dev.steenbakker.nordicdfu.DfuService6;
import dev.steenbakker.nordicdfu.DfuService7;
import dev.steenbakker.nordicdfu.DfuService8;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static final ArrayList f7243f = CollectionsKt.arrayListOf(DfuService.class, DfuService2.class, DfuService3.class, DfuService4.class, DfuService5.class, DfuService6.class, DfuService7.class, DfuService8.class);

    /* renamed from: a, reason: collision with root package name */
    public final Context f7244a;

    /* renamed from: b, reason: collision with root package name */
    public final e f7245b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f7246c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7247d;

    /* renamed from: e, reason: collision with root package name */
    public final c f7248e;

    public d(Context context, e callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f7244a = context;
        this.f7245b = callback;
        this.f7246c = new LinkedHashMap();
        this.f7248e = new c(this);
    }

    public static final void a(d dVar) {
        dVar.getClass();
        new Handler(Looper.getMainLooper()).postDelayed(new o(dVar, 10), 200L);
    }
}
