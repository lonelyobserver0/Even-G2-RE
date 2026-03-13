package d0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import c0.AbstractC0547a;
import com.stub.StubApp;
import e0.AbstractC0831d;
import e0.C0830c;
import e0.C0832e;
import e0.EnumC0829b;
import i.AbstractActivityC1027h;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d0.A, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class LayoutInflaterFactory2C0763A implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final M f13123a;

    public LayoutInflaterFactory2C0763A(M m4) {
        this.f13123a = m4;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        U g10;
        boolean equals = C0794y.class.getName().equals(str);
        M m4 = this.f13123a;
        if (equals) {
            return new C0794y(context, attributeSet, m4);
        }
        String string2 = StubApp.getString2(16450);
        if (string2.equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, StubApp.getString2(11020));
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0547a.f10775a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z2 = AbstractComponentCallbacksC0789t.class.isAssignableFrom(C0768F.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z2 = false;
                }
                if (z2) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + StubApp.getString2(16451) + attributeValue);
                    }
                    AbstractComponentCallbacksC0789t B7 = resourceId != -1 ? m4.B(resourceId) : null;
                    if (B7 == null && string != null) {
                        B7 = m4.C(string);
                    }
                    if (B7 == null && id != -1) {
                        B7 = m4.B(id);
                    }
                    String string22 = StubApp.getString2(16452);
                    String string23 = StubApp.getString2(49);
                    if (B7 == null) {
                        C0768F G4 = m4.G();
                        context.getClassLoader();
                        B7 = G4.a(attributeValue);
                        B7.f13379p = true;
                        B7.f13388z = resourceId != 0 ? resourceId : id;
                        B7.f13346A = id;
                        B7.f13347B = string;
                        B7.f13380q = true;
                        B7.f13384v = m4;
                        C0791v c0791v = m4.f13179w;
                        B7.f13385w = c0791v;
                        AbstractActivityC1027h abstractActivityC1027h = c0791v.f13392b;
                        B7.f13352G = true;
                        if ((c0791v != null ? c0791v.f13391a : null) != null) {
                            B7.f13352G = true;
                        }
                        g10 = m4.a(B7);
                        if (M.J(2)) {
                            Log.v(string23, string22 + B7 + StubApp.getString2(16453) + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (B7.f13380q) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + StubApp.getString2(16459) + Integer.toHexString(resourceId) + StubApp.getString2(16460) + string + StubApp.getString2(16461) + Integer.toHexString(id) + StubApp.getString2(16462) + attributeValue);
                        }
                        B7.f13380q = true;
                        B7.f13384v = m4;
                        C0791v c0791v2 = m4.f13179w;
                        B7.f13385w = c0791v2;
                        AbstractActivityC1027h abstractActivityC1027h2 = c0791v2.f13392b;
                        B7.f13352G = true;
                        if ((c0791v2 != null ? c0791v2.f13391a : null) != null) {
                            B7.f13352G = true;
                        }
                        g10 = m4.g(B7);
                        if (M.J(2)) {
                            Log.v(string23, StubApp.getString2(16454) + B7 + StubApp.getString2(16455) + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C0830c c0830c = AbstractC0831d.f13570a;
                    Intrinsics.checkNotNullParameter(B7, string2);
                    Intrinsics.checkNotNullParameter(B7, string2);
                    C0832e c0832e = new C0832e(B7, StubApp.getString2(16456) + B7 + StubApp.getString2(16457) + viewGroup);
                    AbstractC0831d.c(c0832e);
                    C0830c a3 = AbstractC0831d.a(B7);
                    if (a3.f13568a.contains(EnumC0829b.f13563d) && AbstractC0831d.e(a3, B7.getClass(), C0832e.class)) {
                        AbstractC0831d.b(a3, c0832e);
                    }
                    B7.f13353H = viewGroup;
                    g10.k();
                    g10.j();
                    View view2 = B7.f13354I;
                    if (view2 == null) {
                        throw new IllegalStateException(E1.a.k(string22, attributeValue, StubApp.getString2(16458)));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (B7.f13354I.getTag() == null) {
                        B7.f13354I.setTag(string);
                    }
                    B7.f13354I.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0795z(this, g10));
                    return B7.f13354I;
                }
            }
        }
        return null;
    }
}
