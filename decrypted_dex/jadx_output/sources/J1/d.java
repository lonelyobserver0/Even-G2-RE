package J1;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3308a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3309b;

    /* renamed from: c, reason: collision with root package name */
    public final O1.b f3310c;

    /* renamed from: d, reason: collision with root package name */
    public final A0.c f3311d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3312e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3313f;

    /* renamed from: g, reason: collision with root package name */
    public final q f3314g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f3315h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f3316i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3317k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f3318l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f3319m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3320n;

    public d(Context context, String str, O1.b sqliteOpenHelperFactory, A0.c migrationContainer, ArrayList arrayList, boolean z2, q journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z10, boolean z11, LinkedHashSet linkedHashSet, ArrayList typeConverters, ArrayList autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f3308a = context;
        this.f3309b = str;
        this.f3310c = sqliteOpenHelperFactory;
        this.f3311d = migrationContainer;
        this.f3312e = arrayList;
        this.f3313f = z2;
        this.f3314g = journalMode;
        this.f3315h = queryExecutor;
        this.f3316i = transactionExecutor;
        this.j = z10;
        this.f3317k = z11;
        this.f3318l = linkedHashSet;
        this.f3319m = typeConverters;
        this.f3320n = autoMigrationSpecs;
    }
}
