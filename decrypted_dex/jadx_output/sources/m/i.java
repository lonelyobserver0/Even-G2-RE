package m;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final l f16915a;

    /* renamed from: b, reason: collision with root package name */
    public int f16916b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16917c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16918d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f16919e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16920f;

    public i(l lVar, LayoutInflater layoutInflater, boolean z2, int i3) {
        this.f16918d = z2;
        this.f16919e = layoutInflater;
        this.f16915a = lVar;
        this.f16920f = i3;
        a();
    }

    public final void a() {
        l lVar = this.f16915a;
        n nVar = lVar.f16942v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((n) arrayList.get(i3)) == nVar) {
                    this.f16916b = i3;
                    return;
                }
            }
        }
        this.f16916b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i3) {
        ArrayList l9;
        l lVar = this.f16915a;
        if (this.f16918d) {
            lVar.i();
            l9 = lVar.j;
        } else {
            l9 = lVar.l();
        }
        int i10 = this.f16916b;
        if (i10 >= 0 && i3 >= i10) {
            i3++;
        }
        return (n) l9.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l9;
        l lVar = this.f16915a;
        if (this.f16918d) {
            lVar.i();
            l9 = lVar.j;
        } else {
            l9 = lVar.l();
        }
        return this.f16916b < 0 ? l9.size() : l9.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f16919e.inflate(this.f16920f, viewGroup, false);
        }
        int i10 = getItem(i3).f16952b;
        int i11 = i3 - 1;
        int i12 = i11 >= 0 ? getItem(i11).f16952b : i10;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f16915a.m() && i10 != i12) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        y yVar = (y) view;
        if (this.f16917c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.a(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
