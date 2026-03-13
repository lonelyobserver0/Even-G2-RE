package W;

import A9.m;
import Qb.I;
import android.content.Context;
import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements ReadOnlyProperty {

    /* renamed from: a, reason: collision with root package name */
    public final String f8057a;

    /* renamed from: b, reason: collision with root package name */
    public final U.a f8058b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f8059c;

    /* renamed from: d, reason: collision with root package name */
    public final I f8060d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8061e;

    /* renamed from: f, reason: collision with root package name */
    public volatile X.d f8062f;

    public b(String name, U.a aVar, Function1 produceMigrations, I scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f8057a = name;
        this.f8058b = aVar;
        this.f8059c = produceMigrations;
        this.f8060d = scope;
        this.f8061e = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty property) {
        X.d dVar;
        Context thisRef = (Context) obj;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        X.d dVar2 = this.f8062f;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (this.f8061e) {
            try {
                if (this.f8062f == null) {
                    Context applicationContext = StubApp.getOrigApplicationContext(thisRef.getApplicationContext());
                    U.a aVar = this.f8058b;
                    Function1 function1 = this.f8059c;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f8062f = X.f.a(aVar, (List) function1.invoke(applicationContext), this.f8060d, new m(5, applicationContext, this));
                }
                dVar = this.f8062f;
                Intrinsics.checkNotNull(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
