package K;

import R3.r;
import androidx.work.impl.foreground.SystemForegroundService;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3536a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3537b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3538c;

    public /* synthetic */ a(int i3, int i10, Object obj) {
        this.f3536a = i10;
        this.f3538c = obj;
        this.f3537b = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3536a) {
            case 0:
                E.b bVar = (E.b) ((F5.c) this.f3538c).f2238b;
                if (bVar != null) {
                    bVar.e(this.f3537b);
                    break;
                }
                break;
            case 1:
                ((r) this.f3538c).i(this.f3537b);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.f3538c;
                int size = arrayList.size();
                int i3 = 0;
                if (this.f3537b == 1) {
                    while (i3 < size) {
                        ((Y.f) arrayList.get(i3)).b();
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((Y.f) arrayList.get(i3)).a();
                        i3++;
                    }
                    break;
                }
            case 3:
                ((com.google.android.material.datepicker.i) this.f3538c).f11919v0.smoothScrollToPosition(this.f3537b);
                break;
            default:
                ((SystemForegroundService) this.f3538c).f10391e.cancel(this.f3537b);
                break;
        }
    }

    public a(List list, int i3, Throwable th) {
        this.f3536a = 2;
        M.d.e(list, StubApp.getString2(3098));
        this.f3538c = new ArrayList(list);
        this.f3537b = i3;
    }
}
