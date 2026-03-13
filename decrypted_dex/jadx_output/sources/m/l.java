package m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import com.stub.StubApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class l implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f16921y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f16922a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f16923b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16924c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16925d;

    /* renamed from: e, reason: collision with root package name */
    public j f16926e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f16927f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f16928g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16929h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f16930i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16931k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f16933m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f16934n;

    /* renamed from: o, reason: collision with root package name */
    public View f16935o;

    /* renamed from: v, reason: collision with root package name */
    public n f16942v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16944x;

    /* renamed from: l, reason: collision with root package name */
    public int f16932l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16936p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16937q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16938r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16939s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f16940t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f16941u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f16943w = false;

    public l(Context context) {
        boolean z2 = false;
        this.f16922a = context;
        Resources resources = context.getResources();
        this.f16923b = resources;
        this.f16927f = new ArrayList();
        this.f16928g = new ArrayList();
        this.f16929h = true;
        this.f16930i = new ArrayList();
        this.j = new ArrayList();
        this.f16931k = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(context).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z2 = true;
        }
        this.f16925d = z2;
    }

    public final n a(int i3, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 < 0 || i13 >= 6) {
            throw new IllegalArgumentException(StubApp.getString2(21039));
        }
        int i14 = (f16921y[i13] << 16) | (65535 & i11);
        n nVar = new n(this, i3, i10, i11, i14, charSequence, this.f16932l);
        ArrayList arrayList = this.f16927f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i12 = 0;
                break;
            }
            if (((n) arrayList.get(size)).f16954d <= i14) {
                i12 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i12, nVar);
        p(true);
        return nVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i3, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        PackageManager packageManager = this.f16922a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i12 & 1) == 0) {
            removeGroup(i3);
        }
        for (int i14 = 0; i14 < size; i14++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i14);
            int i15 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i15 < 0 ? intent : intentArr[i15]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            n a3 = a(i3, i10, i11, resolveInfo.loadLabel(packageManager));
            a3.setIcon(resolveInfo.loadIcon(packageManager));
            a3.f16957g = intent2;
            if (menuItemArr != null && (i13 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i13] = a3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(x xVar, Context context) {
        this.f16941u.add(new WeakReference(xVar));
        xVar.c(context, this);
        this.f16931k = true;
    }

    public final void c(boolean z2) {
        if (this.f16939s) {
            return;
        }
        this.f16939s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16941u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.b(this, z2);
            }
        }
        this.f16939s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        n nVar = this.f16942v;
        if (nVar != null) {
            d(nVar);
        }
        this.f16927f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f16934n = null;
        this.f16933m = null;
        this.f16935o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16941u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f16942v == nVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = xVar.j(nVar);
                    if (z2) {
                        break;
                    }
                }
            }
            v();
            if (z2) {
                this.f16942v = null;
            }
        }
        return z2;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        j jVar = this.f16926e;
        return jVar != null && jVar.q(lVar, menuItem);
    }

    public boolean f(n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16941u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = xVar.h(nVar);
                if (z2) {
                    break;
                }
            }
        }
        v();
        if (z2) {
            this.f16942v = nVar;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i3) {
        MenuItem findItem;
        ArrayList arrayList = this.f16927f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (nVar.f16951a == i3) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (findItem = nVar.f16964o.findItem(i3)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final n g(int i3, KeyEvent keyEvent) {
        ArrayList arrayList = this.f16940t;
        arrayList.clear();
        h(arrayList, i3, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (n) arrayList.get(0);
        }
        boolean n10 = n();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            char c10 = n10 ? nVar.j : nVar.f16958h;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (n10 && c10 == '\b' && i3 == 67))) {
                return nVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i3) {
        return (MenuItem) this.f16927f.get(i3);
    }

    public final void h(ArrayList arrayList, int i3, KeyEvent keyEvent) {
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i3 == 67) {
            ArrayList arrayList2 = this.f16927f;
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                n nVar = (n) arrayList2.get(i10);
                if (nVar.hasSubMenu()) {
                    nVar.f16964o.h(arrayList, i3, keyEvent);
                }
                char c10 = n10 ? nVar.j : nVar.f16958h;
                if ((modifiers & 69647) == ((n10 ? nVar.f16960k : nVar.f16959i) & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (n10 && c10 == '\b' && i3 == 67)) && nVar.isEnabled()) {
                        arrayList.add(nVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f16944x) {
            return true;
        }
        ArrayList arrayList = this.f16927f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((n) arrayList.get(i3)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l9 = l();
        if (this.f16931k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f16941u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= xVar.d();
                }
            }
            ArrayList arrayList = this.f16930i;
            ArrayList arrayList2 = this.j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = l9.size();
                for (int i3 = 0; i3 < size; i3++) {
                    n nVar = (n) l9.get(i3);
                    if ((nVar.f16973x & 32) == 32) {
                        arrayList.add(nVar);
                    } else {
                        arrayList2.add(nVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f16931k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return g(i3, keyEvent) != null;
    }

    public String j() {
        return StubApp.getString2(21040);
    }

    public l k() {
        return this;
    }

    public final ArrayList l() {
        boolean z2 = this.f16929h;
        ArrayList arrayList = this.f16928g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f16927f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = (n) arrayList2.get(i3);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.f16929h = false;
        this.f16931k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f16943w;
    }

    public boolean n() {
        return this.f16924c;
    }

    public boolean o() {
        return this.f16925d;
    }

    public final void p(boolean z2) {
        if (this.f16936p) {
            this.f16937q = true;
            if (z2) {
                this.f16938r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f16929h = true;
            this.f16931k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16941u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.f();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i10) {
        return q(findItem(i3), null, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i10) {
        n g10 = g(i3, keyEvent);
        boolean q10 = g10 != null ? q(g10, null, i10) : false;
        if ((i10 & 2) != 0) {
            c(true);
        }
        return q10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, m.x r8, int r9) {
        /*
            r6 = this;
            m.n r7 = (m.n) r7
            r0 = 0
            if (r7 == 0) goto Lde
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lde
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f16965p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L4d
        L1a:
            m.l r1 = r7.f16963n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f16957g
            if (r3 == 0) goto L3f
            android.content.Context r1 = r1.f16922a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            r3 = 21041(0x5231, float:2.9485E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r4 = 21042(0x5232, float:2.9486E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            android.util.Log.e(r3, r4, r1)
        L3f:
            m.o r1 = r7.f16948A
            if (r1 == 0) goto L4c
            android.view.ActionProvider r1 = r1.f16977b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L4c
            goto L18
        L4c:
            r1 = r0
        L4d:
            m.o r3 = r7.f16948A
            if (r3 == 0) goto L5b
            android.view.ActionProvider r4 = r3.f16977b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L5b
            r4 = r2
            goto L5c
        L5b:
            r4 = r0
        L5c:
            boolean r5 = r7.e()
            if (r5 == 0) goto L6e
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ldd
            r6.c(r2)
            goto Ldd
        L6e:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L7f
            if (r4 == 0) goto L77
            goto L7f
        L77:
            r7 = r9 & 1
            if (r7 != 0) goto Ldd
            r6.c(r2)
            goto Ldd
        L7f:
            r9 = r9 & 4
            if (r9 != 0) goto L86
            r6.c(r0)
        L86:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L9a
            m.D r9 = new m.D
            android.content.Context r5 = r6.f16922a
            r9.<init>(r5, r6, r7)
            r7.f16964o = r9
            java.lang.CharSequence r5 = r7.f16955e
            r9.setHeaderTitle(r5)
        L9a:
            m.D r7 = r7.f16964o
            if (r4 == 0) goto La5
            m.s r9 = r3.f16978c
            android.view.ActionProvider r9 = r3.f16977b
            r9.onPrepareSubMenu(r7)
        La5:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f16941u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto Lae
            goto Ld7
        Lae:
            if (r8 == 0) goto Lb4
            boolean r0 = r8.i(r7)
        Lb4:
            java.util.Iterator r8 = r9.iterator()
        Lb8:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Ld7
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            m.x r4 = (m.x) r4
            if (r4 != 0) goto Ld0
            r9.remove(r3)
            goto Lb8
        Ld0:
            if (r0 != 0) goto Lb8
            boolean r0 = r4.i(r7)
            goto Lb8
        Ld7:
            r1 = r1 | r0
            if (r1 != 0) goto Ldd
            r6.c(r2)
        Ldd:
            return r1
        Lde:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.l.q(android.view.MenuItem, m.x, int):boolean");
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16941u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
        ArrayList arrayList = this.f16927f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((n) arrayList.get(i11)).f16952b == i3) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int size2 = arrayList.size() - i11;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= size2 || ((n) arrayList.get(i11)).f16952b != i3) {
                    break;
                }
                if (i11 >= 0) {
                    ArrayList arrayList2 = this.f16927f;
                    if (i11 < arrayList2.size()) {
                        arrayList2.remove(i11);
                    }
                }
                i10 = i12;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
        ArrayList arrayList = this.f16927f;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((n) arrayList.get(i10)).f16951a == i3) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            ArrayList arrayList2 = this.f16927f;
            if (i10 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i10);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f16927f.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = getItem(i3);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1257D) item.getSubMenu()).s(bundle);
            }
        }
        int i10 = bundle.getInt(StubApp.getString2(21043));
        if (i10 <= 0 || (findItem = findItem(i10)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z2, boolean z10) {
        ArrayList arrayList = this.f16927f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (nVar.f16952b == i3) {
                nVar.f16973x = (nVar.f16973x & (-5)) | (z10 ? 4 : 0);
                nVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f16943w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z2) {
        ArrayList arrayList = this.f16927f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (nVar.f16952b == i3) {
                nVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z2) {
        ArrayList arrayList = this.f16927f;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (nVar.f16952b == i3) {
                int i11 = nVar.f16973x;
                int i12 = (i11 & (-9)) | (z2 ? 0 : 8);
                nVar.f16973x = i12;
                if (i11 != i12) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f16924c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f16927f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f16927f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = getItem(i3);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(StubApp.getString2(21043), item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1257D) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i3, CharSequence charSequence, int i10, Drawable drawable, View view) {
        if (view != null) {
            this.f16935o = view;
            this.f16933m = null;
            this.f16934n = null;
        } else {
            if (i3 > 0) {
                this.f16933m = this.f16923b.getText(i3);
            } else if (charSequence != null) {
                this.f16933m = charSequence;
            }
            if (i10 > 0) {
                this.f16934n = this.f16922a.getDrawable(i10);
            } else if (drawable != null) {
                this.f16934n = drawable;
            }
            this.f16935o = null;
        }
        p(false);
    }

    public final void v() {
        this.f16936p = false;
        if (this.f16937q) {
            this.f16937q = false;
            p(this.f16938r);
        }
    }

    public final void w() {
        if (this.f16936p) {
            return;
        }
        this.f16936p = true;
        this.f16937q = false;
        this.f16938r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3) {
        return a(0, 0, 0, this.f16923b.getString(i3));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3) {
        return addSubMenu(0, 0, 0, this.f16923b.getString(i3));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i10, int i11, CharSequence charSequence) {
        return a(i3, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i10, int i11, CharSequence charSequence) {
        n a3 = a(i3, i10, i11, charSequence);
        SubMenuC1257D subMenuC1257D = new SubMenuC1257D(this.f16922a, this, a3);
        a3.f16964o = subMenuC1257D;
        subMenuC1257D.setHeaderTitle(a3.f16955e);
        return subMenuC1257D;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i10, int i11, int i12) {
        return a(i3, i10, i11, this.f16923b.getString(i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i10, int i11, int i12) {
        return addSubMenu(i3, i10, i11, this.f16923b.getString(i12));
    }
}
