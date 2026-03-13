package androidx.recyclerview.widget;

import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0449b {

    /* renamed from: d, reason: collision with root package name */
    public final B f10106d;

    /* renamed from: a, reason: collision with root package name */
    public final M.b f10103a = new M.b(30);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10104b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10105c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final K f10107e = new K(this, 2);

    public C0449b(B b2) {
        this.f10106d = b2;
    }

    public final boolean a(int i3) {
        ArrayList arrayList = this.f10105c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0448a c0448a = (C0448a) arrayList.get(i10);
            int i11 = c0448a.f10100a;
            if (i11 != 8) {
                if (i11 == 1) {
                    int i12 = c0448a.f10101b;
                    int i13 = c0448a.f10102c + i12;
                    while (i12 < i13) {
                        if (e(i12, i10 + 1) == i3) {
                            return true;
                        }
                        i12++;
                    }
                } else {
                    continue;
                }
            } else {
                if (e(c0448a.f10102c, i10 + 1) == i3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f10105c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f10106d.a((C0448a) arrayList.get(i3));
        }
        i(arrayList);
        ArrayList arrayList2 = this.f10104b;
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            C0448a c0448a = (C0448a) arrayList2.get(i10);
            int i11 = c0448a.f10100a;
            B b2 = this.f10106d;
            if (i11 == 1) {
                b2.a(c0448a);
                int i12 = c0448a.f10101b;
                int i13 = c0448a.f10102c;
                RecyclerView recyclerView = b2.f9998a;
                recyclerView.offsetPositionRecordsForInsert(i12, i13);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i11 == 2) {
                b2.a(c0448a);
                int i14 = c0448a.f10101b;
                int i15 = c0448a.f10102c;
                RecyclerView recyclerView2 = b2.f9998a;
                recyclerView2.offsetPositionRecordsForRemove(i14, i15, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.f10110c += i15;
            } else if (i11 == 4) {
                b2.a(c0448a);
                int i16 = c0448a.f10101b;
                int i17 = c0448a.f10102c;
                RecyclerView recyclerView3 = b2.f9998a;
                recyclerView3.viewRangeUpdate(i16, i17, null);
                recyclerView3.mItemsChanged = true;
            } else if (i11 == 8) {
                b2.a(c0448a);
                int i18 = c0448a.f10101b;
                int i19 = c0448a.f10102c;
                RecyclerView recyclerView4 = b2.f9998a;
                recyclerView4.offsetPositionRecordsForMove(i18, i19);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        i(arrayList2);
    }

    public final void c(C0448a c0448a) {
        int i3;
        M.b bVar;
        int i10 = c0448a.f10100a;
        if (i10 == 1 || i10 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int j = j(c0448a.f10101b, i10);
        int i11 = c0448a.f10101b;
        int i12 = c0448a.f10100a;
        if (i12 == 2) {
            i3 = 0;
        } else {
            if (i12 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0448a);
            }
            i3 = 1;
        }
        int i13 = 1;
        int i14 = 1;
        while (true) {
            int i15 = c0448a.f10102c;
            bVar = this.f10103a;
            if (i13 >= i15) {
                break;
            }
            int j3 = j((i3 * i13) + c0448a.f10101b, c0448a.f10100a);
            int i16 = c0448a.f10100a;
            if (i16 == 2 ? j3 != j : !(i16 == 4 && j3 == j + 1)) {
                C0448a g10 = g(i16, j, i14);
                d(g10, i11);
                bVar.b(g10);
                if (c0448a.f10100a == 4) {
                    i11 += i14;
                }
                i14 = 1;
                j = j3;
            } else {
                i14++;
            }
            i13++;
        }
        bVar.b(c0448a);
        if (i14 > 0) {
            C0448a g11 = g(c0448a.f10100a, j, i14);
            d(g11, i11);
            bVar.b(g11);
        }
    }

    public final void d(C0448a c0448a, int i3) {
        B b2 = this.f10106d;
        b2.a(c0448a);
        int i10 = c0448a.f10100a;
        RecyclerView recyclerView = b2.f9998a;
        if (i10 != 2) {
            if (i10 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            recyclerView.viewRangeUpdate(i3, c0448a.f10102c, null);
            recyclerView.mItemsChanged = true;
            return;
        }
        int i11 = c0448a.f10102c;
        recyclerView.offsetPositionRecordsForRemove(i3, i11, true);
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.f10110c += i11;
    }

    public final int e(int i3, int i10) {
        ArrayList arrayList = this.f10105c;
        int size = arrayList.size();
        while (i10 < size) {
            C0448a c0448a = (C0448a) arrayList.get(i10);
            int i11 = c0448a.f10100a;
            if (i11 == 8) {
                int i12 = c0448a.f10101b;
                if (i12 == i3) {
                    i3 = c0448a.f10102c;
                } else {
                    if (i12 < i3) {
                        i3--;
                    }
                    if (c0448a.f10102c <= i3) {
                        i3++;
                    }
                }
            } else {
                int i13 = c0448a.f10101b;
                if (i13 > i3) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = c0448a.f10102c;
                    if (i3 < i13 + i14) {
                        return -1;
                    }
                    i3 -= i14;
                } else if (i11 == 1) {
                    i3 += c0448a.f10102c;
                }
            }
            i10++;
        }
        return i3;
    }

    public final boolean f() {
        return this.f10104b.size() > 0;
    }

    public final C0448a g(int i3, int i10, int i11) {
        C0448a c0448a = (C0448a) this.f10103a.a();
        if (c0448a != null) {
            c0448a.f10100a = i3;
            c0448a.f10101b = i10;
            c0448a.f10102c = i11;
            return c0448a;
        }
        C0448a c0448a2 = new C0448a();
        c0448a2.f10100a = i3;
        c0448a2.f10101b = i10;
        c0448a2.f10102c = i11;
        return c0448a2;
    }

    public final void h(C0448a c0448a) {
        this.f10105c.add(c0448a);
        int i3 = c0448a.f10100a;
        B b2 = this.f10106d;
        if (i3 == 1) {
            int i10 = c0448a.f10101b;
            int i11 = c0448a.f10102c;
            RecyclerView recyclerView = b2.f9998a;
            recyclerView.offsetPositionRecordsForInsert(i10, i11);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i3 == 2) {
            int i12 = c0448a.f10101b;
            int i13 = c0448a.f10102c;
            RecyclerView recyclerView2 = b2.f9998a;
            recyclerView2.offsetPositionRecordsForRemove(i12, i13, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i3 == 4) {
            int i14 = c0448a.f10101b;
            int i15 = c0448a.f10102c;
            RecyclerView recyclerView3 = b2.f9998a;
            recyclerView3.viewRangeUpdate(i14, i15, null);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i3 != 8) {
            throw new IllegalArgumentException("Unknown update op type for " + c0448a);
        }
        int i16 = c0448a.f10101b;
        int i17 = c0448a.f10102c;
        RecyclerView recyclerView4 = b2.f9998a;
        recyclerView4.offsetPositionRecordsForMove(i16, i17);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    public final void i(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0448a c0448a = (C0448a) arrayList.get(i3);
            c0448a.getClass();
            this.f10103a.b(c0448a);
        }
        arrayList.clear();
    }

    public final int j(int i3, int i10) {
        int i11;
        int i12;
        ArrayList arrayList = this.f10105c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0448a c0448a = (C0448a) arrayList.get(size);
            int i13 = c0448a.f10100a;
            if (i13 == 8) {
                int i14 = c0448a.f10101b;
                int i15 = c0448a.f10102c;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i3 < i12 || i3 > i11) {
                    if (i3 < i14) {
                        if (i10 == 1) {
                            c0448a.f10101b = i14 + 1;
                            c0448a.f10102c = i15 + 1;
                        } else if (i10 == 2) {
                            c0448a.f10101b = i14 - 1;
                            c0448a.f10102c = i15 - 1;
                        }
                    }
                } else if (i12 == i14) {
                    if (i10 == 1) {
                        c0448a.f10102c = i15 + 1;
                    } else if (i10 == 2) {
                        c0448a.f10102c = i15 - 1;
                    }
                    i3++;
                } else {
                    if (i10 == 1) {
                        c0448a.f10101b = i14 + 1;
                    } else if (i10 == 2) {
                        c0448a.f10101b = i14 - 1;
                    }
                    i3--;
                }
            } else {
                int i16 = c0448a.f10101b;
                if (i16 <= i3) {
                    if (i13 == 1) {
                        i3 -= c0448a.f10102c;
                    } else if (i13 == 2) {
                        i3 += c0448a.f10102c;
                    }
                } else if (i10 == 1) {
                    c0448a.f10101b = i16 + 1;
                } else if (i10 == 2) {
                    c0448a.f10101b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0448a c0448a2 = (C0448a) arrayList.get(size2);
            int i17 = c0448a2.f10100a;
            M.b bVar = this.f10103a;
            if (i17 == 8) {
                int i18 = c0448a2.f10102c;
                if (i18 == c0448a2.f10101b || i18 < 0) {
                    arrayList.remove(size2);
                    bVar.b(c0448a2);
                }
            } else if (c0448a2.f10102c <= 0) {
                arrayList.remove(size2);
                bVar.b(c0448a2);
            }
        }
        return i3;
    }
}
