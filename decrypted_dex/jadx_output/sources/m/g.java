package m;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f16907a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f16908b;

    public g(h hVar) {
        this.f16908b = hVar;
        a();
    }

    public final void a() {
        l lVar = this.f16908b.f16911c;
        n nVar = lVar.f16942v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((n) arrayList.get(i3)) == nVar) {
                    this.f16907a = i3;
                    return;
                }
            }
        }
        this.f16907a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i3) {
        h hVar = this.f16908b;
        l lVar = hVar.f16911c;
        lVar.i();
        ArrayList arrayList = lVar.j;
        hVar.getClass();
        int i10 = this.f16907a;
        if (i10 >= 0 && i3 >= i10) {
            i3++;
        }
        return (n) arrayList.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        h hVar = this.f16908b;
        l lVar = hVar.f16911c;
        lVar.i();
        int size = lVar.j.size();
        hVar.getClass();
        return this.f16907a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f16908b.f16910b.inflate(2131427344, viewGroup, false);
        }
        ((y) view).a(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
