package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RunnableC0451d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0457j f10126c;

    public /* synthetic */ RunnableC0451d(C0457j c0457j, ArrayList arrayList, int i3) {
        this.f10124a = i3;
        this.f10126c = c0457j;
        this.f10125b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10124a) {
            case 0:
                ArrayList arrayList = this.f10125b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    C0457j c0457j = this.f10126c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0457j.f10192m.remove(arrayList);
                        break;
                    } else {
                        C0456i c0456i = (C0456i) it.next();
                        e0 e0Var = c0456i.f10180a;
                        c0457j.getClass();
                        int i3 = c0456i.f10183d - c0456i.f10181b;
                        int i10 = c0456i.f10184e - c0456i.f10182c;
                        View view = e0Var.f10140a;
                        if (i3 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i10 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0457j.f10195p.add(e0Var);
                        animate.setDuration(c0457j.f10015e).setListener(new C0453f(c0457j, e0Var, i3, view, i10, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f10125b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    C0457j c0457j2 = this.f10126c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0457j2.f10193n.remove(arrayList2);
                        break;
                    } else {
                        C0455h c0455h = (C0455h) it2.next();
                        c0457j2.getClass();
                        e0 e0Var2 = c0455h.f10172a;
                        View view2 = e0Var2 == null ? null : e0Var2.f10140a;
                        e0 e0Var3 = c0455h.f10173b;
                        View view3 = e0Var3 != null ? e0Var3.f10140a : null;
                        ArrayList arrayList3 = c0457j2.f10197r;
                        long j = c0457j2.f10016f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(c0455h.f10172a);
                            duration.translationX(c0455h.f10176e - c0455h.f10174c);
                            duration.translationY(c0455h.f10177f - c0455h.f10175d);
                            duration.alpha(0.0f).setListener(new C0454g(c0457j2, c0455h, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0455h.f10173b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C0454g(c0457j2, c0455h, animate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.f10125b;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it3.hasNext();
                    C0457j c0457j3 = this.f10126c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0457j3.f10191l.remove(arrayList4);
                        break;
                    } else {
                        e0 e0Var4 = (e0) it3.next();
                        c0457j3.getClass();
                        View view4 = e0Var4.f10140a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0457j3.f10194o.add(e0Var4);
                        animate3.alpha(1.0f).setDuration(c0457j3.f10013c).setListener(new C0452e(c0457j3, e0Var4, view4, animate3)).start();
                    }
                }
        }
    }
}
