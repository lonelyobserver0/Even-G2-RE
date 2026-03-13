package m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import ba.AbstractC0534b;
import com.stub.StubApp;
import t.C1697j;

/* renamed from: m.A, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class MenuC1254A extends AbstractC0534b implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final l f16840c;

    public MenuC1254A(Context context, l lVar) {
        super(context);
        if (lVar == null) {
            throw new IllegalArgumentException(StubApp.getString2(21034));
        }
        this.f16840c = lVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return h(this.f16840c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i3, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f16840c.addIntentOptions(i3, i10, i11, componentName, intentArr, intent, i12, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = h(menuItemArr2[i13]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f16840c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C1697j c1697j = (C1697j) this.f10728b;
        if (c1697j != null) {
            c1697j.clear();
        }
        this.f16840c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f16840c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i3) {
        return h(this.f16840c.findItem(i3));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i3) {
        return h(this.f16840c.getItem(i3));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f16840c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return this.f16840c.isShortcutKey(i3, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i10) {
        return this.f16840c.performIdentifierAction(i3, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i10) {
        return this.f16840c.performShortcut(i3, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
        if (((C1697j) this.f10728b) != null) {
            int i10 = 0;
            while (true) {
                C1697j c1697j = (C1697j) this.f10728b;
                if (i10 >= c1697j.f21040c) {
                    break;
                }
                if (((H.a) c1697j.f(i10)).getGroupId() == i3) {
                    ((C1697j) this.f10728b).g(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f16840c.removeGroup(i3);
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
        if (((C1697j) this.f10728b) != null) {
            int i10 = 0;
            while (true) {
                C1697j c1697j = (C1697j) this.f10728b;
                if (i10 >= c1697j.f21040c) {
                    break;
                }
                if (((H.a) c1697j.f(i10)).getItemId() == i3) {
                    ((C1697j) this.f10728b).g(i10);
                    break;
                }
                i10++;
            }
        }
        this.f16840c.removeItem(i3);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z2, boolean z10) {
        this.f16840c.setGroupCheckable(i3, z2, z10);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z2) {
        this.f16840c.setGroupEnabled(i3, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z2) {
        this.f16840c.setGroupVisible(i3, z2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f16840c.setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f16840c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3) {
        return this.f16840c.addSubMenu(i3);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3) {
        return h(this.f16840c.add(i3));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i10, int i11, CharSequence charSequence) {
        return this.f16840c.addSubMenu(i3, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i10, int i11, CharSequence charSequence) {
        return h(this.f16840c.a(i3, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i10, int i11, int i12) {
        return this.f16840c.addSubMenu(i3, i10, i11, i12);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i10, int i11, int i12) {
        return h(this.f16840c.add(i3, i10, i11, i12));
    }
}
