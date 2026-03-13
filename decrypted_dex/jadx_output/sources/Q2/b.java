package Q2;

import J1.v;
import android.database.Cursor;
import com.even.even_core.utils.room.EvDatabase_Impl;
import com.google.android.gms.internal.measurement.F1;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f5703b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f5704c;

    public /* synthetic */ b(g gVar, v vVar, int i3) {
        this.f5702a = i3;
        this.f5704c = gVar;
        this.f5703b = vVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Cursor u2;
        Boolean bool;
        Boolean bool2;
        switch (this.f5702a) {
            case 0:
                u2 = F1.u((EvDatabase_Impl) this.f5704c.f5711b, this.f5703b);
                try {
                    if (u2.moveToFirst()) {
                        bool = Boolean.valueOf(u2.getInt(0) != 0);
                    } else {
                        bool = Boolean.FALSE;
                    }
                    return bool;
                } finally {
                }
            case 1:
                u2 = F1.u((EvDatabase_Impl) this.f5704c.f5711b, this.f5703b);
                try {
                    if (u2.moveToFirst()) {
                        bool2 = Boolean.valueOf(u2.getInt(0) != 0);
                    } else {
                        bool2 = Boolean.FALSE;
                    }
                    return bool2;
                } finally {
                }
            default:
                EvDatabase_Impl evDatabase_Impl = (EvDatabase_Impl) this.f5704c.f5711b;
                v vVar = this.f5703b;
                u2 = F1.u(evDatabase_Impl, vVar);
                try {
                    ArrayList arrayList = new ArrayList(u2.getCount());
                    while (u2.moveToNext()) {
                        arrayList.add(Long.valueOf(u2.getLong(0)));
                    }
                    return arrayList;
                } finally {
                    u2.close();
                    vVar.h();
                }
        }
    }
}
