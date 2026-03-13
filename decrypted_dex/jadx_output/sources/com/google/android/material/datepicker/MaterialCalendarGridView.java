package com.google.android.material.datepicker;

import N.I;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class MaterialCalendarGridView extends GridView {
    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        hc.b.I(null);
        if (j.O(getContext())) {
            setNextFocusLeftId(2131230811);
            setNextFocusRightId(2131230827);
        }
        I.i(this, new Q.e(2));
    }

    public final n a() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((n) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        n nVar = (n) super.getAdapter();
        nVar.getClass();
        nVar.getItem(nVar.f11943a.e());
        nVar.getItem(nVar.b());
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z2, int i3, Rect rect) {
        if (!z2) {
            super.onFocusChanged(false, i3, rect);
            return;
        }
        if (i3 == 33) {
            setSelection(((n) super.getAdapter()).b());
        } else if (i3 == 130) {
            setSelection(((n) super.getAdapter()).f11943a.e());
        } else {
            super.onFocusChanged(true, i3, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (!super.onKeyDown(i3, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((n) super.getAdapter()).f11943a.e()) {
            return true;
        }
        if (19 != i3) {
            return false;
        }
        setSelection(((n) super.getAdapter()).f11943a.e());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i3) {
        if (i3 < ((n) super.getAdapter()).f11943a.e()) {
            super.setSelection(((n) super.getAdapter()).f11943a.e());
        } else {
            super.setSelection(i3);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof n) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format(StubApp.getString2(12496), MaterialCalendarGridView.class.getCanonicalName(), n.class.getCanonicalName()));
        }
    }
}
