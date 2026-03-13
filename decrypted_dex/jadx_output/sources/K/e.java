package K;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3550b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f3551c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3553e;

    public /* synthetic */ e(String str, Context context, Object obj, int i3, int i10) {
        this.f3549a = i10;
        this.f3550b = str;
        this.f3551c = context;
        this.f3553e = obj;
        this.f3552d = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3549a) {
            case 0:
                Object[] objArr = {(d) this.f3553e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return h.b(this.f3550b, this.f3551c, Collections.unmodifiableList(arrayList), this.f3552d);
            default:
                try {
                    return h.b(this.f3550b, this.f3551c, (List) this.f3553e, this.f3552d);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
