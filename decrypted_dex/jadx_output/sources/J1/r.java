package J1;

import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public volatile P1.c f3364a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f3365b;

    /* renamed from: c, reason: collision with root package name */
    public A f3366c;

    /* renamed from: d, reason: collision with root package name */
    public O1.c f3367d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3369f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f3370g;

    /* renamed from: k, reason: collision with root package name */
    public final Map f3373k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f3374l;

    /* renamed from: e, reason: collision with root package name */
    public final m f3368e = d();

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f3371h = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final ReentrantReadWriteLock f3372i = new ReentrantReadWriteLock();
    public final ThreadLocal j = new ThreadLocal();

    public r() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f3373k = synchronizedMap;
        this.f3374l = new LinkedHashMap();
    }

    public static Object o(Class cls, O1.c cVar) {
        if (cls.isInstance(cVar)) {
            return cVar;
        }
        if (cVar instanceof e) {
            return o(cls, ((e) cVar).getDelegate());
        }
        return null;
    }

    public final void a() {
        if (!this.f3369f && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException(StubApp.getString2(2943));
        }
    }

    public final void b() {
        if (!g().s().v() && this.j.get() != null) {
            throw new IllegalStateException(StubApp.getString2(2944));
        }
    }

    public final void c() {
        a();
        a();
        P1.c s10 = g().s();
        this.f3368e.c(s10);
        if (s10.A()) {
            s10.d();
        } else {
            s10.a();
        }
    }

    public abstract m d();

    public abstract O1.c e(d dVar);

    public List f(LinkedHashMap autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt.emptyList();
    }

    public final O1.c g() {
        O1.c cVar = this.f3367d;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalOpenHelper");
        return null;
    }

    public Set h() {
        return SetsKt.emptySet();
    }

    public Map i() {
        return MapsKt.emptyMap();
    }

    public final void j() {
        g().s().h();
        if (g().s().v()) {
            return;
        }
        m mVar = this.f3368e;
        if (mVar.f3335e.compareAndSet(false, true)) {
            Executor executor = mVar.f3331a.f3365b;
            if (executor == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
                executor = null;
            }
            executor.execute(mVar.f3341l);
        }
    }

    public final void k(P1.c database) {
        Intrinsics.checkNotNullParameter(database, "db");
        m mVar = this.f3368e;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (mVar.f3340k) {
            if (mVar.f3336f) {
                Log.e(StubApp.getString2("53"), StubApp.getString2("2945"));
                return;
            }
            database.k(StubApp.getString2("2946"));
            database.k(StubApp.getString2("2947"));
            database.k(StubApp.getString2("2948"));
            mVar.c(database);
            mVar.f3337g = database.e(StubApp.getString2("2949"));
            mVar.f3336f = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean l() {
        P1.c cVar = this.f3364a;
        return cVar != null && cVar.f5457a.isOpen();
    }

    public final Cursor m(O1.e query) {
        Intrinsics.checkNotNullParameter(query, "query");
        a();
        b();
        return g().s().C(query);
    }

    public final void n() {
        g().s().G();
    }
}
