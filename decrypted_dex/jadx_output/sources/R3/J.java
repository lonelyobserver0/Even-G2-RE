package R3;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class J extends Fragment implements InterfaceC0240i {

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f6106b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Bc.i f6107a = new Bc.i();

    @Override // R3.InterfaceC0240i
    public final AbstractC0239h b(Class cls, String str) {
        return (AbstractC0239h) cls.cast(((Map) this.f6107a.f767c).get(str));
    }

    @Override // R3.InterfaceC0240i
    public final Activity c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f6107a.f767c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0239h) it.next()).getClass();
        }
    }

    @Override // R3.InterfaceC0240i
    public final void g(String str, AbstractC0239h abstractC0239h) {
        this.f6107a.v(str, abstractC0239h);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i3, int i10, Intent intent) {
        super.onActivityResult(i3, i10, intent);
        Iterator it = ((Map) this.f6107a.f767c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0239h) it.next()).c(i3, i10, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6107a.w(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Bc.i iVar = this.f6107a;
        iVar.f766b = 5;
        Iterator it = ((Map) iVar.f767c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0239h) it.next()).e();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        Bc.i iVar = this.f6107a;
        iVar.f766b = 3;
        Iterator it = ((Map) iVar.f767c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0239h) it.next()).f();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f6107a.x(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        Bc.i iVar = this.f6107a;
        iVar.f766b = 2;
        Iterator it = ((Map) iVar.f767c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0239h) it.next()).h();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        Bc.i iVar = this.f6107a;
        iVar.f766b = 4;
        Iterator it = ((Map) iVar.f767c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0239h) it.next()).i();
        }
    }
}
