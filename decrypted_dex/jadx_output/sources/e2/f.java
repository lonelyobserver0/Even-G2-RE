package e2;

import Xa.o;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import c2.C0558j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f implements M.a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13590a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f13591b;

    /* renamed from: c, reason: collision with root package name */
    public C0558j f13592c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f13593d;

    public f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13590a = context;
        this.f13591b = new ReentrantLock();
        this.f13593d = new LinkedHashSet();
    }

    @Override // M.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ReentrantLock reentrantLock = this.f13591b;
        reentrantLock.lock();
        try {
            this.f13592c = e.b(this.f13590a, value);
            Iterator it = this.f13593d.iterator();
            while (it.hasNext()) {
                ((M.a) it.next()).accept(this.f13592c);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(o listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ReentrantLock reentrantLock = this.f13591b;
        reentrantLock.lock();
        try {
            C0558j c0558j = this.f13592c;
            if (c0558j != null) {
                listener.accept(c0558j);
            }
            this.f13593d.add(listener);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
