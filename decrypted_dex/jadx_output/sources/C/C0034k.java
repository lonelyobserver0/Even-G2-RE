package C;

import android.app.Notification;
import android.os.Bundle;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: C.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0034k extends C {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f847e;

    /* renamed from: f, reason: collision with root package name */
    public Object f848f;

    public C0034k(int i3) {
        this.f847e = i3;
        switch (i3) {
            case 1:
                this.f848f = new ArrayList();
                break;
        }
    }

    @Override // C.C
    public final void b(E e10) {
        switch (this.f847e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) e10.f786c).setBigContentTitle(this.f781b).bigText((CharSequence) this.f848f);
                if (this.f783d) {
                    bigText.setSummaryText(this.f782c);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) e10.f786c).setBigContentTitle(this.f781b);
                if (this.f783d) {
                    bigContentTitle.setSummaryText(this.f782c);
                }
                Iterator it = ((ArrayList) this.f848f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // C.C
    public final String c() {
        switch (this.f847e) {
            case 0:
                return StubApp.getString2(707);
            default:
                return StubApp.getString2(708);
        }
    }

    @Override // C.C
    public final void d(Bundle bundle) {
        switch (this.f847e) {
            case 0:
                super.d(bundle);
                this.f848f = bundle.getCharSequence(StubApp.getString2(716));
                break;
            default:
                super.d(bundle);
                ArrayList arrayList = (ArrayList) this.f848f;
                arrayList.clear();
                String string2 = StubApp.getString2(717);
                if (bundle.containsKey(string2)) {
                    Collections.addAll(arrayList, bundle.getCharSequenceArray(string2));
                    break;
                }
                break;
        }
    }
}
