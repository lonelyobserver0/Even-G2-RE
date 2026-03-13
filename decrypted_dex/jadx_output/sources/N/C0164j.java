package N;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.stub.StubApp;

/* renamed from: N.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0164j {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f4791a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f4792b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f4793c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4794d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f4795e;

    public C0164j(ViewGroup viewGroup) {
        this.f4793c = viewGroup;
    }

    public final boolean a(float f10, float f11, boolean z2) {
        ViewParent e10;
        if (this.f4794d && (e10 = e(0)) != null) {
            try {
                return e10.onNestedFling(this.f4793c, f10, f11, z2);
            } catch (AbstractMethodError e11) {
                Log.e(StubApp.getString2(3646), StubApp.getString2(3644) + e10 + StubApp.getString2(3645), e11);
            }
        }
        return false;
    }

    public final boolean b(float f10, float f11) {
        ViewParent e10;
        if (this.f4794d && (e10 = e(0)) != null) {
            try {
                return e10.onNestedPreFling(this.f4793c, f10, f11);
            } catch (AbstractMethodError e11) {
                Log.e(StubApp.getString2(3646), StubApp.getString2(3644) + e10 + StubApp.getString2(3647), e11);
            }
        }
        return false;
    }

    public final boolean c(int i3, int i10, int[] iArr, int[] iArr2, int i11) {
        ViewParent e10;
        int i12;
        int i13;
        if (!this.f4794d || (e10 = e(i11)) == null) {
            return false;
        }
        if (i3 == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f4793c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.f4795e == null) {
                this.f4795e = new int[2];
            }
            iArr = this.f4795e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e10 instanceof InterfaceC0165k) {
            ((InterfaceC0165k) e10).f(viewGroup, i3, i10, iArr3, i11);
        } else if (i11 == 0) {
            try {
                e10.onNestedPreScroll(viewGroup, i3, i10, iArr3);
            } catch (AbstractMethodError e11) {
                Log.e(StubApp.getString2(3646), StubApp.getString2(3644) + e10 + StubApp.getString2(3648), e11);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i3, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent e10;
        int i14;
        int i15;
        int[] iArr3;
        if (this.f4794d && (e10 = e(i13)) != null) {
            if (i3 != 0 || i10 != 0 || i11 != 0 || i12 != 0) {
                ViewGroup viewGroup = this.f4793c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i14 = iArr[0];
                    i15 = iArr[1];
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                if (iArr2 == null) {
                    if (this.f4795e == null) {
                        this.f4795e = new int[2];
                    }
                    int[] iArr4 = this.f4795e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e10 instanceof InterfaceC0166l) {
                    ((InterfaceC0166l) e10).a(viewGroup, i3, i10, i11, i12, i13, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i11;
                    iArr3[1] = iArr3[1] + i12;
                    if (e10 instanceof InterfaceC0165k) {
                        ((InterfaceC0165k) e10).b(viewGroup, i3, i10, i11, i12, i13);
                    } else if (i13 == 0) {
                        try {
                            e10.onNestedScroll(viewGroup, i3, i10, i11, i12);
                        } catch (AbstractMethodError e11) {
                            Log.e(StubApp.getString2(3646), StubApp.getString2(3644) + e10 + StubApp.getString2(3649), e11);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i14;
                    iArr[1] = iArr[1] - i15;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i3) {
        if (i3 == 0) {
            return this.f4791a;
        }
        if (i3 != 1) {
            return null;
        }
        return this.f4792b;
    }

    public final boolean f(int i3) {
        return e(i3) != null;
    }

    public final boolean g(int i3, int i10) {
        boolean onStartNestedScroll;
        if (!f(i10)) {
            if (this.f4794d) {
                View view = this.f4793c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z2 = parent instanceof InterfaceC0165k;
                    String string2 = StubApp.getString2(3646);
                    String string22 = StubApp.getString2(3644);
                    if (z2) {
                        onStartNestedScroll = ((InterfaceC0165k) parent).c(view2, view, i3, i10);
                    } else {
                        if (i10 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i3);
                            } catch (AbstractMethodError e10) {
                                Log.e(string2, string22 + parent + StubApp.getString2(3650), e10);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i10 == 0) {
                            this.f4791a = parent;
                        } else if (i10 == 1) {
                            this.f4792b = parent;
                        }
                        if (z2) {
                            ((InterfaceC0165k) parent).d(view2, view, i3, i10);
                        } else if (i10 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i3);
                            } catch (AbstractMethodError e11) {
                                Log.e(string2, string22 + parent + StubApp.getString2(3651), e11);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i3) {
        ViewParent e10 = e(i3);
        if (e10 != null) {
            boolean z2 = e10 instanceof InterfaceC0165k;
            ViewGroup viewGroup = this.f4793c;
            if (z2) {
                ((InterfaceC0165k) e10).e(viewGroup, i3);
            } else if (i3 == 0) {
                try {
                    e10.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e11) {
                    Log.e(StubApp.getString2(3646), StubApp.getString2(3644) + e10 + StubApp.getString2(3652), e11);
                }
            }
            if (i3 == 0) {
                this.f4791a = null;
            } else {
                if (i3 != 1) {
                    return;
                }
                this.f4792b = null;
            }
        }
    }
}
