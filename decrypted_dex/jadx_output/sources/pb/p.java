package pb;

import io.flutter.plugin.common.EventChannel;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class p implements EventChannel.EventSink {

    /* renamed from: a, reason: collision with root package name */
    public EventChannel.EventSink f19793a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19794b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f19795c = false;

    public final void a() {
        if (this.f19793a == null) {
            return;
        }
        ArrayList arrayList = this.f19794b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof n) {
                this.f19793a.endOfStream();
            } else if (next instanceof o) {
                o oVar = (o) next;
                this.f19793a.error(oVar.f19790a, oVar.f19791b, oVar.f19792c);
            } else {
                this.f19793a.success(next);
            }
        }
        arrayList.clear();
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public final void endOfStream() {
        n nVar = new n();
        if (!this.f19795c) {
            this.f19794b.add(nVar);
        }
        a();
        this.f19795c = true;
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public final void error(String str, String str2, Object obj) {
        o oVar = new o();
        oVar.f19790a = str;
        oVar.f19791b = str2;
        oVar.f19792c = obj;
        if (!this.f19795c) {
            this.f19794b.add(oVar);
        }
        a();
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public final void success(Object obj) {
        if (!this.f19795c) {
            this.f19794b.add(obj);
        }
        a();
    }
}
