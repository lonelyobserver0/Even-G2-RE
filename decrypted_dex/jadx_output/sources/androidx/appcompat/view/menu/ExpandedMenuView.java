package androidx.appcompat.view.menu;

import a5.c;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import m.k;
import m.l;
import m.n;
import m.z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ExpandedMenuView extends ListView implements k, z, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f9399b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public l f9400a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        c E10 = c.E(context, attributeSet, f9399b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) E10.f9283c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(E10.r(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(E10.r(1));
        }
        E10.I();
    }

    @Override // m.z
    public final void b(l lVar) {
        this.f9400a = lVar;
    }

    @Override // m.k
    public final boolean c(n nVar) {
        return this.f9400a.q(nVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
        c((n) getAdapter().getItem(i3));
    }
}
